import java.util.Scanner;
class Phone
{   
	String mobile;
	int cost,quantity,totalcost=0;
	double discount=0;
	public void method1()
	{
		System.out.println("hello what do you want to purchase");
		System.out.println("realme");
		System.out.println("redme");
		System.out.println("oneplus");
		System.out.println("samsung");
		System.out.println("moto");
		System.out.println("poco");
		System.out.println("oppo");
		System.out.println("vivo");
		do
		{
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter which mobile do you want?");
		String mobile=s.next();
		System.out.println("enter quantity");
		quantity=s.nextInt();
		switch(mobile)
		{
			case "realmi":
				cost=10000;
				totalcost=totalcost+cost*quantity;
				break;
			case "redmi":
				cost=22000;
				totalcost=totalcost+cost*quantity;
				break;
			case "oneplus":
				cost=100000;
				totalcost=totalcost+cost*quantity;
				break;
			case "samsung":
				cost=30000;
				totalcost=totalcost+cost*quantity;
				break;
			case "moto":
				cost=40000;
				totalcost=totalcost+cost*quantity;
				break;
			case "oppo":
				cost=50000;
				totalcost=totalcost+cost*quantity;
				break;
			case "vivo":
				cost=60000;
				totalcost=totalcost+cost*quantity;
				break;
		}
				System.out.println("do you want to purchase more");
				String decision=s.next();
				if(decision.equals("no"))
				{
					System.out.println("totalcost is"+totalcost);
					if(totalcost>100000)
					{
						discount=(80/100.0)*totalcost;
						System.out.println("discount you get"+discount);
					}
					else if(totalcost>50000)
					{
						discount=(60/100.0)*totalcost;
						System.out.println("discount you get"+discount);
					}
					else if(totalcost>20000)
					{
						discount=(20/100.0)*totalcost;
						System.out.println("discount you get"+discount);
					}
					else if(totalcost>10000)
					{
						discount=(10/100.0)*totalcost;
						System.out.println("discount you get"+discount);
					}
					else
					{
						System.out.println("you will not get discount and your totalcost is"+totalcost);
					}
					break;
		}
		}
				while(true);
		
		
	}
	
}
class Mobile
{
public static void main(String[] args) 
{
		Phone p=new Phone();
		p.method1();

	}

}