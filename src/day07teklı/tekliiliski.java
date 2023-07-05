package day07tekli;

public class tekliiliski {
    public static void main(String[] args) {

        int hourlyRate = 60 ,
                weeklyHours = 50 ;
        double stateTaxRate = 0.2 ,
                federalTaxRate = 25.5 ;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax  );
        System.out.println("State tax = $" + stateTax);
        System.out.println("Federal tax = $" + federalTax );
        System.out.println("Total tax = $" +totalTax );
        System.out.println("Net income = $"+salaryAfterTax);

    }
}
