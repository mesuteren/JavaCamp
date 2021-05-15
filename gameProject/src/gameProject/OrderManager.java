package gameProject;

public class OrderManager implements OrderService{

private CampaignService campaignService;
	
	public OrderManager(CampaignService campaignService) {
		this.campaignService = campaignService;
	}
	

	
	
	
	
	@Override
	public void buy(Gamer gamer) {
		System.out.println("Oyun sat�n ald�:  " + gamer.getFirstName());
		
	}






	@Override
	public void campaignBuy(Gamer gamer, Campaign campaign) {
		System.out.println("Oyun sat�n ald�: " + gamer.getFirstName() +" �ndirim uyguland�: " + campaign.getCampaignName());
		
	}

}
