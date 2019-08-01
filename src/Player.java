
public abstract class Player {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
}
