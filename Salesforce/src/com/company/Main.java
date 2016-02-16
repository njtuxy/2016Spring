package com.company;
import  java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
//        CommandRunner.RunCommand("Dir");
        Dirs dirManager  = new Dirs();

        //Show current dir
        dirManager.dir();
        dirManager.mkdir(new Dir("sub6"));
        dirManager.mkdir(new Dir("sub3"));
        dirManager.mkdir(new Dir("sub4"));
        dirManager.dir();
        dirManager.mkdir(new Dir("sub4"));
        dirManager.cd("sub3");
        dirManager.cd("sub6");
        dirManager.cd("sub4");
        dirManager.dir();
        dirManager.cd("sub6");
        dirManager.mkdir(new Dir("sub666"));
        dirManager.dir();
        dirManager.up();
        dirManager.up();
        dirManager.dir();
        dirManager.up();


    }


}
