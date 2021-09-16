package CHAPTER_2;

import java.util.*;

public class ENUMERATE_ALL_PRIMES {
	public static List<Integer> generatePrimes(int n){
		List<Integer> primes = new ArrayList<>();
		List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n + 1, true));
		isPrime.set(0 , false);
		isPrime.set(1 , false);
		for (int p = 2; p <= n; ++p)
		{
		if(isPrime.get(p))
		{
		primes.add(p);
		for (int j = p; j <= n; j += p)       // Sieve p’s multiples.
		{
		isPrime.set(j, false);
		}
		}
		}
		return primes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int a=sc.nextInt();
		List<Integer> s=new ArrayList<Integer>();
		s=generatePrimes(a);
		System.out.println("The prime numbers are : \n"+s);

	}

}
