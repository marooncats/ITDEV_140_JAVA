package ExceptionHandling;

class ShiftSupervisor {
	public static void main(String [] args) {
	}
	
	ProductionWorker p = new ProductionWorker();
	TeamLeader t = new TeamLeader();
	

	double months = 12;
    double annualSalary = p.getIncome() * months;
    double annualBonus = t.getMonthlyBonus() * months;
    

    public void setAnnualSalary(double as){
        annualSalary = as;
    }
    public void setAnnualBonus(double ab){
        annualBonus = ab;
    }
    public double getAnnualSalary(){
        return annualSalary = p.getIncome() * months;
    }
    public double getAnnualBonus(){
        return annualBonus = t.getMonthlyBonus() * months;
    }
}