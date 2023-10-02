class Solution {
    public boolean isHappy(int n) {
        int slow=happy(n);
        int fast=happy(happy(n));
        while(slow!=fast){
          slow=happy(slow);
          fast=happy(happy(fast));
        }
        return slow==1 ;
    }
    private int happy(int n) {
    int sum = 0;
    while (n > 0) {
      sum += Math.pow(n % 10, 2);
      n /= 10;
    }
    return sum;
  }
}
