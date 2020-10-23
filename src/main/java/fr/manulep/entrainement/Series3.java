package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.annotations.VisibleForTesting;

public class Series3 {
	
	private Series3() {
	    throw new IllegalStateException("Training class");
	  }



/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	@VisibleForTesting
	protected static int[] sortTabBySelection(int[] array) {

		List<Integer> swapingArray = new ArrayList<>();
		int compteur = 0;
		int[] sortedArray = new int[array.length];
		for(int number : array){
			swapingArray.add(number);
		}

		
		//put in order
		for( int i = 0 ; i < swapingArray.size()-1; i++ ){
			for(int y = i+1; y <swapingArray.size(); y++){
				if(swapingArray.get(i) > swapingArray.get(y)){
					Collections.swap(swapingArray, i, y);
					System.out.println(Arrays.toString(swapingArray.toArray()));
					compteur++;
			   }else{
				System.out.println(Arrays.toString(swapingArray.toArray()));
				
			   }

			}
			
		}
		int i = 0;
		for (int number : swapingArray){
			
			sortedArray[i] = number;
			i++;
		}
		System.out.println("Nombre d'échange: " + compteur);
		return sortedArray;
	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static int[] sortTabByInsertion(int[] array) {

		List<Integer> swapingArray = new ArrayList<>();
		int compteur = 0;
		int[] sortedArray = new int[array.length];
		int min;

		for(int number : array){
			swapingArray.add(number);
		}
		
		System.out.println(Arrays.toString(swapingArray.toArray()));
		for(int i = 0 ; i<swapingArray.size()-1; i++ ){
		
			min = swapingArray.get(i);
		
			for(int j = i+1; j < swapingArray.size();j++){
				
				if(swapingArray.get(j) < swapingArray.get(swapingArray.indexOf(min))){
					min = swapingArray.get(j);
				}
				
			}
			
			if(swapingArray.get(swapingArray.indexOf(min)) != swapingArray.get(i)){
				
				Collections.swap(swapingArray, i, swapingArray.indexOf(min));
				compteur++;
				
			}
			System.out.println(Arrays.toString(swapingArray.toArray()));
		}
		int i = 0;
		for (int number : swapingArray){
			
			sortedArray[i] = number;
			i++;
		}

		System.out.println("Nombre d'échange: " + compteur);
		return sortedArray;


	}


/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static int[] sortTabByBubble(int[] array) {

		List<Integer> swapingArray = new ArrayList<>();
		int compteur = 0;
		int[] sortedArray = new int[array.length];
	

		for(int number : array){
			swapingArray.add(number);
		}
		
		System.out.println(Arrays.toString(swapingArray.toArray()));
		for(int i = swapingArray.size()-1 ; i> 0; i-- ){
		
			for(int j = 0; j < i;j++){
				
				if(swapingArray.get(j+1) < swapingArray.get(j)){
					Collections.swap(swapingArray, j, j+1);
					compteur++;
					System.out.println(Arrays.toString(swapingArray.toArray()));
				}
				
			}
			
		}
		int i = 0;
		for (int number : swapingArray){
			
			sortedArray[i] = number;
			i++;
		}

		System.out.println("Nombre d'échange: " + compteur);
		return sortedArray;
	}
	

/* ----------------------------------------------------------------------------------------------------- */


/* ----------------------------------------------------------------------------------------------------- */




	public static int findIndexByDichotomy(int element, int[] array) {

		List<Integer>searchList = new ArrayList<>();
		for(int number : array){
			searchList.add(number);
		}

		int j = 0;
		for(int i = array.length -1; i>j ; i--){
			if(searchList.get(i) == element){
				return searchList.indexOf(searchList.get(i));
			}else if(searchList.get(j) == element){
				return searchList.indexOf(searchList.get(j));
			}
		}
		return -1;
	}

}
