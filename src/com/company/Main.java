package com.company;

public class Main {

    public static void main(String[] args) {
        BinNode<Integer> tr1 = new BinNode<Integer>(null, 1,new BinNode<Integer>(
                new BinNode<>(1), 2, null) );
        BinNode<Integer> tr2 = new BinNode<Integer>(tr1, 1,new BinNode<Integer>(2 ));
        BinNode<Integer> tr3 = new BinNode<Integer>(new BinNode<>(1), 1,new BinNode<Integer>(2 ));
        BinNode<Integer> tr4 = new BinNode<Integer>(null, 2,new BinNode<Integer>(1 ));
        BinNode<Integer> tr5 = new BinNode<Integer>(tr3, 1,tr4);
        BinNode<Integer> root = new BinNode<Integer>(tr2, 1,tr5);


    }

    public static boolean q3_bagrut2007_sol(BinNode<Integer> t){
        //todo - complete solution
        return true;
    }
}
