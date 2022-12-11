#include "Plant.h"
#include "Flower.h"
#include <vector>
#include <string>
#include <sstream>
#include <iostream>
using namespace std;

// TODO: Define a PrintVector function that prints an vector of plant (or flower) object pointers

//vector<Plant*> myGarden;

void PrintVector(vector <Plant*> Garden) {
for (int i = 0; i < Garden.size(); i++) {
Garden.at(i)-> PrintInfo();//myGarden[i]->PrintInfo();
cout << endl;
}
}

int main() {

// TODO: Declare a vector called myGarden that can hold object of type plant pointer
vector <Plant*> myGarden;

// TODO: Declare variables - plantName, plantCost, flowerName, flowerCost,
// colorOfFlowers, isAnnual
string input;
string plantName, flowerName, colorOfFlowers;
int plantCost, flowerCost;
string isAnnual;

  
/*
plant Spirea 10
flower Hydrangea 30 false lilac
*/

//Plant *pl = new Plant();
//Flower *fl = new Flower();

while(input != "-1") {

// TODO: Check if input is a plant or flower
// Store as a plant object or flower object
// Add to the vector myGarden

getline(cin, input);
istringstream mystream(input);
mystream >>input >> plantName >> plantCost >> isAnnual >> colorOfFlowers ;
if (input == "plant") {
Plant *pl = new Plant();
pl->SetPlantName(plantName);
pl->SetPlantCost(plantCost);
myGarden.push_back(pl);
}

else if (input == "flower") { 
//Inputting the flower details
Flower *fl = new Flower();
flowerName == plantName ;
flowerCost == plantCost;
fl->SetPlantName(plantName);
fl->SetPlantCost(plantCost);
bool state;

if (isAnnual == "false")
{
state = false;
}
else if (isAnnual == "true")
{
state = true;
}

fl->SetPlantType(state);
fl->SetColorOfFlowers(colorOfFlowers);
myGarden.push_back(fl);

}
}

// TODO: Call the method PrintVector to print myGarden

PrintVector(myGarden);

for (size_t i = 0; i < myGarden.size(); ++i) {
delete myGarden.at(i);
}

return 0;
}
