package Assignments;

public class Insertion_in_circular_linked_list {
}
//Copy And Paste The Code
/*
public static Node Insertion(Node head, int K){
//Enter your code here
 Node newNode = new Node(K);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
        return head;
}
 */



/*
Insertion in circular linked list
easy
asked in interviews by 1 company
Problem Statement
Given a circular linked list consisting of N nodes and an integer K, your task is to add the integer K at the end of the list.

Note:
Sample Input and Output just show how a linked list will look depending on the questions. Do not copy-paste as it is in custom input
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Insertion() that takes head node of circular linked list and the integer K as parameter.

Constraints:
1 <=N <= 1000
1 <= Node.data, K<= 1000
Output
Return the head node of the modified circular linked list.
Example
Sample Input 1:-
3
1- >2- >3
4

Sample Output 1:-
1- >2- >3- >4

Sample Input 2:-
3
1- >3- >2
1

Sample Output 2:-
1- >3- >2- >1
 */
