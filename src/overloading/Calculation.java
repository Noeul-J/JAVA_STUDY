package overloading;

// 클래스에 같은 이름의 메서드가 여러 개 존재
class Calc{
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a) {
		return a+1;
	}
	
	double add(double a, double b) {
		return a+b;
	}
}

public class Calculation {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		int nReturn1 = calc.add(3,9);
		int nReturn2 = calc.add(3);
		double nReturn3 = calc.add(3.0, 9.0);
		
		System.out.println("Return1: " + nReturn1);
		System.out.println("Return2: " + nReturn2);
		System.out.println("Return3: " + nReturn3);
	}
}
