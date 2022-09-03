#include <iostream>
#include "card.h"

using namespace std;

int main()
{
  int n;
  string card;
  srand(567);
  n = rand() % 13 + 1;
  card = card_rank(n);
  n = rand() % 4;
  card = card + " of " + card_suit(n);
  cout << card << endl;
  return 0;
}
