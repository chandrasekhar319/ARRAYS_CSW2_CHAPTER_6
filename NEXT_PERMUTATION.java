package CHAPTER_2;

import java.util.*;

public class NEXT_PERMUTATION {
	public static List<Integer> nextPermutation(List<Integer> perm) {
		int k = perm.size() - 2;
		while (k >= 0 && perm.get(k) >= perm.get(k + 1))
		{
		--k;
		}
		if (k == -1) {
		return Collections.emptyList(); // perm is the last permutation.
		}
		for (int i = perm.size() - 1; i > k; --i)
		{
		if (perm.get(i) > perm.get(k)) {
		Collections.swap(perm, k, i);
		break ;
		}
		}
		Collections . reverse (perm . subList (k + 1, perm . size ())) ;
		return perm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A=new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(0);
		A.add(3);
		System.out.println("The 1st permutate ArrayList is : "+A);
		List<Integer> B=nextPermutation(A);
		System.out.println("The next permutation is : "+B);

		

	}

}
