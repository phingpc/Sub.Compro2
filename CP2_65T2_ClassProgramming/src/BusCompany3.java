
import java.util.Scanner;

class Bus {

    public String id;
    public int type;
    public int seats;
    public int curSeats = 0;
    public boolean state = true;

    public Bus(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
        this.curSeats = 0;
    }

    public void printStats() {
        if (state == true) {
            System.out.println(this.id);
        } else {
            System.out.println("sorry");
        }
    }

    public boolean reserve(int K) {
            if (K + curSeats <= seats && K > 0 && state == true) {
                curSeats += K;
                return true;
            } else {
                return false; 
            }
    }

    public void sendToRepair() {
        this.state = false;
    }

    public void backToService() {
        this.state = true;
    }
}

public class BusCompany3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // รถบัส
        int busA = scan.nextInt();
        Bus[] b = new Bus[busA + 1];
        for (int i = 1; i <= busA; i++) {
            String id = scan.next();
            int type = scan.nextInt();
            int seats = scan.nextInt();
            Bus busG = new Bus(id, type, seats);
            b[i] = busG;
        }
        // รถบัส
        //คำสั่ง
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            int T = scan.nextInt();
            if (P == 1) {
                boolean success = false;
                for(int j=1; j<=busA; j++){
                    if(b[j].type == T){
                        if(b[j].reserve(K)){
                            System.out.println(b[j].id);
                            success = true;
                            break;
                        }
                    }
                }
                if(success == false) {System.out.println("sorry");}
            } else if (P == 2) {
                b[T].sendToRepair();
            } else if (P == 3) {
                b[T].backToService();
            }
        }
    }
}
