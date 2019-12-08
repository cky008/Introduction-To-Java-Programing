package homeworkChapter3;

public class pickCard {
    public static void main(String[] Args){
        int rank = (int) (Math.random() * 13 + 1);
        int suit = (int) (Math.random() * 4 + 1);
        switch (rank) {
            case 1 : System.out.print("The card you picked is Ace of "); break;
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
            case 8 :
            case 9 :
            case 10 : System.out.print("The card you picked is " + rank + " of "); break;
            case 11 : System.out.print("The card you picked is Jack of "); break;
            case 12 : System.out.print("The card you picked is Queen of "); break;
            case 13 : System.out.print("The card you picked is King of ");
        }
        switch (suit) {
            case 1 : System.out.print("Clubs"); break;
            case 2 : System.out.print("Diamonds"); break;
            case 3 : System.out.print("Hearts"); break;
            case 4 : System.out.print("Spades");
        }
    }
}
