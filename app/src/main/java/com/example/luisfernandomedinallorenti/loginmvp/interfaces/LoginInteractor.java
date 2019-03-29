package com.example.luisfernandomedinallorenti.loginmvp.interfaces;

import com.example.luisfernandomedinallorenti.loginmvp.Listeners.OnLoginFinishedListener;

public interface LoginInteractor {
    void validateCredentials(OnLoginFinishedListener listener,String username, String password);
}
