
import java.util.Scanner;

public class Box1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        //ปริมาณสูงสุดกล่อง
        int[] n = new int[N];
        for(int i=0; i<N; i++){
            int a = scan.nextInt();
            n[i] = a;
        }
        //คำสั่งที่ต้องการดึงเข้าออก
        int K = scan.nextInt();
        int[][] H = new int[K][4];
        int[] B = new int[K];
        for(int i=0; i<K; i++){
            for(int j=0; j<3; j++){
                int z = scan.nextInt();
                H[i][j] = z;
            }
        }
        //ช่องว่างคำตอบ
        for(int i=0; i<K; i++){
            B[i] = 0;
        }
        //ปริมาณในกล่อง
        int[] m = new int[N];
        for(int i=0; i<N; i++){
            m[i] = 0;
        }
        //คำนวน
        for(int i=0; i<K; i++){
                if(H[i][0]==1)
                {
                        m[H[i][2]-1]+=H[i][1];//บวกไปก่อน
                        if(n[H[i][2]-1]>=m[H[i][2]-1])//ถ้าค่าในกล่องไม่ล้นกล่อง
                        {
                            B[i]+=m[H[i][2]-1];
                        }
                        else//ถ้าล้นกล่อง
                        {
                            B[i]=-1;
                            m[H[i][2]-1]-=H[i][1];//กลับสู่ปริมาณเดิม
                        }
                }
                else if (H[i][0]==2){
                    m[H[i][2]-1]-=H[i][1];//ลบไปก่อน
                    //ถ้าหยิบออกมาแล้วน้อยกว่า0
                    if(m[H[i][2]-1]<0){
                        B[i]=-1;
                        m[H[i][2]-1]+=H[i][1];//คืนค่าเดิม
                    }
                    else {//ถ้าไม่น้อยกว่า0
                        B[i]=m[H[i][2]-1];//ลบปกติ
                    }
                }
            
        }
        //คำตอบ
        for(int i=0; i<K; i++){
            System.out.printf("%d\n",B[i]);
        }
    }
}
