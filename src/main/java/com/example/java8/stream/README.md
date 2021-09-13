### reference 
- [stream/package-summary](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
### stream.reduce()
- reduction stream operations allow us to produce one single result from a sequence of elements, by repeatedly applying a combining operation to the elements in the sequence.

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

### terminal operations

### short-circuiting operations