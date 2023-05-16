import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        /*if(list == null || list.length < 2)
            return null;
        int[] result = new int[2];
        for(int i = 0; i < list.length - 1; i++){
            for(int j = i + 1; j < list.length; j++){
                if(list[i] + list[j] == sum) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;*/
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i=0; i<list.length; i++)
        {
            int req = sum - list[i];
            if (hmap.get(req) != null)
                return new int[]{i, hmap.get(req)};

            hmap.put(list[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}