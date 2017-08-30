



public class Card{
    private int rank;
    private int suit;
    
    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }
    
    public static final String[] RANKS = {null,
        "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};
        
    public static final String[] SUITS = {"Clubs",
        "Diamonds", "Hearts", "Spades"};
        
    public String toString(){
        return RANKS[this.rank] + " " + SUITS[this.suit];
    }
    
    public boolean equals(Card that){
        return this.rank == that.rank && this.suit == that.suit;
    }
    
    public int compareTo(Card that){
        if (this.suit < that.suit){
            return -1;
        }
        if (this.suit > that.suit){
            return 1;
        }
        if(this.rank > that.rank){
            return -1;
        }
        if (this.rank < that.rank){
            return 1;
        }
        return 0;
    }
    
    public int getRank(){
        return this.rank;
    }
    public int getSuit(){
        return this.suit;
    }
    
    public Card[] makeDeck(){
        int index = 0;
        Card[] deck = new Card[52];
        for(int suit = 0; suit <=3; suit++){
            for(int rank = 1; rank <= 13; rank++){
                deck[index] = new Card(rank, suit);
                index++;
            }
        }
        return deck;
    }
    
    public int[] suitHist(Card[] hand){
        int[] suits = new int[5];
        int i = 0;
        for(Card card : hand){
            suits[i] = card.getSuit();
            i++;
        }
        return suits;
        
    }
    
    public boolean hasFlush(Card[] hand){
        int[] suits = suitHist(hand);
        for (int i = 0; i < hand.length; i++){
            if (hand[i] != hand[i+1]){
                return false;
            }
        }
        return true;
    }
}


