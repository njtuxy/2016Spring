package com.company;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by yanxia on 2/12/16.
 */
public class Dir {
    TreeSet<Dir> subDirs = new TreeSet<Dir>(new DirComparator());
    ArrayList<String> dirName = new ArrayList<String>();

    String name;

    public Dir(String name){
        this.name = name;
    }

    public void addSubDir(Dir subDir){
        subDirs.add(subDir);
        dirName.add(subDir.name);
    }

    public void removeDir(Dir subDir){
        subDirs.remove(subDir);
        dirName.remove(subDir.name);
    }

    public boolean  subDirExists(String dirNameToBeFound){
        return dirName.contains(dirNameToBeFound);
    }

    public String name(){
        return this.name;
    }

    public Dir[] showSubDirs(){
        return subDirs.toArray(new Dir[subDirs.size()]);
    }

    public Dir findSubDirByName(String dirName){
        for( Dir d:subDirs){
            if (d.name.equals(dirName)) {
                return d;
            }
        }
    return null;
    }


}

class DirComparator implements Comparator<Dir>{
    @Override
    public int compare(Dir d1, Dir d2){
        if(d1.name.compareTo(d2.name) > 0){
            return 1;
        }else{
            return -1;
        }
    }

}

