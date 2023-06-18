
import java.util.Scanner;

class House {

    int landSize;
    int quality;
    int floors;
    int houseArea;
    public int price = 0;

    public House(int landSize, int quality, int floors, int houseArea) {
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        price = (landSize * 10000);
        if (quality == 1) {
            price += houseArea * 10000;
        } else if (quality == 2) {
            price += houseArea * 8000;
        } else if (quality == 3) {
            price += houseArea * 5000;
        }
        if (floors > 1) {
            price += (floors - 1) * 200000;
        }
    }
}

public class HousePrice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int Minprice = 0 ;
        House[] arr_house = new House [A+1];
        for (int i = 0; i < A; i++) {
            int landSize = scan.nextInt();
            int quality = scan.nextInt();
            int floors = scan.nextInt();
            int houseArea = scan.nextInt();
            House house = new House(landSize, quality, floors, houseArea);
            arr_house [i] = house;
        }
        int target_price = scan.nextInt();
        int target_house_Area = scan.nextInt();
        int count = 0;
        for (int i = 0; i < A; i++) {
            if(arr_house [i].price <= target_price && arr_house [i].houseArea >= target_house_Area){
                System.out.printf("%d %d %d %d %d",arr_house [i].landSize,arr_house [i].quality,arr_house [i].floors,arr_house [i].houseArea,arr_house [i].price);
                count++;
                System.out.println("");
            }
            
        }
        if(count == 0){
            System.out.printf("none") ;
        }
    }
}
