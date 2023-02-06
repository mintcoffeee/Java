package while_;

public class DoWhile {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		int a = 0;
		do {
			a++;
			System.out.print(a + " ");
		}while(a<10);
		System.out.println();
		
		// A B C D E F ~~~ X Y Z
		char ch ='A';
		int count = 0;
		do {
			System.out.print(ch + " ");
			ch++;
			
			count++; // 개
			if(count % 7 == 0) System.out.println();
			
		}while(ch<='Z');
		
	}
}
