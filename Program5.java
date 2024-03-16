/*Write a program to print the countdown of days to submit the assignment

Input : day = 7
Output: 7 days remaining
6 days remaining
5 days remaining
.
.
1 days remaining
0 days Assignment is Overdue*/
class Code5{
	public static void main(String[] args){
		System.out.println("countdown of days to submit the assignment");
		int days=7;
		while(days>=0){
			System.out.println(days+ "days remaining");
			days--;
		}
	}
}
