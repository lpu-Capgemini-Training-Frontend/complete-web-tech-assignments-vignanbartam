package practiceform1;

import java.util.*;
import java.util.stream.*;

public class MainOrder {
	public static void main(String[] args) {
		List<Order> l = new ArrayList<>();
		l.add(new Order(1, "rishi", "footwear", 350000, "hyd", "paid"));
		l.add(new Order(2, "raju", "clothes", 220000, "phg", "unpaid"));
		l.add(new Order(3, "poori", "footwear", 130000, "lud", "paid"));
		l.add(new Order(4, "udaya", "accesory", 50000, "hyd", "unpaid"));
		l.add(new Order(5, "anshul", "footwear", 90000, "hyd", "unpaid"));
		l.add(new Order(6, "tanmay", "clothes", 400000, "lud", "paid"));
		l.add(new Order(7, "anjan", "clothes", 250000, "phg", "paid"));
		l.add(new Order(8, "sohel", "footwear", 59000, "phg", "unpaid"));
		l.add(new Order(9, "jotham", "accesory", 20000, "lud", "paid"));
		l.add(new Order(10, "raju", "clothes", 220000, "phg", "unpaid"));

		// paid order -1
//		l.stream().filter(x  -> x.getStatus().equalsIgnoreCase("paid")).forEach(System.out::println);

		// 2 count all orders
//		long count = l.stream().count();
//		System.out.println(count);

		// 3 find total revenue from paid orders
//		double total = l.stream().map((Order o) -> o.getAmount()).reduce((a, b) -> a+b).orElse(null);
//		System.out.println(total);

		// 4 find the highest value order
//		Order highest = l.stream().max(Comparator.comparingDouble(Order::getAmount)).get();
//		System.out.println(highest);

		// 5 min order
//		Order lowest = l.stream().min(Comparator.comparingDouble(Order::getAmount)).get();
//		System.out.println(lowest);

		// 1 get unique customer names
//		l.stream().map((Order o) -> o.getCustomerName()).distinct().forEach(System.out::println);

		// customers with order above 50000
//		l.stream().filter(x -> x.getAmount()>50000).forEach(System.out::println);

		// sort customers in desc by amount
//		l.stream().sorted(Comparator.comparingDouble(Order::getAmount).reversed()).forEach(System.out::println);

		// top 3 highest order
//		l.stream().sorted(Comparator.comparingDouble(Order::getAmount)).limit(3).forEach(System.out::println);

		// goup order by category
//		Map<String, List<Order>> m = l.stream().collect(Collectors.groupingBy(Order::getCategory));
//		for(String x : m.keySet()) {
//			System.out.println(x + " " + m.get(x));
//		}

		// count orders per catagory;
//		Map<String, Long> m = l.stream().collect(Collectors.groupingBy(Order::getCategory, Collectors.counting()));
//		for(String x : m.keySet()) {
//			System.out.println(x + " " + m.get(x));
//		}

		// total sales per category
		Map<String, Double> m = l.stream().collect(Collectors.groupingBy(Order::getCategory, Collectors.summingDouble(Order::getAmount)));
		System.out.println(m);

		// max order per category
//		Map<String, Optional<Order>> m = l.stream().collect(Collectors.groupingBy(Order::getCategory, Collectors.maxBy(Comparator.comparingDouble(Order::getAmount))));
//		System.out.println(m);

		// average order per category
//		Map<String, Double> m = l.stream().collect(Collectors.groupingBy(Order::getCategory, Collectors.averagingDouble(Order::getAmount)));
//		System.out.println(m);

		// group orders by city
//		Map<String, List<Order>> m = l.stream().collect(Collectors.groupingBy(Order::getCity));
//		for(String s : m.keySet()) {			
//			System.out.println(s + " " + m.get(s));
//		}

//		Map<String, Double> m = l.stream()
//				.collect(Collectors.groupingBy(Order::getCity, Collectors.summingDouble(Order::getAmount)));
//		String a = "";
//		double z = 0;
//		for (String x : m.keySet()) {
//			if (m.get(x) > z) {
//				a = x;
//				z = m.get(x);
//			}
//		}
//		System.out.println(a + " " + z);
		
		
		//partionby status
//		Map<Boolean, List<Order>> m = l.stream().collect(Collectors.partitioningBy((Order o) -> o.getStatus().equals("paid")));
//		System.out.println(m);
		
		
		//second highest
//		l.stream().sorted(Comparator.comparingDouble(Order::getAmount)).skip(1).limit(1).forEach(System.out::println);
		
		
		
		

	}
}
