package com.yokoro;

import com.yokoro.adapter.AdapterMain;
import com.yokoro.decorator.DecoratorMain;
import com.yokoro.facade.FacadeMain;

public class Main {

    public static void main(String[] args) {
        new DecoratorMain().show();
        new FacadeMain().show();
        new AdapterMain().show();
    }
}
