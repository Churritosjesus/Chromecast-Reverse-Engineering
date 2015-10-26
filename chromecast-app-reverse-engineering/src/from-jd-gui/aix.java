import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class aix
{
  private static final ajb a = new aiz();
  private static List b;
  private static AtomicBoolean c = new AtomicBoolean(false);
  private static final List d = Arrays.asList(new Integer[] { Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101) });
  
  static
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(a);
    ((List)localObject).add(new ajc());
    b = (List)localObject;
    localObject = new HashMap();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new aja());
    ((Map)localObject).put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", b);
    ((Map)localObject).put("com.facebook.platform.action.request.FEED_DIALOG", b);
    ((Map)localObject).put("com.facebook.platform.action.request.LIKE_DIALOG", b);
    ((Map)localObject).put("com.facebook.platform.action.request.APPINVITES_DIALOG", b);
    ((Map)localObject).put("com.facebook.platform.action.request.MESSAGE_DIALOG", localArrayList);
    ((Map)localObject).put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", localArrayList);
  }
  
  public static final int a()
  {
    return ((Integer)d.get(0)).intValue();
  }
  
  public static int a(int paramInt)
  {
    int j = -1;
    Object localObject1 = b;
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = paramInt;
    b();
    paramInt = j;
    if (localObject1 != null) {
      localObject1 = ((List)localObject1).iterator();
    }
    label173:
    label178:
    label181:
    label184:
    for (;;)
    {
      paramInt = j;
      if (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (ajb)((Iterator)localObject1).next();
        if (((ajb)localObject2).a == null) {
          ((ajb)localObject2).a(false);
        }
        localObject2 = ((ajb)localObject2).a;
        int k = a();
        paramInt = arrayOfInt.length;
        localObject2 = ((TreeSet)localObject2).descendingIterator();
        int i = -1;
        paramInt--;
        if (!((Iterator)localObject2).hasNext()) {
          break label181;
        }
        int m = ((Integer)((Iterator)localObject2).next()).intValue();
        i = Math.max(i, m);
        while ((paramInt >= 0) && (arrayOfInt[paramInt] > m)) {
          paramInt--;
        }
        if (paramInt < 0) {
          break label181;
        }
        if (arrayOfInt[paramInt] != m) {
          break label178;
        }
        if (paramInt % 2 != 0) {
          break label173;
        }
        paramInt = Math.min(i, k);
      }
      for (;;)
      {
        if (paramInt == -1) {
          break label184;
        }
        return paramInt;
        paramInt = -1;
        continue;
        break;
        paramInt = -1;
      }
    }
  }
  
  public static afq a(Bundle paramBundle)
  {
    if (paramBundle == null) {
      paramBundle = null;
    }
    for (;;)
    {
      return paramBundle;
      Object localObject2 = paramBundle.getString("error_type");
      Object localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = paramBundle.getString("com.facebook.platform.status.ERROR_TYPE");
      }
      String str = paramBundle.getString("error_description");
      localObject2 = str;
      if (str == null) {
        localObject2 = paramBundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
      }
      if ((localObject1 != null) && (((String)localObject1).equalsIgnoreCase("UserCanceled"))) {
        paramBundle = new afr((String)localObject2);
      } else {
        paramBundle = new afq((String)localObject2);
      }
    }
  }
  
  public static Intent a(Context paramContext)
  {
    Iterator localIterator = b.iterator();
    Object localObject;
    if (localIterator.hasNext())
    {
      localObject = (ajb)localIterator.next();
      localObject = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((ajb)localObject).a()).addCategory("android.intent.category.DEFAULT");
      if (localObject == null)
      {
        localObject = null;
        label56:
        if (localObject == null) {
          break label98;
        }
      }
    }
    for (;;)
    {
      return (Intent)localObject;
      ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveService((Intent)localObject, 0);
      if (localResolveInfo == null)
      {
        localObject = null;
        break label56;
      }
      if (ajb.a(paramContext, localResolveInfo.serviceInfo.packageName)) {
        break label56;
      }
      localObject = null;
      break label56;
      label98:
      break;
      localObject = null;
    }
  }
  
  public static Intent a(Context paramContext, String paramString1, Collection paramCollection, String paramString2, boolean paramBoolean1, boolean paramBoolean2, ajy paramajy)
  {
    Iterator localIterator = b.iterator();
    Object localObject;
    if (localIterator.hasNext())
    {
      localObject = (ajb)localIterator.next();
      localObject = new Intent().setClassName(((ajb)localObject).a(), "com.facebook.katana.ProxyAuth").putExtra("client_id", paramString1);
      if (!aji.a(paramCollection)) {
        ((Intent)localObject).putExtra("scope", TextUtils.join(",", paramCollection));
      }
      if (!aji.a(paramString2)) {
        ((Intent)localObject).putExtra("e2e", paramString2);
      }
      ((Intent)localObject).putExtra("response_type", "token,signed_request");
      ((Intent)localObject).putExtra("return_scopes", "true");
      if (paramBoolean2) {
        ((Intent)localObject).putExtra("default_audience", paramajy.b);
      }
      ((Intent)localObject).putExtra("legacy_override", "v2.4");
      if (paramBoolean1) {
        ((Intent)localObject).putExtra("auth_type", "rerequest");
      }
      if (localObject == null)
      {
        localObject = null;
        label171:
        if (localObject == null) {
          break label221;
        }
      }
    }
    for (;;)
    {
      return (Intent)localObject;
      ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveActivity((Intent)localObject, 0);
      if (localResolveInfo == null)
      {
        localObject = null;
        break label171;
      }
      if (ajb.a(paramContext, localResolveInfo.activityInfo.packageName)) {
        break label171;
      }
      localObject = null;
      break label171;
      label221:
      break;
      localObject = null;
    }
  }
  
  public static Intent a(Intent paramIntent, Bundle paramBundle, afq paramafq)
  {
    Bundle localBundle1 = null;
    Intent localIntent = null;
    UUID localUUID = b(paramIntent);
    if (localUUID == null)
    {
      paramIntent = localIntent;
      return paramIntent;
    }
    localIntent = new Intent();
    localIntent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", paramIntent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0));
    Bundle localBundle2 = new Bundle();
    localBundle2.putString("action_id", localUUID.toString());
    if (paramafq != null)
    {
      if (paramafq != null) {
        break label114;
      }
      paramIntent = localBundle1;
    }
    for (;;)
    {
      localBundle2.putBundle("error", paramIntent);
      localIntent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", localBundle2);
      if (paramBundle != null) {
        localIntent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", paramBundle);
      }
      paramIntent = localIntent;
      break;
      label114:
      localBundle1 = new Bundle();
      localBundle1.putString("error_description", paramafq.toString());
      paramIntent = localBundle1;
      if ((paramafq instanceof afr))
      {
        localBundle1.putString("error_type", "UserCanceled");
        paramIntent = localBundle1;
      }
    }
  }
  
  public static Bundle a(Intent paramIntent)
  {
    if (!b(paramIntent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {}
    for (paramIntent = paramIntent.getExtras();; paramIntent = paramIntent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS")) {
      return paramIntent;
    }
  }
  
  /* Error */
  private static TreeSet b(ajb paramajb)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 128	java/util/TreeSet
    //   5: dup
    //   6: invokespecial 337	java/util/TreeSet:<init>	()V
    //   9: astore_3
    //   10: invokestatic 343	afv:f	()Landroid/content/Context;
    //   13: invokevirtual 347	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   16: astore_1
    //   17: ldc_w 349
    //   20: invokestatic 352	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   23: astore 5
    //   25: aload_0
    //   26: invokevirtual 180	ajb:a	()Ljava/lang/String;
    //   29: astore 4
    //   31: ldc_w 354
    //   34: invokestatic 352	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   37: astore 6
    //   39: new 356	java/lang/StringBuilder
    //   42: dup
    //   43: aload 5
    //   45: invokestatic 352	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   48: invokevirtual 359	java/lang/String:length	()I
    //   51: iconst_0
    //   52: iadd
    //   53: aload 4
    //   55: invokestatic 352	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   58: invokevirtual 359	java/lang/String:length	()I
    //   61: iadd
    //   62: aload 6
    //   64: invokestatic 352	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   67: invokevirtual 359	java/lang/String:length	()I
    //   70: iadd
    //   71: invokespecial 362	java/lang/StringBuilder:<init>	(I)V
    //   74: aload 5
    //   76: invokevirtual 366	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: aload 4
    //   81: invokevirtual 366	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: aload 6
    //   86: invokevirtual 366	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 367	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokestatic 373	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   95: astore 5
    //   97: invokestatic 343	afv:f	()Landroid/content/Context;
    //   100: invokevirtual 195	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   103: astore 4
    //   105: aload_0
    //   106: invokevirtual 180	ajb:a	()Ljava/lang/String;
    //   109: invokestatic 352	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   112: astore 6
    //   114: ldc_w 375
    //   117: invokestatic 352	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   120: astore_0
    //   121: aload_0
    //   122: invokevirtual 359	java/lang/String:length	()I
    //   125: ifeq +96 -> 221
    //   128: aload 6
    //   130: aload_0
    //   131: invokevirtual 378	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   134: astore_0
    //   135: aload 4
    //   137: aload_0
    //   138: iconst_0
    //   139: invokevirtual 382	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   142: ifnull +98 -> 240
    //   145: aload_1
    //   146: aload 5
    //   148: iconst_1
    //   149: anewarray 159	java/lang/String
    //   152: dup
    //   153: iconst_0
    //   154: ldc_w 384
    //   157: aastore
    //   158: aconst_null
    //   159: aconst_null
    //   160: aconst_null
    //   161: invokevirtual 390	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   164: astore_0
    //   165: aload_0
    //   166: astore_1
    //   167: aload_0
    //   168: ifnull +74 -> 242
    //   171: aload_0
    //   172: astore_1
    //   173: aload_0
    //   174: invokeinterface 395 1 0
    //   179: ifeq +63 -> 242
    //   182: aload_3
    //   183: aload_0
    //   184: aload_0
    //   185: ldc_w 384
    //   188: invokeinterface 399 2 0
    //   193: invokeinterface 402 2 0
    //   198: invokestatic 73	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   201: invokevirtual 403	java/util/TreeSet:add	(Ljava/lang/Object;)Z
    //   204: pop
    //   205: goto -34 -> 171
    //   208: astore_1
    //   209: aload_0
    //   210: ifnull +9 -> 219
    //   213: aload_0
    //   214: invokeinterface 406 1 0
    //   219: aload_1
    //   220: athrow
    //   221: new 159	java/lang/String
    //   224: dup
    //   225: aload 6
    //   227: invokespecial 407	java/lang/String:<init>	(Ljava/lang/String;)V
    //   230: astore_0
    //   231: goto -96 -> 135
    //   234: astore_1
    //   235: aload_2
    //   236: astore_0
    //   237: goto -28 -> 209
    //   240: aconst_null
    //   241: astore_1
    //   242: aload_1
    //   243: ifnull +9 -> 252
    //   246: aload_1
    //   247: invokeinterface 406 1 0
    //   252: aload_3
    //   253: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	paramajb	ajb
    //   16	157	1	localObject1	Object
    //   208	12	1	localObject2	Object
    //   234	1	1	localObject3	Object
    //   241	6	1	localObject4	Object
    //   1	235	2	localObject5	Object
    //   9	244	3	localTreeSet	TreeSet
    //   29	107	4	localObject6	Object
    //   23	124	5	localObject7	Object
    //   37	189	6	str	String
    // Exception table:
    //   from	to	target	type
    //   173	205	208	finally
    //   97	135	234	finally
    //   135	165	234	finally
    //   221	231	234	finally
  }
  
  private static UUID b(Intent paramIntent)
  {
    Object localObject2 = null;
    Object localObject1;
    if (paramIntent == null)
    {
      localObject1 = localObject2;
      return (UUID)localObject1;
    }
    if (b(paramIntent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0)))
    {
      paramIntent = paramIntent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
      if (paramIntent == null) {
        break label75;
      }
      paramIntent = paramIntent.getString("action_id");
    }
    for (;;)
    {
      localObject1 = localObject2;
      if (paramIntent == null) {
        break;
      }
      try
      {
        localObject1 = UUID.fromString(paramIntent);
      }
      catch (IllegalArgumentException paramIntent)
      {
        localObject1 = localObject2;
      }
      paramIntent = paramIntent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
      continue;
      break;
      label75:
      paramIntent = null;
    }
  }
  
  public static void b()
  {
    if (!c.compareAndSet(false, true)) {}
    for (;;)
    {
      return;
      afv.d().execute(new aiy());
    }
  }
  
  private static boolean b(int paramInt)
  {
    if ((d.contains(Integer.valueOf(paramInt))) && (paramInt >= 20140701)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */