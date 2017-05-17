package wzg;
/*
被装饰者
*/
public class Electrician implements Worker{
	@Override
	public void doSomeWork() {
		System.out.println("我来维修电路");
	}
}
