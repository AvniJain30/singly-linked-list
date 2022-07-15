public class insertAtBeggining {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(insertAtBeggining.listnode head){
        insertAtBeggining.listnode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int value){
        listnode n = new listnode(value);
        n.next = head;
        head = n;
    }

    public static void main(String[] args) {
        insertAtBeggining p = new insertAtBeggining();
        p.head = new listnode(5);
        listnode second = new listnode(7);
        listnode third = new listnode(11);
        listnode fourth = new listnode(2);
        listnode fifth = new listnode(9);
        p.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        p.insertFirst(6);
        p.display(p.head);
    }
}
