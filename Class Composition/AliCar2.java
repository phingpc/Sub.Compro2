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
class Factory {
    Car[] FacCar ;
    int la ;
    int[] Tar ;
    public Factory (Car[] FacCar,int la,int[] Tar) {
        this.FacCar = FacCar;
        this.la = la;
        this.Tar = Tar ;
    }
}
public class AliCar2 {
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
				cars[count] = new Car (name, price, labor,count);
                count++;
			}
		}	
        Factory[] Fac = new Factory[5+1];
        for(int j =0; j<5; j++){
            int C = scan.nextInt();
            int[] D = new int[N+1];
            for (int i = 0; i < N; i++) {
                 D[i] = scan.nextInt();
            }
            Fac[j] = new Factory(cars,C,D);
        }
		int A = scan.nextInt();
        for (int idx = 0; idx < A; idx++) {
            int Num = 0 ;
            int B = scan.nextInt() ;
            if (B > count || B <=0 ){
                System.out.println("invalid model");
            } else {
                B--;
                for(int j=0; j<5; j++){
                if(Fac[j].Tar[B]>0 && Fac[j].la - Fac[j].FacCar[B].labor >= 0) {
                    int Ro = j+1;
                    System.out.println("okay "+Ro);
                    Fac[j].la-=Fac[j].FacCar[B].labor;
                    break;
                } else {
                    Num++;
                }
            }
            if(Num >= 5){
                System.out.println("unable to build");
            }
        }
       }
	}
}
/*7
Swift 50 200
Ciaz 65 0
Yaris -1 180
Vios 0 260
Tiana 80 290
Sunny 80 -5
Leopard 200 350 
600 0 1 0 1 0 1 1
650 0 1 1 1 0 0 0
800 0 0 1 0 1 0 1
500 1 1 1 0 0 1 1
300 1 1 1 0 0 0 1
15
1
1
1
1
4
2
1
3
2
2
3
3
3
5
2
*/