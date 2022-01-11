package characters;

import Extra.Rotation;
import objects.Objects;
import Extra.Place;

public class Characters extends ACharacters {

    private Place place;
    private String name;
    private Rotation rotation;

    public Characters(String name){
        this.name = name;
        this.place = null;
    }

    public String StoodUp(){
        return (name + " встал");
    }

    public String WasWalking(){
        return (name + " пересаживался ");
    }

    public String Moved(Place place){
        return (" пересел " + place.getName() + ".");
    }

    public String WasFalling(){
        return (name + " падал" + ".");
    }

    public String CameToTheEnd(){
        return (name + " кончился" + ".");
    }

    public String WasNotAbleToHold(){
        return (name + " нельзя было удержать" + ".");
    }

    public String Disturb(Objects objects){
        return (name + " мешал " + objects.getName() + ".");
    }


    public String CooledDown(Objects objects){
        return (name + " остыл в " + objects.getName() + ".");
    }

    public String IsMade(Objects objects){
        return (name + " сделан из " + objects.getName() + ".");
    }

    public String Covered(Objects objects){
        return (name + " покрылся " + objects.getName() + ".");
    }

    public String WasShining(Place place){
        return (" сверкал над " + place.getName() + ".");
    }

    public String StartedToFall(){
        if (rotation == Rotation.DOWN){
            return (name + " стал опускаться вниз " + ".");
        }
        else {
            return (name + "стал опускаться" + ".");
        }
    }

    public void setRotation(Rotation rotation) {
        this.rotation = rotation;
    }

    public Rotation getRotation() {
        return rotation;
    }
}
