package ru.mirea.it.ivbo;

public class ArrayQueueModule {
    private Object[] que;
    private int initEl;
    private int finEl;

    public ArrayQueueModule() {
        this.que = new Object[20];
    }

    public Object dequeue() {
        if(isEmpty()) throw new IndexOutOfBoundsException("Empty!");
        Object obj = que[initEl++];
        if(initEl == finEl) initEl = 0;
        return obj;
    }

    public Object element() {
        if(isEmpty()) throw new IndexOutOfBoundsException("Empty");
        return que[initEl];
    }

    public void enqueue(Object obj) {
        que[finEl++] = obj;
        if(finEl == que.length) {
            Object[] new_que = new Object[que.length * 2];
            System.arraycopy(que, 0, new_que, 0, que.length);
            que = new_que;
        }
    }

    public boolean isEmpty() {
        return (initEl == finEl && initEl == 0);
    }

    public void clear() {
        initEl = 0;
        finEl = 0;
        que = new Object[20];
    }
}
