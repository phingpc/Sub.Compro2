
public class test {
    void welcome(){//ต้องเรียกผ่าน object
        System.out.printf("Welcome");
    }
    static void greeting(){//ไม่ต้องเรียกผ่าน object
        System.out.println("Sawasdee");
    }
    public static void main(String[] args) {
        int radius = 3 ;
        double area = Math.PI*Math.pow(radius, 2);
        System.out.print(area);
        test t = new test();// objectที่ใช้เรียก
        t.welcome();
        test.greeting();
        greeting();
    }
}
