package CHAPTER_2;

import java.util.*;

public class ROTATED_MATRIX {
		private List<List<Integer>> wrappedSquareMatrix ;
		public ROTATED_MATRIX(List<List<Integer>> squareMatrix) {
		this.wrappedSquareMatrix = squareMatrix;
		}
		public int readEntry(int i, int j) {
		return wrappedSquareMatrix.get(wrappedSquareMatrix.size() - 1 - j).get(i);
		}
		public void writeEntry(int i, int j, int v) {
		wrappedSquareMatrix.get(wrappedSquareMatrix.size() - 1 - j).set(i, v);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <List<Integer>> x = new ArrayList<List<Integer>>();
		//x.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
		//x.add(new ArrayList<Integer>(Arrays.asList(5,6,7,8)));
		//x.add(new ArrayList<Integer>(Arrays.asList(9,10,11,12)));
		//x.add(new ArrayList<Integer>(Arrays.asList(13,14,15,16)));
		x.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		x.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
		x.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
		ROTATED_MATRIX  s=new ROTATED_MATRIX(x);
		s.readEntry(0, 0);
		s.writeEntry(0, 0, 4);
		

	}

}
