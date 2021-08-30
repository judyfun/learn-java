package java8.growing.jdk8;

/**
 * 类型推断
 */
public class TypeInference<T> {
    public static <T> T defaultValue() {
        return null;
    }

    public T getOrDefault(T value, T defaultValue) {
        return (value != null) ? value : defaultValue;
    }

    public static void main(String[] args) {
        final TypeInference<Object> typeInference = new TypeInference<>();
        Object                      orDefault     = typeInference.getOrDefault("22", TypeInference.defaultValue());
        System.out.println(orDefault);
    }
}
