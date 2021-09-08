### oracle ref

- [Oracle java8-optional](https://www.oracle.com/technical-resources/articles/java/java8-optional.html)

### optional api

| Method | Description|
|:---- :|:---- |
| empty | 返回一个空的Optional实例，这个Optional的value没有值, 是null |
| of | 构造一个给定的非空值的Optional实例 |
|ofNullable| 构造一个可以为null的Optional实例 |
| isPresent | 判断value是否为非null | 
| isEmpty | 判断value是否为null |
| ifPresent | 如果值存在，执行给定Action的Cosumer，否则do nothing|
| ifPresentOrElse | 如果值存在，执行给定Action的Cosumer，否则，执行另一个action|
| filter | 如果有值，且这个值在执行了Predicate.test返回true，则返回描述这个值的Optional，否则返回一个Empty的Optional | 
| map | 如果值存在，返回包含 应用了Function函数后返回值 的Optional实例，否则返回空的Optional
| flatMap | 如果值存在，就对该值执行提供的 mapping 函数调用，返回一个 Optional 类型的值，否则就返 回一个空的 Optional 对象 |
| orElse | 如果值存在，返回这个值，否则返回给定的其他值 |
| orElseGet | 如果值存在，则返回这个值，否则返回一个有指定的Supplier接口生成的值 |
| orElseThrow | 如果值存在，则返回这个值，否则返回 NoSuchElementException |

### 关于map和flatMap 

![image](https://www.oracle.com/ocom/groups/public/@otn/documents/digitalasset/2175764.gif)