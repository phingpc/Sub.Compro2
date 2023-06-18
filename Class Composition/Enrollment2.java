import java.util.Scanner;
class Student {

    int code_student;
    String namestudent;
    String lastnamestudent;

    public Student(int code_student, String namestudent, String lastnamestudent) {
        this.code_student = code_student;
        this.namestudent = namestudent;
        this.lastnamestudent = lastnamestudent;
    }

    void printInfo() {
        System.out.print(namestudent + " " + lastnamestudent+" ");
    }
}

class Course {

    String subject;
    int student;
    int Numstudent = 0;
    int[] Student_number; /*เติมขึ้นมา */
    Student[] den;
    public Course(String subject, int student,Student[] den) {
        this.subject = subject;
        this.student = student;
        /* เนื่องจากจำนวนช่องนักเรียนต้องการให้มีเท่ากับจำนวนเต็มจึงสร้าง
         * ด้านนอกไม่ได้เพราะยังไม่มีการใส่จำนวนนักเรีนนเข้ามา
         */
        this.Student_number  = new int[student + 1];
        this.den = den ; /*เติมขึ้นมา */
    }
    boolean enroll(int A) {
        int count=0; // ตัวนับ
        for (int p = 0; p < den.length; p++) {
            if (A == den[p].code_student ) { // เลขมีในรายชื่อไหม
                for(int k=0; k<student; k++){
                    if(A == Student_number[k] && Numstudent < student){ // ถ้ามีแล้วมันซ้ำไหม และ จำนวนเต็มรึยัง
                        return false;
                    }
                }
                if (Numstudent >= student) { // เลขมีแต่เต็มแล้ว
                    return false  ;
                }
                den[p].printInfo(); // เลขมีและยังไม่เต็มจะพิมพ์ชื่ออกมา
            } else {
                count++;
            }
            
        }
        if(count >= den.length){ // เลขไม่ตรงกับที่มี
            System.out.print("Invalid ID ");
            return false;
        }
        /* เลขมีและยังไม่เต็มพิมพ์ชื่อไปแล้วจึงนับ */
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

public class Enrollment2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int P = scan.nextInt();
        Student[] s = new Student[P];
        for (int i = 0; i < P; ++i) {
            int id = scan.nextInt();
            String firstName = scan.next();
            String lastName = scan.next();
            s[i] = new Student(id, firstName, lastName);
        }

        String str = scan.next();
        final int N = scan.nextInt();
        final int K = scan.nextInt();

        Course co = new Course(str, N,s/*เติมขึ้นมา */);
        for (int i = 0; i < K; ++i) {
            int id = scan.nextInt();
            boolean result = co.enroll(id);
            System.out.println(result);
        }
        co.printInfo();
    }

}
/*
 * 6
578 Jon Snow
1755 Sansa Stark
22 Arya Stark
27 Robb Stark
1759 Eddark Stark
29 Tyrion Lannister
CreativeSilpakorn
3 11
578
1756
578
578
1756
22
25
578
29
1755
1756

 */