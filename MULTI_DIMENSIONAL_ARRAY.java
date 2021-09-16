package CHAPTER_2;

import java.util.*;
public class MULTI_DIMENSIONAL_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
		
		x.add(new ArrayList<Integer>());
		x.get(0).add(0,4);
		x.get(0).add(1,5);
		x.add(new ArrayList<Integer>(Arrays.asList(3,4,5,6)));
		x.add(new ArrayList<Integer>(Arrays.asList(7,8,9,10)));
		System.out.println(x);

	}

}
