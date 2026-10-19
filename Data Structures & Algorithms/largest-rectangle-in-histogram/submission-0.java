class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int []nse = new int[n];
        nse[n-1] = n;
        st.push(n-1);
        for(int i = n-2; i>=0; i--){
            while(!st.empty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.empty()) nse[i]= n;
            else nse[i] = st.peek();
            st.push(i);
        }
         while(!st.empty()) st.pop();

        int []pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for(int i = 1; i<n; i++){
            while(!st.empty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.empty()) pse[i]= -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        int maxArea = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            int area = arr[i] * (nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}