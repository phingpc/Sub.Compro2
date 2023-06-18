import java.util.Scanner;

class Precinct {
    String unit ;
    String[] nameUnit ;
    int[] score ;
    int NumUnit ;
    int Max = 0;
    public Precinct (String unit,String[] nameUnit,int A,int[] score) {
        this.unit = unit ;
        this.nameUnit = nameUnit;
        this.NumUnit = A ;
        this.score = score;
    }
    void count (int Numb) {
        int count=0;
        for(int p=1; p<=NumUnit; p++){
            if(Numb == p){
                score [Numb]++;
                System.out.println(nameUnit[p]+" "+score[p]);
                if(score [Numb] > Max){
                    Max = score [Numb];
                }
            } else {
                count++;
            }
        }
        if(count == NumUnit){
            System.out.println("invalid number");
        }
    }
    void printInfo () {
        for(int p=1; p<=NumUnit; p++){
            System.out.println(p+" "+nameUnit[p]+" "+score[p]);
        }
    }
    void printMax () {
        for(int p=1; p<=NumUnit; p++){
            if(score[p]== Max){
                System.out.println(p+" "+nameUnit[p]+" "+score[p]);
            }
        }
    }
}
public class KorKorTor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String unit = scan.nextLine();
        int A = scan.nextInt();
        String[] name = new String[A+1] ;
        int[] score = new int[A+1]; 
        for (int i = 1; i <= A; i++) {
            name[i] = scan.next();
            score [i] = 0;
        }
        Precinct cinct = new Precinct(unit, name,A,score);
        int N = scan.nextInt();
        for(int j=0; j<N; j++){
            int Z = scan.nextInt();
            if(Z==1){
                int X = scan.nextInt();
                cinct.count(X);
            } else if (Z==2){
                cinct.printInfo();
            } else if (Z==3){
              cinct.printMax();
            }
        }
    }
}
