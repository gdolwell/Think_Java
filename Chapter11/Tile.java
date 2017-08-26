/**
 *
 *
 */


public class Tile{
    
    private char letter;
    private int value;
    
    public static void main(String[] args){
        Tile z = new Tile();
        z = z.testTile();
        z.printTile();
        System.out.println(z.toString());
    }
    
    public Tile(){
        this.letter = ' ';
        this.value = 0;
    }
    
    public Tile(char letter, int value){
        this.letter = letter;
        this.value = value;
    }
    
    public Tile testTile(){
        Tile z = new Tile('z', 10);
        return z;
    }
    
    public char getLetter(){
        return this.letter;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setLetter(char letter){
        this.letter = letter;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public void printTile(){
        System.out.println(this.letter + "\t" + this.value);
    }
    
    public String toString(){
        return String.format("%s, %02d", this.letter, this.value);
    }
    
    public boolean equals(Tile that){
        return this.letter == that.letter 
            && this.value == that.letter;
    }
    
}
