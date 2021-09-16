package CHAPTER_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PASCAL_TRIANGLE_2 {
	public static List<List<Integer>> generatePascalTriangle (int numRows) {
		List<List<Integer>> pascalTriangle = new ArrayList<>();
		for (int i = 0; i < numRows; ++i)
		{
		List<Integer> currRow = new ArrayList<>();
		for (int j = 0; j <= i ; ++j)
		     {
		currRow.add((0< j  && j < i)? pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j): 1);
		     }
		pascalTriangle.add(currRow);
		}
		return pascalTriangle ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of row : ");
		int a=sc.nextInt();
		List<List<Integer>> k=generatePascalTriangle(a);
		System.out.println("Now The Pascal Value is : "+k.get(a-1));

	}

}
