package day31_Constructors;

public class salaryCalculator {

    public double hourlyRate,stateTaxRate,federalTaxRate,weeklyHours;

    public salaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }



    public double salary(){
       return hourlyRate * weeklyHours * 52;

    }

    public double totalStateTax(){
        return salary() * stateTaxRate / 100 ;
    }

    public double totalFederalTax(){
        return salary() * federalTaxRate /100;
    }

    public double salaryAfterTax(){
        return salary() - (totalStateTax()+totalFederalTax());
    }

    public String toString() {
        return "salaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary= $"+ salary()  +
                ", stateTax= $"+ totalStateTax()  +
                ", federalTax= $"+ totalFederalTax() +
                ", salaryAfterTax= $"+ salaryAfterTax() +
                '}';
    }
}
/*SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */