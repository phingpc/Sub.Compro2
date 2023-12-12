import java.util.Scanner;


public class Longest_Count{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int min = Integer.MIN_VALUE;
        String longestStr = " ";
        int count=0;
        while(true){
            String str = scan.nextLine();
            if(str.length() == 0){
                break;
            }
            int go = str.length();
            if(go>min){
                min=go;
                longestStr = str;
                count=1;
            }
            else if (go==min){
                count++;
            }
        }
        System.out.println(min);
        System.out.print(count);
    }
}
