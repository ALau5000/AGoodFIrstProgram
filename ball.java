int x;              // declare globally
int y;
int xSpeed;
int ySpeed;

void setup() {
  size(400, 400);
  x = 30;          // initialize in setup
  y = 0;
  xSpeed = 3;
  ySpeed = 0;
}

void draw() {
  x += xSpeed;                      // update variable
  y += ySpeed;
  
  if (x >= 400) {
    xSpeed = -xSpeed;
  } if (x < 0) {
    xSpeed = 0;
    ySpeed = -3;
  } if (y < 0) {
    xSpeed = 3;
  } if (x > 200 && y < 0) {
    ySpeed = 3;
  } if (x > 400 && y < 200) {
    xSpeed = -3;
  } if (x < 200 && y > 400) {
    ySpeed = -3; 
  }
  
  background(255);
  // draw ball
  noStroke();
  fill(255, 165, 0);
  ellipse(x, y+200, 50, 50);     // use variable to draw
}
