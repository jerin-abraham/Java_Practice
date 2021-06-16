
/**4)define a class called as "Item" (Item.java)
with members
String itemid;
String name;
int cost;

parameterized constructor which will accept above details at the time
of creating object.
	member function
void display()
which will display all the details of product
create instances of this class and call the method display.
**/

import java.util.*;

public class Item_Demo1
{
	String itemid;
  	String name;
	int cost;
	
	public Item(String itemid,String name,int cost)
	{
		this.itemid= itemid;
		this.name= name;
		this.cost = cost;
	}

	void display()
	{
		System.out.println("ItemId :- "+itemid);
		System.out.println("Item :- "+name);
		System.out.println("Cost :- "+cost);
	}


	public static void main(String args[])
	{
		System.out.println("Enter Item Details :- ");
		Scanner sc= new Scanner(System.in);
		String itemid = sc.nextLine();
		String name = sc.nextLine();		
		int cost = sc.nextInt();

		Item ob = new Item(itemid,name,cost);
		ob.display();
	}
}