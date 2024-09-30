package ASSIGNMENT4;

class Car {
	private String carModel;
	private String carName;
	private double carPrice;
	private String carOwner;

	public void assignValues(String carModel, String carName, double carPrice, String carOwner) {
		this.carModel = carModel;
		this.carName = carName;
		this.carPrice = carPrice;
		this.carOwner = carOwner;
	}

	public void display() {
		System.out.println("Car Model: " + carModel);
		System.out.println("Car Name: " + carName);
		System.out.println("Car Price: $" + carPrice);
		System.out.println("Car Owner: " + carOwner);
		System.out.println();
	}

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.assignValues("SUV", "VITARA BREZZA", 1100000, "BOB");
		car1.display();

		Car car2 = new Car();
		car2.assignValues("SUV", "Ford Explorer", 40000.0, "Jane");
		car2.display();

		Car car3 = new Car();
		car3.assignValues("Sports Car", "Porsche 911", 80000.0, "David Lee");
		car3.display();
	}
}