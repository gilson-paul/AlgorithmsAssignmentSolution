package com.greatlearning.service;

public class StockService {
	
	public static void sortArray(double[] stockPrice, int option) {
		MergeSort mgs= new MergeSort();
		mgs.sort(stockPrice, 0, stockPrice.length-1, option);
		for(int i=0;i<stockPrice.length;++i)
			System.out.print(stockPrice[i]+" ");
		System.out.println();
	}
	
	public static int stockIncrDecr(boolean[] stockPriceIncr, boolean b) {

		int count=0;
		for(int i=0;i<stockPriceIncr.length;++i) {
			if(stockPriceIncr[i]==b)
				count++;
		}
		return count;

	}
	
	public static void stockSearch(double stockValue, double[] stockPrice) {
		boolean found=false;
		for(int i=0;i<stockPrice.length;i++)
		{
			if(stockValue == stockPrice[i])
			{
				System.out.println("Stock of value "+stockValue+" is present");
				found=true;
				break;
			}
		}
		if(found==false)
			System.out.println("Value not found");
	}

}
