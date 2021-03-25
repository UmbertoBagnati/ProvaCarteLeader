package org.example;
import java.util.ArrayList;
import java.util.List;

public class Depo {
    private String[] scaffale1;
    private String[] scaffale2;
    private String[] scaffale3;
    private List<String[]> scaffaleExtra;

    public Depo() {
        scaffale1 = new String[1];
        scaffale2 = new String[2];
        scaffale3 = new String[3];
        scaffaleExtra = new ArrayList<>();
        scaffaleExtra.add(new String[2]);
    }

    public void setScaffaleExtra(String param) {
        scaffaleExtra.get(0)[0]=param;
        scaffaleExtra.get(0)[1]=param;
        System.out.println(scaffaleExtra.get(0)[0]);
        System.out.println(scaffaleExtra.get(0)[1]);
    }
}
