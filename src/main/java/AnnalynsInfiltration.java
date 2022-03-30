class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean result = (knightIsAwake==true)?false:true;
        return result;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean result=false;
        if(knightIsAwake==true || archerIsAwake==true || prisonerIsAwake==true){
            result=true;
        }
        return result;
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean result=false;
        if(archerIsAwake==false && prisonerIsAwake==true){
            result=true;
        }
        return result;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean result=false;
        if((petDogIsPresent==true && archerIsAwake==false) || (petDogIsPresent==false && archerIsAwake==false && knightIsAwake==false && prisonerIsAwake==true)){
            result=true;
        }

        return result;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }
}
