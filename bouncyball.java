float x;              // declare globally
float xSpeed;
float y;
float ySpeed;
float gravity = 0.1;

void setup() {
  size(400, 400);
  x = 30;          // initialize in setup
  xSpeed = 0;
  y = 50;
  ySpeed = 0;
}

void draw() {          // update variable
  ySpeed += 1;
  x += xSpeed;                      
  y += ySpeed;
  
  // x boundary check
  if (x + 25 >= width) {
    xSpeed = -xSpeed;
  } else if (x - 25 <= 0) {
    xSpeed = -xSpeed;
  }
  
  // y boundary check
  if (y + 25 >= height) {
    ySpeed = -ySpeed;
  } else if (y - 25 <= 0) {
    ySpeed = -ySpeed;
  }
  
  background(#23395B);
  // draw ball
  noStroke();
  fill(#FFFD98);
  ellipse(x, y, 50, 50);     // use variable to draw
}
