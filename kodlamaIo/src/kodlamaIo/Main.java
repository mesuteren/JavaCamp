package kodlamaIo;



public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id = 1;
		course1.name = "C# + ANGULAR";
		course1.detail = "Yazılım Geliştirici Yetiştirme Kampı";
		
		Course course2 = new Course();
		course2.id = 1;
		course2.name = "JAVA + REACT";
		course2.detail = "Yazılım Geliştirici Yetiştirme Kampı";
		
		
		Course[] courses = {course1,course2};
		
		for (Course course : courses) {
			
			System.out.println(course.name);
			
		}
		
		Category category1 = new Category(1,"Programlama");
		
		Instructor instructor1 = new Instructor(1,"Engin Demiroğ", "Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarına sahibim.");
		Instructor instructor2 = new Instructor(2,"Mesut Eren", "Çok yavaş anlatıyor.");

		Instructor[] instructors = {instructor1,instructor2};
		
		for (Instructor instructor : instructors) {
			
			System.out.println(instructor.name +" ==> "+ instructor.detail);
			
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.registerToCourse(course1);
		courseManager.registerToCourse(course2);
		courseManager.removeToCourse(course1);
		
	}

}
