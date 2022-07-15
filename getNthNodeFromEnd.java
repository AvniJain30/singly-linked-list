public class getNthNodeFromEnd {
    private listnode head;
    private static class listnode{
        private int data;
        private getNthNodeFromEnd.listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(getNthNodeFromEnd.listnode head){
        getNthNodeFromEnd.listnode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public listnode getNodeFromEnd(int n){
        if(head == null){
            return null;
        }
        if(n <= 0){
            throw new IllegalArgumentException("Invalid value of n " + n);
        }
        listnode mainptr = head;
        listnode refptr = head;
        int count = 0;
        while(count < n){
            if(refptr == null){
                throw new IllegalArgumentException(n + " is greater than the number of nodes in the list");
            }
            refptr = refptr.next;
            count++;
        }

        while(refptr != null){
            refptr = refptr.next;
            mainptr = mainptr.next;
        }
        return mainptr;
    }

    public static void main(String[] args) {
        getNthNodeFromEnd s = new getNthNodeFromEnd();
        s.head = new listnode(10);
        listnode second = new listnode(1);
        listnode third = new listnode(8);
        listnode fourth = new listnode(11);
        s.head.next = second;
        second.next = third;
        third.next = fourth;

        s.display(s.head);
        System.out.println("Nth node from end is "+ s.getNodeFromEnd(3).data);

    }
}
