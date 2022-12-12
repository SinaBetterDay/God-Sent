#include <algorithm>
#include "Record.h"

using namespace std;

int main() {
  vector<Record> records = {
    {"Thomas", 90809.234},
    {"Ryan", 234.24},
    {"Anna", 432.23}
  };

  sort(records.begin(), records.end(), cmpName);
  cout << records;

  sort(records.begin(), records.end(), cmpMoney);
  cout << records;

  return 0;
}
