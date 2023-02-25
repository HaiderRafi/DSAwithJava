package Assignments;

public class Palindrome_in_Doubly_Linked_List {
}
//Copy And Paste The Code
/*
static boolean isPalin( Node left)
    {
        // Write your code here
        if(left==null){
           return true;
        }
        Node ptr1=left;
        Node ptr2=left;

        while(ptr2.next!=null){
           ptr2=ptr2.next;
        }

        while(ptr1!=ptr2){
           if(ptr1.data!=ptr2.data){
              return false;
           }
           ptr1=ptr1.next;
           ptr2=ptr2.prev;

           if(ptr1.next==ptr2){
              break;
           }
        }
        return true;

    }
 */


/*
Palindrome in Doubly Linked List
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given head which is a reference node to a doubly- linked list of characters. Complete the function isPalin which returns true if the doubly linked list of characters is palindrome otherwise return false.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function isPalin that takes the head of the linked list as parameter.

Constraints:
0 <= Number of nodes <= 10^5.
Output
Return true if the doubly linked list of characters is palindrome otherwise return false.
Example
Sample Input 1:-
6
098890

Sample Output 1:-
YES

Explanation
It's a palindrome as the first character is equal to last character and 2nd character is equal to second last character and so on.


Sample Input 2:-
2
10

Sample Output 2:-
NO

Explanation:
"10" is not a palindrome
 */
