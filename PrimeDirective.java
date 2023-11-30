import java.util.ArrayList;

class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int number) {
    if (number <= 1) {
      return false; // Numbers less than or equal to 1 are not prime
    }

    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false; // If the number is divisible by any integer in the range [2, sqrt(number)], it's not prime
      }
    }
    return true; // If the loop completes without finding a divisor, the number is prime
  }

  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primeNumbers = new ArrayList<>();

    for (int number : numbers) {
      if (isPrime(number)) {
        primeNumbers.add(number);
      }
    }

    return primeNumbers;
  }
  
  public static void main(String[] args) {
    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    
    ArrayList<Integer> primes = pd.onlyPrimes(numbers);

    System.out.println("Prime numbers: " + primes);
  }  
}
