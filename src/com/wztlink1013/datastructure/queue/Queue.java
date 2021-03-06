package com.wztlink1013.datastructure.queue;

import com.wztlink1013.datastructure.queue.list.LinkedList;
import com.wztlink1013.datastructure.queue.list.List;

public class Queue<E> {
    private List<E> list = new LinkedList<>();

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
    }

    public void enQueue(E element) {
        list.add(element);
    }

    public E deQueue() {
        return list.remove(0);
    }

    public E front() {
        return list.get(0);
    }
}
