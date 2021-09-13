### stream

| map() | flatmap() |
| :----- | :------ |
| It processes stream of values | It processes stream of stream of values|
| It does only mapping | It performs mapping as well flatting |
| It's mapper function produces single value for each input value | It's mapper function produces multiple values for each input value |
| It is a One-To-One mapping | It is a One-To-Many mapping |
| Data Transformation: From Stream to Stream | Data Transformation: From Stream<Stream to Stream |
| Use this method when the mapper function is producing a single value for each input value | Use this method when the mapper function is producing multiple values for each input value.

### personal understanding
First, we have an Array.

Second, we need identified the structure of this Array.

If it is a simple structure, like ```List<String>```, not nested, not cascaded.
We can use like ```.stream().map()```, the result is ```Stream<String>```,
we can concat other functional method of Stream.

If it is a complex structure, like ```List<List<String>>```, it is nested, or cascaded.
If we use like ```.stream().map()```, the result is like ```Stream<Stream<String>>```,
the result is nested and cascaded, we can not concat any other functional method
of stream. we need use like ```.stream().flatmap()```, the result is like ```Stream<Stream<String>>```,
thus, we can also concat other functional method.

So, ```.map()``` performs only mapping. And ```.flatmap()``` performs mapping as well flatting.