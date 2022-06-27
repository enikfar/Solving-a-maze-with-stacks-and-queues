package lab3;



import java.util.ArrayList;
import java.util.NoSuchElementException;


public class MyStack<T> implements StackADT<T>
{
   private ArrayList<T> stack;
   int Size = 0;


   
   public MyStack()
   {
       this.stack = new ArrayList<T>();
   }


  

    public void push(T element)
    {
        
        this.stack.add(Size, element);
        Size++;
    }






   
   public T pop() throws NoSuchElementException
   {
       
       if(this.isEmpty())
           throw new NoSuchElementException();
       Size --;
       return this.stack.remove(0);


   }

   
   public T top() throws NoSuchElementException
   {
       if(this.stack.isEmpty())
           throw new NoSuchElementException();
       return this.stack.get(0);

   }

   

    public int size()
    {
        return Size;
    }





   
    public boolean isEmpty()
    {
        if(this.size() == 0)
           return true;

        return false;
    }





   
   public void clear()
   {
       this.stack = new ArrayList<T>();
   }

   public String toString()
   {
       String str = "[";
       for(int x = 0; x < this.size(); x ++)
           str += this.stack.get(x) + ",";

       str += "]";

       return str;
   }
}
