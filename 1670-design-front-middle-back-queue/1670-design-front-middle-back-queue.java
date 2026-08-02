class FrontMiddleBackQueue {
    Deque<Integer> f;
    Deque<Integer> s;

    public FrontMiddleBackQueue() {
        f = new ArrayDeque<>();
        s = new ArrayDeque<>();
    }
    
    private void balance(){
        if(f.size() > s.size() + 1){
            s.addFirst(f.removeLast());
        }
        else if(f.size() < s.size()){
            f.addLast(s.removeFirst());
        }
    }
    public void pushFront(int val) {
        f.addFirst(val);
        balance();
    }
    
    public void pushMiddle(int val) {
        if(f.size() > s.size()){
            s.addFirst(f.removeLast());
        }
        f.addLast(val);
    }
    
    public void pushBack(int val) {
        s.addLast(val);
        balance();
    }
    
    public int popFront() {
        if(f.isEmpty() && s.isEmpty()) return -1;

        int ans;
        if(!f.isEmpty()){
            ans = f.removeFirst();
        }
        else{
            ans = s.removeFirst();
        }
        balance();
        return ans;
    }
    
    public int popMiddle() {
        if(f.isEmpty() && s.isEmpty()) return -1;
        int ans = f.removeLast();
        balance();
        return ans;
    }
    
    public int popBack() {
        if(f.isEmpty() && s.isEmpty()) return -1;

        int ans;
        if(!s.isEmpty()){
            ans = s.removeLast();
        }
        else{
            ans = f.removeLast();
        }
        balance();
        return ans;

    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */