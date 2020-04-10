The code written worked.

Resources:

- https://www.youtube.com/watch?v=UxABxSADZ6U

- https://howtomechatronics.com/tutorials/arduino/arduino-and-mpu6050-accelerometer-and-gyroscope-tutorial/ (For testing of MPU before Gimbal)

- https://howtomechatronics.com/projects/diy-arduino-gimbal-self-stabilizing-platform/ (For Gimbal)

Issues:

- The three servos connected to the Gimbal. One servo motor fluctuates on its own even if 0 value(no movement at all) is written on it all time.

- I tried to run the servos using 12V adapter. 12V was connected to 2578AY MBB (https://img.dxcdn.com/productimages/sku_449253_3.jpg) but the IC got heated so much that it was on the verge of melting

- Tried to connect I7805CV voltage regulator for 12 to 5V conversion but it got so heated that it almost burned down my finger. (I hope it is not melted from inside)

- The fluctuations may be due to the 8V adapter(Rico emergency light charger) I was using. I checked the voltage around the terminals while it is connected to the hree servos and the voltage is not stable.

Solution:

- I can try adding a capacitor between the terminals (Don't know what type and value of capacitor needed)

- Think of a solution to use the 12V DC adapter which is dedicated for these purposes.