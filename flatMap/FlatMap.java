/*
Question3
collection -> productlist1-> hp laptop, acer laptop, samsung
              productlist2-> hp phone, acer, samsung
              productlist3-> camera , acer, samsung

final collection productsList -> productlist1, productlist2, productlist2

flatmap -> list collection products - > print names of all products
*/

package week3_Assignment1.flatMap;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [ID=" + id + ", NAME=" + name + ", PRICE=" + price + "]";
	}
	
}


public class FlatMap {

	public static void main(String[] args) 
	{
		List<Product> productList1=new ArrayList<Product>();
		List<Product> productList2=new ArrayList<Product>();
		List<Product> productList3=new ArrayList<Product>();
		
		//Laptop
		productList1.add(new Product(101,"Lenovo IdeaPad 3",33990));
		productList1.add(new Product(102,"HP 15s-eq2000",38490));
		productList1.add(new Product(103,"Asus BV311T VivoBook 14",23990));
		
		//Phone
		productList2.add(new Product(201,"OnePlus 10 Pro",60999));
		productList2.add(new Product(202,"Realme 9i",15999));
		productList2.add(new Product(203,"Redmi Note 11",12999));
		
		//Camera
		productList3.add(new Product(301,"Canon EOS 3000D DSLR",29999));
		productList3.add(new Product(302,"Canon EOS 200D DSLR",61995));
		productList3.add(new Product(303,"Nikon D850 45.7MP DSLR",44399));
		
		List<List<Product>> productsList=new ArrayList<List<Product>>();
		productsList.add(productList1);
		productsList.add(productList1);
		productsList.add(productList1);
		
		List<Product> productsLists=productsList.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
		productsLists.forEach(System.out::println);;
		
	}

}

/*
EXPECTED INPUT/OUTPUT
Product [ID=101, NAME=Lenovo IdeaPad 3, PRICE=33990.0]
Product [ID=102, NAME=HP 15s-eq2000, PRICE=38490.0]
Product [ID=103, NAME=Asus BV311T VivoBook 14, PRICE=23990.0]
Product [ID=101, NAME=Lenovo IdeaPad 3, PRICE=33990.0]
Product [ID=102, NAME=HP 15s-eq2000, PRICE=38490.0]
Product [ID=103, NAME=Asus BV311T VivoBook 14, PRICE=23990.0]
Product [ID=101, NAME=Lenovo IdeaPad 3, PRICE=33990.0]
Product [ID=102, NAME=HP 15s-eq2000, PRICE=38490.0]
Product [ID=103, NAME=Asus BV311T VivoBook 14, PRICE=23990.0]
*/
