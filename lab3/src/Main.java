import characters.Characters;
import Extra.*;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        //main characters
        Characters AirBalloon = new Characters("Воздушный шар");
        Characters Grumpy = new Characters("Ворчун");
        Characters Falling = new Characters("Падение");
        Characters StockOfBags = new Characters("Запас");
        Characters Air = new Characters("Воздух");

        //some important locations (which are actually not locations nvm)
        Place HeadsOfBabies = new Place("головами малышей");
        Place AnotherPlace = new Place("другое место");

        //passive objects
        Objects Frost = new Objects("инеем");
        Objects Shell = new Objects("оболочке");
        Objects Others = new Objects("другим");
        Objects Silver = new Objects("чистого серебра");

        //construction for building our text
        System.out.println(Grumpy.StoodUp() + Grumpy.Moved(AnotherPlace));
        System.out.println(Grumpy.WasWalking()+Grumpy.Disturb(Others));
        System.out.println(AirBalloon.Covered(Frost)+ AirBalloon.WasShining(HeadsOfBabies));
        System.out.println(AirBalloon.IsMade(Silver));
        System.out.println(Air.CooledDown(Shell));
        AirBalloon.setRotation(Rotation.DOWN);
        System.out.println(AirBalloon.WasFalling());
        System.out.println(StockOfBags.CameToTheEnd());
        System.out.println(Falling.WasNotAbleToHold());

    }
}


//what it should print on your devise's screen:
/**
 * Ворчун встал пересел на другое место
 * Ворчун пересаживался мешал другим
 * Воздушный шар покрылся инеем сверкал над головами малышей
 * Возлушный шар сделан из чистого серебра
 * Воздух остыл в оболочке
 * Воздушный шар стал опускаться вниз
 * Воздушный шар падал (через несколько минут)
 * Запас мешков кончился
 * Падение нельзя было удержать
 **/