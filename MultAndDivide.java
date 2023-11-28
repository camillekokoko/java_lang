public class MultAndDivide {
	public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;
    double total = subtotal * (1 + tax);
    double perPerson = total / 4;
    System.out.println(perPerson);
	}
}
