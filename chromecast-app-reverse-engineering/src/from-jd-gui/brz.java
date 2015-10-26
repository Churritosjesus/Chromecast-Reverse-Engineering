import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

public final class brz
{
  private final brb a;
  private Boolean b;
  private String c;
  private Set d;
  
  protected brz(brb parambrb)
  {
    a.c(parambrb);
    this.a = parambrb;
  }
  
  public static boolean b()
  {
    return ((Boolean)bqd.a.a()).booleanValue();
  }
  
  public static int c()
  {
    return ((Integer)bqd.r.a()).intValue();
  }
  
  public static long d()
  {
    return ((Long)bqd.f.a()).longValue();
  }
  
  public static long e()
  {
    return ((Long)bqd.g.a()).longValue();
  }
  
  public static int f()
  {
    return ((Integer)bqd.i.a()).intValue();
  }
  
  public static int g()
  {
    return ((Integer)bqd.j.a()).intValue();
  }
  
  public static String h()
  {
    return (String)bqd.l.a();
  }
  
  public static String i()
  {
    return (String)bqd.k.a();
  }
  
  public static String j()
  {
    return (String)bqd.m.a();
  }
  
  public static long l()
  {
    return ((Long)bqd.y.a()).longValue();
  }
  
  /* Error */
  public final boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 86	brz:b	Ljava/lang/Boolean;
    //   4: ifnonnull +146 -> 150
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 86	brz:b	Ljava/lang/Boolean;
    //   13: ifnonnull +135 -> 148
    //   16: aload_0
    //   17: getfield 23	brz:a	Lbrb;
    //   20: getfield 91	brb:a	Landroid/content/Context;
    //   23: astore_2
    //   24: aload_2
    //   25: invokevirtual 97	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   28: astore_1
    //   29: aload_1
    //   30: ifnull +92 -> 122
    //   33: aload_1
    //   34: getfield 102	android/content/pm/ApplicationInfo:processName	Ljava/lang/String;
    //   37: astore_1
    //   38: aload_2
    //   39: ldc 104
    //   41: invokevirtual 108	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   44: checkcast 110	android/app/ActivityManager
    //   47: astore_2
    //   48: aload_2
    //   49: ifnull +73 -> 122
    //   52: invokestatic 115	android/os/Process:myPid	()I
    //   55: istore 4
    //   57: aload_2
    //   58: invokevirtual 119	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   61: invokeinterface 125 1 0
    //   66: astore_2
    //   67: aload_2
    //   68: invokeinterface 130 1 0
    //   73: ifeq +49 -> 122
    //   76: aload_2
    //   77: invokeinterface 133 1 0
    //   82: checkcast 135	android/app/ActivityManager$RunningAppProcessInfo
    //   85: astore_3
    //   86: iload 4
    //   88: aload_3
    //   89: getfield 139	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   92: if_icmpne -25 -> 67
    //   95: aload_1
    //   96: ifnull +62 -> 158
    //   99: aload_1
    //   100: aload_3
    //   101: getfield 140	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   104: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   107: ifeq +51 -> 158
    //   110: iconst_1
    //   111: istore 5
    //   113: aload_0
    //   114: iload 5
    //   116: invokestatic 148	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   119: putfield 86	brz:b	Ljava/lang/Boolean;
    //   122: aload_0
    //   123: getfield 86	brz:b	Ljava/lang/Boolean;
    //   126: ifnonnull +22 -> 148
    //   129: aload_0
    //   130: getstatic 151	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   133: putfield 86	brz:b	Ljava/lang/Boolean;
    //   136: aload_0
    //   137: getfield 23	brz:a	Lbrb;
    //   140: invokevirtual 154	brb:a	()Lbql;
    //   143: ldc -100
    //   145: invokevirtual 161	bql:f	(Ljava/lang/String;)V
    //   148: aload_0
    //   149: monitorexit
    //   150: aload_0
    //   151: getfield 86	brz:b	Ljava/lang/Boolean;
    //   154: invokevirtual 40	java/lang/Boolean:booleanValue	()Z
    //   157: ireturn
    //   158: iconst_0
    //   159: istore 5
    //   161: goto -48 -> 113
    //   164: astore_1
    //   165: aload_0
    //   166: monitorexit
    //   167: aload_1
    //   168: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	this	brz
    //   28	72	1	localObject1	Object
    //   164	4	1	localObject2	Object
    //   23	54	2	localObject3	Object
    //   85	16	3	localRunningAppProcessInfo	android.app.ActivityManager.RunningAppProcessInfo
    //   55	38	4	i	int
    //   111	49	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   9	29	164	finally
    //   33	48	164	finally
    //   52	67	164	finally
    //   67	95	164	finally
    //   99	110	164	finally
    //   113	122	164	finally
    //   122	148	164	finally
    //   148	150	164	finally
    //   165	167	164	finally
  }
  
  public final Set k()
  {
    String str1 = (String)bqd.u.a();
    String[] arrayOfString;
    HashSet localHashSet;
    int j;
    int i;
    if ((this.d == null) || (this.c == null) || (!this.c.equals(str1)))
    {
      arrayOfString = TextUtils.split(str1, ",");
      localHashSet = new HashSet();
      j = arrayOfString.length;
      i = 0;
    }
    for (;;)
    {
      String str2;
      if (i < j) {
        str2 = arrayOfString[i];
      }
      try
      {
        localHashSet.add(Integer.valueOf(Integer.parseInt(str2)));
        i++;
        continue;
        this.c = str1;
        this.d = localHashSet;
        return this.d;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\brz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */