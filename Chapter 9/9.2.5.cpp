#include "ball.h"

Ball::Ball(int right_wall, int top_wall)
{
   max_x = right_wall;
   max_y = top_wall;
   dx = 0;
   dy = 0;
   x = 1;
   y = 1;
}

void Ball::move()
{
   if (dx == max_x || dy == max_y || dx == 0 || dy == 0)
   {
      turn();
   }
   dx += x;
   dy += y;
   if (dx == 8)
   {
      dy = 8;
   }
}

void Ball::turn()
{
   if (dx == max_x)
   {
      x = -1;
   }
   if (dy == max_y)
   {
      y = -1;
   }
   if (dx == 0)
   {
      x = 1;
   }
   if (dy == 0)
   {
      y = 1;
   }
}

int Ball::get_x() const
{
   return dx;
}

int Ball::get_y() const
{
   return dy;
}

