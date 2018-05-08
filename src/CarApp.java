import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// System.out.println("How many cars are you entering? ");
		// int num = scan.nextInt();
		// scan.nextLine(); // clearing scanner
		//
		// // creating an ArrayList to hold the cars the user enters
		// ArrayList<NewCar> carList = new ArrayList<>();
		//
		// // Loops through and creates and new car object each iteration
		// for (int i = 1; i <= num; i++) {
		//
		// System.out.println("Please enter Car " + i + " make: ");
		// String tempMake = scan.nextLine();
		// System.out.println("Please enter Car " + i + " model: ");
		// String tempModel = scan.nextLine();
		// System.out.println("Please enter Car " + i + " year: ");
		// int tempYear = scan.nextInt();
		// System.out.println("Please enter Car " + i + " price: ");
		// double tempPrice = scan.nextDouble();
		// scan.nextLine(); // garbage line
		//
		// NewCar temp = new NewCar(tempMake, tempModel, tempYear, tempPrice);
		//
		// carList.add(temp);
		// System.out.println();
		//
		// }
		//
		// System.out.println(carList);

		// beginning of part 2
		UsedCar c1 = new UsedCar("Ford", "Focus", 1991, 3000, 50000);
		UsedCar c2 = new UsedCar("Chevrolet", "Cruse", 2000, 4500, 80000);
		UsedCar c3 = new UsedCar("Ford", "Escape", 2005, 6700, 45000);

		NewCar c4 = new NewCar("Ford", "Fiesta", 2018, 25000);
		NewCar c5 = new NewCar("Chrysler", "300", 2018, 30000);
		NewCar c6 = new NewCar("Ford", "Explorer", 2018, 40000);

		ArrayList<NewCar> carList1 = new ArrayList<>();
		carList1.add(c1);
		carList1.add(c2);
		carList1.add(c3);
		carList1.add(c4);
		carList1.add(c5);
		carList1.add(c6);

		String response = "y";

		int counter = 1;
		for (int row = 0; row < carList1.size(); row++) {
			System.out.printf("%5s %20s", counter, carList1.get(row) + "\n");
			counter++;
		}

		int userNum = Validator.getInt(scan, "\nWhich car would you like? (Enter 1-6): ", 1, 6);
		int index = userNum - 1;
		System.out.println(carList1.get(index));
		System.out.println("Would you like to buy this car? (y/n): ");
		response = scan.nextLine();

		while (response.equalsIgnoreCase("y")) {
			System.out.println("Excellent! Our finance team will be in touch sortly.");
			carList1.remove(index);
			// still working on removing car and re-displaying list
			//and figuring out why exception is being thrown here

		}

		scan.close();
	}

}
