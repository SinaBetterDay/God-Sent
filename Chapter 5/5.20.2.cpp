vector<string> find_all(vector<string> words, string searched_word)
{
   vector<string> result;
   for (int i=0; i<words.size(); i++)
   {
      if (words[i] == searched_word)
      {
         result.push_back(i);
      }
   }
   return result;
}
