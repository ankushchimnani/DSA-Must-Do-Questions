## **Money and Shopping**

Alice is in a shopping mall to buy books, shirts and shoes. The mall has exactly N different shops and each shop contains all these three items at different prices. Alice has a plan which she will be following. As per her plan, she won't buy the same item from the current shop if she had already bought that item from the shop adjacent to the current shop.

Alice wants to follow her strategy strictly but at the same time she wants to minimize the total money she spends on shopping. You are provided description about all N shops i.e costs of all three items in each shop. You need to help Alice find minimum money that she needs to spend such that she buys exactly one item from every shop.



#### **Sample Input**
	3
	1 50 50
	50 50 50
	1 50 50
	

#### **Sample Output**
	52

#### **Sample Explanation**
Since Alice has to buy atleast one artifact from every shop, and the overall cost has to be minimum, so she buys artifact with cost 1 form the first shop, artifact of cost 50 from the second shop, and artifact of cost 1 from the last shop, making the overall cost to be 52.

#### **Expected Time Complexity**
__O__(N),where N is the number of shops. 

#### **Expected Space Complexity**
__O__(N^3), where N is the number of shops.  

#### **Constraints**
	1 ≤ T ≤ 10
	1 ≤ N ≤ 100000
	Cost of each item (book/shirt/shoe) does not exceed 10000


