/*Write a program to print the numbers divisible by 5 in the range 50 - 10.*/
class Code2{
	public static void main(String[] args){
		for(int i=50;i>=10;i--){
			if(i%5==0){
				System.out.println("Number divisible by 5 in range of 50-10 is"+i);
			}
		}
	}
}
