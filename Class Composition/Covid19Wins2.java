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
        System.out.println(Numlocation); //
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
class Person{
    String[] name ;
    int[] Numforname;
    Visitation[] tation ;
    public Person (String[] name,int[] Numforname){
        this.name = name;
        this.Numforname = Numforname;
    }
    void addVisitation (Visitation[] tation) {
        this.tation = tation;
    }
    void  printAllVisitations(){
        for(int p=0; p< 5; p++){
            if(tation[p] != null && tation[p].count()>0){
                tation[p].printVisitHours();
            }
        }
    }
}
public class Covid19Wins2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        String[] name = new String[K+1];
        int [] Numlocat = new int[K+1];// ขอติดไว้ก่อน
        for(int p=0; p<K; p++){
            Numlocat[p] = scan.nextInt();// ขอติดไว้ก่อน
            name[p]= scan.next();
        }
        Person per = new Person(name,Numlocat);
        String MYDATA = scan.next();
        int L = scan.nextInt();
        Visitation[] tion = new Visitation[L+1];
        for(int p=0; p<K; p++){
            int id = scan.nextInt();
            int date = scan.nextInt();
            tion[p] = new Visitation(id, date);
            int j = scan.nextInt();
            for(int O=0; O<j; O++){
                int A = scan.nextInt();
                tion[p].visit(A);
            }
            if(tion[p].count() > 0){
                tion[p].count() ;
            } else {
                tion[p] = null ;
            }
        }
        per.addVisitation(tion);
        per.printAllVisitations();
    }
}
