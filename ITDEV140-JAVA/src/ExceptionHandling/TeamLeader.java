package ExceptionHandling;

class TeamLeader extends ProductionWorker {
    private double minTrainingHours = 8;
    private double trainingHoursAttended;
    private double bonusAmount = 10;
    double monthlyBonus = trainingHoursAttended * bonusAmount;
    
    public void setMonthlyBonus(double mb){
        monthlyBonus = mb;
    }
    public void setMinTrainingHours(double m){
        minTrainingHours = m;
    }
    public void setTrainingHoursAttended(double a){
        trainingHoursAttended = a;
    }
    
    public void setBonusAmount(double ba) {
    	bonusAmount = ba;
    }
    
    public double getMonthlyBonus(){
        return monthlyBonus = trainingHoursAttended * bonusAmount;
    }
    public double getMinTrainingHours(){
        return minTrainingHours;
    }
    public double getTrainingHoursAttended(){
        return trainingHoursAttended;
    }
    
    public double getBonusAmount() {
    	return bonusAmount;
    }
}