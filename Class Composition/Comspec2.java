import java.util.Scanner;
class CPU {
    public String a ;
    public int b ;
    public int c ;
    public int d ;
    public CPU (String a,int b,int c,int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    boolean isValidSpec () {
        /*เช็คข้อมูลว่ามีอันไหนไม่เข้าเงื่อนไขไหม*/
        if(a == null || a.length() == 0 ||b<=0 || c<=0 || d<=0 || d>10) {
            return false;
        } else {
            return true;
        }
    }
    void printInfo () {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(isValidSpec());
    }
}
class MainBoard {
    String a;
    int c ;
    int d ;
    public MainBoard (String a,int c,int d){
        this.a = a;
        this.c = c;
        this.d = d;
    }
    boolean isValidSpec () {
        /*เช็คข้อมูลว่ามีอันไหนไม่เข้าเงื่อนไขไหม*/
        if(a == null || a.length() == 0 || c<=0 || d<=0 || d>10) {
            return false;
        } else {
            return true;
        }
    }
    void printInfo () {
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(isValidSpec());
    }
}
class Computer {
    CPU cpu;
    MainBoard mainboard;
    public Computer (CPU cpu,MainBoard mainboard) {
        /* นำข้อมูลจากclass cpu , mainboard มาใส่ใน class Computer */
        this.cpu = cpu;
        this.mainboard = mainboard;
    }
    boolean isValidSpec () {
        /*ข้อมูลผิดพลาดอย่างใดอย่างหนึ่ง */
        if(!cpu.isValidSpec() || !mainboard.isValidSpec()) {
            return false;
        } else {
            return true;
        }
    }
    void printInfo (){
        /*เงื่อนไขที่โจทย์ต้องการ กรณีที่ข้อมูลผิดพลาด*/
        if(isValidSpec() == false){
            System.out.println("Invalid Spec");
            /* ดึงmethod มาใช้จากclass cpu และ mainboard เลย */
            cpu.printInfo();
            mainboard.printInfo();
        } else {
            /*เงื่อนไขที่โจทย์ต้องการ กรณีข้อมูลถูกต้อง แต่ไม่รู้ว่ามันเข้ากันได้ไหม*/
            if(cpu.c == mainboard.c && cpu.d == mainboard.d){
                System.out.println(cpu.a);
                System.out.println(cpu.b);
                System.out.println(mainboard.a);
                System.out.println(mainboard.c);
                System.out.println(mainboard.d);
            } else {
                System.out.println("Invalid Spec");
                /* ดึงmethod มาใช้จากclass cpu และ mainboard เลย */
                cpu.printInfo();
                mainboard.printInfo();
            }
        }
    }
}
public class Comspec2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();
        if( model.length() == 0 && socket % 2 == 0) {
            model = null ;
        }
        CPU cpu = new CPU(model,clocks,socket,memType); //ข้อมูลของclass cpu
        scan.nextLine();
        model = scan.nextLine();
        socket = scan.nextInt();
        memType = scan.nextInt();
        if( model.length() == 0 && socket % 2 == 0) {
            model = null ;
        }
        MainBoard mb = new MainBoard(model,socket,memType); //ข้อมูลของclass MainBoard
        Computer com = new Computer(cpu,mb); // ใส่ข้อมูลของ class cpu และ MainBoard ลงไปใน class Computer
        com.printInfo();
    }
}
/*i7 920
 * 2667
 * 1600
 * 3
 * Asus Extreme
 * 1600 
 * 3
 * 
 */