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
			System.out.println("TC Kimlik No Do�ru, Oyuncu eklendi:  " + gamer.getFirstName());
		}
		else 
		{
			System.out.println("Kimlik numaran e�le�miyor. Uzaydan m� geldin?");
		}		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu g�ncellendi:  " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi:  " + gamer.getFirstName());
		
	}

}
