package buzz.xinyan.team.service;

import buzz.xinyan.team.domain.Architect;
import buzz.xinyan.team.domain.Designer;
import buzz.xinyan.team.domain.Employee;
import buzz.xinyan.team.domain.Programmer;

/**
 * @Description 团队的成员管理，添加与删除操作
 * @author Ivan Xin Email:xinyan7788@live.com
 * @version
 * @date 2020年11月30日下午9:06:56
 *
 */
public class TeamService {
	private static int counter = 1; // 静态变量，用来为开发团队新增成员自动生成团队中的唯一ID
	private final int MAX_MEMBER = 5;// 团队总数为5
	private Programmer[] team = new Programmer[MAX_MEMBER]; // 此数组为保存开发人员
	private int total = 0; // 实际存在的成员数，开发团队的实际人数。

	/**
	 * @Description 获取开发团队中的成员
	 * @author Ivan Xin
	 * @date 2020年11月30日下午9:35:18
	 * @return
	 */
	public Programmer[] getTeam() {
		Programmer[] team = new Programmer[total];
		for (int i = 0; i < team.length; i++) {
			team[i] = this.team[i];
		}
		return team;
	}

	/**
	 * @Description 添加成员
	 * @author Ivan Xin
	 * @date 2020年11月30日下午9:39:28
	 * @param e
	 * @throws TeamException
	 */

	public void addMember(Employee e) throws TeamException {
		// TODO Auto-generated method stub
//		成员已满，无法添加
		if (total >= MAX_MEMBER) {
			throw new TeamException("成员已满，无法添加!");
		}
//		该成员不是开发人员，无法添加
		if (!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发人员，无法添加!");
		}
//		该员工已在本开发团队中
		if (isExit(e)) {
			throw new TeamException("该员工已在本开发团队中,请不要重复加入!");
		}
//		该员工已是某团队成员 
//		该员正在休假，无法添加
		Programmer p = (Programmer) e; // 此处一定不会出现classCastExcertion,上方第二个已经此问题抛出
//		if ("BUSY".equalsIgnoreCase(p.getStatus().getName())) { // 此处将字符串放在前面可减少空指针风险
//			throw new TeamException("该员工已是某团队成员 !"); // 考虑问题的全面，如果此处成员已经在团队中也会抱着个错误但是上方问题已经抛出了
//		} else if ("VACATION".equalsIgnoreCase(p.getStatus().getName())) {
//			throw new TeamException("该员正在休假，无法添加 !");
//		}
		switch (p.getStatus()){ //基本数据类型String 枚举类对象
			case BUSY:
				throw new TeamException("该员工已是某团队成员 !");
			case VACATION:
				throw new TeamException("该员正在休假，无法添加 !");
		}


//		团队中至多只能有一名架构师
//		团队中至多只能有两名设计师
//		团队中至多只能有三名程序员
		int memberOfArch = 0, memOfDes = 0, memOfPro = 0; // 获取团队中的职位人数
		for (int i = 0; i < total; i++) {
			if(team[i] instanceof Architect) {
				memberOfArch++;
			}else if(team[i] instanceof Designer) {
				memOfDes++;
			}else if(team[i] instanceof Programmer) {
				memOfPro++;
			}
		}
		if(p instanceof Architect) {
			if(memberOfArch >=1) {
				throw new TeamException("团队中至多只能有一名架构师");
			}
		}else if(p instanceof Designer) {
			if(memOfDes >=2) {
				throw new TeamException("团队中至多只能有两名设计师!");
			}
		}else if(p instanceof Programmer) {
			
			if(memOfPro >= 3) {
				throw new TeamException("	团队中至多只能有三名程序员!");
			}
		}
		//向团队中添加成员
		
		team[total++] = p;
		p.setStatus(Status.BUSY);
		p.setMemberId(counter++);
	}

	/**
	 * 
	 * @Description 检验员工是否存在于开发团队中
	 * @author Ivan Xin
	 * @date 2020年11月30日下午10:53:26
	 * @param e
	 * @return
	 */
	private boolean isExit(Employee e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < total; i++) {
			if (e.getId() == team[i].getId()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @Description 删除指定id的成员
	 * @author Ivan Xin
	 * @date 2020年11月30日下午9:41:19
	 * @param memberId
	 * @throws TeamException
	 */
	public void removeMember(int memberId) throws TeamException {
		// TODO Auto-generated method stub
		int i = 0;
		for(;i < total;i++) {
			if(team[i].getMemberId()==memberId) {
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		
		if(i==total) {
			throw new TeamException("找不到指定memberId的员工，删除失败!");
		}
		
		for(int j = i + 1; j < total; j++) {
			team[j-1] = team[j];
		}
		team[--total]=null;
	}
}
