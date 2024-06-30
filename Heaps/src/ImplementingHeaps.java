import java.util.ArrayList;

public class ImplementingHeaps
{
    static class MIN_Heaps
    {
        ArrayList<Integer> arr=new ArrayList<>();
        //add
        public void add(int n)
        {
            arr.add(n);
            int x = arr.size()-1;
            int par = (int)(x-1)/2;
            //Adding in MIN HEAP
            while(arr.get(x) < arr.get(par))
            {
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x = par;
                par = (int)(x-1)/2;
            }
        }


        //isempty
        public boolean isempty()
        {
            return arr.size() == 0;
        }
        
        
        //peek
        public int peek()
        {
            return arr.get(0);
        }
        
        
        //remove with heapify
        public int remove()
        {
            int data = arr.get(0);
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            arr.remove(arr.size()-1);
            Heapify(0);
            return data;
        }
        private void Heapify(int idx)
        {
            int left = 2*idx+1;
            int right = 2*idx+2;
            int min = idx;
            //left
            if(left < arr.size() && arr.get(min) > arr.get(left))
                min = left;
            //right
            if(right < arr.size() && arr.get(min) > arr.get(right))
                min = right;
            //min != idx
            if(min != idx)
            {
                int temp = arr.get(idx);
                arr.set(idx, arr.get(min));
                arr.set(min, temp);
                Heapify(min);
            }
        }
    }
    static class MAX_Heaps
    {
        ArrayList<Integer> arr=new ArrayList<>();
        //add
        public void add(int n)
        {
            arr.add(n);
            int x = arr.size()-1;
            int par = (int)(x-1)/2;
            //Adding in MAX HEAP
            while(arr.get(x) > arr.get(par))
            {
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x = par;
                par = (int)(x-1)/2;
            }
        }


        //isempty
        public boolean isempty()
        {
            return arr.size() == 0;
        }
        
        
        //peek
        public int peek()
        {
            return arr.get(0);
        }
        
        
        //remove with heapify
        public int remove()
        {
            int data = arr.get(0);
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            arr.remove(arr.size()-1);
            Heapify(0);
            return data;
        }
        private void Heapify(int idx)
        {
            int left = 2*idx+1;
            int right = 2*idx+2;
            int max = idx;
            //left
            if(left < arr.size() && arr.get(max) < arr.get(left))
                max = left;
            //right
            if(right < arr.size() && arr.get(max) < arr.get(right))
                max = right;
            //min != idx
            if(max != idx)
            {
                int temp = arr.get(idx);
                arr.set(idx, arr.get(max));
                arr.set(max, temp);
                Heapify(max);
            }
        }
    }
    public static void main(String args[])
    {
        MIN_Heaps minH = new MIN_Heaps();
        minH.add(4);
        minH.add(5);
        minH.add(2);
        minH.add(1);
        minH.add(3);
        while(!minH.isempty())
        {
            System.out.println(minH.peek());
            minH.remove();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        MAX_Heaps maxH = new MAX_Heaps();
        maxH.add(3);
        maxH.add(2);
        maxH.add(5);
        maxH.add(1);
        maxH.add(4);
        while(!maxH.isempty())
        {
            System.out.println(maxH.peek());
            maxH.remove();
        }
    }
}
