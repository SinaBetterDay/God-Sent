#include "Solids.h"
#include <iostream>
using namespace std;

Solid::Solid(string type)
{
    solidType = type;
}

string Solid::getType()
{
    return solidType;
}

Cuboid::Cuboid(double w, double l, double h) : Solid("Cuboid")
{
    width = w;
    length = l;
    height = h;
}

double Cuboid::getVolume()
{
    return (width * height * length);
}

double Cuboid::getSurfaceArea()
{
    return 2 * (length * width) + 2 * (length * height) + 2 * (height * width);
}

Cylinder::Cylinder(double h, double r) : Solid("Cylinder") {
    height = h;
    radius = r;
}

double Cylinder::getVolume() {
    return  (radius * radius * height * PI);
}

double Cylinder::getSurfaceArea() {
    return (2 * PI * radius * height + 2 * PI * radius * radius);
}

Sphere::Sphere(double r) : Solid("Sphere") {
    radius = r;
}

double Sphere::getVolume() {
    return ((4.0 / 3.0) * PI * (radius * radius * radius));
}

double Sphere::getSurfaceArea() {
    return 4 * PI * radius * radius;
}