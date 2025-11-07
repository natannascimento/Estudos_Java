import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .toList();
    
        upperCaseNames.forEach(System.out::println);
        
    }
}
