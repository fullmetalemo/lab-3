package objects;

import Extra.Place;

public class Objects extends AObject {

    private Place place;
    private static String name;

    public Objects(String name, Place place){
        this.name = name;
        this.place = place;
    }

    public Objects(String name){
        this.name = name;
    }

    public static String getName(){
        return name;
    }

    public Place getPlace(){
        return place;
    }

}
