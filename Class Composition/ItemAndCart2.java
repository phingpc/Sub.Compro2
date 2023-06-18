import java.util.Scanner;
class Cart {

    int cart; // ความจุมากสุดของรถเข็น
    Item item;
    int count = 0; //ใช้เป็นตัววัดจำนวนว่ามีอยู่ในรถเข็นเท่าไหร่แล้ว
    /* ตัวแปลที่ใช้นับปริมาณทั้งหมด */
    int allprice = 0;
    int allderivery = 0 ;
    int alluse = 0 ;
    public Cart(int cart,Item item){
        this.cart = cart;
        this.item = item;
    }
    void printStats() {
        int allshopping = allprice + allderivery;
        System.out.print(count+" "+allprice+" "+allderivery+" "+allshopping+" ") ;
        if(alluse == 0){
            System.out.println("0");
        } else if (alluse<=cart){
            System.out.println("1");
        } else {
            System.out.println("2+");
        }
    }
    boolean adjustQuan (int A) {
        if(A > 0){ // เป็นบวก
            /* ของในสต๊อคเมื่อลบแล้วหมดพอดีหรือยังเหลืออยู่ไหม and ลบแล้วหมดหรือติดลบไหม */
            if(0 <= item.storage-A && item.cutStock(A) == true){
                count+=A;
                allprice += item.price*A;
                allderivery += item.derivery*A;
                alluse += item.storageuse*A;
                return true;
            } else { // ถ้าสล็อคติดลบคือ false ทันทีเพราะติดลบไม่ได้ 
                return false; 
            }
        } else { // เป็นลบ
            if(A+count < 0){ //ถ้าลบแล้วน้อยกว่า0เท่ากับลบไม่ได้
                return false;
            } else {
                /* หลักการทางคณิตคือ + เจอ - ได้ - เนื่องจากA ในเงื่อนไข
                 * นี้คือลบ จึงใช้ + เพื่อให้มันตัดออก
                 */
                alluse += item.storageuse*A;
                allprice += item.price*A;
                allderivery += item.derivery*A;
                count +=A;
                item.storage -=A;
                return true;
            }
        }
    }
}

class Item {

    String name;
    String id;
    int price;
    int derivery;
    int storageuse;
    int storage;

    public Item(String name, String id, int price, int derivery, int storageuse, int storage) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.derivery = derivery;
        this.storage = storage;
        this.storageuse = storageuse;
    }

    boolean basicCheck(String name, String id, int price, int derivery, int storageuse) {
        /* เช็คเงื่อนไขปกติตามโจทย์ */
        if (name.length() < 3 || name == null || price <= 0 || derivery < 0 || storageuse < 0) {
            return false;
        } else {
            return true;
        }
    }
    /* เช็คเงื่อนไขปกติตามโจทย์ */
    boolean cutStock(int n) {
        if (n <= storage && n>=0) {
            storage -= n; 
            return true;
        } else {
            return false;
        }
    }

    void printInfo() {
        System.out.println(name + " " + id + " " + price);
        System.out.println(derivery + " " + storageuse + " " + storage + " " + basicCheck(name, id, price, derivery, storageuse));
    }
}

public class ItemAndCart2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String id = scan.next();
        int price = scan.nextInt();
        int shipping = scan.nextInt();
        int volume = scan.nextInt();
        int quan = scan.nextInt();
        Item item = new Item(name, id, price, shipping,
                volume, quan);
        int capacity = scan.nextInt();
        Cart cart = new Cart(capacity, item);

        int n = scan.nextInt();
        for (int i = 0; i < n; ++i) {
            int q = scan.nextInt();
            System.out.println(cart.adjustQuan(q));
            cart.printStats();
        }
    }
}
