package homework5;

public class Sample6_6 {
	public static void main(String[] args)
	{
		Car11 car1 = new Car11("1號車");
		Thread th1 = new Thread(car1);
		th1.start();
		
		for(int i = 0; i<5; i++)
		{
			System.out.println("正在進行main的處理工作");
		}
	}
}
	class Car11 implements Runnable{
		private String name;
		public Car11(String nm) {
			name = nm;
		}
		public void run()
		{
			for(int i = 0;i<5;i++)
			{
				System.out.println("正在進行"+name+"的處理工作");
			}
		}
	}


