#include <string>
using namespace std;
/**
   Return true if all elements on the diagonal joining the upper-left
   and the lower-right corners all the same.
   @param board a 3 x 3 array of String
   @return true if all elements are the same.
*/

bool upper_left_to_lower_right(string board[3][3])
{
   if (board[0][0] == board[0][2] && board[0][2] == board[2][2] && board[2][2] == board[2][0])
   {
      return true;
   }
   else
   {
      return false;
   }
}
