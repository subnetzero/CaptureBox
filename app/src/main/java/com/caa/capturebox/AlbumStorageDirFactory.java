package com.caa.capturebox;

/**
 * Created by SCaliff on 11/5/2015.
 */
import android.util.Log;

import java.io.File;

abstract class AlbumStorageDirFactory {
    public abstract File getAlbumStorageDir(String albumName);

}
