
package com.mycompany.minheap;
public class Minheap {

     public static void main(String args[]) {
         /*50150076077 Ahmet hasan GÜLTEKİN 2.ogretim */
 int[] arr;
 arr=new int[10];
   int [] sayilar = {1,2,3,4,5,6,7};
  int i;
   /*
Max Heap (root en büyük eleman):
A[PARENT(i)] ≥ A[i]
Min Heap (root en küçük eleman):
A[PARENT(i)] ≤ A[i]*/
        for(i=0;i<sayilar.length;i++){
            System.out.print(" ");
            arr[i]=sayilar[i]; 
            System.out.print(arr[i]);
        }
         System.out.println("");
        //A[PARENT(i)] ≤ A[i]
        if(arr[i]<=arr[i+1]){  
        System.out.println("dizi min heaptır");}
            else{System.out.println("dizi minheap değildir"); 
       }
         
    //        System.out.println(dizi[i]);
           Minheap.MaxHeapify(arr, i);
           Minheap.BuildMaxHeap(arr);
           Minheap.MaxHeapify(arr, i);
           if(arr[i]<=arr[i+1]){  
        System.out.println("dizi min heaptır");}
            else{System.out.println("dizi minheap değildir"); 
       }
           
           for(i=0;i<arr.length;i++){
               System.out.print("*");
               System.out.print(arr[i]);
           } 
           
           System.out.println("");
          
           
           
           
           
        }
     
     public static void MaxHeapify( int[ ] arr, int i )
{
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int largest = i;

    if( left < arr.length && arr[ left ] > arr[ largest ] )
        largest = left;
    if( right < arr.length && arr[ right ] > arr[ largest ] )
        largest = right;
    if( largest != i )
    {
        int temp = arr[ i ];
        arr[ i ] = arr[ largest ];
        arr[ largest ] = temp;
        MaxHeapify( arr, largest );
    }
}
     public static void BuildMaxHeap( int[ ] arr )
{
    for( int i = (int)Math.floor(arr.length/2);i >= 0; i--)
        MaxHeapify( arr, i );
}
     public static void HeapSort(int[ ] arr )
{
    int heapSize=arr.length;
    BuildMaxHeap(arr);
    for( int i = heapSize;i >= 0; i=i-2)
    {
        int temp = arr[ i ];
        arr[ i ] = arr[ 1 ];
        arr[ 1 ] = temp;
        heapSize=heapSize-1;
        MaxHeapify( arr, 1 );
    }
}
     
    }

