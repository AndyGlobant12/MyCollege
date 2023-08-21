package Data;

public class PartTimeTeacher extends Teacher{
    private int hours;
    private float salary;

    private PartTimeTeacher(){
        hours = 0;
        salary = 0;
    }

    private PartTimeTeacher(String nameTeacher, int idTeacher, int hoursExperience){
        super.setIdTeacher(idTeacher);
        super.setNameTeacher(nameTeacher);
        hours = hoursExperience;
        salary = calculateSalary();
    }

    public float calculateSalary(){
        return salary_basic * (hours * 5);
    }

    public int getHoursExperience(){
        return hours;
    }

    public void setHoursExperience(int yearsTeacher){
        hours = yearsTeacher;
    }
}
