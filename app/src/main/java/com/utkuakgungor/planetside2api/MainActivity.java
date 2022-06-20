package com.utkuakgungor.planetside2api;

import android.os.Bundle;

import com.android.volley.Request;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.appcompat.app.AppCompatDelegate;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_PlanetSide2API);
        setContentView(R.layout.activity_main);
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        Spinner spinner = findViewById(R.id.spinner);
        TextView vanuText = findViewById(R.id.vanuText2);
        TextView newText = findViewById(R.id.newText2);
        TextView terranText = findViewById(R.id.terranText2);
        TextView naniteText = findViewById(R.id.naniteText2);
        TextView sumText = findViewById(R.id.sumText2);

        String[] arraySpinner = new String[]{
                "Select","Connery", "Miller", "Cobalt", "Emerald", "Jaeger", "SolTech"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 1:
                        requestQueue.add(new JsonObjectRequest(Request.Method.GET, "https://ps2.fisu.pw/api/population/?world=1", null,
                                response -> {
                                    String jsonString = response.toString();
                                    Gson gson = new Gson();
                                    Integer sum = 0;
                                    APIClass data = gson.fromJson(jsonString, APIClass.class);
                                    for (APIClass.Result result : data.getResult()) {
                                        newText.setText(result.nc+"");
                                        sum=sum+result.nc;
                                        vanuText.setText(result.vs+"");
                                        sum=sum+result.vs;
                                        terranText.setText(result.tr+"");
                                        sum=sum+result.tr;
                                        naniteText.setText(result.ns+"");
                                        sum=sum+result.ns;
                                    }
                                    sumText.setText(sum+"");
                                }, Throwable::printStackTrace));
                        break;
                    case 2:
                        requestQueue.add(new JsonObjectRequest(Request.Method.GET, "https://ps2.fisu.pw/api/population/?world=10", null,
                                response -> {
                                    String jsonString = response.toString();
                                    Gson gson = new Gson();
                                    Integer sum = 0;
                                    APIClass data = gson.fromJson(jsonString, APIClass.class);
                                    for (APIClass.Result result : data.getResult()) {
                                        newText.setText(result.nc+"");
                                        sum=sum+result.nc;
                                        vanuText.setText(result.vs+"");
                                        sum=sum+result.vs;
                                        terranText.setText(result.tr+"");
                                        sum=sum+result.tr;
                                        naniteText.setText(result.ns+"");
                                        sum=sum+result.ns;
                                    }
                                    sumText.setText(sum+"");
                                }, Throwable::printStackTrace));
                        break;
                    case 3:
                        requestQueue.add(new JsonObjectRequest(Request.Method.GET, "https://ps2.fisu.pw/api/population/?world=13", null,
                                response -> {
                                    String jsonString = response.toString();
                                    Gson gson = new Gson();
                                    Integer sum = 0;
                                    APIClass data = gson.fromJson(jsonString, APIClass.class);
                                    for (APIClass.Result result : data.getResult()) {
                                        newText.setText(result.nc+"");
                                        sum=sum+result.nc;
                                        vanuText.setText(result.vs+"");
                                        sum=sum+result.vs;
                                        terranText.setText(result.tr+"");
                                        sum=sum+result.tr;
                                        naniteText.setText(result.ns+"");
                                        sum=sum+result.ns;
                                    }
                                    sumText.setText(sum+"");
                                }, Throwable::printStackTrace));
                        break;
                    case 4:
                        requestQueue.add(new JsonObjectRequest(Request.Method.GET, "https://ps2.fisu.pw/api/population/?world=17", null,
                                response -> {
                                    String jsonString = response.toString();
                                    Gson gson = new Gson();
                                    Integer sum = 0;
                                    APIClass data = gson.fromJson(jsonString, APIClass.class);
                                    for (APIClass.Result result : data.getResult()) {
                                        newText.setText(result.nc+"");
                                        sum=sum+result.nc;
                                        vanuText.setText(result.vs+"");
                                        sum=sum+result.vs;
                                        terranText.setText(result.tr+"");
                                        sum=sum+result.tr;
                                        naniteText.setText(result.ns+"");
                                        sum=sum+result.ns;
                                    }
                                    sumText.setText(sum+"");
                                }, Throwable::printStackTrace));
                        break;
                    case 5:
                        requestQueue.add(new JsonObjectRequest(Request.Method.GET, "https://ps2.fisu.pw/api/population/?world=19", null,
                                response -> {
                                    String jsonString = response.toString();
                                    Gson gson = new Gson();
                                    Integer sum = 0;
                                    APIClass data = gson.fromJson(jsonString, APIClass.class);
                                    for (APIClass.Result result : data.getResult()) {
                                        newText.setText(result.nc+"");
                                        sum=sum+result.nc;
                                        vanuText.setText(result.vs+"");
                                        sum=sum+result.vs;
                                        terranText.setText(result.tr+"");
                                        sum=sum+result.tr;
                                        naniteText.setText(result.ns+"");
                                        sum=sum+result.ns;
                                    }
                                    sumText.setText(sum+"");
                                }, Throwable::printStackTrace));
                        break;
                    case 6:
                        requestQueue.add(new JsonObjectRequest(Request.Method.GET, "https://ps2.fisu.pw/api/population/?world=40", null,
                                response -> {
                                    String jsonString = response.toString();
                                    Gson gson = new Gson();
                                    Integer sum = 0;
                                    APIClass data = gson.fromJson(jsonString, APIClass.class);
                                    for (APIClass.Result result : data.getResult()) {
                                        newText.setText(result.nc+"");
                                        sum=sum+result.nc;
                                        vanuText.setText(result.vs+"");
                                        sum=sum+result.vs;
                                        terranText.setText(result.tr+"");
                                        sum=sum+result.tr;
                                        naniteText.setText(result.ns+"");
                                        sum=sum+result.ns;
                                    }
                                    sumText.setText(sum+"");
                                }, Throwable::printStackTrace));
                        break;
                    default:
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}