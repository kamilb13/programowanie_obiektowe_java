package student;

import java.util.Scanner;

public class Students {

    public Student[] arrayStudents;
    int arrayLength;

    public Students(int arrayLength) {
        this.arrayLength = arrayLength;
        Student[] s = new Student[arrayLength];
        this.arrayStudents = s;
    }

    public void allStudents(){
        for(Student s: arrayStudents){
            System.out.println(s);
        }
    }
    public void addStudent(Student newStudent){
        for (int i = 0; i<arrayLength ;i++) {
            if (arrayStudents[i] == null){
                arrayStudents[i] = newStudent;
                return;
            }
        }
        System.out.println("Brak wolnego miejsca.");
    }

    public void deleteStudent(String name, String lastname){
        for (Student s: arrayStudents) {
            if (s.name == name && s.lastname == lastname){
                s = null;
                return;
            }
        }
        System.out.println("Brak takiego studenta w tablicy.");
    }

    public float averageFromAllYears(Student student){
        float suma = 0;
        for(float f: student.getAverages()){
            suma += f;
        }
        return suma/student.averages.length;
    }

    public void modifyGrades(Student student){
        for (Student s: arrayStudents) {
            if ( s!=null && s.name == student.name && s.lastname == student.lastname){
                System.out.println("Oceny tego student: ");
                for (Float ocena: student.averages){
                    System.out.println(ocena);
                }
                System.out.println("Z jakiego roku chcesz zmienic oceny? (1, 2, 3)");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj rok i ocene");
                student.averages[scanner.nextInt()-1] = scanner.nextFloat();
                return;
            }
        }
        System.out.println("Brak takiego studenta w tablicy.");
    }

    public void modifyStudent(Student student){
        for (Student s: arrayStudents) {
            if ( s!=null && s.name == student.name && s.lastname == student.lastname){
                System.out.println("Co chcesz zmienic? 0 = koniec, 1 = imie, 2 = nazwisko");
                Scanner scanner = new Scanner(System.in);

                int choice = scanner.nextInt();


                switch (choice){
                    case 0: return;
                    case 1:
                        System.out.println("Podaj imie \n");
                        student.setName(scanner.next());
                        break;
                        /*
                        Scanner imie = new Scanner(System.in);
                        System.out.println("Podaj imie \n");
                        student.setName(imie.nextLine());
                        break;
                        */
                    case 2:
                        System.out.println("Podaj nazwisko \n");
                        student.setLastname(scanner.next());
                        break;
                }
                return;
            }
        }
        System.out.println("Brak takiego studenta w tablicy.");
    }
}
