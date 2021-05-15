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
		
		
		
			
		
		
		
		
		
			
		
			
		
			//----------Tarih De�i�keni �al��malar�----------
			//LocalDate date=LocalDate.now(); // tarih bilgisi tutan bir nesne olu�turalim �u anki tarihi alal�m
	        //System.out.println(date.toString()); // Ekrana bast�rd���m�zda 2018-08-01 �eklinde g�z�kecektir
	 
			//LocalDate deneme=LocalDate.of(1983, 9, 24);
		  
        	//System.out.println(deneme.toString());
		
	        // Bu g�z�ken format bize �ok tan�d�k bir yap� olmad���nda bunu istedi�imiz �ekilde
	        // formatlayal�m ve ekrana tekrar bast�ral�m
	        // Bunun i�in DateTimeFormatter nesnesini kullanaca��z

	        //DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd - MM - yyyy");
	        // Bu �ekilde bir format belirlerdik �imdi yazd�r�rken bu formata g�re formatlayal�m
	        //System.out.println(date.format(formatter));
	        // Ekrana 01 - 08 - 2018 bu �ekilde ��kt� verecektir.

	        // �imdi tarihe ait elementlere tek tek ula�al�m
	        //System.out.println(date.getMonth().toString()); // Ekrana ay� yazd�racak
	        //System.out.println(date.getYear()); // Ekrana Y�l� yazd�racak
	        //System.out.println(date.getDayOfWeek().toString()); // Ekrana G�n� yazacakt�r.

	        // http://javafxportal.blogspot.com/2012/03/date-format-example.html buradada konuyla ilgili �rnekler var
	        // Konunun detaylar� i�in kayna��
	        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        
	}

}
