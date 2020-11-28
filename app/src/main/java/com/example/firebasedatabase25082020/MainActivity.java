package com.example.firebasedatabase25082020;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 : Luu du lieu dang chuoi
//        myRef
//            .child("Trung tam")
//            .setValue("Khoa Pham")
//            .addOnCompleteListener(new OnCompleteListener<Void>() {
//                @Override
//                public void onComplete(@NonNull Task<Void> task) {
//                    if (task.isSuccessful()){
//                        Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                    }else{
//                        Toast.makeText(MainActivity.this, "That bai", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//        // 2 : Luu du lieu dang Object
//        Phuongtien phuongtien = new Phuongtien("Xe dap", 2);
//        myRef
//            .child("Phuong tien")
//            .setValue(phuongtien)
//            .addOnCompleteListener(new OnCompleteListener<Void>() {
//                @Override
//                public void onComplete(@NonNull Task<Void> task) {
//                    if (task.isSuccessful()){
//                        Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                    }else{
//                        Toast.makeText(MainActivity.this, "That bai", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });

        // 3 : Luu du lieu dang Map

//        HashMap<String,String> hashMap = new HashMap<>();
//        hashMap.put("Khu vuc","Quan 1");
//        myRef.child("Dia diem").setValue(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, "That bai", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        // 4 : Luu tru danh danh sach
//        ArrayList<Sinhvien> sinhviens = new ArrayList<>();
//        sinhviens.add();
//        sinhviens.add(new Sinhvien("Nguyen Van B", 20));
//        sinhviens.add(new Sinhvien("Nguyen Van C", 21));
//        sinhviens.add(new Sinhvien("Nguyen Van D", 22));
//        sinhviens.add(new Sinhvien("Nguyen Van E", 23));

        myRef
                .child("Sinhvien")
                .push()
                .setValue(new Sinhvien("Nguyen Van C", 21))
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "That bai", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}