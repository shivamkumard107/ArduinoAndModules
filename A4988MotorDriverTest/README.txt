A4988 motor driver test

5 stepper motor connections:
=======================
Wire Type  |  Wire color
=======================
centre-tap:| Grey
wire 2     | Pink
wire 4     | Light Yellow
wire 1     | Blue
wire 3     | Skin

- W1, W2, W3 and W4 are ends of the winding inside the motor
- Follow the below video to get the information of each wire in a 5 stepper motor:
  https://www.youtube.com/watch?v=lduqo4fmXYo

Circuit diagram:
https://www.youtube.com/watch?v=5CmjB4WF5XA (don't forget to short the reset and sleep pin)

Connection of motor driver with 5 stepper motor (yours may be different):
- Rest of the connections are easy but we have to take care of the motor connection with driver
- The Pink and Light yellow color wires are connected to 1B and 1A or 1A and 1B (Both will work)
- The Blue and Skin color wires are connected to 2A and 2B or 2B and 2A(both will work)
- The Cross connections can also be made. For Example Pink and Yellow can also be connected to 2A and 2B
- Don't forget to short the Sleep and Reset pin

Precautions to take care:
- I don't know how, but the performance of A4988 module is effected by its surrounding. 
    When a finger, any wire or object is near(above, just touching or touching) it effects the rotation of the motor.
    It will generate noise in motor movement. Make sure to keep the above area of module clear

- Center Tap wire has no significance/use in this test. Only 4 wires will do the work
- Don't try to caliberate the potentiometer on the A4988 module. Already broken one
- Connections must not be loose, it will generate noise in motor movement


Errors/Mistakes I encountered and solution:
- Using the center tap wire. There is no use of that wire. Pretend it does not exist in this testing
- Making wrong connections between motor and driver (solution cleared above)
- Please short Sleep and Reset pin. Wasted a lot of time


~ Thank you for reading