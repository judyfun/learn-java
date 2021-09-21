### reference 
- [stream/package-summary](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)

### create stream
- Streams can be obtained in a number of ways. Some examples include:
- From a Collection via the stream() and parallelStream() methods;
- From an array via Arrays.stream(Object[]);
- From static factory methods on the stream classes, such as Stream.of(Object[]), IntStream.range(int, int) or Stream.iterate(Object, UnaryOperator);
- The lines of a file can be obtained from BufferedReader.lines();
- Streams of file paths can be obtained from methods in Files;
- Streams of random numbers can be obtained from Random.ints();
- Numerous other stream-bearing methods in the JDK, including BitSet.stream(), Pattern.splitAsStream(java.lang.CharSequence), and JarFile.stream().


### intermediate operations
- All intermediate operations are lazy.

### terminal operations
-  forEach()

### short-circuiting operations

### side-effect
- Many computations where one might be tempted to use side effects can be more safely and efficiently expressed without side-effects, such as using reduction instead of mutable accumulators. 

### Associativity
- 结合律

- Examples of associative operations include numeric addition, min, and max, and string concatenation.
### stream.reduce()
- unmuteble
- reduction stream operations allow us to produce one single result from a sequence of elements, by repeatedly applying a combining operation to the elements in the sequence.

### multilevel reduction

### stream.collect()
- muteble
- If your reduce operation involves adding elements to a collection, then every time your accumulator function processes an element, it creates a new collection that includes the element, which is inefficient. It would be more efficient for you to update an existing collection instead. You can do this with the Stream.collect method, which the next section describes.
- Unlike the reduce method, which always creates a new value when it processes an element, the collect method modifies, or mutates, an existing value.
- The collect operation is most appropriate for collecting into a List.

### diff between stream.reduce() and stream.collect()
- So the point is that the parallelisation is the same in both cases but in the reduce case we apply the function to the stream elements themselves. In the collect case we apply the function to a mutable container.
- Stream.reduce always creates a new value when it processes an element. Stream.collect modifies (or mutates) the existing value.
- 
### Difference between Concurrency and Parallelism

### Stream.paralle()
- Note: This example returns an instance of ConcurrentMap instead of Map and invokes the groupingByConcurrent operation instead of groupingBy. (See the section Concurrent Collections for more information about ConcurrentMap.) Unlike the operation groupingByConcurrent, the operation groupingBy performs poorly with parallel streams. (This is because it operates by merging two maps by key, which is computationally expensive.) Similarly, the operation Collectors.toConcurrentMap performs better with parallel streams than the operation Collectors.toMap.
### side effect
- the collect method is designed to perform the most common stream operations that have side effects in a parallel-safe manner.
- Operations like forEach and peek are designed for side effects; a lambda expression that returns void, such as one that invokes System.out.println, can do nothing but have side effects.
- never pass as parameters lambda expressions that have side effects in operations such as filter and map
### interference
- Lambda expressions in stream operations should not interfere. Interference occurs when the source of a stream is modified while a pipeline processes the stream.
### stateful
- For deterministic and predictable results, ensure that lambda expression parameters in stream operations are not stateful.

