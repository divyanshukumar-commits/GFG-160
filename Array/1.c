#include <stdio.h>
int main()
{
    int arr[] = {2, 2, 3, 1, 3, 2, 1, 1};
    int n = sizeof(arr) / sizeof(arr[0]);
    // printf("%d", n);
    int d = n / 3;
    int ind = 0;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        int count = 0;
        for (int j = 0; j < n; j++)
        {
            if (arr[i] == arr[j])
            {
                count++;
            }
        }
        if (count > d)
        {
            arr[i] = a[ind];
            ind++;
        }
    }
    for (int i = 0; i < ind; i++)
    {
        printf("%d ", a[i]);
    }
}