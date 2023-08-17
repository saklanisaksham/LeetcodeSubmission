class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        Arrays.sort(salary);
        float sum=0.0f;
        for(int i=1;i<n-1;i++){
            sum+=salary[i];
        }
        return (double)(sum)/(n-2);
    }
}