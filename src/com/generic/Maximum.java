package com.generic;
public class Maximum<E extends Comparable> {

    E firstPosition;
    E secondPosition;
    E thirdPosition;
    E fourthPosition;
    E fifthPosition;

    public Maximum(E firstPosition, E secondPosition, E thirdPosition, E fourthPosition, E fifthPosition) {
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
        this.thirdPosition = thirdPosition;
        this.fourthPosition = fourthPosition;
        this.fifthPosition = fifthPosition;
    }

    public E maximumGeneric(){
        return genericMaximum(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition);
    }
    public <E extends Comparable> E genericMaximum(E firstPosition, E secondPosition, E thirdPosition, E fourthPosition, E fifthPosition){
        E maxPosition = firstPosition;
        if(secondPosition.compareTo(maxPosition) > 0)
            maxPosition = secondPosition;
        if(thirdPosition.compareTo(maxPosition) > 0)
            maxPosition = thirdPosition;
        if(fourthPosition.compareTo(maxPosition) > 0)
            maxPosition = fourthPosition;
        if(fifthPosition.compareTo(maxPosition) > 0)
            maxPosition = fifthPosition;
        return maxPosition;
    }
}