package ExceptionHandling;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class EmployeeProductionWorker {

    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("$#,###,###.00");
        ProductionWorker p = new ProductionWorker();
        ShiftSupervisor s = new ShiftSupervisor();
        TeamLeader t = new TeamLeader();
        String input;
        
        
        input = JOptionPane.showInputDialog("Enter employee name");
        p.setName(input);
        input = JOptionPane.showInputDialog("Enter "+ input +"'s employee number (XXX-L) " +
        "EX:123-A");
 
        p.setNumber(input);
        input = JOptionPane.showInputDialog("Enter employee hire date (MM/DD/YYYY)");
        p.setHireDate(input);
        input = JOptionPane.showInputDialog("Enter employee shift\n(Day = 1, Night = 2)");
        p.setShift(Integer.parseInt(input));
        input = JOptionPane.showInputDialog("Enter employee's hourly pay rate");
        p.setPayRate(Double.parseDouble(input));
        input = JOptionPane.showInputDialog("Enter employee's average worked hours per week:");
        p.setHoursWorked(Double.parseDouble(input));
        input = JOptionPane.showInputDialog("Enter how many hours employee has had training this month:");
        t.setTrainingHoursAttended(Double.parseDouble(input));
        
        
        System.out.println("Employee name: "+p.getName());
        System.out.println("Employee number: "+p.getNumber());
        System.out.println("Hire date: "+p.getHireDate());
        System.out.print("Shift: ");
        if(p.getShift()==1)
            System.out.println("Day");
        else
            System.out.println("Night");
        System.out.println("Salary: "+ d.format(p.getPayRate()) + "/hour");
        System.out.println("Hours Worked Per Week: "+ p.getHoursWorked() + " hours");
        System.out.println("Weekly Income: "+d.format(p.getIncome()));
        System.out.println("Monthly Income: "+d.format(p.getMonthlyIncome()));
        System.out.println("Training Hours Attended Per Month: "+ t.getTrainingHoursAttended() + " hours out of " + 
        			t.getMinTrainingHours() + " training hours required.");
        System.out.println("Monthly Bonus: "+ d.format(t.getMonthlyBonus()));
        System.out.println("Annual Salary: "+ d.format((p.getMonthlyIncome() * 12)));
        System.out.println("Annual Bonus: "+ d.format((t.getMonthlyBonus() * 12)));
        System.out.println("Annual Salary + Bonus: "+ d.format((t.getMonthlyBonus() * 12) + (p.getMonthlyIncome() * 12)));
        System.exit(0);
    }
}
