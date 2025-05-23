/*
 * This source file was generated by the Gradle 'init' task
 */
package com.example.gradleproject2;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    private static class LeaveBalance {

        public LeaveBalance() {
        }

        private LeaveBalance(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    public class Employee {
    private String name;
    private final double baseSalary;
    private final double allowances;
    private final double deductions;
    private final Leave leave;
    private final LeaveBalance leaveBalance;

    public Employee(String name, double baseSalary, double allowances, double deductions) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.allowances = allowances;
        this.deductions = deductions;
        this.leave = new Leave();
        this.leaveBalance = new LeaveBalance(20); // Assume 20 days starting balance
    }

    public String getDetails() {
        return "Name: " + name + ", Salary: $" + getSalary();
    }

    public String updateDetails(String newName) {
        this.name = newName;
        return "Employee name updated to " + name;
    }

    public String displayProfile() {
        return getDetails();
    }

    public double getSalary() {
        return baseSalary + allowances - deductions;
    }

    public double getAllowances() {
        return allowances;
    }

    public double getDeductions() {
        return deductions;
    }

    public Leave requestLeave() {
        return leave;
    }

    public LeaveBalance getLeaveBalance() {
        return leaveBalance;
    }
}
    public class SalaryCalculator {
    public double calculateNetSalary(Employee employee) {
        return employee.getSalary();
    }

        public double calculateSalary(Employee employee) {
        return employee.getSalary();
    }

        public String generatePayrollReport(Employee employee) {
        return "Payroll Report for " + employee.getDetails();
    }

        public String applyLeaveDeduction(Employee employee, int leaveDays) {
        double dailyRate = employee.getSalary() / 30;
        double deduction = dailyRate * leaveDays;
        return "Leave deduction of $" + deduction + " applied.";
    }
}

}
