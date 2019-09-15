package springAop.object;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CustomFileFilter implements FilenameFilter {

    private String extension;

    public CustomFileFilter(String extension) {
        this.extension = extension;
    }

    @Override
    public boolean accept(File file, String name) {
        return name.toUpperCase().endsWith("." + extension.toUpperCase());
    }

}
