import android.graphics.Bitmap;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class aga
{
  public static final String a = aga.class.getSimpleName();
  private static Pattern h = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
  private static volatile String m;
  afb b;
  public JSONObject c;
  public Bundle d;
  agf e;
  public Object f;
  public boolean g = false;
  private agq i;
  private String j;
  private boolean k = true;
  private String l;
  
  public aga()
  {
    this(null, null, null, null, null);
  }
  
  public aga(afb paramafb, String paramString, Bundle paramBundle, agq paramagq, agf paramagf)
  {
    this(paramafb, paramString, paramBundle, paramagq, paramagf, null);
  }
  
  private aga(afb paramafb, String paramString1, Bundle paramBundle, agq paramagq, agf paramagf, String paramString2)
  {
    this.b = paramafb;
    this.j = paramString1;
    this.l = null;
    a(paramagf);
    if (paramagq != null)
    {
      this.i = paramagq;
      if (paramBundle == null) {
        break label85;
      }
    }
    label85:
    for (this.d = new Bundle(paramBundle);; this.d = new Bundle())
    {
      if (this.l == null) {
        this.l = ajh.d();
      }
      return;
      paramagq = agq.a;
      break;
    }
  }
  
  public static aga a(afb paramafb, String paramString, agf paramagf)
  {
    return new aga(null, paramString, null, null, null);
  }
  
  public static aga a(afb paramafb, String paramString, JSONObject paramJSONObject, agf paramagf)
  {
    paramafb = new aga(null, paramString, null, agq.b, null);
    paramafb.c = null;
    return paramafb;
  }
  
  private String a(String paramString)
  {
    Uri.Builder localBuilder = new Uri.Builder().encodedPath(paramString);
    Iterator localIterator = this.d.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = this.d.get(str);
      paramString = (String)localObject;
      if (localObject == null) {
        paramString = "";
      }
      if (d(paramString)) {
        localBuilder.appendQueryParameter(str, e(paramString).toString());
      } else if (this.i == agq.a) {
        throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[] { paramString.getClass().getSimpleName() }));
      }
    }
    return localBuilder.toString();
  }
  
  public static List a(agm paramagm)
  {
    ajp.a(paramagm, "requests");
    try
    {
      HttpURLConnection localHttpURLConnection = c(paramagm);
      paramagm = a(localHttpURLConnection, paramagm);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        List localList = agp.a(paramagm.b, null, new afq(localException));
        a(paramagm, localList);
        paramagm = localList;
      }
    }
    return paramagm;
  }
  
  public static List a(HttpURLConnection paramHttpURLConnection, agm paramagm)
  {
    int n = 1;
    List localList = agp.a(paramHttpURLConnection, paramagm);
    aji.a(paramHttpURLConnection);
    int i1 = paramagm.size();
    if (i1 != localList.size()) {
      throw new afq(String.format(Locale.US, "Received %d responses while expecting %d", new Object[] { Integer.valueOf(localList.size()), Integer.valueOf(i1) }));
    }
    a(paramagm, localList);
    paramagm = aff.a();
    if (paramagm.b != null)
    {
      paramHttpURLConnection = Long.valueOf(new Date().getTime());
      if ((paramagm.b.e.d) && (paramHttpURLConnection.longValue() - paramagm.c.getTime() > 3600000L) && (paramHttpURLConnection.longValue() - paramagm.b.f.getTime() > 86400000L)) {
        if (n != 0)
        {
          if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            break label180;
          }
          paramagm.b();
        }
      }
    }
    for (;;)
    {
      return localList;
      n = 0;
      break;
      label180:
      new Handler(Looper.getMainLooper()).post(new afg(paramagm));
    }
  }
  
  private static void a(agk paramagk, Collection paramCollection, Map paramMap)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      ((aga)localIterator.next()).a(localJSONArray, paramMap);
    }
    paramagk.a("batch", localJSONArray, paramCollection);
  }
  
  private static void a(agm paramagm, aiw paramaiw, int paramInt, URL paramURL, OutputStream paramOutputStream, boolean paramBoolean)
  {
    paramOutputStream = new agk(paramOutputStream, paramaiw, paramBoolean);
    if (paramInt == 1)
    {
      paramagm = paramagm.a(0);
      HashMap localHashMap = new HashMap();
      Iterator localIterator = paramagm.d.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = paramagm.d.get(str);
        if (c(localObject)) {
          localHashMap.put(str, new age(paramagm, localObject));
        }
      }
      if (paramaiw != null) {
        paramaiw.b("  Parameters:\n");
      }
      a(paramagm.d, paramOutputStream, paramagm);
      if (paramaiw != null) {
        paramaiw.b("  Attachments:\n");
      }
      a(localHashMap, paramOutputStream);
      if (paramagm.c != null) {
        a(paramagm.c, paramURL.getPath(), paramOutputStream);
      }
    }
    for (;;)
    {
      return;
      paramURL = f(paramagm);
      if (aji.a(paramURL)) {
        throw new afq("App ID was not specified at the request or Settings.");
      }
      paramOutputStream.a("batch_app_id", paramURL);
      paramURL = new HashMap();
      a(paramOutputStream, paramagm, paramURL);
      if (paramaiw != null) {
        paramaiw.b("  Attachments:\n");
      }
      a(paramURL, paramOutputStream);
    }
  }
  
  private static void a(agm paramagm, List paramList)
  {
    int i1 = paramagm.size();
    ArrayList localArrayList = new ArrayList();
    for (int n = 0; n < i1; n++)
    {
      aga localaga = paramagm.a(n);
      if (localaga.e != null) {
        localArrayList.add(new Pair(localaga.e, paramList.get(n)));
      }
    }
    if (localArrayList.size() > 0)
    {
      paramList = new agc(localArrayList, paramagm);
      paramagm = paramagm.a;
      if (paramagm != null) {
        break label101;
      }
      paramList.run();
    }
    for (;;)
    {
      return;
      label101:
      paramagm.post(paramList);
    }
  }
  
  private static void a(Bundle paramBundle, agk paramagk, aga paramaga)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if (d(localObject)) {
        paramagk.a(str, localObject, paramaga);
      }
    }
  }
  
  private static void a(String paramString, Object paramObject, agg paramagg, boolean paramBoolean)
  {
    Object localObject = paramObject.getClass();
    if (JSONObject.class.isAssignableFrom((Class)localObject))
    {
      localObject = (JSONObject)paramObject;
      if (paramBoolean)
      {
        Iterator localIterator = ((JSONObject)localObject).keys();
        while (localIterator.hasNext())
        {
          paramObject = (String)localIterator.next();
          a(String.format("%s[%s]", new Object[] { paramString, paramObject }), ((JSONObject)localObject).opt((String)paramObject), paramagg, paramBoolean);
        }
      }
      if (((JSONObject)localObject).has("id")) {
        a(paramString, ((JSONObject)localObject).optString("id"), paramagg, paramBoolean);
      }
    }
    for (;;)
    {
      return;
      if (((JSONObject)localObject).has("url"))
      {
        a(paramString, ((JSONObject)localObject).optString("url"), paramagg, paramBoolean);
      }
      else if (((JSONObject)localObject).has("fbsdk:create_object"))
      {
        a(paramString, ((JSONObject)localObject).toString(), paramagg, paramBoolean);
        continue;
        if (JSONArray.class.isAssignableFrom((Class)localObject))
        {
          paramObject = (JSONArray)paramObject;
          int i1 = ((JSONArray)paramObject).length();
          for (int n = 0; n < i1; n++) {
            a(String.format(Locale.ROOT, "%s[%d]", new Object[] { paramString, Integer.valueOf(n) }), ((JSONArray)paramObject).opt(n), paramagg, paramBoolean);
          }
        }
        else if ((String.class.isAssignableFrom((Class)localObject)) || (Number.class.isAssignableFrom((Class)localObject)) || (Boolean.class.isAssignableFrom((Class)localObject)))
        {
          paramagg.a(paramString, paramObject.toString());
        }
        else if (Date.class.isAssignableFrom((Class)localObject))
        {
          paramObject = (Date)paramObject;
          paramagg.a(paramString, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date)paramObject));
        }
      }
    }
  }
  
  private static void a(Map paramMap, agk paramagk)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      age localage = (age)paramMap.get(str);
      if (c(localage.b)) {
        paramagk.a(str, localage.b, localage.a);
      }
    }
  }
  
  private void a(JSONArray paramJSONArray, Map paramMap)
  {
    JSONObject localJSONObject = new JSONObject();
    String str1 = c();
    localJSONObject.put("relative_url", str1);
    localJSONObject.put("method", this.i);
    if (this.b != null) {
      aiw.a(this.b.d);
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.d.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      Object localObject = this.d.get(str2);
      if (c(localObject))
      {
        str2 = String.format(Locale.ROOT, "%s%d", new Object[] { "file", Integer.valueOf(paramMap.size()) });
        localArrayList.add(str2);
        paramMap.put(str2, new age(this, localObject));
      }
    }
    if (!localArrayList.isEmpty()) {
      localJSONObject.put("attached_files", TextUtils.join(",", localArrayList));
    }
    if (this.c != null)
    {
      paramMap = new ArrayList();
      a(this.c, str1, new agd(this, paramMap));
      localJSONObject.put("body", TextUtils.join("&", paramMap));
    }
    paramJSONArray.put(localJSONObject);
  }
  
  private static void a(JSONObject paramJSONObject, String paramString, agg paramagg)
  {
    Object localObject1 = h.matcher(paramString);
    if (((Matcher)localObject1).matches()) {}
    for (localObject1 = ((Matcher)localObject1).group(1);; localObject1 = paramString)
    {
      int n;
      if ((((String)localObject1).startsWith("me/")) || (((String)localObject1).startsWith("/me/")))
      {
        n = 1;
        if (n == 0) {
          break label169;
        }
        n = paramString.indexOf(":");
        int i1 = paramString.indexOf("?");
        if ((n <= 3) || ((i1 != -1) && (n >= i1))) {
          break label156;
        }
        n = 1;
      }
      for (;;)
      {
        label89:
        localObject1 = paramJSONObject.keys();
        label94:
        if (((Iterator)localObject1).hasNext())
        {
          paramString = (String)((Iterator)localObject1).next();
          Object localObject2 = paramJSONObject.opt(paramString);
          if ((n != 0) && (paramString.equalsIgnoreCase("image"))) {}
          for (boolean bool = true;; bool = false)
          {
            a(paramString, localObject2, paramagg, bool);
            break label94;
            n = 0;
            break;
            label156:
            n = 0;
            break label89;
          }
        }
        return;
        label169:
        n = 0;
      }
    }
  }
  
  public static agl b(agm paramagm)
  {
    ajp.a(paramagm, "requests");
    paramagm = new agl(paramagm);
    paramagm.a();
    return paramagm;
  }
  
  private void b()
  {
    String str1;
    if (this.b != null) {
      if (!this.d.containsKey("access_token"))
      {
        str1 = this.b.d;
        aiw.a(str1);
        this.d.putString("access_token", str1);
      }
    }
    label213:
    for (;;)
    {
      this.d.putString("sdk", "android");
      this.d.putString("format", "json");
      if (afv.a(ags.h)) {
        this.d.putString("debug", "info");
      }
      for (;;)
      {
        return;
        if ((this.g) || (this.d.containsKey("access_token"))) {
          break label213;
        }
        str1 = afv.h();
        String str2 = afv.i();
        if ((aji.a(str1)) || (aji.a(str2))) {
          break;
        }
        str1 = String.valueOf(str1).length() + 1 + String.valueOf(str2).length() + str1 + "|" + str2;
        this.d.putString("access_token", str1);
        break;
        if (afv.a(ags.g)) {
          this.d.putString("debug", "warning");
        }
      }
    }
  }
  
  private String c()
  {
    String str = d();
    b();
    return a(str);
  }
  
  /* Error */
  private static HttpURLConnection c(agm paramagm)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 208	agm:size	()I
    //   4: iconst_1
    //   5: if_icmpne +393 -> 398
    //   8: aload_0
    //   9: iconst_0
    //   10: invokevirtual 311	agm:a	(I)Laga;
    //   13: astore_2
    //   14: aload_2
    //   15: getfield 71	aga:i	Lagq;
    //   18: getstatic 91	agq:b	Lagq;
    //   21: if_acmpne +370 -> 391
    //   24: aload_2
    //   25: getfield 64	aga:j	Ljava/lang/String;
    //   28: ifnull +363 -> 391
    //   31: aload_2
    //   32: getfield 64	aga:j	Ljava/lang/String;
    //   35: ldc_w 616
    //   38: invokevirtual 619	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   41: ifeq +350 -> 391
    //   44: invokestatic 620	ajh:c	()Ljava/lang/String;
    //   47: astore_1
    //   48: ldc_w 622
    //   51: iconst_2
    //   52: anewarray 4	java/lang/Object
    //   55: dup
    //   56: iconst_0
    //   57: aload_1
    //   58: aastore
    //   59: dup
    //   60: iconst_1
    //   61: aload_2
    //   62: invokespecial 605	aga:d	()Ljava/lang/String;
    //   65: aastore
    //   66: invokestatic 412	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   69: astore_1
    //   70: aload_2
    //   71: invokespecial 606	aga:b	()V
    //   74: new 343	java/net/URL
    //   77: dup
    //   78: aload_2
    //   79: aload_1
    //   80: invokespecial 608	aga:a	(Ljava/lang/String;)Ljava/lang/String;
    //   83: invokespecial 623	java/net/URL:<init>	(Ljava/lang/String;)V
    //   86: astore_1
    //   87: aload_1
    //   88: invokevirtual 627	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   91: checkcast 629	java/net/HttpURLConnection
    //   94: astore 4
    //   96: getstatic 631	aga:m	Ljava/lang/String;
    //   99: ifnonnull +65 -> 164
    //   102: ldc_w 633
    //   105: iconst_2
    //   106: anewarray 4	java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: ldc_w 635
    //   114: aastore
    //   115: dup
    //   116: iconst_1
    //   117: ldc_w 637
    //   120: aastore
    //   121: invokestatic 412	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   124: putstatic 631	aga:m	Ljava/lang/String;
    //   127: getstatic 641	a:dd	Ljava/lang/String;
    //   130: astore_1
    //   131: aload_1
    //   132: invokestatic 355	aji:a	(Ljava/lang/String;)Z
    //   135: ifne +29 -> 164
    //   138: getstatic 436	java/util/Locale:ROOT	Ljava/util/Locale;
    //   141: ldc_w 622
    //   144: iconst_2
    //   145: anewarray 4	java/lang/Object
    //   148: dup
    //   149: iconst_0
    //   150: getstatic 631	aga:m	Ljava/lang/String;
    //   153: aastore
    //   154: dup
    //   155: iconst_1
    //   156: aload_1
    //   157: aastore
    //   158: invokestatic 160	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   161: putstatic 631	aga:m	Ljava/lang/String;
    //   164: aload 4
    //   166: ldc_w 643
    //   169: getstatic 631	aga:m	Ljava/lang/String;
    //   172: invokevirtual 646	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   175: aload 4
    //   177: ldc_w 648
    //   180: invokestatic 652	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   183: invokevirtual 653	java/util/Locale:toString	()Ljava/lang/String;
    //   186: invokevirtual 646	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   189: aload 4
    //   191: iconst_0
    //   192: invokevirtual 656	java/net/HttpURLConnection:setChunkedStreamingMode	(I)V
    //   195: new 331	aiw
    //   198: astore 5
    //   200: aload 5
    //   202: getstatic 658	ags:a	Lags;
    //   205: ldc_w 660
    //   208: invokespecial 663	aiw:<init>	(Lags;Ljava/lang/String;)V
    //   211: aload_0
    //   212: invokevirtual 208	agm:size	()I
    //   215: istore 9
    //   217: aload_0
    //   218: invokestatic 666	aga:e	(Lagm;)Z
    //   221: istore 10
    //   223: iload 9
    //   225: iconst_1
    //   226: if_icmpne +199 -> 425
    //   229: aload_0
    //   230: iconst_0
    //   231: invokevirtual 311	agm:a	(I)Laga;
    //   234: getfield 71	aga:i	Lagq;
    //   237: astore_1
    //   238: aload 4
    //   240: aload_1
    //   241: invokevirtual 669	agq:name	()Ljava/lang/String;
    //   244: invokevirtual 672	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   247: iload 10
    //   249: ifeq +183 -> 432
    //   252: aload 4
    //   254: ldc_w 674
    //   257: ldc_w 676
    //   260: invokevirtual 646	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   263: aload 4
    //   265: ldc_w 678
    //   268: ldc_w 680
    //   271: invokevirtual 646	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   274: aload 4
    //   276: invokevirtual 684	java/net/HttpURLConnection:getURL	()Ljava/net/URL;
    //   279: astore 6
    //   281: aload 5
    //   283: ldc_w 686
    //   286: invokevirtual 333	aiw:b	(Ljava/lang/String;)V
    //   289: aload 5
    //   291: ldc_w 688
    //   294: aload_0
    //   295: getfield 690	agm:c	Ljava/lang/String;
    //   298: invokevirtual 693	aiw:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   301: aload 5
    //   303: ldc_w 695
    //   306: aload 6
    //   308: invokevirtual 693	aiw:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   311: aload 5
    //   313: ldc_w 697
    //   316: aload 4
    //   318: invokevirtual 700	java/net/HttpURLConnection:getRequestMethod	()Ljava/lang/String;
    //   321: invokevirtual 693	aiw:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   324: aload 5
    //   326: ldc_w 643
    //   329: aload 4
    //   331: ldc_w 643
    //   334: invokevirtual 703	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   337: invokevirtual 693	aiw:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   340: aload 5
    //   342: ldc_w 674
    //   345: aload 4
    //   347: ldc_w 674
    //   350: invokevirtual 703	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   353: invokevirtual 693	aiw:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   356: aload 4
    //   358: iconst_0
    //   359: invokevirtual 706	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   362: aload 4
    //   364: iconst_0
    //   365: invokevirtual 709	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   368: aload_1
    //   369: getstatic 91	agq:b	Lagq;
    //   372: if_acmpne +100 -> 472
    //   375: iconst_1
    //   376: istore 8
    //   378: iload 8
    //   380: ifne +98 -> 478
    //   383: aload 5
    //   385: invokevirtual 711	aiw:a	()V
    //   388: aload 4
    //   390: areturn
    //   391: invokestatic 713	ajh:b	()Ljava/lang/String;
    //   394: astore_1
    //   395: goto -347 -> 48
    //   398: new 343	java/net/URL
    //   401: dup
    //   402: invokestatic 713	ajh:b	()Ljava/lang/String;
    //   405: invokespecial 623	java/net/URL:<init>	(Ljava/lang/String;)V
    //   408: astore_1
    //   409: goto -322 -> 87
    //   412: astore_0
    //   413: new 187	afq
    //   416: dup
    //   417: ldc_w 715
    //   420: aload_0
    //   421: invokespecial 718	afq:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   424: athrow
    //   425: getstatic 91	agq:b	Lagq;
    //   428: astore_1
    //   429: goto -191 -> 238
    //   432: aload 4
    //   434: ldc_w 674
    //   437: ldc_w 720
    //   440: iconst_1
    //   441: anewarray 4	java/lang/Object
    //   444: dup
    //   445: iconst_0
    //   446: ldc_w 722
    //   449: aastore
    //   450: invokestatic 412	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   453: invokevirtual 646	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   456: goto -182 -> 274
    //   459: astore_0
    //   460: new 187	afq
    //   463: dup
    //   464: ldc_w 724
    //   467: aload_0
    //   468: invokespecial 718	afq:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   471: athrow
    //   472: iconst_0
    //   473: istore 8
    //   475: goto -97 -> 378
    //   478: aload 4
    //   480: iconst_1
    //   481: invokevirtual 728	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   484: new 730	java/io/BufferedOutputStream
    //   487: astore_3
    //   488: aload_3
    //   489: aload 4
    //   491: invokevirtual 734	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   494: invokespecial 737	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   497: aload_3
    //   498: astore_1
    //   499: iload 10
    //   501: ifeq +16 -> 517
    //   504: aload_3
    //   505: astore_2
    //   506: new 739	java/util/zip/GZIPOutputStream
    //   509: astore_1
    //   510: aload_3
    //   511: astore_2
    //   512: aload_1
    //   513: aload_3
    //   514: invokespecial 740	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   517: aload_1
    //   518: astore_2
    //   519: aload_0
    //   520: invokestatic 742	aga:d	(Lagm;)Z
    //   523: ifeq +131 -> 654
    //   526: aload_1
    //   527: astore_2
    //   528: new 744	agy
    //   531: astore_3
    //   532: aload_1
    //   533: astore_2
    //   534: aload_3
    //   535: aload_0
    //   536: getfield 389	agm:a	Landroid/os/Handler;
    //   539: invokespecial 747	agy:<init>	(Landroid/os/Handler;)V
    //   542: aload_1
    //   543: astore_2
    //   544: aload_0
    //   545: aconst_null
    //   546: iload 9
    //   548: aload 6
    //   550: aload_3
    //   551: iload 10
    //   553: invokestatic 749	aga:a	(Lagm;Laiw;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    //   556: aload_1
    //   557: astore_2
    //   558: aload_3
    //   559: getfield 752	agy:b	I
    //   562: istore 8
    //   564: aload_1
    //   565: astore_2
    //   566: aload_3
    //   567: getfield 755	agy:a	Ljava/util/Map;
    //   570: astore 7
    //   572: aload_1
    //   573: astore_2
    //   574: new 757	agz
    //   577: astore_3
    //   578: aload_1
    //   579: astore_2
    //   580: aload_3
    //   581: aload_1
    //   582: aload_0
    //   583: aload 7
    //   585: iload 8
    //   587: i2l
    //   588: invokespecial 760	agz:<init>	(Ljava/io/OutputStream;Lagm;Ljava/util/Map;J)V
    //   591: aload_3
    //   592: astore_1
    //   593: aload_0
    //   594: aload 5
    //   596: iload 9
    //   598: aload 6
    //   600: aload_1
    //   601: iload 10
    //   603: invokestatic 749	aga:a	(Lagm;Laiw;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    //   606: aload_1
    //   607: invokevirtual 765	java/io/OutputStream:close	()V
    //   610: aload 5
    //   612: invokevirtual 711	aiw:a	()V
    //   615: goto -227 -> 388
    //   618: astore_0
    //   619: new 187	afq
    //   622: dup
    //   623: ldc_w 724
    //   626: aload_0
    //   627: invokespecial 718	afq:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   630: athrow
    //   631: astore_0
    //   632: aconst_null
    //   633: astore_2
    //   634: aload_2
    //   635: ifnull +7 -> 642
    //   638: aload_2
    //   639: invokevirtual 765	java/io/OutputStream:close	()V
    //   642: aload_0
    //   643: athrow
    //   644: astore_0
    //   645: goto -11 -> 634
    //   648: astore_0
    //   649: aload_1
    //   650: astore_2
    //   651: goto -17 -> 634
    //   654: goto -61 -> 593
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	657	0	paramagm	agm
    //   47	603	1	localObject1	Object
    //   13	638	2	localObject2	Object
    //   487	105	3	localObject3	Object
    //   94	396	4	localHttpURLConnection	HttpURLConnection
    //   198	413	5	localaiw	aiw
    //   279	320	6	localURL	URL
    //   570	14	7	localMap	Map
    //   376	210	8	n	int
    //   215	382	9	i1	int
    //   221	381	10	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	48	412	java/net/MalformedURLException
    //   48	87	412	java/net/MalformedURLException
    //   391	395	412	java/net/MalformedURLException
    //   398	409	412	java/net/MalformedURLException
    //   87	164	459	java/io/IOException
    //   164	223	459	java/io/IOException
    //   229	238	459	java/io/IOException
    //   238	247	459	java/io/IOException
    //   252	274	459	java/io/IOException
    //   274	375	459	java/io/IOException
    //   383	388	459	java/io/IOException
    //   425	429	459	java/io/IOException
    //   432	456	459	java/io/IOException
    //   478	484	459	java/io/IOException
    //   606	615	459	java/io/IOException
    //   638	642	459	java/io/IOException
    //   642	644	459	java/io/IOException
    //   87	164	618	org/json/JSONException
    //   164	223	618	org/json/JSONException
    //   229	238	618	org/json/JSONException
    //   238	247	618	org/json/JSONException
    //   252	274	618	org/json/JSONException
    //   274	375	618	org/json/JSONException
    //   383	388	618	org/json/JSONException
    //   425	429	618	org/json/JSONException
    //   432	456	618	org/json/JSONException
    //   478	484	618	org/json/JSONException
    //   606	615	618	org/json/JSONException
    //   638	642	618	org/json/JSONException
    //   642	644	618	org/json/JSONException
    //   484	497	631	finally
    //   506	510	644	finally
    //   512	517	644	finally
    //   519	526	644	finally
    //   528	532	644	finally
    //   534	542	644	finally
    //   544	556	644	finally
    //   558	564	644	finally
    //   566	572	644	finally
    //   574	578	644	finally
    //   580	591	644	finally
    //   593	606	648	finally
  }
  
  private static boolean c(Object paramObject)
  {
    if (((paramObject instanceof Bitmap)) || ((paramObject instanceof byte[])) || ((paramObject instanceof Uri)) || ((paramObject instanceof ParcelFileDescriptor)) || ((paramObject instanceof agi))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private String d()
  {
    if (h.matcher(this.j).matches()) {}
    for (String str = this.j;; str = String.format("%s/%s", new Object[] { this.l, this.j })) {
      return str;
    }
  }
  
  private static boolean d(agm paramagm)
  {
    Iterator localIterator = paramagm.d.iterator();
    boolean bool;
    while (localIterator.hasNext()) {
      if (((agn)localIterator.next() instanceof ago)) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      paramagm = paramagm.iterator();
      for (;;)
      {
        if (paramagm.hasNext()) {
          if ((((aga)paramagm.next()).e instanceof agh))
          {
            bool = true;
            break;
          }
        }
      }
      bool = false;
    }
  }
  
  private static boolean d(Object paramObject)
  {
    if (((paramObject instanceof String)) || ((paramObject instanceof Boolean)) || ((paramObject instanceof Number)) || ((paramObject instanceof Date))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static String e(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      paramObject = (String)paramObject;
    }
    for (;;)
    {
      return (String)paramObject;
      if (((paramObject instanceof Boolean)) || ((paramObject instanceof Number)))
      {
        paramObject = paramObject.toString();
      }
      else
      {
        if (!(paramObject instanceof Date)) {
          break;
        }
        paramObject = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(paramObject);
      }
    }
    throw new IllegalArgumentException("Unsupported parameter type.");
  }
  
  private static boolean e(agm paramagm)
  {
    aga localaga;
    String str;
    do
    {
      Iterator localIterator = paramagm.iterator();
      while (!paramagm.hasNext())
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localaga = (aga)localIterator.next();
        paramagm = localaga.d.keySet().iterator();
      }
      str = (String)paramagm.next();
    } while (!c(localaga.d.get(str)));
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  private static String f(agm paramagm)
  {
    if (!aji.a(null)) {
      paramagm = null;
    }
    for (;;)
    {
      return paramagm;
      Iterator localIterator = paramagm.iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          paramagm = ((aga)localIterator.next()).b;
          if (paramagm != null)
          {
            paramagm = paramagm.g;
            if (paramagm != null) {
              break;
            }
          }
        }
      }
      if (!aji.a(null)) {
        paramagm = null;
      } else {
        paramagm = afv.h();
      }
    }
  }
  
  public final agp a()
  {
    Object localObject = new aga[1];
    localObject[0] = this;
    ajp.a(localObject, "requests");
    localObject = a(new agm(Arrays.asList((Object[])localObject)));
    if ((localObject == null) || (((List)localObject).size() != 1)) {
      throw new afq("invalid state: expected a single response");
    }
    return (agp)((List)localObject).get(0);
  }
  
  public final void a(agf paramagf)
  {
    if ((afv.a(ags.h)) || (afv.a(ags.g))) {}
    for (this.e = new agb(this, paramagf);; this.e = paramagf) {
      return;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{Request: ").append(" accessToken: ");
    if (this.b == null) {}
    for (Object localObject = "null";; localObject = this.b) {
      return localObject + ", graphPath: " + this.j + ", graphObject: " + this.c + ", httpMethod: " + this.i + ", parameters: " + this.d + "}";
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */