package CHAPTER_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUY_SELL_STOCK_PRICE {
	public static double computeMaxProfit(List<Double> prices){
		double minPrice = Double.MAX_VALUE , maxProfit = 0.0;
		for (Double price : prices) {
		maxProfit = Math.max(maxProfit , price - minPrice);
		minPrice = Math.min(minPrice , price);
		}
		return maxProfit;
		}
	public static void compute(List<Double> A) {
		for(int i=0;i<A.size();i++)
		{
			for(int j=i+1;j<A.size();j++)
			{
				double x=A.get(i);
			while(x<(A.get(j)))
			{
				A.set(j, A.get(j)-A.get(i));
				A.set(i, 0.0);
				 i=j;
			}
			break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> a=new ArrayList<Double>();
		a.add(310.0);
		a.add(315.0);
		a.add(275.0);
		a.add(295.0);
		a.add(260.0);
		a.add(270.0);
		a.add(290.0);
		a.add(230.0);
		a.add(255.0);
		a.add(250.0);
		System.out.println("The Array is :\n"+a);
		double k=computeMaxProfit(a);
		System.out.println("The MAX Profit is :"+k);
		compute(a);
		System.out.println(a);

	}

}
