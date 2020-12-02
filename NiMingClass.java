package MultiThreadTest;

public class NiMingClass {
	public static void main(String[] args) {
		//java匿名类可以用来简化代码，匿名类使用的前提条件：必须存在继承和实现关系的时候才可以使用
		//匿名内部类可以有自己特有的方法，前提是这个匿名内部类只有这一个方法，如果有多个方法的时候，他只能继承父类的方法以及重写这个方法或实现接口，不能另外调用自身特有
		//方法，但这个方法可以存在，但无法调用
		Thread t = new Thread() {
			public void run() {
				System.out.println("使用了匿名类。");
			}
//			public void AA() {
//				System.out.println("特有方法被调用");
//			}
		};
		t.start();
//		t.AA();//无法调用AA（）这个特有方法，会报错的。
		
//		new Thread() {
//			public void run() {
//				System.out.println("使用了匿名类。");
//			}
//		}.start();
//		
//		Thread t = new Thread(()->{
//			System.out.println("使用了匿名类。");
//		});
//		t.start();
	}
}
