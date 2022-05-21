#include<bits/stdc++.h>
using namespace std;
int main ()
{
    int n;
    cout<<"Nhap vao so nguyen n:";cin>>n;
    if(n>=0)
    {
        if(n>=7)
        {
         cout<<"Cac so chia het cho 7 nho hon hoac bang n: ";
         for(int i=7;i<=n;i+=7)
         {
            if(i%7==0)
            cout<<i<<"  ";
         }
        }
        else
            cout<<"Khong co so tu nhien nho hon hoac bang n chia het cho 7";
    }
    else
        cout<<"Khong phai so tu nhien";
    return 0;
}
