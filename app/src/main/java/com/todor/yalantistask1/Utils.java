package com.todor.yalantistask1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.util.ArrayList;
import java.util.List;

public final class Utils {

    public static List<String> getImageFromNetwork() {
        List<String> imageUrl = new ArrayList<>();
        imageUrl.add("https://files3.adme.ru/files/news/part_105/1051910/1957210-R3L8T8D-1000-5_1.jpg");
        imageUrl.add("https://files1.adme.ru/files/news/part_105/1051910/1962310-R3L8T8D-1000-pollok_za_rabotoy.jpg");
        imageUrl.add("https://files6.adme.ru/files/news/part_105/1051910/1960610-R3L8T8D-1000-collage22.jpg");
        imageUrl.add("https://files3.adme.ru/files/news/part_105/1051910/1961660-R3L8T8D-1000-duchamp-fountain.jpg");
        imageUrl.add("https://files1.adme.ru/files/news/part_105/1051910/2049160-R3L8T8D-1000-20090517010837The_Persistence_of_Memory.jpg");
        imageUrl.add("https://files1.adme.ru/files/news/part_105/1051910/2049560-R3L8T8D-1000-Jacek_Yerka_01.jpg");
        imageUrl.add("https://files7.adme.ru/files/news/part_105/1051910/1963460-R3L8T8D-1000-virtoofoto_hiper.jpg");
        imageUrl.add("https://files1.adme.ru/files/news/part_105/1051910/1963560-R3L8T8D-1000-collage333.jpg");
        imageUrl.add("https://files4.adme.ru/files/news/part_105/1051910/2052510-R3L8T8D-1000-collage67677.jpg");
        imageUrl.add("https://files6.adme.ru/files/news/part_105/1051910/1969010-R3L8T8D-1000-collage44.jpg");
        imageUrl.add("https://files8.adme.ru/files/news/part_105/1051910/1970310-R3L8T8D-1000-collage55.jpg");
        imageUrl.add("https://files2.adme.ru/files/news/part_105/1051910/1970410-R3L8T8D-1000-Knigi.jpg");
        imageUrl.add("https://files6.adme.ru/files/news/part_105/1051910/1972210-R3L8T8D-1000-collage555.jpg");
        imageUrl.add("https://files6.adme.ru/files/news/part_105/1051910/1975960-R3L8T8D-1000-virtoofoto_ha.jpg");
        imageUrl.add("https://files7.adme.ru/files/news/part_105/1051910/1973860-R3L8T8D-1000-in-orbit-installation-tom-s-saraceno-5.jpg");
        imageUrl.add("https://files1.adme.ru/files/news/part_105/1051910/1975560-R3L8T8D-1000-collage666.jpg"); //[Comment] Looks like hardcode. You can put strings into res directory
        return imageUrl;
    }

    public static int[] getImageFromDrawable() {
        return new int[]{R.drawable.image1,R.drawable.image2,R.drawable.image3,
                R.drawable.image3,R.drawable.image4, R.drawable.image5, R.drawable.image6,
                R.drawable.image7, R.drawable.image8};
    }

    public static boolean isOn(Context context) { //[Comment] isOnline will be more informative
        ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        return (networkInfo != null && networkInfo.isConnected());
    }

}
