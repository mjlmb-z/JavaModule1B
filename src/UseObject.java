class Object {
    double AM3;
    double PCPF;
    double DSA;
    double DBMS;
    double JPL_Lab;

    double average(){
        return (AM3 + JPL_Lab + DSA + DBMS + PCPF) / 5;
    }
}

public class UseObject {
    public static void main(String[] args) {
        double avg1;
        Object a = new Object();

        a.AM3 = 8.5;
        a.PCPF= 9.0;
        a.DBMS= 8.7;
        a.DSA= 7.9;
        a.JPL_Lab=9.8;
        avg1=a.average();

        System.out.println("Average of all the subject ="+avg1);



    }
}