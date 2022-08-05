public class Add_one_to_a_number_represented_as_linked_list
{
    static class Node {
        int data;
        Node next;
    }
    static Node newNode(int data)
    {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }
    static Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static Node addOneUtil(Node head)
    {
        Node res = head;
        Node temp = null, prev = null;

        int carry = 1, sum;

        while (head != null) // while both lists exist
        {
            sum = carry + head.data;
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            head.data = sum;
            temp = head;
            head = head.next;
        }
        if (carry > 0)
            temp.next = newNode(carry);
        return res;
    }
    static Node addOne(Node head)
    {
        head = reverse(head);
        head = addOneUtil(head);
        return reverse(head);
    }
    static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Node head = newNode(1);
        head.next = newNode(9);
        head.next.next = newNode(9);
        head.next.next.next = newNode(9);

        System.out.print("List is ");
        printList(head);

        head = addOne(head);
        System.out.println();
        System.out.print("Resultant list is ");
        printList(head);
    }
}
