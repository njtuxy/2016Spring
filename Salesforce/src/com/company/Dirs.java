package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;
/**
 * Created by yanxia on 2/12/16.
 */

public class Dirs {

    ArrayList<Dir> dirs = new ArrayList<Dir>();

    public Dir[] dir(){
        System.out.println("Command: dir");
        if(dirs.size() == 0){
            System.out.println("Directory of root:");
            return new Dir[]{new Dir("Root")};
        }else{
//            Return the last element of the list, which is the current directory.
            for(Dir d:dirs){
                System.out.println(d.name);
            }
            Dir d = dirs.get(dirs.size()-1);
            System.out.println("Directory of: " + d.name);

            Dir[] ds = d.showSubDirs();

            if(ds.length == 0){
                System.out.println("No subdirectories");
            }else{
                for(Dir e:ds){
                    System.out.print(e.name);
                    System.out.print("      ");
                }
            }
            System.out.println();
            return dirs.get(dirs.size()-1).showSubDirs();
        }

    }

    public void mkdir(Dir dir){
        System.out.println("Command: mkdir      " + dir.name);

        if(dirs.size() == 0 ){
            dirs.add(new Dir("Root"));
        }
        Dir t = dirs.get(dirs.size()-1);
        if (t.subDirExists(dir.name)) {
                System.out.println("Subdirectory already exists");
        }else{
            t.addSubDir(dir);
        }

    }

    public void cd(String dirName){
        if(dirs.size() == 0 ){
            dirs.add(new Dir("Root"));
        }

        Dir t = dirs.get(dirs.size()-1);
        if(t.subDirExists(dirName)){
            dirs.add(t.findSubDirByName(dirName));
        }else{
            System.out.println("Subdirectory does not exists");
        }
    }

    public void up(){
        System.out.println("Command: up      ");

        if(dirs.size() == 0 ){
            dirs.add(new Dir("Root"));
        }

        Dir t = dirs.get(dirs.size()-1);
        if(t.name!="Root"){
            dirs.remove(dirs.size()-1);
        }else{
            System.out.println("Cannot move up from root directory");
        }

    }



}
