package Data;

public class FullTimeTeacher extends Teacher{
    private int years;
    private float salary;

    private FullTimeTeacher(){
        this.years = 0;
        this.salary = 0;
    }

    private FullTimeTeacher(String nameTeacher, int idTeacher, int yearsExperience){
        super.setIdTeacher(idTeacher);
        super.setNameTeacher(nameTeacher);
        this.years = yearsExperience;
        this.salary = calculateSalary();
    }

    public float calculateSalary(){
        return salary_basic * (110 * years);
    }

    public int getYearsExperience(){
        return this.years;
    }

    public void setYearsExperience(int yearsTeacher){
        this.years = yearsTeacher;
    }
}
