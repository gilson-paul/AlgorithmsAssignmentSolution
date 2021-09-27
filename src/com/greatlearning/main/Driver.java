package com.greatlearning.main;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfCompanies;

		System.out.println("enter the no of companies");
		noOfCompanies=sc.nextInt();

		double stockPrice[]= new double[noOfCompanies];
		boolean stockPriceIncr[] =  new boolean[noOfCompanies];

		for(int i =0; i< noOfCompanies;++i) {
			System.out.println("Enter current stock price of the company "+(i+1));
			stockPrice[i]=sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			stockPriceIncr[i]=sc.nextBoolean();
		}
		boolean exit=false;

		while(exit==false) {
			System.out.println("-----------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("-----------------------------------------------");
			int option = sc.nextInt();
			switch(option)
			{
			case 1: System.out.println("Stock prices in descending order are :");
			sortArray(stockPrice,option);
			break;
			case 2: System.out.println("Stock prices in descending order are :");
			sortArray(stockPrice,option);
			break;
			case 3: System.out.println("Total no of companies whose stock price rose today : "+stockIncrDecr(stockPriceIncr,true));
			break;
			case 4:	System.out.println("Total no of companies whose stock price declined today : "+stockIncrDecr(stockPriceIncr,false));
			break;
			case 5: System.out.println("enter the key value");
			double stockValue = sc.nextDouble();
			stockSearch(stockValue, stockPrice);
			break;
			case 0: System.out.println("Exited successfully");
			exit=true;
			break;
			default:System.out.println("Please enter options 1-6 only"); 

			}

		}

	}


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
