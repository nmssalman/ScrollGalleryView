# ScrollGalleryView

[![Build Status](https://travis-ci.org/VEINHORN/ScrollGalleryView.svg?branch=master)](https://travis-ci.org/VEINHORN/ScrollGalleryView)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ScrollGalleryView-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/2472)
[![Join the chat at https://gitter.im/VEINHORN/ScrollGalleryView](https://badges.gitter.im/VEINHORN/ScrollGalleryView.svg)](https://gitter.im/VEINHORN/ScrollGalleryView?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

ScrollGalleryView is a flexible library which helps you to create awesome media galleries in your Android application. It's easily integrated with the most popular image loading libraries such as Picasso, Glide and Fresco.


## Key features

- Easy way to select images in gallery (thumbnails)
- Zooming
- Simple API
- Video

## Installing


```gradle
allprojects {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add dependency to your module `build.gradle`:

```gradle
implementation 'implementation 'com.github.nmssalman:ScrollGalleryView:2.0'
```

### MediaLoaders

There are several MediaLoaders implementations for most popular caching libraries: Picasso, Glide, Fresco.

 
## Usage

Add *ScrollGalleryView* to your layout:

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <com.github.nmssalman.scrollgalleryview.ScrollGalleryView
        android:id="@+id/scroll_gallery_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#000"/>
</LinearLayout>
```

Initialize *ScrollGalleryView* in your activity:

```java
import static com.github.nmssalman.scrollgalleryview.loader.picasso.dsl.DSL.*; // simplifies adding media

public class MainActivity extends FragmentActivity {
    private ScrollGalleryView galleryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        galleryView = ScrollGalleryView
                .from((ScrollGalleryView) findViewById(R.id.scroll_gallery_view))
                .settings(
                        GallerySettings
                                .from(getSupportFragmentManager())
                                .thumbnailSize(100)
                                .enableZoom(true)
                                .build()
                )
                .add(image("http://pirate-islands.com/wp-content/uploads/2018/07/07_Dom-Fernando-II_01-636x310.jpg"))
                .add(image("http://povodu.ru/wp-content/uploads/2016/04/pochemu-korabl-derzitsa-na-vode.jpg"))
                .add(video("http://www.sample-videos.com/video/mp4/720/big_buck_bunny_720p_1mb.mp4", R.mipmap.default_video))
                .build();
    }
}
```

If you use *ScrollGalleryView* version prior `1.2.0` or need more info about gallery initialization you can find it [here](docs/init-gallery.md).

### Adding media

ScrollGalleryView supports different types of media such as images and videos. You can create image gallery, video gallery, or mix them in any way. To abstract from concreate way of image loading ScrollGalleryView uses [MediaLoader](library/src/main/java/com/veinhorn/scrollgalleryview/loader/MediaLoader.java) so it makes possible to use different image loading libraries depending on your needs (Picasso, Glide, Fresco).

#### **Picasso** loader

#### Default image loader

Library is also contains default image loader but it's not optimized for performance.

> Note: it's highly recommended to use custom image loader against default

### Configuration

You can specify a bunch of additional settings during gallery initialization.

|Option|Method|Description|
|------|------|-----------|
| Thumbnail size | `.setThumbnailSize(200)` | You can configure thumbnails size in |
| Zoom | `.setZoom(true)` | Enable zoom |
| Hide thumbnails | `.withHiddenThumbnails(false)` | Hide scroll view container with thumbnails on the bottom of screen |
| Hide thumbnails on click | `.hideThumbnailsOnClick(true)` | Hide scroll view container with thumbnails when you click on main image area |

### Adding listeners

*ScrollGalleryView* supports adding listeners for events like: image click, long image click, changed page. More details you can find in [separate doc](docs/event-listeners.md).

## Sample application

The sample application published on Google Play.

[![Get it on Google Play](http://www.android.com/images/brand/get_it_on_play_logo_small.png)](https://play.google.com/store/apps/details?id=com.veinhorn.scrollgalleryview)

## License
    
    Copyright (c) 2024 Mohamed Salman
    nmssalman@outlook.com
     















