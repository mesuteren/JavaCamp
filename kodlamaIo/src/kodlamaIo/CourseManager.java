package kodlamaIo;



public class CourseManager {
	
	public void registerToCourse(Course course) {
		System.out.println("Kursa kaydolundu! " + course.name);
	}
	
	public void removeToCourse(Course course) {
		System.out.println(course.name + " ==> Kurs çıkarıldı");
	}

}
