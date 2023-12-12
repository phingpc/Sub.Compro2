
import java.util.Scanner;


public class Battleship3_StartBattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        int C = scan.nextInt();
        int[][] arr = new int[R][C];
        int count1=0;
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                arr[i][j] = scan.nextInt();
                if (arr[i][j]==1){
                    count1++;
                }
            }
        }
        int K = scan.nextInt();
        int target=0; // Y
        int missandbattle=0;// Y
        int targetloops=0;
        int missandbattleloop=0;
        int outside=0;// Y
        int last=0;
        int first=0;
        for(int i=0; i<K; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            if(A<=R && A>0 && B<=C && B>0){
                if(arr[A-1][B-1]==1){
                    target++;
                    if (target == count1){
                        last+=i+1;
                    }
                    if(target == 1){
                        first+=i+1;
                    }
                    arr[A-1][B-1]++;
                }
                else if(arr[A-1][B-1]>1){
                        targetloops++;
                    }
                else if (arr[A-1][B-1]==0){
                    missandbattle++;
                    arr[A-1][B-1]--;
                }
                else if(arr[A-1][B-1]<0){
                        missandbattleloop++;
                    }
            }
            else{
                outside++;
            }
        }
        System.out.println(target);
        System.out.println(missandbattle);
        System.out.println(targetloops);
        System.out.println(missandbattleloop);
        System.out.println(outside);
        if(count1 == target){
            System.out.printf("attacker %d",last);
        }
        else if (target == 0){
            System.out.printf("battleship ­1");
        }
        else if (target<count1){
            System.out.printf("battleship %d",first);
        }
    }
}
//3 4 0 1 1 0 1 0 0 0 0 1 0 1 10 3 0 1 2 2 1 1 2 3 2 2 1 3 0 2 2 2 2 2 3
//3 4 0 1 1 0 1 0 0 0 0 0 0 0 6 3 2 2 1 1 2 1 3 1 2 2 3