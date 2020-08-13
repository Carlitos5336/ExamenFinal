package com.example.examenfinal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String nombre[] = {"Peras", "Mangos"};
    int cantidad[] = {3, 1};
    int precio[] = {50, 25};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.lista);

        MyAdapter adapter = new MyAdapter(this, nombre, cantidad, precio);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(MainActivity.this, "Peras", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String nom[];
        int cant[];
        int p[];
        MyAdapter(Context c, String noms[], int cants[], int ps[])
        {
            super(c, R.layout.liststyle, R.id.nombre, noms);
            this.context = c;
            this.nom = noms;
            this.cant = cants;
            this.p = ps;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater li = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = li.inflate(R.layout.liststyle, parent, false);
            TextView tnombre = row.findViewById(R.id.nombre);
            TextView tcant = row.findViewById(R.id.cantidad);
            CheckBox check = row.findViewById(R.id.check);
            TextView tp = row.findViewById(R.id.precio);
            tnombre.setText(nom[position]);
            tcant.setText(cant[position]);
            tp.setText(p[position]);

            return row;
        }
    }

}
