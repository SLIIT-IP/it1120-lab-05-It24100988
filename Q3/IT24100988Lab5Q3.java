import java.util.Scanner;
     public class IT24100988Lab5Q3
{
    public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);
	
	int startdate, enddate, numberofday;
	double total_amount;


	   final int room_charge_per_date = 48000;
	   final double discount10=0.1;
	   final double discount20=0.2;
	
	

    
	System.out.print(" Enter start Date (1-31) : ");
      startdate = input.nextInt();
	  
    System.out.print(" Enter End Date (1-31) : ");
      enddate = input.nextInt();
	  
	  
	 if (startdate < 1 || startdate > 31 && enddate < 1 || enddate > 31 )
	       {    System.out.print(" Error : Days must be between 1 and 31 ");
		  
			return; }
	  
	  if (startdate > enddate)
	  {System.out.print(" Error : start Date must be less than End Date ");
	  
	         return ;}
	  
	  
			 numberofday = enddate - startdate;

			 total_amount = room_charge_per_date*numberofday;

	  
	    if  ( numberofday >= 3 && numberofday <= 4)
		  {
	        total_amount = total_amount-(total_amount*discount10); 
		   }
	  
	  else if ( numberofday >= 5 )
	       {
			 total_amount= total_amount- (total_amount*discount20);
		   }
	  
	  
	  
	   System.out.println("\n Room charge per Days Reserved : 48000.0/= ");
	  
	  System.out.println(" Number of Days Reserved : "+numberofday);
	  
	  System.out.println(" Total Amount to be paid : "+total_amount);
	  
	  
	  
	  
	  
	  
	  
}
}