package money.make.cs.controller;

import money.make.cs.Case;
import money.make.cs.Key;
import money.make.cs.utils.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {
    @GetMapping("/")
    public String mainPage() {
        Calculator c=new Calculator();
        String s1="3+3="+c.sum(3,3);
       String nextLine="\n";
       String s2="234+2452="+c.sum(234, 2452);
        return s1+nextLine+s2;

    }
    @GetMapping("/rifle")
    public String riflePage() {
        Rifle m4a1 = new Rifle("m4a1", 1.23f, "new", "farm", 24, 4.0, 3);

        return m4a1.toString()+m4a1.nameandQuality();

    }
    @GetMapping("/caseOpening")
    public String caseOpening() {
        Rifle [] items=new Rifle[15];
        items[0]=new Rifle("Glock-18","Катакомбы", 100.0, 1);
        items[1]=new Rifle("M249","Блокировка",100.0, 2);
        items[2]=new Rifle("XM1014","Ртуть",100.0, 3);
        items[3]=new Rifle("MP9","Грот",100.0, 4);
        items[4]=new Rifle("SCAR-20","Смертельный яд",100.0, 4);
        items[5]=new Rifle("MAC-10","Малахит",100.0,4);
        items[6]=new Rifle("Sawed-Off","Безмятежность",100.0, 4);
        items[7]=new Rifle("Dual Berettas","Городской шок",100.0, 6);
        items[8]=new Rifle("Desert Eagle","Нага",100.0,10);
        items[9]=new Rifle("P250","Покойник",100.0,20);
        items[10]=new Rifle("M4A4","Король драконов",30.0,100);
        items[11]=new Rifle("AK-47","Картель",30.0,110);
        items[12]=new Rifle("Автомат «Галиль»","Щелкунчик",40.0,70);
        items[13]=new Rifle("AWP","Боец",15.0,220);
        items[14]=new Rifle("Knife","Lore",2.0, 17000);
        Case chrome=new Case(new Key(true),"Chrome", 60, items);
       return chrome.drop().toString();



    }

}


