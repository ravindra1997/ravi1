package String_Programs;

import java.util.stream.Stream;

public class StreamEx1 {  
    public static void main(String[] args){  
        Stream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(5)  
        .forEach(System.out::println);  
    }  
}  