## example with Integer
### IntStream / stream
example
```java
int sum = myStream.mapToInt(s -> s.length).reduce(0, (sum, a) -> sum+a);
```
based on IntStream's, it is a primitive type in stream, need not to autoboxing when apply accumulator
```java
int reduce(int identity, IntBinaryOperator op);
```

- less performant alternative
```java
int sum = myStream.map(s -> s.length).reduce(0, (sum, a) -> sum+a);
```
based on Stream<T>'s, it involves autoboxing, so it is a stream of boxed integers.
```java
T reduce(T indentity, BinaryOperator<T> accumulator);
```
`Stream<Integer>`, some of the process is like blowing:
```java
(Integer l1, Integer l2) ->
        { return Integer.valueOf( l1.intValue() + l2.intValue() );}
```
- works with reduce() (not collection())
    - because it is a immutable reduction
    - because Integer is immutable

### combiner
- combiner not used for sequential stream
- but null cannot be used as combiner
  - operations check that functional parameters are not null
  - otherwise throw NullPointerException

## example with strings(string in jvm is immutable)

### a solution based on StringBuilder



- Encounter order is nothing but the order of the source.