package com.company;

public class Main {

    public static void main(String[] args) {
        BinNode<Integer> tr1 = new BinNode<Integer>(null, 1, new BinNode<Integer>(
                new BinNode<>(1), 2, null));
        BinNode<Integer> tr2 = new BinNode<Integer>(tr1, 1,
                new BinNode<Integer>(2));
        BinNode<Integer> tr3 = new BinNode<Integer>(
                new BinNode<>(2), 2,
                new BinNode<Integer>(2));
        BinNode<Integer> tr4 = new BinNode<Integer>(null, 2, new BinNode<Integer>(1));
        BinNode<Integer> tr5 = new BinNode<Integer>(tr3, 2, tr4);
        BinNode<Integer> root = new BinNode<Integer>(tr2, 1, tr5);

        System.out.println(onePath(root));


    }
    public static boolean onePath(BinNode<Integer> t){
        return uniquePath(t, 1) ;
    }
    public static boolean uniquePath(BinNode<Integer> t, int val) {
        //stop condition
        if(t==null)
            return false;
        if (isLeaf(t))
            return true;
        //check condition
        if(t.getValue()!=val)
            return false;
        if ((t.getLeft() != null && t.getLeft().getValue() != val) &&
                (t.getRight() != null && t.getRight().getValue() != val))
            return false;
        if ((t.getLeft() != null && t.getLeft().getValue() != val) &&
                (t.getRight() == null ))
            return false;
        if ((t.getRight() != null && t.getRight().getValue() != val) &&
                (t.getLeft() == null ))
            return false;
        return uniquePath(t.getLeft(), val) ||
                uniquePath(t.getRight(), val);

    }

    public static int childCode(BinNode<Integer> tr) {
        if (isLeaf(tr))
            return 0;
        if (tr.getLeft() != null && tr.getRight() == null)
            return 1;
        if (tr.getLeft() == null && tr.getRight() != null)
            return 2;
        return 3;
    }

    public static boolean isLeaf(BinNode<Integer> tr) {
        if(tr.getLeft() == null && tr.getRight()==null && tr!=null)
            return true;
        return false;
    }
}
