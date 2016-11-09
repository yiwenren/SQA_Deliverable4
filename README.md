# SQA_Deliverable4
For the assignment 4 of Software Quality Assurance

### 1.	Summay
   I used visualVM to determine the methods to refactor (the screesshot is in part2). After I used the “write” mode firstly, then pressed “Run Continuous” button, I found out the MainPanel.convertToInt(), Cell.toString() and MainPanel.runContinuous() is the top 3 of the most CPU-intensive methods. So I decided to refactor them.

### Refactored Method:
  (1)	MainPanel.convertToInt()
	I delete most of the code in the original method, because finally the variable returned equals the variable passed to this method. So just returning x is enough.
  \n![sqa1](https://cloud.githubusercontent.com/assets/16570657/20158952/a444e8a8-a6ab-11e6-8787-eed35356a8dd.png)
  
  (2)	MainPanel.runContinuous()
	I delete the for loop, because it is meaningless in this method. The variable _r in the end is totally the same with the value it was at the start. I remove the Thread.sleep(20), because it seems unnecessary.
	I used manual testing to check whether the outputs before modification and after modification are the same or not to make sure the change doesn’t have bad effect on the result. It is difficult to use Unit tests to test.
  ![sqa2](https://cloud.githubusercontent.com/assets/16570657/20159036/42be4bbe-a6ac-11e6-8923-a8613b747534.png)



