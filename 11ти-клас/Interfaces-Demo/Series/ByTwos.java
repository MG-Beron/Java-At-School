package Series;

public class ByTwos implements Series{
    private int start;
    private int val;

    public ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = 0;
        start = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}
