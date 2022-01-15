package day31_PracticeTask;

public class SalaryCalculator {
    public int hourlyRate;
    public double stateTaxRate;
    public double federalTax;
    public int weeklyHours;


    public SalaryCalculator(int hourlyRate, double stateTaxRate, double federalTax, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTax = federalTax;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }
    public double stateTax(){
        return salary()*stateTaxRate/100;

    }
    public double federalTax(){
        return salary()*federalTax/100;
    }

    public double salaryAfterTax(){
        return salary()-(stateTax()+federalTax());
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary= $" + salary()+
                ", stateTax=" + stateTax()+
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=$ " + salaryAfterTax() +
                '}';
    }
}

/*1. SalaryCalculator Task:
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