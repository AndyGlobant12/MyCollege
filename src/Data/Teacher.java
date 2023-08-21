package Data;

public abstract class Teacher {
    protected static final float salary_basic = 3000;
    protected String name;
    protected int id;

    public Teacher(){
        this.name = "";
        this.id = 0;
    }

    public String getNameTeacher(){
        return this.name;
    }

    public int getIdTeacher(){
        return this.id;
    }

    public void setNameTeacher(String newNameTeacher){
        this.name = newNameTeacher;
    }

    public void setIdTeacher(int newIdTeacher){
        this.id = newIdTeacher;
    }

    public abstract float calculateSalary();
}
