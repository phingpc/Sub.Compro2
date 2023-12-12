
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guest-Student
 */
public class Char_At {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int target = scan.nextInt();
        target-=1;
        if(target<0){
            System.out.printf("invalid position");
        }
        else if (target>=text.length()){
            System.out.printf("invalid position");
        }
        else {
            char C = text.charAt(target);
            System.out.print(C);
        }
    }
}
