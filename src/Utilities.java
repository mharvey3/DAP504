import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utilities {

//    public ArrayList<String> getPlayersFromJson() throws IOException {
//        String fileName = "players.json";
//
//        Gson gson = new Gson();
//        try (FileReader fileReader = new FileReader(fileName);
//             JsonReader jsonReader = new JsonReader(fileReader);
//             ) {
//            ReadJson[] data = gson.fromJson(jsonReader, ReadJson[].class);
//            for (ReadJson readJson : data){
//                //Player player = new Player(readJson);
//                System.out.println(readJson);
//
//            }
//        }
//
//
//
//        ArrayList<String> playerList = new ArrayList<String>();
//        return playerList;
//
//
//    }

    public static void setPlayers(Match match) throws IOException{
        String fileName = "C:\\Users\\Inferno\\DAP504\\src\\players.json";

        Gson gson = new Gson();
        try (FileReader fileReader = new FileReader(fileName);
             JsonReader jsonReader = new JsonReader(fileReader);
        ) {
            ReadJson[] data = gson.fromJson(jsonReader, ReadJson[].class);
            ArrayList<Player> players = new ArrayList<Player>();
            int i = 1;
            for (ReadJson readJson : data){
                System.out.println(readJson.getId());
                Player player = new Player(readJson.getId(), readJson.getFirst_name(), readJson.getLast_name(), i);
                i++;
                players.add(player);
            }
            match.setPlayersInWholeMatch(players);
            //System.out.println(data);
//            for (ReadJson readJson : data){
//                //Player player = new Player(readJson);
//                //System.out.println(readJson);
//                //ReadJson readJson1 = new ReadJson();
//
//            }
        }
    }

    public static void printPlayers() throws IOException{
        String fileName = "C:\\Users\\Inferno\\DAP504\\src\\players.json";

        Gson gson = new Gson();
        try (FileReader fileReader = new FileReader(fileName);
             JsonReader jsonReader = new JsonReader(fileReader);
        ) {
            ReadJson[] data = gson.fromJson(jsonReader, ReadJson[].class);
            ArrayList<Player> players = new ArrayList<Player>();
            int i = 1;
            for (ReadJson readJson : data){
                //System.out.println(readJson.getId());
                Player player = new Player(readJson.getId(), readJson.getFirst_name(), readJson.getLast_name(), i);
                i++;
                players.add(player);
            }
            //System.out.println(data);
//            for (ReadJson readJson : data){
//                //Player player = new Player(readJson);
//                //System.out.println(readJson);
//                //ReadJson readJson1 = new ReadJson();
//
//            }
        }
    }

}

