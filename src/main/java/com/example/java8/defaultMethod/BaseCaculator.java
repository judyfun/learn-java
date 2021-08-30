package java8.defaultMethod;

public class BaseCaculator implements Caculator {
    @Override
    public int add(int a1, int a2) {
        return a1 + a1;
    }

    @Override
    public int sub(int a1, int a2) {
        return a1 - a2;
    }

    @Override
    public int multi(int a1, int a2) {
        return a1 * a2;
    }

    @Override
    public double divide(int a1, int a2) {
        return a1 / a2;
    }



}
