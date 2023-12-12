
import java.util.Scanner;


public class Index_Of {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String Q = scan.nextLine();
        str.indexOf(Q);
        if (str.indexOf(Q)<=-1){
            System.out.printf("string not found");
        }
        else {
            System.out.print(str.indexOf(Q)+1);
        }
    }
}
