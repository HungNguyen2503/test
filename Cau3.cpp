#include<bits/stdc++.h>
using namespace std;
int main ()
{
    string tenhang;
    long soluong,dongia,thanhtien,vat;
    cout<<"nhap ten hang hoa: ";
    getline(cin,tenhang);
    cout<<"nhap so luong: ";
    cin>>soluong;
    cout<<"nhap don gia: ";
    cin>>dongia;
    thanhtien=soluong*dongia;
    vat=thanhtien/10;
    cout<<endl;
    cout<<"\t\t\t===Thong Tin==="<<endl;
    cout<<"\t\t Ten hang hoa: \t"<<tenhang<<endl;
    cout<<"\t\t So luong: \t"<<soluong<<endl;
    cout<<"\t\t Don gia: \t"<<dongia<<endl;
    cout<<"\t\t Thanh tien: \t"<<thanhtien<<endl;
    cout<<"\t\t Thue vat: \t"<<vat<<endl;
    return 0;
}
