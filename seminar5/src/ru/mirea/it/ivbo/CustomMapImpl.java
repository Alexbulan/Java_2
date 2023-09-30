package ru.mirea.it.ivbo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;


public class CustomMapImpl<K, V> implements Map<K, V> {

    class Node<K, V> {
        K key;
        V value;
        Node next;
        Node prev;

        public Node(K key, V value, Node next, Node prev) {
            this.key = key;
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    private int DEFAULT_CAPACITY = 10;

    Node[] buckets =  new Node[DEFAULT_CAPACITY];

    int size = 0;

    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        int hash = key.hashCode();
        int bucketIndex = hash % DEFAULT_CAPACITY;
        if(buckets[bucketIndex] == null){
            buckets[bucketIndex] = new Node(key, value, null, null);
        }else{
            var node = new Node(key, value, buckets[bucketIndex], null);
            buckets[bucketIndex].prev = node;
            buckets[bucketIndex] = node;
        }
        size++;
        return value;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

}
