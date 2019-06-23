package ch20pc04;

/**
 * 
 * @author frank
 */
public class Ch20pc04 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Instantiate SortedLinkedList
        SortedLinkedList scoreboard = new SortedLinkedList();
        
        // Insert Gamer names
        scoreboard.insert("Thatcher", 1600);
        scoreboard.insert("Rousseau", 645);
        scoreboard.insert("Gaulle", 953);
        scoreboard.insert("Kennedy", 1734);
        scoreboard.insert("Monroe", 2305);
        scoreboard.insert("King", 2400);
        scoreboard.insert("Lincoln", 1354);
        scoreboard.insert("Orwell", 489);
        scoreboard.insert("Darwin", 1977);
        scoreboard.insert("Presley", 1800);
        
        // Print
        System.out.println("Welcome to the Top Ten Gamers program.");
        System.out.println("First ten: ");
        System.out.println(scoreboard);
        
        System.out.println("New score below minimum: ");
        scoreboard.insert("Einstein", 100);
        System.out.println(scoreboard);
        
        System.out.println("New score above minimum: ");
        scoreboard.insert("Parks", 5600);
        System.out.println(scoreboard);
    }

}
