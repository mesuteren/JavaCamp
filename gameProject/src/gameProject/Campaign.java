package gameProject;

public class Campaign implements Entity {
	
	private int id;
	private String campaignName;
	private Double discount;
	private String details;
	
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String campaignName, Double discount, String details) {
		
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
		this.details = details;
	}
	
	public Campaign(String campaignName) {
		
		
		this.campaignName = campaignName;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
