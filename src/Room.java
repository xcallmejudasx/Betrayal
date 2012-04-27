
public class Room {
	private String name;
	private int orientation;
	private boolean ground;
	private boolean upstairs;
	private boolean basement;
	private boolean card;
	private String cardType;
	private int x, y, z;
	private Deck contents;
	
	//default constructor creates an empty room with 4 exits
	public Room(){
		this.name = "";
		this.orientation = 0;
		this.ground = false;
		this.upstairs = false;
		this.basement = false;
		this.card = false;
		this.cardType = "";
		this.x = (Integer) null;
		this.y = (Integer) null;
		this.z = (Integer) null;
		this.contents = null;
	}
	
	public boolean hasCard(){
		return this.card;
	}
	
	
	//getters and setters
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getOrientation(){
		return this.orientation;
	}
	public void setOrientation(int degrees){
		this.orientation = degrees;
	}
	
	public String getCardType(){
		if(this.hasCard()){
			return this.cardType;
		}else{
			return "None";
		}
	}
	public void setCardType(String type){
		this.cardType = type;
		if(!type.equalsIgnoreCase("")){
			this.card = true;
		}else{
			this.card = false;
		}
	}
	
	public void setLocation(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public int getX(){	
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public int getZ(){
		return this.z;
	}
	public String getFloor(){
		if(this.z == 1){
			return "Ground";
		}else if(this.z == 2){
			return "Up-Stairs";
		}else if(this.z == 0){
			return "Basement";
		}else{
			return "none";
		}
	}
	
	//TODO should fix this so we aren't returning null for empty rooms, or I guess null can be the accepted empty case...
	public Deck getContents(){
		return this.contents;
	}
	
}
