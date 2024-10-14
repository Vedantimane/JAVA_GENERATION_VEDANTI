public class Employee {
    String firstName;
    String lastName;
    int registration;
    int age;
    int daysWorked;
    int vacationDaysTaken;
    double salary;
    int yearsWorked;

    public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
            double salary, int yearsWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    // Calculate time left to retirement
    public int timeToRetirement(int age, int yearsWorked) {
        return Math.min(60 - age, 40 - yearsWorked);
    }

    // Calculate vacation time left
    public int vacationTimeLeft(int daysWorked, int vacationDaysTaken) {
        return (daysWorked / 360) * (30 - vacationDaysTaken);
    }

    // Calculate bonus
    public double calculateBonus(double salary) {
        return 2.2 * salary;
    }
}
