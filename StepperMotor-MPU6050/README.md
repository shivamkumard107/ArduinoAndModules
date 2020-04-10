Both the stepper motor drivers (A4988) are broken. This may be due to the fluctuating voltage that is supplied to the stepper motor by the 12V supply. The circuit works for a moment (30-40s) then it stops.

I tried to run the stepper motors by making tweaks in the code of DC motor. Do not try to do this in future.

Precautions:

- Do not connect 12 V supply to the IC (below 8 is good)

- Capacitor is required between the Vmot and GND to prevent voltage fluctuations

Next Steps:

- Now the next step is to directly make the self balancing robot circuit and code. There will be no unit testing of modules.

Resources:

https://electricdiylab.com/diy-self-balancing-robot/

https://create.arduino.cc/projecthub/RolfK/two-wheeled-self-balancing-robot-with-stepper-motor-0c61ca

https://www.youtube.com/watch?v=5IkPWZjUQlw (for knowledge to Yaw, Pitch and Roll)