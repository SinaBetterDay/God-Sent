int main()
{
  vector<Question*> quiz;
  quiz.push_back(new FreeResponseQuestion("How did you spend your summer vacation?"));
  quiz.push_back(new NumericQuestion("How much is 6 * 7?", 42));
  quiz.push_back(new FillInQuestion("The first electronic computer was the _____", "Eniac"));
  
  for (Question* q : quiz)
  {
    q->display();
  }
  
  // Sort the list after all questions are added
  sort(quiz.begin(), quiz.end(), sort_key());
  return 0;
}
