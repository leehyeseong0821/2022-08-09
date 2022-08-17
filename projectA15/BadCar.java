package projectA15;

public class BadCar extends Calculator {

	@Override
	public int add(int a, int b) {
		
		return a+b+100;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b-100;
	}

	@Override
	public double average(int[] a) {
		int sum=0;
		for(int i:a) {
			sum= sum+i;
		}
		return (sum/a.length)/100;
	}

}
