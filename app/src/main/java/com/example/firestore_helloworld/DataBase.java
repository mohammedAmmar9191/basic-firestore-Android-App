package com.example.firestore_helloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firestore_helloworld.databinding.FragmentFirstBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class DataBase {

    private String name;
    private int id;
     // empty constructor
    public DataBase (){
    }
    public DataBase( int id,String name){
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }
    public int getId(){
    return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id){
    this.id=id;
    }
/**
    private void addDataToFirestore(){
        DocumentReference docRef = FirebaseFirestore.getInstance().document("company1/cdpUnFAslPisrga2iDBi");
        String objectAd = "adam";
        Map<String, Object> saveData = new HashMap<String, Object>();
        saveData.put("data", objectAd);
        docRef.set(saveData);
    }*/
}
/** DocumentReference docRef = FirebaseFirestore.getInstance().document("company1/cdpUnFAslPisrga2iDBi");
 String objectAd = "kossak yabnel 3ars";
 Map<String, Object> saveData = new HashMap<String, Object>();
 saveData.put("data", objectAd);
 docRef.set(saveData).addOnSuccessListener(new OnSuccessListener<Void>() {
@Override
public void onSuccess(Void unused) {
Log.d("savequote", "text has been saved!");
}
}).addOnFailureListener(new OnFailureListener(){
@Override
public void onFailure(@NonNull Exception e){
Log.w(" savequote", "text is failed", e);
}
});
 }*/