package wzg;
/*
 װ����
 */
public class ACompany implements Worker{
	//���ɹ��˶��������
	private Worker worker;
	//����һ�����췽������Worker������Ϊ����
	public ACompany(Worker worker) {
		this.worker = worker;
	}
	@Override
	public void doSomeWork() {
		//�ȴ�ӡA��˾���е���ò��������ڸɹ��˵Ĺ�����
		System.out.println("���ң���ã�������");
		worker.doSomeWork();
	}
}
