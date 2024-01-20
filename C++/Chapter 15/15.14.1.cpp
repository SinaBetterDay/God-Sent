#include <iostream>
#include <string>
#include <sstream>
using namespace std;

#include "question.h"
#include "choicequestion.h"

ChoiceQuestion::ChoiceQuestion(string question_text)
{
   Question::add_line(question_text);
}

void ChoiceQuestion::add_choice(string choice, bool correct)
{
   num_choices++;
   Question::add_line(to_string(num_choices) + ": " + choice);
   if (correct)
   {
      Question::set_answer(to_string(num_choices));
   }
}
