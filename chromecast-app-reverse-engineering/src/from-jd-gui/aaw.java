import android.text.TextUtils;
import android.text.util.Rfc822Token;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.Collections;
import java.util.List;
import java.util.Set;

final class aaw
  extends Filter
{
  aaw(aav paramaav) {}
  
  public final CharSequence convertResultToString(Object paramObject)
  {
    paramObject = (acx)paramObject;
    String str2 = ((acx)paramObject).c;
    String str1 = ((acx)paramObject).d;
    paramObject = str1;
    if (!TextUtils.isEmpty(str2)) {
      if (!TextUtils.equals(str2, str1)) {
        break label36;
      }
    }
    label36:
    for (paramObject = str1;; paramObject = new Rfc822Token(str2, str1, null).toString()) {
      return (CharSequence)paramObject;
    }
  }
  
  /* Error */
  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 48	android/widget/Filter$FilterResults
    //   5: dup
    //   6: invokespecial 49	android/widget/Filter$FilterResults:<init>	()V
    //   9: astore 4
    //   11: aload_1
    //   12: invokestatic 31	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   15: ifeq +14 -> 29
    //   18: aload_0
    //   19: getfield 10	aaw:a	Laav;
    //   22: aconst_null
    //   23: putfield 55	aav:h	Ljava/util/List;
    //   26: aload 4
    //   28: areturn
    //   29: aload_0
    //   30: getfield 10	aaw:a	Laav;
    //   33: invokestatic 58	aav:a	(Laav;)Landroid/content/Context;
    //   36: aload_0
    //   37: getfield 10	aaw:a	Laav;
    //   40: invokestatic 62	aav:b	(Laav;)Ls;
    //   43: invokestatic 67	abe:a	(Landroid/content/Context;Ls;)Z
    //   46: ifne +14 -> 60
    //   49: aload_0
    //   50: getfield 10	aaw:a	Laav;
    //   53: aconst_null
    //   54: putfield 55	aav:h	Ljava/util/List;
    //   57: goto -31 -> 26
    //   60: aload_0
    //   61: getfield 10	aaw:a	Laav;
    //   64: aload_1
    //   65: aload_0
    //   66: getfield 10	aaw:a	Laav;
    //   69: getfield 70	aav:c	I
    //   72: aconst_null
    //   73: invokestatic 73	aav:a	(Laav;Ljava/lang/CharSequence;ILjava/lang/Long;)Landroid/database/Cursor;
    //   76: astore_2
    //   77: aload_2
    //   78: ifnull +135 -> 213
    //   81: new 75	java/util/LinkedHashMap
    //   84: astore_1
    //   85: aload_1
    //   86: invokespecial 76	java/util/LinkedHashMap:<init>	()V
    //   89: new 78	java/util/ArrayList
    //   92: astore_3
    //   93: aload_3
    //   94: invokespecial 79	java/util/ArrayList:<init>	()V
    //   97: new 81	java/util/HashSet
    //   100: astore 5
    //   102: aload 5
    //   104: invokespecial 82	java/util/HashSet:<init>	()V
    //   107: aload_2
    //   108: invokeinterface 88 1 0
    //   113: ifeq +41 -> 154
    //   116: new 90	abd
    //   119: astore 6
    //   121: aload 6
    //   123: aload_2
    //   124: aconst_null
    //   125: invokespecial 93	abd:<init>	(Landroid/database/Cursor;Ljava/lang/Long;)V
    //   128: aload 6
    //   130: iconst_1
    //   131: aload_1
    //   132: aload_3
    //   133: aload 5
    //   135: invokestatic 96	aav:b	(Labd;ZLjava/util/LinkedHashMap;Ljava/util/List;Ljava/util/Set;)V
    //   138: goto -31 -> 107
    //   141: astore_1
    //   142: aload_2
    //   143: ifnull +9 -> 152
    //   146: aload_2
    //   147: invokeinterface 99 1 0
    //   152: aload_1
    //   153: athrow
    //   154: aload_0
    //   155: getfield 10	aaw:a	Laav;
    //   158: aload_1
    //   159: aload_3
    //   160: invokestatic 102	aav:a	(Laav;Ljava/util/LinkedHashMap;Ljava/util/List;)Ljava/util/List;
    //   163: astore 6
    //   165: aload_0
    //   166: getfield 10	aaw:a	Laav;
    //   169: aload 5
    //   171: invokevirtual 105	aav:a	(Ljava/util/Set;)Ljava/util/List;
    //   174: astore 8
    //   176: new 107	aax
    //   179: astore 7
    //   181: aload 7
    //   183: aload 6
    //   185: aload_1
    //   186: aload_3
    //   187: aload 5
    //   189: aload 8
    //   191: invokespecial 110	aax:<init>	(Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/Set;Ljava/util/List;)V
    //   194: aload 4
    //   196: aload 7
    //   198: putfield 114	android/widget/Filter$FilterResults:values	Ljava/lang/Object;
    //   201: aload 4
    //   203: aload 6
    //   205: invokeinterface 120 1 0
    //   210: putfield 123	android/widget/Filter$FilterResults:count	I
    //   213: aload_2
    //   214: ifnull +9 -> 223
    //   217: aload_2
    //   218: invokeinterface 99 1 0
    //   223: goto -197 -> 26
    //   226: astore_1
    //   227: aload_3
    //   228: astore_2
    //   229: goto -87 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	232	0	this	aaw
    //   0	232	1	paramCharSequence	CharSequence
    //   76	153	2	localObject1	Object
    //   1	227	3	localArrayList	java.util.ArrayList
    //   9	193	4	localFilterResults	Filter.FilterResults
    //   100	88	5	localHashSet	java.util.HashSet
    //   119	85	6	localObject2	Object
    //   179	18	7	localaax	aax
    //   174	16	8	localList	List
    // Exception table:
    //   from	to	target	type
    //   81	107	141	finally
    //   107	138	141	finally
    //   154	213	141	finally
    //   60	77	226	finally
  }
  
  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    this.a.j = paramCharSequence;
    this.a.h = null;
    if (paramFilterResults.values != null)
    {
      Object localObject = (aax)paramFilterResults.values;
      aav.a(this.a, ((aax)localObject).b);
      aav.a(this.a, ((aax)localObject).c);
      aav.a(this.a, ((aax)localObject).d);
      paramFilterResults = this.a;
      int j = ((aax)localObject).a.size();
      if (((aax)localObject).e == null) {}
      int k;
      for (int i = 0;; i = ((aax)localObject).e.size())
      {
        paramFilterResults.a(j, i);
        this.a.a(((aax)localObject).a);
        if (((aax)localObject).e == null) {
          break label260;
        }
        int m = this.a.c;
        j = ((aax)localObject).d.size();
        paramFilterResults = this.a;
        localObject = ((aax)localObject).e;
        k = ((List)localObject).size();
        for (i = 1; i < k; i++)
        {
          abb localabb = (abb)((List)localObject).get(i);
          if (localabb.e == null) {
            localabb.e = new aaz(paramFilterResults, localabb);
          }
          localabb.e.a(m - j);
          localabb.e.filter(paramCharSequence);
        }
      }
      paramFilterResults.i = (k - 1);
      paramFilterResults.l.a();
    }
    for (;;)
    {
      label260:
      return;
      this.a.a(Collections.emptyList());
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aaw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */