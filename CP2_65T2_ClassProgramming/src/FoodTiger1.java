/*
import java.util.Scanner;

class FoodShop {
    String name;
    int nFoods = 0;
    public FoodShop (String name){
        this.name = name;
    }
    boolean addFood () {
        if(nFoods <5){
            nFoods++;
            System.out.print(nFoods+" ");
            return true;
        } else {
            System.out.print("-1 ");
            return false;
        }
    }
    
    void printMenu () {
        System.out.println(name+" "+nFoods);
    }
}
public class FoodTiger1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);         
        final int N = scan.nextInt(); 
        FoodShop[] fs = new FoodShop[N+1];
        for(int i = 1; i<=N; ++i) {             
              String name = scan.next();             
              fs[i] = new FoodShop(name);         
        } 
        final int Q = scan.nextInt();         
        for(int i = 0; i < Q; ++i) {             
            int s = scan.nextInt();             
            boolean ret = fs[s].addFood();             
            System.out.println(ret);         
        } 
        for(int i = 1; i<=N; ++i) {             
            fs[i].printMenu();         
        } 
    }
}
