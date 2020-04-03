2nd code tried for MPU6050
How to run the code:
1. Make the circuit from the circuit diagram
2. Add two libraries MPU6050 and I2Cdev attached with the file
3. Upload the code MPU6050_DMP6.ino

Code is taken from github 
https://github.com/jrowberg/i2cdevlib

Video followed for this code
https://www.youtube.com/watch?v=XCyRXMvVSCw
**Libraries installed from the link provided in the description of the video

https://dronebotworkshop.com/mpu-6050-level/

==> Mistakes Done Before
1. Connect to D4 and D5 instead of A4 and A5
2. Baud rate in serial monitor is wrong
3. int pin is used in this code but not in other codes. So insert int pin
4. Please use Male to female jumpers in MPU6050

==> Error encountered:
1. avrdude: stk500_recv(): programmer is not responding
I think this is a hit and trial to upload code to board. Or remove all connections and then upload it easily
