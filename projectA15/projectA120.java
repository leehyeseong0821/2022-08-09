package projectA15;

public class projectA120 {
	
	static void Cale1(Calculator cale) {
		cale.add(5, 5);
	}

	public static void main(String[] args) {
		   
		
		GoodCalc cale = new GoodCalc();
		System.out.println(cale.add(2,3));
		System.out.println(cale.subtract(2, 3));
	    System.out.println(cale.average(new int[] {1,2,3}));
	    
	    BadCar car = new BadCar();
	    System.out.println(car.add(3, 4));
	    System.out.println(car.subtract(300,100 ));
	    System.out.println(car.average(new int[] {1,2,3}));

	    
	    Calculator j = new GoodCalc();
	    System.out.println(j.add(2, 3));
	    System.out.println(j.subtract(2, 3));
	    System.out.println(j.average(new int[] {1,2,3}));
	    
	}

}
