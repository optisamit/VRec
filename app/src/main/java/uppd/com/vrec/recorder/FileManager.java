package uppd.com.vrec.recorder;

import android.content.Context;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

/**
 * Created by o.rabinovych on 12/4/17.
 */

public class FileManager {
    private static final DateFormat FILE_NAME_FORMAT = new SimpleDateFormat("yyyMMdd-HHmmss", Locale.US);
    private final Context context;

    @Inject
    public FileManager(Context context){
        this.context = context;
    }

    public File getNewFile() {
        return new File(context.getExternalFilesDir(null), FILE_NAME_FORMAT.format(new Date()) + ".aac");
    }
}
