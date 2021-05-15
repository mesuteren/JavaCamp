package coffeeShop;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Mesut");
		customer.setLastName("Eren");
		customer.setDateOfBirth(LocalDate.of(1983, 9, 24));
		customer.setNationalityId("25274524618");
		
		
		System.out.println(customer.getId());
		System.out.println(customer.getFirstName());
		System.out.println(customer.getLastName());
		System.out.println(customer.getDateOfBirth().toString());
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "MESUT", "EREN", LocalDate.of(1983, 9, 24), "26274524618"));
		
		
		
			
		
		
		
		
		
			
		
			
		
			//----------Tarih Deðiþkeni Çalýþmalarý----------
			//LocalDate date=LocalDate.now(); // tarih bilgisi tutan bir nesne oluþturalim Þu anki tarihi alalým
	        //System.out.println(date.toString()); // Ekrana bastýrdýðýmýzda 2018-08-01 þeklinde gözükecektir
	 
			//LocalDate deneme=LocalDate.of(1983, 9, 24);
		  
        	//System.out.println(deneme.toString());
		
	        // Bu gözüken format bize çok tanýdýk bir yapý olmadýðýnda bunu istediðimiz þekilde
	        // formatlayalým ve ekrana tekrar bastýralým
	        // Bunun için DateTimeFormatter nesnesini kullanacaðýz

	        //DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd - MM - yyyy");
	        // Bu þekilde bir format belirlerdik þimdi yazdýrýrken bu formata göre formatlayalým
	        //System.out.println(date.format(formatter));
	        // Ekrana 01 - 08 - 2018 bu þekilde çýktý verecektir.

	        // þimdi tarihe ait elementlere tek tek ulaþalým
	        //System.out.println(date.getMonth().toString()); // Ekrana ayý yazdýracak
	        //System.out.println(date.getYear()); // Ekrana Yýlý yazdýracak
	        //System.out.println(date.getDayOfWeek().toString()); // Ekrana Günü yazacaktýr.

	        // http://javafxportal.blogspot.com/2012/03/date-format-example.html buradada konuyla ilgili örnekler var
	        // Konunun detaylarý için kaynaðý
	        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        
	}

}
