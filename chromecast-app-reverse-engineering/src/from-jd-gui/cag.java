import java.util.HashSet;
import java.util.Set;

final class cag
{
  static final cah[] a;
  private static cah[] b = { cdr.a[0], cdu.a[0], ccz.a[0], cgs.a[0], cal.a[0], cgj.a[0], cdc.a[0], cba.a[0], cgp.a[0], cgm.a[0], ccw.a[0], cch.a[0], cdj.a[0], chj.a[0], cce.a[0], cdl.a[0], cfe.a[0], cax.a[0], ceq.a[0], cet.a[0], ceh.a[0], cai.a[0], cbm.a[0], cbg.a[0], cbj.a[0], cen.a[0], cfo.a[0], chv.a[0], chy.a[0], ccq.a[0], cbv.a[0], cfw.a[0], cfw.a[1], chm.a[0], chg.a[0], cfr.a[0], cfl.a[0], cfb.a[0], cbs.a[0], ced.a[0], ced.a[1], cbd.a[0], cbp.a[0], chs.a[0], cgx.a[0], cau.a[0], chd.a[0], ccb.a[0], cew.a[0], cey.a[0], ccn.a[0], cdo.a[0], cfh.a[0], cea.a[0], cdf.a[0], cck.a[0], cgv.a[0], cao.a[0], cdx.a[0], cgb.a[0], cha.a[0], car.a[0], cct.a[0], cfu.a[0], cge.a[0], chp.a[0], cby.a[0], cek.a[0] };
  private static Set c;
  private static Set d;
  
  static
  {
    cah[][] arrayOfcah = new cah[67][];
    arrayOfcah[0] = cdr.a;
    arrayOfcah[1] = cdu.a;
    arrayOfcah[2] = cgh.a;
    arrayOfcah[3] = ccz.a;
    arrayOfcah[4] = cgs.a;
    arrayOfcah[5] = cal.a;
    arrayOfcah[6] = cgj.a;
    arrayOfcah[7] = cdc.a;
    arrayOfcah[8] = cba.a;
    arrayOfcah[9] = cgp.a;
    arrayOfcah[10] = cgm.a;
    arrayOfcah[11] = ccw.a;
    arrayOfcah[12] = cch.a;
    arrayOfcah[13] = cdj.a;
    arrayOfcah[14] = chj.a;
    arrayOfcah[15] = cce.a;
    arrayOfcah[16] = cdl.a;
    arrayOfcah[17] = cfe.a;
    arrayOfcah[18] = cax.a;
    arrayOfcah[19] = ceq.a;
    arrayOfcah[20] = cet.a;
    arrayOfcah[21] = ceh.a;
    arrayOfcah[22] = cai.a;
    arrayOfcah[23] = cbm.a;
    arrayOfcah[24] = cbg.a;
    arrayOfcah[25] = cbj.a;
    arrayOfcah[26] = cen.a;
    arrayOfcah[27] = cfo.a;
    arrayOfcah[28] = chv.a;
    arrayOfcah[29] = chy.a;
    arrayOfcah[30] = ccq.a;
    arrayOfcah[31] = cbv.a;
    arrayOfcah[32] = cfw.a;
    arrayOfcah[33] = chm.a;
    arrayOfcah[34] = chg.a;
    arrayOfcah[35] = cfr.a;
    arrayOfcah[36] = cfl.a;
    arrayOfcah[37] = cfb.a;
    arrayOfcah[38] = cbs.a;
    arrayOfcah[39] = ced.a;
    arrayOfcah[40] = cbd.a;
    arrayOfcah[41] = cbp.a;
    arrayOfcah[42] = chs.a;
    arrayOfcah[43] = cgx.a;
    arrayOfcah[44] = cau.a;
    arrayOfcah[45] = chd.a;
    arrayOfcah[46] = ccb.a;
    arrayOfcah[47] = cew.a;
    arrayOfcah[48] = cey.a;
    arrayOfcah[49] = ccn.a;
    arrayOfcah[50] = cdo.a;
    arrayOfcah[51] = cfh.a;
    arrayOfcah[52] = cea.a;
    arrayOfcah[53] = cdf.a;
    arrayOfcah[54] = cck.a;
    arrayOfcah[55] = cgv.a;
    arrayOfcah[56] = cao.a;
    arrayOfcah[57] = cdx.a;
    arrayOfcah[58] = cgb.a;
    arrayOfcah[59] = cha.a;
    arrayOfcah[60] = car.a;
    arrayOfcah[61] = cct.a;
    arrayOfcah[62] = cfu.a;
    arrayOfcah[63] = cge.a;
    arrayOfcah[64] = chp.a;
    arrayOfcah[65] = cby.a;
    arrayOfcah[66] = cek.a;
    int i = 0;
    int j = 0;
    while (i < 67)
    {
      j += arrayOfcah[i].length;
      i++;
    }
    cah[] arrayOfcah1 = new cah[j];
    j = 0;
    i = 0;
    while (j < 67)
    {
      cah[] arrayOfcah2 = arrayOfcah[j];
      int k = 0;
      while (k < arrayOfcah2.length)
      {
        arrayOfcah1[i] = arrayOfcah2[k];
        k++;
        i++;
      }
      j++;
    }
    a = arrayOfcah1;
  }
  
  static Set a()
  {
    if (c == null) {
      c = a(a);
    }
    return c;
  }
  
  private static Set a(cah[] paramArrayOfcah)
  {
    HashSet localHashSet = new HashSet(paramArrayOfcah.length);
    int j = paramArrayOfcah.length;
    for (int i = 0; i < j; i++) {
      localHashSet.add(paramArrayOfcah[i]);
    }
    return localHashSet;
  }
  
  static Set b()
  {
    if (d == null) {
      d = a(b);
    }
    return d;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */