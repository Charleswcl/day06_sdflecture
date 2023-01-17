package sg.edu.nus.iss;

@FunctionalInterface //this line is optional

public interface MyRunnableInterface<T> {
    
    T process(T a, T b);    
}
