import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class dfq
{
  private static final char[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
  final String a;
  private final String c;
  private final String d;
  private final String e;
  private final int f;
  private final List g;
  private final String h;
  
  dfq(dfr paramdfr)
  {
    this.a = paramdfr.a;
    this.c = c(paramdfr.b);
    this.d = c(paramdfr.c);
    this.e = paramdfr.d;
    this.f = paramdfr.a();
    a(paramdfr.f);
    if (paramdfr.g != null) {}
    for (List localList = a(paramdfr.g);; localList = null)
    {
      this.g = localList;
      if (paramdfr.h != null) {
        c(paramdfr.h);
      }
      this.h = paramdfr.toString();
      return;
    }
  }
  
  static int a(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9')) {
      paramChar -= 48;
    }
    for (;;)
    {
      return paramChar;
      if ((paramChar >= 'a') && (paramChar <= 'f')) {
        paramChar = paramChar - 'a' + 10;
      } else if ((paramChar >= 'A') && (paramChar <= 'F')) {
        paramChar = paramChar - 'A' + 10;
      } else {
        paramChar = '￿';
      }
    }
  }
  
  public static int a(String paramString)
  {
    int i;
    if (paramString.equals("http")) {
      i = 80;
    }
    for (;;)
    {
      return i;
      if (paramString.equals("https")) {
        i = 443;
      } else {
        i = -1;
      }
    }
  }
  
  public static dfq a(URL paramURL)
  {
    String str2 = paramURL.toString();
    dfr localdfr = new dfr();
    int i = str2.length();
    int j = 0;
    label84:
    label92:
    int k;
    if (j < i) {
      switch (str2.charAt(j))
      {
      default: 
        i = str2.length() - 1;
        if (i >= j) {
          switch (str2.charAt(i))
          {
          default: 
            k = i + 1;
            label162:
            if (k - j >= 2)
            {
              i = str2.charAt(j);
              if (((i < 97) || (i > 122)) && ((i < 65) || (i > 90)))
              {
                i = -1;
                label210:
                if (i == -1) {
                  break label443;
                }
                if (!str2.regionMatches(true, j, "https:", 0, 6)) {
                  break label410;
                }
                localdfr.a = "https";
              }
            }
            break;
          }
        }
        break;
      }
    }
    int m;
    int n;
    for (i = j + 6;; i = j + 5)
    {
      m = 0;
      for (j = i; j < k; j++)
      {
        n = str2.charAt(j);
        if ((n != 92) && (n != 47)) {
          break;
        }
        m++;
      }
      j++;
      break;
      j = i;
      break label84;
      i--;
      break label92;
      k = j;
      break label162;
      for (i = j + 1;; i++)
      {
        if (i >= k) {
          break label404;
        }
        m = str2.charAt(i);
        if (((m < 97) || (m > 122)) && ((m < 65) || (m > 90)) && (m != 43) && (m != 45) && (m != 46))
        {
          if (m == 58) {
            break;
          }
          i = -1;
          break;
        }
      }
      label404:
      i = -1;
      break label210;
      label410:
      if (!str2.regionMatches(true, j, "http:", 0, 5)) {
        break label439;
      }
      localdfr.a = "http";
    }
    label439:
    paramURL = null;
    label441:
    label443:
    int i1;
    for (;;)
    {
      return paramURL;
      paramURL = null;
      continue;
      m = i + m;
      i = 0;
      j = 0;
      i1 = b(str2, m, k, "@/\\?#");
      if (i1 != k) {}
      for (n = str2.charAt(i1);; n = -1) {
        switch (n)
        {
        default: 
          break;
        case -1: 
        case 35: 
        case 47: 
        case 63: 
        case 92: 
          i = dfr.b(str2, m, i1);
          if (i + 1 >= i1) {
            break label800;
          }
          localdfr.d = dfr.c(str2, m, i);
          localdfr.e = dfr.d(str2, i + 1, i1);
          if (localdfr.e != -1) {
            break label823;
          }
          paramURL = null;
          break label441;
        }
      }
      if (i == 0)
      {
        n = b(str2, m, i1, ":");
        String str1 = a(str2, m, n, " \"':;<=>@[]^`{}|/\\?#", true, false);
        paramURL = str1;
        if (j != 0) {
          paramURL = localdfr.b + "%40" + str1;
        }
        localdfr.b = paramURL;
        if (n != i1)
        {
          i = 1;
          localdfr.c = a(str2, n + 1, i1, " \"':;<=>@[]\\^`{}|/\\?#", true, false);
        }
        m = 1;
        j = i;
        i = m;
      }
      for (;;)
      {
        n = j;
        j = i;
        m = i1 + 1;
        i = n;
        break;
        localdfr.c = (localdfr.c + "%40" + a(str2, m, i1, " \"':;<=>@[]\\^`{}|/\\?#", true, false));
        m = i;
        i = j;
        j = m;
      }
      label800:
      localdfr.d = dfr.c(str2, m, i);
      localdfr.e = a(localdfr.a);
      label823:
      if (localdfr.d != null) {
        break;
      }
      paramURL = null;
    }
    i = a(str2, i1, k, "?#");
    localdfr.a(str2, i1, i);
    if ((i < k) && (str2.charAt(i) == '?'))
    {
      j = a(str2, i, k, "#");
      localdfr.g = b(a(str2, i + 1, j, " \"'<>#", true, true));
      i = j;
    }
    for (;;)
    {
      if ((i < k) && (str2.charAt(i) == '#')) {
        localdfr.h = a(str2, i + 1, k, "", true, false);
      }
      if (localdfr.a == null) {
        throw new IllegalStateException("scheme == null");
      }
      if (localdfr.d == null) {
        throw new IllegalStateException("host == null");
      }
      paramURL = new dfq(localdfr);
      break;
    }
  }
  
  static String a(String paramString, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    djz localdjz;
    if (i < paramInt2) {
      if (paramString.charAt(i) == '%')
      {
        localdjz = new djz();
        localdjz.a(paramString, paramInt1, i);
        paramInt1 = i;
        if (paramInt1 < paramInt2)
        {
          i = paramString.codePointAt(paramInt1);
          if ((i == 37) && (paramInt1 + 2 < paramInt2))
          {
            int j = a(paramString.charAt(paramInt1 + 1));
            int k = a(paramString.charAt(paramInt1 + 2));
            if ((j != -1) && (k != -1))
            {
              localdjz.b((j << 4) + k);
              paramInt1 += 2;
            }
          }
          for (;;)
          {
            paramInt1 += Character.charCount(i);
            break;
            localdjz.a(i);
          }
        }
      }
    }
    for (paramString = localdjz.n();; paramString = paramString.substring(paramInt1, paramInt2))
    {
      return paramString;
      i++;
      break;
    }
  }
  
  static String a(String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = paramInt1;
    int j;
    djz localdjz;
    if (i < paramInt2)
    {
      j = paramString1.codePointAt(i);
      if ((j < 32) || (j >= 127) || (paramString2.indexOf(j) != -1) || ((j == 37) && (!paramBoolean1)) || ((paramBoolean2) && (j == 43)))
      {
        localdjz = new djz();
        localdjz.a(paramString1, paramInt1, i);
        paramInt1 = i;
        Object localObject1 = null;
        if (paramInt1 < paramInt2)
        {
          j = paramString1.codePointAt(paramInt1);
          Object localObject3;
          Object localObject2;
          if (paramBoolean1)
          {
            localObject3 = localObject1;
            if (j != 9)
            {
              localObject3 = localObject1;
              if (j != 10)
              {
                localObject3 = localObject1;
                if (j != 12)
                {
                  localObject3 = localObject1;
                  if (j == 13) {}
                }
              }
            }
          }
          else
          {
            if ((!paramBoolean2) || (j != 43)) {
              break label206;
            }
            if (!paramBoolean1) {
              break label199;
            }
            localObject2 = "%20";
            label172:
            localdjz.a((String)localObject2);
            localObject3 = localObject1;
          }
          for (;;)
          {
            paramInt1 = Character.charCount(j) + paramInt1;
            localObject1 = localObject3;
            break;
            label199:
            localObject2 = "%2B";
            break label172;
            label206:
            if ((j < 32) || (j >= 127) || (paramString2.indexOf(j) != -1) || ((j == 37) && (!paramBoolean1)))
            {
              localObject2 = localObject1;
              if (localObject1 == null) {
                localObject2 = new djz();
              }
              ((djz)localObject2).a(j);
              for (;;)
              {
                localObject3 = localObject2;
                if (((djz)localObject2).e()) {
                  break;
                }
                i = ((djz)localObject2).g() & 0xFF;
                localdjz.b(37);
                localdjz.b(b[(i >> 4 & 0xF)]);
                localdjz.b(b[(i & 0xF)]);
              }
            }
            localdjz.a(j);
            localObject3 = localObject1;
          }
        }
      }
    }
    for (paramString1 = localdjz.n();; paramString1 = paramString1.substring(paramInt1, paramInt2))
    {
      return paramString1;
      i += Character.charCount(j);
      break;
    }
  }
  
  private static List a(List paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      if (paramList != null) {}
      for (paramList = c(paramList);; paramList = null)
      {
        localArrayList.add(paramList);
        break;
      }
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  static void a(StringBuilder paramStringBuilder, List paramList)
  {
    int j = paramList.size();
    for (int i = 0; i < j; i++)
    {
      paramStringBuilder.append('/');
      paramStringBuilder.append((String)paramList.get(i));
    }
  }
  
  private static int b(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    for (;;)
    {
      int i = paramInt2;
      if (paramInt1 < paramInt2)
      {
        if (paramString2.indexOf(paramString1.charAt(paramInt1)) != -1) {
          i = paramInt1;
        }
      }
      else {
        return i;
      }
      paramInt1++;
    }
  }
  
  static List b(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i <= paramString.length())
    {
      int k = paramString.indexOf('&', i);
      int j = k;
      if (k == -1) {
        j = paramString.length();
      }
      k = paramString.indexOf('=', i);
      if ((k == -1) || (k > j))
      {
        localArrayList.add(paramString.substring(i, j));
        localArrayList.add(null);
      }
      for (;;)
      {
        i = j + 1;
        break;
        localArrayList.add(paramString.substring(i, k));
        localArrayList.add(paramString.substring(k + 1, j));
      }
    }
    return localArrayList;
  }
  
  static void b(StringBuilder paramStringBuilder, List paramList)
  {
    int j = paramList.size();
    for (int i = 0; i < j; i += 2)
    {
      String str2 = (String)paramList.get(i);
      String str1 = (String)paramList.get(i + 1);
      if (i > 0) {
        paramStringBuilder.append('&');
      }
      paramStringBuilder.append(str2);
      if (str1 != null)
      {
        paramStringBuilder.append('=');
        paramStringBuilder.append(str1);
      }
    }
  }
  
  private static String c(String paramString)
  {
    return a(paramString, 0, paramString.length());
  }
  
  public final URL a()
  {
    try
    {
      URL localURL = new URL(this.h);
      return localURL;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      throw new RuntimeException(localMalformedURLException);
    }
  }
  
  public final URI b()
  {
    try
    {
      URI localURI = new URI(this.h);
      return localURI;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      throw new IllegalStateException("not valid as a java.net.URI: " + this.h);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (((paramObject instanceof dfq)) && (((dfq)paramObject).h.equals(this.h))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final int hashCode()
  {
    return this.h.hashCode();
  }
  
  public final String toString()
  {
    return this.h;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */