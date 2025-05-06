import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class staffHiringGUI implements ActionListener
{
    private ArrayList<Staff_hire> Staffes;
    private JLabel Vacancy;
    private JLabel jobtype;
    private JLabel Designation;
    private JLabel jobDate;
    private JLabel staffName;
    private JLabel appointedBy;
    private JLabel qualification;
    private JLabel salary;
    private JLabel joined;
    private JCheckBox join;
    private JLabel weeklyFractionalHour;
    private JLabel workingHours;
    private JLabel wagesPerHour;
    private JLabel shifts;
    private JLabel displayNumber;
    private JTextField vacancyT;
    private JTextField jobTypeT;
    private JTextField designationT;
    private JTextField jobDateT;
    private JTextField staffNameT;
    private JTextField appointedByT;
    private JTextField qualificationT;
    private JTextField salaryT;
    private JTextField weekelyFractionHourT;
    private JTextField workingHourT;
    private JTextField wagesPerHourT;
    private JComboBox<String> shiftsT;
    private JTextField displayNumberT;
    
    private JButton addFullTimeStaff;
    private JButton addPartTimeStaff;
    private JButton addshift;
    private JButton addSalary;
    private JButton terminate;
    private JButton displayNumberB;
    private JFrame frame;
    private JFrame frame1;
    private JButton fulltime;
    private JButton partTime;
    
    
    public staffHiringGUI()
    {
        Staffes = new ArrayList<Staff_hire>();
        frame = new JFrame("Staff Hire");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(11,4));
        
        

        
        Container row11 = new Container();
        row11.setLayout(new FlowLayout());
        Vacancy = new JLabel("Vacancy");
        row11.add(Vacancy);
        
        Container row12 = new Container();
        row12.setLayout(new FlowLayout());
        vacancyT = new JTextField(10);
        row12.add(vacancyT);
        
        Container row13 = new Container();
        row13.setLayout(new FlowLayout());
        Designation = new JLabel("Designation");
        row13.add(Designation);
        
        Container row14 = new Container();
        row14.setLayout(new FlowLayout());
        designationT = new JTextField(10);
        row14.add(designationT);
        
        Container row21 = new Container();
        row21.setLayout(new FlowLayout());
        jobtype = new JLabel("Job Type");
        row21.add(jobtype);
        
        Container row22 = new Container();
        row22.setLayout(new FlowLayout());
        jobTypeT = new JTextField(10);
        row22.add(jobTypeT);
        
        Container row23 = new Container();
        row23.setLayout(new FlowLayout());
        jobDate = new JLabel("Job Date");
        row23.add(jobDate);
        
        Container row24 = new Container();
        row24.setLayout(new FlowLayout());
        jobDateT = new JTextField(10);
        row24.add(jobDateT);
        
        Container row31 = new Container();
        row31.setLayout(new FlowLayout());
        staffName  = new JLabel("staff name");
        row31.add(staffName);

        Container row32 = new Container();
        row32.setLayout(new FlowLayout());
        staffNameT = new JTextField(10);
        row32.add(staffNameT);
        
        Container row33 = new Container();
        row33.setLayout(new FlowLayout());
        appointedBy = new JLabel("Appointed By");
        row33.add(appointedBy);
        
        Container row34 = new Container();
        row34.setLayout(new FlowLayout());
        appointedByT = new JTextField(10);
        row34.add(appointedByT);
        
        Container row41 = new Container();
        row41.setLayout(new FlowLayout());
        qualification = new JLabel ("Qualificaton");
        row41.add(qualification);
        
        Container row42 = new Container();
        row42.setLayout(new FlowLayout());
        qualificationT = new JTextField(10);
        row42.add(qualificationT);
        
        Container row43 = new Container();
        row43.setLayout(new FlowLayout());
        salary = new JLabel ("Salary");
        row43.add(salary);
        
        Container row44 = new Container();
        row44.setLayout(new FlowLayout());
        salaryT = new JTextField(10);
        row44.add(salaryT);
        
        Container row53 = new Container();
        row53.setLayout(new FlowLayout());
        joined = new JLabel("Joined");
        row53.add(joined);
        Container row54 = new Container();
        row54.setLayout(new FlowLayout());
        join = new JCheckBox("join");
        row54.add(join);
        
        Container row61 = new Container();
        row61.setLayout(new FlowLayout());
        weeklyFractionalHour = new JLabel ("Weekly Fractional Hour");
        row61.add(weeklyFractionalHour);

        Container row62 = new Container();
        row62.setLayout(new FlowLayout());
        weekelyFractionHourT = new JTextField(10);
        row62.add(weekelyFractionHourT);

        Container row63 = new Container();
        row63.setLayout(new FlowLayout());
        workingHours = new JLabel ("Working Hours");
        row63.add(workingHours);
        
        Container row64 = new Container();
        row64.setLayout(new FlowLayout());
        workingHourT = new JTextField(10);
        row64.add(workingHourT);
        
        Container row71 = new Container();
        row71.setLayout(new FlowLayout());
        wagesPerHour = new JLabel("Wages per hour");
        row71.add(wagesPerHour);
        
        Container row72 = new Container();
        row72.setLayout(new FlowLayout());
        wagesPerHourT = new JTextField(10);
        row72.add(wagesPerHourT);
        
        Container row73 = new Container();
        row73.setLayout(new FlowLayout());
        shifts = new JLabel("Shifts");
        row73.add(shifts);
        
        Container row74 = new Container();
        row74.setLayout(new FlowLayout());
        shiftsT = new JComboBox<>(new String[]{"morning", "evening", "night"});
        row74.add(shiftsT);
        
        Container row82 = new Container();
        Container row83 = new Container();
        Container row84 = new Container();
        
        Container row91 = new Container();
        row91.setLayout(new FlowLayout());
        addFullTimeStaff = new JButton("Add Fulltime Staff");
        row91.add(addFullTimeStaff);
        addFullTimeStaff.addActionListener(this);
    
        
        Container row92 = new Container();
        row92.setLayout(new FlowLayout());
        addPartTimeStaff = new JButton("Add Parttime Staff");
        row92.add(addPartTimeStaff);
        addPartTimeStaff.addActionListener(this);
        
        Container row93 = new Container();
        row93.setLayout(new FlowLayout());
        addSalary = new JButton("Add Salary");
        row93.add(addSalary);
        addSalary.addActionListener(this);
        
        Container row94 = new Container();
        row94.setLayout(new FlowLayout());
        addshift= new JButton("Add Working Shifts");
        row94.add(addshift);
        addshift.addActionListener(this);
        
        Container row01 = new Container();
        Container row02 = new Container();
        row02.setLayout(new FlowLayout());
        terminate = new JButton("Terminate");
        row02.add(terminate);
        terminate.addActionListener(this);
        
        Container row03 = new Container();
        Container row04 = new Container();
        
        
        Container row1 = new Container();
        row1.setLayout(new FlowLayout());
        displayNumber = new JLabel("display Number:");
        row1.add(displayNumber);
        
        
        Container row2 = new Container();
        row2.setLayout(new FlowLayout());
        displayNumberT = new JTextField(10);
        row2.add(displayNumberT);
        
        Container row3 = new Container();
        row3.setLayout(new FlowLayout());
        displayNumberB = new JButton("display Number");
        row3.add(displayNumberB);
        displayNumberB.addActionListener(this);
        
        Container row4 = new Container();
        
        
        contentPane.add(row11);
        contentPane.add(row12);
        contentPane.add(row13);
        contentPane.add(row14);
        contentPane.add(row21);
        contentPane.add(row22);
        contentPane.add(row23);
        contentPane.add(row24);
        contentPane.add(row31);
        contentPane.add(row32);
        contentPane.add(row33);
        contentPane.add(row34);
        contentPane.add(row41);
        contentPane.add(row42);
        contentPane.add(row43);
        contentPane.add(row44);
        contentPane.add(row53);
        contentPane.add(row54);
        contentPane.add(row61);
        contentPane.add(row62);
        contentPane.add(row63);
        contentPane.add(row64);
        contentPane.add(row71);
        contentPane.add(row72);
        contentPane.add(row73);
        contentPane.add(row74);
        contentPane.add(row82);
        contentPane.add(row83);
        contentPane.add(row84);
        contentPane.add(row91);
        contentPane.add(row92);
        contentPane.add(row93);
        contentPane.add(row94);
        contentPane.add(row01);
        contentPane.add(row02);
        contentPane.add(row03);
        contentPane.add(row04);
        contentPane.add(row1);
        contentPane.add(row2);
        contentPane.add(row3);
        contentPane.add(row4);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        staffHiringGUI GUI = new staffHiringGUI();
    }
    
    public void actionPerformed(ActionEvent e) 
{
    Object source = e.getSource();

    if (source == addFullTimeStaff) {
        // Add logic to collect fields and hire full-time staff
        handleAddFullTimeStaff();
    }
     else if (source == addPartTimeStaff) {
        // Logic for adding part-time staff
        handleAddPartTimeStaff();
    } else if (source == addSalary) {
        // Add logic to update salary
        // Add this block:
    if (vacancyT.getText().isEmpty() || salaryT.getText().isEmpty()) {
        JOptionPane.showMessageDialog(frame, "Please enter both Vacancy Number and New Salary.");
        return;
    }

    try {
        int vacancy = Integer.parseInt(vacancyT.getText());
        double newSalary = Double.parseDouble(salaryT.getText());
        boolean found = false;

        for (Staff_hire staff : Staffes) {
            if (staff.getvacancyNumber() == vacancy) {
                found = true;
                if (staff instanceof FullTimeStaffHire) {
                    if (join.isSelected()) {
                        ((FullTimeStaffHire) staff).newsalary(newSalary);
                        JOptionPane.showMessageDialog(frame, "Salary updated successfully!");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Cannot update salary. Staff is not marked as joined.");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "This vacancy is not for full-time staff.");
                }
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(frame, "No staff found with that vacancy number.");
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(frame, "Please enter valid numbers for vacancy and salary.");
    }
    } else if (source == addshift) {
        // Add logic to update working shift
        if (vacancyT.getText().isEmpty() || shiftsT.getSelectedItem()== null) {
        JOptionPane.showMessageDialog(frame, "Please enter both Vacancy Number and New Shift.");
        return;
    }

    try {
        int vacancy = Integer.parseInt(vacancyT.getText());
        String newShift = (String)shiftsT.getSelectedItem();
        boolean found = false;

        for (Staff_hire staff : Staffes) {
            if (staff.getvacancyNumber() == vacancy) {
                found = true;
                if (staff instanceof PartTimeStaffHire) {
                    if (join.isSelected()) {
                        ((PartTimeStaffHire) staff).Set_shift(newShift);  // ✅ Your shift-changing method
                        JOptionPane.showMessageDialog(frame, "Shift updated successfully!");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Cannot update shift. Staff is not marked as joined.");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "This vacancy is not for part-time staff.");
                }
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(frame, "No staff found with that vacancy number.");
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(frame, "Please enter a valid vacancy number.");
    }
    } else if (source == terminate) {
        // Terminate logic: This could depend on vacancy number or index
        terminatePT();
    } else if (source == displayNumberB) {
        display();
    } 
}
private void handleAddPartTimeStaff() {
    try {
        if (vacancyT.getText().isEmpty() || designationT.getText().isEmpty() || jobTypeT.getText().isEmpty() ||
            staffNameT.getText().isEmpty() || jobDateT.getText().isEmpty() || qualificationT.getText().isEmpty() ||
            appointedByT.getText().isEmpty() || workingHourT.getText().isEmpty() || wagesPerHourT.getText().isEmpty() || shiftsT.getSelectedItem()==null) {
            JOptionPane.showMessageDialog(frame, "Please fill all fields.");
            return;
        }

        int vacancy = Integer.parseInt(vacancyT.getText());

        boolean vacancyExists = false;
        for (Staff_hire staff : Staffes) {
            if (staff.getvacancyNumber() == vacancy) {
                vacancyExists = true;
                break;
            }
        }

        if (vacancyExists) {
            JOptionPane.showMessageDialog(frame, "A staff with this vacancy number already exists.");
            return;
        }

        String desig = designationT.getText();
        String job = jobTypeT.getText();
        String name = staffNameT.getText();
        String date = jobDateT.getText();
        String qual = qualificationT.getText();
        String appoint = appointedByT.getText();
        int workingHours = Integer.parseInt(workingHourT.getText());
        double wages = Double.parseDouble(wagesPerHourT.getText());
        String shift = (String)shiftsT.getSelectedItem();

        PartTimeStaffHire pts = new PartTimeStaffHire(vacancy, desig, job, name, date, qual, appoint, workingHours, wages, shift);
        Staffes.add(pts);
        JOptionPane.showMessageDialog(frame, "Part-time staff added!");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(frame, "Please enter valid numeric inputs.");
    }
}

private void handleAddFullTimeStaff() {
    try {
        if (vacancyT.getText().isEmpty() || designationT.getText().isEmpty() || jobTypeT.getText().isEmpty() ||
            staffNameT.getText().isEmpty() || jobDateT.getText().isEmpty() || qualificationT.getText().isEmpty() ||
            appointedByT.getText().isEmpty() || salaryT.getText().isEmpty() || weekelyFractionHourT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill all fields.");
            return;
        }

        int vacancy = Integer.parseInt(vacancyT.getText());

        boolean vacancyExists = false;
        for (Staff_hire staff : Staffes) {
            if (staff.getvacancyNumber() == vacancy) {
                vacancyExists = true;
                break;
            }
        }

        if (vacancyExists) {
            JOptionPane.showMessageDialog(frame, "A staff with this vacancy number already exists.");
            return;
        }

        String desig = designationT.getText();
        String job = jobTypeT.getText();
        String name = staffNameT.getText();
        String date = jobDateT.getText();
        String qual = qualificationT.getText();
        String appoint = appointedByT.getText();
        double sal = Double.parseDouble(salaryT.getText());
        int weeklyHours = Integer.parseInt(weekelyFractionHourT.getText());

        FullTimeStaffHire fts = new FullTimeStaffHire(vacancy, desig, job, name, date, qual, appoint, sal, weeklyHours);
        Staffes.add(fts);
        JOptionPane.showMessageDialog(frame, "Full-time staff added!");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(frame, "Please enter valid numeric inputs.");
    }
}
private void terminatePT(){
    // Get the vacancy number from the input text field
    try {
        int vacancyToTerminate = Integer.parseInt(vacancyT.getText());
        
        // Find the staff with the given vacancy number
        Staff_hire staffToTerminate = null;
        for (Staff_hire staff : Staffes) {
            if (staff.getvacancyNumber() == vacancyToTerminate) {
                staffToTerminate = staff;
                break;
            }
        }
        
        // If staff is found, remove it from the list
        if (staffToTerminate != null) {
            Staffes.remove(staffToTerminate);
            JOptionPane.showMessageDialog(frame, "Staff terminated successfully!");
        } else {
            // If no staff found with the given vacancy number
            JOptionPane.showMessageDialog(frame, "No staff found with that vacancy number.");
        }
    } catch (NumberFormatException ex) {
        // Handle case where input is not a valid number
        JOptionPane.showMessageDialog(frame, "Please enter a valid vacancy number.");
    }
}
public void display(){
    String numStr = displayNumberT.getText();
    if (numStr.isEmpty()) {
        JOptionPane.showMessageDialog(frame, "Please enter a display number.");
        return;
    }

    try {
        int index = Integer.parseInt(numStr);

        if (index >= 0 && index < Staffes.size()) {
            Staff_hire staff = Staffes.get(index);

            StringBuilder details = new StringBuilder();
            details.append("Vacancy Number: ").append(staff.getvacancyNumber()).append("\n")
                   .append("Designation: ").append(staff.getdesignation()).append("\n")
                   .append("Job Type: ").append(staff.getjobType()).append("\n");

            if (staff instanceof FullTimeStaffHire) {
                FullTimeStaffHire fts = (FullTimeStaffHire) staff;
                details.append("Staff Name: ").append(fts.getstaffName()).append("\n")
                       .append("Qualification: ").append(fts.getqualification()).append("\n")
                       .append("Appointed By: ").append(fts.getappointedby()).append("\n")
                       .append("Salary: ").append(fts.getsalary()).append("\n")
                       .append("Working Hours: ").append(fts.getweeklyFractionalHours()).append("\n");
            } else if (staff instanceof PartTimeStaffHire) {
                PartTimeStaffHire pts = (PartTimeStaffHire) staff;
                details.append("Staff Name: ").append(pts.getstaffName()).append("\n")
                       .append("Qualification: ").append(pts.getqualification()).append("\n")
                       .append("Appointed By: ").append(pts.getappointedby()).append("\n")
                       .append("Wages per Hour: ").append(pts.wagesPerHours()).append("\n")
                       .append("Working Hours: ").append(pts.workingHour()).append("\n")
                       .append("Shift: ").append(pts.shifts()).append("\n");
            }

            JOptionPane.showMessageDialog(frame, details.toString());

        } else {
            JOptionPane.showMessageDialog(frame, "No staff found at this index.");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
    }
}
}

    

