package buzz.xinyan.team.domain;

import buzz.xinyan.team.service.Status;

public class Programmer extends Employee {
	private int memberId;
	private Status status = Status.FREE;
	private Equipment equipment;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public Programmer() {
	}

	public Programmer(int id, String name, int age, double salary, Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}

	@Override
	public String toString() {
		return super.getDescripsion() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
	}
public String getTeambaseDetails() {
	return getMemberId()+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary();
}
	public String getDetailsForTeam() {
		// TODO Auto-generated method stub
		return getTeambaseDetails()+"\t程序员";
		}
}
