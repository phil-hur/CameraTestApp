package com.phur.cameratestapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewFragment extends Fragment implements View.OnClickListener {
    public static NewFragment newInstance() {
        NewFragment fragment = new NewFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_new, container, false);

        Button b = (Button) v.findViewById(R.id.button_openpage);
        b.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_openpage:
                String urlAsString = "http://www.udacity.com";
                openWebPage(urlAsString);
                break;
        }
    }


    public void openWebPage (String url) {
        // TODO (2) Use Uri.parse to parse the String into a Uri
        Uri webpage = Uri.parse(url);
        // TODO (3) Create an Intent with Intent.ACTION_VIEW and the webpage Uri as parameters
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        // TODO (4) Verify that this Intent can be launched and then call startActivity
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivity(intent);
        }


    }

}






