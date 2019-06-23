package ch20pc04;

/**
 * 
 * @author frank
 */
public class GameStat implements Comparable<GameStat>{
    String name;
    int score;
    GameStat next;
    
    GameStat(String name, int score) {
        this.name = name;
        this.score = score;
        this.next = null;
    }
    
    public String toString() {
        return name + " " + score;
    }
    
    public int compareTo(GameStat other) {
        return other.score - this.score;
    }
}