/*
16) accept 3 digit number and display whether it is armstrong or not.
	[ A number is called as armstrong number if sum of cubes of digits of number is equal to the number itself ]*/
import java.util.Scanner;
class ArmstrongNum {
    public static void main(String[] args) {
        int Num, dig, cubeSum = 0,x;
        
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System. in );
        x = sc.nextInt();
        Num = x;
        while (x!= 0)
        {
            dig = x % 10;
            cubeSum += (dig*dig*dig);
            x /= 10;
        }
        if(cubeSum == Num)
            System.out.println(Num+ " is an Armstrong number");
        else
            System.out.println(Num+ " is not an Armstrong number");
    }
}
