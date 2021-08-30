## refer to

- https://github.com/biezhi/learn-java8/tree/d381976a4e33941dba6c430ba20e1f833ebdc2e8/java8-default-methods/src/main/java/io/github/biezhi/java8/defaultmethods

## 关于 default 关键字

- jdk8,接口中的可以有 default 签名的方法
- 如果子类实现了此接口，接口中有defalt签名的方法，子类可以实现，也可以不实现 也就是说default是一个子类可选的覆写的方法

## 关于 static 静态方法

- 接口中可以有静态方法
- (不仅仅)静态方法可以用来代替工厂模式，返回指定的默认实例

## refer to 
- https://www.baeldung.com/java-static-default-methods

### default method
- In a typical design based on abstractions, where an interface has one or multiple implementations, if one or more methods are added to the interface, all the implementations will be forced to implement them too. Otherwise, the design will just break down.
Default interface methods are an efficient way to deal with this issue. They allow us to add new methods to an interface that are automatically available in the implementations. Thus, there's no need to modify the implementing classes.

In this way, backward compatibility is neatly preserved without having to refactor the implementers.

### static 
- The idea behind static interface methods is to provide a simple mechanism that allows us to increase the degree of cohesion of a design by putting together related methods in one single place without having to create an object.