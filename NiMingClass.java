package MultiThreadTest;

public class NiMingClass {
	public static void main(String[] args) {
		//java��������������򻯴��룬������ʹ�õ�ǰ��������������ڼ̳к�ʵ�ֹ�ϵ��ʱ��ſ���ʹ��
		//�����ڲ���������Լ����еķ�����ǰ������������ڲ���ֻ����һ������������ж��������ʱ����ֻ�ܼ̳и���ķ����Լ���д���������ʵ�ֽӿڣ��������������������
		//������������������Դ��ڣ����޷�����
		Thread t = new Thread() {
			public void run() {
				System.out.println("ʹ���������ࡣ");
			}
//			public void AA() {
//				System.out.println("���з���������");
//			}
		};
		t.start();
//		t.AA();//�޷�����AA����������з������ᱨ��ġ�
		
//		new Thread() {
//			public void run() {
//				System.out.println("ʹ���������ࡣ");
//			}
//		}.start();
//		
//		Thread t = new Thread(()->{
//			System.out.println("ʹ���������ࡣ");
//		});
//		t.start();
	}
}
