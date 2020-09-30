import java.util.Scanner;
public class Ifstatement 
{
    public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		                             // TODO Auto-generated method stub
		
		int a;
		for(a=0; a<3 ; a++) {
			
			
			System.out.print( "Enter student name: ");
			Scanner scan = new Scanner(System.in);
			String name1 = scan.next();


			
			int mark;
			char grade='F' ;
			System.out.print( "Please enter their mark: ");
			 mark=sc.nextInt();       ///Looks for number input under variable 'mark'
			 if (mark>=80)
					{
							grade='A';
					}
			
				else if(mark>=70 && mark<=80)
							{
									grade='B';
							}
			
					else if (mark>=60 && mark<=70)
								{
										grade='C';
								}
						else if (mark>=50 && mark<=60)
									  {
												grade='F';
								  }
			
		System.out.println(name1 + "'s grade is " +grade);
	
		}
	}
}
		
		
	
