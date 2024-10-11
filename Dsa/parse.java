public class parse {

    public static void main(String[] args) {
        integerValue(123);

       

        
    }
    public static void integerValue(int value){
        Integer number = Integer.valueOf(value);

        System.out.println(number);
        System.out.println("hashcode: "+number.hashCode());
        System.out.println("double: "+number.doubleValue());
        System.out.println("Float: "+number.floatValue());
        System.out.println("long: "+number.longValue());
        System.out.println("string: "+number.toString());
        System.out.println(number.byteValue());
    }
    public static void longValue(int value){
        Long number = Long.valueOf(value);

        System.out.println(number);
        System.out.println("hashcode: "+number.hashCode());
        System.out.println("double: "+number.doubleValue());
        System.out.println("Float: "+number.floatValue());
        System.out.println("long: "+number.longValue());
        System.out.println("string: "+number.toString());
        System.out.println("byte: "+number.byteValue());
    }

    public static void floatValue(int value){
        Float number = Float.valueOf(value);

        System.out.println(number);
        System.out.println("hashcode: "+number.hashCode());
        System.out.println("double: "+number.doubleValue());
        System.out.println("Float: "+number.floatValue());
        System.out.println("long: "+number.longValue());
        System.out.println("string: "+number.toString());
        System.out.println("Byte: "+number.byteValue());
    }
    public static void stringValue(int value) {
       
        String number = String.valueOf(value);
        System.out.println("String: " + number);
        System.out.println("Hashcode: " + number.hashCode());
        System.out.println("Double: " + Double.parseDouble(number));
        System.out.println("Float: " + Float.parseFloat(number));
        System.out.println("Long: " + Long.parseLong(number));
        System.out.println("Integer: " + Integer.parseInt(number));
        System.out.println("Byte"+Byte.parseByte(number));
        
    }
    
}
