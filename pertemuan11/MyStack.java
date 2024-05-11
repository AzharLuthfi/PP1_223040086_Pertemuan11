package pertemuan11;

public class MyStack extends AbstractStack {
	//LATIHAN 2 POSFIX
	public MyStack (int capacity) {
		super(capacity);
	}
	
	public void displayStack(String s) {
		System.out.println(s);
		System.out.println("Stack (bottm-->): ");
		for (int i = 0; i < size(); i++) {
			System.out.println(peekN(i));
			System.out.println(' ');
		}
	}

	private int peekN(int n) {
		return arr[n];
	}
	
}
