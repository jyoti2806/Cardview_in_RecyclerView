package com.example.user.myhome;

import java.util.ArrayList;

/**
 * Created by USER on 13/11/2017.
 */

public class ListItem {
    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }

    String description;
    int imageId;


    public static ArrayList<ListItem> getData() {

        ArrayList<ListItem> dataList = new ArrayList<>();

        int[] images = getImages();

        for (int i = 0; i < images.length; i++) {

            ListItem listItem = new ListItem();
            listItem.setImageId(images[i]);
            listItem.setDescription("Landscape " + i);

            dataList.add(listItem);
        }

        return dataList;
    }
    private static int[] getImages() {
        int[] images = {R.drawable.vedic1,R.drawable.vedic2,R.drawable.vedic3,R.drawable.vedic4,R.drawable.vedic5};
        return images;
    }
}
