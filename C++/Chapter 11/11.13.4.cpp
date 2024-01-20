#include <iostream>
using namespace std;

struct Person
{
  string name;
  Person* best_friend;
};

int main()
{
  Person* john;
  Person* mary;
  mary = new Person;
  john = new Person;
  mary->best_friend = john;
  john->best_friend = mary;
  john->name = "John";
  mary->name = "Mary";
  
  cout << mary->name << "'s best friend is " << john->best_friend->name << endl;
  cout << mary->name << "'s best friend is " << mary->best_friend->name << endl;
  
  delete john;
  delete mary;
  return 0;
}
