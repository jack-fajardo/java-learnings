    public static int diagonalDifference(List<List<Integer>> arr) {
        int primarySum = 0;
        int secondarySum = 0;
        int n = arr.size();
        for(int ctr = 0 ; ctr < n ; ctr++){
            primarySum += arr.get(ctr).get(ctr);
            secondarySum += arr.get(ctr).get(n - 1 - ctr);
        }
        
        return secondarySum - primarySum;
    }
