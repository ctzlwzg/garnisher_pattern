package wzg;

public class Test {
	public static void main(String[] args) {
		//�����繤����
		Electrician electrician = new Electrician();
		Carpenter carpenter = new Carpenter();
		//����A��˾���󣬰ѵ繤������Ϊ�������ݽ�ȥ
		//ACompany aCompany1 = new ACompany(electrician);
		//ACompany aCompany2 = new ACompany(carpenter);
		//ִ��A��˾��doSomeWork()����
		electrician.doSomeWork();
		carpenter.doSomeWork();
	}
}
