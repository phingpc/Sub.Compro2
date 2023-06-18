
import java.util.Scanner;

class ProductInfo {

    public String producename;
    public int Goodprice = 100000000;
    public int Badprice = 0;

    public ProductInfo(String producename, int[] prices, int N) {
        this.producename = producename;
        for (int i = 0; i < N; i++) {
            if (prices[i] >= Badprice) {
                this.Badprice = prices[i];
            }
            if (prices[i] <= Goodprice) {
                Goodprice = prices[i];
            }
        }
    }

    public void printInfo() {
        System.out.printf("%s %d %d\n", producename, Goodprice, Badprice);
    }
}

class Store {

    private ProductInfo[] products = new ProductInfo[1000];
    int count = 0;
    void enterProductInfo(Scanner scan) {
        String name = scan.next();
        int K = scan.nextInt();
        int[] price = new int[K+1] ;
        for(int p=0; p<K; p++){
            price[p] = scan.nextInt() ;
        }
        products[count] = new ProductInfo(name, price, K) ;
        count++;
    }

    void printAllProductInfo() {
        for(int p=0; p<count; p++){
            products[p].printInfo();
        }
    }
}

public class FindBestDeal2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Store store = new Store();
        int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            store.enterProductInfo(scan);
        }
        store.printAllProductInfo();
    }
}
/*3
Computer
5
2500 2000 3800 50000 45000
Monitor22
7
5000 900 600 800 4000 3500 600
Monitor17
4
400 600 800 900 */