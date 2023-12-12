
/*import java.util.Scanner;

class Blade {
    int size ;
    int number ;
    int angle ;
    double horsepower ;
    boolean valid = true;
    Blade (int size,int number,int angle,double hp ){
        this.size = size;
        this. number = number ;
        this. angle = angle ;
        this. horsepower = hp ;
    }
    void printInfo () {
        if(size < 16 || size >24 || size%2!=0){
            this.valid = false;
            System.out.println("invalid size");
        }
        if(number <3 || number>5){
            this.valid = false;
            System.out.println("invalid number of blades");
        }
        if(angle != 27 && angle !=30 && angle !=33){
            this.valid = false;
            System.out.println("invalid angle");
        } if(horsepower <= 0){
            this.valid = false;
            System.out.println("invalid horsepower");
        }
        System.out.print(size + " " +number+" "+angle+" "+horsepower);
        if(this.valid == true){
            System.out.print(" true");
        } else {
            System.out.print(" false");
        }
    }
}
public class FanCompany1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(); 
        int numb = scan.nextInt(); 
        int angle = scan.nextInt(); 
        double hp = scan.nextDouble();
        Blade Ablade = new Blade(size,numb,angle,hp);
        Ablade.printInfo();
    }
}
