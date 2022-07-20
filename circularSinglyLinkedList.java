public class circularSinglyLinkedList {
    private listnode last;
    private int length;

    private class listnode{
        private listnode next;
        private int data;

        public listnode(int data){
            this.data = data;
        }
    }

    public circularSinglyLinkedList(){
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

    public static void main(String[] args){
        circularSinglyLinkedList s = new circularSinglyLinkedList();
        s.createCircularSinglyLinkedList();
    }
}
