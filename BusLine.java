package com.example.vh.appbusstop;

import android.app.Activity;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class BusLine extends Activity {
    String[] myDataLinePor = new String[]{
            "ปอ.147", "ปอ.84", "ปอ.547", "ปอ.7", "ปอ.80", "ปอ.81",
    };

    String[] myDataLine1 = new String[]{
            "1", "11", "12", "13", "14", "15",
            "16", "17", "18", "101", "102", "104",
            "105", "107", "108", "109", "110", "111"
    };
    String[] myDataLine2 = new String[]{
            "2", "20", "201", "203", "204", "205", "206",
            "207",
    };
    String[] myDataLine3 = new String[]{
            "3", "30", "32", "33", "34", "35",
            "36", "37", "38", "39"
    };
    String[] myDataLine4 = new String[]{
            "4", "40", "42", "43", "44", "45",
            "46", "47", "48", "49"
    };
    String[] myDataLine5 = new String[]{
            "50", "51", "52", "53", "54", "56",
            "57", "58", "59", "501", "502", "504",
            "505", "507", "508", "509", "510"
    };
    String[] myDataLine6 = new String[]{
            "6", "60", "62", "63", "64", "65",
            "66", "67", "68", "69"
    };
    String[] myDataLine7 = new String[]{
            "7", "70", "71", "72", "73", "73ก",
            "74", "75", "77", "79", "710", "720",
            "751"
    };

    String[] myDataLine8 = new String[]{
            "8", "80", "80ก", "81", "82", "84",
            "84ก", "85", "89"
    };

    String[] myDataPrice = new String[]{
            "8 บาท", "80", "80ก", "81", "82", "84",
            "84ก", "85", "89"
    };
    String[] DataIn = new String[]{
            "มออ.", "สยาม", "big C", "big C", "big C", "big C", "big C", "big C"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_line);



        final ListView listview_show_line = (ListView) findViewById(R.id.listview_show_line);
        Button buttonPor = (Button) findViewById(R.id.btnLine_Por);
        Button button1 = (Button) findViewById(R.id.btnLine_1);
        Button button2 = (Button) findViewById(R.id.btnLine_2);
        Button button3 = (Button) findViewById(R.id.btnLine_3);
        Button button4 = (Button) findViewById(R.id.btnLine_4);
        Button button5 = (Button) findViewById(R.id.btnLine_5);
        Button button6 = (Button) findViewById(R.id.btnLine_6);
        Button button7 = (Button) findViewById(R.id.btnLine_7);
        Button button8 = (Button) findViewById(R.id.btnLine_8);
        final ImageView img_bus = (ImageView) findViewById(R.id.img_bus);
        final ListView listviewIn = (ListView) findViewById(R.id.listviewIn);


        //assert listview != null;
        listview_show_line.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //คลิกในlistview
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                String selectedBusline = (String) ((TextView) v).getText();

                final Dialog dialog = new Dialog(BusLine.this);
                dialog.setTitle("รายละเอียดรถเมล์");
               /* dialog.requestWindowFeature
                        (dialog.getWindow().FEATURE_NO_TITLE); */  // ไรไม่รุลืม

                dialog.setContentView(R.layout.activity_dialog_data);
                TextView txtBusname = (TextView) dialog.findViewById(R.id.txtBusname);
                txtBusname.setText("ชื่อสาย : " + selectedBusline);

                TextView txtPrice = (TextView) dialog.findViewById(R.id.txtPrice);
                txtPrice.setText("อัตราค่าโดยสาร : " + "12" + " บาท");
                //img_bus.set

                /*ListView listViewIn = (ListView) dialog.findViewById(R.id.listviewIn);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(BusLine.this, R.layout.listview_textview, in
                );

                listViewIn.setAdapter(adapter); */
                Button btnIn = (Button) findViewById(R.id.btnIn);



                btnIn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(BusLine.this,android.R.layout.simple_list_item_1,DataIn );

                        listviewIn.setAdapter(adapter);




                    }
                });

                dialog.show();


                Toast.makeText(getApplicationContext(),
                        "รถเมล์สาย" + selectedBusline, Toast.LENGTH_SHORT).show();

            }
        });
        buttonPor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(BusLine.this, R.layout.listview_textview, myDataLinePor);

                listview_show_line.setAdapter(adapter);

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(BusLine.this, R.layout.listview_textview, myDataLine1);

                listview_show_line.setAdapter(adapter);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(BusLine.this, R.layout.listview_textview, myDataLine2);

                listview_show_line.setAdapter(adapter);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(BusLine.this, R.layout.listview_textview, myDataLine3);

                listview_show_line.setAdapter(adapter);

            }
        });


        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(BusLine.this, R.layout.listview_textview, myDataLine4);

                listview_show_line.setAdapter(adapter);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(BusLine.this, R.layout.listview_textview, myDataLine5);

                listview_show_line.setAdapter(adapter);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(BusLine.this, R.layout.listview_textview, myDataLine6);

                listview_show_line.setAdapter(adapter);

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(BusLine.this, R.layout.listview_textview, myDataLine7);

                listview_show_line.setAdapter(adapter);

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(BusLine.this, R.layout.listview_textview, myDataLine8);

                listview_show_line.setAdapter(adapter);

            }
        });


    }

}

