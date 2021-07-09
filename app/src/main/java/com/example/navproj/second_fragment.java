package com.example.navproj;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link second_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class second_fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public second_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment second_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static second_fragment newInstance(String param1, String param2) {
        second_fragment fragment = new second_fragment();
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
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second_fragment, container, false);
        TextView title = view.findViewById(R.id.bookTitleDetails);
        TextView author = view.findViewById(R.id.bookAuthorDetails);
        TextView publication = view.findViewById(R.id.publicationDetails);


        title.setText("Book Title: " + Book.getInstance().getTitle());
        author.setText("Author: " + Book.getInstance().getAuthor());
        publication.setText("Publication: " + Book.getInstance().getPublication());
        return view;
        }
    }

