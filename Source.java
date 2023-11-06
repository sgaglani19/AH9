class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
      // todo
      Node<T> prev = null;
      Node<T> curr = head;
      
      while(curr != null){
        Node<T> next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }
      head = prev;
      return head;
    }
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
    
        x.next = y; // x -> y
    
        // reverseList(x); // y -> x

        // Printing solution
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node<String> head = Source.reverseList(x);
        Node<String> head1 = Source.reverseList(a);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;            
        }
    }
  }