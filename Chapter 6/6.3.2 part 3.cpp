#include <iostream>
using namespace std;

struct WidthFtIn {
   int numFeet;
   int numInches;
};

WidthFtIn SetHeight(int feet, int inch) {
   WidthFtIn tempVal;
   
   tempVal.numFeet = feet;
   tempVal.numInches = inch;
   
   return tempVal;
}

int main() {
   WidthFtIn objectSize;
   int feetVal;
   int inchesVal;

   cin >> feetVal >> inchesVal;

   objectSize = SetHeight(feetVal, inchesVal);

   cout << "Size: " << objectSize.numFeet << "ft " << objectSize.numInches << "in." << endl;

   return 0;
}
