package Data;

public class PartTimeTeacher extends Teacher{
    private int hours;
    private float salary;

    public PartTimeTeacher(){
        this.hours = 0;
        this.salary = 0;
    }

    public PartTimeTeacher(String nameTeacher, int idTeacher, int hoursExperience){
        super.setIdTeacher(idTeacher);
        super.setNameTeacher(nameTeacher);
        this.hours = hoursExperience;
        this.salary = calculateSalary();
    }

    public float calculateSalary(){
        return salary_basic * (this.hours * 5);
    }

    public int getHoursExperience(){
        return this.hours;
    }

    public void setHoursExperience(int yearsTeacher){
        this.hours = yearsTeacher;
    }
}
