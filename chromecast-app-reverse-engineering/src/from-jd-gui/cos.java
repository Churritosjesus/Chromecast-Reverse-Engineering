import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class cos
  implements cpd
{
  private static final Uri a;
  private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");
  
  static
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("local");
    a = localBuilder.build();
  }
  
  public final Uri a()
  {
    return a;
  }
  
  public final void a(cou paramcou)
  {
    Object localObject = new ArrayList(paramcou.h.values());
    Collections.sort((List)localObject, new cot(this));
    paramcou = new StringBuilder();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = ((cov)localIterator.next()).toString();
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        if (paramcou.length() != 0) {
          paramcou.append(", ");
        }
        paramcou.append((String)localObject);
      }
    }
    this.b.println(paramcou.toString());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */