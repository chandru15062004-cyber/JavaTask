package org.jdbc;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8 {
	public static void main(String[] args) {
		Consumer<String> N = Name -> System.out.println("Name is :" + Name);
		N.accept("Chandru");
		Predicate<Integer> I = Number -> Number % 2 == 0;
		System.out.println("Is 13  even: " + I.test(13));
		// Lambda using Array Methods
		// Filter::-------------------------------------
		List<Integer> Arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 643, 43, 88);
		System.out.println("Numbers Divided by 4:");
		Arr.stream().filter(n -> n % 4 == 0).forEach(System.out::println);
		// Map::-----------------------------------------
		List<Integer> Str = Arrays.asList(2, 3, 4, 3, 54, 5);
		Str.stream().map(s -> s * 3).collect(Collectors.toList());
		System.out.println(Str);
		// Reduce::--------------------------------------
		List<Integer> SS = Arrays.asList(32, 34, 5, 324, 54, 42);
		int DD = SS.stream().reduce(0, (c, f) -> c + f);
		System.out.println("Addition of all numbers:" + DD);
		//Name filter Examples::-------------------------
		List<String> Aa=Arrays.asList("Remo","Samuel","Sandy","Defalco","Torey");
		List<String> Mantion=Aa.stream().filter(namesd->namesd.startsWith("S")).collect(Collectors.toList());
		System.out.println(Mantion);
		//Count names which is length>4::----------------
		long count=Aa.stream().filter(gg->gg.length()>4).count();
		System.out.println("Number of names the legth>4:"+count);
		//Sort the names using lambda function::---------
		System.out.println("Sorted names:******----*****");
		Aa.stream().sorted((a,b)->a.compareTo(b)).forEach(System.out::println);
	}
}
