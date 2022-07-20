public class insertFirstInCircularLinkedList {
    private listnode last;
    private int length;

    private class listnode{
        private listnode next;
        private int data;

        public listnode(int data){
            this.data = data;
        }
    }

    public insertFirstInCircularLinkedList(){
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

    public void insertFirst(int data){
        listnode temp = new listnode(data);
        if(last == null){
            last = temp;
        }
        else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public static void main(String[] args){
        insertFirstInCircularLinkedList s = new insertFirstInCircularLinkedList();
        s.insertFirst(3);
        s.insertFirst(32);
        s.insertFirst(63);
        s.insertFirst(39);

        s.display();

    }
}
