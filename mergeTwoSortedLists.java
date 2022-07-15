public class mergeTwoSortedLists {
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

    public void insertFirst(int value){
        listnode n = new listnode(value);
        n.next = head;
        head = n;
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

    public static listnode mergeList(listnode a, listnode b){
        listnode head = null;
        if(a.data <= b.data){
            head = a;
            a = a.next;
        }
        else{
            head = b;
            b = b.next;
        }

        listnode tail = head;
        while(a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
            if(a == null){
                tail.next = b;
            }
            else{
                tail.next = a;
            }
            return head;
    }


    public static void main(String[] args){
        mergeTwoSortedLists s1 = new mergeTwoSortedLists();
        s1.insertFirst(12);
        s1.insertFirst(8);
        s1.insertFirst(5);
        s1.insertFirst(2);


        mergeTwoSortedLists s2 = new mergeTwoSortedLists();
        s2.insertFirst(42);
        s2.insertFirst(28);
        s2.insertFirst(21);
        s2.insertFirst(11);
        s2.insertFirst(4);
        s2.insertFirst(3);

        s1.display();
        s2.display();

        mergeTwoSortedLists result = new mergeTwoSortedLists();
        result.head = mergeList(s1.head , s2.head);
        result.display();
    }
}
