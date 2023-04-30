package Arrays_pro;

public class max_subarray_sum {
	public static void main(String[] args) {
		//int arr[] = {5,4,-1,7,8};
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
	      int sum=arr[0];
	      int sum1=arr[0];
	      int temp_add=0;
	      for(int i=0;i<arr.length;i++){
	          
	          sum1=arr[i];
	          temp_add=arr[i];
	          for(int j=i+1;j<arr.length;j++){
	        	  sum1=sum1+arr[j];
	        	  if(temp_add>sum) {
	        		  sum=temp_add;
	        	  }    	  
//	        	  
	        }
	        if(sum1>sum){
	            sum=sum1;
	            temp_add=sum1;
	        }
	        
	    }	      
	      System.out.println(sum1);
	      System.out.println(sum);
	      System.out.println(temp_add);
	}
}
