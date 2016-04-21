//Once arguement a is set to == corresponding letter, it print lines to create letter.
//Each line was given a default size, I found an easier way half way through but continued after the work had been done.
//LetterW and LetterH were assigned to letters to change size while those left as x or y were left to be starting points
//Letterheight/2 uses half the int variable to maintain Middle-line accuracy e.g A B F Y as to maintain letter shape
//Letterwidth*2 was used for M and V to maintain shape on x axis

//int x/y is position on x/y axis, letterwidth/height control dimentions of letter
void letter(char a, int x, int y, int letterWidth, int letterHeight) {// Start Letter Function
  if (a == 'A' || a == 'a') {
    line(15+x+letterWidth, y, x, y);
    line(x, y, x, 30+y+letterHeight);
    line(15+x+letterWidth, 30+y+letterHeight, 15+x+letterWidth, y); //right
    line(x, 15+y+letterHeight/2, 15+x+letterWidth, 15+y+letterHeight/2); //middle
  }
  else if (a == 'B' || a == 'b') {    
    line(x+15+letterWidth, y+15+letterHeight/2, x, 15+y+letterHeight/2);
    line(x, y+30+letterHeight, x, y);
    line(15+x+letterWidth, y, x, y);
    line(15+x+letterWidth, 30+y+letterHeight, 15+x+letterWidth, y);
    line(15+x+letterWidth, 30+y+letterHeight, x, 30+y+letterHeight);
  }
  else if (a == 'C' || a == 'c') {
    line(20+x+letterWidth, y, x, y);
    line(x, 30+y+letterHeight, x, y);
    line(20+x+letterWidth, 30+y+letterHeight, x, 30+y+letterHeight);
  }

  else if (a == 'D' || a == 'd') { 
    line(x, y+30+letterHeight, x, y);
    line(x+30+letterWidth, y, x, y);
    line(x+30+letterWidth, y+30+letterHeight, x, y+30+letterHeight);
    line(x+30+letterWidth, y+30+letterHeight, x+30+letterWidth, y);
  }
  else if (a == 'E' || a == 'e') {
    line(x, y+30+letterHeight, x, y);
    line(x+15+letterWidth, y, x, y);
    line(x+15+letterWidth, y+15+letterHeight/2, x, y+15+letterHeight/2);
    line(x+15+letterWidth, y+30+letterHeight, x, y+30+letterHeight);
  }
  else if (a == 'F' || a == 'f') {
    line(x, y+30+letterHeight, x, y);
    line(x+15+letterWidth, y, x, y);
    line(x+15+letterWidth, y+15+letterHeight/2, x, y+15+letterHeight/2);
  }
  else if (a == 'G' || a == 'g') {
    line(x, y+30+letterHeight, x, y);
    line(x+20+letterWidth, y, x, y);
    line(x+20+letterWidth, y+30+letterHeight, x, y+30+letterHeight);
    line(x+20+letterWidth, y+15+letterHeight/2, x+20+letterWidth, y+30+letterHeight);
    line(x+10+letterWidth/2, y+15+letterHeight/2, x+20+letterWidth, y+15+letterHeight/2);
  }
  else if (a == 'H' || a == 'h') {
    line(x, y+30+letterHeight, x, y);
    line(x+30+letterWidth, y+15+letterHeight/2, x, y+15+letterHeight/2);
    line(x+30+letterWidth, y+30+letterHeight, x+30+letterWidth, y);
  }
  else if (a == 'I' || a == 'i') {
    line(x+5+letterWidth/2, y+30+letterHeight, x+5+letterWidth/2, y);
    line(x+10+letterWidth, y, x, y);
    line(x+10+letterWidth, y+30+letterHeight, x, y+30+letterHeight);
  }
  else if (a == 'J' || a == 'j') {
    line(x+15+letterWidth, y+30+letterHeight, x+15+letterWidth, y);
    line(x+15+letterWidth, y, x+5+letterWidth/2, y);
    line(x+15+letterWidth, y+30+letterHeight, x, y+30+letterHeight);
  }
  else if (a == 'K' || a == 'k') {
    line(x, y+30+letterHeight, x, y);
    line(x, y+15+letterHeight, x+15+letterWidth, y);
    line(x, y+15+letterHeight, x+15+letterWidth, y+30+letterHeight);
  }
  else if (a == 'L' || a == 'l') {
    line(x, y+30+letterHeight, x, y);
    line(x, y+30+letterHeight, 20+x+letterWidth, y+30+letterHeight);
  }
  else if (a == 'M' || a == 'm') {
    line(x, y+30+letterHeight, x, y);
    line(x, y, x+10+letterWidth, y+30+letterHeight);
    line(x+20+letterWidth*2, y, x+10+letterWidth, y+30+letterHeight);
    line(x+20+letterWidth*2, y+30+letterHeight, x+20+letterWidth*2, y);
  }
  else if (a == 'N' || a == 'n') {
    line(x, y, x, 30+y+letterHeight);
    line(15+x+letterWidth, 30+y+letterHeight, 15+x+letterWidth, y);
    line(15+x+letterWidth, 30+y+letterHeight, x, y);
  }
  else if (a == 'O' || a == 'o') {
    line(x, y, x, 30+y+letterHeight);
    line(20+x+letterWidth, 30+y+letterHeight, 20+x+letterWidth, y);
    line(20+x+letterWidth, y, x, y);
    line(20+x+letterWidth, 30+y+letterHeight, x, y+30+letterHeight);
  }
  else if (a == 'P' || a == 'p') {
    line(x, y, x, 30+y+letterHeight);
    line(20+x+letterWidth, y+15+letterHeight, 20+x+letterWidth, y);
    line(20+x+letterWidth, y, x, y);
    line(20+x+letterWidth, 15+y+letterHeight, x, y+15+letterHeight);
  }
  else if (a == 'Q' || a == 'q') {
    line(x, y, x, 30+y+letterHeight);
    line(20+x+letterWidth, 30+y+letterHeight, 20+x+letterWidth, y);
    line(20+x+letterWidth, y, x, y);
    line(20+x+letterWidth, 30+y+letterHeight, x, y+30+letterHeight);
    line(15+x+letterWidth/2, y+20+letterHeight, 20+x+letterWidth, 35+y+letterHeight);
  }
  else if (a == 'R' || a == 'r') {
    line(x, y, x, 30+y+letterHeight);
    line(15+x+letterWidth, y+15+letterHeight, 15+x+letterWidth, y);
    line(15+x+letterWidth, y, x, y);
    line(15+x+letterWidth, 15+y+letterHeight, x, 15+y+letterHeight);
    line(15+x+letterWidth, 30+y+letterHeight, x, 15+y+letterHeight);
  }
  else if (a == 'S' || a == 's') {
    line(20+x+letterWidth, y, x, y);
    line(x, 15+y+letterHeight/2, x, y);
    line(20+x+letterWidth, y+15+letterHeight/2, x, y+15+letterHeight/2);
    line(20+x+letterWidth, 15+y+letterHeight/2, 20+x+letterWidth, 30+y+letterHeight);
    line(20+x+letterWidth, y+30+letterHeight, x, y+30+letterHeight);
  }
  else if (a == 'T' || a == 't') {
    line(30+x+letterWidth, y, x, y);
    line(15+x+letterWidth/2, 30+y+letterHeight, 15+x+letterWidth/2, y);
  }
  else if (a == 'U' || a == 'u') {
    line(x, 30+y+letterHeight, x, y);
    line(20+x+letterWidth, 30+y+letterHeight, 20+x+letterWidth, y);
    line(20+x+letterWidth, 30+y+letterHeight, 20+x+letterWidth, y);
    line(x, 30+y+letterHeight, 20+x+letterWidth, 30+y+letterHeight);
  }
  else if (a == 'V' || a == 'v') {
    line(x+15+letterWidth, 30+y+letterHeight, x, y);
    line(x+15+letterWidth, 30+y+letterHeight, x+30+letterWidth*2, y);
  }
  else if (a == 'W' || a == 'w') {
    line(x+15+letterWidth, 30+y+letterHeight, x, y);
    line(x+15+letterWidth, 30+y+letterHeight, x+30+letterWidth*2, y);
    line(x+45+letterWidth*3, 30+y+letterHeight, x+60+letterWidth*4, y);
    line(x+45+letterWidth*3, 30+y+letterHeight, x+30+letterWidth*2, y);
  }
  else if (a == 'X' || a == 'x') {
    line(x+20+letterWidth, y+letterHeight, x+40+letterWidth, y+30+letterHeight);
    line(x+20+letterWidth, 30+y+letterHeight, x+40+letterWidth, y);
  }
  else if (a == 'Y' || a == 'y') {
    line(x+15+letterWidth, 15+y+letterHeight/2, x, y);
    line(x+15+letterWidth, 15+y+letterHeight/2, x+30+letterWidth*2, y);
    line(x+15+letterWidth, 30+y+letterHeight, x+15+letterWidth, y+15+letterHeight/2); //y+15+letterHeight/2 Keeps y2 point together with other y points
  }
  else if (a == 'Z' || a == 'z') {
    line(x+20+letterWidth, y, x, y);
    line(x+letterWidth, 30+y+letterHeight, x+20+letterWidth, y);
    line(x+20+letterWidth, y+30+letterHeight, x, y+30+letterHeight);
  }
  else{
    print("Sorry, I don't know how to draw the letter " + a);
  }
}//End Letter Function

