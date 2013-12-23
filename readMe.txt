MarsRovers Project by Xiao Jin

1.How to run this project?
  Run the MarsRovers.jar file in the system use the following command:
  java -jar MarsRovers.jar

2.Design details
  The main object of this project is Mars rover. It has three properties: x coodinate, y coodinate and orientation. At the same time, it has four activities according to different instructions, which are left-turn, right-turn, moving horizontally and moving vertically. Therefore, I use the Rover class to contain all its properties and activities. The main class is used for the whole process, in which the rover explores the plateau according to a certain line of instruction.

3.Error checking
  Since it is an actual problem, I figure out five points where we should check the range. 
(1)The upper-right coordinates of the plateau should be more than (0,0)
(2)The original coodinates of rover should be more than (0,0) and mustn't exceed the upper-right of plateau.
(3)The final coodinates of rover should be more than (0,0) and mustn't exceed the upper-right of plateau.
(4)The orientation should be one of {N,S,W,E}.
(5)The instruction should be one of {L,R,M}.

4.There is one assumption in my coding, which is the rover will stop at the last correct word of a line of instruction. That means, there will be an output even though there are something wrong with the instruction words. 