package com.company.MivneyNetunim.BeforeExam;

import com.company.MavoLehishuv.Edens.Interface.BTNode;

public class BinaryTree {
	private BTNode root;

	public BinaryTree() {
		root = null;
	}

	public void add(int data) {
		BTNode tmp = new BTNode(data);
		if (root == null) {
			root = tmp;
			return;
		}

		BTNode p = root;
		boolean hasAdded = false;
		while (!hasAdded) {
			if (Math.random() > 0.5) {
				if (p.getRight() == null) {
					p.setRight(tmp);
					hasAdded = true;
				} else {
					p = p.getRight();
				}
			} else {
				if (p.getLeft() == null) {
					p.setLeft(tmp);
					hasAdded = true;
				} else {
					p = p.getLeft();
				}

			}
		}
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(BTNode root) {
		if (root != null) {
			inOrder(root.getLeft());
			System.out.print(root.getData() + ", ");
			inOrder(root.getRight());
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(BTNode root) {
		if (root != null) {
			System.out.print(root.getData() + ", ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	
	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(BTNode root) {
		if (root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData() + ", ");
		}
	}
	public int height(){
		return height(root);
	}
	public int height(BTNode n){
		if(n==null) return 0;
		int LeftH=height(n.getLeft());
		int RightH=height(n.getRight());
		return 1+(int)(Math.max(LeftH,RightH));
	}
}
