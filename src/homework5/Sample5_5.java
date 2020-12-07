package homework5;

public class Sample5_5 {
	public static void main(String[] args) {
		Car5 car1;
		car1 = new Car5();
		try{
			car1.setCar(1234, -10.0);
		}
		catch(CarException e) {
			System.out.println("拋出"+e+"了");
		}
		car1.show();
	}
}

class Car5 {
	private int num;
	private double gas;

	public Car5() {
		num = 0;
		gas = 0.0;
		System.out.println("已生產了汽車");
	}

	public void setCar(int n, double g)throws CarException {
		if(g<0)
		{
			CarException e = new CarException();
			throw e;
		}
		num = n;
		gas = g;

		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}

	public void show() {
		System.out.println("車號為" + num);
		System.out.println("汽油量為" + gas);
	}
}
class CarException extends Exception
{
	}
