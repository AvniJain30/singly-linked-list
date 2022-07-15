public class deleteFirstNode {
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

    public listnode deleteFirst(){
        if(head == null){
            return null;
        }
        listnode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        deleteFirstNode p = new deleteFirstNode();
        p.head = new listnode(5);
        listnode second = new listnode(7);
        listnode third = new listnode(11);
        listnode fourth = new listnode(2);
        listnode fifth = new listnode(9);
        p.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println(p.deleteFirst().data);
        p.display(p.head);
    }
}

