package com.company;

public class IntTree {

    // An IntTree object represents an entire binary tree of ints.
        private IntTreeNode overallRoot;   // null for an empty tree

public IntTree(IntTreeNode overallRoot){
    this.overallRoot=overallRoot;
}

public IntTree(int height){

    for (int i=1; i<=height; i++){
var proxy=new IntTreeNode((int)Math.random());
    overallRoot.data=(int)Math.random();
    overallRoot.left=new IntTreeNode((int)Math.random());
    overallRoot.right=new IntTreeNode((int)Math.random());


}

}

    }
