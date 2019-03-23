package java8.stringjoiner;

import java.util.StringJoiner;

public class Java8StringJoiner {

	public static void main(String[] args) {
		
		simpleStringJoin();
		
		stringJoinWithPrefixAndSuffix();
	}

	private static void simpleStringJoin() {
		System.out.println("\nTest 1 - Simple String Join");
		
		StringJoiner strJoiner = new StringJoiner("-");
		
		strJoiner.add("1");
		strJoiner.add("2");
		strJoiner.add("3");
		strJoiner.add("4");
		strJoiner.add("5");
		
		System.out.println(strJoiner);
	}

	private static void stringJoinWithPrefixAndSuffix() {
		System.out.println("\nTest 2 - String Join with prefix and suffix");
		
		StringJoiner strJoiner = new StringJoiner("-", "prefix", "suffix");
		
		strJoiner.add("1");
		strJoiner.add("2");
		strJoiner.add("3");
		strJoiner.add("4");
		strJoiner.add("5");
		
		System.out.println(strJoiner);
	}

}
