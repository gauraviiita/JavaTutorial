// make a program that takes radius of a circle and print the area of circle.

import java.util.Scanner;

public class quiz2{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double pi = 3.14;
        double area = pi*r*r;
        System.out.println(area);
    }
}