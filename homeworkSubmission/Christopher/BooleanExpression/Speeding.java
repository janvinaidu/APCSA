public int caughtSpeeding(int speed, boolean isBirthday) {
    int bonus = isBirthday ? 5 : 0;
    
    if (speed <= 60 + bonus) {
        return 0;
    } else if (speed <= 80 + bonus) {
        return 1;
    } else {
        return 2;
    }
}
