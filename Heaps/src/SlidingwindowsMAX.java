import java.util.Comparator;
import java.util.PriorityQueue;
public class SlidingwindowsMAX
{
    static class Pair implements Comparable<Pair>
    {
        int data,idx;
        public Pair(int data,int idx)
        {
            this.data = data;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair p2)
        {
            return this.data - p2.data;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[] = new int[arr.length-k+1];
        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.reverseOrder());
        int max = Integer.MIN_VALUE;
        for(int i=0; i<k; i++)
        {
            pq.add(new Pair(arr[i], i));
        }
        res[0] = pq.peek().data;

        for(int i=k; i<arr.length; i++)
        {
            while(pq.size() > 0 && pq.peek().idx <= (i-k))
                pq.remove();
            
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().data;
        }

        for(int i=0; i<res.length; i++)
            System.out.print(res[i]+"  ");
    }
}
