package ch20pc04;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 
 * @author frank
 */
public class SortedLinkedList extends LinkedList<GameStat> {
    GameStat head;
    LinkedList<GameStat> linkedList = new LinkedList<GameStat>();
    
    public void insert(String name, int score) {
        head = new GameStat(name, score);
        if (linkedList.size() < 10) {
            linkedList.add(head);
            Collections.sort(linkedList);
        } else {
            if (score > linkedList.get(9).score) {
                linkedList.remove(9);
                linkedList.add(head);
                Collections.sort(linkedList);
            }
        }
    }
    
    public String toString() {
        System.out.println(this.linkedList);
        return " ";
    }
}