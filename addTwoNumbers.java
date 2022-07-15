public class addTwoNumbers {
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

    public static listnode add(listnode a, listnode b){
        listnode dummy = new listnode(0);
        listnode tail = dummy;
        int carry = 0;
        while(a != null || b != null){
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            tail.next = new listnode(sum % 10);
            tail = tail.next;
            if(a != null) a = a.next;
            if(b != null) b = b.next;
        }
        if(carry > 0){
            tail.next = new listnode(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args){
        addTwoNumbers s1 = new addTwoNumbers();
        s1.insertFirst(8);
        s1.insertFirst(5);
        s1.insertFirst(2);

        addTwoNumbers s2 = new addTwoNumbers();
        s2.insertFirst(4);
        s2.insertFirst(3);

        s1.display();
        s2.display();

        addTwoNumbers result = new addTwoNumbers();
        result.head = add(s1.head , s2.head);
        result.display();
    }
}
