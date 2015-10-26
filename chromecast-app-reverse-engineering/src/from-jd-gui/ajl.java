import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

final class ajl
  implements FilenameFilter
{
  public final boolean accept(File paramFile, String paramString)
  {
    return Pattern.matches("cpu[0-9]+", paramString);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ajl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */