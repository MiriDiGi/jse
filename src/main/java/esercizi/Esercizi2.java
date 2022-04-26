package esercizi;

import java.util.ArrayList;

import java.util.Scanner;

public class Esercizi2 {

	public static void main(String[] args) {
	

		 ArrayList<Integer> nums = new ArrayList <> ();                  //devo creare un arraylist
		 System.out.println("passami interi");          //posso mettere il numero di interi che vuole
		 try (Scanner scanner = new Scanner (System.in)) {
			 	while (scanner.hasNext()) {            
			 		if (scanner.hasNextInt()) {                     
			 			nums.add(scanner.nextInt());
			 		}
			 	}
		 	} bigDiff(nums);
	}

	   
	   public static int bigDiff(ArrayList<Integer> nums) {
		   
		   if (nums == null || nums.isEmpty()) {
			   throw new IllegalArgumentException();
		   }
		   
		   int min = nums.get(0);
		   int max = nums.get(0);
		   for (int i = 0; i <nums.size(); i++) {
		     if (max < nums.get(i)) {
		       max = nums.get(i);
		     } else if (min > nums.get(i)) {
		       min = nums.get(min);
		     }
		 }
		 return max - min;
		 }

	   
}
