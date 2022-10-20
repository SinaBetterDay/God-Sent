//questions might differ from mine

1
   myDonkey = new Donkey(ageValue,weightValue);


2
   Cone* myCone;
  
   cin >> radiusValue;
   cin >> heightValue;
  
   myCone->radius = radiusValue;
   myCone->height = heightValue; 


3
   double powerValue;
   double distanceValue;

   cin >> powerValue;
   cin >> distanceValue;
   
   SoundWave* mySoundWave;
   mySoundWave = new SoundWave(powerValue, distanceValue);
   mySoundWave->IncreasePowerAndDistance();


4
   myMovingBody = new MovingBody();
   myMovingBody->Read();
   myMovingBody->Print();
   
   delete myMovingBody;


5
   cin >> count;
   myBallObjects = new BallObject[count];
   
   for (i = 0; i < count; i++)
   {
      myBallObjects[i].Read();
      myBallObjects[i].Print();
   }
