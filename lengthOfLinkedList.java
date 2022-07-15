public class lengthOfLinkedList {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;
        public listnode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(lengthOfLinkedList.listnode head){
        lengthOfLinkedList.listnode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        listnode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args){
        lengthOfLinkedList p = new lengthOfLinkedList();
        p.head = new lengthOfLinkedList.listnode(5);
        listnode second = new listnode(7);
        listnode third = new listnode(11);
        listnode fourth = new listnode(2);
        listnode fifth = new listnode(9);
        p.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        p.display(p.head);
        System.out.println("length of lengthOfLinkedList is " + p.length());
    }
}
