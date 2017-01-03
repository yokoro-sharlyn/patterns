package com.yokoro;

import com.yokoro.decorator.DecoratorMain;
import com.yokoro.facade.FacadeMain;

public class Main {

    public static void main(String[] args) {
	// write your code here

        new DecoratorMain().show();
        new FacadeMain().show();
    }
}
