public int sumDouble(int a, int b) {
    int sum = a+b;

    if (a == b)
    {
        sum = (a+a)+(b+b);
    }
    return sum;
}