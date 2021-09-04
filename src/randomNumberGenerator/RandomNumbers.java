package randomNumberGenerator;

import java.util.Random;

public class RandomNumbers {
	
	public static void main(String[] args) {
//    	Random objGenerator = new Random();
//    	int iCount;
//    	int[]number = new int[500];
//    	int smallest = number[0];
//        for (iCount = 0; iCount<500; iCount++){
//        
//        System.out.println(objGenerator.nextInt(500));  
//        System.out.println("Smallest number is : " +smallest);   
		
		 Random rnum = new Random();
	      int counter;
	      int[] numbers = new int[ 500 ]; // you want 500 numbers ; so size should reflect that.
	      numbers[0] = rnum.nextInt(1000); // Init First number
	      int largest = numbers[0]; //Set it as largest
	      int smallest = numbers[0]; // Set it as smallest
	      for (counter = 1 ; counter <  500; counter++) 
	      {
	          numbers[counter ] = rnum.nextInt(1000); //Store numbers;
	          largest = Math.max( largest , numbers[counter ] ); //Compare with previous largest
	          smallest = Math.min( smallest , numbers[counter ] );  //Compare with previous smallest
	          
	          System.out.println(rnum.nextInt(500));  
	          System.out.println("Smallest number is : " +smallest);

	      }
        }
	}

         
 



