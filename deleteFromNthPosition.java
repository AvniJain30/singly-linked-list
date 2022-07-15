public class deleteFromNthPosition {
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

    public void delete(int position){
        if(position == 1){
            head = head.next;
        }
        else{
            listnode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            listnode current = previous.next;
            previous.next = current.next;
        }
    }

    public static void main(String[] args) {
        deleteFromNthPosition p = new deleteFromNthPosition();
        p.head = new listnode(5);
        listnode second = new listnode(7);
        listnode third = new listnode(11);
        listnode fourth = new listnode(2);
        listnode fifth = new listnode(9);
        p.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        p.delete(4);
        p.display(p.head);
    }
}

