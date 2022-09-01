package W04;

public class W04_Q_3 {
    public static void main(String[] args) {
        String[] front = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] back = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        System.out.println(front[(int)(Math.random() * 4)] + "의 " + back[(int)(Math.random() * 13)]);
    }
}
