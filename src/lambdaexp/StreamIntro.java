package lambdaexp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntro {
	public static void main(String[] args) {
		//1.
//		List<Integer>numberList =  Arrays.asList(12,23,11,19,55,16,27,32);
//		Stream<Integer>nStream=numberList.stream();
//		nStream.forEach((e)->System.out.println(e));
		
		//2.
//		IntStream numberStream = IntStream.of(12,23,11,19,55,16,27,32);
//		numberStream.forEach((e)->System.out.println(e));
		
		//3.
//		Stream.Builder<String>streamBuilder=Stream.builder();
//		streamBuilder.add("Router");
//		streamBuilder.add("switch");
//		streamBuilder.add("cables");
//		streamBuilder.add("BTS");
//		streamBuilder.add("BSC");
//		Stream stream = streamBuilder.build();
//		stream.forEach((e)->System.out.println(e));
		
//		//4.
		List<String>namelist=Arrays.asList("peter","sam","erric","mathew","bo","li","dan");
		
		Stream<String>nameStream=namelist.stream();
		//nameStream.filter((e)->e.length()>=3).forEach((e)->System.out.println(e));
//		//nameStream.map((e)->e.toUpperCase()).forEach((e)->System.out.println(e));
//		
		nameStream.filter((e)->e.length()>=3).map((e)->e.toUpperCase())
		.forEach((e)->System.out.println(e));
}
}
