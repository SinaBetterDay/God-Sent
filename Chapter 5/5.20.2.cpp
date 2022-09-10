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





vector<string> words_not_of_length(vector<string> words, int word_length)
{
   vector<string> result;
   
   for (int i=0; i < words.size() +1; i++)
   {
      result.push_back(words[i]);
      if(words[i].length()==word_length)
      {
         result.pop_back();
      }
   }
