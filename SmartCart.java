import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class Item
{
	String[] items;
	int[] prices;
	int top;
	int total;

	Item()				//Inititalize our items and prices
	{
	items = { "RIBBON PAKODA", "THENKUZHAL","ONION PAKODA", "THATTU VADAI", "MURUKKU", "BONDA", "BOMBAY MIXTURE"};
	prices = {20,25,25,20,30,25,40};
	top = 6;
	total = 0;
	}

	void disp()			//Display menu
	{	
		for(int i=0;i<top;++i)
		{
			System.out.println((i+1)+".\t"+items[i]+" \t"+prices[i]);
		}
	}

	void compute(int ch, int qty)
	{
		if(ch>(top+1))
			System.out.println("Wrong choice!");
		else
			total+=price[ch-1]*qty;
			System.out.println("Item:"+items[ch-1]+"\tQuantity:"+qty+"\tTotal:"+total);
	}
}

class TestItem
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Item I = new Item();
		int choice;

		System.out.println("\n\tMAHADEVA SNACK STORE\n\n");
		I.disp();
		do
		{
		System.out.println("Enter your choice of item (serial no.):");
		ch = s.nextInt();
		System.out.println("Enter quantity in units:");
		qty = s.nextInt();
		I.compute(ch,qty);

		Sytem.out.println("Would you like to purchase more?\n(Enter 1 for YES, 0 for NO):");
		choice = s.nextInt();
		} while(choice == 1);
	}
}
