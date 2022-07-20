import java.util.NoSuchElementException;

public class deleteFirstNodeFromCircularLinkedList {
    private listnode last;
    private int length;

    private class listnode{
        private listnode next;
        private int data;

        public listnode(int data){
            this.data = data;
        }
    }

    public deleteFirstNodeFromCircularLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void display(){
        if(last == null){
            return;
        }
        listnode first = last.next;
        while(first != last){
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public void insertLast(int data){
        listnode temp = new listnode(data);
        if(last == null){
            last = temp;
            last.next = last;
        }
        else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public listnode removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        listnode temp = last.next;
        if(last.next == last){
            last = null;
        }
        else{
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    public static void main(String[] args){
        deleteFirstNodeFromCircularLinkedList s = new deleteFirstNodeFromCircularLinkedList();
        s.insertLast(3);
        s.insertLast(32);
        s.insertLast(63);
        s.insertLast(39);
        s.display();
        s.removeFirst();
        s.display();
    }
}
