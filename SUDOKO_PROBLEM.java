package CHAPTER_2;

import java.util.*;
public class SUDOKO_PROBLEM {
	public static boolean isValidSudoku(List<List<Integer>>partialAssignment){
		// Check row constraints.
		for (int i = 0; i < partialAssignment.size(); ++i) {
		if (hasDuplicate(partialAssignment , i, i + 1, 0,partialAssignment.size())){
		return false;
		}
		}
		// Check column constraints.
		for (int j = 0; j < partialAssignment.size(); ++j) {
		if (hasDuplicate(partialAssignment , 0, partialAssignment.size(), j,j+1)) {
		return false;
		}
		}
		// Check region constraints.
		int regionSize = (int)Math.sqrt(partialAssignment.size());
		for (int I = 0 ; I < regionSize; ++I) {
		for (int J = 0 ; J < regionSize; ++J) {
		if (hasDuplicate(partialAssignment , regionSize * I,
		regionSize * (I + 1), regionSize * J,
		regionSize * (J + 1))) {
		return false;
		}
		}
		}
		return true ;
	}
		// Return true if subarray partialAssignment[startRow : endRow - 1][startCol :
		// endCol - 1] contains any duplicates in {1, 2, ...»
		// partialAssignment.size()}; otherwise return false.
		private static boolean hasDuplicate (List <List<Integer>> partialAssignment,
		int startRow, int endRow, int startCol,
		int endCol ) {
		List <Boolean> isPresent = new ArrayList<>(
		Collections . nCopies (partialAssignment . size () + 1, false));
		for (int i = startRow; i < endRow; ++i) {
		for (int j = startCol; j < endCol; ++j) {
		if (partialAssignment . get (i) .get (j) != 0&& isPresent . get (partialAssignment . get (i) . get (j )) ) {
		return true ;
		}
		isPresent . set (partialAssignment .get(i) .get(j) , true);
		}
		}
		return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> x = new ArrayList<List<Integer>>();
		x.add(new ArrayList<Integer>(Arrays.asList(3,1,6,5,7,8,4,9,2)));
		x.add(new ArrayList<Integer>(Arrays.asList(5,2,9,1,3,4,7,6,8)));
		x.add(new ArrayList<Integer>(Arrays.asList(4,8,7,6,2,9,5,3,1)));
		x.add(new ArrayList<Integer>(Arrays.asList(2,6,3,4,1,5,9,8,7)));
		x.add(new ArrayList<Integer>(Arrays.asList(9,7,4,8,6,3,1,2,5)));
		x.add(new ArrayList<Integer>(Arrays.asList(8,5,1,7,9,2,6,4,3)));
		x.add(new ArrayList<Integer>(Arrays.asList(1,3,8,9,4,7,2,5,6)));
		x.add(new ArrayList<Integer>(Arrays.asList(6,9,2,3,5,1,8,7,4)));
		x.add(new ArrayList<Integer>(Arrays.asList(7,4,5,2,8,6,3,1,9)));
		for(int i=0;i<9;i++) 
		{
		System.out.println(x.get(i));
		}
		System.out.println();
		System.out.println( "Is it a valid Sudoku ---> "+(isValidSudoku(x)?"YES VALID SUDOKU":" NOT VALID"));
	}
}
