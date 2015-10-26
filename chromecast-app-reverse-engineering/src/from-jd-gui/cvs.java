import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class cvs
  extends cvf
{
  private static final String b = cip.z.toString();
  private static final String c = cit.f.toString();
  private static final String d = cit.w.toString();
  private static final String e = cit.x.toString();
  private static final String f = cit.o.toString();
  
  public cvs()
  {
    super(b, new String[] { c });
  }
  
  private static String a(String paramString, int paramInt, Set paramSet)
  {
    switch (cvt.a[(paramInt - 1)])
    {
    }
    for (;;)
    {
      return paramString;
      try
      {
        paramSet = a.l(paramString);
        paramString = paramSet;
      }
      catch (UnsupportedEncodingException paramSet)
      {
        cuh.a("Joiner: unsupported encoding", paramSet);
      }
      continue;
      paramString = paramString.replace("\\", "\\\\");
      paramSet = paramSet.iterator();
      while (paramSet.hasNext())
      {
        String str = ((Character)paramSet.next()).toString();
        paramString = paramString.replace(str, "\\" + str);
      }
    }
  }
  
  private void a(StringBuilder paramStringBuilder, String paramString, int paramInt, Set paramSet)
  {
    paramStringBuilder.append(a(paramString, paramInt, paramSet));
  }
  
  private static void a(Set paramSet, String paramString)
  {
    for (int i = 0; i < paramString.length(); i++) {
      paramSet.add(Character.valueOf(paramString.charAt(i)));
    }
  }
  
  public final cje a(Map paramMap)
  {
    Object localObject3 = (cje)paramMap.get(c);
    if (localObject3 == null)
    {
      paramMap = cyh.f();
      return paramMap;
    }
    Object localObject1 = (cje)paramMap.get(d);
    label47:
    Object localObject2;
    label69:
    int i;
    if (localObject1 != null)
    {
      localObject1 = cyh.a((cje)localObject1);
      localObject2 = (cje)paramMap.get(e);
      if (localObject2 == null) {
        break label180;
      }
      localObject2 = cyh.a((cje)localObject2);
      i = cvu.a;
      paramMap = (cje)paramMap.get(f);
      if (paramMap == null) {
        break label411;
      }
      paramMap = cyh.a(paramMap);
      if (!"url".equals(paramMap)) {
        break label186;
      }
      i = cvu.b;
      paramMap = null;
    }
    for (;;)
    {
      label112:
      StringBuilder localStringBuilder = new StringBuilder();
      switch (((cje)localObject3).a)
      {
      default: 
        a(localStringBuilder, cyh.a((cje)localObject3), i, paramMap);
      }
      for (;;)
      {
        paramMap = cyh.a(localStringBuilder.toString());
        break;
        localObject1 = "";
        break label47;
        label180:
        localObject2 = "=";
        break label69;
        label186:
        if ("backslash".equals(paramMap))
        {
          i = cvu.c;
          paramMap = new HashSet();
          a(paramMap, (String)localObject1);
          a(paramMap, (String)localObject2);
          paramMap.remove(Character.valueOf('\\'));
          break label112;
        }
        cuh.a("Joiner: unsupported escape type: " + paramMap);
        paramMap = cyh.f();
        break;
        int j = 1;
        localObject3 = ((cje)localObject3).c;
        int m = localObject3.length;
        int k = 0;
        while (k < m)
        {
          localObject2 = localObject3[k];
          if (j == 0) {
            localStringBuilder.append((String)localObject1);
          }
          a(localStringBuilder, cyh.a((cje)localObject2), i, paramMap);
          k++;
          j = 0;
        }
        for (j = 0; j < ((cje)localObject3).d.length; j++)
        {
          if (j > 0) {
            localStringBuilder.append((String)localObject1);
          }
          String str1 = cyh.a(localObject3.d[j]);
          String str2 = cyh.a(localObject3.e[j]);
          a(localStringBuilder, str1, i, paramMap);
          localStringBuilder.append((String)localObject2);
          a(localStringBuilder, str2, i, paramMap);
        }
      }
      label411:
      paramMap = null;
    }
  }
  
  public final boolean a()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cvs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */