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
public class ComSpec1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();
        if( model.length() == 0 && socket % 2 == 0) {
            model = null ;
        }
        CPU cpu = new CPU(model,clocks,socket,memType);
        cpu.printInfo();
    }
}
