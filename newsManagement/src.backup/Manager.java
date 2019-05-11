import java.util.ArrayList;
import java.util.List;

public class Manager extends Worker {

	private List<Worker> worker;

	public Manager() {

	}
	//Manager类的初始化
	public Manager(String name, int age, int salary, String department) {
		super();
	}

	// 管理人员可以查询本部门员工的基本信息，跨部门查询提示权限不足，提示“Access Denied!”
	public String inquire(Worker e) {
		if(e.getDepartment().equals(this.getDepartment())){
			return e.show();
		}else{
			return "Access Denied!";
		}
	}

	// 管理人员给自己的队伍添加工作人员，同一部门的工作人员可以添加，并返回true，不同部门的工作人员无法添加，返回false
	public boolean lead(Worker e) {
		if(e.getDepartment().equals(this.getDepartment())){
			worker.add(e);
			return true;
		}
		return false;
	}

	// 打印自己队伍的人员姓名，没有打印“Empty”
	public String print() {
		if(worker.isEmpty()){
			return "Empty";
		}
		else{
			StringBuilder sb = new StringBuilder();
			sb.append("Statement for "+this.getName()+"\n");
			for(int i=0;i<worker.size();i++){
				if(i<worker.size()-1){
					sb.append(" -"+worker.get(i).getName()+"\n");
				}else{
					sb.append(" -"+worker.get(i).getName());
				}
			}
			return sb.toString();
		}
	}

}
