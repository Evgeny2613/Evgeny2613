package lessons.lesson16;

public class MyBinaryTree {
    public static class Vortex {
        Vortex left;
        Vortex right;
        int value;

        @Override
        public String toString() {
            String r = "{";
            r += "\"left\":";
            r += left == null ? "{}" : left.toString();
            r += ", \"value\":";
            r += value;
            r += ",";
            r += "\"rights\":";
            r += right == null ? "{}" : right.toString();
            r += "}";
            return r;
        }

        int depth() {
            return 1 + Math.max(left == null ? 0 : left.depth(), right == null ? 0 : right.depth());
        }

        public Vortex(int value, Vortex left, Vortex right) {
            this.left = left;
            this.right = right;
            this.value = value;
        }

        public Vortex(int value) {
            this.value = value;
        }

        public int countVertices() {
            return 1 + (right == null ? 0 : right.countVertices()) + (left == null ? 0 : left.countVertices());
        }
    }

    private Vortex root;

    public MyBinaryTree(Vortex root) {
        this.root = root;
    }

    public int countVertices() {
        return root.countVertices();
    }

    public int depth() {
        return root.depth();
    }

    public MyBinaryTree.Vortex addRecursive(Vortex current, int value) {
        if (current == null)
            return new Vortex(value);
        if (value < current.value)
            current.left = addRecursive(current.left, value);
        else if (value > current.value)
            current.right = addRecursive(current.right, value);
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    @Override
    public String toString() {
        return root.toString();
    }
}


