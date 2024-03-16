/*Write a program to print the cube of the first 10 natural numbers.
Output : 1 8 27 64 125 216 343 512 729 1000*/
class Code7{
	public static void main(String[] args){
		int i=1;
		while(i<=10){
			int Square=i*i*i;
			System.out.println(Square);
			i++;
		}
	}
}

