import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class djt
  implements HostnameVerifier
{
  public static final djt a = new djt();
  private static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
  
  public static List a(X509Certificate paramX509Certificate)
  {
    List localList = a(paramX509Certificate, 7);
    paramX509Certificate = a(paramX509Certificate, 2);
    ArrayList localArrayList = new ArrayList(localList.size() + paramX509Certificate.size());
    localArrayList.addAll(localList);
    localArrayList.addAll(paramX509Certificate);
    return localArrayList;
  }
  
  private static List a(X509Certificate paramX509Certificate, int paramInt)
  {
    localArrayList = new ArrayList();
    try
    {
      paramX509Certificate = paramX509Certificate.getSubjectAlternativeNames();
      if (paramX509Certificate != null) {
        break label23;
      }
      paramX509Certificate = Collections.emptyList();
    }
    catch (CertificateParsingException paramX509Certificate)
    {
      for (;;)
      {
        paramX509Certificate = Collections.emptyList();
        continue;
        paramX509Certificate = localArrayList;
      }
    }
    return paramX509Certificate;
    label23:
    paramX509Certificate = paramX509Certificate.iterator();
    while (paramX509Certificate.hasNext())
    {
      Object localObject = (List)paramX509Certificate.next();
      if ((localObject != null) && (((List)localObject).size() >= 2))
      {
        Integer localInteger = (Integer)((List)localObject).get(0);
        if ((localInteger != null) && (localInteger.intValue() == paramInt))
        {
          localObject = (String)((List)localObject).get(1);
          if (localObject != null) {
            localArrayList.add(localObject);
          }
        }
      }
    }
  }
  
  private static boolean a(String paramString1, String paramString2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString1 != null)
    {
      bool1 = bool2;
      if (paramString1.length() != 0)
      {
        bool1 = bool2;
        if (!paramString1.startsWith("."))
        {
          if (!paramString1.endsWith("..")) {
            break label51;
          }
          bool1 = bool2;
        }
      }
    }
    for (;;)
    {
      return bool1;
      label51:
      bool1 = bool2;
      if (paramString2 != null)
      {
        bool1 = bool2;
        if (paramString2.length() != 0)
        {
          bool1 = bool2;
          if (!paramString2.startsWith("."))
          {
            bool1 = bool2;
            if (!paramString2.endsWith(".."))
            {
              String str = paramString1;
              if (!paramString1.endsWith(".")) {
                str = paramString1 + '.';
              }
              paramString1 = paramString2;
              if (!paramString2.endsWith(".")) {
                paramString1 = paramString2 + '.';
              }
              paramString1 = paramString1.toLowerCase(Locale.US);
              if (!paramString1.contains("*"))
              {
                bool1 = str.equals(paramString1);
              }
              else
              {
                bool1 = bool2;
                if (paramString1.startsWith("*."))
                {
                  bool1 = bool2;
                  if (paramString1.indexOf('*', 1) == -1)
                  {
                    bool1 = bool2;
                    if (str.length() >= paramString1.length())
                    {
                      bool1 = bool2;
                      if (!"*.".equals(paramString1))
                      {
                        paramString1 = paramString1.substring(1);
                        bool1 = bool2;
                        if (str.endsWith(paramString1))
                        {
                          int i = str.length() - paramString1.length();
                          if (i > 0)
                          {
                            bool1 = bool2;
                            if (str.lastIndexOf('.', i - 1) != -1) {}
                          }
                          else
                          {
                            bool1 = true;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    boolean bool2 = false;
    boolean bool1;
    for (;;)
    {
      try
      {
        paramSSLSession = (X509Certificate)paramSSLSession.getPeerCertificates()[0];
        if (!b.matcher(paramString).matches()) {
          continue;
        }
        paramSSLSession = a(paramSSLSession, 7);
        j = paramSSLSession.size();
        i = 0;
        bool1 = bool2;
        if (i < j)
        {
          if (!paramString.equalsIgnoreCase((String)paramSSLSession.get(i))) {
            continue;
          }
          bool1 = true;
        }
      }
      catch (SSLException paramString)
      {
        int j;
        int i;
        label78:
        String str;
        int k;
        djs localdjs;
        label218:
        bool1 = bool2;
        continue;
        if (localdjs.g[localdjs.c] != '"') {
          continue;
        }
        localdjs.c += 1;
        if ((localdjs.c >= localdjs.b) || (localdjs.g[localdjs.c] != ' ')) {
          continue;
        }
        localdjs.c += 1;
        continue;
        if (localdjs.g[localdjs.c] != '\\') {
          continue;
        }
        localdjs.g[localdjs.e] = localdjs.d();
        localdjs.c += 1;
        localdjs.e += 1;
        continue;
        localdjs.g[localdjs.e] = localdjs.g[localdjs.c];
        continue;
        paramString = new String(localdjs.g, localdjs.d, localdjs.e - localdjs.d);
        continue;
        paramString = localdjs.b();
        continue;
        if ((localdjs.g[localdjs.c] == ',') || (localdjs.g[localdjs.c] == ';') || (localdjs.g[localdjs.c] == '+')) {
          continue;
        }
        paramString = new java/lang/IllegalStateException;
        paramSSLSession = new java/lang/StringBuilder;
        paramSSLSession.<init>("Malformed DN: ");
        paramString.<init>(localdjs.a);
        throw paramString;
        localdjs.c += 1;
        paramSSLSession = localdjs.a();
        if (paramSSLSession != null) {
          continue;
        }
        paramString = new java/lang/IllegalStateException;
        paramSSLSession = new java/lang/StringBuilder;
        paramSSLSession.<init>("Malformed DN: ");
        paramString.<init>(localdjs.a);
        throw paramString;
      }
      return bool1;
      i++;
      continue;
      str = paramString.toLowerCase(Locale.US);
      paramString = a(paramSSLSession, 2);
      k = paramString.size();
      j = 0;
      i = 0;
      if (j < k)
      {
        if (a(str, (String)paramString.get(j)))
        {
          bool1 = true;
        }
        else
        {
          j++;
          i = 1;
        }
      }
      else
      {
        if (i != 0) {
          break label710;
        }
        paramString = paramSSLSession.getSubjectX500Principal();
        localdjs = new djs;
        localdjs.<init>(paramString);
        localdjs.c = 0;
        localdjs.d = 0;
        localdjs.e = 0;
        localdjs.f = 0;
        localdjs.g = localdjs.a.toCharArray();
        paramSSLSession = localdjs.a();
        if (paramSSLSession != null) {
          break label716;
        }
        paramString = null;
        if (paramString == null) {
          break label710;
        }
        bool1 = a(str, paramString);
      }
    }
    label710:
    label716:
    for (;;)
    {
      paramString = "";
      if (localdjs.c == localdjs.b)
      {
        paramString = null;
        break label218;
      }
      switch (localdjs.g[localdjs.c])
      {
      default: 
        paramString = localdjs.c();
      case '+': 
      case ',': 
      case ';': 
        if ("cn".equalsIgnoreCase(paramSSLSession)) {
          break;
        }
        if (localdjs.c >= localdjs.b) {
          paramString = null;
        }
        break;
      case '"': 
        localdjs.c += 1;
        localdjs.d = localdjs.c;
        localdjs.e = localdjs.d;
        if (localdjs.c == localdjs.b)
        {
          paramString = new java/lang/IllegalStateException;
          paramSSLSession = new java/lang/StringBuilder;
          paramSSLSession.<init>("Unexpected end of DN: ");
          paramString.<init>(localdjs.a);
          throw paramString;
        }
      case '#': 
        bool1 = false;
        break label78;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */