package singlylinkedlist;

public class SLL {
    private Node first=null;
    private int count=0;
    public void add(Object ele) {
        if (first == null) {
            first = new Node(ele);
            count++;
            return;
        }
        Node curr = first;
        while (curr.next != null) {
            curr = curr.next;
        }
        Node n = new Node(ele);
            curr.next=n;
            count++;
    }
    public void add(Object ele,int index){
        if(index<=-1||index>=sizeOf()){
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            Node n=new Node(ele,first);
            first=n;
            count++;
            return;
        }
        Node curr=first;
        for(int i=1;i<index;i++){
            curr=curr.next;
        }
        Node n=new Node(ele,first);
        curr.next=n;
        count++;
    }
    public void remove(int index){
        if(index==-1 || index>=sizeOf()){
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            first=first.next;
            count--;
            return;
        }
        Node curr=first;
        for (int i=1;i<index;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        count--;
    }
    public Object get(int index){
        if(index==-1 || index>=sizeOf()){
            throw new IndexOutOfBoundsException();
        }
        Node curr=first;
        for(int i=1;i<=index;i++){
            curr=curr.next;
        }
        return curr;
    }
    public boolean isEmpty(){
        if(first==null)
            return true;
        return false;
    }
    public void removeAll(){
        first=null;
        count=0;
    }

    public int sizeOf(){
        return count;
    }
}
