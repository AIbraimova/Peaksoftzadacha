import java.time.temporal.ChronoUnit;

public class Instructor extends Person{
    private double salary;

    public Instructor(double salary,long id,String fullName,int age,char gender) {
        super(id,fullName,age,gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double period(Group group) {
        return getSalary();
    }
}

//Obstract klasstyn ichinde emneler bolot?
//private ,protected aiyrmasy? modificator dostupa?
