public class Codec {

    private int index;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if (root == null)
            return "null";

        return root.val + ","
                + serialize(root.left) + ","
                + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        String[] values = data.split(",");

        index = 0;

        return buildTree(values);
    }

    private TreeNode buildTree(String[] values) {

        if (values[index].equals("null")) {
            index++;
            return null;
        }

        TreeNode root =
                new TreeNode(Integer.parseInt(values[index]));

        index++;

        root.left = buildTree(values);
        root.right = buildTree(values);

        return root;
    }
}