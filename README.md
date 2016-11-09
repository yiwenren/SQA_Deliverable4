# SQA_Deliverable4
For the assignment 4 of Software Quality Assurance

### 1.	Summay
   I used visualVM to determine the methods to refactor (the screesshot is in part2). After I used the “write” mode firstly, then pressed “Run Continuous” button, I found out the MainPanel.convertToInt(), Cell.toString() and MainPanel.runContinuous() is the top 3 of the most CPU-intensive methods. So I decided to refactor them.

- Refactored Method:
  (1)	MainPanel.convertToInt()</br>
	I delete most of the code in the original method, because finally the variable returned equals the variable passed to this method. So just returning x is enough.
  </br>![sqa1](https://cloud.githubusercontent.com/assets/16570657/20158952/a444e8a8-a6ab-11e6-8787-eed35356a8dd.png)
  
  (2)	MainPanel.runContinuous()</br>
	I delete the for loop, because it is meaningless in this method. The variable _r in the end is totally the same with the value it was at the start. I remove the Thread.sleep(20), because it seems unnecessary.
	I used manual testing to check whether the outputs before modification and after modification are the same or not to make sure the change doesn’t have bad effect on the result. It is difficult to use Unit tests to test.
  ![sqa2](https://cloud.githubusercontent.com/assets/16570657/20159036/42be4bbe-a6ac-11e6-8923-a8613b747534.png)</br>
  
  (3)	Cell.toString()</br>
	I delete the loop, because in the if statement, it just judges the first char of toReturn. And it is unnecessary to add currentState many times.<br>
	![sqa3](https://cloud.githubusercontent.com/assets/16570657/20159223/4eeaa058-a6ad-11e6-919c-86243211c94b.png)</br>

### 2.	Screenshots<br>
   (1)	Before the factor</br>
   ![sqa4](https://cloud.githubusercontent.com/assets/16570657/20159278/9f436b8e-a6ad-11e6-9ec5-9e68bc281756.png)</br>
   (2)  After the method MainPanel.convertToInteger(int x) was modified, its performance is improved significantly.</br>
   ![sqa5](https://cloud.githubusercontent.com/assets/16570657/20159277/9f40d5ae-a6ad-11e6-9aed-e2513bc4e8aa.png)</br>
   (3)	After the method MainPanel.runContinuous() was modified, it costs less time to run.</br>
![sqa6](https://cloud.githubusercontent.com/assets/16570657/20159276/9f40a02a-a6ad-11e6-985e-ae7f37fcd1bd.png)</br>
   (4)	After the method Cell.toString() was modified, the method is no longer a CPU-intensive method.</br>
![sqa7](https://cloud.githubusercontent.com/assets/16570657/20159275/9f3e5932-a6ad-11e6-8884-3a09a750dc75.png)</br>



	




