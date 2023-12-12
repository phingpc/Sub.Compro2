
import java.util.Scanner;

class Account {
    String name ;
    String code ;
    double balance ;
    boolean active = true;
    Account (String name,String code,double balance) {
        System.out.println("Open account");
        this.name = name ;
        this.code = code ;
        this.balance = balance ;
    }
    void printInfo () {
        System.out.print(name+", "+code+", "+balance);
        if(active == true){
            System.out.print(", active");
        } else {
            System.out.print(", inactive");
        }
        System.out.println("");
    }
    void checkBalance () {
        System.out.println(balance);
    }
    void closeAccount() {
        active = false;
    }
    void deposit(double n){
        if(active = true){
            balance += n;
            System.out.println(balance+" true");
        } else {
            System.out.println("false");
        }
    }
    void withdrawn (double n) {
        if(balance-n >=0){
            balance -= n ;
            System.out.println(balance+" true");
            
        } else {
            System.out.println("false");
        }
    }
}
class Saving {
    String id = "0";
    String tel = "0";
    boolean promptPay = false;
    Account AccAdd ;
    Saving (Account AccAdd) {
        this.AccAdd = AccAdd ;
        System.out.println("Saving account");
    }
    void printInfo () {
        AccAdd.printInfo();
        if(promptPay == true){
            System.out.print("PromptPay");
            if(id.length() == 13){
                System.out.print(", "+id);
            }
            if(tel.length() == 10){
                System.out.print(", "+tel);
            }
        } else {
            System.out.print("no PromptPay");
        }
        System.out.println("");
    }
    void openPromptPay (int n,String guess) {
        if(n == 1){
            this.id = guess ;
            if(guess.length() == 13){
                promptPay = true;
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else if (n == 2){
            this.tel = guess;
            if(guess.length() == 10){
                promptPay = true;
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
public class BankAccount_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        String name = scan.nextLine(); 
        String code = scan.nextLine(); 
        double money = scan.nextDouble();
        Account Acc = new Account(name,code,money);
        Saving save = new Saving(Acc);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int A =scan.nextInt();
            if(A==1){
                save.printInfo();
            } else if (A == 2){
                Acc.checkBalance();
            } else if (A == 4){
                double M = scan.nextDouble();
                Acc.deposit(M);
            } else if (A == 5){
                double M = scan.nextDouble();
                Acc.withdrawn(M);
            } else if (A == 3){
                Acc.closeAccount();
                save.printInfo();
            } else if (A == 6){
                int Numb = scan.nextInt();
                String guess = scan.next();
                save.openPromptPay(Numb,guess);
            }
        } 
    }
}
