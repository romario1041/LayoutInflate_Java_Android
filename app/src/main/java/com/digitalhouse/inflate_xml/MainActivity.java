package com.digitalhouse.inflate_xml;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout) findViewById(R.id.linear);
        for(int i = 0; i<100; i++){
            //Cria-se o TextView inflando o arquivo de layout
            LayoutInflater inflater = LayoutInflater.from(this);
            /*Os parametros do "inflater" são os seguintes>
            1 - Resource: O Arquivo XML com o layout que precisa ser inflado. O retorno será o objeto View dese layout
            2 - Root: Layout "container" no qual a view será adicionada, logo, é preciso informar para a view
            conhecer o tamanho do layout-pai
            3 - AttachToRoot: Indica se a view deve ser adicionada no layout automaticamente.
            Deve-se informar "false" se chamar o método addView(view) manualmente, pra adicionar a view no layout
            */
            TextView text = (TextView) inflater.inflate(R.layout.inflate_textview, layout,false);
            text.setText("Hello o/ " + i);
            //Trabalhei com o tamanho da fonte pra gerar uma descontração, o resultado ficou ÉPICO HAHAHA
            text.setTextSize(i);
            layout.addView(text);
        }
    }
}
