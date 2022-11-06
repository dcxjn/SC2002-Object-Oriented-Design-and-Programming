#include <iostream>
#include <string>
#include "Animal.h"
#include "ChildAnimal.h"

using namespace std;

int main()
{
    cout << "=== Create your animals ===" << endl;

    string name;
    string color;
    string ownerName;

    cout << "\nCreate a dog" << endl;
    cout << "Enter dog's name: ";
    cin >> name;
    cout << "Enter dog's color: ";
    cin >> color;
    cout << "Enter owner's name: ";
    cin >> ownerName;
    cout << "\n== Dog information ==\n";
    Mammal *Dogptr = new Dog(name, str_to_color(color), ownerName);

    cout << "\nCreate a cat" << endl;
    cout << "Enter cat's name: ";
    cin >> name;
    cout << "Enter cat's color: ";
    cin >> color;
    cout << "Enter owner's name: ";
    cin >> ownerName;
    cout << "\n== Cat information ==\n";
    Mammal *Catptr = new Cat(name, str_to_color(color), ownerName);

    cout << "\nCreate a lion" << endl;
    cout << "Enter lion's name: ";
    cin >> name;
    cout << "Enter lion's color: ";
    cin >> color;
    cout << "Enter owner's name: ";
    cin >> ownerName;
    cout << "\n== Lion information ==\n";
    Mammal *Lionptr = new Lion(name, str_to_color(color), ownerName);

    int selection;
    Mammal *zoo[3];
    int arr_length = 0;

    do
    {
        cout << "\nSelect animal to send to the zoo:" << endl;
        cout << "(1) Dog  (2) Cat  (3) Lion  (4) Move all animals  (5) Quit" << endl;
        cout << "\nEnter a selection:" << endl;
        cin >> selection;

        switch (selection)
        {

        case 1:
        {
            cout << "\nMoving dog...\n"
                 << endl;
            zoo[arr_length++] = Dogptr;
            break;
        }

        case 2:
        {
            cout << "\nMoving cat...\n"
                 << endl;
            zoo[arr_length++] = Catptr;
            break;
        }

        case 3:
        {
            cout << "\nMoving lion...\n"
                 << endl;
            zoo[arr_length++] = Lionptr;
            break;
        }

        case 4:
        {
            cout << "\nMoving all animals..." << endl;

            zoo[0] = Dogptr;
            zoo[1] = Catptr;
            zoo[2] = Lionptr;

            for (int i = 0; i < 3; i++)
            {
                zoo[i]->move();
                zoo[i]->speak();
                zoo[i]->eat();
            }
            break;
        }
        }
    } while (selection != 5);
    cout << "Program exiting … " << endl;
    return 0;
}