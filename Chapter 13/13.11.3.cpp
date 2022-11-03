#include <vector>
#include "pair.h"

using namespace std;

template<typename T>
Pair<T> first_last(vector<T> data)
{
   int size = data.size();
   T firsts = data[0];
   T last = data[size - 1];

   return Pair<T>(firsts, last);
}
