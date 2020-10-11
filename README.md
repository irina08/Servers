### Task
Company has diff sizes servers. To load balance jobs across the servers, 
each job is assigned to random a server such that if server X is three times 
as big as server Y, then server X gets assigned three times as often as server Y.
So server X would be assigned approximately 75% of the time and server Y 
would be assigned 25% of the time.

Write a program that takes server names and sizes as arguments and outputs the name 
of a random server based on the algorithm describe above.
For example:
bash-3.2$ program X:3 Y:1
X
bash-3.2$ program X:3 Y:1
Y
bash-3.2$ program X:3 Y:1
X
bash-3.2$ program X:3 Y:1
X

There can be any number of servers passed on the command line:
bash-3.2$ program A:3 B:2 D:4 E:1
C
bash-3.2$ program X:3 Y:1 Z:3
X

