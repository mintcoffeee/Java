package multi_;

public class MultiFor02 {
	
	public static void main(String[] args) {
		int dan, i;
		for(dan=2; dan<10; dan++) {
		// ';'을 처음 for문 바로 뒤에 붙이면 dan이 10이 될때까지 for문 반복 for j 에서 10단이 나온다.
			for(i=1; i<10; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			}//for i
			System.out.println();
		}//for dan
	}

}

/*
[문제] 2단 ~ 9단

2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18

3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27


*/