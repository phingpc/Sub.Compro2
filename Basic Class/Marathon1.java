import java.util.Scanner;

class Runner {
    String name ;
    String Bib ;
    public Runner (String name,String Bib) {
        this.name = name;
        this.Bib = Bib ;
    }
    public void PrintRun (String sn,int sum) {
        if(sum == 49 ) {
            System.out.printf("A");
            System.out.printf(sn);
            System.out.printf(" %s",name);
        } else if(sum == 50){
            System.out.printf("B");
            System.out.printf(sn);
            System.out.printf(" %s",name);
        } else if (sum == 51){
            System.out.printf("C");
            System.out.printf(sn);
            System.out.printf(" %s",name);
        } else if (sum == 52){
            System.out.printf("D");
            System.out.printf(sn);
            System.out.printf(" %s",name);
        } else {
            System.out.printf("INVALID");
        }
        System.out.println("");
    }
}
public class Marathon1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        Runner[] Run = new Runner[A+1] ;
        int count =0;
        for (int i = 1; i <= A; i++) {
            String name = scan.next();
            String Bib = scan.next();
            //int str = (int)Bib.charAt(0); เทียบเลข
            Runner RunInput = new Runner(name,Bib);
            Run[i] = RunInput ;
        }
        for(int j=1; j<=A; j++){
            int sum=0 ;
            int leng = Run[j].Bib.length();
            if(leng > 1 ){
                for (int i = 0; i < leng; i++) {
                    int str = (int) Run[j].Bib.charAt(i);
                    sum += str;
                }
            } else {
                int str = (int) Run[j].Bib.charAt(0);
                sum += str;
            } 
            if( sum <= 52 && sum >=49){
                count++;
            }
            String sn = String.format ("%03d",count) ;
            Run[j].PrintRun(sn,sum);
        }
    }
}
