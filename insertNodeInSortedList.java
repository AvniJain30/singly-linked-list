public class insertNodeInSortedList {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;
            }
    }

    public void insertAtFirst(int value){
        listnode n = new listnode(value);
        n.next = head;
        head = n;
    }

    public void display(){
        listnode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public listnode insertInSortedList(int value){
        listnode n = new listnode(value);
        if(head == null){
            return n;
        }
        listnode current = head;
        listnode temp = null;
        while(current != null && current.data < n.data){
            temp = current;
            current = current.next;
        }
        n.next = current;
        temp.next = n;
        return head;
    }

    public static void main(String[] args){
        insertNodeInSortedList s = new insertNodeInSortedList();
        s.insertAtFirst(30);
        s.insertAtFirst(14);
        s.insertAtFirst(7);
        s.insertAtFirst(3);
        s.insertAtFirst(1);

        s.display();
        s.insertInSortedList(5);
        s.display();
    }
}


