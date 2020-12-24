package buzz.xinyan.team.junit;

import org.junit.Test;

import buzz.xinyan.team.domain.Employee;
import buzz.xinyan.team.service.NameListService;
import buzz.xinyan.team.service.TeamException;

/**
 * 
* @Description		对namelistService测试
* @author Ivan Xin  Email:xinyan7788@live.com
* @version
* @date 2020年11月24日下午10:55:10
*
 */
public class NameListServiceTest {
	
	@Test
		public void TestGetAllEmployees() {
		NameListService service =new NameListService();
		Employee[] employee = service.getAllEmployee();
		for(int i = 0;i < employee.length;i++) {
			System.out.println(employee[i]);
		}
	}
	
	@Test
	public void TestGetEmployee() {
		int id = 10;
		NameListService service =new NameListService();
		try {
			Employee e = service.getEmployee(id);
			System.out.println(e);
		} catch (TeamException e) {
			System.out.println(e.getMessage());
//			throw new TeamException("找不到指定的员工");
		}
	}
}
