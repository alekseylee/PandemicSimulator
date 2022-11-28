import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {

        Map<String, Patient> patientMap = new HashMap<>();
        patientMap.put("Lucky Luke", new Patient("030201321","Lucky Luke",69,38,true,false));
        patientMap.put("Stromae Papaoutai", new Patient("030201322","Stromae Papaoutai",35,40,false,true));
        patientMap.put("Gringoire Lune", new Patient("030801321","Gringoire Lune",80,36,true,true));
        patientMap.put("Crazy Frog", new Patient("687201321","Crazy Frog",5,39,false,false));
        patientMap.put("Sanic the HedgeHog",new Patient("030244321","Sanic the HedgeHog",16,37,true,true));
        patientMap.put("Donald Putin",new Patient("110201321","Donald Putin",90,39,false,true));
        patientMap.put("Donald Putin",new Patient("110201321","Donald Putin",90,39,false,true));
        patientMap.put("Bilbo Baggins",new Patient("088201321","Bilbo Baggins",23,39,true,false));
        patientMap.put("Lucio Correa Dos Santos",new Patient("035501321","Lucio Correa Dos Santos",40,38,false,true));
        patientMap.put("Doctor Who",new Patient("030206621","Doctor Who",33,35,true,true));
        patientMap.put("Luke Cage",new Patient("030245321","Luke Cage",46,41,true,false));
        patientMap.put("Naruto Uzumaki",new Patient("030298321","Naruto Uzumaki",13,38,false,false));
        patientMap.put("Billy Batson",new Patient("125201321","Billy Batson",15,40,true,false));
        patientMap.put("Joseph Joestar",new Patient("987201321","Joseph Joestar",75,36,true,false));
        patientMap.put("Jon Snow",new Patient("645201321","Jon Snow",33,35,false,false));
        patientMap.put("Prince Charming",new Patient("368201321","Prince Charming",95,37,true,true));
        patientMap.put("Alexander Hamilton",new Patient("582201321","Alexander Hamilton",65,38,false,false));
        patientMap.put("Crazy Frog",new Patient("687201321","Crazy Frog",5,39,false,false));
        patientMap.put("Zelda of Hyrule",new Patient("030201231","Zelda of Hyrule",17,38,false,true));
        patientMap.put("Mother Theresa",new Patient("830208651","Mother Theresa",98,39,true,false));
        patientMap.put("Willy Wonka",new Patient("030209741","Willy Wonka",70,40,true,true));
        patientMap.put("Scrooge McDuck",new Patient("030205411","Scrooge McDuck",73,38,true,false));
        patientMap.put("Prince Charming",new Patient("368201321","Prince Charming",95,37,true,true));
        patientMap.put("Sonia Magnlia",new Patient("030209861","Sonia Magnlia",35,39,false,false));
        patientMap.put("Peter Parker",new Patient("030278921","Peter Parker",21,40,true,false));
        patientMap.put("Bruce Wayne",new Patient("030269821","Bruce Wayne",46,35,false,true));
        patientMap.put("Seto Kaiba",new Patient("030215421","Seto Kaiba",22,38,false,true));
        patientMap.put("Mario Mario",new Patient("030296321","Mario Mario",50,37,false,false));
        patientMap.put("Harry Potter",new Patient("035051321","Harry Potter",18,39,true,true));
        patientMap.put("Prince Charming",new Patient("368201321","Prince Charming",95,37,true,true));
        patientMap.put("Mary Poppins",new Patient("036781321","Mary Poppins",38,38,true,false));
        patientMap.put("Alexander the Great",new Patient("033691321","Alexander the Great",51,37,false,true));
        patientMap.put("Crazy Frog",new Patient("687201321","Crazy Frog",5,39,false,false));
        patientMap.put("Huey Freeman",new Patient("030201000","Huey Freeman",12,40,false,false));
        patientMap.put("Miku Hatsune",new Patient("000201321","Miku Hatsune",16,36,true,true));
        patientMap.put("Drake Josh",new Patient("111201321","Drake Josh",33,38,true,false));
        patientMap.put("April O'Neil", new Patient("222201321","April O'Neil",29,37,false,false));

        System.out.println(patientMap);

        for (Map.Entry<String, Patient> stringTemperaturePacient : patientMap.entrySet()) {

            if (stringTemperaturePacient.getValue().getTemperature() > 36) {
            }
            if (stringTemperaturePacient.getValue().getAge() > patientMap.size()) {
                System.out.println(stringTemperaturePacient.getKey() + " patient temperature " + stringTemperaturePacient.getValue().getTemperature() + " patient age is: " + stringTemperaturePacient.getValue().getAge());

            }


        }
   }
}

