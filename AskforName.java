import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    System.out.println("Hello, what's your name?");
    Scanner keyboard = new Scanner(System.in);
    String message = keyboard.nextLine();
    System.out.println("Hello " + message);
  }
}