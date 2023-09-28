#include <iostream>
using namespace std;

int main() {
  string letters[2][4] = {
    { "1", "2", "3", "4" },
    { "5", "6", "7", "8" }
  };
  
  cout << letters[1][3];
  return 0;
}
