# 题解

## 思路
```text
其实获取最大值的最大连续数量

1. 用四个变量记录下最大值和最大连续数量，之前最大值和最大连续数量
2. 遍历数据，比较当前值和最大值
如果相同，则当前最大连续数量+1
如果更大，则最大值置为当前值，并将最大连续数量置为 1
如果更小
  如果当前最大值小于历史最大值，则不处理
  如果当前最大值等于历史最大值，则将历史最大量连续数 与 当前最大连续数对比，选更大的
  如果当前最大值大于历史最大值，则将历史最大值和历史最大连续数都替换为当前
3. 比较历史最大值与当前最大值，像前面第二步中的第三步
```