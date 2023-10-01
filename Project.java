package com.promineotech;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = new int[8];
		
			ages[0] = 3;
			ages[1] = 9;
			ages[2] = 23;
			ages[3] = 64;
			ages[4] = 2;
			ages[5] = 8;
			ages[6] = 28;
			ages[7] = 93;
		// Programmatically subtract the value of the first element in the array from the value in the last 
		//element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		int x = ages[6+1] - ages[0];
		System.out.println(x);
		
		//Create a new array with 9 elements (one more than the ages array)  
		//Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int [] ages2 = {5,80,6,15,27,35,30,29,110};
			int y = ages2[7 + 1] - ages2[0];
			System.out.println(y);
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			int length = ages2.length;
			int sum = 0; 
				for(int i = 0; i < ages2.length; i ++) {
					sum += ages2[i];
				}
					double average = sum / length;
					System.out.println("Average age :" +average);
	//. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, 
	//“Sally”, “Buck”, “Bob”.
					
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			 int sumOfLetters = 0;
			 	for(String name : names) {
			 		sumOfLetters += names.length;
			 		
			 	}
			 	//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces,
			 	//and print the result to the console.
			 	
			 	System.out.println(sumOfLetters/names.length);
				String allNames = "";
				for(int i = 0; i < names.length; i++) {
					allNames += names[i] + " ";
				}
			 	System.out.println(allNames);
			 	
	//3. How do you access the last element of any array?
			 	
		    System.out.println("Use array[arr.length] to access the last element of an array");
		    
		//4. How do you access the first element of any array?
		    
		    System.out.println("Use array[0] to access the first element of an array");
		    
		    //5. Create a new array of int called nameLengths. Write a loop to iterate over the 
		    //previously created names array and add the length of each name to the nameLengths array.
			
			 int[] nameLengths = new int[names.length];
			 for(int i = 0; i < names.length; i ++) {
				 nameLengths[i] = names[i].length();
			 }
			//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the 
			 //elements in the array. Print the result to the console.
			 	
			 sum = 0;
			 for(int i = 0; i < nameLengths.length; i++) {
				 sum += nameLengths[i];
			 }
			 System.out.println("The sum of all the lengths in nameLengths array = " + sum);
			 System.out.println( newWord("Hello", 5));
			 System.out.println(  fullName("Nick", "Wolf"));
			 System.out.println( isGreaterThan(ages));
			 
			//#10
				double[] array2 = new double[] {12, 25, 78, 60};;
				System.out.println( average(array2));
				
			//#11
				double[] array3 = new double[] {5, 86, 25, 14, 35};
				System.out.println(isAverageGreater(array2, array3));	
			 
				
				//#12
				System.out.println( willBuyDrink(true, 11.50));
				
				
				//#13
				System.out.println("Your Electric Bill is:"+ (2871 * .10) + (30 + 23.66));
				
	}// end main			 
			 
			// 7. Write a method that takes a String, word, and an int, n, as arguments and 
			// returns the word concatenated to itself n number of times. (i.e. if I pass in 
			//“Hello” and 3, I expect the method to return “HelloHelloHello”).
	
			public static String newWord(String word, int n) {
				String newWord1 = "";	
				for (int i = 0; i <= n; i++) {
					newWord1 += word;
		}
				return newWord1;
		
	}
	
		

			 
		//8. Write a method that takes two Strings, firstName and lastName, and returns a 
			 //full name (the full name should be the first and the last name as a String separated by a space).
			
			public static String fullName(String firstName, String lastName) {
	
				return firstName + " " + lastName;
}

		
			
			//9. Write a method that takes an array of int and returns true if the sum of all the ints in the 
			//array is greater than 100.
			
			public static boolean isGreaterThan(int[] ages)	{
					int sum =0;
						for (int i : ages) {
							sum += i;
	}
						if (sum  < 100)
							return true;
						else 
							return false;
			}

			
				
			//10. Write a method that takes an array of double and returns the average 
			// of all the elements in the array.
			
			public static double average(double array2[]) {
	 
					double newSum = 0;
						for (int i = 0; i < array2.length; i++) {
							newSum += array2[i];
	
							}
						return newSum / array2.length;
			}			
			

			
			 //11. Write a method that takes two arrays of double and returns true if the average 
			//of the elements in the first array is greater than the average of the elements in the second array.
		

				public static boolean isAverageGreater(double array2[], double array3[]) {
						double newSum1 = 0;
						double newSum2 = 0;

						{
							for (int i = 0; i < array2.length; i++) {
								newSum1 += array2[i];
							}
	
							for (int j = 0; j < array3.length; j++) {
								newSum2 += array3[j];}
						}
							if ((newSum1 / array2.length) > (newSum2 / array3.length)) 
								return true;
							else 
								return false;
				}


          //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
         //and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

				public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) 
       {
					if(isHotOutside == true && moneyInPocket > 10.50) {
						return true;
					}else {
						return false;
		  }}
		   
   
		  // 13. Create a method of your own that solves a problem. In comments, write what the method 
		   //does and why you created it.
		   // For this method we are going to get the total of electric bill. 
		public static double electricBill(double kwh)
		{
			double kwhUsed = 2871;
		double costOf = .10;
			double kwhCharge =kwhUsed * (costOf);
			System.out.println(kwhCharge);
			
			int monthlyFee = 30;
			double salesTax = 23.66;
			double total = kwhCharge + monthlyFee + salesTax;
			
			return total ;
			
		}
		
}

