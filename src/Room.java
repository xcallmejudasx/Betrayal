
public class Room {
	private boolean north;
	private boolean east;
	private boolean south;
	private boolean west;
	private boolean card;
	private boolean up;
	private boolean down;
	private String cardType;
	private String name;

	//default constructor creates an empty room with 4 exits
	public Room(){
		this.name = "";
		this.north = true;
		this.east = true;
		this.south = true;
		this.west = true;
		this.up = false;
		this.down = false;
		this.card = false;
		this.cardType = "";
	}
	
	public boolean hasCard(){
		return this.card;
	}
	
	public String getCardType(){
		if(this.hasCard()){
			return this.cardType;
		}else{
			return "None";
		}
	}
	
	
}
