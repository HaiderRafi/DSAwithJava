package Assignments;

public class Remove_Duplicates_from_doubly_linked_list {
}
//Copy And Paste The Code
/*
public static void deleteNode(Node n){
        if(n.next!=null){
        n.next.prev=n.prev;
        }
        //if(n.prev!=null){
        n.prev.next=n.next;
        //}
    }

  public static Node deleteDuplicates(Node head) {

    Node temp=head;

    while(temp.next!=null){
      if(temp.val == temp.next.val){
          deleteNode(temp.next);
      }
      else{
        temp=temp.next;
      }
    }

    return head;

}
 */





/*
Remove Duplicates from doubly linked list
medium
asked in interviews by 2 companies
Problem Statement
Given a sorted doubly linked list containing n nodes. Your task is to remove duplicate nodes from the given list.

Example 1:
Input
1<->2<->2-<->3<->3<->4

Output:
1<->2<->3<->4

Example 2:
Input
1<->1<->1<->1

Output
1
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteDuplicates() that takes head node as parameter.

Constraints:
1 <=N <= 10000
1 <= Node. data<= 2*10000
Output
Return the head of the modified list.
Example
Sample Input:-
6
1 2 2 3 3 4

Sample Output:-
1 2 3 4

Sample Input:-
4
1 1 1 1

Sample Output:-
1
 */
