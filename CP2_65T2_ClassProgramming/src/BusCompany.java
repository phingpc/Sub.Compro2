import java.util.Scanner;
/*class Bus {

    public String id;
    public int type;
    public int seats;
    public int curSeats=0;
    public boolean state;

    public Bus(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
        this.curSeats = 0;
    }

    public void printStats() {
        System.out.println(this.id);
        if (type == 1) {
            System.out.println("Fan");
        } else if (type == 2) {
            System.out.println("P1");
        } else {
            System.out.println("VIP");
        }
        System.out.printf("%d %d\n",curSeats,this.seats);
        System.out.printf("Active");
    }
}*/
public class BusCompany {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);
        b.printStats();
    }
}
