/*Write a program where you have to print sum of integer from 90 to 11
Output : 4040*/
class Code8{
	public static void main(String[] args){
		int sum=0;
		int i=90;
		while(i>=11){
			sum+=i;
			i--;
		}
		System.out.println(sum);
	}
}
