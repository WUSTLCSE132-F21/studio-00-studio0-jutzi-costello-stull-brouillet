void setup() {
  Serial.begin(9600);
  pinMode(13, OUTPUT);
}

void loop() {
    int seconds = millis() / 1000;
    digitalWrite(13, HIGH);
    Serial.print(seconds);
    Serial.println(" seconds have passed.");
    Serial.println(millis());
    delay(500);
    digitalWrite(13, LOW);
    delay(500);
}
