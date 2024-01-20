#include <iostream>
#include "Solids.h"
#include <vector>
#include <iomanip>
using namespace std;

int main()
{
    Cuboid* cube1 = new Cuboid(2, 2, 2);
    Cuboid* cube2 = new Cuboid(3, 4, 5);
    Cylinder* cylinder = new Cylinder(3, 2);
    Sphere* sphere = new Sphere(4);

    vector<Solid*> shapes;
    shapes.push_back(cube1);
    shapes.push_back(cube2);
    shapes.push_back(cylinder);
    shapes.push_back(sphere);

    for (int i = 0; i < shapes.size(); i++)
    {
        cout << "Solid Type: " << shapes.at(i)->getType() << endl;
        cout << "Volume: " << fixed << setprecision(4) << shapes.at(i)->getVolume() << endl;
        cout << "Surface Area: " << fixed << setprecision(4) << shapes.at(i)->getSurfaceArea() << endl;
        cout << endl;
    }


}