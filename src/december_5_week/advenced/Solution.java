package december_5_week.advenced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    static int result;
    static HashMap<Integer, List<Integer>> nodeMap;
    public int solution(int[] info, int[][] edges) {
        result = 0;
        nodeMap = new HashMap();
        for (int[] e : edges) {
            if (nodeMap.containsKey(e[0])) {
                List<Integer> nodeList = nodeMap.get(e[0]);
                nodeList.add(e[1]);
            } else {
                ArrayList<Integer> newNoneList = new ArrayList<>();
                newNoneList.add(e[1]);
                nodeMap.put(e[0], newNoneList);
            }
        }

        DFS(info, 0, 0, 0, new ArrayList<>());
        return result;
    }

    private void DFS(int[] info,int node, int sheep, int wolf, List<Integer> nextNode) {
        if (info[node] == 0) {
            sheep++;
        } else  {
            wolf++;
        }

        if (wolf >= sheep) {
            return;
        }

        result = Math.max(result, sheep);

        List<Integer> next = new ArrayList<>();
        next.addAll(nextNode);

        if (nodeMap.containsKey(node)) {
            next.addAll(nodeMap.get(node));
        }
        next.remove(Integer.valueOf(node));

        for (int n : next) {
            DFS(info, n, sheep, wolf, next);
        }
    }
}
