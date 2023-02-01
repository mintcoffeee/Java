class NumberTest {
			public static void main(String[] args) {
						System.out.println(2 + 3);
						System.out.println('2' + '3'); // 101
						System.out.println("2" + "3"); // 23
						System.out.println('A' + 32); // 97

						System.out.println((char)('A' + 32)); // a, Cast연산(강제형변환)
						System.out.println(('2'- 48) + ('3'- 48)); // 문자 -> 숫자 변환, 5

						System.out.println(Integer.parseInt("2") + Integer.parseInt("3")); // 문자열 -> 숫자, 5

						System.out.println("25 / 6 = " + (25.0 / 6));
						System.out.println("25 / 6 = " + Double.parseDouble("25.0") / Integer.parseInt("6"));
						System.out.println("25 / 6 = " + String.format("%4.2f",Double.parseDouble("25.0") / Integer.parseInt("6")));
			}
}