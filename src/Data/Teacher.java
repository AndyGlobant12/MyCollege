package Data;

public abstract class Teacher {
    protected static final float salary_basic = 3000;
    protected String name;
    protected int id;

    public Teacher(){
        name = "";
        id = 0;
    }

    public String getNameTeacher(){
        return name;
    }

    public int getIdTeacher(){
        return id;
    }

    public void setNameTeacher(String newNameTeacher){
        name = newNameTeacher;
    }

    public void setIdTeacher(int newIdTeacher){
        id = newIdTeacher;
    }

    public abstract float calculateSalary();
}
