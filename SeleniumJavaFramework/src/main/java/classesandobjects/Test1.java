package classesandobjects;

public class Test1 {
	static void addition( int x, int y) {
		int result;
		result = (x + y);
		System.out.println(result);
	}

	static void Subtraction(int x, int y) {
		int result;
		result = (x - y);
		System.out.println(result);
	}

	static void multiply( int x, int y) {
		int result;
		result = (x * y);
		System.out.println(result); 
	}

	static void Division( int x, int y) {
		int result;
		result = (x/y);
		System.out.println(result);
	}


	public static void main(String[] args) {
		addition(10, 10);
		Subtraction(30,20);
		multiply(20, 20);
		Division(40,20);
	}

}
