import java.util.*;
public class Hello {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int[] numbers = new int[n];
	    for(int i =0;i<n;i++)
	        numbers[i]=sc.nextInt();
	        
	    int max = Integer.MIN_VALUE;
	    int firstDigit = 0;
	    int secondDigit = 0;
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(numbers[i]*numbers[j]>max)
	            {
	                max = numbers[i]*numbers[j];
	                if(numbers[i]>numbers[j])
	                {
	                    firstDigit = numbers[j];
	                    secondDigit = numbers[i];
	                }
	                else
	                {
	                    firstDigit = numbers[i];
	                    secondDigit = numbers[j];
	                }
	            }
	        }
	    }
	    System.out.println(firstDigit+" "+secondDigit);
	}
}
