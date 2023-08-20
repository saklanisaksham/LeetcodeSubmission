class Solution {
public:
    int minimumRounds(vector<int>& tasks) {
        unordered_map<int,int> m;
        int count=0;
        
        for(auto &task: tasks){
            m[task]++;
        }
       
        for(auto it=m.begin();it!=m.end();it++){
            if(it->second==1){
                count=-1;
                break;
            }
            else{
                count+=ceil((it->second)/3.0);
            }
        }
        return count;
    }
};