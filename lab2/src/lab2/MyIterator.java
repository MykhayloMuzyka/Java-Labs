package lab2;

public class MyIterator {
	private MyContainer str;
    private int current = 0;
    private int last;

    public MyIterator(MyContainer str, int length) {
        this.str = str;
        last = length - 1;
    }
    public String next() {
        return (String) str.get(current++);
    }
    public boolean hasNext() {
        return (current <= last);
    }
    public void remove() {
        str.remove(--current);
    }

}