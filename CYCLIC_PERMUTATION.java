package CHAPTER_2;

import java.util.*;

public class CYCLIC_PERMUTATION {
	public static void applyPermutation(List <Integer> perm, List<Character> A) {
		for (int i = 0; i < A.size(); ++i) {
		// Traverses the cycle to see if i is the minimum element.
		boolean isMin = true;
		int j = perm.get(i);
		while (j != i) {
		if (j < i) {
		isMin = false;
		break ;
		}
		j = perm. get (j) ;
		}
		if (isMin) {
		cyclicPermutation(i , perm, A);
		}
		}
		}
		private static void cyclicPermutation(int start, List <Integer > perm,List <Character > A) {
		int i = start;
		char temp = A . get (start) ;
		do {
		int next1 = perm.get(i);
		char nextTemp = A .get (next1) ;
		A.set(next1, temp);
		i = next1 ;
		temp = nextTemp;
		} while (i != start) ;

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A=new ArrayList<Integer>();
		A.add(3);
		A.add(1);
		A.add(2);
		A.add(0);
		System.out.println("The permutate ArrayList is :\n"+A);
		List<Character> B=new ArrayList<Character>();
		B.add('w');
		B.add('x');
		B.add('y');
		B.add('z');
		System.out.println("The 2nd ArrayList is :\n"+B);
		applyPermutation(A,B);
		System.out.println("The final permutation Array is :"+B);

	}

}
