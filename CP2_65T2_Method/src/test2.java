
public class test2 {
    static void line1(){
        System.out.println("Welcome");
    }
    static String line2(){
        return "Sawasdee";
    }
    static void line3(int n ){
        for(int i=0; i<n; i++){
            System.out.print("=");
        }
        System.out.println();
    }
    static String line4(int n){
        String s ="";
        for(int i=0; i<n; i++) s += "=";
        
        return s;
    }
    public static void main(String[] args) {
        line1();
        String ans = line2();
        System.out.println(ans);
        line3(10);
        String res = line4(15);
        System.out.println(res);
    }
}
