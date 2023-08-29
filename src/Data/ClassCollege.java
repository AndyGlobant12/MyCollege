package Data;

import java.util.ArrayList;
import java.util.List;

public class ClassCollege {
    private String name, classroom;
    private FullTimeTeacher ftTeacher;
    private PartTimeTeacher ptTeacher;
    private List<Student> studentsAssigned;

    public ClassCollege(){
        this.name = "";
        this.classroom = "";
        this.ftTeacher = null;
        this.ptTeacher = null;
        this.studentsAssigned = null;
    }

    public ClassCollege(String nameClass, String classroomAssigned){
        this.name = nameClass;
        this.classroom = classroomAssigned;
        this.ftTeacher = null;
        this.ptTeacher = null;
        this.studentsAssigned = null;
    }

    public String getNameClass(){ return this.name; }
    public String getClassroomClass(){ return this.classroom; }
    public FullTimeTeacher getFtTeacher(){return this.ftTeacher;}
    public PartTimeTeacher getPtTeacher(){return this.ptTeacher;}
    public List<Student> getStudents(){return this.studentsAssigned;}
    public void setNameClass(String newNameClass){ this.name = newNameClass; }
    public void setClassroomClass(String newClassroom){ this.classroom = newClassroom; }
    public void setStudentsAssigned(List<Student> newStudents){ this.studentsAssigned = newStudents; }
    public void setFullTimeTeacher(FullTimeTeacher newFTTeacher){ this.ftTeacher =  newFTTeacher; }
    public void setPartTimeTeacher(PartTimeTeacher newPTTeacher){ this.ptTeacher = newPTTeacher; }
}
