package CHAPTER_2;

//Generalizing,supposeA = (0,l,2,0,2,l,l),andthepivotindexis3. ThenA[3] = 0, so (0, 0,1, 2, 2,1,1) is a valid partitioning.
//For the same array, if the pivot index is 2,
//then A[2] = 2, so the arrays (0,1, 0,1,1, 2, 2) as well as langle0,0,1,1,1, 2, 2) are valid partitionings.
//LET 0:RED , 1:WHITE, 2:BLUE
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DUTCH_FLAG_1 {
	public static enum Color { RED , WHITE , BLUE }
	public static void dutchFlagPartition(int pivotlndex, List<Color> A){
		Color pivot = A.get(pivotlndex);
		int smaller = 0;
		for (int i = 0; i < A.size(); ++i){
		if (A.get(i).ordinal() < pivot.ordinal()){
		Collections.swap(A , smaller++, i);
		}
		}
		int larger = A.size() - 1;
		for (int i = A.size() - 1; i >= 0 && A.get(i).ordinal() >= pivot.ordinal();
		--i){
		if (A.get(i).ordinal() > pivot.ordinal()){
		Collections.swap(A , larger--, i);
		}
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pivot_index=2;
		List<Color> e=new ArrayList<Color>();
		e.add(Color.BLUE);
		e.add(Color.RED);
		e.add(Color.WHITE);
		e.add(Color.RED);
		e.add(Color.BLUE);
		e.add(Color.BLUE);
		e.add(Color.WHITE);
		System.out.println("Enter the elements in array:\n"+e);
		dutchFlagPartition(pivot_index,e);
		System.out.println("The Array after executing the DNFS Algorithm is: ");
		System.out.println(e);


	}

}
