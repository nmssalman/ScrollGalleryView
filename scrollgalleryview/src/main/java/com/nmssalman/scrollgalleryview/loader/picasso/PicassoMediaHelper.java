package com.nmssalman.scrollgalleryview.loader.picasso;

import com.nmssalman.scrollgalleryview.scrollgalleryview.MediaInfo;
import com.nmssalman.scrollgalleryview.scrollgalleryview.builder.BasicMediaHelper;
import com.nmssalman.scrollgalleryview.scrollgalleryview.loader.MediaLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PicassoMediaHelper extends BasicMediaHelper {
    @Override
    public MediaInfo image(String url) {
        return mediaInfo(url);
    }

    @Override
    public List<MediaInfo> images(List<String> urls) {
        List<MediaInfo> medias = new ArrayList<>();

        for (String url : urls) {
            medias.add(mediaInfo(url));
        }

        return medias;
    }

    @Override
    public List<MediaInfo> images(String... urls) {
        return images(Arrays.asList(urls));
    }

    private MediaInfo mediaInfo(String url) {
        return MediaInfo.mediaLoader((MediaLoader) new PicassoImageLoader(url));
    }
}
