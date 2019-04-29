#include<iostream>
#include<algorithm>
using namespace  std;
int main()
{
     int n,m,r;
    cin>>n>>m>>r;
    int s[30],b[1000];
    int max=INT_MIN,min=INT_MAX;
    for(int i = 0; i < n; i++)
    {
        cin>>s[i];
        
    }
    sort(s,s+n);
    for(int i = 0; i < m; i++)
    {
        cin>>b[i];
        
        
    }
    sort(b,b+m,greater<int>());
    int share=0;
    int price=s[0];
    int rini=r;
    int i=0;
    while(r>0 && price<=r && i<n)
    {
        
        share+=r/price;
        r=r%price;
        i++;
        price=s[i];
    }
    if(((b[0]*share)+r)>rini)
    cout<<(b[0]*share)+r;
    else
    {
        cout<<rini;
    }
    
    
}