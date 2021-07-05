package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Parser {

    public Parser() {

    }

    public <T> T jsonToObject(String response, Class<T> type) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-mm-dd hh:mm:ss");
        Gson gson = gsonBuilder.create();
        return gson.fromJson(response, type);
    }
    
}
