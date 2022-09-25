#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;

int main()
{
   // Prompt for the input and output file names
   cout << "Input file: ";
   string input_file; cin >> input_file;
   cout << "\nOutput file: ";
   string output_file; cin >> output_file;
   
   // Construct the input and output streams
   ifstream in(input_file);
   ofstream out(output_file);

   // Check for errors and format output stream
   if (in.fail() || out.fail()) { return -1; }
   out << fixed << setprecision(2);

   // Read the input and write the output

   double total = 0;
   double count = 0;
   double avg;
   double value;
   while (in >> value)
   {
      out << setw(17) << value << endl;
      count++;
      total = total + value;
   }
   avg = total / count;
   out << "Average: " << setw(8) << avg << endl;

   return 0;
}
