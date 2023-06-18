
import java.util.Scanner;

class Course {

    String subject;
    int student;
    int Numstudent = 0;
    int[] Student_number;

    public Course(String subject, int student) {
        this.subject = subject;
        this.student = student;
        /* เนื่องจากจำนวนช่องนักเรียนต้องการให้มีเท่ากับจำนวนเต็มจึงสร้าง
         * ด้านนอกไม่ได้เพราะยังไม่มีการใส่จำนวนนักเรีนนเข้ามา
         */
        this.Student_number  = new int[student + 1];
    }

    boolean enroll(int A) {
        for (int p = 0; p < student; p++) {
            if (A == Student_number[p] || Numstudent >= student) { // นักเรียนลงซ้ำไหม หรือ เต็มรึยัง
                return false;
            }
            
        }
        Student_number[Numstudent] = A;
        Numstudent++;
        return true;
    }
  
    void printInfo() {
        System.out.println(subject+" "+Numstudent);
        for(int p = 0; p < student; p++){
            if(Student_number[p] > 0){ // ช่องที่ไม่ได้ใส่ไม่ต้องแสดง
                System.out.println(Student_number[p]);
            }
        }
    }
}

public class Enrollment1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        final int N = scan.nextInt();
        final int K = scan.nextInt();

        Course co = new Course(str, N);
        for (int i = 0; i < K; ++i) {
            int id = scan.nextInt();
            boolean result = co.enroll(id);
            System.out.println(result);
        }

        co.printInfo();
    }
}
