package net.jaegerbox.fdseasyquiz;

import android.app.Application;
import android.content.res.AssetManager;
import android.util.Log;

import net.jaegerbox.fdseasyquiz.Utils.Constants;

import java.io.IOException;
import java.io.InputStream;

public class FDSEasyQuiz extends Application {

    private final static String TAG = "MainMio";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "passato di qui");

        AssetManager assetManager = getAssets();

        try (InputStream input = assetManager.open(Constants.SaveFileName)){
            String json = convertStreamToString(input);//funge

            Log.d(TAG, json);


        }
        catch(IOException exception)
        {

        }

    }


    static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
