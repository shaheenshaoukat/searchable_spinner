package com.example.searchable_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ArrayList<String> arrayList;
    Dialog dialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.fspinner);
        arrayList =new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("there");
        arrayList.add("four");
        arrayList.add("five");

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog=new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.searcahable_spinner_item);
                dialog.getWindow().setLayout(650,800);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
                dialog.show();

                EditText editText=dialog.findViewById(R.id.edit_text);
                ListView listView=dialog.findViewById(R.id.list_view);

                ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
                listView.setAdapter(adapter);
                editText.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        adapter.getFilter().filter(charSequence);

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                });
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        textView.setText(adapter.getItem(i));

                        dialog.dismiss();
                    }
                });


            }
        });

    }
}


//
//        toarrayList = new ArrayList<>();
//        toarrayList.add("Albanian");
//        toarrayList.add("Arabic");
//        toarrayList.add("Belarusian");
//        toarrayList.add("Bangali");
//        toarrayList.add("Chinese");
//        toarrayList.add("Croatian");
//        toarrayList.add("Danish");
//        toarrayList.add("Dutch");
//        toarrayList.add("English");
//        toarrayList.add("Estonian");
//        toarrayList.add("Filipino");
//        toarrayList.add("Finnish");
//        toarrayList.add("French");
//        toarrayList.add("Galician");
//        toarrayList.add("Georgian");
//        toarrayList.add("German");
//        toarrayList.add("Greek");
//        toarrayList.add("Haitian Creole");
//
//        toarrayList.add("Hindi");
//        toarrayList.add("Hungarian");
//        toarrayList.add("Icelandic");
//        toarrayList.add("Indonesian");
//        toarrayList.add("Irish");
//        toarrayList.add("Italian");
//        toarrayList.add("Japanese");
//        toarrayList.add("Korean");
//        toarrayList.add("Latvian");
//        toarrayList.add("Lithuanian");
//        toarrayList.add("Macedonian");
//        toarrayList.add("Malay");
//        toarrayList.add("Maltese");
//        toarrayList.add("Norwegian");
//        toarrayList.add("Persian");
//        toarrayList.add("Polish");
//        toarrayList.add("Portuguese");
//        toarrayList.add("Romanian");
//        toarrayList.add("Russian");
//        toarrayList.add("Slovak");
//        toarrayList.add("Slovenian");
//        toarrayList.add("Spanish");
//        toarrayList.add("Swahili");
//        toarrayList.add("Swedish");
//        toarrayList.add("Thai");
//        toarrayList.add("Turkish");
//        toarrayList.add("Ukrainian");
//        toarrayList.add("Urdu");
//        toarrayList.add("Vietnamese");
//        toarrayList.add("Welsh");
//
//        tospinner.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                todialog = new Dialog(home.this);
//                todialog.setContentView(R.layout.spinner_item);
//                todialog.getWindow().setLayout(650, 800);
//                todialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
//                todialog.show();
//
//                EditText editText = todialog.findViewById(R.id.edit_text);
//                ListView tolistView = todialog.findViewById(R.id.list_view);
//
//                ArrayAdapter<String> adapter = new ArrayAdapter<>(home.this, android.R.layout.simple_list_item_1, arrayList);
//                tolistView.setAdapter(adapter);
//                editText.addTextChangedListener(new TextWatcher() {
//                    @Override
//                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                    }
//
//                    @Override
//                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                        adapter.getFilter().filter(charSequence);
//
//                    }
//
//                    @Override
//                    public void afterTextChanged(Editable editable) {
//
//                    }
//                });
//                tolistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                        tospinner.setText(adapter.getItem(i));
//
//                        todialog.dismiss();
//                        tolanguagecode = getlanguagecode(toarrayList.get(i));
//
//
//                    }
//                });
//
//
//            }
//        });
//
//
//        arrayList = new ArrayList<>();
//        arrayList.add("Albanian");
//        arrayList.add("Arabic");
//        arrayList.add("Belarusian");
//        arrayList.add("Bangali");
//        arrayList.add("Chinese");
//        arrayList.add("Croatian");
//        arrayList.add("Danish");
//        arrayList.add("Dutch");
//        arrayList.add("English");
//        arrayList.add("Estonian");
//        arrayList.add("Filipino");
//        arrayList.add("Finnish");
//        arrayList.add("French");
//        arrayList.add("Galician");
//        arrayList.add("Georgian");
//        arrayList.add("German");
//        arrayList.add("Greek");
//        arrayList.add("Haitian Creole");
//        arrayList.add("Hindi");
//        arrayList.add("Hungarian");
//        arrayList.add("Icelandic");
//        arrayList.add("Indonesian");
//        arrayList.add("Irish");
//        arrayList.add("Italian");
//        arrayList.add("Japanese");
//        arrayList.add("Korean");
//        arrayList.add("Latvian");
//        arrayList.add("Lithuanian");
//        arrayList.add("Macedonian");
//        arrayList.add("Malay");
//        arrayList.add("Maltese");
//        arrayList.add("Norwegian");
//        arrayList.add("Persian");
//        arrayList.add("Polish");
//        arrayList.add("Portuguese");
//        arrayList.add("Romanian");
//        arrayList.add("Russian");
//        arrayList.add("Slovak");
//        arrayList.add("Slovenian");
//        arrayList.add("Spanish");
//        arrayList.add("Swahili");
//        arrayList.add("Swedish");
//        arrayList.add("Thai");
//        arrayList.add("Turkish");
//        arrayList.add("Ukrainian");
//        arrayList.add("Urdu");
//        arrayList.add("Vietnamese");
//        arrayList.add("Welsh");
//
//        fromspinner.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                dialog = new Dialog(home.this);
//                dialog.setContentView(R.layout.spinner_item);
//                dialog.getWindow().setLayout(650, 800);
//                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
//                dialog.show();
//
//                EditText editText = dialog.findViewById(R.id.edit_text);
//                ListView listView = dialog.findViewById(R.id.list_view);
//
//                ArrayAdapter<String> adapter = new ArrayAdapter<>(home.this, android.R.layout.simple_list_item_1, arrayList);
//                listView.setAdapter(adapter);
//                editText.addTextChangedListener(new TextWatcher() {
//                    @Override
//                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                    }
//
//                    @Override
//                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                        adapter.getFilter().filter(charSequence);
//
//                    }
//
//                    @Override
//                    public void afterTextChanged(Editable editable) {
//
//                    }
//                });
//                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                        fromspinner.setText(adapter.getItem(i));
//                        dialog.dismiss();
//                        fromlanguagecode = getlanguagecode(arrayList.get(i));
//
//
//                    }
//                });
//
//
//
//            }
//        });
