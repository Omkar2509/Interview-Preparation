import java.util.Arrays;

class Array
{
    //Methods for all possible array operations and logic
    public static int linearSearch(int ar[], int n)
    {
        //method for linear search
        for(int i=0; i<ar.length; i++)
        {
            if(ar[i]==n)
            {
                return i;
            }
        }
        return -1;
    }


    public static  int largestNumber(int[] ar)
    {
        //method for finding largest number in array
        int max=Integer.MIN_VALUE;
        for(int i=0; i<ar.length; i++)
        {
            if(ar[i]>max) max=ar[i];
            
        }
        return max;
    }


    public static  int smallestNumber(int[] ar)
    {
        //method for finding smallest number in array

        int min=Integer.MAX_VALUE;
        for(int i=0; i<ar.length; i++)
        {
            if(ar[i]<min) min=ar[i];
            
        }
        return min;
    }


    public static int[] removeEvenIntegers(int[] ar)
    {
        //method to return an array with all even integers been removed
        int count=0;
        for(int i=0; i<ar.length; i++)
        {
            if(ar[i]%2==0)
            {
                count++;
            }
        }
        int[] res=new int[count];
        for(int i=0; i<res.length; i++)
        {
            if(ar[i]%2==0) res[i]=ar[i];
        }
        return res;
    }


    public static int[] moveZerosToEnd(int ar[])
    {
         int t=0;
        for(int i=0; i<ar.length; i++)
        {
            if(ar[i]!=0&& ar[t]==0)
            {
                int temp=ar[i]; 
                ar[i]=ar[t];
                ar[t]=temp;
            }
            if(ar[t]!=0) t++;
        }
        return ar;
    }


    public static int[] resizeArray(int ar[], int newCapacity)
    {
        //resize the array when required
        int[] temp=new int[newCapacity];
        for(int i=0; i<ar.length; i++)
        {
            temp[i]=ar[i];
        }
        return temp;
    }
    public static int missingNumber(int[] ar)
    {
        //find missing nuber from given range in BigO(n)
       int sum=0, n=ar.length+1;
       int sum2=(n*(n+1))/2;
       for(int i=0; i<ar.length; i++)
       {
        sum=sum+ar[i];
       }
       return sum2-sum;
    }


    public static int binarySearch(int[] ar, int key)
    {
        //method for binary search operation over an array
        //Array must be sorted
        //Iterative method
        //Time complexity= (log n)base 2 
        Arrays.sort(ar);
        int start=0;
        int end=ar.length-1;
        
        while(start<=end)
        {
            int mid =(start+end)/2;
            if(ar[mid]==key) return mid;
            if(ar[mid]< key) start=mid+1;
            else end=mid-1;
       
        }
       //if required key is not present in an array
       return -1;
    }


    public static int binarySearch(int[] ar, int start, int end, int key)
    {
        //method for binary search operation over an array
        //Array must be sorted
        //Recursive method
        //Time complexity= (log n)base 2 

        if(start>=0 && end<=ar.length-1)
        {
        int mid =(start+end)/2;
        if(ar[mid]==key) return mid;
        if(ar[mid]>key) return binarySearch(ar, start, mid-1, key);
         return binarySearch(ar, mid+1, end, key);
        }
        //if the key is not present in an array
        return -1;
    }


    public static int[] reverseArray(int[] ar)
    {
        //Returns reversed array
        int a=0, b=ar.length-1;
        while(a<=b)
        {
            int temp=ar[a];
            ar[a]=ar[b];
            ar[b]=temp;
            a++;
            b--;
        }
        return ar;
    }


    public static int pairsInArray(int ar[])
    {
        //finding combinations of all possible pairs with no repetation
        //can be formed in an array
        int count=0;
        for(int i=0; i<ar.length; i++)
        {
            for(int j=i+1; j<ar.length; j++)
            {
                System.out.print("("+ar[i]+", "+ar[j]+") ");
                count++;
            }
            System.out.println();
        }
        return count;
    }


    public static int printSubarrays(int[] ar)
    {
        //print all possible subarrays from the given array
        int count=0;
        for(int i=0; i<ar.length; i++)
        {
            int start=i;
            for(int j=i; j<ar.length; j++)
            {
                int end=j;
                for(int k=start; k<=end; k++)
                {
                    System.out.print(ar[k] +" ");
                    count++;
                }
                System.out.println();
               
            }
            System.out.println();
        }
        return count;
    }


    public static void kadanes(int[] ar)
    {
        //Kadanes algorithm for finding maximum subarray sum
        //It states that, while searching for max subarray sum if the
        //current sum is less than 0, then make it zero rather than taking
        // negative sum forward
        int sum=0;int max=Integer.MIN_VALUE;
         for(int i=0; i<ar.length; i++)
         {
            sum=sum+ar[i];
            if(sum<0) sum=0;
            Math.max(sum, max);

         }
        System.out.println(sum);
    }
    
}
