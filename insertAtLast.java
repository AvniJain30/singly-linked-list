public class insertAtLast {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        listnode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertLast(int value){
        listnode n = new listnode(value);
        if(head == null){
            head = n;
        }
        listnode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = n;
    }

    public static void main(String[] args) {
        insertAtLast p = new insertAtLast();
        p.head = new listnode(5);
        listnode second = new listnode(7);
        listnode third = new listnode(11);
        listnode fourth = new listnode(2);
        listnode fifth = new listnode(9);
        p.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        p.insertLast(10);
        p.display();
    }
}
