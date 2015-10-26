import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class aji
{
  private static final String[] a = { "supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories" };
  private static Map b = new ConcurrentHashMap();
  private static AtomicBoolean c = new AtomicBoolean(false);
  private static int d = 0;
  private static long e = -1L;
  private static long f = -1L;
  private static long g = -1L;
  private static String h = "";
  private static String i = "NoCarrier";
  
  public static int a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    int j = 0;
    try
    {
      localBufferedInputStream = new java/io/BufferedInputStream;
      localBufferedInputStream.<init>(paramInputStream);
      byte[] arrayOfByte;
      int k;
      if (localBufferedInputStream == null) {
        break label75;
      }
    }
    finally
    {
      try
      {
        arrayOfByte = new byte[' '];
        for (;;)
        {
          k = localBufferedInputStream.read(arrayOfByte);
          if (k == -1) {
            break;
          }
          paramOutputStream.write(arrayOfByte, 0, k);
          j += k;
        }
        localBufferedInputStream.close();
        if (paramInputStream != null) {
          paramInputStream.close();
        }
        return j;
      }
      finally
      {
        BufferedInputStream localBufferedInputStream;
        for (;;) {}
      }
      paramOutputStream = finally;
      localBufferedInputStream = null;
    }
    localBufferedInputStream.close();
    label75:
    if (paramInputStream != null) {
      paramInputStream.close();
    }
    throw paramOutputStream;
  }
  
  private static long a(double paramDouble)
  {
    return Math.round(paramDouble / 1.073741824E9D);
  }
  
  public static long a(Uri paramUri)
  {
    try
    {
      paramUri = afv.f().getContentResolver().query(paramUri, null, null, null, null);
      int j;
      long l;
      if (paramUri == null) {
        break label64;
      }
    }
    finally
    {
      try
      {
        j = paramUri.getColumnIndex("_size");
        paramUri.moveToFirst();
        l = paramUri.getLong(j);
        if (paramUri != null) {
          paramUri.close();
        }
        return l;
      }
      finally {}
      localObject1 = finally;
      paramUri = null;
    }
    paramUri.close();
    label64:
    throw ((Throwable)localObject1);
  }
  
  public static ajn a(String paramString, boolean paramBoolean)
  {
    if ((!paramBoolean) && (b.containsKey(paramString))) {
      paramString = (ajn)b.get(paramString);
    }
    for (;;)
    {
      return paramString;
      JSONObject localJSONObject = f(paramString);
      if (localJSONObject == null) {
        paramString = null;
      } else {
        paramString = b(paramString, localJSONObject);
      }
    }
  }
  
  public static Uri a(String paramString1, String paramString2, Bundle paramBundle)
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("https");
    localBuilder.authority(paramString1);
    localBuilder.path(paramString2);
    if (paramBundle != null)
    {
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        paramString1 = (String)localIterator.next();
        paramString2 = paramBundle.get(paramString1);
        if ((paramString2 instanceof String)) {
          localBuilder.appendQueryParameter(paramString1, (String)paramString2);
        }
      }
    }
    return localBuilder.build();
  }
  
  public static Object a(Object paramObject, Method paramMethod, Object... paramVarArgs)
  {
    Object localObject = null;
    try
    {
      paramObject = paramMethod.invoke(paramObject, paramVarArgs);
      return paramObject;
    }
    catch (IllegalAccessException paramObject)
    {
      for (;;)
      {
        paramObject = localObject;
      }
    }
    catch (InvocationTargetException paramObject)
    {
      for (;;)
      {
        paramObject = localObject;
      }
    }
  }
  
  public static Object a(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    paramJSONObject = paramJSONObject.opt(paramString1);
    if ((paramJSONObject != null) && ((paramJSONObject instanceof String))) {
      paramJSONObject = new JSONTokener((String)paramJSONObject).nextValue();
    }
    for (;;)
    {
      if ((paramJSONObject != null) && (!(paramJSONObject instanceof JSONObject)) && (!(paramJSONObject instanceof JSONArray))) {
        if (paramString2 != null)
        {
          paramString1 = new JSONObject();
          paramString1.putOpt(paramString2, paramJSONObject);
          paramJSONObject = paramString1;
        }
      }
      for (;;)
      {
        return paramJSONObject;
        throw new afq("Got an unexpected non-JSON object.");
      }
    }
  }
  
  public static String a(Context paramContext)
  {
    ajp.a(paramContext, "context");
    afv.a(paramContext);
    return afv.h();
  }
  
  /* Error */
  public static String a(InputStream paramInputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 71	java/io/BufferedInputStream
    //   5: astore_1
    //   6: aload_1
    //   7: aload_0
    //   8: invokespecial 74	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   11: new 254	java/io/InputStreamReader
    //   14: astore_3
    //   15: aload_3
    //   16: aload_1
    //   17: invokespecial 255	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   20: new 257	java/lang/StringBuilder
    //   23: astore_2
    //   24: aload_2
    //   25: invokespecial 258	java/lang/StringBuilder:<init>	()V
    //   28: sipush 2048
    //   31: newarray <illegal type>
    //   33: astore_0
    //   34: aload_3
    //   35: aload_0
    //   36: invokevirtual 261	java/io/InputStreamReader:read	([C)I
    //   39: istore 4
    //   41: iload 4
    //   43: iconst_m1
    //   44: if_icmpeq +30 -> 74
    //   47: aload_2
    //   48: aload_0
    //   49: iconst_0
    //   50: iload 4
    //   52: invokevirtual 265	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: goto -22 -> 34
    //   59: astore_0
    //   60: aload_1
    //   61: astore_2
    //   62: aload_3
    //   63: astore_1
    //   64: aload_2
    //   65: invokestatic 268	aji:a	(Ljava/io/Closeable;)V
    //   68: aload_1
    //   69: invokestatic 268	aji:a	(Ljava/io/Closeable;)V
    //   72: aload_0
    //   73: athrow
    //   74: aload_2
    //   75: invokevirtual 271	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: astore_0
    //   79: aload_1
    //   80: invokestatic 268	aji:a	(Ljava/io/Closeable;)V
    //   83: aload_3
    //   84: invokestatic 268	aji:a	(Ljava/io/Closeable;)V
    //   87: aload_0
    //   88: areturn
    //   89: astore_0
    //   90: aconst_null
    //   91: astore_1
    //   92: goto -28 -> 64
    //   95: astore_0
    //   96: aconst_null
    //   97: astore_3
    //   98: aload_1
    //   99: astore_2
    //   100: aload_3
    //   101: astore_1
    //   102: goto -38 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	paramInputStream	InputStream
    //   5	97	1	localObject1	Object
    //   1	99	2	localObject2	Object
    //   14	87	3	localInputStreamReader	java.io.InputStreamReader
    //   39	12	4	j	int
    // Exception table:
    //   from	to	target	type
    //   20	34	59	finally
    //   34	41	59	finally
    //   47	56	59	finally
    //   74	79	59	finally
    //   2	11	89	finally
    //   11	20	95	finally
  }
  
  private static String a(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      paramString = MessageDigest.getInstance(paramString);
      paramString.update(paramArrayOfByte);
      paramArrayOfByte = paramString.digest();
      paramString = new StringBuilder();
      int k = paramArrayOfByte.length;
      int j = 0;
      while (j < k)
      {
        int m = paramArrayOfByte[j];
        paramString.append(Integer.toHexString(m >> 4 & 0xF));
        paramString.append(Integer.toHexString(m & 0xF));
        j++;
        continue;
        return paramString;
      }
    }
    catch (NoSuchAlgorithmException paramString)
    {
      paramString = null;
    }
    for (;;)
    {
      paramString = paramString.toString();
    }
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    return a("SHA-1", paramArrayOfByte);
  }
  
  public static Method a(Class paramClass, String paramString, Class... paramVarArgs)
  {
    try
    {
      paramClass = paramClass.getMethod(paramString, paramVarArgs);
      return paramClass;
    }
    catch (NoSuchMethodException paramClass)
    {
      for (;;)
      {
        paramClass = null;
      }
    }
  }
  
  public static Method a(String paramString1, String paramString2, Class... paramVarArgs)
  {
    try
    {
      paramString1 = a(Class.forName(paramString1), paramString2, paramVarArgs);
      return paramString1;
    }
    catch (ClassNotFoundException paramString1)
    {
      for (;;)
      {
        paramString1 = null;
      }
    }
  }
  
  public static Collection a(Object... paramVarArgs)
  {
    return Collections.unmodifiableCollection(Arrays.asList(paramVarArgs));
  }
  
  public static Date a(Bundle paramBundle, String paramString, Date paramDate)
  {
    if (paramBundle == null) {
      paramBundle = null;
    }
    for (;;)
    {
      return paramBundle;
      paramBundle = paramBundle.get(paramString);
      long l;
      if ((paramBundle instanceof Long)) {
        l = ((Long)paramBundle).longValue();
      }
      for (;;)
      {
        if (l != 0L) {
          break label78;
        }
        paramBundle = new Date(Long.MAX_VALUE);
        break;
        if (!(paramBundle instanceof String)) {
          break label73;
        }
        try
        {
          l = Long.parseLong((String)paramBundle);
        }
        catch (NumberFormatException paramBundle)
        {
          paramBundle = null;
        }
      }
      continue;
      label73:
      paramBundle = null;
      continue;
      label78:
      paramBundle = new Date(l * 1000L + paramDate.getTime());
    }
  }
  
  public static List a(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < paramJSONArray.length(); j++) {
      localArrayList.add(paramJSONArray.getString(j));
    }
    return localArrayList;
  }
  
  public static Map a(Parcel paramParcel)
  {
    int k = paramParcel.readInt();
    Object localObject;
    if (k < 0)
    {
      localObject = null;
      return (Map)localObject;
    }
    HashMap localHashMap = new HashMap();
    for (int j = 0;; j++)
    {
      localObject = localHashMap;
      if (j >= k) {
        break;
      }
      localHashMap.put(paramParcel.readString(), paramParcel.readString());
    }
  }
  
  private static Map a(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    Object localObject;
    String str;
    Map localMap;
    if (paramJSONObject != null)
    {
      JSONArray localJSONArray = paramJSONObject.optJSONArray("data");
      if (localJSONArray != null)
      {
        int j = 0;
        if (j < localJSONArray.length())
        {
          localObject = localJSONArray.optJSONObject(j);
          paramJSONObject = ((JSONObject)localObject).optString("name");
          if (a(paramJSONObject)) {
            paramJSONObject = null;
          }
          for (;;)
          {
            if (paramJSONObject != null)
            {
              str = paramJSONObject.a;
              localMap = (Map)localHashMap.get(str);
              localObject = localMap;
              if (localMap == null)
              {
                localObject = new HashMap();
                localHashMap.put(str, localObject);
              }
              ((Map)localObject).put(paramJSONObject.b, paramJSONObject);
            }
            j++;
            break;
            paramJSONObject = paramJSONObject.split("\\|");
            if (paramJSONObject.length != 2)
            {
              paramJSONObject = null;
            }
            else
            {
              localMap = paramJSONObject[0];
              str = paramJSONObject[1];
              if ((!a(localMap)) && (!a(str))) {
                break label172;
              }
              paramJSONObject = null;
            }
          }
          label172:
          paramJSONObject = ((JSONObject)localObject).optString("url");
          if (a(paramJSONObject)) {
            break label219;
          }
        }
      }
    }
    label219:
    for (paramJSONObject = Uri.parse(paramJSONObject);; paramJSONObject = null)
    {
      paramJSONObject = new ajm(localMap, str, paramJSONObject, ajm.a(((JSONObject)localObject).optJSONArray("versions")));
      break;
      return localHashMap;
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    boolean bool = c.compareAndSet(false, true);
    if ((a(paramString)) || (b.containsKey(paramString)) || (!bool)) {}
    for (;;)
    {
      return;
      String str = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] { paramString });
      afv.d().execute(new ajj(paramString, paramContext, str));
      str = paramContext.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(str, null);
      if (a(str)) {
        continue;
      }
      try
      {
        paramContext = new org/json/JSONObject;
        paramContext.<init>(str);
        if (paramContext == null) {
          continue;
        }
        b(paramString, paramContext);
      }
      catch (JSONException paramContext)
      {
        for (;;)
        {
          a("FacebookSDK", paramContext);
          paramContext = null;
        }
      }
    }
  }
  
  public static void a(Parcel paramParcel, Map paramMap)
  {
    if (paramMap == null) {
      paramParcel.writeInt(-1);
    }
    for (;;)
    {
      return;
      paramParcel.writeInt(paramMap.size());
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        paramParcel.writeString((String)localEntry.getKey());
        paramParcel.writeString((String)localEntry.getValue());
      }
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
    catch (IOException paramCloseable)
    {
      for (;;) {}
    }
  }
  
  public static void a(String paramString, ajo paramajo)
  {
    JSONObject localJSONObject = ajg.a(paramString);
    if (localJSONObject != null) {
      paramajo.a(localJSONObject);
    }
    for (;;)
    {
      return;
      paramajo = new ajk(paramajo, paramString);
      paramString = g(paramString);
      paramString.a(paramajo);
      paramajo = new aga[1];
      paramajo[0] = paramString;
      ajp.a(paramajo, "requests");
      aga.b(new agm(Arrays.asList(paramajo)));
    }
  }
  
  public static void a(String paramString, Exception paramException)
  {
    if (afv.b())
    {
      paramString = String.valueOf(paramException.getClass().getSimpleName());
      paramException = String.valueOf(paramException.getMessage());
      new StringBuilder(String.valueOf(paramString).length() + 2 + String.valueOf(paramException).length()).append(paramString).append(": ").append(paramException);
    }
  }
  
  public static void a(String paramString1, String paramString2)
  {
    afv.b();
  }
  
  public static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (afv.b()) {
      a(paramString1);
    }
  }
  
  public static void a(URLConnection paramURLConnection)
  {
    if ((paramURLConnection instanceof HttpURLConnection)) {
      ((HttpURLConnection)paramURLConnection).disconnect();
    }
  }
  
  public static void a(JSONObject paramJSONObject, ahx paramahx, String paramString, boolean paramBoolean)
  {
    boolean bool2 = true;
    if ((paramahx != null) && (paramahx.a != null)) {
      paramJSONObject.put("attribution", paramahx.a);
    }
    boolean bool1;
    if ((paramahx != null) && (paramahx.b != null))
    {
      paramJSONObject.put("advertiser_id", paramahx.b);
      if (!paramahx.d)
      {
        bool1 = true;
        paramJSONObject.put("advertiser_tracking_enabled", bool1);
      }
    }
    else
    {
      if ((paramahx != null) && (paramahx.c != null)) {
        paramJSONObject.put("installer_package", paramahx.c);
      }
      paramJSONObject.put("anon_id", paramString);
      if (paramBoolean) {
        break label124;
      }
    }
    label124:
    for (paramBoolean = bool2;; paramBoolean = false)
    {
      paramJSONObject.put("application_tracking_enabled", paramBoolean);
      return;
      bool1 = false;
      break;
    }
  }
  
  public static void a(JSONObject paramJSONObject, Context paramContext)
  {
    JSONArray localJSONArray = new JSONArray();
    localJSONArray.put("a2");
    if ((e == -1L) || (System.currentTimeMillis() - e >= 1800000L))
    {
      e = System.currentTimeMillis();
      c();
      d(paramContext);
      f();
      e();
    }
    String str = paramContext.getPackageName();
    k = -1;
    Object localObject1 = "";
    j = k;
    try
    {
      localObject2 = paramContext.getPackageManager().getPackageInfo(str, 0);
      j = k;
      k = ((PackageInfo)localObject2).versionCode;
      j = k;
      localObject2 = ((PackageInfo)localObject2).versionName;
      j = k;
      localObject1 = localObject2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2;
        continue;
        double d1 = 0.0D;
        j = 0;
        k = 0;
      }
    }
    localJSONArray.put(str);
    localJSONArray.put(j);
    localJSONArray.put(localObject1);
    localJSONArray.put(Build.VERSION.RELEASE);
    localJSONArray.put(Build.MODEL);
    try
    {
      localObject1 = paramContext.getResources().getConfiguration().locale;
      localObject2 = String.valueOf(((Locale)localObject1).getLanguage());
      localObject1 = String.valueOf(((Locale)localObject1).getCountry());
      localJSONArray.put(String.valueOf(localObject2).length() + 1 + String.valueOf(localObject1).length() + (String)localObject2 + "_" + (String)localObject1);
      localJSONArray.put(h);
      localJSONArray.put(i);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          paramContext = (WindowManager)paramContext.getSystemService("window");
          if (paramContext == null) {
            break label468;
          }
          paramContext = paramContext.getDefaultDisplay();
          localObject1 = new android/util/DisplayMetrics;
          ((DisplayMetrics)localObject1).<init>();
          paramContext.getMetrics((DisplayMetrics)localObject1);
          j = ((DisplayMetrics)localObject1).widthPixels;
        }
        catch (Exception paramContext)
        {
          float f1;
          Locale localLocale;
          k = 0;
          j = 0;
          int m = k;
          k = j;
          d1 = 0.0D;
          j = m;
          continue;
        }
        try
        {
          k = ((DisplayMetrics)localObject1).heightPixels;
        }
        catch (Exception paramContext)
        {
          k = 0;
          continue;
        }
        try
        {
          f1 = ((DisplayMetrics)localObject1).density;
          d1 = f1;
          m = k;
          k = j;
          j = m;
          localJSONArray.put(k);
          localJSONArray.put(j);
          localJSONArray.put(String.format("%.2f", new Object[] { Double.valueOf(d1) }));
          localJSONArray.put(b());
          localJSONArray.put(f);
          localJSONArray.put(g);
          paramJSONObject.put("extinfo", localJSONArray.toString());
          return;
        }
        catch (Exception paramContext)
        {
          continue;
        }
        localException = localException;
        localLocale = Locale.getDefault();
      }
    }
  }
  
  public static boolean a(afb paramafb)
  {
    if (paramafb != null) {}
    for (boolean bool = paramafb.equals(afb.a());; bool = false) {
      return bool;
    }
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 == null) {
      if (paramObject2 == null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      bool = paramObject1.equals(paramObject2);
    }
  }
  
  public static boolean a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean a(Collection paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.size() == 0)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static int b()
  {
    int j = 1;
    if (d > 0) {
      j = d;
    }
    for (;;)
    {
      return j;
      if (Build.VERSION.SDK_INT <= 10)
      {
        d = 1;
        continue;
      }
      try
      {
        File localFile = new java/io/File;
        localFile.<init>("/sys/devices/system/cpu/");
        ajl localajl = new ajl;
        localajl.<init>();
        d = localFile.listFiles(localajl).length;
        if (d <= 0) {
          d = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        j = d;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  private static ajn b(String paramString, JSONObject paramJSONObject)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray("android_sdk_error_categories");
    Object localObject1;
    if (localJSONArray == null) {
      localObject1 = aiq.a();
    }
    for (;;)
    {
      paramJSONObject = new ajn(paramJSONObject.optBoolean("supports_implicit_sdk_logging", false), paramJSONObject.optString("gdpv4_nux_content", ""), paramJSONObject.optBoolean("gdpv4_nux_enabled", false), a(paramJSONObject.optJSONObject("android_dialog_configs")), (aiq)localObject1);
      b.put(paramString, paramJSONObject);
      return paramJSONObject;
      if (localJSONArray == null)
      {
        localObject1 = null;
      }
      else
      {
        int j = 0;
        localObject1 = null;
        Object localObject2 = null;
        Object localObject3 = null;
        Object localObject4 = null;
        Object localObject5 = null;
        Object localObject6 = null;
        if (j < localJSONArray.length())
        {
          JSONObject localJSONObject = localJSONArray.optJSONObject(j);
          Object localObject7 = localObject6;
          Object localObject8 = localObject5;
          Object localObject11 = localObject4;
          Object localObject10 = localObject3;
          Object localObject9 = localObject2;
          Object localObject12 = localObject1;
          String str;
          if (localJSONObject != null)
          {
            str = localJSONObject.optString("name");
            localObject7 = localObject6;
            localObject8 = localObject5;
            localObject11 = localObject4;
            localObject10 = localObject3;
            localObject9 = localObject2;
            localObject12 = localObject1;
            if (str != null)
            {
              if (!str.equalsIgnoreCase("other")) {
                break label253;
              }
              localObject10 = localJSONObject.optString("recovery_message", null);
              localObject7 = aiq.a(localJSONObject);
              localObject12 = localObject1;
              localObject9 = localObject2;
              localObject11 = localObject4;
              localObject8 = localObject5;
            }
          }
          for (;;)
          {
            j++;
            localObject6 = localObject7;
            localObject5 = localObject8;
            localObject4 = localObject11;
            localObject3 = localObject10;
            localObject2 = localObject9;
            localObject1 = localObject12;
            break;
            label253:
            if (str.equalsIgnoreCase("transient"))
            {
              localObject9 = localJSONObject.optString("recovery_message", null);
              localObject8 = aiq.a(localJSONObject);
              localObject7 = localObject6;
              localObject11 = localObject4;
              localObject10 = localObject3;
              localObject12 = localObject1;
            }
            else
            {
              localObject7 = localObject6;
              localObject8 = localObject5;
              localObject11 = localObject4;
              localObject10 = localObject3;
              localObject9 = localObject2;
              localObject12 = localObject1;
              if (str.equalsIgnoreCase("login_recoverable"))
              {
                localObject12 = localJSONObject.optString("recovery_message", null);
                localObject11 = aiq.a(localJSONObject);
                localObject7 = localObject6;
                localObject8 = localObject5;
                localObject10 = localObject3;
                localObject9 = localObject2;
              }
            }
          }
        }
        localObject1 = new aiq((Map)localObject6, (Map)localObject5, (Map)localObject4, (String)localObject3, (String)localObject2, (String)localObject1);
      }
    }
  }
  
  public static Bundle b(String paramString)
  {
    Bundle localBundle = new Bundle();
    if (!a(paramString))
    {
      paramString = paramString.split("&");
      int k = paramString.length;
      int j = 0;
      for (;;)
      {
        if (j < k)
        {
          String[] arrayOfString = paramString[j].split("=");
          try
          {
            if (arrayOfString.length == 2) {
              localBundle.putString(URLDecoder.decode(arrayOfString[0], "UTF-8"), URLDecoder.decode(arrayOfString[1], "UTF-8"));
            }
            for (;;)
            {
              j++;
              break;
              if (arrayOfString.length == 1) {
                localBundle.putString(URLDecoder.decode(arrayOfString[0], "UTF-8"), "");
              }
            }
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
            for (;;)
            {
              a("FacebookSDK", localUnsupportedEncodingException);
            }
          }
        }
      }
    }
    return localBundle;
  }
  
  public static List b(Object... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < 2; j++)
    {
      Object localObject = paramVarArgs[j];
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public static void b(Context paramContext)
  {
    b(paramContext, "facebook.com");
    b(paramContext, ".facebook.com");
    b(paramContext, "https://facebook.com");
    b(paramContext, "https://.facebook.com");
  }
  
  private static void b(Context paramContext, String paramString)
  {
    CookieSyncManager.createInstance(paramContext).sync();
    paramContext = CookieManager.getInstance();
    Object localObject = paramContext.getCookie(paramString);
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = ((String)localObject).split(";");
      int k = localObject.length;
      for (int j = 0; j < k; j++)
      {
        String[] arrayOfString = localObject[j].split("=");
        if (arrayOfString.length > 0) {
          paramContext.setCookie(paramString, String.valueOf(arrayOfString[0].trim()).concat("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
        }
      }
      paramContext.removeExpiredCookie();
    }
  }
  
  public static ajn c(String paramString)
  {
    if (paramString != null) {}
    for (paramString = (ajn)b.get(paramString);; paramString = null) {
      return paramString;
    }
  }
  
  public static String c(Context paramContext)
  {
    if (paramContext == null) {
      paramContext = "null";
    }
    for (;;)
    {
      return paramContext;
      if (paramContext == paramContext.getApplicationContext()) {
        paramContext = "unknown";
      } else {
        paramContext = paramContext.getClass().getSimpleName();
      }
    }
  }
  
  private static void c()
  {
    try
    {
      TimeZone localTimeZone = TimeZone.getDefault();
      Date localDate = new java/util/Date;
      localDate.<init>();
      h = localTimeZone.getDisplayName(localTimeZone.inDaylightTime(localDate), 0);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public static JSONObject d(String paramString)
  {
    JSONObject localJSONObject = ajg.a(paramString);
    if (localJSONObject != null) {
      paramString = localJSONObject;
    }
    for (;;)
    {
      return paramString;
      paramString = g(paramString).a();
      if (paramString.b != null) {
        paramString = null;
      } else {
        paramString = paramString.a;
      }
    }
  }
  
  private static void d(Context paramContext)
  {
    if (i.equals("NoCarrier")) {}
    try
    {
      i = ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperatorName();
      return;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  private static boolean d()
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }
  
  private static void e()
  {
    try
    {
      if (d())
      {
        File localFile = Environment.getExternalStorageDirectory();
        StatFs localStatFs = new android/os/StatFs;
        localStatFs.<init>(localFile.getPath());
        long l = localStatFs.getAvailableBlocks();
        g = localStatFs.getBlockSize() * l;
      }
      g = a(g);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private static JSONObject f(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", TextUtils.join(",", a));
    paramString = aga.a(null, paramString, null);
    paramString.g = true;
    paramString.d = localBundle;
    return paramString.a().a;
  }
  
  private static void f()
  {
    try
    {
      if (d())
      {
        File localFile = Environment.getExternalStorageDirectory();
        StatFs localStatFs = new android/os/StatFs;
        localStatFs.<init>(localFile.getPath());
        long l = localStatFs.getBlockCount();
        f = localStatFs.getBlockSize() * l;
      }
      f = a(f);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private static aga g(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
    localBundle.putString("access_token", paramString);
    return new aga(null, "me", localBundle, agq.a, null);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */