#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int find_nth_term(int n, int a, int b, int c) {
  int sum[n],s = 0;
  for (int i = 0; i<n; i++) 
  {
    if(i == a-1 || i == b-1 || i == c-1)
    {
        sum[i]=i+1;
    }    
    else {
        sum[i] = sum[i-1]+sum[i-2]+sum[i-3];
    }
    s = s +sum[i];
}
return s;
}

int main() {
    int n, a, b, c;
  
    scanf("%d %d %d %d", &n, &a, &b, &c);
    int ans = find_nth_term(n, a, b, c);
 
    printf("%d", ans); 
    return 0;
}
