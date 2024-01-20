#include <iostream>
using namespace std;

int main() 
{
  const int LENGTH = 8;
  int values[] = {-3, 2, -1, 8, -4, -3, 7, -2};
  int positive = 0;
  int negative = 0;
  for (int i = 0; i < LENGTH; i++)
  {
    if (values[i] > 0)
    {
      positive++;
    }
    else if (values[i] < 0)
    {
      negative++;
    }
  }
   cout << "Array: {-3, 2, -1, 8, -4, -3, 7, -2}" << endl;
   cout << "Positive elements: " << positive << endl;
   cout << "Negative elements: " << negative << endl;
   
   return 0;
}
