# 35. 找出二叉搜索树的第2大的数

## 概述
```text
给定一个二叉搜索树，找出其第二大的数。
```

## 示例
```text
比如二叉搜索树如下
![](https://github.com/ZivYan/aliyunCoding/blob/master/src/main/java/com/aliyun/coding35/BinarySearchTree.jpg)

那么第二大的值是25
```

## 注意
```text
对于二叉搜索树，若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值。
（TreeNode的right，left，val这三个成员，分别表示左子节点，右子节点，节点值。）
```