public class Staff_hire
{
    private int vacancy_Number;
    private String designation;
    private String jobType;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean Joined =false;
    
public Staff_hire(int vacancy_Number, String designation, String jobType,String staffName,String joiningDate,String qualification,String appointedBy)
{
    this.vacancy_Number=vacancy_Number;
    this.designation=designation;
    this.jobType=jobType;
    this.staffName=staffName;
    this.joiningDate=joiningDate;
    this.qualification=qualification;
    this.appointedBy=appointedBy;
}

public int getvacancyNumber()
{
    return vacancy_Number;
}
public String getdesignation()
{
    return designation;
}
public String getjobType()
{
    return jobType;
}
public String getstaffName()
{
    return staffName;
}
public String getJoiningDate()
{
    return joiningDate;
}
public String getqualification()
{
    return qualification;
}
public String getappointedby()
{
    return appointedBy;
}
public boolean joined()
{
    return Joined;
}
}