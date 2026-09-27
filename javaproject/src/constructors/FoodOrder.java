package constructors;

public class FoodOrder {
	int Order_ID;
	String Restaurant_Name;
	String Food_Item;
	int Delivery_Address;
	public FoodOrder(int Order_ID) {
		this.Order_ID = Order_ID;
		System.out.println("Order Information\nOrder_ID: " + Order_ID);
	}
	public FoodOrder(int Order_ID,String Restaurant_Name) {
		this(Order_ID);
		this.Restaurant_Name = Restaurant_Name;
		System.out.println("Restaurant_Name: " + Restaurant_Name);
	}
	public FoodOrder(int Order_ID,String Restaurant_Name,String Food_Item) {
		this(Order_ID,Restaurant_Name);
		this.Food_Item = Food_Item;
		System.out.println("Food_Item: " + Food_Item);
	}
	public FoodOrder(int Order_ID,String Restaurant_Name,String Food_Item,int Delivery_Address) {
		this(Order_ID,Restaurant_Name,Food_Item);
		this.Delivery_Address = Delivery_Address;
		System.out.println("Delivery_Address: " + Delivery_Address);
	}
	public static void main(String[]args) {
		FoodOrder f = new FoodOrder(101,"Ashritha Restaurant","Biryani",509301);
	}

}
