public boolean parrotTrouble(boolean talking, int hour) {
    if (hour < 7) {
        return talking;
    }
    else if (hour > 20) {
        return talking;
    }
    else {

        talking = false;
        return talking;
    }
}
