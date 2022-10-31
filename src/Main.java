//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int num = myScanner.nextInt();
//
//        if (num >= -50 && num <= 50) {
//            System.out.println("Your number is between -50 and 50");
//        } else if (num < -100 || num > 100) {
//            System.out.println("Your number is more then 100 away from 0!");
//        } else {
//            System.out.println("Something else");
//        }
//
//        myScanner.close();
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.print("Enter a lowercase word: ");
//        String word = myScanner.nextLine();
//        String first = word.substring(0, 1);  // get first letter
//
//        if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u") ) {
//            System.out.println("Your word begins with a vowel");
//        } else {
//            System.out.println("Your word begins with a consonant");
//        }
//
//        myScanner.close();
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Slay the Dragon!");
//        System.out.println("----------------");
//        int health = (int) (Math.random() * 100) + 1;
//        System.out.println("The dragon has " + health + " health");
//
//        int attackAmount = 0;
//        int numAttacks = 0;
//        boolean dragonSlayed = false;
//
//        while (numAttacks < 5 && !dragonSlayed) {
//            System.out.print("\nEnter an attack amount: ");
//            attackAmount = myScanner.nextInt();
//            numAttacks += 1;
//            health -= attackAmount;
//            if (health <= 0) {
//                System.out.println("You slayed the dragon!");
//                dragonSlayed = true;
//            } else {
//                System.out.println("Attack again! The dragon has " + health + " health");
//            }
//        }
//
//        if (!dragonSlayed) {
//            System.out.println("You lost!");
//        } else {
//            System.out.println("You won!");
//        }
//        System.out.println("Game over, goodbye!");
//        myScanner.close();
//    }
//}



