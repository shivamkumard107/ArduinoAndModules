#include <Servo.h>
const int ledPin = 13;

const int ldrPin = A0;
int ldrStatus;
int pldrStatus;
Servo servo;
void setup() {
ldrStatus = 0;
pldrStatus = 129841;
Serial.begin(9600);
servo.attach(8);

pinMode(ledPin, OUTPUT);

pinMode(ldrPin, INPUT);

}

void loop() {

ldrStatus = analogRead(ldrPin);

if (ldrStatus <= 200 && pldrStatus>200) {

digitalWrite(ledPin, HIGH);

servo.write(120);
Serial.print("Its DARK, Turn on the LED : ");

Serial.println(ldrStatus);
} else if(ldrStatus > 200 && pldrStatus <= 200) {

digitalWrite(ledPin, LOW);
servo.write(105);
Serial.print("Its BRIGHT, Turn off the LED : ");

Serial.println(ldrStatus);

}
//delay(10);
pldrStatus = ldrStatus;
}
