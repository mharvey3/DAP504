import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utilities {

    public ArrayList<String> getPlayersFromJson() throws IOException {
        String fileName = "players.json";

        Gson gson = new Gson();
        try (FileReader fileReader = new FileReader(fileName);
             JsonReader jsonReader = new JsonReader(fileReader);
             ) {
            ReadJson[] data = gson.fromJson(jsonReader, ReadJson[].class);
        }

        ArrayList<String> playerList = new ArrayList<String>();
        return playerList;


    }

}

