import android.graphics.Point;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bks
{
  private static final Pattern a = Pattern.compile("[swh]\\d+");
  private static final bkv b = bkv.a("-").a();
  private static final bkv c = bkv.a("=").a();
  private static final bkv d = bkv.a("/").a();
  private static final bku e = new bku("/");
  private static final Pattern f = Pattern.compile("^((http(s)?):)?\\/\\/((((lh[3-6](-tt|-d[a-g,z])?\\.((ggpht)|(googleusercontent)|(google)))|(ci[3-6]\\.((ggpht)|(googleusercontent)|(google)))|((cp|gp)[3-6]\\.((ggpht)|(googleusercontent)|(google)))|([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))\\.com)|(dp[3-6]\\.googleusercontent\\.cn)|((dev|dev2|dev3|qa|qa2|qa3|qa-red|qa-blue|canary)[-.]lighthouse\\.sandbox\\.google\\.com/image)|(www\\.google\\.com\\/visualsearch\\/lh))\\/");
  
  public static String a(int paramInt1, int paramInt2, String paramString)
  {
    int i = 1;
    if (paramString == null) {
      localObject1 = null;
    }
    do
    {
      return (String)localObject1;
      localObject1 = paramString;
    } while (!a(paramString));
    Object localObject2 = b(paramString);
    Object localObject1 = new Point();
    label73:
    label78:
    Object localObject3;
    if (paramInt2 == 0)
    {
      ((Point)localObject1).x = paramInt1;
      if ((((Point)localObject2).x > 0) && (((Point)localObject2).y > 0))
      {
        paramInt1 = ((Point)localObject2).y * paramInt1 / ((Point)localObject2).x;
        ((Point)localObject1).y = paramInt1;
        paramString = Uri.parse(paramString);
        localObject2 = a(d.a(paramString.getPath()));
        paramInt2 = ((List)localObject2).size();
        paramInt1 = paramInt2;
        if (a((List)localObject2)) {
          paramInt1 = paramInt2 - 1;
        }
        if ((paramInt1 < 4) || (paramInt1 > 6)) {
          break label459;
        }
        localObject3 = paramString.getPath();
        localObject2 = a(d.a((CharSequence)localObject3));
        if ((((List)localObject2).size() <= 0) || (!((String)((List)localObject2).get(0)).equals("image"))) {
          break label580;
        }
        ((List)localObject2).remove(0);
      }
    }
    label232:
    label332:
    label446:
    label459:
    label580:
    for (paramInt1 = i;; paramInt1 = 0)
    {
      if (((String)localObject3).endsWith("/")) {
        ((List)localObject2).add("");
      }
      if (((List)localObject2).size() == 4)
      {
        ((List)localObject2).add("");
        localObject3 = new StringBuilder();
        a((Point)localObject1, (StringBuilder)localObject3);
        a((String)((List)localObject2).get(4), (StringBuilder)localObject3);
        ((List)localObject2).set(4, ((StringBuilder)localObject3).toString());
        if (paramInt1 != 0) {
          ((List)localObject2).add(0, "image");
        }
        localObject1 = paramString.buildUpon();
        paramString = String.valueOf(e.a(new StringBuilder(), (Iterable)localObject2).toString());
        if (paramString.length() == 0) {
          break label446;
        }
        paramString = "/".concat(paramString);
        paramString = ((Uri.Builder)localObject1).path(paramString).build();
      }
      for (;;)
      {
        localObject1 = Uri.decode(paramString.toString());
        break;
        paramInt1 = 0;
        break label73;
        if (paramInt1 == 0)
        {
          if ((((Point)localObject2).x > 0) && (((Point)localObject2).y > 0)) {}
          for (paramInt1 = ((Point)localObject2).x * paramInt2 / ((Point)localObject2).y;; paramInt1 = 0)
          {
            ((Point)localObject1).x = paramInt1;
            ((Point)localObject1).y = paramInt2;
            break;
          }
        }
        ((Point)localObject1).x = paramInt1;
        ((Point)localObject1).y = paramInt2;
        break label78;
        if (((List)localObject2).size() != 5) {
          break label232;
        }
        ((List)localObject2).add(4, "");
        break label232;
        paramString = new String("/");
        break label332;
        if (paramInt1 == 1)
        {
          String str = paramString.getPath();
          localObject3 = new StringBuilder();
          paramInt1 = str.indexOf("=");
          if (paramInt1 >= 0)
          {
            localObject2 = str.substring(0, paramInt1);
            str = str.substring(paramInt1 + 1);
            ((StringBuilder)localObject3).append((String)localObject2).append("=");
            a((Point)localObject1, (StringBuilder)localObject3);
            a(str, (StringBuilder)localObject3);
          }
          for (;;)
          {
            paramString = paramString.buildUpon().path(((StringBuilder)localObject3).toString()).build();
            break;
            ((StringBuilder)localObject3).append(str).append("=");
            a((Point)localObject1, (StringBuilder)localObject3);
          }
        }
      }
    }
  }
  
  private static ArrayList a(Iterable paramIterable)
  {
    if ((paramIterable instanceof Collection))
    {
      paramIterable = new ArrayList((Collection)paramIterable);
      return paramIterable;
    }
    Iterator localIterator = paramIterable.iterator();
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      paramIterable = localArrayList;
      if (!localIterator.hasNext()) {
        break;
      }
      localArrayList.add(localIterator.next());
    }
  }
  
  private static void a(Point paramPoint, StringBuilder paramStringBuilder)
  {
    if (paramPoint.x > 0) {
      paramStringBuilder.append("w").append(paramPoint.x);
    }
    if (paramPoint.y > 0)
    {
      if (paramStringBuilder.length() > 0) {
        paramStringBuilder.append("-");
      }
      paramStringBuilder.append("h").append(paramPoint.y);
    }
  }
  
  private static void a(String paramString, StringBuilder paramStringBuilder)
  {
    paramString = b.a(paramString).iterator();
    while (paramString.hasNext())
    {
      String str = (String)paramString.next();
      if (!a.matcher(str).find()) {
        paramStringBuilder.append("-").append(str);
      }
    }
  }
  
  private static boolean a(String paramString)
  {
    if (paramString == null) {}
    for (boolean bool = false;; bool = f.matcher(paramString).find()) {
      return bool;
    }
  }
  
  private static boolean a(List paramList)
  {
    if ((paramList.size() > 1) && ((((String)paramList.get(0)).equals("image")) || (((String)paramList.get(0)).equals("public")) || (((String)paramList.get(0)).equals("proxy")) || (((String)paramList.get(0)).equals("private")))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static Point b(String paramString)
  {
    Point localPoint = new Point();
    if ((paramString == null) || (!a(paramString))) {}
    for (;;)
    {
      return localPoint;
      Object localObject = Uri.parse(paramString);
      paramString = a(d.a(((Uri)localObject).getPath()));
      int j = paramString.size();
      int i = j;
      if (a(paramString)) {
        i = j - 1;
      }
      if ((i >= 4) && (i <= 6))
      {
        localObject = ((Uri)localObject).getPath();
        paramString = a(d.a((CharSequence)localObject));
        if ((paramString.size() > 0) && (((String)paramString.get(0)).equals("image"))) {
          paramString.remove(0);
        }
        j = paramString.size();
        if ((!((String)localObject).endsWith("/")) && (j == 5))
        {
          i = 1;
          label150:
          if (j != 4) {
            break label194;
          }
          j = 1;
          label159:
          if ((i != 0) || (j != 0)) {
            break label200;
          }
          paramString = (String)paramString.get(4);
        }
      }
      for (;;)
      {
        if (!TextUtils.isEmpty(paramString)) {
          break label261;
        }
        break;
        i = 0;
        break label150;
        label194:
        j = 0;
        break label159;
        label200:
        paramString = "";
        continue;
        if (i == 1)
        {
          paramString = a(c.a(((Uri)localObject).getPath()));
          if (paramString.size() > 1) {
            paramString = (String)paramString.get(1);
          } else {
            paramString = "";
          }
        }
        else
        {
          paramString = "";
        }
      }
      label261:
      paramString = paramString.split("-");
      i = 0;
      for (;;)
      {
        if (i < paramString.length)
        {
          localObject = paramString[i];
          try
          {
            if (((String)localObject).startsWith("w")) {
              localPoint.x = Integer.parseInt(((String)localObject).substring(1));
            }
            for (;;)
            {
              i++;
              break;
              if (((String)localObject).startsWith("h")) {
                localPoint.y = Integer.parseInt(((String)localObject).substring(1));
              }
            }
          }
          catch (NumberFormatException localNumberFormatException)
          {
            for (;;) {}
          }
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */