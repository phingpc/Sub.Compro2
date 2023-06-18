
import java.util.Scanner;

class Runner {

    String name;
    String Bib;

    public Runner(String name, String Bib) {
        this.name = name;
        this.Bib = Bib;
    }

    public void PrintRun(String sn, int sum) {
        if (sum == 49) {
            System.out.printf("A");
            System.out.printf(sn);
            System.out.printf (" ");
        } else if (sum == 50) {
            System.out.printf("B");
            System.out.printf(sn);
            System.out.printf (" ");
        } else if (sum == 51) {
            System.out.printf("C");
            System.out.printf(sn);
            System.out.printf (" ");
        } else if (sum == 52) {
            System.out.printf("D");
            System.out.printf(sn);
            System.out.printf (" ");
        }
    }
}

public class Marathon2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        Runner[] Run = new Runner[A + 1];
        int count = 0;
        // ตัวแปลเก็บการวิ่งแต่ละประเภท
        int Fun_Run = 0;
        int Mini_marathon = 0;
        int Half_marathon = 0;
        int Marathon = 0;
        // ตัวแปลเก็บการวิ่งแต่ละประเภท
        for (int i = 1; i <= A; i++) {
            String name = scan.next();
            String Bib = scan.next();
            //int str = (int)Bib.charAt(0); เทียบเลข
            Runner RunInput = new Runner(name, Bib);
            Run[i] = RunInput;
            if ((int) Bib.charAt(0) == 49) {
                int leng = Bib.length();
                if(leng == 1 ){
                    Fun_Run++;
                }
            } else if ((int) Bib.charAt(0) == 50) {
                int leng = Bib.length();
                if(leng == 1 ){
                    Mini_marathon++;
                }
            } else if ((int) Bib.charAt(0) == 51) {
                int leng = Bib.length();
                if(leng == 1 ){
                    Half_marathon++;
                }
            } else if ((int) Bib.charAt(0) == 52) {
                int leng = Bib.length();
                if(leng == 1 ){
                    Marathon++;
                }
            }
        }
        ////////////////////////////////////////////////
        if (Fun_Run > 0) {
            count = 0;
            System.out.println(Fun_Run);
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
            if( sum == 49){
                count++;
                String sn = String.format ("%03d",count) ;
                Run[j].PrintRun(sn,sum);
            }else if (sum > 49 && sum <= 52 && sum != 49) {
                    count++;
            
            } else if ( sum < 49 && sum > 52) {
                count--;
            }
        }
        System.out.println("");
        } else {
            System.out.println("0");
            System.out.println("-");
        }
        if (Mini_marathon > 0) {
            count = 0;
            System.out.println(Mini_marathon);
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
                if( sum == 50){
                    count++;
                    String sn = String.format ("%03d",count) ;
                    Run[j].PrintRun(sn,sum);
                } else if ( sum < 49 && sum > 52) {
                    count--;
                } else if (sum >= 49 && sum <= 52 && sum != 50) {
                    count++;
                }
            }
            System.out.println("");
        } else {
            System.out.println("0");
            System.out.println("-");
        }
        if (Half_marathon > 0) {
            count = 0;
            System.out.println(Half_marathon);
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
                if( sum == 51){
                    count++;
                    String sn = String.format ("%03d",count) ;
                    Run[j].PrintRun(sn,sum);
                } else if ( sum < 49 && sum > 52) {
                    count--;
                } else if (sum >= 49 && sum <= 52 && sum != 51) {
                    count++;
                }
            }
            System.out.println("");
        } else {
            System.out.println("0");
            System.out.println("-");
        }
        if (Marathon > 0) {
            count = 0;
            System.out.println(Marathon);
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
                if( sum == 52){
                    count++;
                    String sn = String.format ("%03d",count) ;
                    Run[j].PrintRun(sn,sum);
                } else if ( sum < 49 && sum > 52) {
                    count --;
                } else if (sum >= 49 && sum < 52 && sum != 52) {
                    count++;
                }
            }
            System.out.println("");
        } else {
            System.out.println("0");
            System.out.println("-");
        }
    }
}
