
public class Newton_square_algorithm {

	public static void main(String[] args) {

		double a = 9;
		double r = (1 + a) / 2;
		
		while (r * r != a) {
			r = (r + (a / r)) / 2;
		}
		System.out.println(r);
	}
}
