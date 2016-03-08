import java.util.LinkedList;

/**
 * Created by yanxia on 3/8/16.
 */
public class LinkedInInterview {

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int value;
        TreeNode(int x){
            value = x;
        }
    }

    public static  TreeNode createATree(){
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.left.left.left = new TreeNode(6);
        treeNode.left.left.right = new TreeNode(7);
        return treeNode;
    }

    public static void  inOrderPrint(TreeNode node){
        if(node == null)
            return;
        System.out.print(node.value);
        inOrderPrint(node.left);
        inOrderPrint(node.right);
    }

    public static void BFSPrint(TreeNode node){
        LinkedList<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        nodeQueue.add(node);
        while(!nodeQueue.isEmpty()){
            TreeNode currentNode = nodeQueue.pop();
            System.out.print(currentNode.value + "     ");
            if(currentNode.left!=null)
                nodeQueue.add(currentNode.left);

            if(currentNode.right!=null)
                nodeQueue.add(currentNode.right);
        }
    }

    public static LinkedList<TreeNode> readTreeToStack(TreeNode node){
        LinkedList<TreeNode> nodeStack  = new LinkedList<TreeNode>();
        nodeStack.push(node);
        while(nodeStack.peek().right!=null && nodeStack.peek().left!=null){
            TreeNode currentNode = nodeStack.peek();
            nodeStack.push(currentNode.right);
            nodeStack.push(currentNode.left);
        }
        return nodeStack;
    }

    public static TreeNode createTreeFromNodeStack(LinkedList<TreeNode> nodeStack){
        TreeNode root = nodeStack.pop();
        TreeNode pointer = root;
        while(!nodeStack.isEmpty()){
            pointer.left = nodeStack.pop();
            pointer.right = nodeStack.pop();
            if(nodeStack.size() == 0){
                pointer.right.left= null;
                pointer.right.right = null;
            }else{
                pointer=pointer.right;
            }
        }
        return root;
    }
}
