public class removeGivenKey {
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

    public void removeKey(int key){
        listnode current = head;
        listnode temp = null;

        if(current == null){
            return;
        }
        if(current != null && current.data == key){
            head = current.next;
            return;
        }
        while(current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        temp.next = current.next;
    }

    public static void main(String[] args){
        removeGivenKey s = new removeGivenKey();
        s.insertAtFirst(3);
        s.insertAtFirst(12);
        s.insertAtFirst(7);
        s.insertAtFirst(4);
        s.insertAtFirst(10);

        s.display();
        s.removeKey(7);
        s.display();
    }
}

