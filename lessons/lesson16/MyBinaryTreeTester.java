package lessons.lesson16;

public class MyBinaryTreeTester {
    public static void main(String[] args) {
        MyBinaryTree.Vortex v5 = new MyBinaryTree.Vortex(5);
        MyBinaryTree.Vortex v7 = new MyBinaryTree.Vortex(7);
        MyBinaryTree.Vortex v6 = new MyBinaryTree.Vortex(6, v5, v7);
        MyBinaryTree.Vortex v10 = new MyBinaryTree.Vortex(10);
        MyBinaryTree.Vortex root = new MyBinaryTree.Vortex(8, v6, v10);

        MyBinaryTree tree = new MyBinaryTree(root);
        System.out.println(tree.depth());
        System.out.println(tree.countVertices());

        System.out.println(tree);
    }


}
