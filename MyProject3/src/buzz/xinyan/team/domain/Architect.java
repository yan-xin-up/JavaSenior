package buzz.xinyan.team.domain;

public class Architect extends Designer {
	private int stock;

	
	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}

	public String toString() {
		return super.getDescripsion()+"\t架构师\t"+getStatus()+"\t"+getBonus()+"\t"+getStock()+"\t"+getEquipment().getDescription();
	
	}
	public String getDetailsForTeam() {
		// TODO Auto-generated method stub
		return getTeambaseDetails()+"\t架构师"+"\t"+getBonus()+getStock();
		}

}
