package homework5;

public class Smaple6_3 {
	public static void main(String[] args)
	{
		Car8 car1 = new Car8("1號車");
		car1.start();
		
		for(int i = 0; i<5; i++)
		{
			System.out.println("正在進行main的處理工作");
		}
	}
}
	class Car8 extends Thread{
		private String name;
		public Car8(String nm) {
			name = nm;
		}
		public void run()
		{
			for(int i = 0;i<5;i++)
			{
				try {
					sleep(1000);
					System.out.println("正在進行"+name+"的處理工作");
				}
				catch(InterruptedException e)
				{
					
				}
			}
		}
	}


