package mk;

import java.util.Arrays;

public class Solution {

    public int solution(int[] a) {
        Arrays.sort(a);
        if (isOneElementEquaslOne(a) || isNextElementBiggerByOne(a)) {
            return 1;
        }
        return 0;
    }

    private Boolean isNextElementBiggerByOne(int[] a) {
        if (a[0]!=1){
                return false;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + 1 != a[i + 1]) {
                return false;
            }
        }
        return true;
}

    private Boolean isOneElementEquaslOne(int[] a) {
        if (a.length==1&&a[0]==1){
            return true;
        }
        return false;
    }

}
