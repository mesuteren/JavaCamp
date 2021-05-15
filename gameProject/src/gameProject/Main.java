package gameProject;

import java.time.LocalDate;





public class Main {

	public static void main(String[] args) {
		
		GamerService gamerService = new GamerManager(new MernisServiceAdapter());
		gamerService.add(new Gamer(1, "MESUT", "EREN", LocalDate.of(1983, 9, 24), "26274524628"));
		gamerService.delete(new Gamer("Recep Ývedik")); //Bu þekilde kullanmak için yapýcý bloðu aþýrý yükledim..
		
		CampaignService campaignService = new CampaignManager();
		campaignService.add(new Campaign("2 oyun alana 2.si %50 indirimli"));
		
		OrderService orderService = new OrderManager(new CampaignManager());
		orderService.buy(new Gamer("Selami Þahin"));
		orderService.campaignBuy(new Gamer("Aytaç Yücebaþ"), new Campaign("%50 indirim"));
		
		
		
		
		
	}

}
