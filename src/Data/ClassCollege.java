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
        this.ftTeacher = new FullTimeTeacher();
        this.ptTeacher = new PartTimeTeacher();
        this.studentsAssigned = new ArrayList<Student>();
    }

    public ClassCollege(String nameClass, String classroomAssigned){
        this.name = nameClass;
        this.classroom = classroomAssigned;
    }

    public String getNameClass(){ return this.name; }
    public String getClassroomClass(){ return this.classroom; }
    public void setNameClass(String newNameClass){ this.name = newNameClass; }
    public void setClassroomClass(String newClassroom){ this.classroom = newClassroom; }
    public void setStudentsAssigned(List<Student> newStudents){ this.studentsAssigned = newStudents; }
    public void setFullTimeTeacher(FullTimeTeacher newFTTeacher){
        this.ftTeacher =  newFTTeacher;
    }
    public void setPartTimeTeacher(PartTimeTeacher newPTTeacher){
        this.ptTeacher = newPTTeacher;
    }

}
