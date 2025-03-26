import java.util.Scanner;


class maxheapify {
    public static void maxheappify(int []arr,int n,int i)

   {
        int large_number=i;
        int left_child=2*i+1;
        int right_child=2*i+2;

        if (left_child<n && arr[left_child]>arr[large_number]) {
           large_number=left_child;
            
        }

        if (right_child<n && arr[right_child]>arr[large_number]) {
            large_number=right_child;
            
        }

        if (large_number!=i) {
            int temp=arr[i];
            arr[i]=arr[large_number];
            arr[large_number]=temp;
            maxheappify(arr,n,large_number);
            
        }
   }

   public static void heap_sort(int[]arr,int n)
   {
         for(int i=n-1;i>=0;i--)
         {
             int temp = arr[0];
             arr[0] = arr[i];
             arr[i] = temp;
             maxheappify(arr, i, 0);
         }
   }



  public static void buildmaxheap(int[]arr,int n){
    for(int i=n/2-1;i>=0;i--)
    {
        maxheappify(arr, n, i);
    }
    heap_sort(arr,n);
   
   }
     
}



public class heap_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        

        maxheapify heapsort = new maxheapify();
        heapsort.buildmaxheap(arr, n);
        System.out.print("After sorting = ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
