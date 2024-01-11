package com.example.demo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BusinessLogic {
List<String> femaleDawgs = List.of("Nala","Lily or Lilly","Kona","Piper","Mia","Bailey","Lucy","Winnie","Riley","Coco","Molly","Ivy","Stella","Roxy or Roxie","Willow","Gracie","Lola","Dixie","Princess","Lady","Ginger","Paisley","Nova","Riley","Coco","Hazel","Molly","Stella","Lexi","Aspen","Juno","Xena");
List<String> maleDawgs = List.of("Buddy","Tucker","Jack","Leo","Duke","Winston","Bear","Teddy","Loki","Archie","Joey","Oliver","Beau","Murphey","Jax","Gunther","Bentley","Finn","Ace","Scout","Ross","Louie","Gus","Moose","Hank","Bruno","Ollie","Lucky","Thor","Chandler","Kobe","Bandit");
List<String> maleCats = List.of("Oliver","Max","Charlie","Jack","Simba","Leo","Milo","Tiger","Smokey","Buddy","Tigger","Sammy","Toby","Oscar","Shadow","Sam","Simon","Jasper","Oreo","Rocky");
List<String> femaleCats = List.of("Bella","Chloe","Lucy","Lily","Sophie","Luna","Gracie","Molly","Zoe","Cleo","Mia","Princess","Daisy","Abby","Sash","Callie","Angel","Kitty","Lola","Maggie");

    public AppInfo getInfo(){
        LocalDate dateNow = LocalDate.now();
        String date = dateNow.getYear() + " " + dateNow.getMonth().toString();

        return new AppInfo(date);
    }

    public List<String> getPetNames(PetNameDataClass pet){
        if (pet.getPetType().equals("dog")){
            if (pet.getGender().equals("male")) return maleDawgs;
            else return femaleDawgs;
        } else {
            if (pet.getGender().equals("male")) return maleCats;
            else return femaleCats;
        }
    }
}
