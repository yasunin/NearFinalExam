package yasunin.kirk.nearfinalexamination.frangment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import yasunin.kirk.nearfinalexamination.MainActivity;
import yasunin.kirk.nearfinalexamination.R;

/**
 * Created by fany on 2/27/2018.
 */

public class Calculatefragment extends Fragment {
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //        Crete Toobar
        Toolbar toolbar = getView().findViewById(R.id.toobarCalculate);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        //        Exchang
        Button button = getView().findViewById(R.id.btnExchang);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = getView().findViewById(R.id.edtmoney);
                String moneyString = editText.getText().toString().trim();

                if (moneyString.isEmpty()) {
                    Toast.makeText(getActivity(), "Please Fill USD money", Toast.LENGTH_SHORT).show();
                }else{

                    double moneyAdouble = Double.parseDouble(moneyString);
                    double answerAdouble = moneyAdouble * 33;
                    String answerString  = Double.toString(answerAdouble);

                    Toast.makeText(getActivity(),"Your"+moneyString+"USD===>"+answerString+"THB",
                            Toast.LENGTH_SHORT).show();
                    editText.setText("");
                }
            }
        });

    } //Main Method

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate,container,false);
        return view;
    }
}
