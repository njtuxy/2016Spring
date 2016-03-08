import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by yanxia on 3/8/16.
 */
public class LinkedInInterviewTest {

    @Test
    public void testInOrderPrint() throws Exception {
//        LinkedInInterview.BFSPrint(LinkedInInterview.createATree());
       LinkedList<LinkedInInterview.TreeNode> t =  LinkedInInterview.readTreeToStack(LinkedInInterview.createATree());
        LinkedInInterview.BFSPrint(LinkedInInterview.createTreeFromNodeStack(t));
    }
}