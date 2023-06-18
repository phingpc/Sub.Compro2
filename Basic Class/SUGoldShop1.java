
import java.util.Scanner;

class Item {
    public boolean product = true;
    public double weight;
    public double saleprice;
    public double buyprice ;
    public Item (boolean product,double weight) {
        this.product = product;
        this.weight = weight;
    }
    public void buyprice (double pricegold) {
        if (product == true) {
            buyprice = pricegold*weight*0.98;
        } else {
            buyprice = (pricegold-100)*weight;
        }
        System.out.printf("%.1f \n",buyprice);
    }

    public void showdetail (double pricegold) {
        String Stringweight = Double.toString(weight);
        if (this.product == true) { 
            System.out.printf("ornament %s baht",Stringweight);
        } else {
            System.out.printf("bar %s baht",Stringweight);
        }
    }

    public void saleprice (double pricegold) {
        if(product == true){
            saleprice = pricegold*weight + 1000*weight ;
        } else {
            saleprice = pricegold*weight ;
        }
        System.out.printf("%.1f \n",saleprice);
    }
}

public class SUGoldShop1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double pricegold = input.nextDouble();
        Item[] arrayx = new Item[n+1];
        for (int i = 0; i < n; i++) {
            String cmdline = input.next();
            String attgold = input.next();
            double weight = input.nextDouble();
            if (attgold.equalsIgnoreCase("t")) {
                arrayx[i] = new Item(true,weight); 
            }else {
                arrayx[i] = new Item(false,weight);
            }
            arrayx[i].showdetail(pricegold);
            if (cmdline.equalsIgnoreCase("s")) {
                System.out.printf(" sale ") ;
                arrayx[i].saleprice(pricegold) ;
            } else if (cmdline.equalsIgnoreCase("b")) {
                System.out.printf(" buy ") ;
                arrayx[i].buyprice(pricegold);
            }
        }
    }
}
