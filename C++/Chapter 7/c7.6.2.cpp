#include <iostream>
#include <string>
using namespace std;

/**
   A simulated traffic light.
*/
class TrafficLight
{
public:
   /**
      Constructs a green traffic light.
   */
   TrafficLight();

   /**
      Constructs a traffic light.
      @param initial_color the initial color "green", "yellow", or "red"
   */
   TrafficLight(string initial_color);
   
   /**
      Moves this traffic light to the next color.
   */
   void next();
   
   /**
      Returns the current color of this traffic light.
      @return the current color
   */
   string get_color() const;
   
   /**
      Counts how often this traffic light has been red.
      @return the number of times this traffic light has been red
   */
   int get_reds() const;
   
private:
   int steps;
};

TrafficLight::TrafficLight()
{
   steps = 0;
}

TrafficLight::TrafficLight(string initial_color)
{
   if (initial_color == "green")
   {
      steps = 0;
   }
   else if (initial_color == "yellow")
   {
      steps = 1;
   }
   else
   {
      steps = 2;
   }
}

void TrafficLight::next()
{
   steps++;
}

string TrafficLight::get_color() const
{
   if (steps % 3 == 0)
   {
      return "green";
   }
   if (steps % 3 == 1)
   {
      return "yellow";
   }
   else
   {
      return "red";
   }
}

int TrafficLight::get_reds() const
{
   int reds = 0;
   for (int i = 0; i <= steps; i++)
   {
      if (i % 3 == 2)
      {
         reds++;
      }
   }
   return reds;
}

int main()
{
   TrafficLight tl1;
   cout << tl1.get_color() << endl;
   cout << "Expected: green" << endl;
   cout << tl1.get_reds() << endl;
   cout << "Expected: 0\n" << endl;
   tl1.next();
   cout << tl1.get_color() << endl;
   cout << "Expected: yellow" << endl;
   cout << tl1.get_reds() << endl;
   cout << "Expected: 0\n" << endl;
   tl1.next();
   cout << tl1.get_color() << endl;
   cout << "Expected: red" << endl;
   cout << tl1.get_reds() << endl;
   cout << "Expected: 1\n" << endl;
   tl1.next();
   cout << tl1.get_color() << endl;
   cout << "Expected: green" << endl;
   cout << tl1.get_reds() << endl;
   cout << "Expected: 1\n" << endl;

   TrafficLight tl2("red");
   cout << tl2.get_color() << endl;
   cout << "Expected: red" << endl;
   cout << tl2.get_reds() << endl;
   cout << "Expected: 1\n" << endl;
   tl2.next();
   cout << tl2.get_color() << endl;
   cout << "Expected: green" << endl;
   cout << tl2.get_reds() << endl;
   cout << "Expected: 1\n" << endl;
   tl2.next();
   tl2.next();
   cout << tl2.get_color() << endl;
   cout << "Expected: red" << endl;
   cout << tl2.get_reds() << endl;
   cout << "Expected: 2" << endl;
   
   return 0;
}
