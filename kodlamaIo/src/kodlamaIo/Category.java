package kodlamaIo;

public class Category {
	
	public Category() {
		System.out.println("Kategori constructor ý çalýþtý");
		
	}
	
	public Category(int id,String name) {
		this();
		this.id = id;
		this.name = name;
						
	}
	
	int id;
	String name;
}
