package javaProgrammings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DebTheoram {

	/*
	 * Logic: For Minimum/smallest number in an array #1: Assume the first index
	 * i:e "0" of an array is the min/smallest number #2: Get the size of an
	 * array and then iterate it.. Iteration should be start form 1.. #3:
	 * Compare the first index with others
	 * 
	 */
	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum value in the array list is: " + min);
	}

	/*
	 * Ex: Debashis... index count starts from 0 .. total length 8 iteration
	 * will be from 7 to 0.. total iteration will be 8
	 */
	public static String reverseString(String str) {

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	//Reverse method
	public static int reverseNumber(int n){
		
		int p=n;
		int r;
		int rev=0;
		while(p >0){
			p=p/10;
			r= p%10;
			
			rev= rev*10+r;
		}
		return rev;
		
	}
	
	private static String secondMostRepeatingWord(String string) {

		HashMap<String,Integer> map= new HashMap<>();
		for(String str:string.split(" ")){
			if(!map.containsKey(str)){
				map.put(str, 1);
			} else {
				map.put(str,map.get(str)+1);
			}
		}	
		
		TreeMap<Integer, String> finalMap = new TreeMap<>();
		for(String word : map.keySet()){
			finalMap.put(map.get(word), word);
		}
		
		
		System.out.println("Map ===="+map);
		System.out.println("TreeMap ===="+finalMap);
		return finalMap.size()<2? finalMap.get(finalMap.keySet().toArray()[finalMap.size()-1]):
				finalMap.get(finalMap.keySet().toArray()[finalMap.size()-2]);
		
	}
	
	
	public static Set<String> duplicateWords(String str){
		Set<String> hashString = new HashSet<>();
		Set<String> duplicateWords= new HashSet<>();
		//check whether the string is null or not
		if(str==null || str.isEmpty()){
			return Collections.emptySet();
		}
		
		//Split the words with space
		String[] words= str.split(" ");
		for(String outputWords: words){
			
			if(!hashString.add(outputWords)){
				duplicateWords.add(outputWords);
			}
			
		}
		return duplicateWords;
		
	}
	public static ArrayList<Integer> smallestAndLargest(int[] intarr){
		ArrayList<Integer> arrIntlist = new ArrayList<>();
	int smallest=intarr[0];
	int largest= intarr[0];
	for(int i=1;i< intarr.length;i++){
		if(intarr[i] > largest){
			largest=intarr[i];
		}
		else if (intarr[i] < smallest) {
			smallest=intarr[i];
			}
	}
	System.out.println("smallest::"+smallest);
	System.out.println("largest:::"+largest);
	
		arrIntlist.add(smallest);
		arrIntlist.add(largest);

		return arrIntlist;
		
	}
	
	public static void duplicateWordOccurences(String str){
		
		Map<String, Integer> duplicateWords= new HashMap<String, Integer>();
		String[] strArr= str.split(" ");
		for(String word: strArr){
			String lcaseword= word.toLowerCase();
			if(duplicateWords.containsKey(lcaseword)){
				
				duplicateWords.put(lcaseword, duplicateWords.get(lcaseword)+1);
				
			}else{
				duplicateWords.put(lcaseword, 1);
				
			}
			//System.out.println(duplicateWords.entrySet());
			//Print
			
		}
		for(Map.Entry<String, Integer> entry : duplicateWords.entrySet()){
		System.out.println(entry.getKey()+ "\t\t " + entry.getValue());
	}	
		
	}
	
	public static int wholeIntAddition(int intVal){
		
		int n= intVal;
		int p = n;
		int r;
		int sum=0;
		while(p!=0){
			
			r= p%10;
			sum=sum+r;
			p=p/10;
					
		}
		return sum;
		
		
	}
	
	public static void checkVowels(String str){
		
		char[] charArr=str.toLowerCase().toCharArray();
		char[] vowels={'a','e','i','o','u'};
		
		for(int i=0;i< charArr.length;i++){
			for(int j=0;j<vowels.length;j++){
				if(charArr[i]==vowels[j]){
				System.out.println("Matched: "+ charArr[i]);
			}
		}

		}
		
	}
	
	
	public static int[] bubbleSort(int[] inta){
		
		 //int[] intarr= { 4, 2, 9, 6, 23, 12, 34, 0, 1 };//{1,2,3,1000,89,40,200,31,5000};
		  
		int[] intarr =inta;
		
		  System.out.println(intarr.length);
		  
		  for(int i=0;i< intarr.length;i++){
			  for(int j=0;j< intarr.length;j++){
				 if(intarr[i] < intarr[j]){
					  //Perform swap operation
					 int temp = intarr[i];
					  intarr[i] = intarr[j];
					  intarr[j] = temp;
				  
				  /*if(intarr[i] > intarr[j]){
					  //Perform swap operation
					 int temp = intarr[i];
					  intarr[i] = intarr[j];
					  intarr[j] = temp;*/
				  }
			  }
		  }
		  for (int i = 0; i < intarr.length; i++) {
	          System.out.print(intarr[i]+", " );
		  }
		  
		   
		  return intarr;
	}
	
	public static void reverseIntArray(int[] intArr){
		
		//http://javaconceptoftheday.com/reverse-an-array-in-java/
		/*
		Step 1 : Let inputArray be the given array.
        Step 2 : Iterate over only half of the inputArray (inputArray.length / 2). For every ith element, swap it with (inputArray.length-1-i)th element.

			for (int i = 0; i < inputArray.length/2; i++)
				{
          temp = inputArray[i];

          inputArray[i] = inputArray[inputArray.length-1-i];

          inputArray[inputArray.length-1-i] = temp;
}
		*/
		 // int[] iarr= {1,2,3,4,5};
		  int iallLength= intArr.length;
		  
		  //iterate the half the the array length
		  for(int i= 0;i<iallLength/2;i++){
			  //perform swap operation
			  int temp=intArr[i];
			  intArr[i]= intArr[intArr.length-i-1];
			  intArr[intArr.length-i-1]=temp;
		  }
		  System.out.println(Arrays.toString(intArr));
	}
	
	public static void repeatedString(String[] strArr){
		
		 // strArr={"abc","def","abc","xyz","ijk","uvw","abc","xyz"};
		  HashSet<String> hlist= new HashSet<String>();
		  for(int i=0;i<strArr.length;i++){
			 /* System.out.println("intration for i: "+ i);
			  System.out.println(strArr[i]);*/
			  for(int j=1;j<strArr.length;j++){
				 // System.out.println("intration for j: "+ j);
				  if(strArr[i]==strArr[j] && i!=j){
					 /* System.out.println("duplicate string from string arry is: "+ strArr[j]);
					  System.out.println(strArr[i]+ " " + strArr[j]);*/
					  hlist.add(strArr[i]);
					  //System.out.println("Duplicate string in array is: "+ strArr[i]); 
				  }
				  
			  }
			
			
		  }System.out.println(hlist);
	}
	
	
	public static void main(String[] args) {
 
		/*
		 * int a[] = { 100, 23, 1, 4, 5 }; min(a);
		 */

//		System.out.println(reverseString("Debashis"));
		
//		System.out.println("Rever of the given numbre is: "+ reverseNumber(121));
		
		//System.out.println(secondMostRepeatingWord("abc ddd abc test abc ddd test"));
		
//		System.out.println("Duplicate words::::" +  duplicateWords("This sentence contains two words, one and two This"));
		
		  /*int[] intarr= {1,2,3,1000,89,40,200,31,5000};
		  smallestAndLargest(intarr);*/
		
//		duplicateWordOccurences("Science blank Maths blank blank Physics blank Maths");
		
//		System.out.println(wholeIntAddition(1234));
//		checkVowels("Abcxyzo asdf adfadsfa j j oiu j i");
		
	//bubbleSort(new int[] {4, 2, 9, 6, 23, 12, 34, 0, 1 });
//		reverseIntArray(new int[]{4, 2, 9, 6, 23, 12, 34, 0, 1});
		repeatedString(new String[]{"abc","def","abc","xyz","ijk","uvw","abc","xyz"});
		
		
	}

}
