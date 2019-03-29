package com.example.luisfernandomedinallorenti.loginmvp.interactors;

import android.os.Handler;

import com.example.luisfernandomedinallorenti.loginmvp.Listeners.OnLoginFinishedListener;
import com.example.luisfernandomedinallorenti.loginmvp.interfaces.LoginInteractor;


public class LoginInteractorImpl implements LoginInteractor{
    @Override
    public void validateCredentials(final OnLoginFinishedListener listener, final String username, final String password) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if ((username.length()>0)&&(password.length()>0)){
                    listener.onSuccess();
                }else {
                    listener.onError();
                }
            }
        },3000);
    }
}
