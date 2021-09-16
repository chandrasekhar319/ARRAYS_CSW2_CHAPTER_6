package CHAPTER_2;

public class MULTI_DIMENSIONAL_ARRAY1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= { {5,6,7,8}, {4,5,6,7}, {8,9,10,11} };
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(a[i][j]+"   ");
			}
			System.out.println("\n");
		}


	}

}
