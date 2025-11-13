public boolean makeBricks(int small, int big, int goal) {
    // Calculate maximum inches we can get from big bricks
    int maxBigInches = big * 5;
    
    // If we have more big brick inches than needed, use only what we need
    if (maxBigInches >= goal) {
        // See if we can make exact multiple of 5 with big bricks
        return goal % 5 <= small;
    } else {
        // Use all big bricks and check if small bricks can cover the remainder
        return (goal - maxBigInches) <= small;
    }
}
