package CHAPTER_2;

import java.util.*;

public class PASCAL_TRIANGLE_1_SIMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coef=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of row : ");
		int row=sc.nextInt();
		System.out.println("Now The Pascal Triangle is : ");
		for(int i=0;i<row;i++)
		{
			for(int s=1;s<row-i;s++)
			{
				System.out.print("   ");
			}
			for(int j=0;j<=i;j++)
			{
				if(j==0 || i==0)
				{
					coef=1;
				}
				else coef=(coef*(i-j+1))/j;
				
				System.out.print(coef+"     ");
			}
			System.out.println();
		}

	}

}
