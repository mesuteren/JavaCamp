package kodlamaIo;

public class Category {
	
	public Category() {
		System.out.println("Kategori constructor � �al��t�");
		
	}
	
	public Category(int id,String name) {
		this();
		this.id = id;
		this.name = name;
						
	}
	
	int id;
	String name;
}
