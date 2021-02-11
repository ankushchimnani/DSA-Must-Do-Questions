## **Rod Cutting Problem**

Given a rod of some length 'n' and the price associated with each piece of the rod, the rod has to be cut and sold.The process of cutting should be in such a way that the amount(revenue) obtained from selling is maximum. Also given, the amount is different for different sizes.



#### **Sample Input**
	N = 4
	length[] = [1, 2, 3, 4, 5, 6, 7, 8]
	price [] = [1, 5, 8, 9, 10, 17, 17, 20]

#### **Sample Output**
	10

#### **Sample Explanation**
In the sample test case, the rod is of length 4. The maximum profit can be obtained by cutting the rod into 2 pieces. Therefore, the profit becomes 10, as the price for a single rod of length 2 is 5. 

#### **Expected Time Complexity**
__O__(N^2),where N is the length of the rod. 

#### **Expected Space Complexity**
__O__(N), where N is the length of the rod.  


#### **Constraints**
	1 <= N <= 1000
	1 <= length[i],price[i] <= 100
