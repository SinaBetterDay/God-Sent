//questions might not match mine

1.
   firstDuck = new DuckNode(ducklings1);
   headObj->InsertAfter(firstDuck);
   
   secondDuck = new DuckNode(ducklings2);
   firstDuck->InsertAfter(secondDuck);


2.
   for (i = 0; i < friendCount; i++)
   {
      cin >> inputValue;
      currFriend = new FriendNode(inputValue);
      lastFriend->InsertAfter(currFriend);
      lastFriend = currFriend;
   }


3.
   currWeight = headWeight;
   while(currWeight != nullptr)
   {
      if(currWeight->GetNodeData() < 0)
      {
         cout << currWeight->GetNodeData() << " is a bad entry." << endl;
      }
      currWeight = currWeight->GetNext();
   }
