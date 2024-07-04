import java.util.Date;

public class ReferenceTypes {

    public static void main(String[] args) {

        // Reference types are different from the primitive ones
        // We need to allocate memory for this primitive types but freeing of the memory is taken care of by the garbage collector
        // Reference types are always allocated on the heap
        // The garbage collector is responsible for freeing the memory when it is not used anymore
        // It is important

        // example

        // <type> <variable>  = new <Type>()
        // This creates a new instance of the type, thus allocating new memory.
        // The newly created object can have members, but the primitive types cannot.

        Date now = new Date(); // gets the current date.
        System.out.println(now);

    }
}
