//Q.5 Least avg subarray
public class Q7 
{    
    static int arr[] = new int[] { 3, 7, 90, 20, 10, 50, 40 };
 
    static void leastavg(int n, int k)
    {
        if (n < k)
            return;
        int r = 0;
        int s = 0;
        for (int i = 0; i<k; i++)
            s += arr[i];
  
        int m = s;
        for (int i =k; i<n; i++) 
        {
            s += arr[i] - arr[i- k];
  
            if (s < m) {
                m = s;
                r = (i-k+1);
            }
        }

        System.out.println("Subarray between [" +r + ", " + (r+k-1) + "] has minimum average");
    } 
    public static void main(String[] args)
    {
        int k = 3; 
        leastavg(arr.length, k);
    }
}