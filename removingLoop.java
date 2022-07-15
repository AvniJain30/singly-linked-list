public class removingLoop {
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
        System.out.print("null");
    }

    public void createLoop(){
        listnode first = new listnode(2);
        listnode second = new listnode(5);
        listnode third = new listnode(7);
        listnode fourth = new listnode(3);
        listnode fifth = new listnode(11);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
    }

    public void removeLoop(){
        listnode slowptr = head;
        listnode fastptr = head;
        while(fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(slowptr == fastptr){
                removeloop(slowptr);
                return;
            }
        }
    }

    private void removeloop(listnode slowptr) {
        listnode temp = head;
        while(temp.next != slowptr.next){
            temp = temp.next;
            slowptr = slowptr.next;
        }
        slowptr.next = null;
    }

    public static void main(String[] agrs){
        removingLoop s = new removingLoop();
        s.createLoop();
        s.removeLoop();
        s.display();
    }
}
