import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class cuu
  extends cyf
{
  private static final String b = cip.P.toString();
  private static final String c = cit.e.toString();
  private static final String d = cit.n.toString();
  private static final String e = cit.m.toString();
  private static final String f = cit.l.toString();
  private static final String g = cit.d.toString();
  private static final String h = cit.G.toString();
  private static final String i = cit.H.toString();
  private static final String j = cit.I.toString();
  private static final List k = Arrays.asList(new String[] { "detail", "checkout", "checkout_option", "click", "add", "remove", "purchase", "refund" });
  private static final Pattern l = Pattern.compile("dimension(\\d+)");
  private static final Pattern m = Pattern.compile("metric(\\d+)");
  private static Map n;
  private static Map o;
  private final Set p;
  private final cyd q;
  private final ctw r;
  
  static
  {
    cit.a.toString();
  }
  
  public cuu(Context paramContext, ctw paramctw)
  {
    this(paramctw, new cyd(paramContext));
  }
  
  private cuu(ctw paramctw, cyd paramcyd)
  {
    super(b, new String[0]);
    this.r = paramctw;
    this.q = paramcyd;
    this.p = new HashSet();
    this.p.add("");
    this.p.add("0");
    this.p.add("false");
  }
  
  private static Double a(Object paramObject)
  {
    if ((paramObject instanceof String)) {}
    for (;;)
    {
      try
      {
        paramObject = Double.valueOf((String)paramObject);
        return (Double)paramObject;
      }
      catch (NumberFormatException paramObject)
      {
        throw new RuntimeException("Cannot convert the object to Double: " + ((NumberFormatException)paramObject).getMessage());
      }
      if ((paramObject instanceof Integer))
      {
        paramObject = Double.valueOf(((Integer)paramObject).doubleValue());
      }
      else
      {
        if (!(paramObject instanceof Double)) {
          break;
        }
        paramObject = (Double)paramObject;
      }
    }
    throw new RuntimeException("Cannot convert the object to Double: " + paramObject.toString());
  }
  
  private String a(String paramString)
  {
    paramString = this.r.b(paramString);
    if (paramString == null) {}
    for (paramString = null;; paramString = paramString.toString()) {
      return paramString;
    }
  }
  
  private static Map a(cje paramcje)
  {
    paramcje = cyh.e(paramcje);
    if (!(paramcje instanceof Map)) {
      paramcje = null;
    }
    for (;;)
    {
      return paramcje;
      Object localObject = (Map)paramcje;
      paramcje = new LinkedHashMap();
      Iterator localIterator = ((Map)localObject).entrySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (Map.Entry)localIterator.next();
        paramcje.put(((Map.Entry)localObject).getKey().toString(), ((Map.Entry)localObject).getValue().toString());
      }
    }
  }
  
  private void a(bps parambps, Map paramMap)
  {
    String str = a("transactionId");
    if (str == null) {
      cuh.a("Cannot find transactionId in data layer.");
    }
    for (;;)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      Map localMap;
      Object localObject2;
      for (;;)
      {
        try
        {
          localMap = b((cje)paramMap.get(g));
          localMap.put("&t", "transaction");
          localObject1 = (cje)paramMap.get(i);
          if (localObject1 != null)
          {
            localObject1 = a((cje)localObject1);
            localObject2 = ((Map)localObject1).entrySet().iterator();
            if (!((Iterator)localObject2).hasNext()) {
              break label247;
            }
            localObject1 = (Map.Entry)((Iterator)localObject2).next();
            a(localMap, (String)((Map.Entry)localObject1).getValue(), a((String)((Map.Entry)localObject1).getKey()));
            continue;
          }
        }
        catch (IllegalArgumentException parambps)
        {
          cuh.a("Unable to send transaction", parambps);
        }
        if (n == null)
        {
          localObject1 = new java/util/HashMap;
          ((HashMap)localObject1).<init>();
          ((HashMap)localObject1).put("transactionId", "&ti");
          ((HashMap)localObject1).put("transactionAffiliation", "&ta");
          ((HashMap)localObject1).put("transactionTax", "&tt");
          ((HashMap)localObject1).put("transactionShipping", "&ts");
          ((HashMap)localObject1).put("transactionTotal", "&tr");
          ((HashMap)localObject1).put("transactionCurrency", "&cu");
          n = (Map)localObject1;
        }
        localObject1 = n;
      }
      label247:
      localLinkedList.add(localMap);
      Object localObject1 = b("transactionProducts");
      if (localObject1 != null)
      {
        Iterator localIterator1 = ((List)localObject1).iterator();
        for (;;)
        {
          if (!localIterator1.hasNext()) {
            break label559;
          }
          localMap = (Map)localIterator1.next();
          if (localMap.get("name") == null)
          {
            cuh.a("Unable to send transaction item hit due to missing 'name' field.");
            break;
          }
          localObject2 = b((cje)paramMap.get(g));
          ((Map)localObject2).put("&t", "item");
          ((Map)localObject2).put("&ti", str);
          localObject1 = (cje)paramMap.get(j);
          if (localObject1 != null) {}
          for (localObject1 = a((cje)localObject1);; localObject1 = o)
          {
            Iterator localIterator2 = ((Map)localObject1).entrySet().iterator();
            while (localIterator2.hasNext())
            {
              localObject1 = (Map.Entry)localIterator2.next();
              a((Map)localObject2, (String)((Map.Entry)localObject1).getValue(), (String)localMap.get(((Map.Entry)localObject1).getKey()));
            }
            if (o == null)
            {
              localObject1 = new java/util/HashMap;
              ((HashMap)localObject1).<init>();
              ((HashMap)localObject1).put("name", "&in");
              ((HashMap)localObject1).put("sku", "&ic");
              ((HashMap)localObject1).put("category", "&iv");
              ((HashMap)localObject1).put("price", "&ip");
              ((HashMap)localObject1).put("quantity", "&iq");
              ((HashMap)localObject1).put("currency", "&cu");
              o = (Map)localObject1;
            }
          }
          localLinkedList.add(localObject2);
        }
      }
      label559:
      paramMap = localLinkedList.iterator();
      while (paramMap.hasNext()) {
        parambps.a((Map)paramMap.next());
      }
    }
  }
  
  private static void a(Map paramMap, String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  private static boolean a(Map paramMap, String paramString)
  {
    paramMap = (cje)paramMap.get(paramString);
    if (paramMap == null) {}
    for (boolean bool = false;; bool = cyh.d(paramMap).booleanValue()) {
      return bool;
    }
  }
  
  private static Integer b(Object paramObject)
  {
    if ((paramObject instanceof String)) {}
    for (;;)
    {
      try
      {
        paramObject = Integer.valueOf((String)paramObject);
        return (Integer)paramObject;
      }
      catch (NumberFormatException paramObject)
      {
        throw new RuntimeException("Cannot convert the object to Integer: " + ((NumberFormatException)paramObject).getMessage());
      }
      if ((paramObject instanceof Double))
      {
        paramObject = Integer.valueOf(((Double)paramObject).intValue());
      }
      else
      {
        if (!(paramObject instanceof Integer)) {
          break;
        }
        paramObject = (Integer)paramObject;
      }
    }
    throw new RuntimeException("Cannot convert the object to Integer: " + paramObject.toString());
  }
  
  private List b(String paramString)
  {
    Object localObject = this.r.b(paramString);
    if (localObject == null) {}
    for (paramString = null;; paramString = (List)localObject)
    {
      return paramString;
      if (!(localObject instanceof List)) {
        throw new IllegalArgumentException("transactionProducts should be of type List.");
      }
      paramString = ((List)localObject).iterator();
      while (paramString.hasNext()) {
        if (!(paramString.next() instanceof Map)) {
          throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
        }
      }
    }
  }
  
  private Map b(cje paramcje)
  {
    if (paramcje == null) {
      paramcje = new HashMap();
    }
    for (;;)
    {
      return paramcje;
      paramcje = a(paramcje);
      if (paramcje == null)
      {
        paramcje = new HashMap();
      }
      else
      {
        String str = (String)paramcje.get("&aip");
        if ((str != null) && (this.p.contains(str.toLowerCase()))) {
          paramcje.remove("&aip");
        }
      }
    }
  }
  
  private bpz c(Map paramMap)
  {
    bpz localbpz = new bpz();
    Object localObject = paramMap.get("id");
    if (localObject != null) {
      localbpz.a("id", String.valueOf(localObject));
    }
    localObject = paramMap.get("name");
    if (localObject != null) {
      localbpz.a("nm", String.valueOf(localObject));
    }
    localObject = paramMap.get("brand");
    if (localObject != null) {
      localbpz.a("br", String.valueOf(localObject));
    }
    localObject = paramMap.get("category");
    if (localObject != null) {
      localbpz.a("ca", String.valueOf(localObject));
    }
    localObject = paramMap.get("variant");
    if (localObject != null) {
      localbpz.a("va", String.valueOf(localObject));
    }
    localObject = paramMap.get("coupon");
    if (localObject != null) {
      localbpz.a("cc", String.valueOf(localObject));
    }
    localObject = paramMap.get("position");
    if (localObject != null) {
      localbpz.a("ps", Integer.toString(b(localObject).intValue()));
    }
    localObject = paramMap.get("price");
    if (localObject != null) {
      localbpz.a("pr", Double.toString(a(localObject).doubleValue()));
    }
    localObject = paramMap.get("quantity");
    if (localObject != null) {
      localbpz.a("qt", Integer.toString(b(localObject).intValue()));
    }
    localObject = paramMap.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      Matcher localMatcher1 = l.matcher(str);
      int i1;
      if (localMatcher1.matches())
      {
        try
        {
          i1 = Integer.parseInt(localMatcher1.group(1));
          str = String.valueOf(paramMap.get(str));
          localbpz.a(a.a("cd", i1), str);
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          cuh.b("illegal number in custom dimension value: " + str);
        }
      }
      else
      {
        Matcher localMatcher2 = m.matcher(str);
        if (localMatcher2.matches()) {
          try
          {
            int i2 = Integer.parseInt(localMatcher2.group(1));
            i1 = b(paramMap.get(str)).intValue();
            localbpz.a(a.a("cm", i2), Integer.toString(i1));
          }
          catch (NumberFormatException localNumberFormatException2)
          {
            cuh.b("illegal number in custom metric value: " + str);
          }
        }
      }
    }
    return localbpz;
  }
  
  public final void b(Map paramMap)
  {
    Object localObject1 = this.q;
    ((cyd)localObject1).a("_GTM_DEFAULT_TRACKER_");
    bps localbps = ((cyd)localObject1).a;
    localbps.a = a(paramMap, "collect_adid");
    bpq localbpq;
    if (a(paramMap, d))
    {
      localbpq = new bpq();
      localObject1 = b((cje)paramMap.get(g));
      if (localObject1 == null)
      {
        if (!a(paramMap, e)) {
          break label284;
        }
        paramMap = this.r.b("ecommerce");
        if (!(paramMap instanceof Map)) {
          break label1307;
        }
        paramMap = (Map)paramMap;
      }
    }
    for (;;)
    {
      label103:
      Object localObject3;
      Object localObject5;
      Object localObject6;
      label284:
      label315:
      Object localObject2;
      if (paramMap != null)
      {
        localObject3 = (String)((Map)localObject1).get("&cu");
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = (String)paramMap.get("currencyCode");
        }
        if (localObject1 != null) {
          localbpq.a("&cu", (String)localObject1);
        }
        localObject1 = paramMap.get("impressions");
        if ((localObject1 instanceof List))
        {
          localObject5 = ((List)localObject1).iterator();
          for (;;)
          {
            if (!((Iterator)localObject5).hasNext()) {
              break label389;
            }
            localObject1 = (Map)((Iterator)localObject5).next();
            try
            {
              localObject6 = c((Map)localObject1);
              localObject3 = (String)((Map)localObject1).get("list");
              if (localObject6 != null) {
                break label315;
              }
              bqk.a("product should be non-null");
            }
            catch (RuntimeException localRuntimeException1)
            {
              cuh.a("Failed to extract a product from DataLayer. " + localRuntimeException1.getMessage());
            }
            continue;
            localbpq.a.putAll(new HashMap(localRuntimeException1));
            break;
            paramMap = cyh.e((cje)paramMap.get(f));
            if (!(paramMap instanceof Map)) {
              break label1302;
            }
            paramMap = (Map)paramMap;
            break label103;
            localObject2 = localObject3;
            if (localObject3 == null) {
              localObject2 = "";
            }
            if (!localbpq.c.containsKey(localObject2))
            {
              localObject3 = localbpq.c;
              ArrayList localArrayList = new java/util/ArrayList;
              localArrayList.<init>();
              ((Map)localObject3).put(localObject2, localArrayList);
            }
            ((List)localbpq.c.get(localObject2)).add(localObject6);
          }
        }
        label389:
        if (paramMap.containsKey("promoClick")) {
          localObject2 = (List)((Map)paramMap.get("promoClick")).get("promotions");
        }
      }
      for (;;)
      {
        label671:
        label686:
        int i1;
        Object localObject4;
        if (localObject2 != null)
        {
          localObject2 = ((List)localObject2).iterator();
          for (;;)
          {
            if (!((Iterator)localObject2).hasNext()) {
              break label686;
            }
            localObject5 = (Map)((Iterator)localObject2).next();
            try
            {
              localObject3 = new bqb;
              ((bqb)localObject3).<init>();
              localObject6 = (String)((Map)localObject5).get("id");
              if (localObject6 != null) {
                ((bqb)localObject3).a("id", String.valueOf(localObject6));
              }
              localObject6 = (String)((Map)localObject5).get("name");
              if (localObject6 != null) {
                ((bqb)localObject3).a("nm", String.valueOf(localObject6));
              }
              localObject6 = (String)((Map)localObject5).get("creative");
              if (localObject6 != null) {
                ((bqb)localObject3).a("cr", String.valueOf(localObject6));
              }
              localObject5 = (String)((Map)localObject5).get("position");
              if (localObject5 != null) {
                ((bqb)localObject3).a("ps", String.valueOf(localObject5));
              }
              if (localObject3 != null) {
                break label671;
              }
              bqk.a("promotion should be non-null");
            }
            catch (RuntimeException localRuntimeException2)
            {
              cuh.a("Failed to extract a promotion from DataLayer. " + localRuntimeException2.getMessage());
            }
            continue;
            if (!paramMap.containsKey("promoView")) {
              break label1297;
            }
            localObject2 = (List)((Map)paramMap.get("promoView")).get("promotions");
            break;
            localbpq.d.add(localRuntimeException2);
          }
          if (paramMap.containsKey("promoClick"))
          {
            localbpq.a("&promoa", "click");
            i1 = 0;
            if (i1 == 0) {
              break label1184;
            }
            localObject2 = k.iterator();
            do
            {
              if (!((Iterator)localObject2).hasNext()) {
                break;
              }
              localObject4 = (String)((Iterator)localObject2).next();
            } while (!paramMap.containsKey(localObject4));
            paramMap = (Map)paramMap.get(localObject4);
            localObject2 = (List)paramMap.get("products");
            if (localObject2 == null) {
              break label895;
            }
            localObject2 = ((List)localObject2).iterator();
          }
        }
        for (;;)
        {
          if (!((Iterator)localObject2).hasNext()) {
            break label895;
          }
          localObject5 = (Map)((Iterator)localObject2).next();
          try
          {
            localObject5 = c((Map)localObject5);
            if (localObject5 != null) {
              break label879;
            }
            bqk.a("product should be non-null");
          }
          catch (RuntimeException localRuntimeException3)
          {
            cuh.a("Failed to extract a product from DataLayer. " + localRuntimeException3.getMessage());
          }
          continue;
          localbpq.a("&promoa", "view");
          i1 = 1;
          break;
          label879:
          localbpq.e.add(localRuntimeException3);
        }
        try
        {
          label895:
          if (!paramMap.containsKey("actionField")) {
            break label1195;
          }
          localObject2 = (Map)paramMap.get("actionField");
          paramMap = new bqa;
          paramMap.<init>((String)localObject4);
          localObject4 = ((Map)localObject2).get("id");
          if (localObject4 != null) {
            paramMap.a("&ti", String.valueOf(localObject4));
          }
          localObject4 = ((Map)localObject2).get("affiliation");
          if (localObject4 != null) {
            paramMap.a("&ta", String.valueOf(localObject4));
          }
          localObject4 = ((Map)localObject2).get("coupon");
          if (localObject4 != null) {
            paramMap.a("&tcc", String.valueOf(localObject4));
          }
          localObject4 = ((Map)localObject2).get("list");
          if (localObject4 != null) {
            paramMap.a("&pal", String.valueOf(localObject4));
          }
          localObject4 = ((Map)localObject2).get("option");
          if (localObject4 != null) {
            paramMap.a("&col", String.valueOf(localObject4));
          }
          localObject4 = ((Map)localObject2).get("revenue");
          if (localObject4 != null) {
            paramMap.a("&tr", Double.toString(a(localObject4).doubleValue()));
          }
          localObject4 = ((Map)localObject2).get("tax");
          if (localObject4 != null) {
            paramMap.a("&tt", Double.toString(a(localObject4).doubleValue()));
          }
          localObject4 = ((Map)localObject2).get("shipping");
          if (localObject4 != null) {
            paramMap.a("&ts", Double.toString(a(localObject4).doubleValue()));
          }
          localObject2 = ((Map)localObject2).get("step");
          if (localObject2 != null) {
            paramMap.a("&cos", Integer.toString(b(localObject2).intValue()));
          }
          localbpq.b = paramMap;
        }
        catch (RuntimeException paramMap)
        {
          for (;;)
          {
            label1184:
            cuh.a("Failed to extract a product action from DataLayer. " + paramMap.getMessage());
          }
        }
        localbps.a(localbpq.a());
        for (;;)
        {
          return;
          label1195:
          paramMap = new bqa((String)localObject4);
          break;
          if (a(paramMap, c)) {
            localbps.a(b((cje)paramMap.get(g)));
          } else if (a(paramMap, h)) {
            a(localbps, paramMap);
          } else {
            cuh.b("Ignoring unknown tag.");
          }
        }
        label1297:
        localObject2 = null;
      }
      label1302:
      paramMap = null;
      continue;
      label1307:
      paramMap = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cuu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */