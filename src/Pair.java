public class Pair <T,V> {
    private T t;
    private  V v;

    Pair (T t, V v){
        this.t = t;
        this.v = v;
    }

    public T getFirst(){
        return t;
    }

    public V getSecond(){
        return v;
    }

    public String toString(){
        return  t.toString() + "_" + v.toString();
    }
}
