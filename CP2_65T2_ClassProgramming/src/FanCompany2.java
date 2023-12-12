
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
class Motor {
    double V ;
    double I ;
    double eff ;
    //double HP ;
    Motor (double V,double I,double eff) {
        this.V= V;
        this.I = I;
        this.eff = eff/100;
    }
    Motor(double I,double eff){
        this.V=220;
        this.I = I;
        this.eff = eff/100;
    }
    double horsepower (){
        //HP = (V * I * eff) / 746;
        return (V * I * eff) / 746 ;
    }
    void printInfo(){
        double hp = this.horsepower();
        System.out.print(V+" "+I+" "+eff+" "+String.format("%.2f", hp));
    }
}
public class FanCompany2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        double v = sc.nextDouble();     
        double i = sc.nextDouble();     
        double eff = sc.nextDouble(); 
        Motor motor = null;
        if (v==220) {
            motor = new Motor(i,eff);     
        }else{       
            motor = new Motor(v,i,eff);
        } 
        //motor.horsepower();
        motor.printInfo();
    }
}
