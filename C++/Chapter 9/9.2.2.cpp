#include <iostream>
#include <string>
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
   string combination = "0042"; 
   string input;
};

void Lock::push(int button)
{
   string button_as_string = to_string(button);
   input += button_as_string;
}

bool Lock::open()
{
   if (combination == input)
   {
      input = "";
      return true;
   }
   else
   {
      input = "";
      return false;
   }
}

int main()
{
   Lock my_lock;
   my_lock.push(4);
   my_lock.push(2);
   cout << boolalpha;
   cout << my_lock.open() << endl;
   cout << "Expected: false\n" << endl;
   my_lock.push(0);
   my_lock.push(0);
   my_lock.push(4);
   my_lock.push(2);
   cout << my_lock.open() << endl;
   cout << "Expected: true\n" << endl;
   my_lock.push(0);
   my_lock.push(4);
   my_lock.push(2);
   cout << my_lock.open() << endl;
   cout << "Expected: false\n" << endl;
   my_lock.push(0);
   my_lock.push(0);
   my_lock.push(0);
   my_lock.push(4);
   my_lock.push(2);
   cout << my_lock.open() << endl;
   cout << "Expected: false\n" << endl;
   my_lock.push(0);
   my_lock.push(0);
   my_lock.push(4);
   my_lock.push(2);
   cout << my_lock.open() << endl;
   cout << "Expected: true" << endl;
   return 0;
}
