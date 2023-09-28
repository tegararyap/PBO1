#include <iostream>

using namespace std;

int main() {
    int angka;

    printf("Program untuk Cek Angka Genap/Ganjil\n");
    printf("Masukkan angka : ");
    cin >> angka;

    string hasil = (angka & 1) ? "Angka tersebut ganjil" : "Angka tersebut genap";
    cout << hasil << endl;

   
    
}