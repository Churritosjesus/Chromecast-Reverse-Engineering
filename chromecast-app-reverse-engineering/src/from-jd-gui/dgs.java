import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class dgs
{
  public static final byte[] a = new byte[0];
  public static final String[] b = new String[0];
  public static final Charset c = Charset.forName("UTF-8");
  
  public static int a(String paramString)
  {
    int i;
    if ("http".equals(paramString)) {
      i = 80;
    }
    for (;;)
    {
      return i;
      if ("https".equals(paramString)) {
        i = 443;
      } else {
        i = -1;
      }
    }
  }
  
  private static int a(String paramString, int paramInt)
  {
    if (paramInt != -1) {}
    for (;;)
    {
      return paramInt;
      paramInt = a(paramString);
    }
  }
  
  public static int a(URI paramURI)
  {
    return a(paramURI.getScheme(), paramURI.getPort());
  }
  
  public static int a(URL paramURL)
  {
    return a(paramURL.getProtocol(), paramURL.getPort());
  }
  
  public static dke a(dke paramdke)
  {
    try
    {
      paramdke = dke.a(MessageDigest.getInstance("SHA-1").digest(paramdke.d()));
      return paramdke;
    }
    catch (NoSuchAlgorithmException paramdke)
    {
      throw new AssertionError(paramdke);
    }
  }
  
  public static List a(List paramList)
  {
    return Collections.unmodifiableList(new ArrayList(paramList));
  }
  
  public static List a(Object... paramVarArgs)
  {
    return Collections.unmodifiableList(Arrays.asList((Object[])paramVarArgs.clone()));
  }
  
  public static Map a(Map paramMap)
  {
    return Collections.unmodifiableMap(new LinkedHashMap(paramMap));
  }
  
  public static ThreadFactory a(String paramString, boolean paramBoolean)
  {
    return new dgt(paramString, true);
  }
  
  public static void a(long paramLong1, long paramLong2, long paramLong3)
  {
    if (((paramLong2 | paramLong3) < 0L) || (paramLong2 > paramLong1) || (paramLong1 - paramLong2 < paramLong3)) {
      throw new ArrayIndexOutOfBoundsException();
    }
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (RuntimeException paramCloseable)
    {
      throw paramCloseable;
    }
    catch (Exception paramCloseable)
    {
      for (;;) {}
    }
  }
  
  public static void a(Closeable paramCloseable1, Closeable paramCloseable2)
  {
    Object localObject = null;
    for (;;)
    {
      try
      {
        paramCloseable1.close();
        paramCloseable1 = (Closeable)localObject;
      }
      catch (Throwable paramCloseable1)
      {
        continue;
      }
      try
      {
        paramCloseable2.close();
        paramCloseable2 = paramCloseable1;
      }
      catch (Throwable localThrowable)
      {
        paramCloseable2 = paramCloseable1;
        if (paramCloseable1 != null) {
          continue;
        }
        paramCloseable2 = localThrowable;
        continue;
        if (!(paramCloseable2 instanceof IOException)) {
          continue;
        }
        throw ((IOException)paramCloseable2);
        if (!(paramCloseable2 instanceof RuntimeException)) {
          continue;
        }
        throw ((RuntimeException)paramCloseable2);
        if (!(paramCloseable2 instanceof Error)) {
          continue;
        }
        throw ((Error)paramCloseable2);
        throw new AssertionError(paramCloseable2);
      }
    }
    if (paramCloseable2 == null) {
      return;
    }
  }
  
  public static void a(Socket paramSocket)
  {
    if (paramSocket != null) {}
    try
    {
      paramSocket.close();
      return;
    }
    catch (RuntimeException paramSocket)
    {
      throw paramSocket;
    }
    catch (Exception paramSocket)
    {
      for (;;) {}
    }
  }
  
  public static boolean a(dkv paramdkv, int paramInt, TimeUnit paramTimeUnit)
  {
    try
    {
      bool = b(paramdkv, 100, paramTimeUnit);
      return bool;
    }
    catch (IOException paramdkv)
    {
      for (;;)
      {
        boolean bool = false;
      }
    }
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static Object[] a(Class paramClass, Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    ArrayList localArrayList = new ArrayList();
    int k = paramArrayOfObject1.length;
    int i = 0;
    if (i < k)
    {
      Object localObject1 = paramArrayOfObject1[i];
      int m = paramArrayOfObject2.length;
      for (int j = 0;; j++) {
        if (j < m)
        {
          Object localObject2 = paramArrayOfObject2[j];
          if (localObject1.equals(localObject2)) {
            localArrayList.add(localObject2);
          }
        }
        else
        {
          i++;
          break;
        }
      }
    }
    return localArrayList.toArray((Object[])Array.newInstance(paramClass, localArrayList.size()));
  }
  
  public static boolean b(dkv paramdkv, int paramInt, TimeUnit paramTimeUnit)
  {
    long l2 = System.nanoTime();
    long l1;
    if (paramdkv.a().m_()) {
      l1 = paramdkv.a().c() - l2;
    }
    for (;;)
    {
      paramdkv.a().a(Math.min(l1, paramTimeUnit.toNanos(paramInt)) + l2);
      try
      {
        paramTimeUnit = new djz;
        paramTimeUnit.<init>();
        while (paramdkv.a(paramTimeUnit, 2048L) != -1L) {
          paramTimeUnit.q();
        }
      }
      catch (InterruptedIOException paramTimeUnit)
      {
        if (l1 == Long.MAX_VALUE) {
          paramdkv.a().n_();
        }
        for (;;)
        {
          boolean bool = false;
          return bool;
          l1 = Long.MAX_VALUE;
          break;
          if (l1 == Long.MAX_VALUE) {
            paramdkv.a().n_();
          }
          for (;;)
          {
            bool = true;
            break;
            paramdkv.a().a(l1 + l2);
          }
          paramdkv.a().a(l1 + l2);
        }
      }
      finally
      {
        if (l1 != Long.MAX_VALUE) {
          break label196;
        }
      }
    }
    paramdkv.a().n_();
    for (;;)
    {
      throw paramTimeUnit;
      label196:
      paramdkv.a().a(l1 + l2);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */