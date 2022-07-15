public class insertAtNthPosition {
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

    public void insert(int value, int position){
        listnode n = new listnode(value);
        if(position == 1){
            n.next = head;
            head = n;
        }
        else{
            listnode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            listnode current = previous.next;
            previous.next = n;
            n.next = current;
        }
    }

    public static void main(String[] args) {
        insertAtNthPosition p = new insertAtNthPosition();
        p.head = new listnode(5);
        listnode second = new listnode(7);
        listnode third = new listnode(11);
        listnode fourth = new listnode(2);
        listnode fifth = new listnode(9);
        p.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        p.insert(4, 3);
        p.display(p.head);
    }
}
