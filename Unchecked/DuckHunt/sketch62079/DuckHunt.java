import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class DuckHunt extends PApplet {

/*
Duck Hunt imitation created by Trevor Wong
 Credits to Nathan Smetana for helping me understand the removal of the image
 http://www.openprocessing.org/sketch/60307
 */


PImage duckImg;
PImage crosshair;
PImage bg;
PImage fun;

int numDucks = 15;
int score = 0;
int rounds = 3;

boolean gameover = false;
boolean hit = false;
boolean start = false;

float[] x = new float[numDucks];
float[] y = new float[numDucks];

ArrayList<Duck> dh = new ArrayList<Duck>();
Duck[] ducks;

public void setup() {
  bg = loadImage("duck_hunt.jpg");
  duckImg = loadImage("Duck.jpg");
  crosshair = loadImage("Crosshair.jpg");
  fun = loadImage("face.jpg");

  size(1440, 900);
  frameRate(60);



  ducks = new Duck[numDucks];
  for (int i = 0; i < numDucks; i++) {
    Duck dk = new Duck(PApplet.parseInt(x[i]), PApplet.parseInt(y[i]));
    ducks[i] =
      new Duck(PApplet.parseInt(random(-1000)), PApplet.parseInt(random(height)));
    dh.add(ducks[i]);
    x[i] = random(width);
    y[i] = random(height);
  }
}



public void mouseClicked() {
  //make a for loop to check each duck

  for (int i = dh.size()-1; i >= 0; i-- ) {
    //check if each duck is hit.
    //if ( ) {
    dh.remove(i);
    hitCheck();
    score++;
    println(score);
    //}
  }
}


public void keyPressed() {
  if (key == ENTER && start == false) {
    start = true;
  }
}

public void Menu() {
  background(0);
  fill(255);
  textSize(31.5f);
  text("Press Enter to play", width/2-100, 400);
  if (keyPressed) {
    if ( key == ENTER ) {
      fill(255);
      textSize(31.5f);
      text("Press Enter to play", width/2-100, 400);
    }
  }
}

public void inGame() {
  fill(0);
  textSize(30);
  text("Score: " + score, width/2, 50);
} 

public void Win() {
  if (dh.size() ==0) {
    textSize(50);
    image(fun, mouseX - fun.width/2, mouseY - fun.height/2);
    text("Winner", width/2-100, 300);
  }
}  

public void Lose() {
  for (int i = 0; i < numDucks; i++) {
    if ( ducks[i].yLoc > 900) {
      textSize(50);
      text("Game Over", width/2-100, 300);
    }
  }
}

public void draw() {
  if (start != true) {
    Menu();
  } 
  else {
    background(bg);
    inGame();
    Win();
    Lose();



    image(crosshair, mouseX - crosshair.width/2, mouseY - crosshair.height/2);
    noCursor();
    //make a for loop to check each duck

    //for each duck, draw it!
    for (int i = 0; i < numDucks; i++) {
      if (x[i] > width) {
        x[i] = random(width);
        y[i] = random(height);
      }
      point(x[i], y[i]);
    }

    for (int n = 0; n < ducks.length; n++) {

      if (ducks[n].hit()) {
        dh.remove(n);
        score++;
      }
    }

    println(duckImg.height);
    for (Duck d : dh) {
      d.render();
      d.xLoc += 3;

      if (mousePressed == true) {
        image(crosshair, mouseX - crosshair.width/2, mouseY - crosshair.height/2);
      }
    }
  }
}

public void hitCheck() {
  for (int i = 0; i < dh.size(); i++) {
    if ( mouseX <= ducks[i].xLoc && mouseX >= ducks[i].xLoc && mouseY >= ducks[i].yLoc && mouseY <= ducks[i].yLoc) {
      ducks[i].xLoc= -2000;
      ducks[i].yLoc= -2000;
    }
  }
}

public class Duck {
  int xLoc, yLoc;
  boolean hit = false;
  public Duck  (int x, int y) {

    xLoc = x;
    yLoc = y;
  }


  public void render() {
    //paints itself @ (x,y)
    image(duckImg, xLoc, yLoc);
  }

  public boolean getHit() {
    return hit;
  }

  public boolean hit() {
    if ( hit ) {
      score++;
      numDucks--;
    }
    return false;
  }
}

  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "DuckHunt" });
  }
}
