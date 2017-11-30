package com.graphs;

public class Test {

    public static void main(String[] args) {
        Node thisNode = new Node("/wiki/List_of_law_clerks_of_the_Supreme_Court_of_the_United_States");
        Node oneWordNode = new Node("/wiki/Doug_lea");
        System.out.println(thisNode.findSimilarity(oneWordNode));

    }


}
