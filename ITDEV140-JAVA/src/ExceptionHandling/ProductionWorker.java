package ExceptionHandling;

class ProductionWorker extends Employee{
	public static void main(String [] args) {
	}
	
    private int shift;
    @SuppressWarnings("unused")
	private double payRate, hoursWorked, income, monthlyIncome;
	
	
    public void setShift(int shifts){
        if(shifts!=1 && shifts!=2){
            System.out.println("Invalid shift. Exiting program..");
            System.exit(0);
        }
        shift = shifts;
    }
    	public void setPayRate(double pr){
        payRate = pr;
    	}
    	
    	public void setHoursWorked(double h) {
    	hoursWorked = h;
    	}
    	
    	public void setIncome(double i) {
    	income = i;
    	}
    	
    	public void setMonthlyIncome (double mi) {
    		monthlyIncome = mi;
    	}
    	
    	public int getShift(){
        return shift;
    	}
    	
    	public double getPayRate(){
        return payRate;
    	}
    	
    	public double getHoursWorked() {
    		return hoursWorked;
    	}
    	
    	public double getIncome() {
    		return income = hoursWorked * payRate;
    	}
    	
    	public double getMonthlyIncome() {
    		return monthlyIncome = income * 4;
    	}
}