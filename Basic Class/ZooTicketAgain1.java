
import java.util.Scanner;

class ZooTicketA {

    boolean ChilorNot ;
    boolean use = false;

    public ZooTicketA(int type) {
        if(type == 1){
            this.ChilorNot = true ;//ทั่วไป
        } else {
            this.ChilorNot = false ;//เด็ก
        }
    }

    void enterZoo (int height) {
        if (ChilorNot == false) {
            if (use == true || height > 120) {
                System.out.println(false);
                //return false;
            } else if (use == false && height <= 120) {
                use = true;
                System.out.println(true);
                //return true;
            }
        } else {
            if (use == true) {
                System.out.println(false);
                //return false;
            } else if (use == false) {
                use = true;
                System.out.println(true);
                //return true;
            }
        }
    }
}

public class ZooTicketAgain1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        ZooTicketA[] tickets = new ZooTicketA[N + 1];
        for (int i = 1; i <= N; ++i) {
            int type = scan.nextInt();
            tickets[i] = new ZooTicketA(type) ;
        }
        final int Q = scan.nextInt();
        for (int i = 1; i <= Q; ++i) {
            int id = scan.nextInt();
            int height = scan.nextInt();
            tickets[id].enterZoo(height);
        }
    }
}
