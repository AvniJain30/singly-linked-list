public class printCircularLinkedList {
    private listnode last;
    private int length;

    private class listnode{
        private listnode next;
        private int data;

        public listnode(int data){
            this.data = data;
        }
    }

    public printCircularLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularSinglyLinkedList(){
        listnode first = new listnode(4);
        listnode second = new listnode(43);
        listnode third = new listnode(54);
        listnode fourth = new listnode(74);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
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

    public static void main(String[] args){
        printCircularLinkedList s = new printCircularLinkedList();
        s.createCircularSinglyLinkedList();
        s.display();
    }
}
