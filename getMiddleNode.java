public class getMiddleNode  {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(listnode head){
        listnode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public listnode getMiddleNode(){
        if(head == null){
            return null;
        }
        listnode slowptr = head;
        listnode fastptr = head;
        while(fastptr != null && fastptr.next != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr;
    }

    public static void main(String[] args) {
        getMiddleNode p = new getMiddleNode();
        p.head = new listnode(5);
        listnode second = new listnode(7);
        listnode third = new listnode(11);
        listnode fourth = new listnode(2);
        listnode fifth = new listnode(9);
        p.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        p.display(p.head);
        System.out.println("middle node is " + p.getMiddleNode().data);
    }
}


