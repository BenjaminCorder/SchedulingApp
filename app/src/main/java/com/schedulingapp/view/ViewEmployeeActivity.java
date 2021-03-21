package com.schedulingapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.schedulingapp.R;

import java.util.ArrayList;

public class ViewEmployeeActivity extends AppCompatActivity {

    //declare variables
    ListView listView;
    ArrayList arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_employee);

        //get listview obj from xml file
        listView = (ListView) findViewById(R.id.list);

        //connect the employee list
        //arrayList = (ArrayList) findViewById(R.id.........

        //create array adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arrayList);
        //set adapter
        listView.setAdapter(arrayAdapter);

        //if we wanted to make employees clickable
        //listView.setOnClickListener(new AdapterView.OnClickListener(){
        //    @Override
        //    public void onItemClick(AdapterView<?> parent, View view, int position,
        //                            long id){
        //        Log.i("User clicked ", classes.get(position));
         //   }
        //});
    }

}