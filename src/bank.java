/*Pooja would like to withdraw X $US from an ATM.
The cash machine will only accept the transaction if X is a multiple of 5,
and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges).
For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction.*/

public class bank {
    public static void main(String[] args)
    {
        float total=10000F,x = 0.0F;
        if(x%5==0 && x<total && x!=0){
            total=total-x-(float)0.05;
            System.out.println("\nTransaction Successful.\nThe total remaining amount:\t"+total);
        }
        else{
            System.out.println("\nTransaction unsuccessful.");
        }

    }
}
