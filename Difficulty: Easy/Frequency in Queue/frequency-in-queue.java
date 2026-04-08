class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        q.add(k);
    }

    static int findFrequency(Queue<Integer> q, int k) {
        int count=0;
        int size = q.size();
        for (int i=0;i<size;i++){
            int val =q.poll();
            
            if(val==k) count++;
            
            q.add(val);
        }
        return count == 0 ? -1 :count;
    }
}