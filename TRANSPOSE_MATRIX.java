package CHAPTER_2;

import java.util.*;

public class TRANSPOSE_MATRIX {
	public static List<List<Integer>> transpose(List<List<Integer>> s ){
		List <List<Integer>> transpose = new ArrayList<List<Integer>>();
		for(int i=0;i<3;i++)
		{
			for(int j=i+1;j<3;j++)
			{
				int t1=s.get(i).get(j);
				int t2=s.get(j).get(i);
				s.get(i).set(j, t2);
				s.get(j).set(i, t1);
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <List<Integer>> x = new ArrayList<List<Integer>>();
		x.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		x.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
		x.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
		for(int i=0;i<3;i++) 
		{
		System.out.println(x.get(i));
		}
		List <List<Integer>> x1=transpose(x);
		System.out.println("The Transpose is :");
		for(int i=0;i<3;i++) 
		{
		System.out.println(x1.get(i));
		}

	}

}
