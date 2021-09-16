package CHAPTER_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SUDOKO_PROBLEM1 {
	
	public static boolean isValidSudoku(List<List<Integer>> partialAssignment) {
		// Check row constraints.
		for (int i = 0; i < partialAssignment.size(); ++i) {
			if (hasDuplicate(partialAssignment, i, i + 1, 0, partialAssignment.size())) {
				return false;
			}
		}

		// Check column constraints.
		for (int j = 0; j < partialAssignment.size(); ++j) {
			if (hasDuplicate(partialAssignment, 0, partialAssignment.size(), j, j + 1)) {
				return false;
			}
		}

		// Check region constraints.
		int regionSize = (int) Math.sqrt(partialAssignment.size());
		for (int I = 0; I < regionSize; ++I) {
			for (int J = 0; J < regionSize; ++J) {
				if (hasDuplicate(partialAssignment, regionSize * I, regionSize * (I + 1), regionSize * J,
						regionSize * (J + 1))) {
					return false;
				}
			}
		}

		return true;
	}

	private static boolean hasDuplicate(List<List<Integer>> partialAssignment, int startRow, int endRow, int startCol,
			int endCol) {
		List<Boolean> isPresent = new ArrayList<>(Collections.nCopies(partialAssignment.size() + 1, false));
		for (int i = startRow; i < endRow; ++i) {
			for (int j = startCol; j < endCol; ++j) {
				if (partialAssignment.get(i).get(j) != 0 && isPresent.get(partialAssignment.get(i).get(j))) {
					return true;
				}
				isPresent.set(partialAssignment.get(i).get(j), true);

			}
		}

		return false;
	}

	public static boolean SUDOKU(List<List<Integer>> x) {
		List<Integer> ra = Unassigned(x);
		if (ra.get(0) == -1) {
			return true;
		}

		int row = ra.get(0);
		int col = ra.get(1);

		for (int num = 1; num <= 9; num++) {
			if (isValidSudoku(x)) {

				x.get(row).set(col, num);
				boolean check = SUDOKU(x);
				if (check == true) {
					return true;
				}
				x.get(row).set(col, 0);

			}
		}
		return false;
	}

	public static List<Integer> Unassigned(List<List<Integer>> arr) {

		List<Integer> ra = new ArrayList<>();
		ra.add(-1);
		ra.add(-1);
		for (int row = 0; row < arr.size(); row++) {
			for (int col = 0; col < arr.size(); col++) {
				if (arr.get(row).get(col) == 0) {
					ra.set(0, row);
					ra.set(1, col);
					return ra;
				}
			}
		}

		return ra;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> x = new ArrayList<List<Integer>>();
		x.add(new ArrayList<Integer>(Arrays.asList(5, 3, 0, 0, 7, 0, 0, 0, 0)));
		x.add(new ArrayList<Integer>(Arrays.asList(6, 0, 0, 1, 9, 5, 0, 0, 0)));
		x.add(new ArrayList<Integer>(Arrays.asList(0, 9, 8, 0, 0, 0, 0, 6, 0)));
		x.add(new ArrayList<Integer>(Arrays.asList(8, 0, 0, 0, 6, 0, 0, 0, 3)));
		x.add(new ArrayList<Integer>(Arrays.asList(4, 0, 0, 8, 0, 3, 0, 0, 1)));
		x.add(new ArrayList<Integer>(Arrays.asList(7, 0, 0, 0, 2, 0, 0, 0, 6)));
		x.add(new ArrayList<Integer>(Arrays.asList(0, 6, 0, 0, 0, 0, 2, 8, 0)));
		x.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 4, 1, 9, 0, 0, 5)));
		x.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 8, 0, 0, 7, 9)));
		for(int i=0;i<9;i++) 
		{
		System.out.println(x.get(i));
		}
		System.out.println();
		System.out.println( "Is it a valid Sudoku ---> "+(isValidSudoku(x)?"VALID SUDOKU":" NOT VALID"));
		SUDOKU(x);
		for(int i=0;i<9;i++) 
		{
		System.out.println(x.get(i));
		}
		System.out.println();
	}

}
