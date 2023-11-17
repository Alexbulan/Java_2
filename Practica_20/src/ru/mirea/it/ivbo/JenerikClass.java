package ru.mirea.it.ivbo;


public class JenerikClass <T, V, K>{
    T t;
    V v;
    K k;

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public JenerikClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public void returnClassName(){
        System.out.println(t + " - " + t.getClass());
        System.out.println(v + " - " + v.getClass());
        System.out.println(k + " - " + k.getClass());
    }
}
