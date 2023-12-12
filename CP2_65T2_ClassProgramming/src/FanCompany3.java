
import java.util.Scanner;

class Blade {

    int size;
    int number;
    int angle;
    double horsepower;
    boolean valid = true;

    Blade(int size, int number, int angle, double hp) {
        this.size = size;
        this.number = number;
        this.angle = angle;
        this.horsepower = hp;
    }

    void printInfo() {
        if (size < 16 || size > 24 || size % 2 != 0) {
            this.valid = false;
            System.out.println("invalid size");
        }
        if (number < 3 || number > 5) {
            this.valid = false;
            System.out.println("invalid number of blades");
        }
        if (angle != 27 && angle != 30 && angle != 33) {
            this.valid = false;
            System.out.println("invalid angle");
        }
        if (horsepower <= 0) {
            this.valid = false;
            System.out.println("invalid horsepower");
        }
        System.out.print(size + " " + number + " " + angle + " " + horsepower);
        if (this.valid == true) {
            System.out.print(" true");
        } else {
            System.out.print(" false");
        }
    }
}

class Motor {

    double V;
    double I;
    double eff;

    //double HP ;
    Motor(double V, double I, double eff) {
        this.V = V;
        this.I = I;
        this.eff = eff / 100;
    }

    Motor(double I, double eff) {
        this.V = 220;
        this.I = I;
        this.eff = eff / 100;
    }

    double horsepower() {
        //HP = (V * I * eff) / 746;
        return (V * I * eff) / 746;
    }

    void printInfo() {
        double hp = this.horsepower();
        System.out.print(V + " " + I + " " + eff + " " + String.format("%.2f", hp));
    }
}

class ElectricFan {

    int productID = 0;
    Blade blade;
    Motor motor;
    boolean status;

    public ElectricFan(Blade blade, Motor motor) {
        this.motor = motor;
        this.blade = blade;

    }

    boolean changeBlade(Blade blade) {
        if (motor.horsepower() >= blade.horsepower) {
            return true;
        } else {
            return false;
        }
    }

    boolean changeMotor(Motor motor) {
        if (motor.horsepower() >= blade.horsepower) {
            return true;
        } else {
            return false;
        }
    }

    void printInfo(int count) {
        System.out.print(count+" " + blade.size + " " + blade.horsepower + " " + motor.I + " " + String.format("%.2f", motor.horsepower()));
        if (this.changeBlade(blade) == false) {
            System.out.println(" false");
        } else if (this.changeMotor(motor) == false) {
            System.out.println(" false");
        } else if (this.changeMotor(motor) == true && this.changeBlade(blade) == true) {
            System.out.println(" true");
        }
    }
}

public class FanCompany3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size, numb, angle;
        double hp, v, i, eff;
        Blade ablade = null;
        Motor motor = null;
        ElectricFan eFan = null;
        ///////
        int count = 0;
        ///////
        for (int index = 0; index < n; index++) {
            int cmd = sc.nextInt();
            if (cmd == 0) {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v, i, eff);
                eFan = new ElectricFan(ablade, motor);
                if (cmd == eFan.productID) {
                    count++;
                } else {
                    eFan.productID = cmd;
                    count = 1;
                }
                System.out.print(count);
            } else if (cmd == 1) {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                ///////////////////////
                /*v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v, i, eff);
                */eFan = new ElectricFan(ablade, motor);
                /////////////////////
                eFan.changeBlade(ablade);
                if (cmd == eFan.productID) {
                    count++;
                } else {
                    eFan.productID = cmd;
                    count = 1;
                }
                System.out.print(count);
            } else if (cmd == 2) {
                /////////////////////
                /*size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size, numb, angle, hp);*/
                /////////////////////
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v, i, eff);
                eFan.changeMotor(motor);
                eFan = new ElectricFan(ablade, motor);
                if (cmd == eFan.productID) {
                    count++;
                } else {
                    eFan.productID = cmd;
                    count = 1;
                }
                System.out.print(count);
            }
            eFan.printInfo(count);
        }
    }
}
