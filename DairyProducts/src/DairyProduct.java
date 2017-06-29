
public class DairyProduct {
	
	private String name;
	public enum Fat {
		low, medium, high
	}
	Fat fat;
	public enum Flavour {
		vanilla, chocolate, fruit, other
	}
	Flavour flavour;
	private boolean hasCream;
	public enum Sugar {
		high, low
	}
	Sugar sugar;
	private boolean hasToppings;
	private boolean like;
	
	public DairyProduct(String name, Fat fat, Flavour flavour, 
							boolean hasCream, Sugar sugar, 
							boolean hasToppings, boolean like)
	{
		this.name = name;
		this.flavour = flavour;
		this.fat = fat;
		this.hasCream = hasCream;
		this.sugar = sugar;
		this.hasToppings = hasToppings;
		this.like = like;
	}

}
