//Q.3 Given an input String write a program to reverse the string by the word in the string 
class Q3 
{
    public static void main (String[] args) 
    { 
        String s1= "vita is Good ", reverse="";        
      System.out.print("Original word: ");
      System.out.println("vita");
       
      for (int i=0; i<s1.length(); i++)
      {
        char ch= s1.charAt(i); 
        reverse= ch+reverse; 
        System.out.println("Reversed word: "+ reverse);
      }
  }
}