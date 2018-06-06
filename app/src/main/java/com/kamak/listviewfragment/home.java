package com.kamak.listviewfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class home extends Fragment {

    View view;
    int[] thumbs = {R.drawable.bali, R.drawable.paris, R.drawable.italia, R.drawable.london, R.drawable.india};
    String[] txtnm = {"Ronaldo", "Neymar", "Messi", "De Gea", "Buffon"};

    ListView lView;
    adapter adapter;
    public home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_home, container, false);
        lView = view.findViewById(R.id.listview);
        adapter = new adapter(getActivity(), txtnm, thumbs);
        lView.setAdapter(adapter);
        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), txtnm[i]+" Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

}
