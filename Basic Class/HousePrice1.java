import java.util.Scanner;

class House {
    int landSize;
    int quality;
    int floors;
    int houseArea;
    public int price = 0;
    public House(int landSize,int quality,int floors,int houseArea){
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        price = (landSize*10000);
        if(quality == 1) {
            price += houseArea*10000;
        } else if (quality == 2) {
            price += houseArea*8000;
        } else if (quality == 3){
            price += houseArea*5000;
        }
        if(floors > 1){
            price += (floors -1)*200000;
        }
    }
} 

public class HousePrice1 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int landSize = scan.nextInt();
        int quality = scan.nextInt();
        int floors = scan.nextInt();
        int houseArea = scan.nextInt();
 
        House house = new House(landSize, quality, floors, houseArea);
        System.out.println(house.landSize + " " + house.quality + " " + house.floors + " " +  house.houseArea);
        System.out.println(house.price);
    }
}
    
 