package buzz.xinyan.team.view;

import buzz.xinyan.team.domain.Employee;
import buzz.xinyan.team.domain.Programmer;
import buzz.xinyan.team.service.NameListService;
import buzz.xinyan.team.service.TeamException;
import buzz.xinyan.team.service.TeamService;

public class TeamView {
	NameListService listSvc = new NameListService();
	TeamService teamSvc = new TeamService();
	
	/**
	* @Description	主界面显示及控制方法。
	* @author Ivan Xin
	 * @throws TeamException 
	* @date 2020年12月1日下午5:11:36
	 */
	public void enterMainMenu() throws TeamException {
		// TODO Auto-generated method stub
		char menu = 0;
		boolean isTrue = true;
		while(isTrue) {
			if(menu != '1') {
				listAllEmployees();
			}
			System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4):");
			menu = TSUtility.readMenuSelection();
			switch(menu) {
			case '1':
				getTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.print("确认是否退出(Y/N):");
				char isExit = TSUtility.readConfirmSelection();
				if(isExit == 'Y') {
					isTrue = false;
				}
			}
		}
	}
	
	/**
	 * 
	* @Description  以表格形式列出公司所有成员
	* @author Ivan Xin
	 * @throws TeamException 
	* @date 2020年12月1日下午5:13:10
	 */
	private void listAllEmployees() throws TeamException {
		// TODO Auto-generated method stub
		System.out.println("-------------------开发团队调度软件-----------------------\n");
		Employee[] allEmployee = listSvc.getAllEmployee();
		if(allEmployee.length ==0 || allEmployee == null) {
			throw new TeamException("公司没得员工！");
		}else {
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			for(int i = 0; i < allEmployee.length;i++) {
				System.out.println(allEmployee[i]);
			}
			System.out.println("----------------------------------------------------------");
		}
	}
	/**
	 * 
	* @Description    显示团队成员列表操作
	* @author Ivan Xin
	* @date 2020年12月1日下午5:15:08
	 */
	private void getTeam() {
		// TODO Auto-generated method stub
		System.out.println("---------------------------团队成员列表-------------------------------\n");
		Programmer[] team = teamSvc.getTeam();
		if(team.length ==0 || team ==null) {
			System.out.println("开发团队目前没有成员！");
		}else {
			System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票\n");
			for(int i = 0; i < team.length;i++) {
				System.out.println(team[i].getDetailsForTeam());
			}
		}
		
		System.out.println("------------------------------------------------------------------------");

	}
	/**
	 * 
	* @Description  实现添加成员操作
	* @author Ivan Xin
	* @date 2020年12月1日下午5:15:38
	 */
	private void addMember() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------添加成员--------------------------------");
		System.out.println("输入要添加的id:");
		int readInt = TSUtility.readInt();
		try {
			Employee employee = listSvc.getEmployee(readInt);
			teamSvc.addMember(employee);
			System.out.println("添加成功");
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		TSUtility.readReturn();

	}
	
	/**
	 * 
	* @Description  实现删除成员操作
	* @author Ivan Xin
	* @date 2020年12月1日下午5:16:15
	 */
	private void deleteMember() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------删除成员--------------------------------");
		System.out.println("输入要删除的TID:");
		int readInt = TSUtility.readInt();
		System.out.println("是否确认删除Y/N：");
		char readConfirmSelection = TSUtility.readConfirmSelection();
		if(readConfirmSelection =='Y') {
			try {
				teamSvc.removeMember(readInt);
				System.out.println("删除成功");
			} catch (TeamException e) {
				// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			}
		}else {
			return;
		}

	}
	public static void main(String[] args) {
		TeamView t = new TeamView();
		try {
			t.enterMainMenu();
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

