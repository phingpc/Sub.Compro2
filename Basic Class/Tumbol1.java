import java.util.Scanner;

class Tumbol {
    public String name;
    public int latitude;
    public int longitude;
    public int people ;
    public int availBudget /* = people*5000*/;// ถ้าจะให้คำนวน ควรคำนวนขณะใส่ค่า
    public int sum=0;
    int count = 0 ;
    public Tumbol (String name,int latitude,int longitude,int people) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.people = people ;
        this.availBudget = people*5000 ; // ถ้าจะให้คำนวน ควรคำนวนขณะใส่ค่า
    }
    public void allocateBudget (int B) {
        count++;
        if (B+sum <= availBudget){
            sum+=B; 
            System.out.printf("%d ",count);  
        }
    }
}
public class Tumbol1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String name = scan.nextLine();
        int latitude = scan.nextInt();
        int longitude = scan.nextInt();
        int people = scan.nextInt();
        Tumbol Tum = new Tumbol(name, latitude, longitude, people);
        int A = scan.nextInt();
        Tumbol[] arrTum = new Tumbol [A+1];// ใช้ทำไม???
        for(int i=0; i<A; i++){
            int B = scan.nextInt() ;
            Tum.allocateBudget(B);
        }
    }
}
 //Mueng 5 7 20 9 10000 20000 40000 50000 10000 30000 10000 15000 20000