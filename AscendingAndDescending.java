import java.util.Scanner;  //Scanner is a library that we import in java to take input from user
import java.util.Arrays;  // Arrays is a library to create a collection of data(letters , numbers, sentences , words)

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // To take input from user: create object of Sacnner you can give it any name like input or x or  y  or z
        int[] numbers = new int[3]; // Creating Array , Integer datatype, name could be any : array1

        // Prompt user for input
        System.out.println("Enter three integers:");
        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextInt();
        }

        // Sort array in ascending order
        Arrays.sort(numbers);
        System.out.println("Ascending order: " + Arrays.toString(numbers));

        // Print array in descending order
        System.out.println("Descending order: " + numbers[2] + ", " + numbers[1] + ", " + numbers[0]);
        
        input.close();
    }
}


