package Data;

public class FullTimeTeacher extends Teacher{
    private int years;
    private float salary;

    private FullTimeTeacher(){
        years = 0;
        salary = 0;
    }

    private FullTimeTeacher(String nameTeacher, int idTeacher, int yearsExperience){
        super.setIdTeacher(idTeacher);
        super.setNameTeacher(nameTeacher);
        years = yearsExperience;
        salary = calculateSalary();
    }

    public float calculateSalary(){
        return salary_basic * (110 * years);
    }

    public int getYearsExperience(){
        return years;
    }

    public void setYearsExperience(int yearsTeacher){
        years = yearsTeacher;
    }
}
