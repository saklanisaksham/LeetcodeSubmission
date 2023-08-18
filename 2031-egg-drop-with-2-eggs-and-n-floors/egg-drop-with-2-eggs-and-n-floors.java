class Solution {
    public int twoEggDrop(int n) {
        int a=0;
        while(n>0){
            a++;
            n=n -a;
        }
        return a;
    }
}