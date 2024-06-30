import java.util.PriorityQueue;
public class PriorityQueues
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(11);
        pq.add(1);
        pq.add(12);
        while(!pq.isEmpty())
        {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
