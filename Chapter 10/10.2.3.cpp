#questions may differ from mine

1
   char* cargoLabelPointer = &cargoLabel;
   int* armchairCountPointer = &armchairCount;
   double* armchairWeightPointer = &armchairWeight;



2
   if (area1 > area2)
   {
      areaPointer = &area1;
   }
   else if (area1 < area2)
   {
      areaPointer = &area2;
   }
   else
   {
      areaPointer = nullptr;
   }


3
   if (labelPointer == nullptr)
   {
      cout << "labelPointer is null." << endl;
   }
   else
   {
      cout << *labelPointer << endl;
   }
