class HelloTest{
	public static void main(String[] args){
				System.out.println("안녕하세요\n");
				System.out.println("반갑습니다\n");
				System.out.println(25 + 3 + "\n");
				System.out.println("25 + 3\n");
				System.out.println("25" + "3\n"); // 문자열의 + 는 결합
				System.out.println("25 + 3 = " + 25 + 3);	// 25 + 3 = 253
											//"25 + 3 = 25", 연산자 우선순위에 의해 str과 int 문자가 먼저 결합 
				System.out.println("25 + 3 = " + (25 + 3));
				System.out.println("25 / 3 = " + (25 / 3)); // 정수 / 정수 = 정수
				System.out.println("25 / 3 = " + (25.0 / 3)); // 실수 / 정수 = 실수
				System.out.println("25 / 3 = ", String.format("%4.2f", 25.0 / 3)); // 소수 이하 둘째자리 까지
				System.out.println("25 / 3 = ", String.format("%.2f", 25.0 / 3)); // 전체자리수는 무시해도 된다.
	}

}