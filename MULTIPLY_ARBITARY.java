package CHAPTER_2;

import java.util.*;

public class MULTIPLY_ARBITARY {
	public static List <Integer> multiply (List <Integer> numl , List <Integer > num2) {
		final int sign = numl. get (0) < 0 ^ num2.get(0) < 0 ? -1 : 1;
		numl . set (0 , Math . abs (numl .get(0)));
		num2 . set (0 , Math . abs (num2 .get(0)));
		List<Integer > result= new ArrayList <>(Collections . nCopies (numl . size () + num2.size(), 0));
		for (int i = numl.size() - 1; i >= 0; --i) {
		for (int j = num2.size() - 1; j >= 0 ; --j) {
		result . set (i + j + 1 ,
		result. get(i + j + 1) + numl.get(i) * num2 . get ( j ) ) ;
		result.set(i + j, result. get(i + j) + result. get(i + j + 1) / 10);
		result.set(i + j + 1, result. get(i + j + 1) % 10);
		}
		}
		int first_not_zero = 0;
		while (first_not_zero < result . size () && result . get (first_not_zero) == 0) {
		++first_not_zero ;
		}
		result = result . subList (first_not_zero , result . size () ) ;
		if (result . isEmpty () ) {
		return Arrays . asList (0) ;
		}
		result .set (0 , result . get (0) * sign);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A=new ArrayList<Integer>();
		A.add(-1);
		A.add(2);
		A.add(3);
		System.out.println("The 1st Number is :\n"+A);
		List<Integer> B=new ArrayList<Integer>();
		B.add(1);
		B.add(4);
		B.add(8);
		B.add(9);
		B.add(1);
		System.out.println("The 2nd Number is :\n"+B);
		List<Integer> K=multiply(A,B);
		System.out.println("After Multiplication, The Result is :\n"+K);

	}

}
