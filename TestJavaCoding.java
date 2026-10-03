import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Set;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;



class TestJavaCoding
{
 public static void main(String[] args)
 {
  List<Integer> numbers = Arrays.asList(10,100,20,30,40,50,60,70,80,90,100,90);
  Integer maxNum = numbers.stream().sorted((a,b)->a.compareTo(b)).skip(2).findFirst().get();
  Integer maxNumNormal = numbers.stream().max((a,b)->b.compareTo(a)).get();

  Set<Integer> set = numbers.stream().collect(Collectors.toSet());
  System.out.println(set);

  numbers.stream().distinct().forEach(e->System.out.print(e+","));

  Map<Integer, Long> map = numbers.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
  map.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).forEach(e->System.out.println("duplicate elements are : "+e));
  map.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).forEach(e->System.out.println("non duplicate elements are : "+e));


  System.out.println(maxNum);
  System.out.println(maxNumNormal);

  List<String> names = Arrays.asList("Anil weds Navya","madhu","Raju","Tiger","Lavanya","sravani");
  names.stream().filter(e->e.contains("av")||e.contains("av")).forEach(System.out::println);
  

  LocalDate ld = LocalDate.of(2026,8,12);
  System.out.println(ld);
  LocalDate currentDate = LocalDate.now();
  System.out.println(currentDate);
  
  LocalDateTime currentDateTime = LocalDateTime.now();
  System.out.println(currentDateTime);

  String name = "2133M!@# Sraju 342";
 
  HashSet<String> hashSet = new HashSet<String>();
  hashSet.add("rama");  hashSet.add("ranga");  hashSet.add("ramki");
  System.out.println(hashSet);

  HashMap<Integer, String> hashMap = new HashMap<Integer,String>();
  hashMap.put(1,"venu");hashMap.put(2,"venkat");hashMap.put(3,"vemana");hashMap.put(4,"venkatesh");
  System.out.println("updated 3 element = "+hashMap.put(3,"venumalai"));
  System.out.println(hashMap);
  System.out.println("map size = "+hashMap.size());
 // hashMap.clear();
  System.out.println("map size = "+hashMap.size());
  if(hashMap.containsKey(1)){
   System.out.println(hashMap);
  }


//  String rep = String.replace([^a-z,A-Z],"");
//  System.out.println(rep);

   List<Integer> list = new ArrayList<Integer>();

   list.addAll(numbers);
   System.out.println(list);

 }
}
