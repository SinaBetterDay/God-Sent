 if (cin.fail())
   {
      cout << "Error: Not an integer." << endl;
   }
   else if (hour<13&&hour>0)
   {
      string suffix;
      cin >> suffix;
      if (suffix=="am"||suffix=="pm")
      {
         if (hour==12)
         {
            hour = 0;
         }
         if (suffix=="pm")
         {
            hour = hour + 12;
         }
         cout << hour << endl;
      }
