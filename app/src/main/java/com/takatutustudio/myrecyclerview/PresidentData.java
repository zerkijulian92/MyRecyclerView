package com.takatutustudio.myrecyclerview;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data = new String[][] {
            {"Soekarno", "Presiden Pertama RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/220px-Presiden_Sukarno.jpg"},
            {"Soeharto", "Presiden Kedua RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/President_Suharto%2C_1993.jpg/200px-President_Suharto%2C_1993.jpg"},
            {"Bacharuddin Jusuf Habibie", "Presiden Ketiga RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Foto_Presiden_Habibie_1998.jpg/220px-Foto_Presiden_Habibie_1998.jpg"},
            {"Abdurrahman Wahid", "Presiden Keempat RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg/220px-President_Abdurrahman_Wahid_-_Indonesia.jpg"},
            {"Megawati Soekarno Putri", "Presiden Kelima RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg/220px-President_Megawati_Sukarnoputri_-_Indonesia.jpg"},
            {"Susilo Bambang Yudhoyono", "Presiden Keenam RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Presiden_Susilo_Bambang_Yudhoyono.png/220px-Presiden_Susilo_Bambang_Yudhoyono.png"},
            {"Prabowo Subianto", "Presiden Ketujuh RI", "https://upload.wikimedia.org/wikipedia/commons/6/62/Prabowo_Subianto_portrait.jpg"}
    };

    public static ArrayList<President> getlistData(){
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for (String[] aData : data) {
            president = new President();
            president.setName(aData[0]);
            president.setRemarks(aData[1]);
            president.setPhoto(aData[2]);

            list.add(president);
        }

        return list;
    }
}
