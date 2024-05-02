class View
{
	Controller controllerare;
	View()
	{
		//konstruktor
		controllerare=new Controller();
	}
	public void roligMetodSomFixarSaker()
	{

		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("skriv valfri siffra förutom 0 för att starta sale:");
		int saleKlar=in.nextInt();
		if(saleKlar!=0)
		{
			controllerare.newSale();
		}
		while (saleKlar!=0)
		{
			System.out.println("skriv item id:");
			String temp4 = in.next();
			SaleInfo infoSale = controllerare.register(temp4);
			int temp=infoSale.taItemAmount();
			int[] temp2 = infoSale.taValue();
			System.out.println("kostar "+temp2[temp-1]+"kr");
			System.out.println("vat: "+infoSale.taVAT());
			String[] temp3 = infoSale.taDesc();
			System.out.println("description: "+temp3[temp-1]);
			//end sale? mellan varje
			System.out.println("0 för att avsluta");
			saleKlar=in.nextInt();
		}
		System.out.println("totalt: "+controllerare.endSale());
		//enter amount paid
		System.out.println("enter payment: ");
		int temp5 = in.nextInt();
		System.out.println("i kassa: "+controllerare.payment(temp5));
		//höj pengar i kassa
		//reciept och change
		controllerare.lastMethod();
	}
}