public class detectLoop {
    private listnode head;

    private static class listnode {
        private int data;
        private listnode next;

        public listnode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void createLoop(){
        listnode first = new listnode(1);
        listnode second = new listnode(2);
        listnode third = new listnode(3);
        listnode fourth = new listnode(4);
        listnode fifth = new listnode(5);
        listnode sixth = new listnode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    public boolean detectLoop(){
        listnode fastptr = head;
        listnode slowptr = head;

        while(fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(slowptr == fastptr){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        detectLoop s = new detectLoop();
        s.createLoop();
        System.out.println(s.detectLoop());
    }
}