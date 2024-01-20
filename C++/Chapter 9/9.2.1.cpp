#include <iostream>
using namespace std;

/**
   A simulated lock with digit buttons.
*/
class Lock
{
public:
   /**
      Simulates a digit button push.
      @param button a digit 0 ... 9
   */
   void push(int button);
   
   /**
      Simulates a push of the open button.
      @return true if the lock opened
   */
   bool open();
private:
   int combination = 1729; 
   int input = 0;
};

void Lock::push(int button)
{
   input = input * 10 + button;
}

bool Lock::open()
{
   if (combination == input)
   {
      input = 0;
      return true;
   }
   else
   {
      input = 0;
      return false;
   }
}

int main()
{
   Lock my_lock;
   my_lock.push(1);
   my_lock.push(7);
   my_lock.push(3);
   my_lock.push(9);
   cout << "Combination: 1739" << endl;
   cout << boolalpha;
   cout << "Expected: false" << endl;
   cout << "Your output: " << my_lock.open() << endl << endl;
   my_lock.push(1);
   my_lock.push(7);
   my_lock.push(2);
   my_lock.push(9);
   cout << "Combination: 1729" << endl;
   cout << "Expected: true" << endl;
   cout << "Your output: " << my_lock.open() << endl << endl;
   my_lock.push(1);
   my_lock.push(7);
   my_lock.push(2);
   cout << "Combination: 172" << endl;
   cout << "Expected: false" << endl;
   cout << "Your output: " << my_lock.open() << endl << endl;
   my_lock.push(9);
   cout << "Combination: 9" << endl;
   cout << "Expected: false" << endl;
   cout << "Your output: " << my_lock.open() << endl << endl;
   my_lock.push(1);
   my_lock.push(7);
   my_lock.push(2);
   my_lock.push(9);
   cout << "Combination: 1729" << endl;
   cout << "Expected: true" << endl;
   cout << "Your output: " << my_lock.open() << endl;
   return 0;
}
