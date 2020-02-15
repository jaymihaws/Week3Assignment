public class app {

	public static void main(String[] args) {

		int[] ages = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 56;

		// 1a&b
//		int first = ages[0];
//		int last = ages[ages.length - 1];
//
//		System.out.println(last - first);
//		
		// 1c
//		int sum = 0;
//		for(int i = 0; i < ages.length; i++) 
//		sum = sum + ages[i];
//		
//		double average = sum / ages.length;
//		System.out.println(average);

//		String[] names = new String[6];
//		names[0] = "Sam";
//		names[1] = "Tommy";
//		names[2] = "Tim";
//		names[3] = "Sally";
//		names[4] = "Buck";
//		names[5] = "Bob";
//
//		// 5
//		int[] nameLengths = new int[names.length];
//		for (int i = 0; i < names.length; i++) {
//			nameLengths[i] = names[i].length();
//		}
//		System.out.println("5. " + Arrays.toString(nameLengths));
//
//		// 6
//		int total = 0;
//		for (int j = 0; j < nameLengths.length; j++)
//			total += nameLengths[j];
//		System.out.println("6. " + total);

		// 2a
//		int total = 0;
//		for (int i = 0; i < names.length; i++) 
//			total += names[i].length();
//	
//		double averageLetters = total / names.length;
//			System.out.println(averageLetters);

//		for (int i = 0; i < names.length; i++)

		// 2b
//		for (String name : names) {
//			System.out.print(name + " ");
//		}

		// 7
//		System.out.println(multiplyString("Hello", 3));

//		//8
//		String firstName = "Jaymi";
//		String lastName = "Haws";
//		String fullName = createFullName(firstName, lastName);
//		
//		System.out.println(fullName);

		// 9
//		int[] inventory = new int[6];
//		inventory[0] = 12;
//		inventory[1] = 47;
//		inventory[2] = 4;
//		inventory[3] = 8;
//		inventory[4] = 21;
//		inventory[5] = 17;
//
//		System.out.println(isSumGreater(inventory));

		// 10 & 11
		double[] gasPrices = new double[5];
		gasPrices[0] = 2.90;
		gasPrices[1] = 2.80;
		gasPrices[2] = 3.97;
		gasPrices[3] = 3.01;
		gasPrices[4] = 1.99;

		double[] dieselPrices = new double[4];
		dieselPrices[0] = 4.84;
		dieselPrices[1] = 4.01;
		dieselPrices[2] = 3.97;
		dieselPrices[3] = 4.57;

//		System.out.println(isAverageGreater(gasPrices, dieselPrices));

//		System.out.println(getAverage(gasPrices));

		// 12
//		boolean isHotOutside = true;
//		double moneyInPocket = 11.05;
//
//		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));

//		//13
//		boolean haveBabysitter = true;
//		double haveExtraFunMoney = 100.87;
//		
//		System.out.println(isDateNight(haveBabysitter, haveExtraFunMoney));

	}

	public static boolean isDateNight(boolean i, double k) {
		if (i = true && k > 100) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean willBuyDrink(boolean i, double j) {
		if (i = true && j > 10.50) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isAverageGreater(double[] j, double[] h) {
		double sum = 0;
		for (int i = 0; i < j.length; i++)
			sum = sum + j[i];
		double average = sum / j.length;

		double sum1 = 0;
		for (int k = 0; k < h.length; k++)
			sum1 = sum1 + h[k];
		double average1 = sum1 / h.length;

		if (average > average1) {
			return true;
		} else {
			return false;
		}
	}

	public static double getAverage(double[] k) {
		double sum = 0;
		for (int i = 0; i < k.length; i++)
			sum = sum + k[i];

		double average = sum / k.length;

		return average;
	}

	public static boolean isSumGreater(int[] n) {
		int sum = 0;
		for (int i = 0; i < n.length; i++)
			sum = sum + n[i];

		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}

	public static String createFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName;
	}

	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
}
