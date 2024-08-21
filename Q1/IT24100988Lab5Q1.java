import java.util.Scanner;
public class IT24100988Lab5Q1
{
  public static void main(String[]args)
   
  {
     Scanner value =new Scanner(System.in);
    int integer1,integer2,integer3;
   
    
	  System.out.print(" Enter the first integer :");
	  integer1=value.nextInt();
	  
	  	  System.out.print(" Enter the Second integer :");
	         integer2=value.nextInt();
			 
			 	  System.out.print(" Enter the third integer :");
	                integer3=value.nextInt();
					
					
					int smallest= integer1;
					
					if (smallest>integer2){
					           smallest=integer2;}
					
				    if (smallest>integer3){
					            smallest=integer3;}
					
					
					
					int largest=integer1;
					
					if (largest<integer2){
					      largest=integer2;}
					
					 if (integer2<integer3){
					        largest=integer3;}
					
				
					
					
					System.out.println("user entered numbers  are :" +integer1+"    " +integer2+"    " +integer3);
					System.out.println("The smallest number is:" + smallest);
					System.out.println("The Largest number is:" + largest);
					
					
					
					
					
					
					
					
					
					
					
					
					
					
  }
}  