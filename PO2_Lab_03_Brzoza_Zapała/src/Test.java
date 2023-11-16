import student.Student;
import student.Students;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Students students = new Students(6);
        //System.out.println(students.arrayStudents.length);
        //System.out.println(students.arrayStudents[1]);
        Student Jan_Wal = new Student("Jan", "Wał", 3, "3ID12B");
        Student Jan_Kowalski = new Student("Marek", "Kowalski", 2, "2ID12A");
        Students students = new Students(5);
        students.addStudent(Jan_Wal);
        students.addStudent(Jan_Kowalski);
        //students.allStudents();
        //students.modifyGrades(Jan_Wal);
        students.allStudents();
        students.modifyStudent(Jan_Wal);
        students.allStudents();
    }
}
