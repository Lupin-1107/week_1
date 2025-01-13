import java.util.Scanner;

class Employee {
    double salary;
    double year;

    Employee(double salary, double year) {
        this.salary = salary;
        this.year = year;
    }
}

class EmployeeBonus {
    public static void main(String[] args) {
        Employee[] e = new Employee[10];  // Array to hold employee details
        Scanner sc = new Scanner(System.in);
        double totalBonus = 0.0;
        double totalNewSalary = 0.0;
        double oldSalary = 0.0;

        // Loop to take input for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ":");

            double salary = -1;
            double yearsOfService = -1;

            // Validate salary and years of service inputs
            while (salary <= 0 || yearsOfService < 0) {
                System.out.print("Enter salary (positive number): ");
                salary = sc.nextDouble();
                System.out.print("Enter years of service (non-negative number): ");
                yearsOfService = sc.nextDouble();

                if (salary <= 0 || yearsOfService < 0) {
                    System.out.println("Invalid input. Please enter valid salary and years of service.");
                }
            }

            e[i] = new Employee(salary, yearsOfService);
        }

        double[] bonus = new double[10];  // Array to hold bonus for each employee
        double[] newSalary = new double[10];  // Array to hold new salary after bonus

        // Calculate the bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (e[i].year >= 5) {
                bonus[i] = 0.05 * e[i].salary;  // 5% bonus for employees with >= 5 years of service
            } else {
                bonus[i] = 0.02 * e[i].salary;  // 2% bonus for employees with < 5 years of service
            }

            // Calculate new salary
            newSalary[i] = e[i].salary + bonus[i];

            // Accumulate totals
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
            oldSalary += e[i].salary;
        }

        // Print the results
        System.out.println("\nTotal old salary: " + oldSalary);
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total new salary (after bonus): " + totalNewSalary);

        sc.close();
    }
}
