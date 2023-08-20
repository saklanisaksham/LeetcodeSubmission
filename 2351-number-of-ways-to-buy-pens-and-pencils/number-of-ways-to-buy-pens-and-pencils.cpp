class Solution {
public:
    long long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long long res = 0;
        int i=0;
        while(i<=total/cost1){
            res+=((total-(cost1*i))/cost2)+1;
            i++;
        }
        return res;
    }
};