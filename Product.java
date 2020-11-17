package Day20Assignment;
import java.util.Scanner;

 class Product {
     //Instance variables
     private int product_id;
     private String product_name;
     private int product_price;
     
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

	@Override
	public String toString() {
		return "product_id=" + product_id + "\t product_name=" + product_name + "\tproduct_price="
				+ product_price;
	}

	void show_Product_Details(){
         System.out.println("Product ID    :- "+product_id);
         System.out.println("Product Name  :- "+product_name);
         System.out.println("Product Price :- "+product_price);
     }
     
     public static void main(String [] args) {
    	 Scanner sc=new Scanner(System.in);
    	 Product product1=new Product(101,"IphoneX",70000);
    	 System.out.println(product1);
    	 System.out.println("Enter Product Id:-");
    	 int product_id=sc.nextInt();
    	 sc.nextLine();
    	 System.out.println("Enter Product Name:-");
    	 String product_name=sc.nextLine();
    	 System.out.println("Enter Product Price:-");
    	 int product_price=sc.nextInt();
    	 Product product2=new Product(product_id,product_name,product_price);
    	 product2.show_Product_Details();
    	 //display price of particular product
    	 System.out.println("Price of IphoneX : "+product1.getProduct_price());
     }
 }
