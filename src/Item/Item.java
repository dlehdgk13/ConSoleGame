package Item;

public class Item {


	protected String name;
	protected String type;
	protected int price;
	protected String grade;     //등급

	public Item(
			String name,
			String type,
			int price,
			String grade ) {
		this.name = name;
		this.type = type;
		this.price =price;
		this.grade =grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
