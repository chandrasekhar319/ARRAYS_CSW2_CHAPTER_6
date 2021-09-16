package CHAPTER_2;

import java.util.*;

public class SAMPLE_ONLINE_DATA {
	public static List<Character> onlineRandomSample(Iterator<Character> sequence,int k) {
			List<Character> runningSample = new ArrayList<>(k);
			// Stores the first k elements.
			for (int i = 0; sequence.hasNext() && i < k ; ++i)
			{
			runningSample.add(sequence.next());
			System.out.println("i : "+i+" --> next element : "+runningSample);
			}
			// Have read the first k elements.
			int numSeenSoFar = k;
			Random randldxGen = new Random();
			while (sequence.hasNext())
			{
			Character x = sequence.next();
			++numSeenSoFar ;
			System.out.println("\nx : "+x+"\nfar_num : "+numSeenSoFar);
			final int idxToReplace = randldxGen.nextInt(numSeenSoFar);
			System.out.println("random index : "+idxToReplace);
			System.out.print("The subset is : "+runningSample);
			if (idxToReplace < k) 
			{
			runningSample.set(idxToReplace, x);
			System.out.println(" ---> "+runningSample);
			}
			}
			return runningSample ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> A=new ArrayList<Character>();
		A.add('p');
		A.add('q');
		A.add('r');
		A.add('t');
		A.add('u');
		A.add('v');
		int k=2;
		System.out.println("The ArrayList is : "+A+"\nThe value of K : "+k);
		Iterator<Character> s=A.iterator();
		List<Character> B=onlineRandomSample(s,k);
		System.out.println("\nThe resulting array is : "+B);

	}

}
