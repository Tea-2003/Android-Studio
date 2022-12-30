package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTraiCay;
    Button btnthem;
    EditText edttraicay;
    ArrayList<TraiCay> arrayTraiCay;
    TraicayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        adapter= new TraicayAdapter(this,R.layout.activity_traicay_adapter,arrayTraiCay);
        lvTraiCay.setAdapter(adapter);
    }
    private void AnhXa(){
        lvTraiCay= (ListView) findViewById(R.id.listviewTraiCay);
        btnthem= (Button) findViewById (R.id.buttonThem);
        edttraicay= (EditText) findViewById(R.id.editTextTraiCay);

        lvTraiCay=(ListView) findViewById(R.id.listviewTraiCay);
        arrayTraiCay=new ArrayList<>();

        arrayTraiCay.add(new TraiCay("Dâu Tây","Dâu Tây Đà Lạt", R.drawable.img));
        arrayTraiCay.add(new TraiCay("Dừa sáp","Đặc sản Bến Tre",R.drawable.img_1));
        arrayTraiCay.add(new TraiCay("Chuối","Chuối tiêu Hưng Yên ",R.drawable.img_2));
        arrayTraiCay.add(new TraiCay("Dưa hấu","Dưa hấu có hạt",R.drawable.img_3));
        arrayTraiCay.add(new TraiCay("Dưa lưới","Dưa lưới Đà Lạt",R.drawable.img_4));
        arrayTraiCay.add(new TraiCay("Cam","Cam Tây Ninh",R.drawable.img_5));
        arrayTraiCay.add(new TraiCay("Táo đỏ","Táo Hải Phòng",R.drawable.img_6));
        arrayTraiCay.add(new TraiCay("Táo xanh","Táo Hải Phòng",R.drawable.img_7));
        arrayTraiCay.add(new TraiCay("Măng Cụt","Măng Cụt Thanh Hóa", R.drawable.img_8));


        ArrayAdapter adapter= new ArrayAdapter(
                MainActivity.this, android.R.layout.activity_list_item, arrayTraiCay
        );
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Traicay= edttraicay.getText().toString();
                arrayTraiCay.add(new TraiCay("Thanh long","Thanh long Bình Thuận",R.drawable.img_9));
                adapter.notifyDataSetChanged();
            }
        });

    }

}