package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UserdProduct;

public class Program {

	public static void main(String[] args) {
		// i == Import
		// c == product 
		// u == usedProduct,

		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("(DD/MM/YYYY");
		List<Product> list = new ArrayList<>();
		
		
		System.out.println("Enter the number of products: ");
		int n  = sc.nextInt();

		for(int i = 1 ; i <= n ; i ++){

			System.out.println("Product # "+ i + "data:");
			System.out.println("Common, used or imported (c/u/i)?");
			char res = sc.next().charAt(0);
			
			System.out.println("Name:");
			String name = sc.next();
			
			System.out.println("Price:");
			double price = sc.nextDouble();
			
			if(res == 'i'){
				System.out.println("Customs fee:");
				double customsFree = sc.nextDouble();	
				ImportedProduct imp = new ImportedProduct(name, price, customsFree);
				list.add(imp);
				
			} else if (res == 'c'){
				Product pd = new Product(name, price);
				list.add(pd);
				
			} else if (res == 'u'){
				System.out.println("Manufacture date (DD/MM/YYYY):");
			
				//UserdProduct up = new UserdProduct(name, price, sdf);
				
			}else{
				System.out.println("erro");
			}
			
			
		}
		
				System.out.println("PRICE TAGS:");
				for(Product pd : list){
					System.out.println(pd.getName() + " $ " + pd.getPrice() + pd.priceTag());
					
					
				}
				
		
				sc.close();
	}

}
