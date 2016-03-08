import java.util.*;

/**
 * Created by yanxia on 3/8/16.
 */
public class FacebookInterviewRevisit{

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int value;
        TreeNode(int x){
            value = x;
        }
    }

    public static  TreeNode createATree(){
        TreeNode treeNode = new TreeNode(6);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(4);
        treeNode.left.left = new TreeNode(5);
        treeNode.left.right = new TreeNode(1);
        treeNode.left.left.left = new TreeNode(9);
        treeNode.left.left.right = new TreeNode(2);
        treeNode.left.left.right.right = new TreeNode(7);
        treeNode.right.right = new TreeNode(0);
        treeNode.right.right.left = new TreeNode(8);
        return treeNode;
    }

    public static void BFSATree(TreeNode node){
        LinkedList<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        LinkedList<Integer> weightQueue = new LinkedList<Integer>();
        TreeMap<Integer, ArrayList<Integer>> result = new TreeMap<Integer, ArrayList<Integer>>();


        nodeQueue.add(node);
        weightQueue.add(0);
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(node.value);
        result.put(0, t);

        while (!nodeQueue.isEmpty()){
            TreeNode currentNode = nodeQueue.poll();
            int currentWeight = weightQueue.poll();

//            System.out.print(currentNode.value + "  ");

            if(currentNode.left!=null){
                TreeNode left = currentNode.left;
                int leftWeight = currentWeight-1;
                nodeQueue.add(left);
                weightQueue.add(leftWeight);
                //Add the node to result, with its weight.
                if(result.get(leftWeight) == null){        //first node with this wight.
                    ArrayList<Integer> a = new ArrayList<Integer>();
                    a.add(left.value);
                    result.put(leftWeight, a);
                }else{
                    result.get(leftWeight).add(left.value);
                }
            }

            if(currentNode.right!=null){
                TreeNode right = currentNode.right;
                int rightWeight = currentWeight+1;
                nodeQueue.add(right);
                weightQueue.add(rightWeight);
                //Add the node to result, with its weight.

                if(result.get(rightWeight) == null){        //first node with this wight.
                    ArrayList<Integer> a = new ArrayList<Integer>();
                    a.add(right.value);
                    result.put(rightWeight, a);
                }else{
                    result.get(rightWeight).add(right.value);
                }
            }
        }

        for(Map.Entry<Integer, ArrayList<Integer>> e:result.entrySet()){
            ArrayList<Integer> tempA = e.getValue();
            for(int i:tempA){
                System.out.print(i + " ");
            }
        }
    }


}
