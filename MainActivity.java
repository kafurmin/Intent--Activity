package com.example.kif.kyrsu_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  //Простой адаптер
/*        ArrayList<HashMap<String,String>> students = new ArrayList<>();

        for (int i =0; i<50; i++){
        HashMap<String,String> student = new HashMap<>();
        student.put("FirstName","Ivan"+i);
        student.put("LastName","Ivanov"+i);
        student.put("Age", String.valueOf(20+i));
        students.add(student);}


        SimpleAdapter adapter = new SimpleAdapter(
                this,
                students,
                R.layout.student,
                new String[]{"FirstName","LastName","Age"},
                new int[]{R.id.textViewFirstName, R.id.textViewLastName, R.id.textViewAge}
        );
        ListView listView =(ListView)findViewById(R.id.mylistview);
        listView.setAdapter(adapter);*/


        // Array adapter
/*        String[] arr = new String[]{"q","w","e","r","t","y","u","i","o","p"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                arr
        );

        ListView listView =(ListView)findViewById(R.id.mylistview);
        listView.setAdapter(adapter);
*/
/*        Stud[] arr = new Stud[]{
                new Stud ("Ivan","Ivanov",20),
                new Stud ("Ivan","Ivanov",21),
                new Stud ("Ivan","Ivanov",24),
                new Stud ("Ivan","Ivanov",25),
        };

        ArrayAdapter<Stud> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                arr
        );

        ListView listView =(ListView)findViewById(R.id.mylistview);
        listView.setAdapter(adapter);
*/
/*        final List<Stud> arr = new ArrayList<>();


        arr.add(new Stud("Ivan","Ivanoc",22));
        arr.add(new Stud("Ivan","Ivanoc",22));
        arr.add(new Stud("Ivan","Ivanoc",22));
        arr.add(new Stud("Ivan","Ivanoc",22));
        arr.add(new Stud("Ivan","Ivanoc",22));

        StudentAdapter adapter = new StudentAdapter(
                this,
                R.layout.student,
                arr
        );

        ListView listView =(ListView)findViewById(R.id.mylistview);
        listView.setAdapter(adapter);*/
/*
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Stud stud = arr.get(i);
               Toast.makeText(MainActivity.this, "click" +i, Toast.LENGTH_SHORT).show();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                return false;
            }
        });
*/
  /*      adapter.setStudListener(new StudentAdapter.StudListener() {
            @Override
            public void onDelete(Stud stud) {
                Toast.makeText(MainActivity.this, "Delete"+ stud.toString(), Toast.LENGTH_SHORT).show();
            }
        });
*/


        String[] arr = new String []{"q","w","e","r","t","y","u","i","o","p"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_single_choice,
                android.R.id.text1,
                arr);

        final ListView listView =(ListView)findViewById(R.id.mylistview);
        listView.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
        listView.setAdapter(adapter);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = listView.getCheckedItemPosition();
                Toast.makeText(MainActivity.this, String.valueOf(position),Toast.LENGTH_SHORT).show();
            }
        });


    }
}
