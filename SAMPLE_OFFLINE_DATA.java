package CHAPTER_2;

import java.util.*;

public class SAMPLE_OFFLINE_DATA {
	public static void randomsampling(int k, List<Integer> A) {
		List<Integer> s=new ArrayList<Integer>();
		Random gen = new Random ();
		for (int i = 0; i < k; ++i) 
		{
		// Generate a random int in [i, A.size() - 1].
		int r= i + gen . nextInt (A . size () - i);
		System.out.print("Random Number= "+r+" : ");
		Collections . swap (A , i, r);
		s.add(A.get(i));
		System.out.println(s);
		}
		//System.out.println("The resulting array is : "+s);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A=new ArrayList<Integer>();
		A.add(3);
		A.add(7);
		A.add(5);
		A.add(11);
		System.out.println("The ArrayList is : "+A);
		int K=3;
		randomsampling(K,A);
		

	}

}
