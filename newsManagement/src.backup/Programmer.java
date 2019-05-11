
public class Programmer extends Worker {
	public String language;
	public String type;

	public Programmer() {
	}

	// Programmer类的初始�?
	public Programmer(String name, int age, int salary, String language,
			String type) {
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// 按照规则计算当月的奖�?
	public String getBonus(int overtime) {
		return null;
	}

	// 展示基本信息
	public String show() {
		return null;
	}


	/**
	 * 信息隐藏
	 * 
	 * 为了保护用户的隐私，系统�?要将用户号码和邮箱隐藏起来�?? 对输入的邮箱或电话号码进行加密�?? commnet
	 * 可能是一个邮箱地�?，也可能是一个电话号码�??
	 *
	 * 1. 电子邮箱 邮箱格式�? str1@str2
	 * 电子邮箱的名称str1是一个长度大�?2.并且仅仅包含大小写字母和数字的字符串，名称str1后紧接符号@
	 * �?后是邮箱�?在的服务器str2,str2中可能包含多�?. 如qq.com smail.nju.edu.cn�? 邮箱地址是有效的，一个正确的示例�?:
	 * str1@smail.nju.edu.cn 为了隐藏电子邮箱，所有的str1和str2中的字母必须被转换成小写的，
	 * 并且名称str1的第�?个字和最后一个字的中间的�?有字�? 5 �? '*' 代替�? 如果邮箱中含有非法字符或格式不正确，则返回illegal
	 * 
	 * 示例�?
	 * 
	 * comment: "Qm@Qq.com"
	 * 
	 * return: "q*****m@qq.com"
	 *
	 * 2. 电话号码 电话号码是一串包括数�? 0-9，以�? {'+', '-', '(', ')', ' '} 这几个字符的字符串�??
	 * 你可以假设电话号码包�? 10 �? 13 个数字�?? 电话号码的最�? 10 个数字组成本地号码，在这之前的数字组成国际号码�??
	 * 国际号码是可选的。我们只暴露�?�? 4 个数字并隐藏�?有其他数字�?? 本地号码有格式，并且�? "***-***-1111" 这样显示�?
	 * 为了隐藏有国际号码的电话号码，像 "+111 111 111 1111"，我们以 "+***-***-***-1111"
	 * 的格式来显示。在本地号码前面�? '+' �? 和第�?�? '-' 号仅当电话号码中包含国际号码时存在�?? 例如，一�? 12 位的电话号码应当�?
	 * "+**-" �?头进行显示�?? 注意：像 "("�?")"�?" " 这样的不相干的字符以及不符合上述格式的额外的减号或�?�加号都应当被删除�?? 
	 * 示例1:
	 * 
	 * comment: "1(234)567-890" 
	 * 
	 * return: "***-***-7890" 
	 * 
	 * 示例2: 
	 * 
	 * comment: "86-(10)12345678" 
	 * 
	 * return: "+**-***-***-5678"
	 * 
	 * @param comment
	 */
	public String hideUserinfo(String comment) {
		return comment;
	}

}
