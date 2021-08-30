package java8.lambda.lesson2;

import java.util.UUID;
import java.util.function.*;

public class FunctionalDemo {

    /**
     * predicate
     */
    public static void predicate() {
        Predicate<String> nameStartsWithString = name -> name.startsWith("a");
        boolean           hello                = nameStartsWithString.test("Hello");
    }

    /**
     * consumer
     */
    public static void consumer() {
        Consumer<String> outString = s -> System.out.println(s);
        outString.accept("Let us learn Java 8");
    }

    /**
     * supplier
     */
    public static void supplier() {
        Supplier<String> uuidGenerator = () -> UUID.randomUUID().toString();
        uuidGenerator.get();
    }

    /**
     * map
     */
    public static void function() {
        Function<String, String> toUpper  = s -> s.toUpperCase();
        String                   hey_body = toUpper.apply("hey body");
        System.out.println(hey_body);
    }

    /**
     * future compose
     */
    public static void compose() {
        Function<Double, Double> discountPremium = price -> price * 0.8;
        Function<Double, String> getPriceTag     = price -> String.format("Discounted Price : %s ", price);

        /*
        f(x) = x * 0.8;
        g(y) = y + 2;
        y    = f(x);

        after.apply(apply(t));
        g(y)  = g(f(x))
              = f(x) + 2 = x * 0.8 + 2;
        */
        Function<Double, String> getDiscountPremiumPriceTag = discountPremium.andThen(getPriceTag);
//        getPriceTag.compose(discountPremium);
        System.out.println(getDiscountPremiumPriceTag.apply(9.9));


        //
    }

    /**
     * BiCompose
     */
    public static void biCompose() {
        BiFunction<Double, Double, Double> discountStratege = (discount, price) -> discount * price;
        Function<Double, String>           getPriceTag      = price -> String.format("Discounted Price is : %s ", price);

        BiFunction<Double, Double, String> getDiscountStrtegeAndTag = discountStratege.andThen(getPriceTag);
        System.out.println(getDiscountStrtegeAndTag.apply(0.8, 5.9));
    }

    public static <A, B, C> Function<A, C> composeEnhence(Function<A, B> f1, Function<B, C> f2) {
        return f1.andThen(f2);
    }

    /**
     *
     */
    public static void functionEnhence() {
        Function<Person, Address> personToAddress  = Person::getAddress;
        Function<Address, String> addressToCountry = Address::getCountry;

        Function<Person, String> personToCountry = personToAddress.andThen(addressToCountry);

        composeEnhence(personToAddress, addressToCountry);
        composeEnhence(Person::getAddress, Address::getCountry);
    }

    public static void main(String[] args) {

        // predicate 1000 is a odd
        Predicate<Integer> oddNum = x -> x % 2 == 1;
        oddNum.test(1000);

        // predicate 1000 is divisible or not
        Predicate<Integer> evenNum = x -> x % 2 == 0;
        evenNum.test(9999);

        // the result of two num multi is odd or not
        BiPredicate<Integer, Integer> oddNum2 = (x, y) -> x * y % 2 == 1;
        oddNum2.test(3, 4);

        BinaryOperator<Function<Integer, Integer>> compose = (f, g) -> x -> g.apply(f.apply(x));
        Function<Integer, Integer>                 multi   = a -> a * 2;
        Function<Integer, Integer>                 plus1   = c -> c + 1;

        Function<Integer, Integer> apply   = compose.apply(multi, plus1);
        Integer                    product = apply.apply(3);

        compose();

        biCompose();
    }
}
