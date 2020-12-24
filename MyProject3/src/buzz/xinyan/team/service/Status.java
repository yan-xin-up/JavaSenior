package buzz.xinyan.team.service;
/**
 * 
* @Description			员工的工作状态
* @author Ivan Xin  Email:xinyan7788@live.com
* @version
* @date 2020年11月22日下午11:55:03
*
 */
//public class  Status {
//	private final String name;
//	private Status(String name) {
//		this.name = name;
//	}
//	public static final Status FREE  = new Status("FREE");
//	public static final Status BUSY  = new Status("BUSY");
//	public static final Status VACATION = new Status("VACATION");
//
//	public String getName() {
//		return name;
//	}
//
//	@Override
//	public String toString() {
//		return name ;
//	}
//
//}

public enum Status{
	FREE,BUSY,VACATION;
}