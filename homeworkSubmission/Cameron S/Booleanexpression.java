public boolean cigarParty(int cigars, boolean isWeekend) {
    // On weekends, only need at least 40 cigars
    // On weekdays, need between 40 and 60 inclusive
    if (isWeekend) {
        return cigars >= 40;
    } else {
        return cigars >= 40 && cigars <= 60;
    }
}


public int dateFashion(int you, int date) {
    // If either has style 2 or less → no (0)
    if (you <= 2 || date <= 2) {
        return 0;
    }
    // If either has style 8 or more → yes (2)
    else if (you >= 8 || date >= 8) {
        return 2;
    }
    // Otherwise → maybe (1)
    else {
        return 1;
    }
}

public boolean squirrelPlay(int temp, boolean isSummer) {
    // Normal play: 60–90 inclusive
    // Summer play: 60–100 inclusive
    if (isSummer) {
        return temp >= 60 && temp <= 100;
    } else {
        return temp >= 60 && temp <= 90;
    }
}

public int caughtSpeeding(int speed, boolean isBirthday) {
    // On your birthday, the speed limit is effectively 5 higher
    if (isBirthday) {
        speed -= 5;
    }

    if (speed <= 60) {
        return 0;
    } else if (speed <= 80) {
        return 1;
    } else {
        return 2;
    }
}

public boolean makeBricks(int small, int big, int goal) {
    int maxBig = goal / 5; // how many big bricks we'd ideally use
    if (maxBig > big) {
        maxBig = big; // can't use more than we have
    }

    int remainder = goal - (maxBig * 5); // what's left to fill with small bricks
    return remainder <= small; // true if we have enough small bricks
}
