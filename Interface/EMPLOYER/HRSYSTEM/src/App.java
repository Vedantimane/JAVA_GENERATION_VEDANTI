
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Employee E1 = new Employee("Ranjan", "Banarji", 10, 30, 2500, 10, 25000.3, 6);
        System.out.println("hello "+E1.firstName+" "+E1.lastName);
        System.out.println(" your Time to retire "+E1.timeToRetirement(E1.age,E1.yearsWorked));
        SalesRep S1 = new SalesRep("A", "last", 10, 30, 730, 05, 30000, 2, 10000);
        SalesRep S2 = new SalesRep("b", "last", 10, 30, 730, 05, 30000, 2, 20000);
        SalesRep S3 = new SalesRep("C", "last", 10, 30, 730, 05, 30000, 2, 30000);
        

       // Calculate total sales made by the SalesReps
      

       // Create SalesManager object with total sales
       SalesManager SM = new SalesManager("Bhayankar", "SSS", 10, 30, 730, 5, 30000, 2, 30000, (S1.getSalesMade() + S2.getSalesMade() + S3.getSalesMade()));
       
       // Call the calculateComission method to print the manager's commission
       SM.calculateComission(); 
       System.out.println((S1.getSalesMade() + S2.getSalesMade() + S3.getSalesMade()));
    }
}
