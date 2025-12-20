
package org.aaa;
import java.util.*;
public class Book {
    int id;
    String title;
    String author;
    boolean available;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List List = new LinkedList();
        List.add("1.[101] Java Programmimg- Akil James ");
        List.add("2.[102] Data Structures- Robert muthu");
        List.add("3.[104] Operating System- Silberchartz");

        System.out.println("Welcome Library ");
        System.out.println("1.View Available Books");
        System.out.println("2.Borrow Book");
        System.out.println("3.Return Book");
        System.out.println("4.View member Borrowed Books");
        System.out.println("5.Exit");
int put =input.nextInt();
        switch (put) {
            case 1:
                System.out.println("Available Books: " + List);
            case 2:
                System.out.println("Enter Member Id:");
                int memberid = input.nextInt();
                System.out.println("Enter Book Id:");
                int bookid = input.nextInt();
                if (List.contains(bookid)) {
                    if (List.contains(memberid)) {
                        System.out.println("Book Borrowed Successfully");
                    }
                }
            case 3:
                System.out.println("Enter Member Id: ");
                int Meme = input.nextInt();
                System.out.println("Enter Book title : ");
                String came = input.nextLine();
                input.nextLine();
                System.out.println("Enter Book author : ");
                String left = input.nextLine();
                List.add(Meme);
                List.add(came);
                List.add(left);
            case 4:
                System.out.println("Members Borrowed Books" + List);
            case 5:
                return;
        }

    }
}