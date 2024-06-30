import java.util.Comparator;
import java.util.PriorityQueue;
public class KthLargestElement
{
    public static void main(String[] args)
    {
        int arr[] = {2,4,1,5,10,100,20,330,44,55,16,25,23,65,787};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<arr.length; i++)
            pq.add(arr[i]);
        for(int i=0; i<k-1; i++)
            pq.remove();
        System.out.println(pq.peek());
    }
}
