import java.util.*;

class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A", "B", "C", "D");

        
        Spliterator<String> spliterator = names.spliterator();

        
        Spliterator<String> secondHalf = spliterator.trySplit();

        
        spliterator.forEachRemaining(System.out::println);
        System.out.println("---");
       
        secondHalf.forEachRemaining(System.out::println);
    }
}

/*
OUTPUT:
C
D
---
A
B

public Spliterator<E> spliterator()
Creates a late-binding and fail-fast Spliterator over the elements in this list.
The Spliterator reports Spliterator.SIZED, Spliterator.SUBSIZED, and Spliterator.ORDERED. Overriding implementations should document the reporting of additional characteristic values.

Returns:
a Spliterator over the elements in this list
*/
