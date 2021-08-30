package java8.defaultMethod;

public interface Caculator {
    int add(int a1, int a2);

    int sub(int a1, int a2);

    int multi(int a1, int a2);

    double divide(int a1, int a2);

    default int mod(int first, int second) {
        return first % second;
    }

    static BaseCaculator getInstance() {
        return new BaseCaculator();
    }

}
