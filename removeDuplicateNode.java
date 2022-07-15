public class removeDuplicateNode {
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

    public void removeDuplicates(){
        if(head == null){
            return;
        }
        listnode current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }

    public static void main(String[] args){
        removeDuplicateNode s = new removeDuplicateNode();
        s.insertAtFirst(3);
        s.insertAtFirst(12);
        s.insertAtFirst(7);
        s.insertAtFirst(7);
        s.insertAtFirst(10);

        s.display();
        s.removeDuplicates();
        s.display();
    }
}
