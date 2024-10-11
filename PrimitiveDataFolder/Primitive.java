public class Primitive {
    // Declare primitive data types
    int i;
    float f;
    double d;
    char c;
    boolean bl;
    byte b;
    short s;
    long l;

    public static void main(String[] args) {
        Primitive primitive = new Primitive();
        
        // Print default values of primitive data types
        System.out.println("Default value of int: " + primitive.i);
        System.out.println("Default value of float: " + primitive.f);
        System.out.println("Default value of double: " + primitive.d);
        System.out.println("Default value of char: " + primitive.c + "-");
        System.out.println("Default value of boolean: " + primitive.bl);
        System.out.println("Default value of byte: " + primitive.b);
        System.out.println("Default value of short: " + primitive.s);
        System.out.println("Default value of long: " + primitive.l);
    }
}
