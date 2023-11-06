class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    // todo
    Node<T> curr = head;
    while(curr.next != null){
      if (curr.val == curr.next.val){
        isUnivalueList(curr = curr.next);
      }
      else{
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
        Node<String> z = new Node<>("z");

        // Node<Integer> u = new Node<>(2);
        // Node<Integer> v = new Node<>(2);
        // Node<Integer> w = new Node<>(2);
        // Node<Integer> x = new Node<>(2);
        // Node<Integer> y = new Node<>(2);

        // u.next = v;
        // v.next = w;
        // w.next = x;
        // x.next = y;
        Node<Integer> u = new Node<>(2);
        Node<Integer> v = new Node<>(2);
        Node<Integer> w = new Node<>(3);
        Node<Integer> x = new Node<>(3);
        Node<Integer> y = new Node<>(2);

        u.next = v;
        v.next = w;
        w.next = x;
        x.next = y;


        // z

        // Printing solution
        System.out.println((ECSource.isUnivalueList(z)));
    }
}
