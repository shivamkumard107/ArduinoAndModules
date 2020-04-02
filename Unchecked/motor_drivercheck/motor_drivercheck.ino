#define m11 2
#define m12 3
#define m21 4
#define m22 5

void setup() {
  
Serial.begin(9600);
 pinMode(m11, OUTPUT);
 pinMode(m12, OUTPUT);
 pinMode(m21, OUTPUT);
 pinMode(m22, OUTPUT);
 pinMode(13, OUTPUT);
 digitalWrite(13, HIGH); 
 }

void loop() {
  // put your main code here, to run repeatedly:
        digitalWrite(m11, HIGH);
        digitalWrite(m12, HIGH);
        digitalWrite(m21, HIGH);
        digitalWrite(m22, HIGH);
   delay(50);
}
