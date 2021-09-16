package CHAPTER_2;

import java.util.*;

public class RANDOM_PERMUTATION {
	public static List<Integer> computeRandomPermutation(int n) {
		List <Integer> permutation = new ArrayList <>(n) ;
		for (int i = 0; i < n; ++i) {
		permutation . add(i) ;
		}
		SAMPLE_OFFLINE_DATA.randomsampling(permutation . size () , permutation) ;
		return permutation;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=4;
		System.out.println("The Random permutation is : "+computeRandomPermutation(k));

	}

}
