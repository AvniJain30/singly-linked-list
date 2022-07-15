public class searchNode {
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

    public boolean find(listnode head, int searchkey){
        if(head == null){
            return false;
        }
        listnode current = head;
        while(current != null){
            if(current.data == searchkey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        searchNode p = new searchNode();
        p.head = new listnode(5);
        listnode second = new listnode(7);
        listnode third = new listnode(11);
        listnode fourth = new listnode(2);
        listnode fifth = new listnode(9);
        p.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        if(p.find(p.head,4)){
            System.out.println("searchkey found!!");
        }
        else{
            System.out.println("searchkey not found!!");
        }
        p.display(p.head);
    }
}
