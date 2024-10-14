package Interface.EMPLOYER.HRSYSTEM.src;
public class App {
    public static void main(String[] args) throws Exception {
        
        SalesRep Sales1 = new SalesRep("Vedanti", "Mane", 10, 25, 730, 25, 30000, 2,"vedanti","12345",30000);
        //System.out.println("individual comision of "+Sales1.firstName+" is  >>>"+Sales1.calculateComission());
        Sales1.profileVisit();
        SalesRep Sales2 = new SalesRep("computer", "Dell", 10, 25, 730, 25, 30000, 2,"comp","1235",30000);
        //System.out.println("individual comision of "+Sales2.firstName+" is  >>>"+Sales2.calculateComission());
        Sales2.profileVisit();
        SalesRep Sales3 = new SalesRep("mane", "Vedanti", 10, 25, 730, 25, 30000, 2,"vmane","12378",30000);
        //System.out.println("individual comision of "+Sales3.firstName+" is  >>>"+Sales3.calculateComission());
        Sales3.profileVisit();

        SalesManager sm = new SalesManager("Joe", "xyz",45, 26, 730, 25, 30000, 2,"Joefull","1211", 10000, Sales1.salesMade+Sales2.salesMade+Sales3.salesMade);
        //sm.calculateTotalComission();
        if(sm.login("Joefull", "1211")){
            sm.profileVisit();
        }
        
    }
}