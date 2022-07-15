public class singly_linked_list {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args){
        singly_linked_list s = new singly_linked_list();
        s.head = new listnode(10);
        listnode second = new listnode(1);
        listnode third = new listnode(8);
        listnode fourth = new listnode(11);
        s.head.next = second;
        second.next = third;
        third.next = fourth;
    }
}
