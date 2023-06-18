import java.util.Scanner;
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
    boolean basicCheck (String name, String id, int price, int derivery, int storageuse) {
        if(name.length()<3 || name == null || price <= 0 || derivery <= 0 || storageuse<0){
            return false;
        } else {
            return true;
        }
    }
    boolean cutStock (int n){
        if(n>storage){
            return false;
        } else {
            storage -=n;
            return true;
        }
    }
    void printInfo() {
        System.out.println(name+" "+id+" "+price);
        System.out.println(derivery+" "+storageuse+" "+storage+" "+basicCheck(name, id, price, derivery, storageuse));
    }
}

public class ItemAndCart1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String id = scan.next();
        int price = scan.nextInt();
        int shipping = scan.nextInt();
        int volume = scan.nextInt();
        int quan = scan.nextInt();
        Item item = new Item(name, id, price,shipping, volume, quan);
        item.printInfo();

        int n = scan.nextInt();
        for (int i = 0; i < n; ++i) {
            int q = scan.nextInt();
            System.out.println(item.cutStock(q));
            item.printInfo();
        }
    }
}
