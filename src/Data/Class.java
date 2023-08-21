package Data;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String name, classroom;
    private FullTimeTeacher FTTeacher;
    private PartTimeTeacher PTTeacher;
    private List<Student> studentsAssigned;

    public Class(){
        this.name = "";
        this.classroom = "";
        this.FTTeacher = new FullTimeTeacher();
        this.PTTeacher = new PartTimeTeacher();
        this.studentsAssigned = new ArrayList<Student>();
    }

    public Class(String nameClass, String classroomAssigned){
        this.name = nameClass;
        this.classroom = classroomAssigned;
    }

    public String getNameClass(){ return this.name; }
    public String getClassroomClass(){ return this.classroom; }
    public void setNameClass(String newNameClass){ this.name = newNameClass; }
    public void setClassroomClass(String newClassroom){ this.classroom = newClassroom; }
    public void setStudentsAssigned(List<Student> newStudents){ this.studentsAssigned = newStudents; }
    public void setFullTimeTeacher(String nameTeacher, int idTeacher, int yearsExperience){
        this.FTTeacher = new FullTimeTeacher(nameTeacher, idTeacher, yearsExperience);
    }
    public void setPartTimeTeacher(String nameTeacher, int idTeacher, int hoursExperience){
        this.PTTeacher = new PartTimeTeacher(nameTeacher, idTeacher, hoursExperience);
    }

}
