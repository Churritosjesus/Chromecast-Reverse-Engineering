package android.support.v7.widget;

import a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import ed;
import gd;
import gi;
import gj;
import go;
import gp;
import gt;
import ic;
import iz;
import java.util.ArrayList;
import java.util.List;
import lc;
import lr;
import s;
import wh;
import xb;
import xc;
import xd;
import yw;
import yz;
import za;
import zc;
import zd;
import zf;
import zg;
import zh;
import zi;
import zj;
import zk;
import zl;
import zm;
import zn;
import zp;
import zq;
import zr;
import zs;

public class RecyclerView
  extends ViewGroup
  implements gi, go
{
  private static final Interpolator ai;
  private static final boolean s;
  private static final Class[] t;
  private final ArrayList A;
  private s B;
  private boolean C;
  private boolean D;
  private boolean E;
  private int F;
  private boolean G;
  private final boolean H;
  private final AccessibilityManager I;
  private int J;
  private int K;
  private int L;
  private VelocityTracker M;
  private int N;
  private int O;
  private int P;
  private int Q;
  private int R;
  private final int S;
  private final int T;
  private float U;
  private final zq V;
  private zd W;
  public final zl a;
  private boolean aa;
  private zs ab;
  private final int[] ac;
  private final gj ad;
  private final int[] ae;
  private final int[] af;
  private final int[] ag;
  private Runnable ah;
  public wh b;
  public xb c;
  public yz d;
  public zh e;
  public boolean f;
  public boolean g;
  public boolean h;
  public lc i;
  public lc j;
  public lc k;
  public lc l;
  public zc m;
  public final zp n;
  public zj o;
  public List p;
  public boolean q;
  public boolean r;
  private final zm u;
  private zn v;
  private boolean w;
  private final Runnable x;
  private final Rect y;
  private final ArrayList z;
  
  static
  {
    if ((Build.VERSION.SDK_INT == 18) || (Build.VERSION.SDK_INT == 19) || (Build.VERSION.SDK_INT == 20)) {}
    for (boolean bool = true;; bool = false)
    {
      s = bool;
      t = new Class[] { Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE };
      ai = new yw();
      return;
    }
  }
  
  public RecyclerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  /* Error */
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial 143	android/view/ViewGroup:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new 145	zm
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 148	zm:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   16: putfield 150	android/support/v7/widget/RecyclerView:u	Lzm;
    //   19: aload_0
    //   20: new 152	zl
    //   23: dup
    //   24: aload_0
    //   25: invokespecial 153	zl:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   28: putfield 155	android/support/v7/widget/RecyclerView:a	Lzl;
    //   31: aload_0
    //   32: new 157	yu
    //   35: dup
    //   36: aload_0
    //   37: invokespecial 158	yu:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   40: putfield 160	android/support/v7/widget/RecyclerView:x	Ljava/lang/Runnable;
    //   43: aload_0
    //   44: new 162	android/graphics/Rect
    //   47: dup
    //   48: invokespecial 163	android/graphics/Rect:<init>	()V
    //   51: putfield 165	android/support/v7/widget/RecyclerView:y	Landroid/graphics/Rect;
    //   54: aload_0
    //   55: new 167	java/util/ArrayList
    //   58: dup
    //   59: invokespecial 168	java/util/ArrayList:<init>	()V
    //   62: putfield 170	android/support/v7/widget/RecyclerView:z	Ljava/util/ArrayList;
    //   65: aload_0
    //   66: new 167	java/util/ArrayList
    //   69: dup
    //   70: invokespecial 168	java/util/ArrayList:<init>	()V
    //   73: putfield 172	android/support/v7/widget/RecyclerView:A	Ljava/util/ArrayList;
    //   76: aload_0
    //   77: iconst_0
    //   78: putfield 174	android/support/v7/widget/RecyclerView:h	Z
    //   81: aload_0
    //   82: iconst_0
    //   83: putfield 176	android/support/v7/widget/RecyclerView:J	I
    //   86: aload_0
    //   87: new 178	xe
    //   90: dup
    //   91: invokespecial 179	xe:<init>	()V
    //   94: putfield 181	android/support/v7/widget/RecyclerView:m	Lzc;
    //   97: aload_0
    //   98: iconst_0
    //   99: putfield 183	android/support/v7/widget/RecyclerView:K	I
    //   102: aload_0
    //   103: iconst_m1
    //   104: putfield 185	android/support/v7/widget/RecyclerView:L	I
    //   107: aload_0
    //   108: ldc -70
    //   110: putfield 188	android/support/v7/widget/RecyclerView:U	F
    //   113: aload_0
    //   114: new 190	zq
    //   117: dup
    //   118: aload_0
    //   119: invokespecial 191	zq:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   122: putfield 193	android/support/v7/widget/RecyclerView:V	Lzq;
    //   125: aload_0
    //   126: new 195	zp
    //   129: dup
    //   130: invokespecial 196	zp:<init>	()V
    //   133: putfield 198	android/support/v7/widget/RecyclerView:n	Lzp;
    //   136: aload_0
    //   137: iconst_0
    //   138: putfield 200	android/support/v7/widget/RecyclerView:q	Z
    //   141: aload_0
    //   142: iconst_0
    //   143: putfield 202	android/support/v7/widget/RecyclerView:r	Z
    //   146: aload_0
    //   147: new 204	ze
    //   150: dup
    //   151: aload_0
    //   152: invokespecial 205	ze:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   155: putfield 207	android/support/v7/widget/RecyclerView:W	Lzd;
    //   158: aload_0
    //   159: iconst_0
    //   160: putfield 209	android/support/v7/widget/RecyclerView:aa	Z
    //   163: aload_0
    //   164: iconst_2
    //   165: newarray <illegal type>
    //   167: putfield 211	android/support/v7/widget/RecyclerView:ac	[I
    //   170: aload_0
    //   171: iconst_2
    //   172: newarray <illegal type>
    //   174: putfield 213	android/support/v7/widget/RecyclerView:ae	[I
    //   177: aload_0
    //   178: iconst_2
    //   179: newarray <illegal type>
    //   181: putfield 215	android/support/v7/widget/RecyclerView:af	[I
    //   184: aload_0
    //   185: iconst_2
    //   186: newarray <illegal type>
    //   188: putfield 217	android/support/v7/widget/RecyclerView:ag	[I
    //   191: aload_0
    //   192: new 219	yv
    //   195: dup
    //   196: aload_0
    //   197: invokespecial 220	yv:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   200: putfield 222	android/support/v7/widget/RecyclerView:ah	Ljava/lang/Runnable;
    //   203: aload_0
    //   204: iconst_1
    //   205: invokevirtual 226	android/support/v7/widget/RecyclerView:setFocusableInTouchMode	(Z)V
    //   208: getstatic 99	android/os/Build$VERSION:SDK_INT	I
    //   211: bipush 16
    //   213: if_icmplt +358 -> 571
    //   216: iconst_1
    //   217: istore 8
    //   219: aload_0
    //   220: iload 8
    //   222: putfield 228	android/support/v7/widget/RecyclerView:H	Z
    //   225: aload_1
    //   226: invokestatic 234	android/view/ViewConfiguration:get	(Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   229: astore 4
    //   231: aload_0
    //   232: aload 4
    //   234: invokevirtual 238	android/view/ViewConfiguration:getScaledTouchSlop	()I
    //   237: putfield 240	android/support/v7/widget/RecyclerView:R	I
    //   240: aload_0
    //   241: aload 4
    //   243: invokevirtual 243	android/view/ViewConfiguration:getScaledMinimumFlingVelocity	()I
    //   246: putfield 245	android/support/v7/widget/RecyclerView:S	I
    //   249: aload_0
    //   250: aload 4
    //   252: invokevirtual 248	android/view/ViewConfiguration:getScaledMaximumFlingVelocity	()I
    //   255: putfield 250	android/support/v7/widget/RecyclerView:T	I
    //   258: aload_0
    //   259: invokestatic 255	gt:a	(Landroid/view/View;)I
    //   262: iconst_2
    //   263: if_icmpne +314 -> 577
    //   266: iconst_1
    //   267: istore 8
    //   269: aload_0
    //   270: iload 8
    //   272: invokevirtual 258	android/support/v7/widget/RecyclerView:setWillNotDraw	(Z)V
    //   275: aload_0
    //   276: getfield 181	android/support/v7/widget/RecyclerView:m	Lzc;
    //   279: aload_0
    //   280: getfield 207	android/support/v7/widget/RecyclerView:W	Lzd;
    //   283: putfield 262	zc:h	Lzd;
    //   286: aload_0
    //   287: new 264	wh
    //   290: dup
    //   291: new 266	yy
    //   294: dup
    //   295: aload_0
    //   296: invokespecial 267	yy:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   299: invokespecial 270	wh:<init>	(Lwi;)V
    //   302: putfield 272	android/support/v7/widget/RecyclerView:b	Lwh;
    //   305: aload_0
    //   306: new 274	xb
    //   309: dup
    //   310: new 276	yx
    //   313: dup
    //   314: aload_0
    //   315: invokespecial 277	yx:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   318: invokespecial 280	xb:<init>	(Lxd;)V
    //   321: putfield 282	android/support/v7/widget/RecyclerView:c	Lxb;
    //   324: aload_0
    //   325: invokestatic 284	gt:e	(Landroid/view/View;)I
    //   328: ifne +8 -> 336
    //   331: aload_0
    //   332: iconst_1
    //   333: invokestatic 287	gt:c	(Landroid/view/View;I)V
    //   336: aload_0
    //   337: aload_0
    //   338: invokevirtual 291	android/support/v7/widget/RecyclerView:getContext	()Landroid/content/Context;
    //   341: ldc_w 293
    //   344: invokevirtual 297	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   347: checkcast 299	android/view/accessibility/AccessibilityManager
    //   350: putfield 301	android/support/v7/widget/RecyclerView:I	Landroid/view/accessibility/AccessibilityManager;
    //   353: aload_0
    //   354: new 303	zs
    //   357: dup
    //   358: aload_0
    //   359: invokespecial 304	zs:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   362: putfield 306	android/support/v7/widget/RecyclerView:ab	Lzs;
    //   365: aload_0
    //   366: aload_0
    //   367: getfield 306	android/support/v7/widget/RecyclerView:ab	Lzs;
    //   370: invokestatic 309	gt:a	(Landroid/view/View;Ler;)V
    //   373: aload_2
    //   374: ifnull +179 -> 553
    //   377: aload_1
    //   378: aload_2
    //   379: getstatic 313	vq:a	[I
    //   382: iload_3
    //   383: iconst_0
    //   384: invokevirtual 317	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   387: astore 5
    //   389: aload 5
    //   391: getstatic 319	vq:b	I
    //   394: invokevirtual 325	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   397: astore 4
    //   399: aload 5
    //   401: invokevirtual 328	android/content/res/TypedArray:recycle	()V
    //   404: aload 4
    //   406: ifnull +147 -> 553
    //   409: aload 4
    //   411: invokevirtual 334	java/lang/String:trim	()Ljava/lang/String;
    //   414: astore 4
    //   416: aload 4
    //   418: invokevirtual 337	java/lang/String:length	()I
    //   421: ifeq +132 -> 553
    //   424: aload 4
    //   426: iconst_0
    //   427: invokevirtual 341	java/lang/String:charAt	(I)C
    //   430: bipush 46
    //   432: if_icmpne +151 -> 583
    //   435: new 343	java/lang/StringBuilder
    //   438: dup
    //   439: invokespecial 344	java/lang/StringBuilder:<init>	()V
    //   442: aload_1
    //   443: invokevirtual 347	android/content/Context:getPackageName	()Ljava/lang/String;
    //   446: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: aload 4
    //   451: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   457: astore 4
    //   459: aload_0
    //   460: invokevirtual 358	android/support/v7/widget/RecyclerView:isInEditMode	()Z
    //   463: ifeq +170 -> 633
    //   466: aload_0
    //   467: invokevirtual 364	java/lang/Object:getClass	()Ljava/lang/Class;
    //   470: invokevirtual 368	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   473: astore 5
    //   475: aload 5
    //   477: aload 4
    //   479: invokevirtual 374	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   482: ldc_w 376
    //   485: invokevirtual 380	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   488: astore 7
    //   490: aload 7
    //   492: getstatic 115	android/support/v7/widget/RecyclerView:t	[Ljava/lang/Class;
    //   495: invokevirtual 384	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   498: astore 6
    //   500: iconst_4
    //   501: anewarray 360	java/lang/Object
    //   504: astore 5
    //   506: aload 5
    //   508: iconst_0
    //   509: aload_1
    //   510: aastore
    //   511: aload 5
    //   513: iconst_1
    //   514: aload_2
    //   515: aastore
    //   516: aload 5
    //   518: iconst_2
    //   519: iload_3
    //   520: invokestatic 388	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   523: aastore
    //   524: aload 5
    //   526: iconst_3
    //   527: iconst_0
    //   528: invokestatic 388	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   531: aastore
    //   532: aload 6
    //   534: astore_1
    //   535: aload_1
    //   536: iconst_1
    //   537: invokevirtual 393	java/lang/reflect/Constructor:setAccessible	(Z)V
    //   540: aload_0
    //   541: aload_1
    //   542: aload 5
    //   544: invokevirtual 397	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   547: checkcast 376	zh
    //   550: invokevirtual 400	android/support/v7/widget/RecyclerView:a	(Lzh;)V
    //   553: aload_0
    //   554: new 402	gj
    //   557: dup
    //   558: aload_0
    //   559: invokespecial 405	gj:<init>	(Landroid/view/View;)V
    //   562: putfield 407	android/support/v7/widget/RecyclerView:ad	Lgj;
    //   565: aload_0
    //   566: iconst_1
    //   567: invokevirtual 410	android/support/v7/widget/RecyclerView:setNestedScrollingEnabled	(Z)V
    //   570: return
    //   571: iconst_0
    //   572: istore 8
    //   574: goto -355 -> 219
    //   577: iconst_0
    //   578: istore 8
    //   580: goto -311 -> 269
    //   583: aload 4
    //   585: ldc_w 412
    //   588: invokevirtual 416	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   591: ifeq +6 -> 597
    //   594: goto -135 -> 459
    //   597: new 343	java/lang/StringBuilder
    //   600: dup
    //   601: invokespecial 344	java/lang/StringBuilder:<init>	()V
    //   604: ldc 2
    //   606: invokevirtual 420	java/lang/Class:getPackage	()Ljava/lang/Package;
    //   609: invokevirtual 425	java/lang/Package:getName	()Ljava/lang/String;
    //   612: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   615: bipush 46
    //   617: invokevirtual 428	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   620: aload 4
    //   622: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   625: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   628: astore 4
    //   630: goto -171 -> 459
    //   633: aload_1
    //   634: invokevirtual 429	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   637: astore 5
    //   639: goto -164 -> 475
    //   642: astore 5
    //   644: aload 7
    //   646: iconst_0
    //   647: anewarray 103	java/lang/Class
    //   650: invokevirtual 384	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   653: astore_1
    //   654: aconst_null
    //   655: astore 5
    //   657: goto -122 -> 535
    //   660: astore_1
    //   661: aload_1
    //   662: aload 5
    //   664: invokevirtual 433	java/lang/NoSuchMethodException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   667: pop
    //   668: new 435	java/lang/IllegalStateException
    //   671: astore 6
    //   673: new 343	java/lang/StringBuilder
    //   676: astore 5
    //   678: aload 5
    //   680: invokespecial 344	java/lang/StringBuilder:<init>	()V
    //   683: aload 6
    //   685: aload 5
    //   687: aload_2
    //   688: invokeinterface 438 1 0
    //   693: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   696: ldc_w 440
    //   699: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   702: aload 4
    //   704: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   707: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   710: aload_1
    //   711: invokespecial 443	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   714: aload 6
    //   716: athrow
    //   717: astore_1
    //   718: new 435	java/lang/IllegalStateException
    //   721: dup
    //   722: new 343	java/lang/StringBuilder
    //   725: dup
    //   726: invokespecial 344	java/lang/StringBuilder:<init>	()V
    //   729: aload_2
    //   730: invokeinterface 438 1 0
    //   735: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   738: ldc_w 445
    //   741: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   744: aload 4
    //   746: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   749: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   752: aload_1
    //   753: invokespecial 443	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   756: athrow
    //   757: astore_1
    //   758: new 435	java/lang/IllegalStateException
    //   761: dup
    //   762: new 343	java/lang/StringBuilder
    //   765: dup
    //   766: invokespecial 344	java/lang/StringBuilder:<init>	()V
    //   769: aload_2
    //   770: invokeinterface 438 1 0
    //   775: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   778: ldc_w 447
    //   781: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   784: aload 4
    //   786: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   789: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   792: aload_1
    //   793: invokespecial 443	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   796: athrow
    //   797: astore_1
    //   798: new 435	java/lang/IllegalStateException
    //   801: dup
    //   802: new 343	java/lang/StringBuilder
    //   805: dup
    //   806: invokespecial 344	java/lang/StringBuilder:<init>	()V
    //   809: aload_2
    //   810: invokeinterface 438 1 0
    //   815: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   818: ldc_w 447
    //   821: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   824: aload 4
    //   826: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   829: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   832: aload_1
    //   833: invokespecial 443	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   836: athrow
    //   837: astore_1
    //   838: new 435	java/lang/IllegalStateException
    //   841: dup
    //   842: new 343	java/lang/StringBuilder
    //   845: dup
    //   846: invokespecial 344	java/lang/StringBuilder:<init>	()V
    //   849: aload_2
    //   850: invokeinterface 438 1 0
    //   855: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   858: ldc_w 449
    //   861: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   864: aload 4
    //   866: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   869: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   872: aload_1
    //   873: invokespecial 443	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   876: athrow
    //   877: astore_1
    //   878: new 435	java/lang/IllegalStateException
    //   881: dup
    //   882: new 343	java/lang/StringBuilder
    //   885: dup
    //   886: invokespecial 344	java/lang/StringBuilder:<init>	()V
    //   889: aload_2
    //   890: invokeinterface 438 1 0
    //   895: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   898: ldc_w 451
    //   901: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   904: aload 4
    //   906: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   909: invokevirtual 354	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   912: aload_1
    //   913: invokespecial 443	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   916: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	917	0	this	RecyclerView
    //   0	917	1	paramContext	Context
    //   0	917	2	paramAttributeSet	AttributeSet
    //   0	917	3	paramInt	int
    //   229	676	4	localObject1	Object
    //   387	251	5	localObject2	Object
    //   642	1	5	localNoSuchMethodException	NoSuchMethodException
    //   655	31	5	localObject3	Object
    //   498	217	6	localObject4	Object
    //   488	157	7	localClass	Class
    //   217	362	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   490	506	642	java/lang/NoSuchMethodException
    //   516	532	642	java/lang/NoSuchMethodException
    //   644	654	660	java/lang/NoSuchMethodException
    //   459	475	717	java/lang/ClassNotFoundException
    //   475	490	717	java/lang/ClassNotFoundException
    //   490	506	717	java/lang/ClassNotFoundException
    //   516	532	717	java/lang/ClassNotFoundException
    //   535	553	717	java/lang/ClassNotFoundException
    //   633	639	717	java/lang/ClassNotFoundException
    //   644	654	717	java/lang/ClassNotFoundException
    //   661	717	717	java/lang/ClassNotFoundException
    //   459	475	757	java/lang/reflect/InvocationTargetException
    //   475	490	757	java/lang/reflect/InvocationTargetException
    //   490	506	757	java/lang/reflect/InvocationTargetException
    //   516	532	757	java/lang/reflect/InvocationTargetException
    //   535	553	757	java/lang/reflect/InvocationTargetException
    //   633	639	757	java/lang/reflect/InvocationTargetException
    //   644	654	757	java/lang/reflect/InvocationTargetException
    //   661	717	757	java/lang/reflect/InvocationTargetException
    //   459	475	797	java/lang/InstantiationException
    //   475	490	797	java/lang/InstantiationException
    //   490	506	797	java/lang/InstantiationException
    //   516	532	797	java/lang/InstantiationException
    //   535	553	797	java/lang/InstantiationException
    //   633	639	797	java/lang/InstantiationException
    //   644	654	797	java/lang/InstantiationException
    //   661	717	797	java/lang/InstantiationException
    //   459	475	837	java/lang/IllegalAccessException
    //   475	490	837	java/lang/IllegalAccessException
    //   490	506	837	java/lang/IllegalAccessException
    //   516	532	837	java/lang/IllegalAccessException
    //   535	553	837	java/lang/IllegalAccessException
    //   633	639	837	java/lang/IllegalAccessException
    //   644	654	837	java/lang/IllegalAccessException
    //   661	717	837	java/lang/IllegalAccessException
    //   459	475	877	java/lang/ClassCastException
    //   475	490	877	java/lang/ClassCastException
    //   490	506	877	java/lang/ClassCastException
    //   516	532	877	java/lang/ClassCastException
    //   535	553	877	java/lang/ClassCastException
    //   633	639	877	java/lang/ClassCastException
    //   644	654	877	java/lang/ClassCastException
    //   661	717	877	java/lang/ClassCastException
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = gd.b(paramMotionEvent);
    if (gd.b(paramMotionEvent, i1) == this.L) {
      if (i1 != 0) {
        break label75;
      }
    }
    label75:
    for (i1 = 1;; i1 = 0)
    {
      this.L = gd.b(paramMotionEvent, i1);
      int i2 = (int)(gd.c(paramMotionEvent, i1) + 0.5F);
      this.P = i2;
      this.N = i2;
      i1 = (int)(gd.d(paramMotionEvent, i1) + 0.5F);
      this.Q = i1;
      this.O = i1;
      return;
    }
  }
  
  private void a(ed paramed)
  {
    List localList = this.n.e;
    int i1 = localList.size() - 1;
    if (i1 >= 0)
    {
      View localView = (View)localList.get(i1);
      Object localObject2 = b(localView);
      Object localObject1 = (zg)this.n.b.remove(localObject2);
      if (!this.n.j) {
        this.n.c.remove(localObject2);
      }
      if (paramed.remove(localView) != null)
      {
        localObject2 = this.e;
        localObject1 = this.a;
        localObject2 = ((zh)localObject2).d;
        int i2 = ((xb)localObject2).a.a(localView);
        if (i2 >= 0)
        {
          if (((xb)localObject2).b.c(i2)) {
            ((xb)localObject2).c.remove(localView);
          }
          ((xb)localObject2).a.a(i2);
        }
        ((zl)localObject1).a(localView);
      }
      for (;;)
      {
        i1--;
        break;
        if (localObject1 != null) {
          a((zg)localObject1);
        } else {
          a(new zg((zr)localObject2, localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom()));
        }
      }
    }
    localList.clear();
  }
  
  private void a(zg paramzg)
  {
    View localView = paramzg.a.a;
    a(paramzg.a);
    int i2 = paramzg.b;
    int i1 = paramzg.c;
    int i3 = localView.getLeft();
    int i4 = localView.getTop();
    if ((!paramzg.a.n()) && ((i2 != i3) || (i1 != i4)))
    {
      paramzg.a.a(false);
      localView.layout(i3, i4, localView.getWidth() + i3, localView.getHeight() + i4);
      if (this.m.a(paramzg.a, i2, i1, i3, i4)) {
        s();
      }
    }
    for (;;)
    {
      return;
      paramzg.a.a(false);
      this.m.a(paramzg.a);
      s();
    }
  }
  
  private void a(zr paramzr)
  {
    View localView = paramzr.a;
    int i1;
    if (localView.getParent() == this)
    {
      i1 = 1;
      this.a.b(a(localView));
      if (!paramzr.o()) {
        break label54;
      }
      this.c.a(localView, -1, localView.getLayoutParams(), true);
    }
    for (;;)
    {
      return;
      i1 = 0;
      break;
      label54:
      if (i1 == 0)
      {
        this.c.a(localView, -1, true);
      }
      else
      {
        paramzr = this.c;
        i1 = paramzr.a.a(localView);
        if (i1 < 0) {
          throw new IllegalArgumentException("view is not a child, cannot hide " + localView);
        }
        paramzr.b.a(i1);
        paramzr.c.add(localView);
      }
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    int i2 = 0;
    int i8 = 0;
    int i4 = 0;
    int i6 = 0;
    int i5 = 0;
    int i1 = 0;
    int i3 = 0;
    int i7 = 0;
    k();
    if (this.d != null)
    {
      a();
      q();
      a.a("RV Scroll");
      i2 = i8;
      if (paramInt1 != 0)
      {
        i1 = this.e.a(paramInt1, this.a, this.n);
        i2 = paramInt1 - i1;
      }
      i3 = i7;
      i4 = i6;
      if (paramInt2 != 0)
      {
        i3 = this.e.b(paramInt2, this.a, this.n);
        i4 = paramInt2 - i3;
      }
      a.b();
      if (g())
      {
        i6 = this.c.a();
        i5 = 0;
        if (i5 < i6)
        {
          View localView = this.c.b(i5);
          Object localObject = a(localView);
          if ((localObject != null) && (((zr)localObject).h != null))
          {
            localObject = ((zr)localObject).h;
            if (localObject == null) {
              break label267;
            }
          }
          label267:
          for (localObject = ((zr)localObject).a;; localObject = null)
          {
            if (localObject != null)
            {
              i8 = localView.getLeft();
              i7 = localView.getTop();
              if ((i8 != ((View)localObject).getLeft()) || (i7 != ((View)localObject).getTop())) {
                ((View)localObject).layout(i8, i7, ((View)localObject).getWidth() + i8, ((View)localObject).getHeight() + i7);
              }
            }
            i5++;
            break;
          }
        }
      }
      r();
      a(false);
      i5 = i1;
    }
    if (!this.z.isEmpty()) {
      invalidate();
    }
    if (dispatchNestedScroll(i5, i3, i2, i4, this.ae))
    {
      this.P -= this.ae[0];
      this.Q -= this.ae[1];
      if (paramMotionEvent != null) {
        paramMotionEvent.offsetLocation(this.ae[0], this.ae[1]);
      }
      paramMotionEvent = this.ag;
      paramMotionEvent[0] += this.ae[0];
      paramMotionEvent = this.ag;
      paramMotionEvent[1] += this.ae[1];
      if ((i5 != 0) || (i3 != 0)) {
        c(i5, i3);
      }
      if (!awakenScrollBars()) {
        invalidate();
      }
      if ((i5 == 0) && (i3 == 0)) {
        break label717;
      }
    }
    label536:
    label613:
    label664:
    label717:
    for (boolean bool = true;; bool = false)
    {
      return bool;
      if (gt.a(this) == 2) {
        break;
      }
      float f2;
      float f4;
      float f1;
      float f3;
      if (paramMotionEvent != null)
      {
        f2 = paramMotionEvent.getX();
        f4 = i2;
        f1 = paramMotionEvent.getY();
        f3 = i4;
        i2 = 0;
        if (f4 >= 0.0F) {
          break label613;
        }
        b();
        i1 = i2;
        if (this.i.a(-f4 / getWidth(), 1.0F - f1 / getHeight())) {
          i1 = 1;
        }
        if (f3 >= 0.0F) {
          break label664;
        }
        d();
        i2 = i1;
        if (this.j.a(-f3 / getHeight(), f2 / getWidth())) {
          i2 = 1;
        }
      }
      for (;;)
      {
        if ((i2 != 0) || (f4 != 0.0F) || (f3 != 0.0F)) {
          gt.d(this);
        }
        d(paramInt1, paramInt2);
        break;
        i1 = i2;
        if (f4 <= 0.0F) {
          break label536;
        }
        c();
        i1 = i2;
        if (!this.k.a(f4 / getWidth(), f1 / getHeight())) {
          break label536;
        }
        i1 = 1;
        break label536;
        i2 = i1;
        if (f3 > 0.0F)
        {
          e();
          i2 = i1;
          if (this.l.a(f3 / getHeight(), 1.0F - f2 / getWidth())) {
            i2 = 1;
          }
        }
      }
    }
  }
  
  private long b(zr paramzr)
  {
    yz localyz = this.d;
    return paramzr.b;
  }
  
  public static zr b(View paramView)
  {
    if (paramView == null) {}
    for (paramView = null;; paramView = ((zi)paramView.getLayoutParams()).c) {
      return paramView;
    }
  }
  
  private void b(int paramInt)
  {
    if (paramInt == this.K) {}
    for (;;)
    {
      return;
      this.K = paramInt;
      if (paramInt != 2) {
        m();
      }
      if (this.o != null) {
        this.o.a(paramInt);
      }
      if (this.p != null) {
        for (int i1 = this.p.size() - 1; i1 >= 0; i1--) {
          ((zj)this.p.get(i1)).a(paramInt);
        }
      }
    }
  }
  
  private void d(int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.i != null)
    {
      bool1 = bool2;
      if (!this.i.a())
      {
        bool1 = bool2;
        if (paramInt1 > 0) {
          bool1 = this.i.c();
        }
      }
    }
    bool2 = bool1;
    if (this.k != null)
    {
      bool2 = bool1;
      if (!this.k.a())
      {
        bool2 = bool1;
        if (paramInt1 < 0) {
          bool2 = bool1 | this.k.c();
        }
      }
    }
    bool1 = bool2;
    if (this.j != null)
    {
      bool1 = bool2;
      if (!this.j.a())
      {
        bool1 = bool2;
        if (paramInt2 > 0) {
          bool1 = bool2 | this.j.c();
        }
      }
    }
    bool2 = bool1;
    if (this.l != null)
    {
      bool2 = bool1;
      if (!this.l.a())
      {
        bool2 = bool1;
        if (paramInt2 < 0) {
          bool2 = bool1 | this.l.c();
        }
      }
    }
    if (bool2) {
      gt.d(this);
    }
  }
  
  private void e(int paramInt1, int paramInt2)
  {
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i1 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    switch (i2)
    {
    default: 
      paramInt1 = gt.m(this);
    }
    switch (i1)
    {
    default: 
      paramInt2 = gt.n(this);
    }
    setMeasuredDimension(paramInt1, paramInt2);
  }
  
  private boolean f(int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    int i2 = this.c.a();
    boolean bool1;
    if (i2 == 0)
    {
      if (paramInt1 == 0)
      {
        bool1 = bool2;
        if (paramInt2 == 0) {}
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
    for (int i1 = 0;; i1++)
    {
      bool1 = bool2;
      if (i1 >= i2) {
        break;
      }
      zr localzr = b(this.c.b(i1));
      if (!localzr.b())
      {
        int i3 = localzr.d();
        if ((i3 < paramInt1) || (i3 > paramInt2))
        {
          bool1 = true;
          break;
        }
      }
    }
  }
  
  private void k()
  {
    this.x.run();
  }
  
  private void l()
  {
    b(0);
    m();
  }
  
  private void m()
  {
    Object localObject = this.V;
    ((zq)localObject).e.removeCallbacks((Runnable)localObject);
    ((zq)localObject).c.f();
    if (this.e != null) {
      localObject = this.e;
    }
  }
  
  private void n()
  {
    boolean bool1 = false;
    if (this.i != null) {
      bool1 = this.i.c();
    }
    boolean bool2 = bool1;
    if (this.j != null) {
      bool2 = bool1 | this.j.c();
    }
    bool1 = bool2;
    if (this.k != null) {
      bool1 = bool2 | this.k.c();
    }
    bool2 = bool1;
    if (this.l != null) {
      bool2 = bool1 | this.l.c();
    }
    if (bool2) {
      gt.d(this);
    }
  }
  
  private void o()
  {
    this.l = null;
    this.j = null;
    this.k = null;
    this.i = null;
  }
  
  private void p()
  {
    if (this.M != null) {
      this.M.clear();
    }
    stopNestedScroll();
    n();
    b(0);
  }
  
  private void q()
  {
    this.J += 1;
  }
  
  private void r()
  {
    this.J -= 1;
    if (this.J <= 0)
    {
      this.J = 0;
      int i1 = this.F;
      this.F = 0;
      if ((i1 != 0) && (this.I != null) && (this.I.isEnabled()))
      {
        AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
        localAccessibilityEvent.setEventType(2048);
        iz.a(localAccessibilityEvent, i1);
        sendAccessibilityEventUnchecked(localAccessibilityEvent);
      }
    }
  }
  
  private void s()
  {
    if ((!this.aa) && (this.C))
    {
      gt.a(this, this.ah);
      this.aa = true;
    }
  }
  
  private void t()
  {
    boolean bool2 = true;
    if (this.h)
    {
      this.b.a();
      w();
      this.e.b();
    }
    int i1;
    label89:
    zp localzp;
    if ((this.m != null) && (this.e.g()))
    {
      this.b.b();
      if (((!this.q) || (this.r)) && (!this.q) && ((!this.r) || (!g()))) {
        break label220;
      }
      i1 = 1;
      localzp = this.n;
      if ((this.g) && (this.m != null) && ((this.h) || (i1 != 0) || (zh.a(this.e))))
      {
        if (!this.h) {
          break label225;
        }
        yz localyz = this.d;
      }
      bool1 = false;
      label144:
      localzp.k = bool1;
      localzp = this.n;
      if ((!this.n.k) || (i1 == 0) || (this.h)) {
        break label236;
      }
      if ((this.m == null) || (!this.e.g())) {
        break label231;
      }
      i1 = 1;
      label195:
      if (i1 == 0) {
        break label236;
      }
    }
    label220:
    label225:
    label231:
    label236:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localzp.l = bool1;
      return;
      this.b.e();
      break;
      i1 = 0;
      break label89;
      bool1 = true;
      break label144;
      i1 = 0;
      break label195;
    }
  }
  
  private void u()
  {
    int i2 = 0;
    int i3 = this.c.b();
    for (int i1 = 0; i1 < i3; i1++) {
      ((zi)this.c.c(i1).getLayoutParams()).e = true;
    }
    zl localzl = this.a;
    i3 = localzl.c.size();
    for (i1 = i2; i1 < i3; i1++)
    {
      zi localzi = (zi)((zr)localzl.c.get(i1)).a.getLayoutParams();
      if (localzi != null) {
        localzi.e = true;
      }
    }
  }
  
  private void v()
  {
    int i2 = 0;
    int i3 = this.c.b();
    for (int i1 = 0; i1 < i3; i1++)
    {
      localObject = b(this.c.c(i1));
      if (!((zr)localObject).b()) {
        ((zr)localObject).a();
      }
    }
    Object localObject = this.a;
    i3 = ((zl)localObject).c.size();
    for (i1 = 0; i1 < i3; i1++) {
      ((zr)((zl)localObject).c.get(i1)).a();
    }
    i3 = ((zl)localObject).a.size();
    for (i1 = 0; i1 < i3; i1++) {
      ((zr)((zl)localObject).a.get(i1)).a();
    }
    if (((zl)localObject).b != null)
    {
      i3 = ((zl)localObject).b.size();
      for (i1 = i2; i1 < i3; i1++) {
        ((zr)((zl)localObject).b.get(i1)).a();
      }
    }
  }
  
  private void w()
  {
    int i2 = this.c.b();
    for (int i1 = 0; i1 < i2; i1++)
    {
      localObject = b(this.c.c(i1));
      if ((localObject != null) && (!((zr)localObject).b())) {
        ((zr)localObject).a(6);
      }
    }
    u();
    Object localObject = this.a;
    if (((zl)localObject).e.d != null) {
      yz localyz = ((zl)localObject).e.d;
    }
    ((zl)localObject).b();
  }
  
  public final zr a(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent != null) && (localViewParent != this)) {
      throw new IllegalArgumentException("View " + paramView + " is not a direct child of " + this);
    }
    return b(paramView);
  }
  
  public final void a()
  {
    if (!this.D)
    {
      this.D = true;
      this.E = false;
    }
  }
  
  public final void a(int paramInt)
  {
    l();
    if (this.e == null) {
      Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
    }
    for (;;)
    {
      return;
      this.e.c(paramInt);
      awakenScrollBars();
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (this.e == null)
    {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    if (!this.e.i()) {
      paramInt1 = 0;
    }
    for (;;)
    {
      if (!this.e.j()) {
        paramInt2 = 0;
      }
      for (;;)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          break label330;
        }
        zq localzq = this.V;
        int i4 = Math.abs(paramInt1);
        int i3 = Math.abs(paramInt2);
        label78:
        int i5;
        int i6;
        if (i4 > i3)
        {
          i2 = 1;
          i5 = (int)Math.sqrt(0);
          i6 = (int)Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
          if (i2 == 0) {
            break label281;
          }
        }
        label281:
        for (int i1 = localzq.e.getWidth();; i1 = localzq.e.getHeight())
        {
          int i7 = i1 / 2;
          float f3 = Math.min(1.0F, i6 * 1.0F / i1);
          float f2 = i7;
          float f1 = i7;
          f3 = zq.a(f3);
          if (i5 <= 0) {
            break label294;
          }
          i1 = Math.round(1000.0F * Math.abs((f3 * f1 + f2) / i5)) * 4;
          i1 = Math.min(i1, 2000);
          Interpolator localInterpolator = ai;
          if (localzq.d != localInterpolator)
          {
            localzq.d = localInterpolator;
            localzq.c = lr.a(localzq.e.getContext(), localInterpolator);
          }
          localzq.e.b(2);
          localzq.b = 0;
          localzq.a = 0;
          localzq.c.a(0, 0, paramInt1, paramInt2, i1);
          localzq.a();
          break;
          i2 = 0;
          break label78;
        }
        label294:
        if (i2 != 0) {}
        for (int i2 = i4;; i2 = i3)
        {
          i1 = (int)((i2 / i1 + 1.0F) * 300.0F);
          break;
        }
      }
      label330:
      break;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i2 = this.c.b();
    int i1 = 0;
    if (i1 < i2)
    {
      localObject = b(this.c.c(i1));
      if ((localObject != null) && (!((zr)localObject).b()))
      {
        if (((zr)localObject).b < paramInt1 + paramInt2) {
          break label79;
        }
        ((zr)localObject).a(-paramInt2, paramBoolean);
        this.n.i = true;
      }
      for (;;)
      {
        i1++;
        break;
        label79:
        if (((zr)localObject).b >= paramInt1)
        {
          int i3 = -paramInt2;
          ((zr)localObject).a(8);
          ((zr)localObject).a(i3, paramBoolean);
          ((zr)localObject).b = (paramInt1 - 1);
          this.n.i = true;
        }
      }
    }
    Object localObject = this.a;
    i1 = ((zl)localObject).c.size() - 1;
    if (i1 >= 0)
    {
      zr localzr = (zr)((zl)localObject).c.get(i1);
      if (localzr != null)
      {
        if (localzr.d() < paramInt1 + paramInt2) {
          break label194;
        }
        localzr.a(-paramInt2, paramBoolean);
      }
      for (;;)
      {
        i1--;
        break;
        label194:
        if (localzr.d() >= paramInt1)
        {
          localzr.a(8);
          ((zl)localObject).b(i1);
        }
      }
    }
    requestLayout();
  }
  
  public final void a(String paramString)
  {
    if (f())
    {
      if (paramString == null) {
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
      }
      throw new IllegalStateException(paramString);
    }
  }
  
  public final void a(yz paramyz)
  {
    if (this.d != null)
    {
      localObject2 = this.d;
      localObject1 = this.u;
      ((yz)localObject2).a.unregisterObserver(localObject1);
    }
    if (this.m != null) {
      this.m.d();
    }
    if (this.e != null)
    {
      localObject2 = this.e;
      localObject1 = this.a;
      for (int i1 = ((zh)localObject2).n() - 1; i1 >= 0; i1--) {
        if (!b(((zh)localObject2).f(i1)).b()) {
          ((zh)localObject2).a(i1, (zl)localObject1);
        }
      }
      this.e.a(this.a);
    }
    this.a.a();
    this.b.a();
    Object localObject1 = this.d;
    this.d = paramyz;
    if (paramyz != null)
    {
      localObject2 = this.u;
      paramyz.a.registerObserver(localObject2);
    }
    Object localObject2 = this.a;
    paramyz = this.d;
    ((zl)localObject2).a();
    localObject2 = ((zl)localObject2).c();
    if (localObject1 != null) {
      ((zk)localObject2).c -= 1;
    }
    if (((zk)localObject2).c == 0) {
      ((zk)localObject2).a.clear();
    }
    if (paramyz != null) {
      ((zk)localObject2).c += 1;
    }
    this.n.i = true;
    w();
    requestLayout();
  }
  
  public final void a(zc paramzc)
  {
    if (this.m != null)
    {
      this.m.d();
      this.m.h = null;
    }
    this.m = paramzc;
    if (this.m != null) {
      this.m.h = this.W;
    }
  }
  
  public final void a(zf paramzf)
  {
    if (this.e != null) {
      this.e.a("Cannot add item decoration during a scroll  or layout");
    }
    if (this.z.isEmpty()) {
      setWillNotDraw(false);
    }
    this.z.add(paramzf);
    u();
    requestLayout();
  }
  
  public final void a(zh paramzh)
  {
    if (paramzh == this.e) {}
    for (;;)
    {
      return;
      if (this.e != null)
      {
        if (this.C) {
          this.e.a(this, this.a);
        }
        this.e.a(null);
      }
      this.a.a();
      xb localxb = this.c;
      localxb.b.a();
      localxb.c.clear();
      localxb.a.b();
      this.e = paramzh;
      if (paramzh != null)
      {
        if (paramzh.e != null) {
          throw new IllegalArgumentException("LayoutManager " + paramzh + " is already attached to a RecyclerView: " + paramzh.e);
        }
        this.e.a(this);
      }
      requestLayout();
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.D)
    {
      if ((paramBoolean) && (this.E) && (this.e != null) && (this.d != null)) {
        h();
      }
      this.D = false;
      this.E = false;
    }
  }
  
  public void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    super.addFocusables(paramArrayList, paramInt1, paramInt2);
  }
  
  public final void b()
  {
    if (this.i != null) {}
    for (;;)
    {
      return;
      this.i = new lc(getContext());
      if (this.w) {
        this.i.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      } else {
        this.i.a(getMeasuredHeight(), getMeasuredWidth());
      }
    }
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    boolean bool3 = false;
    boolean bool1;
    if (this.e == null)
    {
      Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      bool1 = bool3;
    }
    boolean bool4;
    int i1;
    do
    {
      do
      {
        return bool1;
        bool4 = this.e.i();
        bool2 = this.e.j();
        if (bool4)
        {
          i1 = paramInt1;
          if (Math.abs(paramInt1) >= this.S) {}
        }
        else
        {
          i1 = 0;
        }
        if (bool2)
        {
          paramInt1 = paramInt2;
          if (Math.abs(paramInt2) >= this.S) {}
        }
        else
        {
          paramInt1 = 0;
        }
        if (i1 != 0) {
          break;
        }
        bool1 = bool3;
      } while (paramInt1 == 0);
      bool1 = bool3;
    } while (dispatchNestedPreFling(i1, paramInt1));
    if ((bool4) || (bool2)) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      dispatchNestedFling(i1, paramInt1, bool2);
      bool1 = bool3;
      if (!bool2) {
        break;
      }
      paramInt2 = Math.max(-this.T, Math.min(i1, this.T));
      paramInt1 = Math.max(-this.T, Math.min(paramInt1, this.T));
      zq localzq = this.V;
      localzq.e.b(2);
      localzq.b = 0;
      localzq.a = 0;
      localzq.c.a(0, 0, paramInt2, paramInt1, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
      localzq.a();
      bool1 = true;
      break;
    }
  }
  
  public final Rect c(View paramView)
  {
    zi localzi = (zi)paramView.getLayoutParams();
    if (!localzi.e) {}
    Rect localRect;
    for (paramView = localzi.d;; paramView = localRect)
    {
      return paramView;
      localRect = localzi.d;
      localRect.set(0, 0, 0, 0);
      int i2 = this.z.size();
      for (int i1 = 0; i1 < i2; i1++)
      {
        this.y.set(0, 0, 0, 0);
        ((zf)this.z.get(i1)).a(this.y, paramView, this);
        localRect.left += this.y.left;
        localRect.top += this.y.top;
        localRect.right += this.y.right;
        localRect.bottom += this.y.bottom;
      }
      localzi.e = false;
    }
  }
  
  public final void c()
  {
    if (this.k != null) {}
    for (;;)
    {
      return;
      this.k = new lc(getContext());
      if (this.w) {
        this.k.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      } else {
        this.k.a(getMeasuredHeight(), getMeasuredWidth());
      }
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    int i2 = getScrollX();
    int i1 = getScrollY();
    onScrollChanged(i2, i1, i2, i1);
    if (this.o != null) {
      this.o.a(this, paramInt1, paramInt2);
    }
    if (this.p != null) {
      for (i1 = this.p.size() - 1; i1 >= 0; i1--) {
        ((zj)this.p.get(i1)).a(this, paramInt1, paramInt2);
      }
    }
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (((paramLayoutParams instanceof zi)) && (this.e.a((zi)paramLayoutParams))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int computeHorizontalScrollExtent()
  {
    if (this.e.i()) {}
    for (int i1 = this.e.c(this.n);; i1 = 0) {
      return i1;
    }
  }
  
  public int computeHorizontalScrollOffset()
  {
    if (this.e.i()) {}
    for (int i1 = this.e.a(this.n);; i1 = 0) {
      return i1;
    }
  }
  
  public int computeHorizontalScrollRange()
  {
    if (this.e.i()) {}
    for (int i1 = this.e.e(this.n);; i1 = 0) {
      return i1;
    }
  }
  
  public int computeVerticalScrollExtent()
  {
    if (this.e.j()) {}
    for (int i1 = this.e.d(this.n);; i1 = 0) {
      return i1;
    }
  }
  
  public int computeVerticalScrollOffset()
  {
    if (this.e.j()) {}
    for (int i1 = this.e.b(this.n);; i1 = 0) {
      return i1;
    }
  }
  
  public int computeVerticalScrollRange()
  {
    if (this.e.j()) {}
    for (int i1 = this.e.f(this.n);; i1 = 0) {
      return i1;
    }
  }
  
  public final void d()
  {
    if (this.j != null) {}
    for (;;)
    {
      return;
      this.j = new lc(getContext());
      if (this.w) {
        this.j.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      } else {
        this.j.a(getMeasuredWidth(), getMeasuredHeight());
      }
    }
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    gj localgj = this.ad;
    if ((localgj.c) && (localgj.b != null)) {}
    for (paramBoolean = ic.a(localgj.b, localgj.a, paramFloat1, paramFloat2, paramBoolean);; paramBoolean = false) {
      return paramBoolean;
    }
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    gj localgj = this.ad;
    if ((localgj.c) && (localgj.b != null)) {}
    for (boolean bool = ic.a(localgj.b, localgj.a, paramFloat1, paramFloat2);; bool = false) {
      return bool;
    }
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    boolean bool2 = true;
    boolean bool3 = false;
    gj localgj = this.ad;
    int i1;
    int i2;
    if ((localgj.c) && (localgj.b != null)) {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        if (paramArrayOfInt2 == null) {
          break label207;
        }
        localgj.a.getLocationInWindow(paramArrayOfInt2);
        i1 = paramArrayOfInt2[0];
        i2 = paramArrayOfInt2[1];
      }
    }
    for (;;)
    {
      int[] arrayOfInt = paramArrayOfInt1;
      if (paramArrayOfInt1 == null)
      {
        if (localgj.d == null) {
          localgj.d = new int[2];
        }
        arrayOfInt = localgj.d;
      }
      arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
      ic.a(localgj.b, localgj.a, paramInt1, paramInt2, arrayOfInt);
      if (paramArrayOfInt2 != null)
      {
        localgj.a.getLocationInWindow(paramArrayOfInt2);
        paramArrayOfInt2[0] -= i1;
        paramArrayOfInt2[1] -= i2;
      }
      boolean bool1 = bool2;
      if (arrayOfInt[0] == 0)
      {
        bool1 = bool3;
        if (arrayOfInt[1] == 0) {}
      }
      for (bool1 = bool2;; bool1 = false)
      {
        return bool1;
        if (paramArrayOfInt2 != null)
        {
          paramArrayOfInt2[0] = 0;
          paramArrayOfInt2[1] = 0;
        }
      }
      label207:
      i2 = 0;
      i1 = 0;
    }
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    gj localgj = this.ad;
    int i1;
    int i2;
    if ((localgj.c) && (localgj.b != null)) {
      if ((paramInt1 != 0) || (paramInt2 != 0) || (paramInt3 != 0) || (paramInt4 != 0))
      {
        if (paramArrayOfInt == null) {
          break label148;
        }
        localgj.a.getLocationInWindow(paramArrayOfInt);
        i1 = paramArrayOfInt[0];
        i2 = paramArrayOfInt[1];
      }
    }
    for (;;)
    {
      ic.a(localgj.b, localgj.a, paramInt1, paramInt2, paramInt3, paramInt4);
      if (paramArrayOfInt != null)
      {
        localgj.a.getLocationInWindow(paramArrayOfInt);
        paramArrayOfInt[0] -= i1;
        paramArrayOfInt[1] -= i2;
      }
      for (boolean bool = true;; bool = false)
      {
        return bool;
        if (paramArrayOfInt != null)
        {
          paramArrayOfInt[0] = 0;
          paramArrayOfInt[1] = 0;
        }
      }
      label148:
      i2 = 0;
      i1 = 0;
    }
  }
  
  protected void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i3 = 1;
    int i4 = 0;
    super.draw(paramCanvas);
    int i2 = this.z.size();
    for (int i1 = 0; i1 < i2; i1++) {
      this.z.get(i1);
    }
    int i5;
    if ((this.i != null) && (!this.i.a()))
    {
      i5 = paramCanvas.save();
      if (this.w)
      {
        i1 = getPaddingBottom();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(i1 + -getHeight(), 0.0F);
        if ((this.i == null) || (!this.i.a(paramCanvas))) {
          break label444;
        }
        i2 = 1;
        label116:
        paramCanvas.restoreToCount(i5);
      }
    }
    for (;;)
    {
      i1 = i2;
      if (this.j != null)
      {
        i1 = i2;
        if (!this.j.a())
        {
          i5 = paramCanvas.save();
          if (this.w) {
            paramCanvas.translate(getPaddingLeft(), getPaddingTop());
          }
          if ((this.j == null) || (!this.j.a(paramCanvas))) {
            break label449;
          }
          i1 = 1;
          label190:
          i1 = i2 | i1;
          paramCanvas.restoreToCount(i5);
        }
      }
      i2 = i1;
      if (this.k != null)
      {
        i2 = i1;
        if (!this.k.a())
        {
          i5 = paramCanvas.save();
          int i6 = getWidth();
          if (!this.w) {
            break label454;
          }
          i2 = getPaddingTop();
          label245:
          paramCanvas.rotate(90.0F);
          paramCanvas.translate(-i2, -i6);
          if ((this.k == null) || (!this.k.a(paramCanvas))) {
            break label459;
          }
          i2 = 1;
          label283:
          i2 = i1 | i2;
          paramCanvas.restoreToCount(i5);
        }
      }
      i1 = i2;
      if (this.l != null)
      {
        i1 = i2;
        if (!this.l.a())
        {
          i5 = paramCanvas.save();
          paramCanvas.rotate(180.0F);
          if (!this.w) {
            break label464;
          }
          paramCanvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
          label360:
          i1 = i4;
          if (this.l != null)
          {
            i1 = i4;
            if (this.l.a(paramCanvas)) {
              i1 = 1;
            }
          }
          i1 = i2 | i1;
          paramCanvas.restoreToCount(i5);
        }
      }
      if ((i1 == 0) && (this.m != null) && (this.z.size() > 0) && (this.m.b())) {
        i1 = i3;
      }
      for (;;)
      {
        if (i1 != 0) {
          gt.d(this);
        }
        return;
        i1 = 0;
        break;
        label444:
        i2 = 0;
        break label116;
        label449:
        i1 = 0;
        break label190;
        label454:
        i2 = 0;
        break label245;
        label459:
        i2 = 0;
        break label283;
        label464:
        paramCanvas.translate(-getWidth(), -getHeight());
        break label360;
      }
      i2 = 0;
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public final void e()
  {
    if (this.l != null) {}
    for (;;)
    {
      return;
      this.l = new lc(getContext());
      if (this.w) {
        this.l.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      } else {
        this.l.a(getMeasuredWidth(), getMeasuredHeight());
      }
    }
  }
  
  public final boolean f()
  {
    if (this.J > 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public View focusSearch(View paramView, int paramInt)
  {
    View localView2 = FocusFinder.getInstance().findNextFocus(this, paramView, paramInt);
    View localView1 = localView2;
    if (localView2 == null)
    {
      localView1 = localView2;
      if (this.d != null)
      {
        localView1 = localView2;
        if (this.e != null)
        {
          localView1 = localView2;
          if (!f())
          {
            a();
            localView1 = this.e.c(paramInt, this.a, this.n);
            a(false);
          }
        }
      }
    }
    if (localView1 != null) {}
    for (;;)
    {
      return localView1;
      localView1 = super.focusSearch(paramView, paramInt);
    }
  }
  
  public boolean g()
  {
    if ((this.m != null) && (this.m.m)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    if (this.e == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.e.f();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    if (this.e == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.e.a(getContext(), paramAttributeSet);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.e == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.e.a(paramLayoutParams);
  }
  
  public int getBaseline()
  {
    if (this.e != null) {}
    for (int i1 = -1;; i1 = super.getBaseline()) {
      return i1;
    }
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    return super.getChildDrawingOrder(paramInt1, paramInt2);
  }
  
  public final void h()
  {
    if (this.d == null) {
      Log.e("RecyclerView", "No adapter attached; skipping layout");
    }
    for (;;)
    {
      return;
      if (this.e != null) {
        break;
      }
      Log.e("RecyclerView", "No layout manager attached; skipping layout");
    }
    this.n.e.clear();
    a();
    q();
    t();
    Object localObject2 = this.n;
    if ((this.n.k) && (this.r) && (g())) {}
    int i7;
    label169:
    int i2;
    for (Object localObject1 = new ed();; localObject1 = null)
    {
      ((zp)localObject2).d = ((ed)localObject1);
      this.r = false;
      this.q = false;
      this.n.j = this.n.l;
      this.n.f = this.d.a();
      localObject2 = this.ac;
      i7 = this.c.a();
      if (i7 != 0) {
        break;
      }
      localObject2[0] = 0;
      localObject2[1] = 0;
      if (!this.n.k) {
        break label412;
      }
      this.n.b.clear();
      this.n.c.clear();
      i2 = this.c.a();
      label250:
      for (i1 = 0;; i1++)
      {
        if (i1 >= i2) {
          break label412;
        }
        localObject1 = b(this.c.b(i1));
        if (!((zr)localObject1).b())
        {
          if (!((zr)localObject1).j()) {
            break;
          }
          localObject1 = this.d;
        }
      }
    }
    int i1 = Integer.MAX_VALUE;
    int i3 = Integer.MIN_VALUE;
    int i5 = 0;
    label274:
    int i4;
    if (i5 < i7)
    {
      localObject1 = b(this.c.b(i5));
      i4 = i1;
      if (((zr)localObject1).b()) {
        break label1990;
      }
      int i6 = ((zr)localObject1).d();
      i2 = i1;
      if (i6 < i1) {
        i2 = i6;
      }
      i4 = i2;
      if (i6 <= i3) {
        break label1990;
      }
      i1 = i6;
    }
    for (;;)
    {
      i5++;
      i3 = i1;
      i1 = i2;
      break label274;
      localObject2[0] = i1;
      localObject2[1] = i3;
      break label169;
      localObject2 = ((zr)localObject1).a;
      this.n.b.put(localObject1, new zg((zr)localObject1, ((View)localObject2).getLeft(), ((View)localObject2).getTop(), ((View)localObject2).getRight(), ((View)localObject2).getBottom()));
      break label250;
      label412:
      long l1;
      boolean bool;
      if (this.n.l)
      {
        i2 = this.c.b();
        for (i1 = 0; i1 < i2; i1++)
        {
          localObject1 = b(this.c.c(i1));
          if ((!((zr)localObject1).b()) && (((zr)localObject1).c == -1)) {
            ((zr)localObject1).c = ((zr)localObject1).b;
          }
        }
        if (this.n.d != null)
        {
          i2 = this.c.a();
          for (i1 = 0; i1 < i2; i1++)
          {
            localObject1 = b(this.c.b(i1));
            if ((((zr)localObject1).l()) && (!((zr)localObject1).n()) && (!((zr)localObject1).b()))
            {
              l1 = b((zr)localObject1);
              this.n.d.put(Long.valueOf(l1), localObject1);
              this.n.b.remove(localObject1);
            }
          }
        }
        bool = this.n.i;
        this.n.i = false;
        this.e.c(this.a, this.n);
        this.n.i = bool;
        localObject2 = new ed();
        i1 = 0;
        label640:
        if (i1 < this.c.a())
        {
          localObject1 = this.c.b(i1);
          if (!b((View)localObject1).b())
          {
            i2 = 0;
            label675:
            if (i2 >= this.n.b.size()) {
              break label1984;
            }
            if (((zr)this.n.b.b(i2)).a != localObject1) {
              break label755;
            }
          }
        }
      }
      label755:
      label889:
      label901:
      label1102:
      label1107:
      label1150:
      label1372:
      label1448:
      label1453:
      label1646:
      label1828:
      label1859:
      label1979:
      label1984:
      for (i2 = 1;; i2 = 0)
      {
        if (i2 == 0) {
          ((ed)localObject2).put(localObject1, new Rect(((View)localObject1).getLeft(), ((View)localObject1).getTop(), ((View)localObject1).getRight(), ((View)localObject1).getBottom()));
        }
        i1++;
        break label640;
        i2++;
        break label675;
        v();
        this.b.c();
        for (;;)
        {
          this.n.f = this.d.a();
          this.n.h = 0;
          this.n.j = false;
          this.e.c(this.a, this.n);
          this.n.i = false;
          this.v = null;
          localObject1 = this.n;
          Object localObject3;
          Object localObject4;
          if ((this.n.k) && (this.m != null))
          {
            bool = true;
            ((zp)localObject1).k = bool;
            if (!this.n.k) {
              break label1859;
            }
            if (this.n.d == null) {
              break label1102;
            }
            localObject1 = new ed();
            i2 = this.c.a();
            i1 = 0;
            if (i1 >= i2) {
              break label1150;
            }
            localObject3 = b(this.c.b(i1));
            if (!((zr)localObject3).b())
            {
              localObject4 = ((zr)localObject3).a;
              l1 = b((zr)localObject3);
              if ((localObject1 == null) || (this.n.d.get(Long.valueOf(l1)) == null)) {
                break label1107;
              }
              ((ed)localObject1).put(Long.valueOf(l1), localObject3);
            }
          }
          for (;;)
          {
            i1++;
            break label901;
            v();
            this.b.e();
            if (this.n.d == null) {
              break label1979;
            }
            i2 = this.c.a();
            for (i1 = 0; i1 < i2; i1++)
            {
              localObject1 = b(this.c.b(i1));
              if ((((zr)localObject1).l()) && (!((zr)localObject1).n()) && (!((zr)localObject1).b()))
              {
                l1 = b((zr)localObject1);
                this.n.d.put(Long.valueOf(l1), localObject1);
                this.n.b.remove(localObject1);
              }
            }
            bool = false;
            break;
            localObject1 = null;
            break label889;
            this.n.c.put(localObject3, new zg((zr)localObject3, ((View)localObject4).getLeft(), ((View)localObject4).getTop(), ((View)localObject4).getRight(), ((View)localObject4).getBottom()));
          }
          a((ed)localObject2);
          for (i1 = this.n.b.size() - 1; i1 >= 0; i1--)
          {
            localObject3 = (zr)this.n.b.b(i1);
            if (!this.n.c.containsKey(localObject3))
            {
              localObject3 = (zg)this.n.b.c(i1);
              this.n.b.d(i1);
              this.a.b(((zg)localObject3).a);
              a((zg)localObject3);
            }
          }
          i1 = this.n.c.size();
          if (i1 > 0)
          {
            i1--;
            if (i1 >= 0)
            {
              zr localzr = (zr)this.n.c.b(i1);
              localObject4 = (zg)this.n.c.c(i1);
              if ((this.n.b.isEmpty()) || (!this.n.b.containsKey(localzr)))
              {
                this.n.c.d(i1);
                if (localObject2 == null) {
                  break label1448;
                }
                localObject3 = (Rect)((ed)localObject2).get(localzr.a);
                i3 = ((zg)localObject4).b;
                i2 = ((zg)localObject4).c;
                if ((localObject3 == null) || ((((Rect)localObject3).left == i3) && (((Rect)localObject3).top == i2))) {
                  break label1453;
                }
                localzr.a(false);
                if (this.m.a(localzr, ((Rect)localObject3).left, ((Rect)localObject3).top, i3, i2)) {
                  s();
                }
              }
              for (;;)
              {
                i1--;
                break;
                localObject3 = null;
                break label1372;
                localzr.a(false);
                this.m.b(localzr);
                s();
              }
            }
          }
          i2 = this.n.c.size();
          for (i1 = 0; i1 < i2; i1++)
          {
            localObject4 = (zr)this.n.c.b(i1);
            localObject2 = (zg)this.n.c.c(i1);
            localObject3 = (zg)this.n.b.get(localObject4);
            if ((localObject3 != null) && (localObject2 != null) && ((((zg)localObject3).b != ((zg)localObject2).b) || (((zg)localObject3).c != ((zg)localObject2).c)))
            {
              ((zr)localObject4).a(false);
              if (this.m.a((zr)localObject4, ((zg)localObject3).b, ((zg)localObject3).c, ((zg)localObject2).b, ((zg)localObject2).c)) {
                s();
              }
            }
          }
          if (this.n.d != null)
          {
            i1 = this.n.d.size();
            i1--;
            if (i1 < 0) {
              break label1859;
            }
            l1 = ((Long)this.n.d.b(i1)).longValue();
            localObject2 = (zr)this.n.d.get(Long.valueOf(l1));
            if ((!((zr)localObject2).b()) && (this.a.b != null) && (this.a.b.contains(localObject2)))
            {
              localObject3 = (zr)((ed)localObject1).get(Long.valueOf(l1));
              ((zr)localObject2).a(false);
              a((zr)localObject2);
              ((zr)localObject2).g = ((zr)localObject3);
              this.a.b((zr)localObject2);
              i4 = ((zr)localObject2).a.getLeft();
              i5 = ((zr)localObject2).a.getTop();
              if ((localObject3 != null) && (!((zr)localObject3).b())) {
                break label1828;
              }
              i3 = i5;
              i2 = i4;
            }
          }
          for (;;)
          {
            this.m.a((zr)localObject2, (zr)localObject3, i4, i5, i2, i3);
            s();
            i1--;
            break label1646;
            i1 = 0;
            break;
            i2 = ((zr)localObject3).a.getLeft();
            i3 = ((zr)localObject3).a.getTop();
            ((zr)localObject3).a(false);
            ((zr)localObject3).h = ((zr)localObject2);
          }
          a(false);
          this.e.a(this.a);
          this.n.g = this.n.f;
          this.h = false;
          this.n.k = false;
          this.n.l = false;
          r();
          zh.a(this.e, false);
          if (this.a.b != null) {
            this.a.b.clear();
          }
          this.n.d = null;
          if (!f(this.ac[0], this.ac[1])) {
            break;
          }
          c(0, 0);
          break;
          localObject2 = null;
        }
      }
      label1990:
      i1 = i3;
      i2 = i4;
    }
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.ad.a();
  }
  
  public boolean isAttachedToWindow()
  {
    return this.C;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.ad.c;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.J = 0;
    this.C = true;
    this.g = false;
    this.aa = false;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.m != null) {
      this.m.d();
    }
    this.g = false;
    l();
    this.C = false;
    if (this.e != null) {
      this.e.a(this, this.a);
    }
    removeCallbacks(this.ah);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i2 = this.z.size();
    for (int i1 = 0; i1 < i2; i1++) {
      this.z.get(i1);
    }
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    float f3 = 0.0F;
    if (this.e == null) {}
    label48:
    label164:
    label167:
    for (;;)
    {
      return false;
      if (((gd.d(paramMotionEvent) & 0x2) != 0) && (paramMotionEvent.getAction() == 8))
      {
        float f1;
        if (this.e.j())
        {
          f1 = -gd.e(paramMotionEvent, 9);
          if (!this.e.i()) {
            break label164;
          }
        }
        for (float f2 = gd.e(paramMotionEvent, 10);; f2 = 0.0F)
        {
          if ((f1 == 0.0F) && (f2 == 0.0F)) {
            break label167;
          }
          if (this.U == Float.MIN_VALUE)
          {
            TypedValue localTypedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(16842829, localTypedValue, true)) {
              this.U = localTypedValue.getDimension(getContext().getResources().getDisplayMetrics());
            }
          }
          else
          {
            f3 = this.U;
          }
          a((int)(f2 * f3), (int)(f1 * f3), paramMotionEvent);
          break;
          f1 = 0.0F;
          break label48;
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i3 = -1;
    boolean bool1 = true;
    int i4 = paramMotionEvent.getAction();
    if ((i4 == 3) || (i4 == 0)) {
      this.B = null;
    }
    int i2 = this.A.size();
    int i1 = 0;
    if (i1 < i2)
    {
      s locals = (s)this.A.get(i1);
      if ((locals.a()) && (i4 != 3))
      {
        this.B = locals;
        i1 = 1;
        label79:
        if (i1 == 0) {
          break label101;
        }
        p();
      }
    }
    label101:
    boolean bool2;
    boolean bool3;
    for (;;)
    {
      return bool1;
      i1++;
      break;
      i1 = 0;
      break label79;
      if (this.e == null)
      {
        bool1 = false;
      }
      else
      {
        bool2 = this.e.i();
        bool3 = this.e.j();
        if (this.M == null) {
          this.M = VelocityTracker.obtain();
        }
        this.M.addMovement(paramMotionEvent);
        i2 = gd.a(paramMotionEvent);
        i1 = gd.b(paramMotionEvent);
        switch (i2)
        {
        case 4: 
        default: 
          label208:
          if (this.K == 1) {
            break label638;
          }
          bool1 = false;
        }
      }
    }
    this.L = gd.b(paramMotionEvent, 0);
    i1 = (int)(paramMotionEvent.getX() + 0.5F);
    this.P = i1;
    this.N = i1;
    i1 = (int)(paramMotionEvent.getY() + 0.5F);
    this.Q = i1;
    this.O = i1;
    if (this.K == 2)
    {
      getParent().requestDisallowInterceptTouchEvent(true);
      b(1);
    }
    if (bool2) {}
    for (i1 = 1;; i1 = 0)
    {
      i2 = i1;
      if (bool3) {
        i2 = i1 | 0x2;
      }
      startNestedScroll(i2);
      break label208;
      this.L = gd.b(paramMotionEvent, i1);
      i2 = (int)(gd.c(paramMotionEvent, i1) + 0.5F);
      this.P = i2;
      this.N = i2;
      i1 = (int)(gd.d(paramMotionEvent, i1) + 0.5F);
      this.Q = i1;
      this.O = i1;
      break label208;
      i2 = gd.a(paramMotionEvent, this.L);
      if (i2 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.L + " not found. Did any MotionEvents get skipped?");
        bool1 = false;
        break;
      }
      i1 = (int)(gd.c(paramMotionEvent, i2) + 0.5F);
      i2 = (int)(gd.d(paramMotionEvent, i2) + 0.5F);
      if (this.K == 1) {
        break label208;
      }
      i1 -= this.N;
      i4 = i2 - this.O;
      int i5;
      if ((bool2) && (Math.abs(i1) > this.R))
      {
        i2 = this.N;
        i5 = this.R;
        if (i1 < 0)
        {
          i1 = -1;
          label518:
          this.P = (i1 * i5 + i2);
        }
      }
      for (i1 = 1;; i1 = 0)
      {
        i2 = i1;
        if (bool3)
        {
          i2 = i1;
          if (Math.abs(i4) > this.R)
          {
            i2 = this.O;
            i5 = this.R;
            if (i4 >= 0) {
              break label606;
            }
          }
        }
        label606:
        for (i1 = i3;; i1 = 1)
        {
          this.Q = (i2 + i1 * i5);
          i2 = 1;
          if (i2 == 0) {
            break;
          }
          b(1);
          break;
          i1 = 1;
          break label518;
        }
        a(paramMotionEvent);
        break label208;
        this.M.clear();
        stopNestedScroll();
        break label208;
        p();
        break label208;
        label638:
        break;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a();
    a.a("RV OnLayout");
    h();
    a.b();
    a(false);
    this.g = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.G)
    {
      a();
      t();
      if (this.n.l)
      {
        this.n.j = true;
        this.G = false;
        a(false);
      }
    }
    else
    {
      if (this.d == null) {
        break label104;
      }
      this.n.f = this.d.a();
      label64:
      if (this.e != null) {
        break label115;
      }
      e(paramInt1, paramInt2);
    }
    for (;;)
    {
      this.n.j = false;
      return;
      this.b.e();
      this.n.j = false;
      break;
      label104:
      this.n.f = 0;
      break label64;
      label115:
      this.e.e.e(paramInt1, paramInt2);
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    this.v = ((zn)paramParcelable);
    super.onRestoreInstanceState(this.v.getSuperState());
    if ((this.e != null) && (this.v.a != null)) {
      this.e.a(this.v.a);
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    zn localzn = new zn(super.onSaveInstanceState());
    if (this.v != null) {
      zn.a(localzn, this.v);
    }
    for (;;)
    {
      return localzn;
      if (this.e != null) {
        localzn.a = this.e.h();
      } else {
        localzn.a = null;
      }
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {
      o();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    int i1 = paramMotionEvent.getAction();
    int i2;
    Object localObject;
    label83:
    boolean bool1;
    if (this.B != null)
    {
      if (i1 == 0) {
        this.B = null;
      }
    }
    else
    {
      if (i1 == 0) {
        break label127;
      }
      i2 = this.A.size();
      i1 = 0;
      if (i1 >= i2) {
        break label127;
      }
      localObject = (s)this.A.get(i1);
      if (!((s)localObject).a()) {
        break label121;
      }
      this.B = ((s)localObject);
      i1 = 1;
      if (i1 == 0) {
        break label133;
      }
      p();
      bool1 = true;
    }
    label121:
    label127:
    label133:
    boolean bool3;
    for (;;)
    {
      return bool1;
      if ((i1 == 3) || (i1 == 1)) {
        this.B = null;
      }
      i1 = 1;
      break label83;
      i1++;
      break;
      i1 = 0;
      break label83;
      bool1 = bool2;
      if (this.e != null)
      {
        bool1 = this.e.i();
        bool3 = this.e.j();
        if (this.M == null) {
          this.M = VelocityTracker.obtain();
        }
        this.M.addMovement(paramMotionEvent);
        localObject = MotionEvent.obtain(paramMotionEvent);
        i2 = gd.a(paramMotionEvent);
        i1 = gd.b(paramMotionEvent);
        if (i2 == 0)
        {
          int[] arrayOfInt = this.ag;
          this.ag[1] = 0;
          arrayOfInt[0] = 0;
        }
        ((MotionEvent)localObject).offsetLocation(this.ag[0], this.ag[1]);
        switch (i2)
        {
        case 4: 
        default: 
          label288:
          ((MotionEvent)localObject).recycle();
          bool1 = true;
        }
      }
    }
    this.L = gd.b(paramMotionEvent, 0);
    i1 = (int)(paramMotionEvent.getX() + 0.5F);
    this.P = i1;
    this.N = i1;
    i1 = (int)(paramMotionEvent.getY() + 0.5F);
    this.Q = i1;
    this.O = i1;
    if (bool1) {}
    for (i1 = 1;; i1 = 0)
    {
      i2 = i1;
      if (bool3) {
        i2 = i1 | 0x2;
      }
      startNestedScroll(i2);
      break label288;
      this.L = gd.b(paramMotionEvent, i1);
      i2 = (int)(gd.c(paramMotionEvent, i1) + 0.5F);
      this.P = i2;
      this.N = i2;
      i1 = (int)(gd.d(paramMotionEvent, i1) + 0.5F);
      this.Q = i1;
      this.O = i1;
      break label288;
      i1 = gd.a(paramMotionEvent, this.L);
      if (i1 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.L + " not found. Did any MotionEvents get skipped?");
        bool1 = bool2;
        break;
      }
      int i7 = (int)(gd.c(paramMotionEvent, i1) + 0.5F);
      int i8 = (int)(gd.d(paramMotionEvent, i1) + 0.5F);
      int i4 = this.P - i7;
      int i3 = this.Q - i8;
      i1 = i3;
      i2 = i4;
      if (dispatchNestedPreScroll(i4, i3, this.af, this.ae))
      {
        i2 = i4 - this.af[0];
        i1 = i3 - this.af[1];
        ((MotionEvent)localObject).offsetLocation(this.ae[0], this.ae[1]);
        paramMotionEvent = this.ag;
        paramMotionEvent[0] += this.ae[0];
        paramMotionEvent = this.ag;
        paramMotionEvent[1] += this.ae[1];
      }
      i3 = i1;
      int i5 = i2;
      if (this.K != 1)
      {
        if ((!bool1) || (Math.abs(i2) <= this.R)) {
          break label1003;
        }
        if (i2 <= 0) {
          break label849;
        }
        i2 -= this.R;
      }
      label700:
      label750:
      label818:
      label849:
      label861:
      label879:
      label926:
      label991:
      label1003:
      for (i3 = 1;; i3 = 0)
      {
        i4 = i1;
        int i6 = i3;
        if (bool3)
        {
          i4 = i1;
          i6 = i3;
          if (Math.abs(i1) > this.R)
          {
            if (i1 <= 0) {
              break label861;
            }
            i4 = i1 - this.R;
            i6 = 1;
          }
        }
        i3 = i4;
        i5 = i2;
        if (i6 != 0)
        {
          b(1);
          i5 = i2;
          i3 = i4;
        }
        if (this.K != 1) {
          break;
        }
        this.P = (i7 - this.ae[0]);
        this.Q = (i8 - this.ae[1]);
        if (bool1) {
          if (!bool3) {
            break label879;
          }
        }
        while (a(i5, i3, (MotionEvent)localObject))
        {
          getParent().requestDisallowInterceptTouchEvent(true);
          break;
          i2 += this.R;
          break label700;
          i4 = i1 + this.R;
          break label750;
          i5 = 0;
          break label818;
          i3 = 0;
        }
        a(paramMotionEvent);
        break;
        this.M.computeCurrentVelocity(1000, this.T);
        float f1;
        if (bool1)
        {
          f1 = -gp.a(this.M, this.L);
          if (!bool3) {
            break label991;
          }
        }
        for (float f2 = -gp.b(this.M, this.L);; f2 = 0.0F)
        {
          if (((f1 == 0.0F) && (f2 == 0.0F)) || (!b((int)f1, (int)f2))) {
            b(0);
          }
          this.M.clear();
          n();
          break;
          f1 = 0.0F;
          break label926;
        }
        p();
        break;
      }
    }
  }
  
  public void removeDetachedView(View paramView, boolean paramBoolean)
  {
    zr localzr = b(paramView);
    if (localzr != null)
    {
      if (!localzr.o()) {
        break label32;
      }
      localzr.i();
    }
    label32:
    while (localzr.b())
    {
      b(paramView);
      super.removeDetachedView(paramView, paramBoolean);
      return;
    }
    throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + localzr);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    Object localObject = this.e;
    int i1;
    if (f())
    {
      i1 = 1;
      if ((i1 == 0) && (paramView2 != null))
      {
        this.y.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
        localObject = paramView2.getLayoutParams();
        if ((localObject instanceof zi))
        {
          localObject = (zi)localObject;
          if (!((zi)localObject).e)
          {
            localObject = ((zi)localObject).d;
            Rect localRect = this.y;
            localRect.left -= ((Rect)localObject).left;
            localRect = this.y;
            localRect.right += ((Rect)localObject).right;
            localRect = this.y;
            localRect.top -= ((Rect)localObject).top;
            localRect = this.y;
            i1 = localRect.bottom;
            localRect.bottom = (((Rect)localObject).bottom + i1);
          }
        }
        offsetDescendantRectToMyCoords(paramView2, this.y);
        offsetRectIntoDescendantCoords(paramView1, this.y);
        localObject = this.y;
        if (this.g) {
          break label213;
        }
      }
    }
    label213:
    for (boolean bool = true;; bool = false)
    {
      requestChildRectangleOnScreen(paramView1, (Rect)localObject, bool);
      super.requestChildFocus(paramView1, paramView2);
      return;
      i1 = 0;
      break;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    zh localzh = this.e;
    int i9 = localzh.q();
    int i5 = localzh.r();
    int i8 = localzh.o() - localzh.s();
    int i11 = localzh.p();
    int i12 = localzh.t();
    int i7 = paramView.getLeft() + paramRect.left;
    int i4 = paramView.getTop() + paramRect.top;
    int i10 = i7 + paramRect.width();
    int i6 = paramRect.height();
    int i3 = Math.min(0, i7 - i9);
    int i2 = Math.min(0, i4 - i5);
    int i1 = Math.max(0, i10 - i8);
    i6 = Math.max(0, i4 + i6 - (i11 - i12));
    if (gt.g(localzh.e) == 1) {
      if (i1 != 0)
      {
        if (i2 == 0) {
          break label224;
        }
        label156:
        if ((i1 == 0) && (i2 == 0)) {
          break label250;
        }
        if (!paramBoolean) {
          break label239;
        }
        scrollBy(i1, i2);
      }
    }
    label178:
    label224:
    label239:
    label250:
    for (paramBoolean = true;; paramBoolean = false)
    {
      return paramBoolean;
      i1 = Math.max(i3, i10 - i8);
      break;
      if (i3 != 0) {}
      for (i1 = i3;; i1 = Math.min(i7 - i9, i1)) {
        break;
      }
      i2 = Math.min(i4 - i5, i6);
      break label156;
      a(i1, i2);
      break label178;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i2 = this.A.size();
    for (int i1 = 0; i1 < i2; i1++) {
      this.A.get(i1);
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    if (!this.D) {
      super.requestLayout();
    }
    for (;;)
    {
      return;
      this.E = true;
    }
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    if (this.e == null) {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
    }
    boolean bool2;
    boolean bool1;
    do
    {
      return;
      bool2 = this.e.i();
      bool1 = this.e.j();
    } while ((!bool2) && (!bool1));
    if (bool2) {
      label49:
      if (!bool1) {
        break label69;
      }
    }
    for (;;)
    {
      a(paramInt1, paramInt2, null);
      break;
      paramInt1 = 0;
      break label49;
      label69:
      paramInt2 = 0;
    }
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    throw new UnsupportedOperationException("RecyclerView does not support scrolling to an absolute position.");
  }
  
  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    int i1 = 0;
    int i2 = 0;
    if (f()) {
      if (paramAccessibilityEvent == null) {
        break label54;
      }
    }
    label54:
    for (i1 = iz.b(paramAccessibilityEvent);; i1 = 0)
    {
      if (i1 == 0) {
        i1 = i2;
      }
      for (;;)
      {
        this.F = (i1 | this.F);
        i1 = 1;
        if (i1 != 0) {}
        for (;;)
        {
          return;
          super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
        }
      }
    }
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != this.w) {
      o();
    }
    this.w = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.g) {
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    gj localgj = this.ad;
    if (localgj.c) {
      gt.t(localgj.a);
    }
    localgj.c = paramBoolean;
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    gj localgj = this.ad;
    boolean bool;
    if (localgj.a()) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (localgj.c)
      {
        ViewParent localViewParent = localgj.a.getParent();
        View localView = localgj.a;
        for (;;)
        {
          if (localViewParent == null) {
            break label106;
          }
          if (ic.a(localViewParent, localView, localgj.a, paramInt))
          {
            localgj.b = localViewParent;
            ic.b(localViewParent, localView, localgj.a, paramInt);
            bool = true;
            break;
          }
          if ((localViewParent instanceof View)) {
            localView = (View)localViewParent;
          }
          localViewParent = localViewParent.getParent();
        }
      }
      label106:
      bool = false;
    }
  }
  
  public void stopNestedScroll()
  {
    gj localgj = this.ad;
    if (localgj.b != null)
    {
      ic.a(localgj.b, localgj.a);
      localgj.b = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\widget\RecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */