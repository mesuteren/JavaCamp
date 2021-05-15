package gameProject;

import java.time.LocalDate;





public class Main {

	public static void main(String[] args) {
		
		GamerService gamerService = new GamerManager(new MernisServiceAdapter());
		gamerService.add(new Gamer(1, "MESUT", "EREN", LocalDate.of(1983, 9, 24), "25274524618"));
		gamerService.delete(new Gamer("Recep �vedik")); //Bu �ekilde kullanmak i�in yap�c� blo�u a��r� y�kledim..
		
		CampaignService campaignService = new CampaignManager();
		campaignService.add(new Campaign("2 oyun alana 2.si %50 indirimli"));
		
		OrderService orderService = new OrderManager(new CampaignManager());
		orderService.buy(new Gamer("Selami �ahin"));
		orderService.campaignBuy(new Gamer("Ayta� Y�ceba�"), new Campaign("%50 indirim"));
		
		
		
		
		
	}

}
