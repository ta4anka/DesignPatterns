
**Command pattern**  turns a request into a stand-alone object that contains all information about the request.
 This transformation lets you parameterize methods 
 with different requests, delay or queue a request’s execution, and support undoable operations.
 
--------------------------------------------------------------------------------
A request is wrapped under an object as command and passed to invoker object.
Invoker object looks for the appropriate object which can handle
this command and passes the command to the corresponding object which executes the command.


![pic](https://upload.wikimedia.org/wikipedia/ru/0/0c/Command.gif)
