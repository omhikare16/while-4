/*Write a program to print the square of the first 10 natural numbers in reverse
manner.
Output : 100 81 64 49 36 25 16 9 4 1*/
class Code4{
	public static void main(String[] args) {
        System.out.println("Square of the first 10 natural numbers in reverse manner:");

        int number = 10;
        while (number >= 1) {
            int square = number * number;
            System.out.print(square + " ");
            number--;
        }
    }
}
