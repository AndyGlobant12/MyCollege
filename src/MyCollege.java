import Data.FullTimeTeacher;
import Data.PartTimeTeacher;
import Data.ClassCollege;
import Data.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCollege {
    private List<ClassCollege> classesCollege;
    private List<Student> studentsCollege;
    private List<FullTimeTeacher> ftTeacherCollege;
    private List<PartTimeTeacher> ptTeacherCollege;
    public MyCollege(){
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

        this.classesCollege = new ArrayList<ClassCollege>();
    }
    public void listTeachers(ArrayList<FullTimeTeacher> teacherFTAssigned, ArrayList<PartTimeTeacher> teacherPTAssigned){
        System.out.println("Nombre" + "|\t" + "Tipo");
        for(int i = 0; i < teacherFTAssigned.size(); i++){
            System.out.println(teacherFTAssigned.get(i).getNameTeacher() +"|\t Full time");
        }

        for(int j = 0; j < teacherPTAssigned.size(); j++){
            System.out.println(teacherPTAssigned.get(j).getNameTeacher() +"|\t Full time");
        }
    }

    public void listClasses(ArrayList<ClassCollege> classAssigned){
        System.out.println("Nombre de la clase" + "|\t" + "Aula");
        for(int i = 0; i < classAssigned.size(); i++){
            System.out.println(classAssigned.get(i).getNameClass() +"|\t" + classAssigned.get(i).getClassroomClass());
        }
    }

    public void classDetails(ArrayList<ClassCollege> classesAssigned, String nameClass){
        for(int i = 0; i < classesAssigned.size(); i++) {
            if (classesAssigned.get(i).getNameClass().equals(nameClass)) {
                ClassCollege classSelected = classesAssigned.get(i);
                System.out.println("Nombre de la clase: " + classSelected.getNameClass());
                System.out.println("Aula: " + classSelected.getClassroomClass());
                if (classSelected.getFtTeacher().equals(null)) {
                    System.out.println("Docente: \t" + classSelected.getPtTeacher().getNameTeacher());
                } else {
                    System.out.println("Docente: \t" + classSelected.getFtTeacher().getNameTeacher());
                }
                System.out.println("Estudiantes:");
                for (int i = 0; i < classSelected.getStudents().size(); i++) {
                    System.out.println("* " + classSelected.getStudents().get(i).getNameStudent());
                }
            }
        }
    }

    public void addStudentToClassroom(int newStudentId, int newStudentAge, String newStudentName, String nameClass, ArrayList<ClassCollege> classesAssigned){
        for(int i = 0; i < classesAssigned.size(); i++){
            if(classesAssigned.get(i).getNameClass().equals(nameClass)){
                Student newStudent = new Student(newStudentId, newStudentAge, newStudentName);
                ClassCollege classSelected = classesAssigned.get(i);
                classSelected.getStudents().add(newStudent);
            }
            else {
                System.out.println("La clase no existe, por favor intentelo nuevamente");
            }
        }
    }

    public void classListByStudent(ArrayList<ClassCollege> classesAssigned, int studentId){
        System.out.println("Verificando en el sistema las clases asignadas. El listado se realiza por aula - nombre de la asignatura");
        ClassCollege classSelected;
        boolean foundStudent = false;
        for(int i = 0; i < classesAssigned.size(); i++){
            classSelected = classesAssigned.get(i);
            for(int j = 0; j < classSelected.getStudents().size(); j++){
                if(classSelected.getStudents().get(j).getIdStudent() == studentId){
                    System.out.println(classSelected.getClassroomClass() + "\t" + classSelected.getNameClass());
                    foundStudent = true;
                }
            }
        }

        if(foundStudent!){
            System.out.println("El estudiante no se encuentra matriculado en alguna asignatura");
        }
    }
}
