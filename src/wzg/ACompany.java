package wzg;
/*
 装饰者
 */
public class ACompany implements Worker{
	//生成工人对象的引用
	private Worker worker;
	//创建一个构造方法，以Worker对象作为参数
	public ACompany(Worker worker) {
		this.worker = worker;
	}
	@Override
	public void doSomeWork() {
		//先打印A公司特有的礼貌用语，而后在干工人的工作，
		System.out.println("东家，你好，我来了");
		worker.doSomeWork();
	}
}
