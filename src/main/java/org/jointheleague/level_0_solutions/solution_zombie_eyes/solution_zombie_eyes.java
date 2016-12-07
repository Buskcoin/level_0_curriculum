/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Zombie Eyes
Solution
*/

void setup() {
  size(1000, 1000);
  PImage face = loadImage("NaomiCampbell_1.jpg");
  image(face, 0, 0);
}

void draw() {
  drawZombieEyes();
  //drawMovingPupils();
}

int leftEyeX = 275;
int eyesY = 325;
int distanceBetweenEyes = 362;
int pupilSize = 25;

void drawZombieEyes() {
  fill(mouseX, mouseY, 100);
  ellipse(leftEyeX, eyesY, 65, 68);
  ellipse(leftEyeX+distanceBetweenEyes, eyesY, 65, 68);

  fill(0, 0, 0);
  ellipse(leftEyeX, eyesY, pupilSize, pupilSize);
  ellipse(leftEyeX+distanceBetweenEyes, eyesY, pupilSize, pupilSize);
}

void drawMovingPupils() {
  fill(255, 255, 255);
  ellipse(leftEyeX, eyesY, 65, 68);
  ellipse(leftEyeX+distanceBetweenEyes, eyesY, 65, 68);

  fill(0, 0, 0);
  ellipse(leftEyeX, eyesY, pupilSize, pupilSize);
  ellipse(leftEyeX+distanceBetweenEyes, eyesY, pupilSize, pupilSize);
}

