
package sortring;

public class CountSort {
    public void sort(int arr[]){
         int n = arr.length; 
        char arr1[] = new char[n]; 
  
        int c[] = new int[256]; 
        for (int i=0; i<256; ++i) 
            c[i] = 0; 
        for (int i=0; i<n; ++i) 
            ++c[arr[i]]; 
        for (int i=1; i<=255; ++i) 
            c[i] += c[i-1]; 
  
        for (int i = n-1; i>=0; i--) 
        { 
            arr1[c[arr[i]]-1] = (char) arr[i]; 
            --c[arr[i]]; 
        } 
  
      
        for (int i = 0; i<n; ++i) 
            arr[i] = arr1[i]; 
    }
    
     public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        CountSort ob = new CountSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        System.out.println(Array.toString(arr));
    
     }


    private static class Array {

        private static boolean toString(int[] arr) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Array() {
        }
    }}
     
    

