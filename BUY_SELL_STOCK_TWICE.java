package CHAPTER_2;

import java.util.*;

public class BUY_SELL_STOCK_TWICE {
	public static double buyAndSellStockTwice(List<Double> prices) {
		double maxTotalProfit = 0.0;
		List<Double> firstBuySellProfits = new ArrayList<>();
		double minPriceSoFar = Double.MAX_VALUE ;
		for (int i = 0; i < prices.size(); ++i) {
		minPriceSoFar = Math.min(minPriceSoFar , prices.get(i));
		maxTotalProfit = Math.max(maxTotalProfit , prices.get(i) - minPriceSoFar);
		firstBuySellProfits.add(maxTotalProfit);
		}
		System.out.println("The MIN Price is :"+minPriceSoFar);
		double maxPriceSoFar = Double.MIN_VALUE ;
		for (int i = prices.size() - 1; i > 0; --i) {
		maxPriceSoFar = Math.max(maxPriceSoFar , prices.get(i));
		maxTotalProfit= Math.max(maxTotalProfit , maxPriceSoFar - prices.get(i)+ firstBuySellProfits.get(i - 1));
		}
		System.out.println("The MAX Price is :"+maxPriceSoFar);
		return maxTotalProfit ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> a=new ArrayList<Double>();
		a.add(12.0);
		a.add(11.0);
		a.add(13.0);
		a.add(9.0);
		a.add(12.0);
		a.add(8.0);
		a.add(14.0);
		a.add(13.0);
		a.add(15.0);
		System.out.println("The Array is :"+a);
		double k=buyAndSellStockTwice(a);
		System.out.println("The MAX Profit is :"+k);

	}

}
