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
        Student student_A = new Student(100001, 18, "Olga Lucia Tascon Rivera");
        Student student_B = new Student(100002, 20, "Javier Sanchez Riascos");
        Student student_C = new Student(100003, 19, "Jose Miguel Sandoval Cardona");
        Student student_D = new Student(100004, 17, "Jimena Arboleda Grueso");
        Student student_E = new Student(100005, 17, "Laura Marcela Manzano Torres");
        Student student_F = new Student(100006, 20, "Pedro Castanio Erazo");

        //Classes
        ClassCollege class_A = new ClassCollege("Matematicas", "A101");
        ClassCollege class_B = new ClassCollege("Fisica", "A102");
        ClassCollege class_C = new ClassCollege("Ingles", "A103");
        ClassCollege class_D = new ClassCollege("Español", "A104");
        class_A.setFullTimeTeacher(principal_A);
        class_B.setFullTimeTeacher(principal_B);
        class_C.setPartTimeTeacher(support_A);
        class_D.setPartTimeTeacher(support_B);
        class_A.setStudentsAssigned(new ArrayList<Student>(Arrays.asList(student_A, student_C, student_D)));
        class_B.setStudentsAssigned(new ArrayList<Student>(Arrays.asList(student_B, student_C, student_D, student_E)));
        class_C.setStudentsAssigned(new ArrayList<Student>(Arrays.asList(student_E, student_F)));
        class_D.setStudentsAssigned(new ArrayList<Student>(Arrays.asList(student_A, student_B, student_D, student_E, student_F)));

        this.classesCollege = new ArrayList<ClassCollege>(Arrays.asList(class_A, class_B, class_C, class_D));
        this.ftTeacherCollege = new ArrayList<FullTimeTeacher>(Arrays.asList(principal_A, principal_B));
        this.ptTeacherCollege = new ArrayList<PartTimeTeacher>(Arrays.asList(support_A, support_B));
        this.studentsCollege = new ArrayList<Student>(Arrays.asList(student_A, student_B, student_C, student_D, student_E, student_F));
    }
    public void listTeachers(){
        System.out.println("Nombre" + "|\t" + "Tipo");
        for(int i = 0; i < this.ftTeacherCollege.size(); i++){
            System.out.println(this.ftTeacherCollege.get(i).getNameTeacher() +"|\t Full time");
        }

        for(int j = 0; j < this.ptTeacherCollege.size(); j++){
            System.out.println(this.ptTeacherCollege.get(j).getNameTeacher() +"|\t Part time");
        }
    }

    public void listClasses(){
        System.out.println("Nombre de la clase" + "|\t" + "Aula");
        for(int i = 0; i < this.classesCollege.size(); i++){
            System.out.println(i + " " + this.classesCollege.get(i).getNameClass() +"|\t" + this.classesCollege.get(i).getClassroomClass());
        }
    }

    public void classDetails(String nameClass){
        for(int i = 0; i < this.classesCollege.size(); i++) {
            if (this.classesCollege.get(i).getNameClass().equals(nameClass)) {
                ClassCollege classSelected = this.classesCollege.get(i);
                System.out.println("Nombre de la clase: " + classSelected.getNameClass());
                System.out.println("Aula: " + classSelected.getClassroomClass());
                if (classSelected.getFtTeacher().equals(null)) {
                    System.out.println("Docente: \t" + classSelected.getPtTeacher().getNameTeacher());
                } else {
                    System.out.println("Docente: \t" + classSelected.getFtTeacher().getNameTeacher());
                }
                System.out.println("Estudiantes:");
                for (int j = 0; j < classSelected.getStudents().size(); j++) {
                    System.out.println("* " + classSelected.getStudents().get(j).getNameStudent());
                }
            }
        }
    }

    public void addStudentToClassroom(int newStudentId, int newStudentAge, String newStudentName, String nameClass){
        for(int i = 0; i < this.classesCollege.size(); i++){
            if(this.classesCollege.get(i).getNameClass().equals(nameClass)){
                Student newStudent = new Student(newStudentId, newStudentAge, newStudentName);
                ClassCollege classSelected = this.classesCollege.get(i);
                classSelected.getStudents().add(newStudent);
            }
            else {
                System.out.println("La clase no existe, por favor intentelo nuevamente");
            }
        }
    }

    public List<Student> getStudentsCollege(){ return this.studentsCollege;}

    public void addNewClass(String newClassName,String newClassRoom, int newClassTeacherId, List<Student> newClassStudnets, boolean FullTimeTeacher){
        boolean classExist = false;
        for(int i = 0; i < this.classesCollege.size(); i++){
            if(this.classesCollege.get(i).getNameClass().equals(newClassName)){
                classExist = true;
            }
        }

        if(!classExist){
            ClassCollege newClass = new ClassCollege(newClassName, newClassRoom);
            if (FullTimeTeacher == true) {
                for (int i = 0; i < this.ftTeacherCollege.size(); i++) {
                    if (this.ftTeacherCollege.get(i).getIdTeacher() == newClassTeacherId) {
                        newClass.setFullTimeTeacher(this.ftTeacherCollege.get(i));
                        break;
                    } else {
                        System.out.println("El docente no existe en el sistema");
                    }
                }
            } else {
                for (int i = 0; i < this.ptTeacherCollege.size(); i++) {
                    if (this.ptTeacherCollege.get(i).getIdTeacher() == newClassTeacherId) {
                        newClass.setPartTimeTeacher(this.ptTeacherCollege.get(i));
                        break;
                    } else {
                        System.out.println("El docente no existe en el sistema");
                    }
                }
            }
            newClass.setStudentsAssigned(newClassStudnets);
            this.classesCollege.add(newClass);
        }
        else{
            System.out.println("No es posible crear la clase");
        }
    }


    public void classListByStudent(int studentId){
        System.out.println("Verificando en el sistema las clases asignadas. El listado se realiza por aula - nombre de la asignatura");
        ClassCollege classSelected;
        boolean foundStudent = false;
        for(int i = 0; i < this.classesCollege.size(); i++){
            classSelected = this.classesCollege.get(i);
            for(int j = 0; j < classSelected.getStudents().size(); j++){
                if(classSelected.getStudents().get(j).getIdStudent() == studentId){
                    System.out.println(classSelected.getClassroomClass() + "\t" + classSelected.getNameClass());
                    foundStudent = true;
                }
            }
        }

        if(!foundStudent){
            System.out.println("El estudiante no se encuentra matriculado en alguna asignatura");
        }
    }
}
