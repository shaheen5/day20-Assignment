package Day20Assignment;
import java.util.Scanner;

 class Product {
     //Instance variables
      int product_id;
      String product_name;
      int product_price;
     
     //default constructor
     Product(){
         System.out.println("Product Object Created!");  
     }
     
     //parameterized constructor
     Product(int product_id,String product_name,int product_price){
         this.product_id=product_id;
         this.product_name=product_name;
         this.product_price=product_price;
     }
    
     
     public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}


	void show_Product_Details(){
         System.out.println("Product ID    :- "+product_id);
         System.out.println("Product Name  :- "+product_name);
         System.out.println("Product Price :- "+product_price);
     }
     
  
 }
