package kodlamaIo;

public class Instructor {
	
	public Instructor() {
		System.out.println("E�itmen constructor � �al��t�");
		
	}
	
	public Instructor(int id,String name,String detail) {
		this();
		this.id = id;
		this.name = name;
		this.detail = detail;
						
	}
	
	int id;
	String name;
	String detail;
}
