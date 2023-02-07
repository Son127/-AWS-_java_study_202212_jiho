package j24_람다;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda2 {

	public static void main(String[] args) {

		// 1. Runnable - run()
		Runnable a = () -> System.out.println("실행"); // 하나일 경우 중괄호 생략
		Runnable b = () -> { // 명령이 여려개일 경우 중괄호로 감싸주어야 함
			System.out.println("여");
			System.out.println("러");
			System.out.println("명");
			System.out.println("령");
			System.out.println("실");
			System.out.println("행");
		};
		a.run();
		b.run();

		// 2. Supplier<T> - T get() 메소드 = return이 있다 매게변수없음
		Supplier<LocalDate> c = () -> LocalDate.now();
		Supplier<String> d = () -> {
			LocalDate now = LocalDate.now();
			return now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")); // 소문자 y는 년도 대문자 m은 월 소문자 d는 일자
		};
		System.out.println(c.get());
		System.out.println(d.get());

		// 3.Consumer<T> - void accept(T t) 매게변수를 받아서 처리만 해줌
		Consumer<String> e = name -> {
			System.out.println("이름 : " + name);
			System.out.println("오늘날짜: " + d.get());
		};
		e.accept("이종현");

		// 메소드 참조 표현식 ([인스턴스] :: [메소드명 또는 new])
		Consumer<String> f = System.out::println;
		f.accept("출력");

		List<String> names = new ArrayList<>();
		names.add("aaa");
		names.add("bbb");
		names.add("ccc");
		names.add("ddd");

		Consumer<String> g = name -> System.out.println("이름: " + name + "!");
		names.forEach(g);
		// 위 실행문 변환
		// names.forEach(name -> System.out.println("이름: " + name + "!"));

		/*
		 * //this == names accept -> Consumer default void forEach(Consumer<? super T>
		 * action) { Objects.requireNonNull(action); for (T t : this) {
		 * action.accept(t); } }
		 */

		names.forEach(name -> {
			System.out.println("이름울 츨력합니다");
			System.out.println("이름: " + name);
			System.out.println();
		});

		// map forEach 람다식변환
		Map<String, String> userMap = new HashMap<>();
		userMap.put("username", "aaa");
		userMap.put("password", "12345");

		userMap.forEach((key, values) -> {
			System.out.println("key: " + key); 
			System.out.println("values: " + values);
			System.out.println();
		});
		// map forEach
//		for(Entry<String, String> entry : userMap.entrySet()) {
//			System.out.println("key: " + entry.getKey());
//			System.out.println("values: " + entry.getValuse());
//			System.out.println();
//		}

		DoubleUnaryOperator oper;

		oper = Math::abs;//
		System.out.println(oper.applyAsDouble(6));

		
		//4. Function<T, R>
		
		
		Function<String, Integer> h =  num -> Integer.parseInt(num);
		
		int covertStrNum1 = h.apply("10000");
		int covertStrNum2 = h.apply("20000");
		
		System.out.println(covertStrNum1 + covertStrNum2);
		
		//5. Predicate<T>
		
//		Predicate<String> p = str -> str.startsWith("김");
//		Predicate<String> p2 = str -> str.startsWith("이");
		
		Function<Predicate<String>, Boolean> function =
				predicate -> predicate.or(str -> str.startsWith("이")).test("김준일"); 
		
//		System.out.println(p.or(p2).test("이준일"));
		
		boolean rs = function.apply(str -> str.startsWith("김"));
		
		System.out.println(rs);
		
		List<String> nameList = new ArrayList<>();
		nameList.add("김");
		nameList.add("김환");
		nameList.add("김종환");
		nameList.add("김종환김");
		
		//스트림 -> 일회용 
		Stream<String> stream = nameList.stream().filter(name -> name.startsWith("김")); // stream객체 생성
		stream.forEach(name -> System.out.println(name));
		
		Stream<String> streams = nameList.stream().filter(name -> name.startsWith("김")); 
		List<String> newList = streams.collect(Collectors.toList());
		
		System.out.println(newList);
		
		nameList.stream()
			.filter(name -> name.startsWith("김"))
			.collect(Collectors.toList())
			.forEach(name -> System.out.println(name));
//			.forEach(System.out::println); 위에 코드랑 같음 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
