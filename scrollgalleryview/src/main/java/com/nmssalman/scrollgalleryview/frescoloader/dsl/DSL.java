package com.nmssalman.scrollgalleryview.frescoloader.dsl;

import com.nmssalman.scrollgalleryview.frescoloader.FrescoMediaHelper;
import com.nmssalman.scrollgalleryview.scrollgalleryview.MediaInfo;

import java.util.List;

public class DSL {
    private static FrescoMediaHelper mediaHelper = new FrescoMediaHelper();

    public static MediaInfo image(String url) {
        return mediaHelper.image(url);
    }

    public static List<MediaInfo> images(List<String> urls) {
        return mediaHelper.images(urls);
    }

    public static List<MediaInfo> images(String... urls) {
        return mediaHelper.images(urls);
    }

    public static MediaInfo video(String url, int placeholderViewId) {
        return mediaHelper.video(url, placeholderViewId);
    }
}
