package com.nmssalman.scrollgalleryview.glideimageloader.dsl;

import com.nmssalman.scrollgalleryview.scrollgalleryview.MediaInfo;

import java.util.List;

import com.nmssalman.scrollgalleryview.glideimageloader.GlideMediaHelper;

public class DSL {
    private static GlideMediaHelper mediaHelper = new GlideMediaHelper();

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
