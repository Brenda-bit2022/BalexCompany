/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coursework.balexcompanyvu;

/**
 *
 * @author My PC
 */
    
    public class BalexCompanyVU {
    private static final double MINIMUM_WAGE = 8.00;
    private static final int MAX_HOURS = 60;
    private static final int REGULAR_HOURS = 40;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    public void calculatePay(double basePay, int hoursWorked) {
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay is below the minimum wage.");
            return;
        }

        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked exceed the maximum limit.");
            return;
        }

        double totalPay;
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = basePay * hoursWorked;
        } else {
            int overtimeHours = hoursWorked - REGULAR_HOURS;
            totalPay = (basePay * REGULAR_HOURS) + (basePay * OVERTIME_MULTIPLIER * overtimeHours);
        }

        System.out.printf("Total pay for %.2f base pay and %d hours worked is: $%.2f%n", basePay, hoursWorked, totalPay);
    }

    public static void main(String[] args) {
        BalexCompanyVU company = new BalexCompanyVU();

        company.calculatePay(7.50, 35); 
        company.calculatePay(8.20, 47);  
        company.calculatePay(10.00, 73);
    }
}
  
    

