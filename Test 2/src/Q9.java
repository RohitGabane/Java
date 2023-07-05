//Q.9 print 2nd largest and 2nd smallest element from a given integer array 

 public class Q9 
{
    	public static void main(String []args)
		     {
		         
		         
		         
		         int arr[]= {5,10,0,2,3,4};  
	             System.out.println("Enter the array");  
	                   
	        for(int i=0;i<arr.length;i++)     
	        {
	            for(int j=i+1;j<arr.length;j++)   
	            {
	                if(arr[i]<arr[j])    
	                {
	                    int temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	        }
	        
	        System.out.println("Second Largest element is "+arr[1]);   
	        System.out.println("Second Smallest element is "+arr[arr.length-2]);  
	    }
	}


