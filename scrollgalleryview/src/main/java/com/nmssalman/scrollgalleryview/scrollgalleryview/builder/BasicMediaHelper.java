package com.nmssalman.scrollgalleryview.scrollgalleryview.builder;

import com.nmssalman.scrollgalleryview.scrollgalleryview.MediaInfo;
import com.nmssalman.scrollgalleryview.scrollgalleryview.loader.DefaultVideoLoader;

import java.util.List;

/**
 * Basic implementation of MediaHelper which supports adding video
 */
public abstract class BasicMediaHelper implements MediaHelper {
    @Override
    public MediaInfo video(String url, int placeholderViewId) {
        return MediaInfo.mediaLoader(new DefaultVideoLoader(url, placeholderViewId));
    }

    public abstract MediaInfo image(String url);

    public abstract List<MediaInfo> images(List<String> urls);

    public abstract List<MediaInfo> images(String... urls);
}
