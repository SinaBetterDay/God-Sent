#include <iostream>
using namespace std;

int main() 
{
    /* Type your code here. */
    char arr[6];
    bool carry = false;
    int i = 0;    
    
    cin.getline(arr, 7);
    
    if ( arr[5] < '9' )
    {
       arr[5] = arr[5] + 1;      
       carry = false;
    }
    else if (arr[5] == '9')
    {
       arr[5] = '0';
       carry = true;
    }
   
    if(carry == true)
    {
       if ( arr[4] < '9' )
       {
          arr[4] = arr[4] + 1;
          carry = false;
       }
       else
       {
          arr[4] = '0';
          carry = true;
       }
    }
   
    if(carry == true)
    {
       if ( arr[3] < '9' )
       {
          arr[3] = arr[3] + 1;
          carry = false;
       }
       else
       {
          arr[3] = '0';
          carry = true;
       }
    }
 
    if(carry == true)
    {
       if ( arr[2] < 'Z' )
       {
          arr[2] = arr[2] + 1;
          carry = false;
       }
       else if (arr[2] == 'Z')
       {
          arr[2] = 'A';
          carry = true;
       }
    }

    if(carry == true)
    {
       if ( arr[1] < 'Z' )
       {
          arr[1] = arr[1] + 1;
          carry = false;
       }
       else if (arr[1] == 'Z')
       {
          arr[1] = 'A';
          carry = true;
       }
    }
    
    if(carry == true)
    {
       if ( arr[0] < 'Z' )
       {
          arr[0] = arr[0] + 1;
          carry = false;
       }
       else if (arr[0] == 'Z')
       {
          arr[0] = 'A';
          carry = true;
       }
    }

    for(i = 0; i < 6; i++)
    {
       cout << arr[i];
    }
    cout << endl;
    return 0;
}
