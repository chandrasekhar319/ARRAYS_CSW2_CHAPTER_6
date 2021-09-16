package CHAPTER_2;

import java.util.*;

public class PERMUTATION_OF_ARRAY {
	public static void applyPermutation(List<Integer> perm, List<Character> A){
		for (int i = 0; i < A.size(); ++i)
		{
		int next = i;
		while (perm.get(next) >= 0)
		{
		Collections.swap(A , i, perm.get(next));
		int temp = perm.get(next);
		perm.set(next , perm.get(next) - perm.size());
		next = temp;
		}
		}
		for (int i = 0; i < perm.size(); i++)               // Restore perm.
		{
		perm.set(i, perm.get(i) + perm.size());
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A=new ArrayList<Integer>();
		A.add(2);
		A.add(0);
		A.add(1);
		A.add(3);
		System.out.println("The 1st ArrayList is :\n"+A);
		List<Character> B=new ArrayList<Character>();
		B.add('a');
		B.add('b');
		B.add('c');
		B.add('d');
		System.out.println("The 2nd ArrayList is :\n"+B);
		applyPermutation(A,B);
		System.out.println("The final permutation Array is :"+B);
		int s=15<<3;
		  System.out.println(s);
		

	}

}
