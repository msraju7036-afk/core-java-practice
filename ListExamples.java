import java.util.List;
import java.util.Arrays;
class ListExamples
{
 public static void main(String[] args)
 {
  List<String> names = Arrays.asList("Apple","Banana","Papaya","Mango");
  names.stream().forEach(System.out::println);
 }
}