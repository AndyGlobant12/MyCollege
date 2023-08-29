import Data.FullTimeTeacher;
import Data.PartTimeTeacher;
import Data.Student;
import Data.ClassCollege;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyCollege university = new MyCollege();

        //Init
        System.out.println("Bienvenido a la universidad numero UNO");
        Scanner scan = new Scanner(System.in);
        boolean finishTransaction = false;

        while(!finishTransaction){
            System.out.println("Seleccione una opción");
            System.out.println("1. Listado de los profesores con sus datos");
            System.out.println("2. Imprimir el listado de clases.");
            System.out.println("3. Asignación de nuevo estudiante a una clase");
            System.out.println("4. Crear una nueva clase");
            System.out.println("5. Listado de clases de un estudiante");
            System.out.println("6. Salir");

            int option = 0, newStudentId = 0, newStudentAge = 0, teacherId = 0, studentSearched = 0;
            boolean addStudent = true, fullTimeTeacher = true;
            String nameClass = "", newStudentName = "", newClassRoom = "";
            List<Student> studentsEnrolled = university.getStudentsCollege();
            List<Student> studentsToNewClass = new ArrayList<Student>();
            option = scan.nextInt();
            scan = new Scanner(System.in);

            switch(option){
                case 1:
                    university.listTeachers();
                    break;

                case 2:
                    university.listClasses();
                    System.out.println("Por favor, introduzca el nombre de la clase que le gustaria detallar");
                    nameClass = scan.nextLine();
                    scan = new Scanner(System.in);
                    university.classDetails(nameClass);
                    break;

                case 3:
                    System.out.println("Por favor, introduzca la identificación del estudiante");
                    newStudentId = scan.nextInt();
                    scan = new Scanner(System.in);
                    System.out.println("A continuación, introduzca la edad del estudiante");
                    newStudentAge = scan.nextInt();
                    scan = new Scanner(System.in);
                    System.out.println("Despues, introduzca el nombre del estudiante");
                    newStudentName = scan.nextLine();
                    scan = new Scanner(System.in);
                    System.out.println("Finalmente, introduzca el nombre de la clase a adicionar al estudiante");
                    nameClass = scan.nextLine();
                    scan = new Scanner(System.in);

                    university.addStudentToClassroom(newStudentId, newStudentAge, newStudentName, nameClass);
                    break;

                case 4:
                    System.out.println("Por favor, introduzca el nombre de la clase");
                    nameClass = scan.nextLine();
                    scan = new Scanner(System.in);
                    System.out.println("A continuación, introduzca el salón de la clase");
                    newClassRoom = scan.nextLine();
                    scan = new Scanner(System.in);

                    System.out.println("Es un profesor full time? Y / N");
                    if(scan.nextLine() == "Y"){ fullTimeTeacher = true; }
                    else {fullTimeTeacher = false;}

                    System.out.println("Luego, introduzca el id del profesor");
                    teacherId = scan.nextInt();
                    scan = new Scanner(System.in);


                    while(addStudent){
                        System.out.println("Introduzca el id del estudiante");
                        newStudentId = scan.nextInt();
                        scan = new Scanner(System.in);
                        for(int i = 0; i < studentsEnrolled.size(); i++){
                            if(studentsEnrolled.get(i).getIdStudent()==newStudentId){
                                studentsToNewClass.add(studentsEnrolled.get(i));
                                System.out.println("Desea adicionar un estudiante? Y / N");
                                if(scan.nextLine() == "N"){
                                    addStudent = false;
                                    break;
                                }
                            }
                        }
                    }

                    university.addNewClass(nameClass, newClassRoom, teacherId, studentsToNewClass, fullTimeTeacher);
                    break;

                case 5:
                    System.out.println("Introduzca el id del estudiante");
                    studentSearched = scan.nextInt();
                    scan = new Scanner(System.in);

                    university.classListByStudent(studentSearched);

                case 6:
                    finishTransaction = true;

                default:
                    System.out.println("Opción no disponible. Favor volver a intentar");
                    finishTransaction = false;
            }
        }
    }
}