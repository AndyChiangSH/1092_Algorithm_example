# 演算法 - sorting

###### tags: `演算法`

## Selection Sort
做法: 從最左邊開始取一個標記，每次從這個標記向右找最小值的位置，並且把這兩個位置交換，標記來到最右邊後陣列就排好了。

![](https://i.imgur.com/G9yo3dF.png)




優點: 只需要N次交換

## Insertion Sort
做法: 從左邊開始，選一個位置並且跟他的左邊一個比較，如果比較小就跟他交換，如果大於等於他則停下。

![](https://i.imgur.com/7ec32no.png)

![](https://i.imgur.com/JDNV3Kl.png)




優點: 如果是接近排序好的陣列，那會很快。
缺點: 如果是由大排到小的陣列，會很慢。

## Shell Sort
做法: 每次決定一個區間值(h)，間隔h格的元素組成一個shell，我們讓每個shell都是排序好的，然後減少h值，並重複前面的動作，直到h等於1。

h決定的方式並沒有最好的解，現在也還有人持續在研究，我們用課本舉的例子: 3h+1

![](https://i.imgur.com/9orPyya.png)



優點: 如果陣列不大，這個的效能會不錯。

## Merge Sort
### merge
先複製一個空間，然後讓兩個陣列的開頭比較，較小的值先放上該空間，如果一樣則統一先放前面陣列的。

兩個排序好的陣列，融合過後的陣列一樣是排序好的。

### sort
用遞迴，每次往下切1/2。

![](https://i.imgur.com/4O5UIlk.png)

優點: 效能穩定O(NlogN)
缺點: 消耗記憶體空間，大量資料搬移費時

### 優化
1. 當區段小於CUTOFF值(通常是16、32)，改成使用Insertion sort。
2. 如果左邊區段的最大值小於等於右邊區段的最小值，直接合併就好。

## Tim Sort
Merge Sort的優化版，merge前先分成一塊塊排序好的區段，如果是已經排序好的陣列，複雜度只有O(N)。

## Sleep Sort
睡覺也能排序，我只能說想出這方法的人腦洞大開XD

## Quick Sort
做partition，選最左邊的值當p，比p小的都放在左邊，比p大的都放在右邊，然後用遞迴對左區塊和右區塊做partition。

![](https://i.imgur.com/H3E6xDR.png)



優點: 資料搬移次數少
缺點: 效能不穩定，最差可以到O(1/2 N^2^)

best case: 每次選p都剛好選到中位數
worst case: 排好的陣列 or 全部相同值

### 優化
1. 當區段小於CUTOFF值(通常是16、32)，改成使用Insertion sort。
2. p取最左邊、中間、最右邊三個值中，中間的那個值。

## 3-way Quick Sort
算是Quick Sort的變形，多考慮到值相同的情況。

![](https://i.imgur.com/iv02bAL.png)



## Sorting summary
![](https://i.imgur.com/hBi3rv8.png)

沒有一個sorting是完美的，因此需要因地制宜。