package Int;

public class Test {
	
	public static void main(String[]args) {
		System.out.print(powerOfTwo(2,3));
	}
	
	public static int powerOfTwo(int b, int p) {
		int res = 1;
		for(int i=1;i<=p;i++) {
			res = res * b;
		}
		return res;
	}

}
