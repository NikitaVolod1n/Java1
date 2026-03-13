public class Container{
    private Node head;
    private int size;

    public Container(){
        head = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public int getByIndex(int index){
        if(size - 1 >= index && index > 0){
            Node current = head;
            int curIndex = 0;
            while(curIndex != index){
                current = current.next;
                curIndex++;
            }
            return current.data;
        }
        throw new IndexOutOfBoundsException("Invalid index");
    }

    public void delete(int data){
        if(head != null){
            Node current = head;
            while(current.next.data != data){
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
}
