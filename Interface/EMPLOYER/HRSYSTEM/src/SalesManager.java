public class SalesManager extends SalesRep {
    double salesByTeam;

    public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
            double salary, int yearsWorked, double salesMade, double salesByTeam) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
        this.salesByTeam = salesByTeam;
    }

    // Calculate and print commission based on team's sales
    public double calculateComission() {
       // System.out.println("The manager's commission is: " + 0.03 * salesByTeam);
       return 0.03f*salesByTeam;
    }
}
