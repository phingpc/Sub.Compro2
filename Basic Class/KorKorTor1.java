
import java.util.Scanner;

class Party {

    public String name;
    public int Numb;
    public String[] Firstname;
    public String[] Lastname;
    public int[] area ;
    public Party(String name,int Num) {
        this.name = name;
        this.Numb = Num;
    }
    public Party(String[] Firstname,String[] Lastname,int[] area,String name,int Num) {
        this.Firstname = Firstname ;
        this.Lastname = Lastname;
        this.area = area ;
        this.name = name;
        this.Numb = Num;
    }

    void printInfo (int regionNumber) {
        int count = 0;
        if( regionNumber == 0 ){
            for(int p=1; p<=Numb; p++){
                System.out.println(Firstname[p]+" "+Lastname[p]+" "+area[p]) ;
            }
        } else if (regionNumber < 0) {
            System.out.println("invalid region number") ;
        } else {
                for(int p=1; p<=Numb; p++){
                if ( regionNumber == area[p] ) {
                    System.out.println(Firstname[p]+" "+Lastname[p]+" ") ;
                } else {
                    count ++;
                }
                }
                if(count == Numb){
                    System.out.println("none");
                }
        }
    }
}

public class KorKorTor1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        Party[] party = new Party[A+1] ;
        for(int p=1; p<=A; p++){
            String name = scan.next();
            int Num = scan.nextInt();
            party[p] = new Party (name, Num) ;
        }
        for(int p=1; p<=A; p++){
            String[] Fisrtname = new String[party[p].Numb+1] ;
            String[] Lastname = new String[party[p].Numb+1] ;
            int[] area = new int[party[p].Numb+1] ;
            for(int L=1; L<=party[p].Numb; L++){
                Fisrtname[L] = scan.next() ;
                Lastname[L] = scan.next() ;
                area[L] = scan.nextInt() ;
            }
            party[p] = new Party(Fisrtname,Lastname,area,party[p].name,party[p].Numb);
        }
        final int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            int partyNumber = scan.nextInt();
            int regionNumber = scan.nextInt();
            party[partyNumber].printInfo(regionNumber);
        }
    }
}
