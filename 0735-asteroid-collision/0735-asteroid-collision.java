import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> p = new Stack<>(); // Stack for positive asteroids
        Stack<Integer> n = new Stack<>(); // Stack for remaining negative asteroids

        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                p.push(asteroid); 
            } else {
                
                while (!p.isEmpty() && p.peek() > 0) {
                    if (p.peek() > -asteroid) { 
                        asteroid = 0;
                        break;
                    } else if (p.peek() == -asteroid) { 
                        p.pop();
                        asteroid = 0;
                        break;
                    } else { 
                        p.pop();
                    }
                }
                if (asteroid != 0) {
                    n.push(asteroid); 
                }
            }
        }

        // Merge stacks into a single result
        List<Integer> resultList = new ArrayList<>(n);
        resultList.addAll(p);

        // Convert List to int[]
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
