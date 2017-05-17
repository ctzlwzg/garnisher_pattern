package wzg;
//工人接口
public interface Worker {
	public void doSomeWork();
}

/*
	 装饰者模式：顾名思义，就是给一个对象增加新的功能，而且是动态的，
	 要求装饰者和被装饰者都实现同一个接口
	 装饰者对象持有被装饰者的实例
 */