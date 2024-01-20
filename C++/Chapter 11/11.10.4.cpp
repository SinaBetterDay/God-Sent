#include <cmath>
using namespace std;

int split(char sentence[], char* words[], int maxwords)
{
  char* p = sentences;
  int nwords = 1;
  words[0] = p;
  while (p* != '\0' && nwords < maxwords)
  {
    if (*p == ' ')
    {
      *p = '\0';
      words[nwords] = p + 1;
      nwords++;
    }
    p++;
  }
  return nwords;
}
