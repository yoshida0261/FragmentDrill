package com.starcompany.fragmentdrill;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ImageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ImageFragment extends Fragment {


    private static final String ARG_PARAM_RESOURCE_ID = "resource_id";
    private int mResourceId;

    public ImageFragment() {
        // Required empty public constructor
    }

    public static ImageFragment newInstance(int resourceId) {
        ImageFragment fragment = new ImageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM_RESOURCE_ID, resourceId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mResourceId = getArguments().getInt(ARG_PARAM_RESOURCE_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_image, container, false);

        ImageView imageView = (ImageView)rootView.findViewById(R.id.image_view);
        imageView.setImageResource(mResourceId);

        return rootView;
    }

}
