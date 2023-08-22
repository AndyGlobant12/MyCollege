import Data.FullTimeTeacher;
import Data.PartTimeTeacher;
import Data.Student;
import Data.ClassCollege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Teachers
        FullTimeTeacher principal_A = new FullTimeTeacher("Maria Alejandra Cortez Cuadros", 100, 3);
        FullTimeTeacher principal_B = new FullTimeTeacher("Alvaro Lopez Reina", 101, 2);
        PartTimeTeacher support_A = new PartTimeTeacher("Fernando Osorio Perez", 500, 7);
        PartTimeTeacher support_B = new PartTimeTeacher("Clara Ines Barco Casas", 501, 8);

        //Students
        Student Student_A = new Student(100001, 18, "Olga Lucia Tascon Rivera");
        Student Student_B = new Student(100002, 20, "Javier Sanchez Riascos");
        Student Student_C = new Student(100003, 19, "Jose Miguel Sandoval Cardona");
        Student Student_D = new Student(100004, 17, "Jimena Arboleda Grueso");
        Student Student_E = new Student(100005, 17, "Laura Marcela Manzano Torres");
        Student Student_F = new Student(100006, 20, "Pedro Castanio Erazo");

        //Classes
        ClassCollege class_A = new ClassCollege("Matematicas", "A101");
        ClassCollege class_B = new ClassCollege("Fisica", "A102");
        ClassCollege class_C = new ClassCollege("Ingles", "A103");
        ClassCollege class_D = new ClassCollege("Español", "A104");
        class_A.setFullTimeTeacher(principal_A);
        class_B.setFullTimeTeacher(principal_B);
        class_C.setPartTimeTeacher(support_A);
        class_D.setPartTimeTeacher(support_B);
        class_A.setStudentsAssigned(new ArrayList<Student>(Arrays.asList(Student_A, Student_C, Student_D)));
        class_B.setStudentsAssigned(new ArrayList<Student>(Arrays.asList(Student_B, Student_C, Student_D, Student_E)));
        class_C.setStudentsAssigned(new ArrayList<Student>(Arrays.asList(Student_E, Student_F)));
        class_D.setStudentsAssigned(new ArrayList<Student>(Arrays.asList(Student_A, Student_B, Student_D, Student_E, Student_F)));


        //Init
        System.out.println("Bienvenido a la universidad numero UNO");
        Scanner scan = new Scanner(System.in);
        boolean finishTransaction = false;

        while(!finishTransaction){
            System.out.println("Seleccione una opción");
            System.out.println("1. Listado de los profesores con sus datos");
            System.out.println("2. Salir");

            int option = 0;
            option = scan.nextInt();
            scan = new Scanner(System.in);

            switch(option){
                case 1:
                    //bla bla bla
                    break;

                case 2:
                    finishTransaction = true;

                default:
                    System.out.println("Opción no disponible. Favor volver a intentar");
                    finishTransaction = false;
            }
        }
    }
}