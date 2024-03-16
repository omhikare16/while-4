/*10.Write a program to print the numbers in the range 100 - 24 which are divisible by
4 & 5.
Output: 100,80,60,40*/
class Code10{
	public static void main(String[] args){
		int i=100;
		while(i>=24){
			if(i%4==0 && i%5==0){
				System.out.println(i);
				
			}
			i--;
		}
	}
}
