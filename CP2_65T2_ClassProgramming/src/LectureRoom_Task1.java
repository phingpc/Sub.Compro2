
import java.util.Scanner;

class LectRoom {
    public int classCode;
    public String name ;
    public int capacity ;
    public int currentSeats ;
    
    public LectRoom(int classCode,String name, int capacity){
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
        this.currentSeats = 0;
    }
    public boolean reserveSeats(int seat){
        if(seat+currentSeats <= capacity){
            currentSeats += seat;
            return true;
        } else {
            return false;
        }
    }
}

public class LectureRoom_Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        LectRoom[] l = new LectRoom[K+1];
        for(int i=1; i<=K; i++){
            int code = scan.nextInt();
            String name = scan.next();
            int size = scan.nextInt();
            LectRoom room = new LectRoom(code,name,size);
            l[i] = room ;
        }
        /*int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println(l[x].classCode+" "+l[x].name+" "+l[x].capacity);
        System.out.println(l[y].classCode+" "+l[y].name+" "+l[y].capacity);
        System.out.println(l[z].classCode+" "+l[z].name+" "+l[z].capacity);*/
        int a = scan.nextInt();
        for(int i=1; i<=a; i++){
            int round=0;
            int b = scan.nextInt();
            int c = scan.nextInt();
            for(int j=1; j<=K; j++){
                if(b == l[j].classCode){
                    round++;
                    //System.out.println(l[j].name);
                    //l[j].reserveSeats(c);
                    if(l[j].reserveSeats(c)==true){
                        System.out.println(l[j].name);
                        break;
                    }
                    else {
                        round=0;
                        //continue;
                    }
                }
            }
            if(round==0){
                System.out.printf("sorry\n");
            }
        }
    }
}
