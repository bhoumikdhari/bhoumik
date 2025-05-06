public class FullTimeStaffHire extends Staff_hire
{
    private double salary;
    private int weeklyFractionalHours;

    public FullTimeStaffHire(int vacancyNumber,String designation,String jobType,String staffName, String joiningDate,String qualification, String appointedBy,
    double salary, int weeklyFractionalHours)
    {
        super(vacancyNumber, designation, jobType, staffName, joiningDate, qualification, appointedBy );
        this.salary= salary;
        this.weeklyFractionalHours= weeklyFractionalHours;
    }

    public double getsalary()
    {
        return salary;
    }

    public int getweeklyFractionalHours()
    {
        return weeklyFractionalHours;
    }

    public void newsalary(double newsalary)
    {
        this.salary= newsalary;
    }

    public void newWeeklyFractionalHours(int newWeeklyFractionalHours)
    {
        this.weeklyFractionalHours= newWeeklyFractionalHours;
    }
    
    public void displayDetails() 
    {
        System.out.println("Vacancy Number: " + super.getvacancyNumber());
        System.out.println("Designation: " + super.getdesignation());
        System.out.println("Job Type: " + super.getjobType());
        System.out.println("Staff Name: " + super.getstaffName());
        System.out.println("Joining Date: " + super.getJoiningDate());
        System.out.println("Qualification: " + super.getqualification());
        System.out.println("Appointed By: " + super.getappointedby());
        System.out.println("Joined: " + super.joined());
        System.out.println("Salary: $" + salary);
        System.out.println("Weekly Fractional Hours: " + weeklyFractionalHours);
    }
}