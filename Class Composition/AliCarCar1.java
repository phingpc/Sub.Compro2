import java.util.Scanner;

class Car {
	int carNum;
    String carName;
    int price;
    int labor;
    public Car (String carName,int price,int labor,int carNum){
        this.carNum = carNum;
        this.carName = carName;
        this.price = price;
        this.labor = labor;
    }
    static boolean check (String name,int price,int labor) {
        if(price > 0 && labor > 0 && name != null){

            return true;
        } else {
            return false;
        }
    }
}

public class AliCarCar1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Car[] cars = new Car[N+1];
        int count=0;
        Car Ca = null ;
		for(int i = 0; i < N; ++i) {
			String name = scan.next();
			int price = scan.nextInt();
			int labor = scan.nextInt();
			if(Ca.check(name, price, labor)) {
                count++;
				cars[count] = new Car (name, price, labor,count);
                System.out.println("valid");
			} 
			else {
				System.out.println("invalid");
			}
		}	
	
		for(int i = 1; i <= count; ++i){
                System.out.println(i + " " + cars[i].carName);
        }
	}
}
/*7
Swift 50 200
Ciaz 65 0
Yaris
-1 180
Vios 0 260
Tiana 80 290
Sunny 80 -5
Leopard 200 350 */