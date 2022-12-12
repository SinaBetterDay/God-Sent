#include <iostream>
#include <string>
#include <vector>

using namespace std;

struct Record {
  string name;
  double money;
};

bool cmpName(const Record& r1, const Record& r2) {
  return r1.name < r2.name;
}

bool cmpMoney(const Record& r1, const Record& r2) {
  return r1.money < r2.money;
}

ostream& operator<<(ostream& os, const vector<Record>& v) {
  for (const auto& r : v) {
    os << r.name << " " << r.money << endl;
  }
  return os;
}
