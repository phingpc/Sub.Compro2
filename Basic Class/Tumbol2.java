import java.util.Scanner;

class Tumbol {
    public String name;
    public int latitude;
    public int longitude;
    public int people ;
    public int availBudget ;
    public int sum=0;
    int count = 0 ;
    public Tumbol (String name,int latitude,int longitude,int people) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.people = people ;
        this.availBudget = people*5000 ; // ถ้าจะให้คำนวน ควรคำนวนขณะใส่ค่า
        this.sum = 0;
    }
    public void allocateBudget (int C) {
        count++;
        if (C+sum <= availBudget){
            this.sum += C ; 
            System.out.print(count+ " ");  
        }
    }
}
public class Tumbol1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int K = scan.nextInt();
        Tumbol[] arrTum = new Tumbol [K+1];
        for(int i=1; i<=K; i++){
            String name = scan.next();
            int latitude = scan.nextInt();
            int longitude = scan.nextInt();
            int people = scan.nextInt();
            Tumbol Tum = new Tumbol(name, latitude, longitude, people);
            arrTum [i] = Tum ;
        }
        int total = 0;
        int[] budget = new int[K+1];
        for(int i=1; i<=K; i++){
            int B = scan.nextInt() ;
            //int[] budget = new int[B+1];
            int round = 0;
            budget[i] = 0; 
            for (int j=1; j<=B; j++) {
                int C = scan.nextInt();
                arrTum[i].allocateBudget(C);
                if (budget[i]+C <= arrTum[i].availBudget){
                    budget[i]+= C;
                    total+=C;
                } else {
                    round++;
                }
            }
            if(round == B){
                System.out.println("none");
            } else {
                System.out.println("");
            }
        }
        System.out.println(total);
    }
}
 //Mueng 5 7 20 9 10000 20000 40000 50000 10000 30000 10000 15000 20000