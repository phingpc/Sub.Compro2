import java.util.Scanner;


public class OddEvenZero2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int[] arr = new int[A];
        for(int i=0; i<A; i++){
            int N = scan.nextInt();
            arr[i] = N;
        }
        int sum=0;
        for(int i=0; i<A; i++){
            if(arr[i]%2!=0 || arr[i]==0){
                if(arr[i]==0){
                System.out.printf("%d ",arr[i]);
                sum = arr[i];
                }
                else if(arr[i]>sum){
                System.out.printf("%d ",arr[i]);
                sum = arr[i];
                }
            }
        }
        System.out.println("");
        sum = 0;
        for(int i=0; i<A; i++){
            if(arr[i]%2==0 || arr[i]==0){
                if(arr[i]==0){
                System.out.printf("%d ",arr[i]);
                sum = arr[i];
                }
                else if(arr[i]>sum){
                System.out.printf("%d ",arr[i]);
                sum = arr[i];
                }
            }
        }
    }
}

