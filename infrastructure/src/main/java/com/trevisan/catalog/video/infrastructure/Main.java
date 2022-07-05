package com.trevisan.catalog.video.infrastructure;

import com.trevisan.catalog.video.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}