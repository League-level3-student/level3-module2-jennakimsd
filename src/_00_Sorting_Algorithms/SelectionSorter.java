package _00_Sorting_Algorithms;

public class SelectionSorter extends Sorter {
	public SelectionSorter() {
		type = "Selection";
	}
	
	//  You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		//1. make a for loop to iterate through all but the last 
		//   element of the array
		for(int i = 0; i < array.length - 1; i ++) {
			//2. create an integer called index and set it equal to i
			int index = 1;
			//3. make another for loop that starts at i + 1 and
			//   goes through the entire array
			for(int j = i+1; j < array.length; j++) {
				//4. if the array element at j is less than the 
				//   element at index, then set index equal to j
				if(array[j]<index) {
					index = j;
				}
			//5. swap the array element at index with the array element at i
				 int temp = array[index]; 
                 array[index] = array[i]; 
                 array[i] = temp;  
			}
		}	
		
	}
}
