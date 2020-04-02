ESP32 Camera Module is a WiFi Module with camera.

Resources that I used to get it working
1. https://www.youtube.com/watch?v=0LIhTLsOLbA
2. https://www.youtube.com/watch?v=a_PxAT8M-58
3. https://dl.espressif.com/dl/package_esp32_index.json (to be added in preferences to add library)
4. https://github.com/espressif/esp32-camera (main repo)

Errors I encountered:

1. https://github.com/espressif/arduino-esp32/issues/1497
 Failed to connect to ESP32: Timed out waiting for packet header #1497 
Solution:
First I was uploading the code to arduino without pressing the button on the ESP32 Module and I got this error
Second I tried to hold the button on the WiFi module till the board uploads its code, that also did'nt worked out
Finally, After clicking the upload button on Arduino IDE, when the console says Connecting.....-----.....----- you just have to 
press the button on the WiFi module once and it will start working

2. https://github.com/espressif/arduino-esp32/issues/577
 rst:0x1 (POWERON_RESET),boot:0x3 (DOWNLOAD_BOOT(UART0/UART1/SDIO_REI_REO_V2)) waiting for download #577 
Solution: 
The solution of this problem is to remove the GPIO pin you've grounded after uploading the code

3. please remove GPIO pin after uploading to board

4. WiFi speed should be good enough, otherwise Lag in video

5. Do not run the server for hours, ESP32 gets heated
