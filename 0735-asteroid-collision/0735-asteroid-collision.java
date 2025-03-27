import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> p = new Stack<>();
        Stack<Integer> n = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                p.push(asteroids[i]);
            } else {
                while (!p.isEmpty() && p.peek() > 0) {
                    if (p.peek() + asteroids[i] > 0) {
                        asteroids[i] = 0;
                        break;
                    } else if (p.peek() + asteroids[i] == 0) {
                        p.pop();
                        asteroids[i] = 0;
                        break;
                    } else {
                        p.pop();
                    }
                }
                if (asteroids[i] != 0) {
                    n.push(asteroids[i]);
                }
            }
        }

        List<Integer> resultList = new ArrayList<>(n);
        resultList.addAll(p);

        int[] result = new int[resultList.size()];
        for (int j = 0; j < result.length; j++) {
            result[j] = resultList.get(j);
        }

        return result;
    }
}
