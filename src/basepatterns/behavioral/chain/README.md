**The chain of responsibility pattern**([link](https://www.geeksforgeeks.org/chain-responsibility-design-pattern/))
 creates a chain of receiver objects for a request. 
This pattern decouples sender and receiver of a request based on type of request. 

In this pattern, normally each receiver contains reference to another receiver.
If one object cannot handle the request then it passes the same to the next receiver and so on.

![pic](https://contribute.geeksforgeeks.org/wp-content/uploads/desigmpatternuml1.png)
