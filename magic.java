public class Magic {
	public static void main(String[] args) {
    // original number
    int myNumber = 10; 
    int magicNumber = myNumber * myNumber;
    magicNumber += myNumber;
		magicNumber /= myNumber;
    magicNumber += 17;
    magicNumber -= myNumber;
    magicNumber /= 6;
    System.out.println(magicNumber);
	}
}
