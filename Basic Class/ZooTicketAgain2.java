
import java.util.Scanner;

class ZooTicketA {

    boolean ChilorNot ;
    boolean use = false;
    boolean usetrain;
    public ZooTicketA(int type) {
        if(type == 1){
            this.ChilorNot = true ;//ทั่วไป
        } else {
            this.ChilorNot = false ;//เด็ก
        }
        this.usetrain = false ;
    }

    void enterZoo (int height) {
        if (ChilorNot == false) {
            if (use == true) {
                System.out.println(false);
            } else if (height > 120){
                System.out.println(false);
            } else if (use == false && height <= 120) {
                use = true;
                System.out.println(true);
            }
        } else {
            if (use == true) {
                System.out.println(false);
            } else if (use == false) {
                use = true;
                System.out.println(true);
            }
        }
    }
    void useRide () {
        if(this.use==true &&this.usetrain == false){
            System.out.println(true);
            usetrain = true;
        }
        else {
            System.out.println(false);
        }
    }
}

public class ZooTicketAgain2 {

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
            int B = scan.nextInt();
            if(B == 1){
                int height = scan.nextInt();
                tickets[id].enterZoo(height);
            } else if (B== 2) {
                tickets[id].useRide();
            }
        }
    }
}
