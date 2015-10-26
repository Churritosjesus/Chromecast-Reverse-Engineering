import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class cxi
{
  private static final cwj a = new cwj(cyh.f(), true);
  private final clz b;
  private final cvd c;
  private final Map d;
  private final Map e;
  private final Map f;
  private final cyt g;
  private final cyt h;
  private final Set i;
  private final ctw j;
  private final Map k;
  private volatile String l;
  private int m;
  
  public cxi(Context paramContext, clz paramclz, ctw paramctw, czd paramczd1, czd paramczd2, cvd paramcvd)
  {
    if (paramclz == null) {
      throw new NullPointerException("resource cannot be null");
    }
    this.b = paramclz;
    this.i = new HashSet(paramclz.a);
    this.j = paramctw;
    this.c = paramcvd;
    paramclz = new cxj(this);
    this.g = new cyu().a(1048576, paramclz);
    paramclz = new cxk(this);
    this.h = new cyu().a(1048576, paramclz);
    this.d = new HashMap();
    b(new cyq(paramContext));
    b(new czc(paramczd2));
    b(new czm(paramctw));
    b(new cuu(paramContext, paramctw));
    b(new cyb(paramContext, paramctw));
    this.e = new HashMap();
    c(new cza());
    c(new cvb());
    c(new cue());
    c(new cvg());
    c(new cvh());
    c(new cvx());
    c(new cvy());
    c(new cws());
    c(new cxy());
    this.f = new HashMap();
    a(new cwa(paramContext));
    a(new cww(paramContext));
    a(new cyl(paramContext));
    a(new cym(paramContext));
    a(new cyn(paramContext));
    a(new cyo(paramContext));
    a(new cyp(paramContext));
    a(new cyx());
    a(new cyz(this.b.c));
    a(new czc(paramczd1));
    a(new czf(paramctw));
    a(new czn(paramContext));
    a(new czo());
    a(new cva());
    a(new cve(this));
    a(new cvi());
    a(new cvj());
    a(new cvq(paramContext));
    a(new cvs());
    a(new cug());
    a(new cwd());
    a(new cwf(paramContext));
    a(new cwk());
    a(new cwo());
    a(new cwp());
    a(new cwr());
    a(new cwt(paramContext));
    a(new cxq());
    a(new cxr());
    a(new cya());
    a(new cyi());
    this.k = new HashMap();
    paramczd1 = this.i.iterator();
    while (paramczd1.hasNext())
    {
      paramctw = (cmb)paramczd1.next();
      for (int n = 0; n < paramctw.e.size(); n++)
      {
        paramcvd = (clx)paramctw.e.get(n);
        paramczd2 = a(this.k, a(paramcvd));
        paramczd2.a(paramctw);
        paramclz = (List)paramczd2.b.get(paramctw);
        paramContext = paramclz;
        if (paramclz == null)
        {
          paramContext = new ArrayList();
          paramczd2.b.put(paramctw, paramContext);
        }
        paramContext.add(paramcvd);
        paramclz = (List)paramczd2.d.get(paramctw);
        paramContext = paramclz;
        if (paramclz == null)
        {
          paramContext = new ArrayList();
          paramczd2.d.put(paramctw, paramContext);
        }
        paramContext.add("Unknown");
      }
      for (n = 0; n < paramctw.f.size(); n++)
      {
        paramcvd = (clx)paramctw.f.get(n);
        paramczd2 = a(this.k, a(paramcvd));
        paramczd2.a(paramctw);
        paramclz = (List)paramczd2.c.get(paramctw);
        paramContext = paramclz;
        if (paramclz == null)
        {
          paramContext = new ArrayList();
          paramczd2.c.put(paramctw, paramContext);
        }
        paramContext.add(paramcvd);
        paramclz = (List)paramczd2.e.get(paramctw);
        paramContext = paramclz;
        if (paramclz == null)
        {
          paramContext = new ArrayList();
          paramczd2.e.put(paramctw, paramContext);
        }
        paramContext.add("Unknown");
      }
    }
    paramContext = this.b.b.entrySet().iterator();
    while (paramContext.hasNext())
    {
      paramctw = (Map.Entry)paramContext.next();
      paramczd1 = ((List)paramctw.getValue()).iterator();
      while (paramczd1.hasNext())
      {
        paramclz = (clx)paramczd1.next();
        if (!cyh.d((cje)Collections.unmodifiableMap(paramclz.a).get(cit.C.toString())).booleanValue()) {
          a(this.k, (String)paramctw.getKey()).f = paramclz;
        }
      }
    }
  }
  
  private cwj a(cje paramcje, Set paramSet, cyj paramcyj)
  {
    if (!paramcje.l) {
      paramcje = new cwj(paramcje, true);
    }
    for (;;)
    {
      return paramcje;
      Object localObject2;
      int n;
      Object localObject1;
      switch (paramcje.a)
      {
      case 5: 
      case 6: 
      default: 
        cuh.a("Unknown type: " + paramcje.a);
        paramcje = a;
        break;
      case 2: 
        localObject2 = a.a(paramcje);
        ((cje)localObject2).c = new cje[paramcje.c.length];
        for (n = 0;; n++)
        {
          if (n >= paramcje.c.length) {
            break label177;
          }
          localObject1 = a(paramcje.c[n], paramSet, paramcyj.a());
          if (localObject1 == a)
          {
            paramcje = a;
            break;
          }
          ((cje)localObject2).c[n] = ((cje)((cwj)localObject1).a);
        }
        paramcje = new cwj(localObject2, false);
        break;
      case 3: 
        cje localcje = a.a(paramcje);
        if (paramcje.d.length != paramcje.e.length)
        {
          cuh.a("Invalid serving value: " + paramcje.toString());
          paramcje = a;
        }
        else
        {
          localcje.d = new cje[paramcje.d.length];
          localcje.e = new cje[paramcje.d.length];
          for (n = 0;; n++)
          {
            if (n >= paramcje.d.length) {
              break label376;
            }
            localObject2 = a(paramcje.d[n], paramSet, paramcyj.b());
            localObject1 = a(paramcje.e[n], paramSet, paramcyj.c());
            if ((localObject2 == a) || (localObject1 == a))
            {
              paramcje = a;
              break;
            }
            localcje.d[n] = ((cje)((cwj)localObject2).a);
            localcje.e[n] = ((cje)((cwj)localObject1).a);
          }
          paramcje = new cwj(localcje, false);
        }
        break;
      case 4: 
        if (paramSet.contains(paramcje.f))
        {
          cuh.a("Macro cycle detected.  Current macro reference: " + paramcje.f + ".  Previous macro references: " + paramSet.toString() + ".");
          paramcje = a;
        }
        else
        {
          paramSet.add(paramcje.f);
          paramcyj = a.a(a(paramcje.f, paramSet, paramcyj.e()), paramcje.k);
          paramSet.remove(paramcje.f);
          paramcje = paramcyj;
        }
        break;
      case 7: 
        label177:
        label376:
        localObject1 = a.a(paramcje);
        ((cje)localObject1).j = new cje[paramcje.j.length];
        for (n = 0;; n++)
        {
          if (n >= paramcje.j.length) {
            break label587;
          }
          localObject2 = a(paramcje.j[n], paramSet, paramcyj.d());
          if (localObject2 == a)
          {
            paramcje = a;
            break;
          }
          ((cje)localObject1).j[n] = ((cje)((cwj)localObject2).a);
        }
        label587:
        paramcje = new cwj(localObject1, false);
      }
    }
  }
  
  private cwj a(clx paramclx, Set paramSet, cwu paramcwu)
  {
    paramSet = a(this.e, paramclx, paramSet, paramcwu);
    paramclx = cyh.d((cje)paramSet.a);
    cyh.a(paramclx);
    return new cwj(paramclx, paramSet.b);
  }
  
  private cwj a(cmb paramcmb, Set paramSet, cwy paramcwy)
  {
    Iterator localIterator = paramcmb.b.iterator();
    boolean bool = true;
    cwj localcwj;
    if (localIterator.hasNext())
    {
      localcwj = a((clx)localIterator.next(), paramSet, paramcwy.a());
      if (((Boolean)localcwj.a).booleanValue())
      {
        cyh.a(Boolean.valueOf(false));
        paramcmb = new cwj(Boolean.valueOf(false), localcwj.b);
      }
    }
    for (;;)
    {
      return paramcmb;
      if ((bool) && (localcwj.b)) {}
      for (bool = true;; bool = false) {
        break;
      }
      paramcmb = paramcmb.a.iterator();
      if (paramcmb.hasNext())
      {
        localcwj = a((clx)paramcmb.next(), paramSet, paramcwy.b());
        if (!((Boolean)localcwj.a).booleanValue())
        {
          cyh.a(Boolean.valueOf(false));
          paramcmb = new cwj(Boolean.valueOf(false), localcwj.b);
        }
        else
        {
          if ((bool) && (localcwj.b)) {}
          for (bool = true;; bool = false) {
            break;
          }
        }
      }
      else
      {
        cyh.a(Boolean.valueOf(true));
        paramcmb = new cwj(Boolean.valueOf(true), bool);
      }
    }
  }
  
  private cwj a(String paramString, Set paramSet, cwe paramcwe)
  {
    this.m += 1;
    Object localObject = (cxo)this.h.a(paramString);
    if (localObject != null)
    {
      a(((cxo)localObject).b, paramSet);
      this.m -= 1;
    }
    for (paramString = ((cxo)localObject).a;; paramString = a)
    {
      return paramString;
      localObject = (cxp)this.k.get(paramString);
      if (localObject != null) {
        break;
      }
      cuh.a(b() + "Invalid macro: " + paramString);
      this.m -= 1;
    }
    cwj localcwj = a(((cxp)localObject).a, ((cxp)localObject).b, ((cxp)localObject).d, ((cxp)localObject).c, ((cxp)localObject).e, paramSet, paramcwe.b());
    if (((Set)localcwj.a).isEmpty()) {}
    for (localObject = ((cxp)localObject).f;; localObject = (clx)((Set)localcwj.a).iterator().next())
    {
      if (localObject != null) {
        break label279;
      }
      this.m -= 1;
      paramString = a;
      break;
      if (((Set)localcwj.a).size() > 1) {
        cuh.b(b() + "Multiple macros active for macroName " + paramString);
      }
    }
    label279:
    paramcwe = a(this.f, (clx)localObject, paramSet, paramcwe.a());
    boolean bool;
    if ((localcwj.b) && (paramcwe.b))
    {
      bool = true;
      label313:
      if (paramcwe != a) {
        break label386;
      }
    }
    label386:
    for (paramcwe = a;; paramcwe = new cwj(paramcwe.a, bool))
    {
      localObject = ((clx)localObject).b;
      if (paramcwe.b) {
        this.h.a(paramString, new cxo(paramcwe, (cje)localObject));
      }
      a((cje)localObject, paramSet);
      this.m -= 1;
      paramString = paramcwe;
      break;
      bool = false;
      break label313;
    }
  }
  
  private cwj a(Map paramMap, clx paramclx, Set paramSet, cwu paramcwu)
  {
    Object localObject1 = (cje)Collections.unmodifiableMap(paramclx.a).get(cit.p.toString());
    if (localObject1 == null)
    {
      cuh.a("No function id in properties");
      paramMap = a;
    }
    cvf localcvf;
    int n;
    for (;;)
    {
      return paramMap;
      String str = ((cje)localObject1).g;
      localcvf = (cvf)paramMap.get(str);
      if (localcvf == null)
      {
        cuh.a(str + " has no backing implementation.");
        paramMap = a;
      }
      else
      {
        localObject1 = (cwj)this.g.a(paramclx);
        paramMap = (Map)localObject1;
        if (localObject1 == null)
        {
          paramMap = new HashMap();
          n = 1;
          localObject1 = Collections.unmodifiableMap(paramclx.a).entrySet().iterator();
          if (((Iterator)localObject1).hasNext())
          {
            Map.Entry localEntry = (Map.Entry)((Iterator)localObject1).next();
            localEntry.getKey();
            Object localObject3 = paramcwu.a();
            Object localObject2 = (cje)localEntry.getValue();
            localEntry.getValue();
            localObject3 = a((cje)localObject2, paramSet, ((cwx)localObject3).a());
            if (localObject3 == a)
            {
              paramMap = a;
            }
            else
            {
              if (((cwj)localObject3).b)
              {
                localObject2 = (String)localEntry.getKey();
                cje localcje = (cje)((cwj)localObject3).a;
                paramclx.a.put(localObject2, localcje);
              }
              for (;;)
              {
                paramMap.put(localEntry.getKey(), ((cwj)localObject3).a);
                break;
                n = 0;
              }
            }
          }
          else
          {
            if (paramMap.keySet().containsAll(localcvf.a)) {
              break;
            }
            cuh.a("Incorrect keys for function " + str + " required " + localcvf.b() + " had " + paramMap.keySet());
            paramMap = a;
          }
        }
      }
    }
    if ((n != 0) && (localcvf.a())) {}
    for (boolean bool = true;; bool = false)
    {
      paramMap = new cwj(localcvf.a(paramMap), bool);
      if (bool) {
        this.g.a(paramclx, paramMap);
      }
      break;
    }
  }
  
  private cwj a(Set paramSet1, Map paramMap1, Map paramMap2, Map paramMap3, Map paramMap4, Set paramSet2, cxh paramcxh)
  {
    return a(paramSet1, paramSet2, new cxl(this, paramMap1, paramMap2, paramMap3, paramMap4), paramcxh);
  }
  
  private cwj a(Set paramSet1, Set paramSet2, cxn paramcxn, cxh paramcxh)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    Iterator localIterator = paramSet1.iterator();
    boolean bool = true;
    if (localIterator.hasNext())
    {
      paramSet1 = (cmb)localIterator.next();
      cwy localcwy = paramcxh.a();
      cwj localcwj = a(paramSet1, paramSet2, localcwy);
      if (((Boolean)localcwj.a).booleanValue()) {
        paramcxn.a(paramSet1, localHashSet1, localHashSet2, localcwy);
      }
      if ((bool) && (localcwj.b)) {}
      for (bool = true;; bool = false) {
        break;
      }
    }
    localHashSet1.removeAll(localHashSet2);
    return new cwj(localHashSet1, bool);
  }
  
  private static cxp a(Map paramMap, String paramString)
  {
    cxp localcxp2 = (cxp)paramMap.get(paramString);
    cxp localcxp1 = localcxp2;
    if (localcxp2 == null)
    {
      localcxp1 = new cxp();
      paramMap.put(paramString, localcxp1);
    }
    return localcxp1;
  }
  
  private static String a(clx paramclx)
  {
    return cyh.a((cje)Collections.unmodifiableMap(paramclx.a).get(cit.u.toString()));
  }
  
  private void a(cje paramcje, Set paramSet)
  {
    if (paramcje == null) {}
    for (;;)
    {
      return;
      paramcje = a(paramcje, paramSet, new cyj());
      if (paramcje != a)
      {
        paramcje = cyh.e((cje)paramcje.a);
        if ((paramcje instanceof Map))
        {
          paramcje = (Map)paramcje;
          this.j.a(paramcje);
        }
        else if ((paramcje instanceof List))
        {
          paramcje = ((List)paramcje).iterator();
          while (paramcje.hasNext())
          {
            paramSet = paramcje.next();
            if ((paramSet instanceof Map))
            {
              paramSet = (Map)paramSet;
              this.j.a(paramSet);
            }
            else
            {
              cuh.b("pushAfterEvaluate: value not a Map");
            }
          }
        }
        else
        {
          cuh.b("pushAfterEvaluate: value not a Map or List");
        }
      }
    }
  }
  
  private void a(cvf paramcvf)
  {
    a(this.f, paramcvf);
  }
  
  private static void a(Map paramMap, cvf paramcvf)
  {
    if (paramMap.containsKey(paramcvf.c())) {
      throw new IllegalArgumentException("Duplicate function type name: " + paramcvf.c());
    }
    paramMap.put(paramcvf.c(), paramcvf);
  }
  
  private String b()
  {
    if (this.m <= 1) {}
    for (Object localObject = "";; localObject = ((StringBuilder)localObject).toString())
    {
      return (String)localObject;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(Integer.toString(this.m));
      for (int n = 2; n < this.m; n++) {
        ((StringBuilder)localObject).append(' ');
      }
      ((StringBuilder)localObject).append(": ");
    }
  }
  
  private void b(cvf paramcvf)
  {
    a(this.d, paramcvf);
  }
  
  private void c(cvf paramcvf)
  {
    a(this.e, paramcvf);
  }
  
  private void c(String paramString)
  {
    try
    {
      this.l = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  final String a()
  {
    try
    {
      String str = this.l;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      c(paramString);
      paramString = this.c.b().b();
      Object localObject4 = this.i;
      Object localObject2 = paramString.b();
      Object localObject3 = new java/util/HashSet;
      ((HashSet)localObject3).<init>();
      Object localObject1 = new cxm;
      ((cxm)localObject1).<init>(this);
      localObject2 = ((Set)a((Set)localObject4, (Set)localObject3, (cxn)localObject1, (cxh)localObject2).a).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = (clx)((Iterator)localObject2).next();
        localObject3 = this.d;
        localObject1 = new java/util/HashSet;
        ((HashSet)localObject1).<init>();
        a((Map)localObject3, (clx)localObject4, (Set)localObject1, paramString.a());
      }
      c(null);
    }
    finally {}
  }
  
  public final void a(List paramList)
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = paramList.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        cjc localcjc = (cjc)localIterator.next();
        if ((localcjc.a == null) || (!localcjc.a.startsWith("gaExperiment:")))
        {
          paramList = new java/lang/StringBuilder;
          paramList.<init>("Ignored supplemental: ");
          cuh.e(localcjc);
        }
        else
        {
          a.a(this.j, localcjc);
        }
      }
      finally {}
    }
  }
  
  public final cwj b(String paramString)
  {
    this.m = 0;
    cvc localcvc = this.c.a();
    return a(paramString, new HashSet(), localcvc.a());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cxi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */