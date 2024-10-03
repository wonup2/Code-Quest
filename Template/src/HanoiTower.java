/*
https://lmcodequestacademy.com/problem/tower-of-hanoi
2016 #15
*/

public class HanoiTower{
	static void towerOfHanoi(int n, char from, char to, char temp)	{
		if (n == 1)	{
			System.out.println("disk 1: " + from + "->" + to);
			return;
		}
		towerOfHanoi(n-1, from, temp, to);
		System.out.println("disk " + n + ": " + from + "->" + to);
		towerOfHanoi(n-1, temp, to, from);
	}
	
	public static void main(String args[]){
		int n = 3; // Number of disks
		towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
	}
}
