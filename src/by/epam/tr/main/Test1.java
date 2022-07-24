package by.epam.tr.main;

public class Test1 {
	private int term1;
	private int term2;

	public Test1() {
		term1 = 5;
		term2 = 8;
	}

	public Test1(int _term1, int _term2) {
		term1 = _term1;
		term2 = _term2;
	}

	public void print() {
		System.out.println("term1= " + term1);
		System.out.println("term2 = " + term2);
	}

	public void change() {
		System.out.println("In change term1= " + term1 + " term2 = " + term2);
		term1++;
		term2--;
		System.out.println("After change term1 = " + term1 + " term 2 = " + term2);
		return;
	}

	public void summa() {
		int sum;
		sum = term1 + term2;
		System.out.println(term1 + "+" + term2 + "=" + sum);
	}

	public void maximum() {
		int max;
		if (term1 > term2) {
			max = term1;
			System.out.println("Max = " + max);
		}
		if (term1 < term2) {
			max = term2;
			System.out.println("Max = " + max);
		}
		if (term1 == term2) {
			System.out.println("Values ​​equal");
		}
	}
}
