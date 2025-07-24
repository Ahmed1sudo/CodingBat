public int diff21(int n) {

    if (n > 21){

        n=n-21;
        n=n*2;
    }

    else if (n <= 21){

        n=21-n;

    }

    return n;

}
