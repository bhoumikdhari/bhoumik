public class PartTimeStaffHire extends Staff_hire
{
    private int workingHour;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;
    
    public PartTimeStaffHire(int vacancyNumber, String designation,String staffName, String jobType,String joiningDate, String qualification,
    String appointedBy, int workingHour, double wagesPerHour, String shift)
    {
        super(vacancyNumber, designation, jobType, staffName, joiningDate,qualification, appointedBy);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        this.terminated = false; // Assign terminated status to false
    }
    public int workingHour()
    {
        return workingHour;
    }
    public double wagesPerHours()
    {
        return wagesPerHour;
    }
    public String shifts()
    {
        return shifts;
    }
    public boolean termination()
    {
        return terminated;
    }
    public void Set_shift(String shift)
    {
        shifts = shift;
    }
    public void Fired()
    {
        if (terminated ==true)
        System.out.println("The staff is already terminated");
        else;
        terminated = true;
        System.out.println("The staff has been terminated");
    }
    public void PartTimeStaffHire_details()
    {
        super.getvacancyNumber(); super.getdesignation(); super.getjobType(); super.getstaffName(); super.getJoiningDate(); super.getqualification();
        super.joined();workingHour(); wagesPerHours(); shifts();termination();
        
    }
}