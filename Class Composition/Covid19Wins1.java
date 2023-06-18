import java.util.Scanner;

class Visitation {
    int Numlocation ; 
    int Date ;
    int[] Time = new int[24]; // ช่องเวลาต่างๆที่เก็บการเข้าใช้เอาไว้
    public Visitation(int Numlocation,int Date){
        this.Numlocation = Numlocation;
        this.Date = Date;
    }
    void visit (int Timeuse) {
        if(Timeuse > 23 || Timeuse <0){
            System.out.println("invalid hour: "+Timeuse);
        } else { // เข้าเงื่อนไขก็เก็บข้อมูล
            Time[Timeuse] +=1 ; // ข้อมูลการเข้าใจนี้มากกว่า 1 ครั้งได้นะ
        }
    }
    int count (){
        /* เครื่องมือที่ใช้เช็คว่า คุณใช้เวลาในช่วงไหนเท่าไหร่ เช่น 
         * ถ้า 8 โมง เข้าไป 2 ครั้ง ก็จะเก็บ 2 ครั้งนั้นเพิ่มเข้าไป
         * ใน check
         */
        int check=0;
        for(int p=0; p<24; p++){
            if(Time[p]>0){
                check += Time[p]; 
            }
        }
        return check;
    }
    void printVisitHours(){
        System.out.println(Numlocation);
        System.out.println(Date);
        System.out.println(count());
        for(int p=0; p<24; p++){
            /* ปลิ้นเวลาออกมาโดยเรียงจากน้อยไปมาก
             * โดยอิงจากตัวแปลที่เก็บเวลาการเข้าใช้เอาไว้แล้ว
             */
            if(Time[p]>0){
                System.out.print(p+" ");
            }
        }
        if(count() == 0){
            System.out.println("no visit");
        }
    }
}
public class Covid19Wins1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int id = scan.nextInt();
        int date = scan.nextInt();
        Visitation vis = new Visitation(id, date);
        final int K = scan.nextInt();
        for(int p=0; p<K; p++){
            int j = scan.nextInt();
            vis.visit(j);       
        }
        vis.count();
        vis.printVisitHours();
    }
}
/*5
7
8
10 5 9 24 23 -2 0 -1 

5
7
8
-1 -5 28 24 250 -2 27 -1
*/
