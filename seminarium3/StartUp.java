class StartUp
{
	public  void main (String[] args)
	{
		//Classen l = new Classen(s,f);
		int programKlar=0;
		java.util.Scanner in = new java.util.Scanner(System.in);
		while (!(programKlar==3))
		{
			System.out.println("skriv 1 för program, 2 för tester och 3 för att avsluta:");
			programKlar=in.nextInt();
			if(programKlar==1)
			{
				//Controller controllerare = new Controller();
				View vy = new View();
				ExternalHandler fakeExternSak =new ExternalHandler();
				//Id identifikation = new Id();
				SaleInfo infoSale = new SaleInfo();
				vy.roligMetodSomFixarSaker();
			}
			/*




			tester
			|
			|
			|
			V




















			*/
			if(programKlar==2)
			{

				beforeAllTest();

			}
			//här kod klar
		}
	}
	public void beforeAllTest()
					{
				}
}





