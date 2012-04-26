
public class Room {
	private boolean north;
	private boolean east;
	private boolean south;
	private boolean west;
	private String name;
	private String card;

	//default constructor creates an empty room with 4 exits
	public Room(){
		this.name = "";
		this.north = true;
		this.east = true;
		this.south = true;
		this.west = true;
		this.card = null;
	}
	
	public boolean hasCard(){
		if(this.card != null){
			return true;
		}else{
			return false;
		}
	}
}
