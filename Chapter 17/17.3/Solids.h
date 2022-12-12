#pragma once
#ifndef SOLIDS_H
#define SOLIDS_H
#include <iostream>

using namespace std;

class Solid {
protected:
    string solidType;
public:
    Solid(string type);
    virtual double getVolume() = 0;
    virtual double getSurfaceArea() = 0;
    string getType();
};

class Cuboid : public Solid {
private:
    double width;
    double length;
    double height;
public:
    Cuboid(double w, double l, double h);
    double getVolume();
    double getSurfaceArea();
};

class Cylinder : public Solid {

private:
    double height;
    double radius;
    const double PI = 3.14159265359;
public:
    Cylinder(double h, double r);
    double getVolume();
    double getSurfaceArea();
};

class Sphere : public Solid {

private:
    double radius;
    const double PI = 3.14159265359;

public:
    Sphere(double r);
    double getVolume();
    double getSurfaceArea();

};

#endif