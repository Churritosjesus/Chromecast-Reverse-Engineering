import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;
import android.media.MediaRouter.VolumeCallback;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Trace;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.EdgeEffect;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import javax.security.auth.x500.X500Principal;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

public class a
  implements al
{
  public static final int A = 2130772129;
  public static final int B = 2130772130;
  public static final int C = 2130772128;
  public static final int D = 2130772132;
  public static final int E = 2130772086;
  public static final int F = 2130772231;
  public static final int G = 2130772117;
  public static final int H = 2130772146;
  public static final int I = 2130772092;
  public static final int J = 2130772118;
  public static final int K = 2130772123;
  public static final int L = 2130772104;
  public static final int M = 2130772147;
  public static final int N = 2130772148;
  public static final int O = 2130772111;
  public static final int P = 2130772149;
  public static final int Q = 2130772150;
  public static final int R = 2130772110;
  public static final int S = 2130772103;
  public static final int T = 2130772102;
  public static final int U = 2131689472;
  public static final int V = 2131689473;
  public static final int W = 2131689476;
  public static final int X = 2131689475;
  public static final int Y = 2131427372;
  public static final int Z = 2131492919;
  public static final int aA = 2130837537;
  public static final int aB = 2130837548;
  public static final int aC = 2130837549;
  public static final int aD = 2130837550;
  public static final int aE = 2130837551;
  public static final int aF = 2130837552;
  public static final int aG = 2130837553;
  public static final int aH = 2130837554;
  public static final int aI = 2130837555;
  public static final int aJ = 2130837557;
  public static final int aK = 2130837558;
  public static final int aL = 2130837559;
  public static final int aM = 2130837560;
  public static final int aN = 2130837561;
  public static final int aO = 2130837562;
  public static final int aP = 2131558490;
  public static final int aQ = 2131558405;
  public static final int aR = 2131558489;
  public static final int aS = 2131558462;
  public static final int aT = 2131558461;
  public static final int aU = 2131558491;
  public static final int aV = 2131558486;
  public static final int aW = 2131558463;
  public static final int aX = 2131558464;
  public static final int aY = 2131558474;
  public static final int aZ = 2131558480;
  public static final int aa = 2131492918;
  public static final int ab = 2131492917;
  public static final int ac = 2131492926;
  public static final int ad = 2131492924;
  public static final int ae = 2131492923;
  public static final int af = 2130837504;
  public static final int ag = 2130837505;
  public static final int ah = 2130837506;
  public static final int ai = 2130837509;
  public static final int aj = 2130837510;
  public static final int ak = 2130837517;
  public static final int al = 2130837518;
  public static final int am = 2130837519;
  public static final int an = 2130837522;
  public static final int ao = 2130837523;
  public static final int ap = 2130837524;
  public static final int aq = 2130837525;
  public static final int ar = 2130837526;
  public static final int as = 2130837527;
  public static final int at = 2130837528;
  public static final int au = 2130837529;
  public static final int av = 2130837530;
  public static final int aw = 2130837531;
  public static final int ax = 2130837532;
  public static final int ay = 2130837533;
  public static final int az = 2130837534;
  public static Field b;
  public static final int bA = 2131623945;
  public static final int bB = 2130968576;
  public static final int bC = 2130968579;
  public static final int bD = 2130968580;
  public static final int bE = 2130968582;
  public static final int bF = 2130968583;
  public static final int bG = 2130968584;
  public static final int bH = 2130968586;
  public static final int bI = 2130968587;
  public static final int bJ = 2130968588;
  public static final int bK = 2130968589;
  public static final int bL = 2130968590;
  public static final int bM = 2130968591;
  public static final int bN = 2130968592;
  public static final int bO = 2130968594;
  public static final int bP = 2130968595;
  public static final int bQ = 2130968596;
  public static final int bR = 2130968597;
  public static final int bS = 2130968598;
  public static final int bT = 2131296334;
  public static final int bU = 2131296346;
  public static final int bV = 2131296345;
  public static final int bW = 2131296348;
  public static final int bX = 2131296347;
  public static final int bY = 2131362030;
  public static final int bZ = 2131362102;
  public static final int ba = 2131558475;
  public static final int bb = 2131558479;
  public static final int bc = 2131558478;
  public static final int bd = 2131558488;
  public static final int be = 2131558467;
  public static final int bf = 2131558492;
  public static final int bg = 2131558465;
  public static final int bh = 2131558469;
  public static final int bi = 2131558466;
  public static final int bj = 2131558468;
  public static final int bk = 2131558476;
  public static final int bl = 2131558495;
  public static final int bm = 2131558500;
  public static final int bn = 2131558496;
  public static final int bo = 2131558502;
  public static final int bp = 2131558497;
  public static final int bq = 2131558498;
  public static final int br = 2131558499;
  public static final int bs = 2131558503;
  public static final int bt = 2131558483;
  public static final int bu = 2131558406;
  public static final int bv = 2131558501;
  public static final int bw = 2131558477;
  public static final int bx = 2131558470;
  public static final int by = 2131558473;
  public static final int bz = 2131558472;
  public static boolean c = false;
  public static final int cA = 2131492895;
  public static final int cB = 2131492899;
  public static final int cC = 2131492905;
  public static final int cD = 2131492900;
  public static final int cE = 2130837674;
  public static final int cF = 2130837694;
  public static final int cG = 2131558606;
  public static final int cH = 2131558603;
  public static final int cI = 2131558608;
  public static final int cJ = 2131558607;
  public static final int cK = 2131558605;
  public static final int cL = 2131558604;
  public static final int cM = 2131623940;
  public static final int cN = 2130968638;
  public static final int cO = 2130968639;
  public static final int cP = 2130968687;
  public static final int cQ = 2131296316;
  public static final int cR = 2131296315;
  public static final int cS = 2131296319;
  public static final int cT = 2131296318;
  public static final int cU = 2131296317;
  public static final int cV = 2130837595;
  public static final int cW = 2131558609;
  public static final int cX = 2131558610;
  public static final int cY = 2130968640;
  public static final int cZ = 2130968641;
  public static final int ca = 2131362090;
  public static final int cb = 2131427368;
  public static final int cc = 2131427367;
  public static final int cd = 2131492913;
  public static final int ce = 2131361847;
  public static final int cf = 2130772045;
  public static final int cg = 2130772036;
  public static final int ch = 2130772037;
  public static final int ci = 2130772042;
  public static final int cj = 2130772041;
  public static final int ck = 2130968688;
  public static final int cl = 2130968689;
  public static final int cm = 2130968690;
  public static final int cn = 2131296325;
  public static final int co = 2131296331;
  public static final int cp = 2131296330;
  public static final int cq = 2131296322;
  public static final int cr = 2131296323;
  public static final int cs = 2131361851;
  public static final int ct = 2131361852;
  public static final int cu = 2131427359;
  public static final int cv = 2131427360;
  public static final int cw = 2131427363;
  public static final int cx = 2131492898;
  public static final int cy = 2131492897;
  public static final int cz = 2131492896;
  public static Field d;
  public static final int dA = 2131493013;
  public static final int dB = 2131493010;
  public static final int dC = 2131492997;
  public static final int dD = 2131493001;
  public static final int dE = 2131492990;
  public static final int dF = 2131492991;
  public static final int dG = 2131493008;
  public static final int dH = 2131493020;
  public static final int dI = 2131493009;
  public static final int dJ = 2131493067;
  public static final int dK = 2131493021;
  public static final int dL = 2131493015;
  public static final int dM = 2131493016;
  public static final int dN = 2131493061;
  public static final int dO = 2131492993;
  public static final int dP = 2131492995;
  public static final int dQ = 2131493007;
  public static final int dR = 2131493024;
  public static final int dS = 2131493023;
  public static final int dT = 2131493025;
  public static final int dU = 2131493062;
  public static final int dV = 2131493066;
  public static final int dW = 2131492999;
  public static final int dX = 2131493000;
  public static final int dY = 2131493022;
  public static final int dZ = 2131493019;
  public static final int da = 2131296268;
  public static final int db = 2131296267;
  public static final int dc = 2131296266;
  public static volatile String dd;
  public static final int de = 2131034112;
  public static final int df = 2131034113;
  public static final int dg = 2131034118;
  public static final int dh = 2131755009;
  public static final int di = 2131755008;
  public static final int dj = 2130772126;
  public static final int dk = 2131427487;
  public static final int dl = 2131427488;
  public static final int dm = 2131427467;
  public static final int dn = 2131427475;
  public static final int jdField_do = 2131427483;
  public static final int dp = 2131427482;
  public static final int dq = 2131427472;
  public static final int dr = 2131427485;
  public static final int ds = 2131427434;
  public static final int dt = 2131427468;
  public static final int du = 2131427421;
  public static final int dv = 2131427422;
  public static final int dw = 2131427423;
  public static final int dx = 2131427424;
  public static final int dy = 2131492985;
  public static final int dz = 2131493014;
  public static boolean e = false;
  public static final int eA = 2130837660;
  public static final int eB = 2130837661;
  public static final int eC = 2130837665;
  public static final int eD = 2130837692;
  public static final int eE = 2130837693;
  public static final int eF = 2130837707;
  public static final int eG = 2130837708;
  public static final int eH = 2130837711;
  public static final int eI = 2130837713;
  public static final int eJ = 2130837714;
  public static final int eK = 2130837715;
  public static final int eL = 2130837729;
  public static final int eM = 2130837731;
  public static final int eN = 2130837735;
  public static final int eO = 2130837736;
  public static final int eP = 2130837737;
  public static final int eQ = 2130837738;
  public static final int eR = 2130837739;
  public static final int eS = 2130837740;
  public static final int eT = 2130837741;
  public static final int eU = 2130837742;
  public static final int eV = 2130837743;
  public static final int eW = 2130837744;
  public static final int eX = 2130837769;
  public static final int eY = 2130837770;
  public static final int eZ = 2130837784;
  public static final int ea = 2131493028;
  public static final int eb = 2131493027;
  public static final int ec = 2131493011;
  public static final int ed = 2131493029;
  public static final int ee = 2131493012;
  public static final int ef = 2131493065;
  public static final int eg = 2131493031;
  public static final int eh = 2131493030;
  public static final int ei = 2130837565;
  public static final int ej = 2130837566;
  public static final int ek = 2130837575;
  public static final int el = 2130837581;
  public static final int em = 2130837582;
  public static final int en = 2130837583;
  public static final int eo = 2130837584;
  public static final int ep = 2130837585;
  public static final int eq = 2130837587;
  public static final int er = 2130837635;
  public static final int es = 2130837636;
  public static final int et = 2130837637;
  public static final int eu = 2130837638;
  public static final int ev = 2130837643;
  public static final int ew = 2130837649;
  public static final int ex = 2130837654;
  public static final int ey = 2130837656;
  public static final int ez = 2130837657;
  public static Method f;
  public static final int fA = 2130968625;
  public static final int fB = 2130968626;
  public static final int fC = 2130968627;
  public static final int fD = 2130968628;
  public static final int fE = 2130968629;
  public static final int fF = 2130968633;
  public static final int fG = 2130968636;
  public static final int fH = 2130968637;
  public static final int fI = 2130968643;
  public static final int fJ = 2130968644;
  public static final int fK = 2130968645;
  public static final int fL = 2130968646;
  public static final int fM = 2130968648;
  public static final int fN = 2130968649;
  public static final int fO = 2130968650;
  public static final int fP = 2130968651;
  public static final int fQ = 2130968652;
  public static final int fR = 2130968653;
  public static final int fS = 2130968657;
  public static final int fT = 2130968658;
  public static final int fU = 2130968659;
  public static final int fV = 2130968660;
  public static final int fW = 2130968661;
  public static final int fX = 2130968662;
  public static final int fY = 2130968665;
  public static final int fZ = 2130968667;
  public static final int fa = 2131623965;
  public static final int fb = 2131623946;
  public static final int fc = 2131623947;
  public static final int fd = 2131623959;
  public static final int fe = 2131623960;
  public static final int ff = 2131623958;
  public static final int fg = 2131623953;
  public static final int fh = 2131623954;
  public static final int fi = 2131623952;
  public static final int fj = 2131623951;
  public static final int fk = 2131623950;
  public static final int fl = 2131623957;
  public static final int fm = 2130968606;
  public static final int fn = 2130968607;
  public static final int fo = 2130968608;
  public static final int fp = 2130968610;
  public static final int fq = 2130968612;
  public static final int fr = 2130968613;
  public static final int fs = 2130968614;
  public static final int ft = 2130968615;
  public static final int fu = 2130968617;
  public static final int fv = 2130968619;
  public static final int fw = 2130968621;
  public static final int fx = 2130968622;
  public static final int fy = 2130968623;
  public static final int fz = 2130968624;
  public static final int g = 2130772061;
  public static final int gA = 2130968727;
  public static final int gB = 2130968728;
  public static final int gC = 2130968729;
  public static final int gD = 2130968730;
  public static final int gE = 2130968733;
  public static final int gF = 2130968735;
  public static final int gG = 2130968736;
  public static final int gH = 2130968743;
  public static final int gI = 2130968744;
  public static final int gJ = 2130968746;
  public static final int gK = 2130968747;
  public static final int gL = 2130968748;
  public static final int gM = 2130968749;
  public static final int gN = 2130968750;
  public static final int gO = 2130968752;
  public static final int gP = 2130968754;
  public static final int gQ = 2130968756;
  public static final int gR = 2130968757;
  public static final int gS = 2130968760;
  public static final int gT = 2130968761;
  public static final int gU = 2130968768;
  public static final int gV = 2130968769;
  public static final int gW = 2131886081;
  public static final int gX = 2131886082;
  public static final int gY = 2131886083;
  public static final int gZ = 2131886084;
  public static final int ga = 2130968668;
  public static final int gb = 2130968669;
  public static final int gc = 2130968670;
  public static final int gd = 2130968671;
  public static final int ge = 2130968673;
  public static final int gf = 2130968674;
  public static final int gg = 2130968675;
  public static final int gh = 2130968676;
  public static final int gi = 2130968684;
  public static final int gj = 2130968691;
  public static final int gk = 2130968693;
  public static final int gl = 2130968695;
  public static final int gm = 2130968696;
  public static final int gn = 2130968697;
  public static final int go = 2130968708;
  public static final int gp = 2130968709;
  public static final int gq = 2130968710;
  public static final int gr = 2130968714;
  public static final int gs = 2130968715;
  public static final int gt = 2130968716;
  public static final int gu = 2130968718;
  public static final int gv = 2130968720;
  public static final int gw = 2130968721;
  public static final int gx = 2130968722;
  public static final int gy = 2130968723;
  public static final int gz = 2130968726;
  public static final int h = 2130772066;
  public static final int hA = 2131296310;
  public static final int hB = 2131296302;
  public static final int hC = 2131296304;
  public static final int hD = 2131296303;
  public static final int hE = 2131296305;
  public static final int hF = 2131296296;
  public static final int hG = 2131296294;
  public static final int hH = 2131296309;
  public static final int hI = 2130771989;
  public static final int hJ = 2130771993;
  public static final int hK = 2131427341;
  public static final int hL = 2131492891;
  public static final int hM = 2131492886;
  public static final int hN = 2131492885;
  public static final int hO = 2131492892;
  public static final int hP = 2130837563;
  public static final int hQ = 2130837567;
  public static final int hR = 2131558506;
  public static final int hS = 2131558863;
  public static final int hT = 2131558867;
  public static final int hU = 2131558858;
  public static final int hV = 2131558862;
  public static final int hW = 2131558507;
  public static final int hX = 2131558513;
  public static final int hY = 2131558505;
  public static final int hZ = 2131558401;
  public static final int ha = 2131886085;
  public static final int hb = 2131886086;
  public static final int hc = 2131886087;
  public static final int hd = 2131886088;
  public static final int he = 2131820544;
  public static final int hf = 2131230720;
  public static final int hg = 2131230721;
  public static final int hh = 2131230722;
  public static final int hi = 2131230723;
  public static final int hj = 2131230725;
  public static final int hk = 2131230726;
  public static final int hl = 2131165184;
  public static final int hm = 2131296297;
  public static final int hn = 2131296295;
  public static final int ho = 2131296293;
  public static final int hp = 2131296292;
  public static final int hq = 2131296291;
  public static final int hr = 2131296290;
  public static final int hs = 2131296288;
  public static final int ht = 2131296289;
  public static final int hu = 2131296287;
  public static final int hv = 2131296301;
  public static final int hw = 2131296300;
  public static final int hx = 2131296299;
  public static final int hy = 2131296298;
  public static final int hz = 2131296311;
  public static final int i = 2130772062;
  public static final int ia = 2131558538;
  public static final int ib = 2131558860;
  public static final int ic = 2131558536;
  public static final int id = 2131558537;
  public static final int ie = 2131558511;
  public static final int jdField_if = 2131558866;
  public static final int ig = 2131558865;
  public static final int ih = 2131558535;
  public static final int ii = 2131558859;
  public static final int ij = 2131558864;
  public static final int ik = 2131558861;
  public static final int il = 2131558512;
  public static final int im = 2131558874;
  public static final int in = 2131623937;
  public static final int io = 2131623936;
  public static final int ip = 2130968603;
  public static final int iq = 2130968604;
  public static final int ir = 2130968605;
  public static final int is = 2130968677;
  public static final int it = 2130968741;
  public static final int iu = 2130968742;
  public static volatile boolean iv = false;
  public static final int j = 2130772056;
  public static final int k = 2130772058;
  public static final int l = 2130772064;
  public static final int m = 2130772065;
  public static final int n = 2130772089;
  public static final int o = 2130772083;
  public static final int p = 2130772080;
  public static final int q = 2130772071;
  public static final int r = 2130772059;
  public static final int s = 2130772060;
  public static final int t = 2130772135;
  public static final int u = 2130772133;
  public static final int v = 2130772136;
  public static final int w = 2130772141;
  public static final int x = 2130772142;
  public static final int y = 2130772144;
  public static final int z = 2130772131;
  
  public a() {}
  
  a(c paramc, j paramj) {}
  
  public static char a(long paramLong)
  {
    int i2 = (int)(paramLong % 24L);
    int i1 = i2;
    if (i2 >= 8) {
      i1 = i2 + 1;
    }
    i2 = i1;
    if (i1 >= 14) {
      i2 = i1 + 1;
    }
    return Character.toChars(i2 + 65)[0];
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    int i1 = Color.alpha(paramInt2);
    int i3 = Color.alpha(paramInt1);
    int i2 = 255 - (255 - i1) * (255 - i3) / 255;
    return Color.argb(i2, a(Color.red(paramInt1), i3, Color.red(paramInt2), i1, i2), a(Color.green(paramInt1), i3, Color.green(paramInt2), i1, i2), a(Color.blue(paramInt1), i3, Color.blue(paramInt2), i1, i2));
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {}
    for (paramInt1 = 0;; paramInt1 = (paramInt1 * 255 * paramInt2 + paramInt3 * paramInt4 * (255 - paramInt2)) / (paramInt5 * 255)) {
      return paramInt1;
    }
  }
  
  public static int a(Context paramContext, int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(paramInt, localTypedValue, true)) {}
    for (paramInt = localTypedValue.resourceId;; paramInt = 0) {
      return paramInt;
    }
  }
  
  public static int a(Parcel paramParcel)
  {
    int i2 = paramParcel.readInt();
    int i3 = a(paramParcel, i2);
    int i1 = paramParcel.dataPosition();
    if ((0xFFFF & i2) != 20293) {
      throw new l("Expected object header. Got 0x" + Integer.toHexString(i2), paramParcel);
    }
    i2 = i1 + i3;
    if ((i2 < i1) || (i2 > paramParcel.dataSize())) {
      throw new l("Size read is invalid start=" + i1 + " end=" + i2, paramParcel);
    }
    return i2;
  }
  
  public static int a(Parcel paramParcel, int paramInt)
  {
    if ((paramInt & 0xFFFF0000) != -65536) {}
    for (paramInt = paramInt >> 16 & 0xFFFF;; paramInt = paramParcel.readInt()) {
      return paramInt;
    }
  }
  
  public static int a(CharSequence paramCharSequence)
  {
    int i3 = 0;
    int i5 = paramCharSequence.length();
    for (int i2 = 0; (i2 < i5) && (paramCharSequence.charAt(i2) < ''); i2++) {}
    for (;;)
    {
      int i1;
      if (i2 < i5)
      {
        int i4 = paramCharSequence.charAt(i2);
        if (i4 < 2048)
        {
          i1 += (127 - i4 >>> 31);
          i2++;
        }
        else
        {
          int i7 = paramCharSequence.length();
          if (i2 < i7)
          {
            int i8 = paramCharSequence.charAt(i2);
            if (i8 < 2048)
            {
              i3 += (127 - i8 >>> 31);
              i4 = i2;
            }
            for (;;)
            {
              i2 = i4 + 1;
              break;
              int i6 = i3 + 2;
              i4 = i2;
              i3 = i6;
              if (55296 <= i8)
              {
                i4 = i2;
                i3 = i6;
                if (i8 <= 57343)
                {
                  if (Character.codePointAt(paramCharSequence, i2) < 65536) {
                    throw new dem(i2, i7);
                  }
                  i4 = i2 + 1;
                  i3 = i6;
                }
              }
            }
          }
          i1 += i3;
        }
      }
      else
      {
        for (;;)
        {
          if (i1 < i5)
          {
            long l1 = i1;
            throw new IllegalArgumentException(54 + "UTF-8 length does not fit in int: " + (l1 + 4294967296L));
          }
          return i1;
        }
        i1 = i5;
      }
    }
  }
  
  public static int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i3 = paramCharSequence.length();
    int i2 = 0;
    int i4 = paramInt1 + paramInt2;
    for (paramInt2 = i2; (paramInt2 < i3) && (paramInt2 + paramInt1 < i4); paramInt2++)
    {
      i2 = paramCharSequence.charAt(paramInt2);
      if (i2 >= 128) {
        break;
      }
      paramArrayOfByte[(paramInt1 + paramInt2)] = ((byte)i2);
    }
    if (paramInt2 == i3) {
      paramInt1 += i3;
    }
    for (;;)
    {
      return paramInt1;
      paramInt1 += paramInt2;
      if (paramInt2 < i3)
      {
        int i1 = paramCharSequence.charAt(paramInt2);
        if ((i1 < 128) && (paramInt1 < i4))
        {
          i2 = paramInt1 + 1;
          paramArrayOfByte[paramInt1] = ((byte)i1);
          paramInt1 = i2;
        }
        for (;;)
        {
          paramInt2++;
          break;
          if ((i1 < 2048) && (paramInt1 <= i4 - 2))
          {
            i2 = paramInt1 + 1;
            paramArrayOfByte[paramInt1] = ((byte)(i1 >>> 6 | 0x3C0));
            paramInt1 = i2 + 1;
            paramArrayOfByte[i2] = ((byte)(i1 & 0x3F | 0x80));
          }
          else
          {
            int i5;
            if (((i1 < 55296) || (57343 < i1)) && (paramInt1 <= i4 - 3))
            {
              i5 = paramInt1 + 1;
              paramArrayOfByte[paramInt1] = ((byte)(i1 >>> 12 | 0x1E0));
              i2 = i5 + 1;
              paramArrayOfByte[i5] = ((byte)(i1 >>> 6 & 0x3F | 0x80));
              paramInt1 = i2 + 1;
              paramArrayOfByte[i2] = ((byte)(i1 & 0x3F | 0x80));
            }
            else
            {
              if (paramInt1 > i4 - 4) {
                break label427;
              }
              i2 = paramInt2;
              char c1;
              if (paramInt2 + 1 != paramCharSequence.length())
              {
                paramInt2++;
                c1 = paramCharSequence.charAt(paramInt2);
                if (!Character.isSurrogatePair(i1, c1)) {
                  i2 = paramInt2;
                }
              }
              else
              {
                throw new dem(i2 - 1, i3);
              }
              i2 = Character.toCodePoint(i1, c1);
              i5 = paramInt1 + 1;
              paramArrayOfByte[paramInt1] = ((byte)(i2 >>> 18 | 0xF0));
              paramInt1 = i5 + 1;
              paramArrayOfByte[i5] = ((byte)(i2 >>> 12 & 0x3F | 0x80));
              i5 = paramInt1 + 1;
              paramArrayOfByte[paramInt1] = ((byte)(i2 >>> 6 & 0x3F | 0x80));
              paramInt1 = i5 + 1;
              paramArrayOfByte[i5] = ((byte)(i2 & 0x3F | 0x80));
            }
          }
        }
        label427:
        if ((55296 <= i1) && (i1 <= 57343) && ((paramInt2 + 1 == paramCharSequence.length()) || (!Character.isSurrogatePair(i1, paramCharSequence.charAt(paramInt2 + 1))))) {
          throw new dem(paramInt2, i3);
        }
        throw new ArrayIndexOutOfBoundsException(37 + "Failed writing " + i1 + " at index " + paramInt1);
      }
    }
  }
  
  public static int a(String paramString1, int paramInt, String paramString2)
  {
    while ((paramInt < paramString1.length()) && (paramString2.indexOf(paramString1.charAt(paramInt)) == -1)) {
      paramInt++;
    }
    return paramInt;
  }
  
  public static long a(byte[] paramArrayOfByte, int paramInt)
  {
    long l1 = 0L;
    for (int i1 = 0; i1 < 4; i1++) {
      l1 = (l1 << 8) + (paramArrayOfByte[(paramInt + i1)] & 0xFF);
    }
    return l1;
  }
  
  public static adh a(adp paramadp)
  {
    long l6 = System.currentTimeMillis();
    Map localMap = paramadp.c;
    long l3 = 0L;
    long l2 = 0L;
    long l1 = 0L;
    Object localObject = (String)localMap.get("Date");
    if (localObject != null) {
      l3 = b((String)localObject);
    }
    localObject = (String)localMap.get("Cache-Control");
    int i2;
    int i1;
    String str;
    if (localObject != null)
    {
      localObject = ((String)localObject).split(",");
      i2 = 0;
      i1 = 0;
      l2 = 0L;
      l1 = 0L;
      if (i2 < localObject.length)
      {
        str = localObject[i2].trim();
        if ((str.equals("no-cache")) || (str.equals("no-store")))
        {
          paramadp = null;
          return paramadp;
        }
        if (str.startsWith("max-age=")) {}
        for (;;)
        {
          try
          {
            l5 = Long.parseLong(str.substring(8));
            l4 = l2;
            label143:
            i2++;
          }
          catch (Exception localException2)
          {
            long l4 = l2;
            long l5 = l1;
            continue;
            l1 = 0L;
            l2 = 0L;
            continue;
            l4 = 0L;
            continue;
            l5 = 0L;
            continue;
          }
          l2 = l4;
          l1 = l5;
          break;
          if (str.startsWith("stale-while-revalidate=")) {}
          try
          {
            l4 = Long.parseLong(str.substring(23));
            l5 = l1;
          }
          catch (Exception localException1)
          {
            l4 = l2;
            l5 = l1;
          }
          if (!str.equals("must-revalidate"))
          {
            l4 = l2;
            l5 = l1;
            if (!str.equals("proxy-revalidate")) {}
          }
          else
          {
            i1 = 1;
            l4 = l2;
            l5 = l1;
          }
        }
      }
      l4 = l1;
      l1 = l2;
      i2 = 1;
      l2 = l4;
    }
    for (;;)
    {
      localObject = (String)localMap.get("Expires");
      if (localObject != null)
      {
        l5 = b((String)localObject);
        localObject = (String)localMap.get("Last-Modified");
        if (localObject != null)
        {
          l4 = b((String)localObject);
          str = (String)localMap.get("ETag");
          if (i2 != 0)
          {
            l2 = l6 + 1000L * l2;
            if (i1 != 0) {
              l1 = l2;
            }
          }
          for (;;)
          {
            localObject = new adh();
            ((adh)localObject).a = paramadp.b;
            ((adh)localObject).b = str;
            ((adh)localObject).f = l2;
            ((adh)localObject).e = l1;
            ((adh)localObject).c = l3;
            ((adh)localObject).d = l4;
            ((adh)localObject).g = localMap;
            paramadp = (adp)localObject;
            break;
            l1 = 1000L * l1 + l2;
            continue;
            if ((l3 <= 0L) || (l5 < l3)) {
              break label451;
            }
            l1 = l5 - l3 + l6;
            l2 = l1;
          }
          break label143;
        }
      }
      label451:
      i1 = 0;
      i2 = 0;
    }
  }
  
  public static Context a(Context paramContext)
  {
    int i1 = 1;
    TypedValue localTypedValue = new TypedValue();
    if ((paramContext.getTheme().resolveAttribute(cf, localTypedValue, true)) && (localTypedValue.data != 0)) {
      if (i1 == 0) {
        break label55;
      }
    }
    label55:
    for (i1 = ct;; i1 = cs)
    {
      return new ContextThemeWrapper(paramContext, i1);
      i1 = 0;
      break;
    }
  }
  
  public static Bitmap a(Bitmap paramBitmap)
  {
    int i3 = 0;
    if (paramBitmap == null)
    {
      paramBitmap = null;
      return paramBitmap;
    }
    int i4 = paramBitmap.getWidth();
    int i1 = paramBitmap.getHeight();
    int i2;
    if (i4 >= i1)
    {
      i3 = i4 / 2 - i1 / 2;
      i2 = 0;
    }
    for (;;)
    {
      Bitmap localBitmap = Bitmap.createBitmap(i1, i1, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      Paint localPaint = new Paint(1);
      localPaint.setColor(-16777216);
      localCanvas.drawCircle(i1 / 2, i1 / 2, i1 / 2, localPaint);
      localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      localCanvas.drawBitmap(paramBitmap, i3, i2, localPaint);
      paramBitmap = localBitmap;
      break;
      i2 = i1 / 2 - i4 / 2;
      i1 = i4;
    }
  }
  
  public static Bitmap a(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    if (paramParcelFileDescriptor == null) {
      paramParcelFileDescriptor = null;
    }
    for (;;)
    {
      return paramParcelFileDescriptor;
      FileInputStream localFileInputStream = new FileInputStream(paramParcelFileDescriptor.getFileDescriptor());
      try
      {
        paramParcelFileDescriptor = BitmapFactory.decodeStream(localFileInputStream);
        a(localFileInputStream);
      }
      finally
      {
        a(localFileInputStream);
      }
    }
  }
  
  static Rect a(View paramView)
  {
    Rect localRect = new Rect();
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    localRect.set(arrayOfInt[0], arrayOfInt[1], arrayOfInt[0] + paramView.getWidth(), arrayOfInt[1] + paramView.getHeight());
    return localRect;
  }
  
  public static Parcelable a(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    int i1 = a(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i1 == 0) {}
    for (paramParcel = null;; paramParcel = paramCreator)
    {
      return paramParcel;
      paramCreator = (Parcelable)paramCreator.createFromParcel(paramParcel);
      paramParcel.setDataPosition(i1 + paramInt);
    }
  }
  
  public static Menu a(Context paramContext, cc paramcc)
  {
    if (Build.VERSION.SDK_INT >= 14) {
      return new qt(paramContext, paramcc);
    }
    throw new UnsupportedOperationException();
  }
  
  public static MenuItem a(Context paramContext, cd paramcd)
  {
    if (Build.VERSION.SDK_INT >= 16) {}
    for (paramContext = new ql(paramContext, paramcd);; paramContext = new qg(paramContext, paramcd))
    {
      return paramContext;
      if (Build.VERSION.SDK_INT < 14) {
        break;
      }
    }
    throw new UnsupportedOperationException();
  }
  
  public static bde a(bdf parambdf, X509Certificate paramX509Certificate)
  {
    Object localObject2 = null;
    bde localbde = new bde();
    bcv localbcv = parambdf.U;
    if (localbcv == null) {
      localbde.b = "No certificate is present";
    }
    for (;;)
    {
      return localbde;
      if (TextUtils.isEmpty(parambdf.r))
      {
        localbde.b = "No public key in device configuration";
      }
      else
      {
        Object localObject1 = String.format("%s,%s,%s,%s,%s", new Object[] { parambdf.b, parambdf.n, parambdf.q, parambdf.r, localbcv.b });
        try
        {
          localObject1 = ((String)localObject1).getBytes("UTF-8");
          localPublicKey = paramX509Certificate.getPublicKey();
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          try
          {
            PublicKey localPublicKey;
            localbde.c = a(localPublicKey.getEncoded());
            Signature localSignature = Signature.getInstance("SHA1withRSA");
            localSignature.initVerify(localPublicKey);
            localSignature.update((byte[])localObject1);
            if (!localSignature.verify(localbcv.c))
            {
              localbde.b = "Signed data failed to verify";
              continue;
              localUnsupportedEncodingException = localUnsupportedEncodingException;
              arrayOfString = null;
            }
          }
          catch (IllegalArgumentException parambdf)
          {
            parambdf = String.valueOf(parambdf.toString());
            if (parambdf.length() != 0) {}
            for (parambdf = "Verification exception: ".concat(parambdf);; parambdf = new String("Verification exception: "))
            {
              localbde.b = parambdf;
              break;
            }
          }
          catch (NoSuchAlgorithmException parambdf)
          {
            parambdf = String.valueOf(parambdf.toString());
            if (parambdf.length() != 0) {}
            for (parambdf = "Verification exception: ".concat(parambdf);; parambdf = new String("Verification exception: "))
            {
              localbde.b = parambdf;
              break;
            }
          }
          catch (InvalidKeyException parambdf)
          {
            parambdf = String.valueOf(parambdf.toString());
            if (parambdf.length() != 0) {}
            for (parambdf = "Verification exception: ".concat(parambdf);; parambdf = new String("Verification exception: "))
            {
              localbde.b = parambdf;
              break;
            }
          }
          catch (SignatureException parambdf)
          {
            parambdf = String.valueOf(parambdf.toString());
            if (parambdf.length() != 0) {}
            for (parambdf = "Verification exception: ".concat(parambdf);; parambdf = new String("Verification exception: "))
            {
              localbde.b = parambdf;
              break;
            }
            String[] arrayOfString = paramX509Certificate.getSubjectX500Principal().getName().split(",");
            int i2 = arrayOfString.length;
            for (int i1 = 0;; i1++)
            {
              paramX509Certificate = (X509Certificate)localObject2;
              if (i1 < i2)
              {
                paramX509Certificate = arrayOfString[i1].trim();
                if (paramX509Certificate.startsWith("CN=")) {
                  paramX509Certificate = paramX509Certificate.substring(3);
                }
              }
              else
              {
                if (paramX509Certificate != null) {
                  break label444;
                }
                localbde.b = "No CN found!";
                break;
              }
            }
            label444:
            paramX509Certificate = new StringTokenizer(paramX509Certificate);
            if (paramX509Certificate.countTokens() != 2)
            {
              localbde.b = "Malformed CN; expected two whitespace-separated tokens";
            }
            else
            {
              paramX509Certificate.nextToken();
              paramX509Certificate = paramX509Certificate.nextToken();
              parambdf = parambdf.q.replace(":", "");
              if (!paramX509Certificate.equals(parambdf)) {
                localbde.b = String.format(Locale.US, "CN '%s' does not match hotspot BSSID '%s'", new Object[] { parambdf, paramX509Certificate });
              } else {
                localbde.a = true;
              }
            }
          }
        }
      }
    }
  }
  
  public static cje a(int paramInt, ciz paramciz, cje[] paramArrayOfcje, Set paramSet)
  {
    int i3 = 0;
    int i4 = 0;
    int i2 = 0;
    if (paramSet.contains(Integer.valueOf(paramInt))) {
      i("Value cycle detected.  Current value reference: " + paramInt + ".  Previous value references: " + paramSet + ".");
    }
    cje localcje1 = (cje)a(paramciz.b, paramInt, "values");
    if (paramArrayOfcje[paramInt] != null)
    {
      paramciz = paramArrayOfcje[paramInt];
      return paramciz;
    }
    Object localObject = null;
    paramSet.add(Integer.valueOf(paramInt));
    switch (localcje1.a)
    {
    }
    for (;;)
    {
      if (localObject == null) {
        i("Invalid value: " + localcje1);
      }
      paramArrayOfcje[paramInt] = localObject;
      paramSet.remove(Integer.valueOf(paramInt));
      paramciz = (ciz)localObject;
      break;
      localObject = b(localcje1);
      cje localcje2 = a(localcje1);
      localcje2.c = new cje[((cjb)localObject).b.length];
      int[] arrayOfInt = ((cjb)localObject).b;
      i3 = arrayOfInt.length;
      for (int i1 = 0;; i1++)
      {
        localObject = localcje2;
        if (i2 >= i3) {
          break;
        }
        i4 = arrayOfInt[i2];
        localcje2.c[i1] = a(i4, paramciz, paramArrayOfcje, paramSet);
        i2++;
      }
      localcje2 = a(localcje1);
      localObject = b(localcje1);
      if (((cjb)localObject).c.length != ((cjb)localObject).d.length) {
        i("Uneven map keys (" + ((cjb)localObject).c.length + ") and map values (" + ((cjb)localObject).d.length + ")");
      }
      localcje2.d = new cje[((cjb)localObject).c.length];
      localcje2.e = new cje[((cjb)localObject).c.length];
      arrayOfInt = ((cjb)localObject).c;
      i4 = arrayOfInt.length;
      i2 = 0;
      for (i1 = 0; i2 < i4; i1++)
      {
        int i5 = arrayOfInt[i2];
        localcje2.d[i1] = a(i5, paramciz, paramArrayOfcje, paramSet);
        i2++;
      }
      arrayOfInt = ((cjb)localObject).d;
      i4 = arrayOfInt.length;
      i1 = 0;
      i2 = i3;
      for (;;)
      {
        localObject = localcje2;
        if (i2 >= i4) {
          break;
        }
        i3 = arrayOfInt[i2];
        localcje2.e[i1] = a(i3, paramciz, paramArrayOfcje, paramSet);
        i2++;
        i1++;
      }
      localObject = a(localcje1);
      ((cje)localObject).f = cyh.a(a(b(localcje1).f, paramciz, paramArrayOfcje, paramSet));
      continue;
      localcje2 = a(localcje1);
      localObject = b(localcje1);
      localcje2.j = new cje[((cjb)localObject).e.length];
      arrayOfInt = ((cjb)localObject).e;
      i3 = arrayOfInt.length;
      i1 = 0;
      i2 = i4;
      for (;;)
      {
        localObject = localcje2;
        if (i2 >= i3) {
          break;
        }
        i4 = arrayOfInt[i2];
        localcje2.j[i1] = a(i4, paramciz, paramArrayOfcje, paramSet);
        i2++;
        i1++;
      }
      localObject = localcje1;
    }
  }
  
  public static cje a(cje paramcje)
  {
    cje localcje = new cje();
    localcje.a = paramcje.a;
    localcje.k = ((int[])paramcje.k.clone());
    if (paramcje.l) {
      localcje.l = paramcje.l;
    }
    return localcje;
  }
  
  public static clx a(civ paramciv, ciz paramciz, cje[] paramArrayOfcje)
  {
    cly localcly = clx.a();
    int[] arrayOfInt = paramciv.a;
    int i2 = arrayOfInt.length;
    int i1 = 0;
    if (i1 < i2)
    {
      int i3 = arrayOfInt[i1];
      Object localObject = (ciy)a(paramciz.c, Integer.valueOf(i3).intValue(), "properties");
      paramciv = (String)a(paramciz.a, ((ciy)localObject).a, "keys");
      localObject = (cje)a(paramArrayOfcje, ((ciy)localObject).b, "values");
      if (cit.F.toString().equals(paramciv)) {
        localcly.a = ((cje)localObject);
      }
      for (;;)
      {
        i1++;
        break;
        localcly.a(paramciv, (cje)localObject);
      }
    }
    return localcly.a();
  }
  
  public static clz a(ciz paramciz)
  {
    int i2 = 0;
    Object localObject1 = new cje[paramciz.b.length];
    for (int i1 = 0; i1 < paramciz.b.length; i1++) {
      a(i1, paramciz, (cje[])localObject1, new HashSet(0));
    }
    cma localcma = clz.a();
    ArrayList localArrayList3 = new ArrayList();
    for (i1 = 0; i1 < paramciz.e.length; i1++) {
      localArrayList3.add(a(paramciz.e[i1], paramciz, (cje[])localObject1));
    }
    ArrayList localArrayList1 = new ArrayList();
    for (i1 = 0; i1 < paramciz.f.length; i1++) {
      localArrayList1.add(a(paramciz.f[i1], paramciz, (cje[])localObject1));
    }
    ArrayList localArrayList2 = new ArrayList();
    Object localObject2;
    for (i1 = 0; i1 < paramciz.d.length; i1++)
    {
      localObject2 = a(paramciz.d[i1], paramciz, (cje[])localObject1);
      localcma.a((clx)localObject2);
      localArrayList2.add(localObject2);
    }
    localObject1 = paramciz.g;
    int i3 = localObject1.length;
    for (i1 = i2; i1 < i3; i1++)
    {
      localObject2 = a(localObject1[i1], localArrayList3, localArrayList2, localArrayList1, paramciz);
      localcma.a.add(localObject2);
    }
    localcma.b = paramciz.h;
    localcma.c = paramciz.i;
    return localcma.a();
  }
  
  public static cmb a(cja paramcja, List paramList1, List paramList2, List paramList3, ciz paramciz)
  {
    cmc localcmc = new cmc();
    Object localObject1 = paramcja.a;
    int i2 = localObject1.length;
    for (int i1 = 0; i1 < i2; i1++)
    {
      localObject2 = (clx)paramList3.get(Integer.valueOf(localObject1[i1]).intValue());
      localcmc.a.add(localObject2);
    }
    Object localObject2 = paramcja.b;
    i2 = localObject2.length;
    for (i1 = 0; i1 < i2; i1++)
    {
      localObject1 = (clx)paramList3.get(Integer.valueOf(localObject2[i1]).intValue());
      localcmc.b.add(localObject1);
    }
    paramList3 = paramcja.c;
    i2 = paramList3.length;
    for (i1 = 0; i1 < i2; i1++)
    {
      localObject1 = (clx)paramList1.get(Integer.valueOf(paramList3[i1]).intValue());
      localcmc.c.add(localObject1);
    }
    int i3;
    for (i3 : paramcja.e)
    {
      paramList3 = paramciz.b[Integer.valueOf(i3).intValue()].b;
      localcmc.i.add(paramList3);
    }
    localObject1 = paramcja.d;
    i2 = localObject1.length;
    for (i1 = 0; i1 < i2; i1++)
    {
      paramList3 = (clx)paramList1.get(Integer.valueOf(localObject1[i1]).intValue());
      localcmc.d.add(paramList3);
    }
    for (i3 : paramcja.f)
    {
      paramList1 = paramciz.b[Integer.valueOf(i3).intValue()].b;
      localcmc.j.add(paramList1);
    }
    paramList1 = paramcja.g;
    i2 = paramList1.length;
    for (i1 = 0; i1 < i2; i1++)
    {
      paramList3 = (clx)paramList2.get(Integer.valueOf(paramList1[i1]).intValue());
      localcmc.e.add(paramList3);
    }
    for (i3 : paramcja.i)
    {
      paramList1 = paramciz.b[Integer.valueOf(i3).intValue()].b;
      localcmc.g.add(paramList1);
    }
    paramList3 = paramcja.h;
    i2 = paramList3.length;
    for (i1 = 0; i1 < i2; i1++)
    {
      paramList1 = (clx)paramList2.get(Integer.valueOf(paramList3[i1]).intValue());
      localcmc.f.add(paramList1);
    }
    for (i3 : paramcja.j)
    {
      paramcja = paramciz.b[Integer.valueOf(i3).intValue()].b;
      localcmc.h.add(paramcja);
    }
    return new cmb(localcmc.a, localcmc.b, localcmc.c, localcmc.d, localcmc.e, localcmc.f, localcmc.g, localcmc.h, localcmc.i, localcmc.j);
  }
  
  public static cwj a(cwj paramcwj)
  {
    try
    {
      String str = l(cyh.a((cje)paramcwj.a));
      cwj localcwj = new cwj;
      localcwj.<init>(cyh.a(str), paramcwj.b);
      paramcwj = localcwj;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        cuh.a("Escape URI: unsupported encoding", localUnsupportedEncodingException);
      }
    }
    return paramcwj;
  }
  
  public static cwj a(cwj paramcwj, int... paramVarArgs)
  {
    int i2 = paramVarArgs.length;
    int i1 = 0;
    if (i1 < i2)
    {
      int i3 = paramVarArgs[i1];
      if (!(cyh.e((cje)paramcwj.a) instanceof String)) {
        cuh.a("Escaping can only be applied to strings.");
      }
      for (;;)
      {
        i1++;
        break;
        switch (i3)
        {
        default: 
          cuh.a("Unsupported Value Escaping: " + i3);
          break;
        case 12: 
          paramcwj = a(paramcwj);
        }
      }
    }
    return paramcwj;
  }
  
  public static Object a(Object paramObject)
  {
    Object localObject = paramObject;
    if (paramObject != null) {
      localObject = ((Transition)paramObject).clone();
    }
    return localObject;
  }
  
  public static Object a(Object paramObject, int paramInt)
  {
    return ((MediaRouter)paramObject).getSelectedRoute(8388611);
  }
  
  public static Object a(Object[] paramArrayOfObject, int paramInt, String paramString)
  {
    if ((paramInt < 0) || (paramInt >= paramArrayOfObject.length)) {
      i("Index out of bounds detected: " + paramInt + " in " + paramString);
    }
    return paramArrayOfObject[paramInt];
  }
  
  public static String a(cms paramcms)
  {
    if (paramcms == null) {
      paramcms = "";
    }
    for (;;)
    {
      return paramcms;
      StringBuffer localStringBuffer2 = new StringBuffer();
      try
      {
        StringBuffer localStringBuffer1 = new java/lang/StringBuffer;
        localStringBuffer1.<init>();
        a(null, paramcms, localStringBuffer1, localStringBuffer2);
        paramcms = localStringBuffer2.toString();
      }
      catch (IllegalAccessException paramcms)
      {
        paramcms = "Error printing proto: " + paramcms.getMessage();
      }
      catch (InvocationTargetException paramcms)
      {
        paramcms = "Error printing proto: " + paramcms.getMessage();
      }
    }
  }
  
  public static String a(dew paramdew)
  {
    if (paramdew == null) {
      paramdew = "";
    }
    for (;;)
    {
      return paramdew;
      StringBuffer localStringBuffer1 = new StringBuffer();
      try
      {
        StringBuffer localStringBuffer2 = new java/lang/StringBuffer;
        localStringBuffer2.<init>();
        b(null, paramdew, localStringBuffer2, localStringBuffer1);
        paramdew = localStringBuffer1.toString();
      }
      catch (IllegalAccessException paramdew)
      {
        paramdew = String.valueOf(paramdew.getMessage());
        if (paramdew.length() != 0) {
          paramdew = "Error printing proto: ".concat(paramdew);
        } else {
          paramdew = new String("Error printing proto: ");
        }
      }
      catch (InvocationTargetException paramdew)
      {
        paramdew = String.valueOf(paramdew.getMessage());
        if (paramdew.length() != 0) {
          paramdew = "Error printing proto: ".concat(paramdew);
        } else {
          paramdew = new String("Error printing proto: ");
        }
      }
    }
  }
  
  public static String a(dfx paramdfx)
  {
    if (paramdfx == dfx.a) {}
    for (paramdfx = "HTTP/1.0";; paramdfx = "HTTP/1.1") {
      return paramdfx;
    }
  }
  
  public static String a(String paramString, int paramInt)
  {
    if (paramInt <= 0) {
      bqk.a("index out of range for prefix", paramString);
    }
    for (paramString = "";; paramString = paramString + paramInt) {
      return paramString;
    }
  }
  
  public static String a(String paramString, Object paramObject)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException(String.valueOf(paramObject));
    }
    return paramString;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      paramString1 = djy.a(dke.a((paramString1 + ":" + paramString2).getBytes("ISO-8859-1")).b);
      paramString2 = new java/lang/StringBuilder;
      paramString2.<init>("Basic ");
      paramString1 = paramString1;
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      throw new AssertionError();
    }
  }
  
  public static String a(URL paramURL)
  {
    String str = paramURL.getFile();
    if (str == null) {
      paramURL = "/";
    }
    for (;;)
    {
      return paramURL;
      paramURL = str;
      if (!str.startsWith("/")) {
        paramURL = "/" + str;
      }
    }
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    try
    {
      byte[] arrayOfByte = MessageDigest.getInstance("SHA1").digest(paramArrayOfByte);
      paramArrayOfByte = new java/lang/StringBuilder;
      paramArrayOfByte.<init>();
      long l1 = a(arrayOfByte, 16);
      paramArrayOfByte.append(a(a(arrayOfByte, 0) ^ l1));
      paramArrayOfByte.append(b(a(arrayOfByte, 4) ^ l1));
      paramArrayOfByte.append(a(a(arrayOfByte, 8) ^ l1));
      paramArrayOfByte.append(b(l1 ^ a(arrayOfByte, 12)));
      paramArrayOfByte = paramArrayOfByte.toString();
      return paramArrayOfByte;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      throw new IllegalArgumentException("Failed to calculate setup PIN code", paramArrayOfByte);
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      c(paramContext, "PREF_SERVER_URL");
    }
    for (;;)
    {
      return;
      blf.b();
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    paramContext = paramContext.getSharedPreferences(paramString1, 0).edit();
    paramContext.putString(paramString2, paramString3);
    if (Build.VERSION.SDK_INT >= 9) {
      paramContext.apply();
    }
    for (;;)
    {
      return;
      new Thread(new cxu(paramContext)).start();
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, double paramDouble)
  {
    b(paramParcel, paramInt, 8);
    paramParcel.writeDouble(paramDouble);
  }
  
  public static void a(Parcel paramParcel, int paramInt, float paramFloat)
  {
    b(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat);
  }
  
  public static void a(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    paramInt1 = a(paramParcel, paramInt1);
    if (paramInt1 != paramInt2) {
      throw new l("Expected size " + paramInt2 + " got " + paramInt1 + " (0x" + Integer.toHexString(paramInt1) + ")", paramParcel);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, long paramLong)
  {
    b(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }
  
  public static void a(Parcel paramParcel, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBundle == null) {}
    for (;;)
    {
      return;
      paramInt = m(paramParcel, paramInt);
      paramParcel.writeBundle(paramBundle);
      n(paramParcel, paramInt);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, IBinder paramIBinder, boolean paramBoolean)
  {
    if (paramIBinder == null) {}
    for (;;)
    {
      return;
      paramInt = m(paramParcel, paramInt);
      paramParcel.writeStrongBinder(paramIBinder);
      n(paramParcel, paramInt);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramParcelable == null) {}
    for (;;)
    {
      return;
      paramInt1 = m(paramParcel, paramInt1);
      paramParcelable.writeToParcel(paramParcel, paramInt2);
      n(paramParcel, paramInt1);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean)
  {
    if (paramString == null) {}
    for (;;)
    {
      return;
      paramInt = m(paramParcel, paramInt);
      paramParcel.writeString(paramString);
      n(paramParcel, paramInt);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList == null) {}
    for (;;)
    {
      return;
      int i2 = m(paramParcel, paramInt);
      int i1 = paramList.size();
      paramParcel.writeInt(i1);
      paramInt = 0;
      if (paramInt < i1)
      {
        Parcelable localParcelable = (Parcelable)paramList.get(paramInt);
        if (localParcelable == null) {
          paramParcel.writeInt(0);
        }
        for (;;)
        {
          paramInt++;
          break;
          a(paramParcel, localParcelable, 0);
        }
      }
      n(paramParcel, i2);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    b(paramParcel, paramInt, 4);
    if (paramBoolean) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return;
      paramInt = m(paramParcel, paramInt);
      paramParcel.writeByteArray(paramArrayOfByte);
      n(paramParcel, paramInt);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt1, Parcelable[] paramArrayOfParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramArrayOfParcelable == null) {}
    for (;;)
    {
      return;
      int i1 = m(paramParcel, paramInt1);
      int i2 = paramArrayOfParcelable.length;
      paramParcel.writeInt(i2);
      paramInt1 = 0;
      if (paramInt1 < i2)
      {
        Parcelable localParcelable = paramArrayOfParcelable[paramInt1];
        if (localParcelable == null) {
          paramParcel.writeInt(0);
        }
        for (;;)
        {
          paramInt1++;
          break;
          a(paramParcel, localParcelable, paramInt2);
        }
      }
      n(paramParcel, i1);
    }
  }
  
  public static void a(Parcel paramParcel, int paramInt, String[] paramArrayOfString, boolean paramBoolean)
  {
    if (paramArrayOfString == null) {}
    for (;;)
    {
      return;
      paramInt = m(paramParcel, paramInt);
      paramParcel.writeStringArray(paramArrayOfString);
      n(paramParcel, paramInt);
    }
  }
  
  public static void a(Parcel paramParcel, Parcelable paramParcelable, int paramInt)
  {
    int i1 = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int i2 = paramParcel.dataPosition();
    paramParcelable.writeToParcel(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    paramParcel.setDataPosition(i1);
    paramParcel.writeInt(paramInt - i2);
    paramParcel.setDataPosition(paramInt);
  }
  
  public static void a(ctw paramctw, cix paramcix)
  {
    ciw[] arrayOfciw = paramcix.c;
    int i2 = arrayOfciw.length;
    int i1 = 0;
    while (i1 < i2)
    {
      ciw localciw = arrayOfciw[i1];
      if (localciw.a == null)
      {
        cuh.b("GaExperimentRandom: No key");
        i1++;
      }
      else
      {
        Object localObject = paramctw.b(localciw.a);
        if (!(localObject instanceof Number))
        {
          paramcix = null;
          label64:
          long l2 = localciw.b;
          long l1 = localciw.c;
          if ((!localciw.d) || (paramcix == null) || (paramcix.longValue() < l2) || (paramcix.longValue() > l1))
          {
            if (l2 > l1) {
              break label236;
            }
            localObject = Long.valueOf(Math.round(Math.random() * (l1 - l2) + l2));
          }
          paramctw.a(localciw.a);
          localObject = ctw.b(localciw.a, localObject);
          if (localciw.e > 0L)
          {
            if (((Map)localObject).containsKey("gtm")) {
              break label245;
            }
            ((Map)localObject).put("gtm", ctw.a(new Object[] { "lifetime", Long.valueOf(localciw.e) }));
          }
        }
        for (;;)
        {
          paramctw.a((Map)localObject);
          break;
          paramcix = Long.valueOf(((Number)localObject).longValue());
          break label64;
          label236:
          cuh.b("GaExperimentRandom: random range invalid");
          break;
          label245:
          paramcix = ((Map)localObject).get("gtm");
          if ((paramcix instanceof Map)) {
            ((Map)paramcix).put("lifetime", Long.valueOf(localciw.e));
          } else {
            cuh.b("GaExperimentRandom: gtm not a map");
          }
        }
      }
    }
  }
  
  public static void a(ctw paramctw, cjc paramcjc)
  {
    if (paramcjc.b == null) {
      cuh.b("supplemental missing experimentSupplemental");
    }
    for (;;)
    {
      return;
      Object localObject = paramcjc.b.b;
      int i2 = localObject.length;
      for (int i1 = 0; i1 < i2; i1++) {
        paramctw.a(cyh.a(localObject[i1]));
      }
      cje[] arrayOfcje = paramcjc.b.a;
      i2 = arrayOfcje.length;
      i1 = 0;
      if (i1 < i2)
      {
        localObject = cyh.e(arrayOfcje[i1]);
        if (!(localObject instanceof Map)) {
          cuh.b("value: " + localObject + " is not a map value, ignored.");
        }
        for (localObject = null;; localObject = (Map)localObject)
        {
          if (localObject != null) {
            paramctw.a((Map)localObject);
          }
          i1++;
          break;
        }
      }
      a(paramctw, paramcjc.b);
    }
  }
  
  public static void a(Closeable paramCloseable)
  {
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
  
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int i1 = paramInputStream.read(arrayOfByte);
      if (i1 == -1) {
        return;
      }
      paramOutputStream.write(arrayOfByte, 0, i1);
    }
  }
  
  public static void a(Object paramObject, View paramView)
  {
    ((Transition)paramObject).setEpicenterCallback(new ag(a(paramView)));
  }
  
  public static void a(Object paramObject, View paramView, boolean paramBoolean)
  {
    ((Transition)paramObject).excludeTarget(paramView, paramBoolean);
  }
  
  public static void a(Object paramObject1, Object paramObject2)
  {
    ((MediaRouter)paramObject1).removeCallback((MediaRouter.Callback)paramObject2);
  }
  
  public static void a(Object paramObject1, Object paramObject2, View paramView1, al paramal, View paramView2, ak paramak, Map paramMap1, ArrayList paramArrayList1, Map paramMap2, ArrayList paramArrayList2)
  {
    if ((paramObject1 != null) || (paramObject2 != null))
    {
      paramObject1 = (Transition)paramObject1;
      if (paramObject1 != null) {
        ((Transition)paramObject1).addTarget(paramView2);
      }
      if (paramObject2 != null) {
        b((Transition)paramObject2, paramArrayList2);
      }
      paramView1.getViewTreeObserver().addOnPreDrawListener(new ah(paramView1, paramal, paramMap1, paramMap2, (Transition)paramObject1, paramArrayList1, paramView2));
      if (paramObject1 != null) {
        ((Transition)paramObject1).setEpicenterCallback(new ai(paramak));
      }
    }
  }
  
  public static void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    if (paramObject == null) {
      paramStringBuilder.append("null");
    }
    for (;;)
    {
      return;
      String str2 = paramObject.getClass().getSimpleName();
      String str1;
      if (str2 != null)
      {
        str1 = str2;
        if (str2.length() > 0) {}
      }
      else
      {
        str2 = paramObject.getClass().getName();
        int i1 = str2.lastIndexOf('.');
        str1 = str2;
        if (i1 > 0) {
          str1 = str2.substring(i1 + 1);
        }
      }
      paramStringBuilder.append(str1);
      paramStringBuilder.append('{');
      paramStringBuilder.append(Integer.toHexString(System.identityHashCode(paramObject)));
    }
  }
  
  public static void a(Object paramObject, ArrayList paramArrayList)
  {
    paramObject = (Transition)paramObject;
    int i1;
    if ((paramObject instanceof TransitionSet))
    {
      paramObject = (TransitionSet)paramObject;
      int i2 = ((TransitionSet)paramObject).getTransitionCount();
      for (i1 = 0; i1 < i2; i1++) {
        a(((TransitionSet)paramObject).getTransitionAt(i1), paramArrayList);
      }
    }
    if (!a((Transition)paramObject))
    {
      List localList = ((Transition)paramObject).getTargets();
      if ((localList != null) && (localList.size() == paramArrayList.size()) && (localList.containsAll(paramArrayList))) {
        for (i1 = paramArrayList.size() - 1; i1 >= 0; i1--) {
          ((Transition)paramObject).removeTarget((View)paramArrayList.get(i1));
        }
      }
    }
  }
  
  public static void a(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      Trace.beginSection(paramString);
    }
  }
  
  public static void a(String paramString, Object paramObject, StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2)
  {
    if (paramObject != null)
    {
      if (!(paramObject instanceof cms)) {
        break label430;
      }
      int i4 = paramStringBuffer1.length();
      if (paramString != null)
      {
        paramStringBuffer2.append(paramStringBuffer1).append(j(paramString)).append(" <\n");
        paramStringBuffer1.append("  ");
      }
      Class localClass = paramObject.getClass();
      Object localObject1 = localClass.getFields();
      int i5 = localObject1.length;
      int i1 = 0;
      String str;
      Object localObject2;
      if (i1 < i5)
      {
        Object localObject3 = localObject1[i1];
        i2 = ((Field)localObject3).getModifiers();
        str = ((Field)localObject3).getName();
        if (((i2 & 0x1) == 1) && ((i2 & 0x8) != 8) && (!str.startsWith("_")) && (!str.endsWith("_")))
        {
          localObject2 = ((Field)localObject3).getType();
          localObject3 = ((Field)localObject3).get(paramObject);
          if (!((Class)localObject2).isArray()) {
            break label234;
          }
          if (((Class)localObject2).getComponentType() != Byte.TYPE) {
            break label186;
          }
          a(str, localObject3, paramStringBuffer1, paramStringBuffer2);
        }
        for (;;)
        {
          i1++;
          break;
          label186:
          if (localObject3 == null) {}
          for (i2 = 0;; i2 = Array.getLength(localObject3))
          {
            for (int i3 = 0; i3 < i2; i3++) {
              a(str, Array.get(localObject3, i3), paramStringBuffer1, paramStringBuffer2);
            }
            break;
          }
          label234:
          a(str, localObject3, paramStringBuffer1, paramStringBuffer2);
        }
      }
      localObject1 = localClass.getMethods();
      int i2 = localObject1.length;
      i1 = 0;
      while (i1 < i2)
      {
        str = localObject1[i1].getName();
        if (str.startsWith("set")) {
          str = str.substring(3);
        }
        for (;;)
        {
          try
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("has");
            localObject2 = localClass.getMethod(str, new Class[0]);
            if (!((Boolean)((Method)localObject2).invoke(paramObject, new Object[0])).booleanValue()) {}
          }
          catch (NoSuchMethodException localNoSuchMethodException2)
          {
            continue;
          }
          try
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("get");
            localObject2 = localClass.getMethod(str, new Class[0]);
            a(str, ((Method)localObject2).invoke(paramObject, new Object[0]), paramStringBuffer1, paramStringBuffer2);
            i1++;
          }
          catch (NoSuchMethodException localNoSuchMethodException1) {}
        }
      }
      if (paramString != null)
      {
        paramStringBuffer1.setLength(i4);
        paramStringBuffer2.append(paramStringBuffer1).append(">\n");
      }
    }
    return;
    label430:
    paramString = j(paramString);
    paramStringBuffer2.append(paramStringBuffer1).append(paramString).append(": ");
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
      paramString = (String)paramObject;
      if (!((String)paramObject).startsWith("http"))
      {
        paramString = (String)paramObject;
        if (((String)paramObject).length() > 200) {
          paramString = ((String)paramObject).substring(0, 200) + "[...]";
        }
      }
      paramString = k(paramString);
      paramStringBuffer2.append("\"").append(paramString).append("\"");
    }
    for (;;)
    {
      paramStringBuffer2.append("\n");
      break;
      if ((paramObject instanceof byte[])) {
        a((byte[])paramObject, paramStringBuffer2);
      } else {
        paramStringBuffer2.append(paramObject);
      }
    }
  }
  
  public static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (b(5)) {
      Log.w(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void a(String paramString, Object... paramVarArgs)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("(");
    int i2 = paramVarArgs.length;
    paramString = "";
    int i1 = 0;
    if (i1 < i2)
    {
      Object localObject = paramVarArgs[i1];
      localStringBuilder.append(paramString);
      if ((localObject instanceof Bundle)) {
        localStringBuilder.append(csi.a((Bundle)localObject));
      }
      for (;;)
      {
        paramString = ", ";
        i1++;
        break;
        localStringBuilder.append(localObject);
      }
    }
    localStringBuilder.append(")");
    if (Log.isLoggable("PeopleClientCall", 2)) {
      new Throwable("STACK TRACE (It's not crash!)");
    }
  }
  
  static void a(ArrayList paramArrayList, View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      if (!(paramView instanceof ViewGroup)) {
        break label60;
      }
      paramView = (ViewGroup)paramView;
      if (!paramView.isTransitionGroup()) {
        break label33;
      }
      paramArrayList.add(paramView);
    }
    for (;;)
    {
      return;
      label33:
      int i2 = paramView.getChildCount();
      for (int i1 = 0; i1 < i2; i1++) {
        a(paramArrayList, paramView.getChildAt(i1));
      }
      continue;
      label60:
      paramArrayList.add(paramView);
    }
  }
  
  public static void a(Map paramMap, View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      String str = paramView.getTransitionName();
      if (str != null) {
        paramMap.put(str, paramView);
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int i2 = paramView.getChildCount();
        for (int i1 = 0; i1 < i2; i1++) {
          a(paramMap, paramView.getChildAt(i1));
        }
      }
    }
  }
  
  public static void a(XmlPullParser paramXmlPullParser)
  {
    if (paramXmlPullParser.getEventType() != 2) {
      throw new IllegalStateException();
    }
    int i1 = 1;
    while (i1 != 0) {
      switch (paramXmlPullParser.next())
      {
      default: 
        break;
      case 2: 
        i1++;
        break;
      case 3: 
        i1--;
      }
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    if (!paramBoolean) {
      throw new IllegalStateException();
    }
  }
  
  public static void a(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean) {
      throw new IllegalStateException(String.valueOf(paramObject));
    }
  }
  
  public static void a(byte[] paramArrayOfByte, StringBuffer paramStringBuffer)
  {
    if (paramArrayOfByte == null) {
      paramStringBuffer.append("\"\"");
    }
    for (;;)
    {
      return;
      paramStringBuffer.append('"');
      int i1 = 0;
      if (i1 < paramArrayOfByte.length)
      {
        int i2 = paramArrayOfByte[i1] & 0xFF;
        if ((i2 == 92) || (i2 == 34)) {
          paramStringBuffer.append('\\').append((char)i2);
        }
        for (;;)
        {
          i1++;
          break;
          if ((i2 >= 32) && (i2 < 127)) {
            paramStringBuffer.append((char)i2);
          } else {
            paramStringBuffer.append(String.format("\\%03o", new Object[] { Integer.valueOf(i2) }));
          }
        }
      }
      paramStringBuffer.append('"');
    }
  }
  
  public static boolean a(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= paramInt) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean a(ActivityManager paramActivityManager)
  {
    if (Build.VERSION.SDK_INT >= 19) {}
    for (boolean bool = paramActivityManager.isLowRamDevice();; bool = false) {
      return bool;
    }
  }
  
  public static boolean a(Messenger paramMessenger)
  {
    bool2 = false;
    bool1 = bool2;
    if (paramMessenger != null) {}
    try
    {
      paramMessenger = paramMessenger.getBinder();
      bool1 = bool2;
      if (paramMessenger != null) {
        bool1 = true;
      }
    }
    catch (NullPointerException paramMessenger)
    {
      for (;;)
      {
        bool1 = bool2;
      }
    }
    return bool1;
  }
  
  static boolean a(Transition paramTransition)
  {
    if ((!a(paramTransition.getTargetIds())) || (!a(paramTransition.getTargetNames())) || (!a(paramTransition.getTargetTypes()))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    try
    {
      bool = paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
      return bool;
    }
    catch (AbstractMethodError paramView)
    {
      for (;;)
      {
        Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface method onNestedPreFling", paramView);
        boolean bool = false;
      }
    }
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    try
    {
      paramBoolean = paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
      return paramBoolean;
    }
    catch (AbstractMethodError paramView)
    {
      for (;;)
      {
        Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface method onNestedFling", paramView);
        paramBoolean = false;
      }
    }
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    try
    {
      bool = paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);
      return bool;
    }
    catch (AbstractMethodError paramView1)
    {
      for (;;)
      {
        Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface method onStartNestedScroll", paramView1);
        boolean bool = false;
      }
    }
  }
  
  public static boolean a(Object paramObject, float paramFloat)
  {
    ((EdgeEffect)paramObject).onPull(paramFloat);
    return true;
  }
  
  static boolean a(List paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static char b(long paramLong)
  {
    return Character.toChars((int)(paramLong % 8L) + 50)[0];
  }
  
  public static int b(View paramView)
  {
    if (!c) {}
    try
    {
      Field localField = View.class.getDeclaredField("mMinWidth");
      b = localField;
      localField.setAccessible(true);
      c = true;
      if (b != null) {}
      for (;;)
      {
        try
        {
          i1 = ((Integer)b.get(paramView)).intValue();
          return i1;
        }
        catch (Exception paramView) {}
        int i1 = 0;
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  public static int b(String paramString, int paramInt)
  {
    while (paramInt < paramString.length())
    {
      int i1 = paramString.charAt(paramInt);
      if ((i1 != 32) && (i1 != 9)) {
        break;
      }
      paramInt++;
    }
    return paramInt;
  }
  
  public static long b(String paramString)
  {
    try
    {
      l1 = DateUtils.parseDate(paramString).getTime();
      return l1;
    }
    catch (DateParseException paramString)
    {
      for (;;)
      {
        long l1 = 0L;
      }
    }
  }
  
  public static bzr b(Object paramObject)
  {
    return new bzr(paramObject);
  }
  
  public static cjb b(cje paramcje)
  {
    if ((cjb)paramcje.a(cjb.a) == null) {
      i("Expected a ServingValue and didn't get one. Value is: " + paramcje);
    }
    return (cjb)paramcje.a(cjb.a);
  }
  
  public static String b(int paramInt1, int paramInt2)
  {
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    StringBuffer localStringBuffer = new StringBuffer();
    paramInt1 = 3;
    if (paramInt1 < paramInt2 + 3)
    {
      if (paramInt1 + 4 >= arrayOfStackTraceElement.length) {}
      for (Object localObject = "<bottom of call stack>";; localObject = ((StackTraceElement)localObject).getClassName() + "." + ((StackTraceElement)localObject).getMethodName() + ":" + ((StackTraceElement)localObject).getLineNumber())
      {
        localStringBuffer.append((String)localObject).append(" ");
        paramInt1++;
        break;
        localObject = arrayOfStackTraceElement[(paramInt1 + 4)];
      }
    }
    return localStringBuffer.toString();
  }
  
  public static String b(Context paramContext)
  {
    int i1 = Binder.getCallingPid();
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (paramContext != null)
    {
      Iterator localIterator = paramContext.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        paramContext = (ActivityManager.RunningAppProcessInfo)localIterator.next();
      } while (paramContext.pid != i1);
    }
    for (paramContext = paramContext.processName;; paramContext = null) {
      return paramContext;
    }
  }
  
  public static String b(XmlPullParser paramXmlPullParser)
  {
    String str = paramXmlPullParser.nextText();
    if (paramXmlPullParser.getEventType() != 3) {
      paramXmlPullParser.nextTag();
    }
    return str;
  }
  
  public static String b(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i2 = paramArrayOfByte.length;
    for (int i1 = 0; i1 < i2; i1++)
    {
      int i3 = paramArrayOfByte[i1];
      if ((i3 & 0xF0) == 0) {
        localStringBuilder.append("0");
      }
      localStringBuilder.append(Integer.toHexString(i3 & 0xFF));
    }
    return localStringBuilder.toString().toUpperCase();
  }
  
  public static void b()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      Trace.endSection();
    }
  }
  
  public static void b(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      c(paramContext, "PREF_COUNTRY_OVERRIDE");
    }
    for (;;)
    {
      return;
      blf.b();
    }
  }
  
  public static void b(Parcel paramParcel, int paramInt)
  {
    paramParcel.setDataPosition(a(paramParcel, paramInt) + paramParcel.dataPosition());
  }
  
  public static void b(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 65535)
    {
      paramParcel.writeInt(0xFFFF0000 | paramInt1);
      paramParcel.writeInt(paramInt2);
    }
    for (;;)
    {
      return;
      paramParcel.writeInt(paramInt2 << 16 | paramInt1);
    }
  }
  
  public static void b(Object paramObject1, Object paramObject2)
  {
    ((MediaRouter.RouteInfo)paramObject1).setTag(paramObject2);
  }
  
  public static void b(Object paramObject, ArrayList paramArrayList)
  {
    int i1 = 0;
    paramObject = (Transition)paramObject;
    int i2;
    if ((paramObject instanceof TransitionSet))
    {
      paramObject = (TransitionSet)paramObject;
      i2 = ((TransitionSet)paramObject).getTransitionCount();
      while (i1 < i2)
      {
        b(((TransitionSet)paramObject).getTransitionAt(i1), paramArrayList);
        i1++;
      }
    }
    if ((!a((Transition)paramObject)) && (a(((Transition)paramObject).getTargets())))
    {
      i2 = paramArrayList.size();
      for (i1 = 0; i1 < i2; i1++) {
        ((Transition)paramObject).addTarget((View)paramArrayList.get(i1));
      }
    }
  }
  
  public static void b(String paramString, Object paramObject, StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2)
  {
    if (paramObject != null)
    {
      if (!(paramObject instanceof dew)) {
        break label489;
      }
      int i4 = paramStringBuffer1.length();
      if (paramString != null)
      {
        paramStringBuffer2.append(paramStringBuffer1).append(n(paramString)).append(" <\n");
        paramStringBuffer1.append("  ");
      }
      Class localClass = paramObject.getClass();
      Object localObject2 = localClass.getFields();
      int i5 = localObject2.length;
      int i1 = 0;
      Object localObject1;
      Object localObject3;
      if (i1 < i5)
      {
        Object localObject4 = localObject2[i1];
        i2 = ((Field)localObject4).getModifiers();
        localObject1 = ((Field)localObject4).getName();
        if ((!"cachedSize".equals(localObject1)) && ((i2 & 0x1) == 1) && ((i2 & 0x8) != 8) && (!((String)localObject1).startsWith("_")) && (!((String)localObject1).endsWith("_")))
        {
          localObject3 = ((Field)localObject4).getType();
          localObject4 = ((Field)localObject4).get(paramObject);
          if (!((Class)localObject3).isArray()) {
            break label245;
          }
          if (((Class)localObject3).getComponentType() != Byte.TYPE) {
            break label197;
          }
          b((String)localObject1, localObject4, paramStringBuffer1, paramStringBuffer2);
        }
        for (;;)
        {
          i1++;
          break;
          label197:
          if (localObject4 == null) {}
          for (i2 = 0;; i2 = Array.getLength(localObject4))
          {
            for (int i3 = 0; i3 < i2; i3++) {
              b((String)localObject1, Array.get(localObject4, i3), paramStringBuffer1, paramStringBuffer2);
            }
            break;
          }
          label245:
          b((String)localObject1, localObject4, paramStringBuffer1, paramStringBuffer2);
        }
      }
      localObject2 = localClass.getMethods();
      int i2 = localObject2.length;
      i1 = 0;
      if (i1 < i2)
      {
        localObject1 = localObject2[i1].getName();
        if (((String)localObject1).startsWith("set")) {
          localObject3 = ((String)localObject1).substring(3);
        }
        for (;;)
        {
          try
          {
            localObject1 = String.valueOf(localObject3);
            if (((String)localObject1).length() != 0)
            {
              localObject1 = "has".concat((String)localObject1);
              localObject1 = localClass.getMethod((String)localObject1, new Class[0]);
              if (!((Boolean)((Method)localObject1).invoke(paramObject, new Object[0])).booleanValue()) {}
            }
          }
          catch (NoSuchMethodException localNoSuchMethodException1)
          {
            continue;
            String str = new String("get");
            continue;
          }
          try
          {
            localObject1 = String.valueOf(localObject3);
            if (((String)localObject1).length() == 0) {
              continue;
            }
            localObject1 = "get".concat((String)localObject1);
            localObject1 = localClass.getMethod((String)localObject1, new Class[0]);
            b((String)localObject3, ((Method)localObject1).invoke(paramObject, new Object[0]), paramStringBuffer1, paramStringBuffer2);
            i1++;
          }
          catch (NoSuchMethodException localNoSuchMethodException2)
          {
            continue;
          }
          break;
          localObject1 = new String("has");
        }
      }
      if (paramString != null)
      {
        paramStringBuffer1.setLength(i4);
        paramStringBuffer2.append(paramStringBuffer1).append(">\n");
      }
    }
    return;
    label489:
    paramString = n(paramString);
    paramStringBuffer2.append(paramStringBuffer1).append(paramString).append(": ");
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
      paramString = (String)paramObject;
      if (!((String)paramObject).startsWith("http"))
      {
        paramString = (String)paramObject;
        if (((String)paramObject).length() > 200) {
          paramString = String.valueOf(((String)paramObject).substring(0, 200)).concat("[...]");
        }
      }
      paramString = o(paramString);
      paramStringBuffer2.append("\"").append(paramString).append("\"");
    }
    for (;;)
    {
      paramStringBuffer2.append("\n");
      break;
      if ((paramObject instanceof byte[])) {
        b((byte[])paramObject, paramStringBuffer2);
      } else {
        paramStringBuffer2.append(paramObject);
      }
    }
  }
  
  public static void b(boolean paramBoolean)
  {
    if (!paramBoolean) {
      throw new IllegalArgumentException();
    }
  }
  
  public static void b(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean) {
      throw new IllegalArgumentException(String.valueOf(paramObject));
    }
  }
  
  public static void b(byte[] paramArrayOfByte, StringBuffer paramStringBuffer)
  {
    if (paramArrayOfByte == null) {
      paramStringBuffer.append("\"\"");
    }
    for (;;)
    {
      return;
      paramStringBuffer.append('"');
      int i1 = 0;
      if (i1 < paramArrayOfByte.length)
      {
        int i2 = paramArrayOfByte[i1] & 0xFF;
        if ((i2 == 92) || (i2 == 34)) {
          paramStringBuffer.append('\\').append((char)i2);
        }
        for (;;)
        {
          i1++;
          break;
          if ((i2 >= 32) && (i2 < 127)) {
            paramStringBuffer.append((char)i2);
          } else {
            paramStringBuffer.append(String.format("\\%03o", new Object[] { Integer.valueOf(i2) }));
          }
        }
      }
      paramStringBuffer.append('"');
    }
  }
  
  public static boolean b(int paramInt)
  {
    boolean bool = iv;
    if (Log.isLoggable("PeopleService", paramInt)) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static Object[] b(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    paramInt = a(paramParcel, paramInt);
    int i1 = paramParcel.dataPosition();
    if (paramInt == 0) {}
    for (paramParcel = null;; paramParcel = paramCreator)
    {
      return paramParcel;
      paramCreator = paramParcel.createTypedArray(paramCreator);
      paramParcel.setDataPosition(paramInt + i1);
    }
  }
  
  public static int c(View paramView)
  {
    if (!e) {}
    try
    {
      Field localField = View.class.getDeclaredField("mMinHeight");
      d = localField;
      localField.setAccessible(true);
      e = true;
      if (d != null) {}
      for (;;)
      {
        try
        {
          i1 = ((Integer)d.get(paramView)).intValue();
          return i1;
        }
        catch (Exception paramView) {}
        int i1 = 0;
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  public static int c(String paramString, int paramInt)
  {
    for (;;)
    {
      try
      {
        l1 = Long.parseLong(paramString);
        if (l1 <= 2147483647L) {
          continue;
        }
        paramInt = Integer.MAX_VALUE;
      }
      catch (NumberFormatException paramString)
      {
        long l1;
        continue;
      }
      return paramInt;
      if (l1 < 0L) {
        paramInt = 0;
      } else {
        paramInt = (int)l1;
      }
    }
  }
  
  public static Object c(Object paramObject)
  {
    if (paramObject == null) {
      throw new NullPointerException("null reference");
    }
    return paramObject;
  }
  
  public static String c(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("applicationId cannot be null");
    }
    StringBuilder localStringBuilder = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
    if (paramString != null)
    {
      String str = paramString.toUpperCase();
      if (!str.matches("[A-F0-9]+")) {
        throw new IllegalArgumentException("Invalid application ID: " + paramString);
      }
      localStringBuilder.append("/").append(str);
    }
    return localStringBuilder.toString();
  }
  
  public static ArrayList c(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator)
  {
    paramInt = a(paramParcel, paramInt);
    int i1 = paramParcel.dataPosition();
    if (paramInt == 0) {}
    for (paramParcel = null;; paramParcel = paramCreator)
    {
      return paramParcel;
      paramCreator = paramParcel.createTypedArrayList(paramCreator);
      paramParcel.setDataPosition(paramInt + i1);
    }
  }
  
  public static void c()
  {
    if (Looper.myLooper() != Looper.getMainLooper()) {
      throw new IllegalStateException("This method may only be called on the application's main thread.");
    }
  }
  
  public static void c(Context paramContext, String paramString)
  {
    paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
    paramContext.remove(paramString);
    paramContext.commit();
  }
  
  public static void c(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    b(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }
  
  public static void c(Object paramObject1, Object paramObject2)
  {
    ((MediaRouter.UserRouteInfo)paramObject1).setVolumeCallback((MediaRouter.VolumeCallback)paramObject2);
  }
  
  public static boolean c(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 4);
    if (paramParcel.readInt() != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static int d()
  {
    try
    {
      i1 = Integer.parseInt(Build.VERSION.SDK);
      return i1;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        bqk.a("Invalid version number", Build.VERSION.SDK);
        int i1 = 0;
      }
    }
  }
  
  public static int d(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }
  
  public static Object d(Object paramObject)
  {
    if ((paramObject instanceof JSONArray)) {
      throw new RuntimeException("JSONArrays are not supported");
    }
    if (JSONObject.NULL.equals(paramObject)) {
      throw new RuntimeException("JSON nulls are not supported");
    }
    Object localObject = paramObject;
    if ((paramObject instanceof JSONObject))
    {
      JSONObject localJSONObject = (JSONObject)paramObject;
      localObject = new HashMap();
      paramObject = localJSONObject.keys();
      while (((Iterator)paramObject).hasNext())
      {
        String str = (String)((Iterator)paramObject).next();
        ((Map)localObject).put(str, d(localJSONObject.get(str)));
      }
    }
    return localObject;
  }
  
  public static void d(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Namespace cannot be null or empty");
    }
    if (paramString.length() > 128) {
      throw new IllegalArgumentException("Invalid namespace length");
    }
    if (!paramString.startsWith("urn:x-cast:")) {
      throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
    }
    if (paramString.length() == 11) {
      throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
    }
  }
  
  public static boolean d(Object paramObject1, Object paramObject2)
  {
    if (((paramObject1 == null) && (paramObject2 == null)) || ((paramObject1 != null) && (paramObject2 != null) && (paramObject1.equals(paramObject2)))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static long e(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }
  
  public static String e(String paramString)
  {
    return "urn:x-cast:" + paramString;
  }
  
  public static boolean e(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static float f(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 4);
    return paramParcel.readFloat();
  }
  
  public static Object f(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      throw new NullPointerException(String.valueOf(paramObject2));
    }
    return paramObject1;
  }
  
  public static String f(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Given String is empty or null");
    }
    return paramString;
  }
  
  public static double g(Parcel paramParcel, int paramInt)
  {
    a(paramParcel, paramInt, 8);
    return paramParcel.readDouble();
  }
  
  public static void g(String paramString)
  {
    if (Looper.myLooper() != Looper.getMainLooper()) {
      throw new IllegalStateException(paramString);
    }
  }
  
  public static String h(Parcel paramParcel, int paramInt)
  {
    paramInt = a(paramParcel, paramInt);
    int i1 = paramParcel.dataPosition();
    if (paramInt == 0) {}
    String str;
    for (paramParcel = null;; paramParcel = str)
    {
      return paramParcel;
      str = paramParcel.readString();
      paramParcel.setDataPosition(paramInt + i1);
    }
  }
  
  public static void h(String paramString)
  {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      throw new IllegalStateException(paramString);
    }
  }
  
  public static IBinder i(Parcel paramParcel, int paramInt)
  {
    paramInt = a(paramParcel, paramInt);
    int i1 = paramParcel.dataPosition();
    if (paramInt == 0) {}
    IBinder localIBinder;
    for (paramParcel = null;; paramParcel = localIBinder)
    {
      return paramParcel;
      localIBinder = paramParcel.readStrongBinder();
      paramParcel.setDataPosition(paramInt + i1);
    }
  }
  
  public static void i(String paramString)
  {
    cuh.a(paramString);
    throw new cmd(paramString);
  }
  
  public static Bundle j(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i1 == 0) {}
    Bundle localBundle;
    for (paramParcel = null;; paramParcel = localBundle)
    {
      return paramParcel;
      localBundle = paramParcel.readBundle();
      paramParcel.setDataPosition(i1 + paramInt);
    }
  }
  
  public static String j(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i1 = 0;
    if (i1 < paramString.length())
    {
      char c1 = paramString.charAt(i1);
      if (i1 == 0) {
        localStringBuffer.append(Character.toLowerCase(c1));
      }
      for (;;)
      {
        i1++;
        break;
        if (Character.isUpperCase(c1)) {
          localStringBuffer.append('_').append(Character.toLowerCase(c1));
        } else {
          localStringBuffer.append(c1);
        }
      }
    }
    return localStringBuffer.toString();
  }
  
  public static String k(String paramString)
  {
    int i2 = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(i2);
    int i1 = 0;
    if (i1 < i2)
    {
      char c1 = paramString.charAt(i1);
      if ((c1 >= ' ') && (c1 <= '~') && (c1 != '"') && (c1 != '\'')) {
        localStringBuilder.append(c1);
      }
      for (;;)
      {
        i1++;
        break;
        localStringBuilder.append(String.format("\\u%04x", new Object[] { Integer.valueOf(c1) }));
      }
    }
    return localStringBuilder.toString();
  }
  
  public static byte[] k(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i1 == 0) {}
    byte[] arrayOfByte;
    for (paramParcel = null;; paramParcel = arrayOfByte)
    {
      return paramParcel;
      arrayOfByte = paramParcel.createByteArray();
      paramParcel.setDataPosition(i1 + paramInt);
    }
  }
  
  public static String l(String paramString)
  {
    return URLEncoder.encode(paramString, "UTF-8").replaceAll("\\+", "%20");
  }
  
  public static String[] l(Parcel paramParcel, int paramInt)
  {
    int i1 = a(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i1 == 0) {}
    String[] arrayOfString;
    for (paramParcel = null;; paramParcel = arrayOfString)
    {
      return paramParcel;
      arrayOfString = paramParcel.createStringArray();
      paramParcel.setDataPosition(i1 + paramInt);
    }
  }
  
  public static int m(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(0xFFFF0000 | paramInt);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }
  
  public static byte[] m(String paramString)
  {
    int i2 = paramString.length();
    if (i2 % 2 != 0) {
      throw new IllegalArgumentException("purported base16 string has odd number of characters");
    }
    byte[] arrayOfByte = new byte[i2 / 2];
    for (int i1 = 0; i1 < i2; i1 += 2)
    {
      int i4 = Character.digit(paramString.charAt(i1), 16);
      int i3 = Character.digit(paramString.charAt(i1 + 1), 16);
      if ((i4 == -1) || (i3 == -1)) {
        throw new IllegalArgumentException("purported base16 string has illegal char");
      }
      arrayOfByte[(i1 / 2)] = ((byte)((i4 << 4) + i3));
    }
    return arrayOfByte;
  }
  
  public static String n(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i1 = 0;
    if (i1 < paramString.length())
    {
      char c1 = paramString.charAt(i1);
      if (i1 == 0) {
        localStringBuffer.append(Character.toLowerCase(c1));
      }
      for (;;)
      {
        i1++;
        break;
        if (Character.isUpperCase(c1)) {
          localStringBuffer.append('_').append(Character.toLowerCase(c1));
        } else {
          localStringBuffer.append(c1);
        }
      }
    }
    return localStringBuffer.toString();
  }
  
  public static void n(Parcel paramParcel, int paramInt)
  {
    int i1 = paramParcel.dataPosition();
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(i1 - paramInt);
    paramParcel.setDataPosition(i1);
  }
  
  public static String o(String paramString)
  {
    int i2 = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(i2);
    int i1 = 0;
    if (i1 < i2)
    {
      char c1 = paramString.charAt(i1);
      if ((c1 >= ' ') && (c1 <= '~') && (c1 != '"') && (c1 != '\'')) {
        localStringBuilder.append(c1);
      }
      for (;;)
      {
        i1++;
        break;
        localStringBuilder.append(String.format("\\u%04x", new Object[] { Integer.valueOf(c1) }));
      }
    }
    return localStringBuilder.toString();
  }
  
  public static boolean p(String paramString)
  {
    if ((paramString.equals("POST")) || (paramString.equals("PUT")) || (paramString.equals("PATCH"))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean q(String paramString)
  {
    if ((p(paramString)) || (paramString.equals("DELETE"))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public View a()
  {
    return this.a.N;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */