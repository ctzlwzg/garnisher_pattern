package wzg;

public class Test {
	public static void main(String[] args) {
		//创建电工对象
		Electrician electrician = new Electrician();
		Carpenter carpenter = new Carpenter();
		//创建A公司对象，把电工对象作为参数传递进去
		//ACompany aCompany1 = new ACompany(electrician);
		//ACompany aCompany2 = new ACompany(carpenter);
		//执行A公司的doSomeWork()方法
		electrician.doSomeWork();
		carpenter.doSomeWork();
	}
}
