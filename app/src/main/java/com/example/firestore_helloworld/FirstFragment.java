package com.example.firestore_helloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.firestore_helloworld.databinding.FragmentFirstBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    private FirebaseDatabase rootNode;
    private DatabaseReference reference;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    //CollectionReference cities = db.collection("cities");

    Map<String, Object> user = new HashMap<>();

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       DocumentReference skRef = FirebaseFirestore.getInstance().document("company1/company3");
        String objectABd = "kossak ";
        Map<String, Object> saveData9 = new HashMap<String, Object>();
        saveData9.put("bio", objectABd);
        skRef.set(saveData9);

        DocumentReference sssRef = FirebaseFirestore.getInstance().document("company1/company2");
        String objectAAd = "kossak hhhhh";
        Map<String, Object> saveData12 = new HashMap<String, Object>();
        saveData12.put("ön", objectAAd);
        sssRef.set(saveData12);
        DocumentReference co1Ref = FirebaseFirestore.getInstance().document("company1/company1");
        String objectA1d = "kossak  ya coco";
        Map<String, Object> saveCompany1 = new HashMap<String, Object>();
        saveCompany1.put("bnb", objectA1d);
        co1Ref.set(saveCompany1);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
              /**  rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("company1");
                reference.setValue("a7a");
                System.out.println(reference);*/
                Toast.makeText(view.getContext(),"success",Toast.LENGTH_LONG).show();
            }
        });
    }

   /** private void addDataToFirestore(String name,int id){
        CollectionReference comRef = db.collection("companies/company1");
        // adding our data to our courses object class.
        Map<String, Object> address = new HashMap<String, Object>();
        address.put("data", "MArburger STRASSE");
        comRef.add(address);
    }*/

   /** private void addDataToFirestore(){
        DocumentReference docRef = FirebaseFirestore.getInstance().document("company1/cdpUnFAslPisrga2iDBi");
        String objectAd = "ghzs";
        Map<String, Object> saveData = new HashMap<String, Object>();
        saveData.put("data", objectAd);
        docRef.set(saveData);
     }
*/

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}