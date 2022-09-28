public class SortAlgorithm {
	static public void bubbleSort(int arr[]) {
		for(int j=0;j<arr.length;j++) {
			for(int i=0;i<arr.length-1;i++){
				if((i+1)<=arr.length&&arr[i]>arr[i+1]) {
					int b = arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=b;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	static public void selectionSort(int arr[]) {	
		for(int j=0;j<arr.length;j++) {		
			int min=arr[j];
			int small=j;
			for(int i=j;i<arr.length;i++) {
				if(arr[i]<min) {
					min=arr[i];	
					small=i;
				}
			}
			if(j!=small) {
				arr[small]=arr[j];
				arr[j]=min;
			}			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
