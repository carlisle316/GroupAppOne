package com.gabe.android.aca.groupappone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView NameInput;
    TextView Address1Input;
    TextView Address2Input;
    TextView PhoneNumberInput;
    TextView EmailInput;
    Button ListButton;
    TextView ListViewInput;
    Button EmailButton;
    Button MapsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NameInput = (TextView) findViewById(R.id.Ename);
        Address1Input = (TextView) findViewById(R.id.Eaddress1);
        Address2Input = (TextView) findViewById(R.id.Eaddress2);
        PhoneNumberInput = (TextView) findViewById(R.id.Ephone);
        EmailInput = (TextView) findViewById(R.id.Email);
        ListButton = (Button) findViewById(R.id.ListButton);
        ListViewInput = (TextView) findViewById(R.id.List);
        EmailButton = (Button) findViewById(R.id.GEmail);
        MapsButton = (Button) findViewById(R.id.Glocation);


        ListButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String Name;
                String Address1;
                String Address2;
                String PhoneNumber;
                String Email;


                Name = NameInput.getText().toString();
                Address1 = Address1Input.getText().toString();
                Address2 = Address2Input.getText().toString();
                PhoneNumber = PhoneNumberInput.getText().toString();
                Email = EmailInput.getText().toString();

                ListViewInput.setText("Name:" + Name + "\n" + "Address1:" + Address1 + "\n" + "Address2:" + Address2 + "\n" + "PhoneNumber:" + PhoneNumber + "\n" + "Email:" + Email + "\n");

            }
        });

        EmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/test");
                startActivity(Intent.createChooser(intent,""));
            }
        });
        MapsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}








