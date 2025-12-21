class waterbottle {
    public int numWaterBottles(int numBottles, int numExchange) {
        int c=numBottles;
        while (numBottles>1)
            {

                System.out.println(numBottles);
              int d= numBottles/numExchange;
                if(numBottles==( numBottles%numExchange+d) )
                    break;
                numBottles=numBottles%numExchange+d;
                c+=d;
            }
        return c;
    }
}