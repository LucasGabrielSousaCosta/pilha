public class Pilha{
    private Node topo;
    private int N;
    
    public class Node
    {
        private int item;
        private Node next;
    }
    
    public boolean empty()
    {
        if(topo == null)
        {
            return true;
        }
        return false;
    }
    
    public int size()
    {
        return N;
    }
    
    public void push(int valor)
    {
        Node temp = new Node();
        temp.item = valor;
        if (empty())
        {
            temp.next = null;
            topo = temp;
            N++;
        }
        else
        {
            temp.next = topo;
            topo = temp;
            N++;
        }
    }
    
    public int pop()
    {
        if (empty())
        {
            return -1;
        }
        Node temp = new Node();
        temp = topo;
        topo = topo.next;
        temp.next = null;
        N--;
        return temp.item;
    }
    
    public void clear()
    {
        Node temp = new Node();
        
        while(topo!=null)
        {
            pop();
        }
    }
    
    public int topo()
    {
        return topo.item;
    }
    
    public boolean contains(int item)
    {
        Node temp = new Node();
        temp = topo;
        
        while(temp!= null)
        {
            if(temp.item == item)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    public void print()
    {
        Node temp = new Node();
        temp = topo;
        
        while(temp!= null)
        {
            System.out.print(temp.item + " ");
            temp = temp.next;
        }
    }
}
