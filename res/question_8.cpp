int count7(int n){
    if(n < 1){
        return 0;
    }
    if (n%10 == 7){
        return 1 + count7(n/10);
    }
    return count7(n/10);
}

main()
{
    int n;
    scan("Enter number: ", n);
    int result = count7(n);
    print("Number of 7's: " + result);
}