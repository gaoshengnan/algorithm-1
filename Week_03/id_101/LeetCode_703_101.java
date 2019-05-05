class KthLargest {
    //优先队列是用堆实现的
    final PriorityQueue<Integer> q;
    final int k;

    public KthLargest(int k, int[] a) {
        //初始化k和优先队列
        this.k = k;
        q = new PriorityQueue<>(k);
        for (int n : a)
            add(n);
    }

    public int add(int n) {
        //如果当前堆的元素个数小于K,则直接放入
        if (q.size() < k)
            q.offer(n);
            //如果待加入元素n大于堆顶元素，则弹出堆顶元素，将n放入堆中
        else if (q.peek() < n) {
            q.poll();
            q.offer(n);
        }
        //返回堆顶元素
        return q.peek();
    }
}