/*
Write a program to display minimum denominations for a given value.
Note: Consider denominations of 500, 100, 50, 20, 10, 5, 2, 1
example: 1488 = (500 * 2) + (100 * 4) + (50 * 1) + (20 * 1) + (10 * 1) + (5 * 1) + (2 * 1) +
(1 * 1) 
*/
import java.util.*;
public class Assingnment15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Amount : ");
		    int rs  = sc.nextInt();
		int a= 0;
		int b= 0;
		int c= 0;
		int d= 0;
		int e= 0;
		int f= 0;
		int g= 0;
		int h= 0;

    while(rs >= 500)
    {
        a = rs / 500 ;
        System.out.println("The no. of 500 are : "+ a) ;
        break ;
    }
	rs = rs - a*500;
    while(rs >= 100)
    {   
        b = rs / 100 ;
        System.out.println("The no. of 100 are : "+ b) ;
        break ;
    }
	rs = rs - b*100;
    while(rs >= 50)
    {
        c = rs / 50 ;
        System.out.println("The no. of 50 are : " +c) ;
        break ;
    }
	rs = rs - c*50;
    while(rs >= 20)
    {
        d = rs / 20 ;
        System.out.println("The no. of 20 are : " +d) ;
        break ;
    }
	rs = rs - d*20;
    while(rs >= 10)
    {
        e = rs / 10 ;
        System.out.println("The no. of 10 are : " +e) ;
        break ;
    }
	rs = rs - e*10;
    while(rs >= 5)
    {
        f = rs / 5 ;
        System.out.println("The no. of 5 are : " +f) ;
        break ;
    }
	rs = rs - f*5;
    while(rs >= 2)
    {
        g = rs / 2 ;
        System.out.println("The no. of 2 are : " +g) ;
        break ;
    }
	rs = rs - g*2;
    while(rs >= 1)
    {
        h = rs / 1 ;
        System.out.println("The no. of 1 are : " +h) ;
        break;
    }
	}
}