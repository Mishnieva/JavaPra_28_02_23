package ua.ithillel.www.javapra.Mishnieva.task.train.example1;

public class Exemple2 <T> {
    private T instance;

    private Exemple2() {
    }

    public static <T> Exemple2 <T> init(T instantiator) {
        return new Exemple2<T>();
    }

    public T getInstance() {
        return instance;
    }

    public void set(T obj) {
        instance = obj;
    }
}
