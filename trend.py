import unittest


class Node(object):
    def __init__(self, name, value):
        self.name = name
        self.value = value
        self.children = []

    def __repr__(self):
        return "{}:{}".format(self.name, self.value)


def find_node(root, target_value):
    """
    Search the subtree for a node whose ``value`` attribute matches the given target value.

    This function should return the first node ``n`` it finds where ``n.value == target_value``.
    If no node is found, or an empty tree is given (``root is None``), then this function should return ``None``.
    If multiple nodes match the target value, you can return any of them.

    :param root: the root node of the subtree to search
    :param target_value: the target value that the returned node's ``Node.value`` attribute must match.
    :returns: the ``Node`` object that matches the target value, or ``None`` if no node matches
    """
    print("find_node({}, {})".format(root, target_value))
    for i in root:
        print()
        



class NodeFinderTests(unittest.TestCase):
    def setUp(self):
        # Tree structure:
        #        a:1
        #         |
        #   [ b:2,  d:4 ]
        #     /       \
        # [ c:3 ] [ e:5, f:1 ]
        self.a = Node(name="a", value=1)
        self.b = Node(name="b", value=2)
        self.c = Node(name="c", value=3)
        self.d = Node(name="d", value=4)
        self.e = Node(name="e", value=5)
        self.f = Node(name="f", value=1)

        self.a.children = [self.b, self.d]
        self.b.children = [self.c]
        self.d.children = [self.e, self.f]

    def test_ambiguous_match(self):
        """If multiple nodes match the target value, `find_node` can return any of them."""
        result = find_node(self.a, 1)
        self.assertTrue(result is self.a or result is self.b)

    def test_empty_tree(self):
        self.assertIsNone(find_node(None, 1))

    def test_first_child(self):
        """The root node's first child contains the target value."""
        self.assertIs(self.b, find_node(self.a, 2))
        self.assertIs(self.c, find_node(self.b, 3))

    def test_under_first_child(self):
        """A child of the root node's first child contains the target value."""
        self.assertIs(self.c, find_node(self.a, 3))

    def test_not_found(self):
        self.assertIsNone(find_node(self.a, 6))
        # A node should not be able to search inside its parent or siblings.
        self.assertIsNone(find_node(self.b, 1))
        self.assertIsNone(find_node(self.d, 2))

    def test_second_child(self):
        """The root node's second child contains the target value."""
        self.assertIs(self.d, find_node(self.a, 4))
        # Node D knows nothing of node A, so searching inside D should always return F instead of A.
        self.assertIs(self.f, find_node(self.d, 1))

    def test_under_second_child(self):
        """A child of the root node's second child contains the target value."""
        self.assertIs(self.e, find_node(self.a, 5))

    def test_self(self):
        """The root node contains the target value."""
        self.assertIs(self.b, find_node(self.b, 2))
        self.assertIs(self.c, find_node(self.c, 3))
        self.assertIs(self.d, find_node(self.d, 4))
        self.assertIs(self.e, find_node(self.e, 5))
        # Node F knows nothing of node A, so searching inside F should always return F instead of A.
        self.assertIs(self.f, find_node(self.f, 1))


if __name__ == "__main__":
    unittest.main(verbosity=2)