
import java.util.Scanner;

class Item {

    public boolean product = true;
    public double weight;
    public double saleprice = 0;
    public double buyprice = 0;

    public Item(boolean product, double weight) {
        this.product = product;
        this.weight = weight;
    }

    public void buyprice(double pricegold) {
        if (product == true) {
            buyprice += pricegold * weight * 0.98;
        } else {
            buyprice += (pricegold - 100) * weight;
        }
        //System.out.printf("%.1f \n",buyprice);
    }

    public void showdetail(double pricegold) {
        String Stringweight = Double.toString(weight);
        if (this.product == true) {
            System.out.printf("ornament %s baht", Stringweight);
        } else {
            System.out.printf("bar %s baht", Stringweight);
        }
    }

    public void saleprice(double pricegold) {
        if (product == true) {
            saleprice += pricegold * weight + 1000 * weight;
        } else {
            saleprice += pricegold * weight;
        }
        System.out.printf("%.1f \n", saleprice);
    }
}

public class SUGoldShop2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double pricegold = input.nextDouble();
        Item[] arrayx = new Item[n + 1];
        double sum_sale_weight = 0;
        double sum_buy_weight = 0;
        double sum_sale = 0;
        double sum_buy = 0;
        for (int i = 0; i < n; i++) {
            String cmdline = input.next();
            String attgold = input.next();
            double weight = input.nextDouble();
            if (attgold.equalsIgnoreCase("t")) {
                arrayx[i] = new Item(true, weight);
                if (cmdline.equalsIgnoreCase("s")) {
                sum_sale_weight +=weight;
                sum_sale += pricegold * weight + 1000 * weight;
                
                } else if (cmdline.equalsIgnoreCase("b")) {
                sum_buy_weight+=weight ; 
                sum_buy += pricegold * weight * 0.98; 

                }
            } else {
                arrayx[i] = new Item(false, weight);
                if (cmdline.equalsIgnoreCase("s")) {
                sum_sale_weight +=weight;
                sum_sale += pricegold * weight;
                
               } else if (cmdline.equalsIgnoreCase("b")) {
                sum_buy_weight+=weight ; 
                sum_buy += (pricegold - 100) * weight;

               }
            }
            /*if (cmdline.equalsIgnoreCase("s")) {
                sum_sale_weight +=weight;
                arrayx[i].saleprice(pricegold);
                
            } else if (cmdline.equalsIgnoreCase("b")) {
                sum_buy_weight+=weight ; 
                arrayx[i].buyprice (pricegold); 

            }*/
        }
        System.out.print(sum_sale_weight + " " +sum_sale);
        System.out.println();
        System.out.println(sum_buy_weight+ " " +sum_buy);

    }
}
