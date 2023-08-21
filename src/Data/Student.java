package Data;

public class Student {
    private int id;
    private int age;
    private String name;

    public Student() {
        this.id = 0;
        this.age = 0;
        this.name= "";
    }

    public Student(int idStudent, int ageStudent, String nameStudent){
        this.id = idStudent;
        this.age = ageStudent;
        this.name = nameStudent;
    }

    public int getIDStudent(){
        return this.id;
    }

    public int getAgeStudent(){
        return this.age;
    }

    public String getNameStudent(){
        return this.name;
    }

    public void setIdStudent(int newIdStudent){
        this.id = newIdStudent;
    }

    public void setAgeStudent(int newAgeStudent){
        this.age = newAgeStudent;
    }

    public void setNameStudent(String newNameStudent){
        this.name = newNameStudent;
    }
}
