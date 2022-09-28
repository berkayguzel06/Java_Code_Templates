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
	//Sort two sorted array
	static public void mergeSort(int arr1[],int arr2[]) {	
		int lenght = arr1.length+arr2.length;
		int full[] = new int[lenght];
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=0;i<lenght;i++) {
			if(count2>=arr2.length) {
				for(int j=count1;j<arr1.length;j++) {
					full[count3]=arr1[j];
					count3++;
				}
				break;
			}
			else if(count1>=arr1.length) {
				for(int j=count2;j<arr2.length;j++) {
					full[count3]=arr2[j];
					count3++;
				}
				break;
			}
			else if(arr1[count1]<arr2[count2]) {
				full[count3]=arr1[count1];
				count1++;
				count3++;
			}
			else if(arr1[count1]>arr2[count2]) {
				full[count3]=arr2[count2];
				count2++;
				count3++;
			}	
		}
		for(int i=0;i<full.length;i++) {
			System.out.println(full[i]);
		}
	}
}
