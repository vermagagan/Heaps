import java.util.PriorityQueue;
public class Sortingobjects
{
    static class Student implements Comparable<Student>
    {
        int rank;
        String name;
        public Student(int rank, String name)
        {
            this.rank = rank;
            this.name = name;
        }
        @Override
        public int compareTo(Student s2)
        {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args)
    {
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student(4, "Tanu"));
        pq.add(new Student(3, "Harsh"));
        pq.add(new Student(5, "Manu"));
        pq.add(new Student(1, "Gagan"));
        pq.add(new Student(2, "Lakshman"));
        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name+"------->"+pq.peek().rank);
            pq.remove();
        }
    }
}
