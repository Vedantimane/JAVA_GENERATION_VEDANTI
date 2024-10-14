public class Express implements DiselEngine, CoalEngine {

   
   public void printEngineDetails() {
        
        System.out.println("Diesel Engine Name: " + DiselEngine.ENGINE_NAME);
        System.out.println("Coal Engine Name: " + CoalEngine.ENGINE_NAME);
    }
}