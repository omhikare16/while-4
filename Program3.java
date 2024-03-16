/*Write a program to print the numbers divisible by 4 and 7 in the range 50 - 100*/
class Code3{
	public static void main(String[] args){
		System.out.println("Number divisible by 4 and 7 are");
		int i=50;
		while(i<=100){
			if(i%4==0 && i%7==0){
				
				System.out.println(i);
			}
			i++;

		}
	
	}
}
