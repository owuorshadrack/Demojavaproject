public class EmployeeBonus {

    public static void main(String[] args) {
        double salary = 50000; 
        int yearsOfService = 8; 

        double bonusPercentage;

        if (yearsOfService > 10) {
            bonusPercentage = 12;
        } else if (yearsOfService >= 6) {
            bonusPercentage = 10;
        } else {
            bonusPercentage = 8;
        }

        double bonusAmount = (bonusPercentage / 100) * salary;

        System.out.println("Salary: $" + salary);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
        System.out.println("Net Bonus Amount: $" + bonusAmount);
    }
}
