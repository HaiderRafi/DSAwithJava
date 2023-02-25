package Assignments;
import java.util.*;
public class Flash_Cards {
    static class Flashcard {
        String word;
        String meaning;

        Flashcard(String word, String meaning) {
            this.word = word;
            this.meaning = meaning;
        }

        public void printCard() {
            System.out.println("> " + this.word + " ( " + this.meaning + " )");
        }
    }

    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            String mea = sc.nextLine();
            Flashcard f = new Flashcard(word, mea);
            f.printCard();
        }
    }
}


/*
Flash Cards
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Build a class having name "Flashcard". A flashcard is a card having information on both sides, which can be used as an aid in memoization. Flashcards usually have a question on one side and an answer on the other.
Note: We are going to create flashcards that will be having a word and its meaning.
Input
The first line contains the word.
The second line contains its meaning.

Constraints:
0 ≤ len(w) ≤ 100
0 ≤ len(m) ≤ 100
Output
Prints "> word ( meaning )".
Example
Sample Input:
hi
hello

Sample Output:
> hi ( hello )
 */
