public class Tester {

	public static void main(String[] args) {
		DairyProduct a = new DairyProduct("A",DairyProduct.Fat.high,
								DairyProduct.Flavour.vanilla,true,
									DairyProduct.Sugar.high,true,true);
		DairyProduct b = new DairyProduct("B",DairyProduct.Fat.medium,
				DairyProduct.Flavour.chocolate,false,
					DairyProduct.Sugar.low,false,true);
		DairyProduct c = new DairyProduct("C",DairyProduct.Fat.low,
				DairyProduct.Flavour.vanilla,true,
					DairyProduct.Sugar.low,true,true);
		DairyProduct d = new DairyProduct("D",DairyProduct.Fat.low,
				DairyProduct.Flavour.fruit,false,
					DairyProduct.Sugar.low,false,true);
		System.out.println("Done");

	}

}
