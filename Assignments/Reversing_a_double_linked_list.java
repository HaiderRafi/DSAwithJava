package Assignments;

public class Reversing_a_double_linked_list {
}
//Copy And Paste The Code
/*
public static Node Reverse(Node head) {
//complete this function
  // Node prev=null;
        Node current=head;
        Node temp=null;

        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;

            // prev=current;
            current=current.prev;
        }
        if(temp!=null){
          head=temp.prev;
        }

        return head;
}
 */



/*
Reversing a double linked list
medium
asked in interviews by 8 companies
Problem Statement
Given a double linked list with consisting of N nodes, your task is to reverse the linked list and return the head of the modified list.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Reverse() that takes head node of the linked list as a parameter.


Constraints:
1 <= N <= 10^3
1<=value<=100
Output
Return the head of the modified linked list.
Example
Input:
6
1 2 3 4 5 6

Output:
6 5 4 3 2 1

Explanation:
After reversing the list, elements are as 6 <-> 5 <-> 4 <-> 3 <-> 2 <-> 1.
 */
