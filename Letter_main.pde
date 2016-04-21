//Ciaran Carrick

//Some printed examples below, letter function in its asssigned tab.
//I did without the draw as writing the code each frame kept command line printing repeatedly.
void setup() {
  size(600, 200);
    word("", 20, 40, 0,0, 40);//TYPE YOUR NAME INSIDE THE ""!
  //word("Ciaran", 20, 40, 0,0, 0);//No gap
  //word("Ciaran", 20, 40, 0,0, 40);// gap
  //word("Ciaran", 20, 40, 0,0, 15);//close
  //word("Ciaran", 20, 40, 60,0, 0);//Width
  //word("Ciaran", 20, 40, 60,0, 30);//Width/gap
  //word("Ciaran", 20, 40, 0,60, 0);//Height
  //word("Ciaran", 20, 40, 0,60, 30);//Height/gap
  //word("Ciaran", 590, 80, -90, 0, -10);// centre letters backwards
}

void word(String a, int x, int y, int letterWidth, int letterHeight, int gap) {
  char[] aList = new char[a.length()];// Create and declare array
  for (int i = 0; i < a.length(); i++) { //a.length counts indexs held in array depending on char amount.
    aList[i] = a.charAt(i); //reads only characters from array
    print("Char: " + aList[i] + "\n");// prints to dos box
    letter(aList[i], x+((letterWidth+gap) * i), y, letterWidth, letterHeight);
  }//gap(0) is added to LW first then cycled through for loop using Alist[i] counting through char array. 
  
}

