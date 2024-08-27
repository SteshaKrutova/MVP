package com.geekbrains.presener;

import com.geekbrains.model.Familytree.HumanService;
import com.geekbrains.view.View;

public class Presenter {
    private View view;
    private HumanService service;

    public Presenter(View view) {
        this.view = view;
        service = new HumanService;
    }
}
