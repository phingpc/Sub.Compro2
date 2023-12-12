
/*import java.util.Scanner;

class Account {
    String name ;
    String code ;
    double balance ;
    boolean active = true;
    Account (String name,String code,double balance) {
        System.out.print("Open account");
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
public class BankAccount_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        String name = scan.nextLine(); 
        String code = scan.nextLine(); 
        double money = scan.nextDouble();
        int N = scan.nextInt();
        Account Acc = new Account(name,code,money);
        for(int i = 0; i < N; ++i){
            int A =scan.nextInt();
            if(A==1){
                Acc.printInfo();
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
                Acc.printInfo();
            }
        }
    }
}
