/*Five Bikers Compete in a race such that they drive at
a constant speed which may or may not be the same as
the other. To qualify the race, the speed of a racer must
be more than the average speed of all 5 racers. Write a
Java program to take as input the speed of each racer
and print back the speed of qualifying racers.*/

public class racer {
    public static void main(String[] args)
    {
        float a[]= new float[5],avg= 0.0F;
        a[0]= (float) 19.7;
        a[1]=(float)19.9;
        a[2]=(float)21.3;
        a[3]=(float)22.1;
        a[4]=(float)19.3;

        int i;
        for(i=0;i<5;i++) {
            avg = avg + a[i];
        }
        float z=avg/5;
        for(i=0;i<5;i++)
        {
            if(a[i]>z){
                System.out.println("\nRacer is qualified.");
            }
            else{
                System.out.println("\nRacer is not qualified.");
            }
        }

        System.out.println(" ");
    }
}
