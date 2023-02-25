package Assignments;

public class Zeros_at_front_of_linked_list {
}
//Copy And Paste The Code
/*
static public Node moveZeroes(Node head)
{
       // Your code here
       ArrayList<Integer> a=new ArrayList<>();
        int c=0;
        while(head!=null){
            if(head.data==0){
                c++;
            }
            else{
                a.add(head.data);
            }
            head=head.next;
        }
        head=null;
        for(int i=a.size()-1;i>=0;i--){
            if(head==null){
                head=new Node(a.get(i));
            }
            else{
                Node temp=new Node(a.get(i));
                temp.next=head;
                head=temp;
            }
        }
        while(c-->0){
            Node temp=new Node(0);
            temp.next=head;
            head=temp;
        }

        return head;
}
 */




/*
Zeros at front of linked list
easy
Problem Statement
Given a linked list, the task is to move all 0’s to the front of the linked list. The order of all another element except 0 should be same after rearrangement.

Note: Avoid use of any type of Java Collection frameworks.

Note: For custom input/output, enter the list in reverse order, and the output will also be in reverse order.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function moveZeroes() that takes head node as parameter.

Constraints:
1 <= T <= 100
1 <= N <= 100000
0<=Node.data<=100000

Note:- Sum of all test cases doesn't exceed 10^5

Output
Return the head of the modified linked list.
Example
Input:
2
10
0 4 0 5 0 2 1 0 1 0
7
1 1 2 3 0 0 0

Output:
0 0 0 0 0 4 5 2 1 1
0 0 0 1 1 2 3

Explanation:
Testcase 1:
Original list was 0->4->0->5->0->2->1->0->1->0->NULL.
After processing list becomes 0->0->0->0->0->4->5->2->1->1->NULL.

Testcase 2:
Original list was 1->1->2->3->0->0->0->NULL.
After processing list becomes 0->0->0->1->1->2->3->NULL.
 */
