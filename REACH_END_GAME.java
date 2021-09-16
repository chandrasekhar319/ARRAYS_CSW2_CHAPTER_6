package CHAPTER_2;

import java.util.*;

public class REACH_END_GAME {
	public static boolean canReachEnd(List<Integer> maxAdvanceSteps) {
		int furthestReachSoFar = 0, lastlndex = maxAdvanceSteps.size() - 1;
		for (int i = 0; i <= furthestReachSoFar && furthestReachSoFar < lastlndex;++i) {
		furthestReachSoFar= Math.max(furthestReachSoFar , i + maxAdvanceSteps.get(i));
		}
		System.out.println(furthestReachSoFar);
		return furthestReachSoFar >= lastlndex;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(1);
		a.add(1);
		a.add(4);
		//a.add(0);
		//a.add(1);
		List<Integer>ia=Arrays.asList(3,3,2,1,0,1,1,1);
		System.out.println("The Array is :\n"+ia);
		boolean K=canReachEnd(a);
		System.out.print("Can it reach at the end : ");
		if(K==true)
		{
			System.out.print("YES -->"+K);
		}
		else System.out.print("NO -->"+K);

	}

}
