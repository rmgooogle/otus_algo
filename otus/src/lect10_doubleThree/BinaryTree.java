package lect10_doubleThree;

public class BinaryTree {
    Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value > current.getValue()) {
            current.setRight(insert(current.getRight(), value));
        } else if (value < current.getValue()) {
            current.setLeft(insert(current.getLeft(), value));
        }
        return current;
    }

    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (current.getValue() == value) {
            return true;
        }

        if(value < current.getValue())
            return search(current.getLeft(), value);
        else return search(current.getRight(), value);
    }


    public void remove(int value) {
        remove(root, value);
    }

    private Node remove(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.getValue()) {

            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }

            if (current.getRight() == null) {
                return current.getLeft();
            }

            if (current.getLeft() == null) {
                return current.getRight();
            }

            int changedValue = getSmallestValue(current.getRight());
            current.setValue(changedValue);
            current.setRight(remove(current.getRight(), changedValue));

            return current;
        }

        if (value < current.getValue()) {
            current.setLeft(remove(current.getLeft(), value));
            return current;
        }
        current.setRight(remove(current.getRight(), value));

        return current;
    }

    private int getSmallestValue(Node current) {
        if (current.getLeft() == null )
            return  current.getValue();
        else
            return getSmallestValue(current.getLeft());
    }

    private void sout(Node current) {
        if (current.getRight() != null) {
            sout(current.getRight());
        }

        if (current.getLeft() != null) {
            sout(current.getLeft());
        }

        System.out.print(current.getValue() + " ");
    }
    public void sout() {
        if (root != null) {
            sout(root);
        }
    }
}
