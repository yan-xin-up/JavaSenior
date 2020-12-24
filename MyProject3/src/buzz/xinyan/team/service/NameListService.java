package buzz.xinyan.team.service;
import buzz.xinyan.team.domain.Architect;
import buzz.xinyan.team.domain.Designer;
import buzz.xinyan.team.domain.Employee;
import buzz.xinyan.team.domain.Equipment;
import buzz.xinyan.team.domain.PC;
import buzz.xinyan.team.domain.Printer;
import buzz.xinyan.team.domain.NoteBook;
import buzz.xinyan.team.domain.Programmer;

import static buzz.xinyan.team.service.Data.*;

/**
 * 
* @Description 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
* @author Ivan Xin  Email:xinyan7788@live.com
* @version
* @date 2020年11月23日下午9:41:26
*
 */
public class NameListService {
	private Employee[] employees;
	public NameListService() {
//	1.根据项目提供的Data类构建相应大小的employees数组
//	2.再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
//	3.将对象存于数组中
		employees = new Employee[EMPLOYEES.length];
		for(int i = 0;i < employees.length;i++) {
			int type = Integer.parseInt(EMPLOYEES[i][0]);
			int id = Integer.parseInt(EMPLOYEES[i][1]);
			String name = EMPLOYEES[i][2];
			int age = Integer.parseInt(EMPLOYEES[i][3]);
			double salary = Double.parseDouble(EMPLOYEES[i][4]);
			int bonus;
			int stock;
			Equipment equipment;
			switch(type) {
			case EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary); 
				break;
			case PROGRAMMER:
				//对应序列号添加设备
				equipment = AddEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;
			case DESIGNER:
				bonus = Integer.parseInt(EMPLOYEES[i][5]);
				equipment = AddEquipment(i);
				employees[i] = new Designer(id, name, age, salary, equipment, bonus);
				break;
			case ARCHITECT:
				bonus = Integer.parseInt(EMPLOYEES[i][5]);
				stock = Integer.parseInt(EMPLOYEES[i][6]);
				equipment = AddEquipment(i);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;
			}
		}
	}
	/**
	* @Description	给对应序列号添加相应的设备
	* @author Ivan Xin
	* @date 2020年11月24日下午3:02:31
	* @param i
	* @return
	 */
	//如下的EQUIPMENTS数组与上面的EMPLOYEES数组元素一一对应
    //PC      :21, model, display
    //NoteBook:22, model, price
    //Printer :23, name, type 
	private Equipment AddEquipment(int i) {
		// TODO Auto-generated method stub
		int type = Integer.parseInt(EQUIPMENTS[i][0]);
		String modelOrName = EQUIPMENTS[i][1];
		switch(type) {
		case PC:
			String display = EQUIPMENTS[i][2];
			return new PC(modelOrName ,display);
		case NOTEBOOK:
			double price = Double.parseDouble(EQUIPMENTS[i][2]);
			return new NoteBook(modelOrName,price);
		case PRINTER:
			String PrinterType = EQUIPMENTS[i][2];
			return new Printer(modelOrName ,PrinterType);
		}
		return null;
	}
/**
 * 
* @Description			获取当前所有员工
* @author Ivan Xin
* @date 2020年11月24日下午5:13:17
* @return 	包含所有员工对象的数组
 */
	public Employee[] getAllEmployee() {
		return employees;
	}

	/**
	* @Description		获取指定位置的员工对象
	* @author Ivan Xin
	* @date 2020年11月24日下午8:51:10
	* @param id
	* @return
	* @throws TeamException
	 */
	public Employee getEmployee(int id) throws TeamException{
		for(int i = 0; i < employees.length;i++) {
			if(employees[i].getId() ==id) {
				return employees[i];
			}
		}
		throw new TeamException("找不到指定的员工" );
	}
}
