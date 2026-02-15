#include <iostream>
#include <sstream>
using namespace std;

int main() {
    string str = "I am Kiran";
    string word;
    string result = "";

    stringstream ss(str);

    while(ss >> word) {
        result = word + " " + result;
    }

    cout << result;

    return 0;
}
