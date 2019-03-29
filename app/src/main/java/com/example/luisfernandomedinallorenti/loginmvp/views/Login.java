package com.example.luisfernandomedinallorenti.loginmvp.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.luisfernandomedinallorenti.loginmvp.R;
import com.example.luisfernandomedinallorenti.loginmvp.interfaces.LoginPresenter;
import com.example.luisfernandomedinallorenti.loginmvp.interfaces.LoginView;
import com.example.luisfernandomedinallorenti.loginmvp.presenters.LoginPresenterImpl;

public class Login extends AppCompatActivity implements LoginView{
    private EditText username, password;
    private ProgressBar progressBar;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        progressBar=(ProgressBar) findViewById(R.id.progressbar);
        presenter=new LoginPresenterImpl(this);
    }
    public void login(View view){
        presenter.attempLogin(
                username.getText().toString(),
                password.getText().toString());
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void accessSuccesful() {
        Toast.makeText(this,"Acceso Permitido",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void accessDenied() {
        Toast.makeText(this,"Acceso Denegado",Toast.LENGTH_SHORT).show();
    }
}
