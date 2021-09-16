package CHAPTER_2;

import java.util.*;

public class E_PRIME1 {
	public static List<Integer> generatePrimes(int n){
		final int size = (int)Math.floor(0.5 * (n - 3)) + 1;
		List<Integer> primes = new ArrayList<>();
		primes.add(2);
		List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(size , true));
		for (int i = 0; i < size; ++i)
		{
		if(isPrime.get(i)){
		int p = ((i * 2) + 3);
		primes.add(p);
		for (long j = ((i *i)*2)+6*i + 3;j< size; j += p)
		{
		isPrime.set((int)j, false);
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
