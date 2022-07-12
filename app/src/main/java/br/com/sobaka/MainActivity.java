package br.com.sobaka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    ImageView botao_activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //aqui a mágica
        setContentView(R.layout.activity_main);

    }
        public void proximaTela(View view){

            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
    }



