package com.example.luisfernandomedinallorenti.loginmvp.interfaces;

public interface LoginView {
    void showProgress();
    void hideProgress();
    void accessSuccesful();
    void accessDenied();
}
