package com.coayo.biblioteca;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by cice on 31/10/16.
 */

public class ImportBooks extends Activity{
    Button btnimportarbook;
    TextView dirhttp;
    TextView namebook;
    Context context;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Button ibtnmportarbook = (Button)findViewById(R.id.btnimportarbook);
        TextView dirhttp = (TextView)findViewById(R.id.txdirlibro);
        TextView namebook = (TextView)findViewById(R.id.txnamelibro);

        context = this;

        DataBaseModel mydb = new DataBaseModel(context);
        mydb.open();

        //preparacion: ruta,
        DownloadTask midescarga = new DownloadTask(context);

        String ruta = dirhttp.getText().toString() + namebook.getText().toString();
        // dialogo
        ProgressDialog mProgressDialog =new ProgressDialog(context);
        // sigo luego






    }


}
