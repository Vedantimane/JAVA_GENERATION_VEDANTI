public class SalesRep extends Employee {
    private double salesMade;

    public SalesRep(String firstName,
                 String lastName, 
                 int registration, 
                 int age, 
                 int daysWorked, 
                 int vacationDaysTaken,
                 double salary, 
                 int yearsWorked, 
                 double salesMade) 
    {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
        this.salesMade = salesMade;
    }

      // Getter for salesMade
      public double getSalesMade() {
        return salesMade;
    }

    // Calculate commission based on sales made
    public double calculateComission() {
        return 0.1 * salesMade; // Return 10% commission of the total sales made
    }
}

