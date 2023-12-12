
import java.util.Scanner;


class ProductInfo {

    public String producename;
    public int Goodprice = 100000000;
    public int Badprice = 0;

    public ProductInfo(String producename,int[] prices,int N) {
        this.producename = producename;
        for(int i= 0; i< N; i++){
            if(prices[i] >= this.Badprice){
                this.Badprice = prices[i];
            }if (prices[i] <= this.Goodprice){
                this.Goodprice = prices[i];
            }
        }
    }

    public void printInfo() {
        System.out.printf("%s %d %d",producename,Goodprice,Badprice);
    }
}

public class FindBestDea1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int N = scan.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = scan.nextInt();;
        }
        ProductInfo pInfo = new ProductInfo(name, prices,N);
        pInfo.printInfo();
    }
}
