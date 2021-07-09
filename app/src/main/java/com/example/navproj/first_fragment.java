package com.example.navproj;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link first_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class first_fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public first_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment first_fragment.
     */
    // TODO: Rename and change types and number of parameters
    private static first_fragment newInstance(String param1, String param2) {
        first_fragment fragment = new first_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // TODO: Rename and change types of parameters
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_first_fragment, container, false);
        final EditText title = view.findViewById(R.id.bookTitle);
        final EditText author = view.findViewById(R.id.bookAuthor);
        final EditText publication = view.findViewById(R.id.publication);
        Button submit = view.findViewById(R.id.submitButton);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book.getInstance(title.getText().toString(), author.getText().toString(), publication.getText().toString());
                Navigation.findNavController(view).navigate(R.id.action_first_fragment_to_second_fragment2);
            }
        });
        return view;
    }
}
