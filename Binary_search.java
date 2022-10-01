import java.util.*;
public class Binary_search 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of array");
        n=sc.nextInt();

        int[] array = new int[50];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }

        System.out.println("Enter the data you want to search");
        int data=sc.nextInt();

        int low=0;
        int high=n-1;


      while(low <= high)
      {
        int mid=(low+high)/2;

        if(data==array[mid])
        {
            System.out.println("Element is found ata index:"+mid);
            break;
        }
        else if(data < array[mid])
        {
            high=mid-1;

        }
        else
        {
            low=mid+1;

        }
      }        
        
    }
    
}
