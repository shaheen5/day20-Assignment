package Day20Assignment;

import java.util.Scanner;

public class Mobile extends Product {   //Mobile IS-A Product
	
	String Operating_System;
	int RAM;
	int sdCard_Size;
	//default constructor
	Mobile(){
		System.out.println("Mobile Object Created");
	}
	
	//parameterized constructor
	public Mobile(int product_id,String product_name,int product_price,String operating_System, int rAM, int sdCard_Size) {
		super(product_id,product_name,product_price);
		this.product_id=product_id;
		this.product_name=product_name;
		this.product_price=product_price;
		this.Operating_System = operating_System;
		this.RAM = rAM;
		this.sdCard_Size = sdCard_Size;
	}
	
	public void show_Product_Details() {
		 System.out.println("Product ID    :- "+product_id);
         System.out.println("Name  :- "+product_name);
         System.out.println("Price :- "+product_price);
         System.out.println("OS    :- "+Operating_System);
         System.out.println("RAM  :- "+RAM);
         System.out.println("Sdcard Size :- "+sdCard_Size);
	}
	
	   public static void main(String [] args) {
	    	 Scanner sc=new Scanner(System.in);
	    	 Mobile mobile1=new Mobile(101,"IPhoneX",70000,"iOS",4,128);
	    	 mobile1.show_Product_Details();
	    	 Mobile mobile2=new Mobile(102,"Samsung Galaxy Note",59000,"Android",8,64);
	    	 mobile2.show_Product_Details();
	     }
	
}
