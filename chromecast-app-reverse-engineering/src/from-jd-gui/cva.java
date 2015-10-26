import android.util.Base64;
import java.util.Map;

final class cva
  extends cvf
{
  private static final String b = cip.v.toString();
  private static final String c = cit.f.toString();
  private static final String d = cit.D.toString();
  private static final String e = cit.t.toString();
  private static final String f = cit.E.toString();
  
  public cva()
  {
    super(b, new String[] { c });
  }
  
  public final cje a(Map paramMap)
  {
    Object localObject = (cje)paramMap.get(c);
    if ((localObject == null) || (localObject == cyh.f())) {
      paramMap = cyh.f();
    }
    for (;;)
    {
      return paramMap;
      String str2 = cyh.a((cje)localObject);
      localObject = (cje)paramMap.get(e);
      String str1;
      label56:
      label76:
      int i;
      if (localObject == null)
      {
        str1 = "text";
        localObject = (cje)paramMap.get(f);
        if (localObject != null) {
          break label162;
        }
        localObject = "base16";
        int j = 2;
        paramMap = (cje)paramMap.get(d);
        i = j;
        if (paramMap != null)
        {
          i = j;
          if (cyh.d(paramMap).booleanValue()) {
            i = 3;
          }
        }
      }
      for (;;)
      {
        try
        {
          if ("text".equals(str1))
          {
            paramMap = str2.getBytes();
            if (!"base16".equals(localObject)) {
              break label272;
            }
            paramMap = a.b(paramMap);
            paramMap = cyh.a(paramMap);
            break;
            str1 = cyh.a((cje)localObject);
            break label56;
            label162:
            localObject = cyh.a((cje)localObject);
            break label76;
          }
          if ("base16".equals(str1))
          {
            paramMap = a.m(str2);
            continue;
          }
          if ("base64".equals(str1))
          {
            paramMap = Base64.decode(str2, i);
            continue;
          }
          if ("base64url".equals(str1))
          {
            paramMap = Base64.decode(str2, i | 0x8);
            continue;
          }
          paramMap = new java/lang/StringBuilder;
          paramMap.<init>("Encode: unknown input format: ");
          cuh.a(str1);
          paramMap = cyh.f();
        }
        catch (IllegalArgumentException paramMap)
        {
          cuh.a("Encode: invalid input:");
          paramMap = cyh.f();
        }
        break;
        label272:
        if ("base64".equals(localObject))
        {
          paramMap = Base64.encodeToString(paramMap, i);
        }
        else
        {
          if (!"base64url".equals(localObject)) {
            break label313;
          }
          paramMap = Base64.encodeToString(paramMap, i | 0x8);
        }
      }
      label313:
      cuh.a("Encode: unknown output format: " + (String)localObject);
      paramMap = cyh.f();
    }
  }
  
  public final boolean a()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cva.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */