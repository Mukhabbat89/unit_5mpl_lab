public class Card {
    private char suit;  // 's' for spades, 'h' for hearts, 'd' for diamonds, 'c' for clubs
    private int value;  // Value from 1 to 13

    // Constructor
    public Card(char suit, int value) {
        this.suit = suit;
        setValue(value);  // Ensures value is within range
    }

    // Setter for value with validation
    public void setValue(int value) {
        if (value < 1 || value > 13) {
            this.value = 1;  // Assign 1 if out of range
        } else {
            this.value = value;
        }
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Getter for suit
    public char getSuit() {
        return suit;
    }

    // Display card details
    public void displayCard() {
        System.out.println("Card: " + suit + " " + value);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a Card object
        Card card = new Card('h', 10);
        card.displayCard();  // Output: Card: h 10

        // Set an invalid value and display
        card.setValue(15);  // Out of range, should set value to 1
        card.displayCard();  // Output: Card: h 1
    }
}
