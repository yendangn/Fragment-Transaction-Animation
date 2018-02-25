package yendangn.com.fragmenttransactionanimation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);


        ImageView imgIcon = view.findViewById(R.id.imgIcon);
        imgIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragmentTwo();
            }
        });

        return view;
    }


    private void showFragmentTwo() {

        Fragment fragmentTwo = new FragmentTwo();

        getActivity().getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
                .replace(R.id.container, fragmentTwo)
                .addToBackStack("FragmentTwo")
                .commit();

    }

}
