package gameProject;



public class GamerManager implements GamerService{

private NationalityCheckService nationalityCheckService;
	
	public GamerManager(NationalityCheckService nationalityCheckService) {
		this.nationalityCheckService = nationalityCheckService;
	}
	
	
	
	@Override
	
	
	
	public void add(Gamer gamer) {
		
		if(nationalityCheckService.checkIfRealPerson(gamer))
		{
			System.out.println("TC Kimlik No Doðru, Oyuncu eklendi:  " + gamer.getFirstName());
		}
		else 
		{
			System.out.println("Kimlik numaran eþleþmiyor. Uzaydan mý geldin?");
		}		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi:  " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi:  " + gamer.getFirstName());
		
	}

}
