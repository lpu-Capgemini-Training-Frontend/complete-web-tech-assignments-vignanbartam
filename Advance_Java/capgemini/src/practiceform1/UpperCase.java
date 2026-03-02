package practiceform1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.*;

public class UpperCase {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("rishi", "raju", "rishi","poori", "udaya", "jotham", "sohel");
//		ls.stream().filter(x -> x.startsWith("r")).map(x->x.toUpperCase()).sorted().forEach(System.out::println);
		
		List<Integer> l = Arrays.asList(10, 11, 23, 334, 38, 32, 2, 3, 4);
//		l.stream().filter(x -> x%2==0).map(x -> x *10).forEach(System.out::println); // way1
//		l.stream().map(x -> (x%2==0)?x*10:x).sorted().forEach(System.out::println);  //way2
		
//		ls.stream().map(x -> x.toUpperCase()).sorted().forEach(System.out::println);

//		l.stream().filter(x -> x>7).forEach(System.out::println);
		
//		String x = ls.stream().reduce("", (a, b) -> a+b);
//		System.out.println(x);
		
//		Optional<String> a = ls.stream().filter(x -> x.startsWith("s")).findFirst();
//		System.out.println(a);
		
//		ls.stream().distinct().sorted().forEach(System.out::println);
		
//		String x = ls.stream().reduce((x1, x2) -> (x1.length()>x2.length()) ? x1 : x2).orElse(null);
//		System.out.println(x);
		
		String x = ls.stream().max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println(x);
	}
}
