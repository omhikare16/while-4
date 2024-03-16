/*Write a program to print the sum of odd numbers from 150 to 101.
Output : 3125*/
class Code9{
	public static void main(String[] args){
		int sum=0;
		int i=150;
		while(i>=101){
			if(i%2!=0){
				sum+=i;
			
			}
			i--;
		}
		System.out.println(sum);
	}
}
