package TrainComposition;

import java.util.*;

public class TrainComposition {
    Deque<Integer> deque = new ArrayDeque();
    public void attachWagonFromLeft(int wagonId) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        deque.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        deque.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        int wagonId = deque.removeFirst();
        return wagonId;
    }

    public int detachWagonFromRight() {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        int wagonId = deque.removeLast();
        return wagonId;
    }

    public static void main(String[] args) {
        TrainComposition train = new TrainComposition();
        train.attachWagonFromLeft(7);
        train.attachWagonFromLeft(13);
        System.out.println(train.detachWagonFromRight()); // 7
        System.out.println(train.detachWagonFromLeft()); // 13
    }
}
