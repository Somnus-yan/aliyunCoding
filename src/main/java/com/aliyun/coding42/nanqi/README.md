# 题解

## 思路
```text
先用 Arrays 从小到大排序
再将当前的最小值，从左到右依次遍历，如果取余不为 0，则将最小值变为当前结果余，继续，直至遍历完成
中间有一点很关键，就是每次遍历的时候余不为 0，则说明最小值需要发生变化,再将余数与最小值再取余比较，则能拿到最小余
```