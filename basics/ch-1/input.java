import java.util.*;

public class input{
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        //String name = sc.next(); //next takes one single token
        //String name = sc.nextLine();

        // nextInt()
        //nextFloat()

        //System.out.println(name);

        // take two variables a and b from user and print their sum

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum  = a+b;
        System.out.println(sum);
    }
}