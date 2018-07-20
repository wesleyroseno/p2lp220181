package recursividade;

public class mdc {
	public static void main(String[] args) {
		int m = 13;
		int n = 2;
		int r = mdc(m, n);
		System.out.println("mdc(" + m + ", " + n + ") = " + r);
	}

	private static int mdc(int m, int n) {
		int r = m % n;
		if(r == 0) return n;
		return mdc(n, r);
	}

}
