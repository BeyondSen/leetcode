public static int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] array = new int[len];
        for (int i=0; i<len; i++) {
            array[i] = numbers[i];
        }
        Arrays.sort(numbers);
        
        int left = 0, right = len - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                break;
            }
        }
        
        int[] index = {-1,-1};
        for (int i=0; i<len; i++) {
            if (numbers[left]==numbers[right] && numbers[left]==array[i]) { //for two numbers equals
                if (index[0]==-1) {
                    index[0] = i+1;
                }else
                    index[1] = i+1;
                continue;
            }
            if (numbers[left]==array[i]) {
                if (index[0]==-1) {
                    index[0] = i+1;
                }else
                    index[1] = i+1;
            }
            if (numbers[right]==array[i]) {
                if (index[0]==-1) {
                    index[0] = i+1;
                }else
                    index[1] = i+1;
            }
        }
        return index;
    }