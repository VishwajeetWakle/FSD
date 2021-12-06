/*
Write a program to calulate time reaced to given destinantion. Accept following details from
the user
a. Name of destination
b. Distance to destination
c. Speed per Kilometer
d. No of breaks in journey
e. Time per break
*/
public class Assingnment14
{
	public static void main(String args[])
	{
		int dis = 5000; // distance in meter
		int speed = 60; // speed in meter/sec
		double time = dis/speed; // time in sec
		int noStop = 5; // number of stops
		int timeForStop = 10*noStop; // time per stop is 10 sec
		System.out.println("Total time : "+(time-timeForStop));
	}
}