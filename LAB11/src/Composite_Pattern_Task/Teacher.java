package Composite_Pattern_Task;

import java.util.List;
/**
 *
 * @author Irfan Khan
 */
// Teacher class


public class Teacher extends BaseEmployee {
    String status, qualification;

    public Teacher(String name, int salary, String status, String qualification) {
        super(name, salary);
        this.status = status;
        this.qualification = qualification;
    }



    @Override
    public void giveBonus(int percent) {
        System.out.println("Teacher " + name + " got " + (percent*salary/100) + " bonus");
    }

    @Override
    public void addSubordinate(IEmployee subordinate) {
        System.err.println("Teacher cannot have subordinates");
    }

    @Override
    public List<IEmployee> getSubordinatesList() {
        return null;
    }

    @Override
    public void update(String change){
        System.out.println("Teacher "+name+" got notification from University of change:"+change);
    }
    @Override
    public String toString() {
        return "\n" +
                "\nTeacher{" +
                "\nName='" + name + '\'' +
                ",\nSalary=" + salary +
                ",\nStatus='" + status + '\'' +
                ",\nQualification='" + qualification + '\'' +
                "\n}";
    }
}