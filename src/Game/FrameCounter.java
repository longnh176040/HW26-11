package Game;

public class FrameCounter {
    int countMax, count;

    public FrameCounter(int countMax) {
        this.countMax = countMax;
        this.count = 0;
    }

    public boolean run() {
        if (count >= countMax) {
            return true;
        }
        this.count++;
        return false;
    }

    public void reset() {
        this.count = 0;
    }
}
