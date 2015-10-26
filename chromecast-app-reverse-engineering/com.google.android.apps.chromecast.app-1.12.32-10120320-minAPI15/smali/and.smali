.class public Land;
.super Lmm;
.source "PG"

# interfaces
.implements Lbaq;


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:Lazg;

.field private H:Lbfs;

.field private I:Lbfs;

.field private J:Lbdm;

.field private K:Laop;

.field private L:Z

.field private M:J

.field private N:I

.field private final O:Z

.field private e:I

.field private f:I

.field private g:Landroid/widget/TextView;

.field public h:Ljava/lang/String;

.field public i:Lbdf;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Z

.field public m:Lbdj;

.field public n:Lbfs;

.field public o:Ljava/lang/String;

.field public p:Lbdu;

.field public q:Ljava/lang/String;

.field public r:Ljava/util/ArrayList;

.field public s:Landroid/widget/ViewFlipper;

.field public t:Lblp;

.field public u:Z

.field private v:Landroid/content/DialogInterface$OnCancelListener;

.field private w:Landroid/content/DialogInterface$OnCancelListener;

.field private x:Landroid/os/Handler;

.field private y:Ljava/lang/Runnable;

.field private z:Lazv;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 210
    invoke-direct {p0}, Lmm;-><init>()V

    .line 153
    const/4 v0, -0x1

    iput v0, p0, Land;->e:I

    .line 165
    iput v1, p0, Land;->f:I

    .line 168
    new-instance v0, Lane;

    invoke-direct {v0, p0}, Lane;-><init>(Land;)V

    iput-object v0, p0, Land;->w:Landroid/content/DialogInterface$OnCancelListener;

    .line 211
    new-instance v0, Lblp;

    invoke-direct {v0, p1, v1}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Land;->t:Lblp;

    .line 212
    iput-boolean p2, p0, Land;->O:Z

    .line 213
    return-void
.end method

.method static synthetic a(Land;J)J
    .locals 1

    .prologue
    .line 82
    iput-wide p1, p0, Land;->M:J

    return-wide p1
.end method

.method private a(Ljava/lang/String;ZLaoo;)Landroid/app/AlertDialog$Builder;
    .locals 2

    .prologue
    .line 1694
    invoke-virtual {p0}, Land;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1695
    if-eqz p3, :cond_1

    .line 1696
    if-eqz p2, :cond_0

    .line 1697
    invoke-virtual {p0}, Land;->y()V

    .line 1699
    :cond_0
    invoke-interface {p3}, Laoo;->b()V

    .line 1701
    :cond_1
    const/4 v0, 0x0

    .line 1706
    :goto_0
    return-object v0

    .line 1703
    :cond_2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1704
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 1705
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Laoe;

    invoke-direct {v1, p0, p2, p3}, Laoe;-><init>(Land;ZLaoo;)V

    .line 1706
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Land;)Lbdf;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Land;->i:Lbdf;

    return-object v0
.end method

.method static synthetic a(Land;Lbdf;)Lbdf;
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Land;->i:Lbdf;

    return-object p1
.end method

.method static synthetic a(Land;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Land;->r:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic a(Land;Lbdf;JLapd;)V
    .locals 6

    .prologue
    const/4 v3, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 82
    .line 43628
    iget-object v0, p1, Lbdf;->G:Lbdj;

    .line 43078
    if-nez v0, :cond_0

    .line 43080
    sget-object v0, Lbdj;->a:Lbdj;

    .line 43084
    :goto_0
    sget-object v1, Laoh;->a:[I

    invoke-virtual {v0}, Lbdj;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 43136
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 43137
    cmp-long v1, v2, p2

    if-ltz v1, :cond_1

    .line 43138
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    invoke-virtual {p4, v4}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 43140
    sget v0, Lb;->aB:I

    invoke-virtual {p0, v0}, Land;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lb;->aY:I

    .line 43141
    invoke-virtual {p0, v1}, Land;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 43140
    invoke-direct {p0, v0, v1}, Land;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void

    .line 43082
    :cond_0
    new-array v1, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Lbdj;->name()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    goto :goto_0

    .line 43092
    :pswitch_0
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    iget v0, v0, Lbdj;->r:I

    invoke-virtual {p4, v0}, Lapd;->a(I)Lapd;

    move-result-object v0

    invoke-virtual {v1, v0}, Lape;->a(Lapd;)V

    .line 44427
    iget-object v0, p1, Lbdf;->u:Ljava/lang/String;

    .line 43093
    invoke-direct {p0, v0}, Land;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 43099
    :pswitch_1
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    iget v2, v0, Lbdj;->r:I

    invoke-virtual {p4, v2}, Lapd;->a(I)Lapd;

    move-result-object v2

    invoke-virtual {v1, v2}, Lape;->a(Lapd;)V

    .line 43100
    sget v1, Lb;->aN:I

    new-array v2, v3, [Ljava/lang/Object;

    .line 43101
    invoke-virtual {p0}, Land;->D()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    iget-object v3, p0, Land;->H:Lbfs;

    .line 45130
    iget-object v3, v3, Lbfs;->a:Ljava/lang/String;

    .line 43101
    aput-object v3, v2, v5

    .line 43100
    invoke-virtual {p0, v1, v2}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lb;->aX:I

    new-array v3, v5, [Ljava/lang/Object;

    iget v0, v0, Lbdj;->r:I

    .line 43102
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {p0, v2, v3}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 43100
    invoke-direct {p0, v1, v0}, Land;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 43106
    :pswitch_2
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    iget v2, v0, Lbdj;->r:I

    invoke-virtual {p4, v2}, Lapd;->a(I)Lapd;

    move-result-object v2

    invoke-virtual {v1, v2}, Lape;->a(Lapd;)V

    .line 43107
    sget v1, Lb;->aL:I

    new-array v2, v3, [Ljava/lang/Object;

    .line 43108
    invoke-virtual {p0}, Land;->D()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    iget-object v3, p0, Land;->H:Lbfs;

    .line 46130
    iget-object v3, v3, Lbfs;->a:Ljava/lang/String;

    .line 43108
    aput-object v3, v2, v5

    .line 43107
    invoke-virtual {p0, v1, v2}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lb;->aX:I

    new-array v3, v5, [Ljava/lang/Object;

    iget v0, v0, Lbdj;->r:I

    .line 43109
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {p0, v2, v3}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 43107
    invoke-direct {p0, v1, v0}, Land;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 43113
    :pswitch_3
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    iget v2, v0, Lbdj;->r:I

    invoke-virtual {p4, v2}, Lapd;->a(I)Lapd;

    move-result-object v2

    invoke-virtual {v1, v2}, Lape;->a(Lapd;)V

    .line 43114
    sget v1, Lb;->aM:I

    new-array v2, v3, [Ljava/lang/Object;

    .line 43115
    invoke-virtual {p0}, Land;->D()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    iget-object v3, p0, Land;->H:Lbfs;

    .line 47130
    iget-object v3, v3, Lbfs;->a:Ljava/lang/String;

    .line 43115
    aput-object v3, v2, v5

    .line 43114
    invoke-virtual {p0, v1, v2}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lb;->aX:I

    new-array v3, v5, [Ljava/lang/Object;

    iget v0, v0, Lbdj;->r:I

    .line 43116
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {p0, v2, v3}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 43114
    invoke-direct {p0, v1, v0}, Land;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 43120
    :pswitch_4
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    iget v2, v0, Lbdj;->r:I

    invoke-virtual {p4, v2}, Lapd;->a(I)Lapd;

    move-result-object v2

    invoke-virtual {v1, v2}, Lape;->a(Lapd;)V

    .line 43121
    sget v1, Lb;->aK:I

    new-array v2, v3, [Ljava/lang/Object;

    .line 43122
    invoke-virtual {p0}, Land;->D()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    iget-object v3, p0, Land;->H:Lbfs;

    .line 48130
    iget-object v3, v3, Lbfs;->a:Ljava/lang/String;

    .line 43122
    aput-object v3, v2, v5

    .line 43121
    invoke-virtual {p0, v1, v2}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lb;->aX:I

    new-array v3, v5, [Ljava/lang/Object;

    iget v0, v0, Lbdj;->r:I

    .line 43123
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {p0, v2, v3}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 43121
    invoke-direct {p0, v1, v0}, Land;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 43143
    :cond_1
    iput-object v0, p0, Land;->m:Lbdj;

    .line 43144
    iget-object v0, p0, Land;->x:Landroid/os/Handler;

    iget-object v1, p0, Land;->y:Ljava/lang/Runnable;

    iget v2, p0, Land;->D:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_1

    .line 43084
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic a(Land;Lbdj;Lbdf;)V
    .locals 9

    .prologue
    const/4 v8, 0x1

    .line 82
    .line 50381
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b()Lalm;

    move-result-object v0

    .line 50382
    iget-object v1, p0, Land;->h:Ljava/lang/String;

    .line 50405
    invoke-virtual {v0, v1}, Lalm;->c(Ljava/lang/String;)Laow;

    move-result-object v1

    .line 50406
    if-eqz v1, :cond_0

    .line 50407
    if-eqz p2, :cond_1

    .line 50409
    invoke-virtual {v1, p2}, Laow;->a(Lbdf;)V

    .line 50410
    invoke-virtual {v1}, Laow;->p()V

    .line 50411
    invoke-virtual {v0, v1}, Lalm;->b(Laow;)V

    .line 50388
    :cond_0
    :goto_0
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 50389
    iget-object v0, p0, Land;->i:Lbdf;

    .line 50419
    iget-boolean v0, v0, Lbdf;->h:Z

    .line 50389
    if-eqz v0, :cond_2

    .line 50390
    const-string v0, "nonhendrixDiscovered"

    .line 50392
    :goto_1
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v0, v8}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 50395
    if-eqz p1, :cond_3

    .line 50396
    iput-object p1, p0, Land;->m:Lbdj;

    .line 50397
    new-array v0, v8, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 50398
    iget-object v0, p0, Land;->K:Laop;

    invoke-interface {v0}, Laop;->a()V

    .line 50399
    invoke-virtual {p0}, Land;->y()V

    :goto_2
    return-void

    .line 50412
    :cond_1
    invoke-virtual {v1}, Laow;->q()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 50415
    invoke-virtual {v0, v1}, Lalm;->a(Laow;)V

    goto :goto_0

    .line 50391
    :cond_2
    const-string v0, "hendrixDiscovered"

    goto :goto_1

    .line 50421
    :cond_3
    iget-object v0, p0, Land;->p:Lbdu;

    new-instance v7, Lanx;

    invoke-direct {v7, p0}, Lanx;-><init>(Land;)V

    .line 50439
    invoke-virtual {v0}, Lbdu;->d()J

    move-result-wide v2

    .line 50440
    new-instance v4, Lbdq;

    iget-object v1, v0, Lbdu;->d:Ljava/lang/String;

    const/16 v5, 0x80

    .line 50451
    iget v6, v0, Lbdm;->c:I

    .line 50441
    invoke-direct {v4, v1, v5, v6}, Lbdq;-><init>(Ljava/lang/String;II)V

    .line 50452
    iput-boolean v8, v4, Lbfp;->i:Z

    .line 50443
    const-string v1, "getSetupState"

    iget v5, v0, Lbdu;->e:I

    new-instance v6, Lber;

    invoke-direct {v6, v0, v7, v4}, Lber;-><init>(Lbdu;Lbdn;Lbdq;)V

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    goto :goto_2
.end method

.method static synthetic a(Land;Lbdm;ILjava/lang/String;)V
    .locals 4

    .prologue
    .line 82
    .line 40672
    sget v0, Lb;->aZ:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Land;->D()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v1}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Land;->w:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {p0, v0, v1}, Land;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 40676
    sget v0, Lbfk;->b:I

    if-ne p2, v0, :cond_1

    .line 40677
    iget-boolean v0, p0, Land;->O:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x1f

    .line 40683
    :goto_0
    new-instance v1, Lapd;

    invoke-direct {v1, v0}, Lapd;-><init>(I)V

    .line 40684
    invoke-virtual {p0}, Land;->A()Laph;

    move-result-object v0

    .line 41115
    iput-object v0, v1, Lapd;->h:Laph;

    .line 40685
    invoke-virtual {p0}, Land;->x()V

    .line 40686
    new-instance v0, Lani;

    invoke-direct {v0, p0, v1, p2, p3}, Lani;-><init>(Land;Lapd;ILjava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Lbdm;->a(ILbdn;)V

    .line 82
    return-void

    .line 40678
    :cond_0
    const/16 v0, 0x29

    goto :goto_0

    .line 40680
    :cond_1
    iget-boolean v0, p0, Land;->O:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x1e

    goto :goto_0

    .line 40681
    :cond_2
    const/16 v0, 0x28

    goto :goto_0
.end method

.method static synthetic a(Land;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Land;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Land;Ljava/lang/String;IILjava/lang/String;Z)V
    .locals 0

    .prologue
    .line 82
    invoke-direct/range {p0 .. p5}, Land;->a(Ljava/lang/String;IILjava/lang/String;Z)V

    return-void
.end method

.method static synthetic a(Land;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1, p2}, Land;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/view/Menu;IZ)V
    .locals 1

    .prologue
    .line 299
    invoke-interface {p0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 300
    if-eqz v0, :cond_0

    .line 301
    invoke-interface {v0, p2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 302
    invoke-interface {v0, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 304
    :cond_0
    return-void
.end method

.method private a(Lbdf;)V
    .locals 4

    .prologue
    .line 1395
    iget-object v0, p0, Land;->G:Lazg;

    iget-object v1, p0, Land;->p:Lbdu;

    .line 26915
    iget-object v2, p0, Land;->i:Lbdf;

    .line 1395
    new-instance v3, Lanv;

    invoke-direct {v3, p0, p1}, Lanv;-><init>(Land;Lbdf;)V

    invoke-virtual {v0, v1, v2, v3}, Lazg;->a(Lbdu;Lbdf;Lbdn;)V

    .line 1441
    return-void
.end method

.method private a(Lbdm;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 652
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 653
    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->db:I

    new-instance v2, Lanh;

    invoke-direct {v2, p0, p1, p2, p4}, Lanh;-><init>(Land;Lbdm;ILjava/lang/String;)V

    .line 654
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->H:I

    const/4 v2, 0x0

    .line 661
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 662
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 663
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 664
    return-void
.end method

.method private a(Ljava/lang/String;IILjava/lang/String;Z)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 1530
    new-array v0, v3, [Ljava/lang/Object;

    aput-object p4, v0, v4

    .line 1531
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/apps/chromecast/app/SetupApplication;->c(Ljava/lang/String;)V

    .line 1532
    invoke-virtual {p0}, Land;->w()V

    .line 1533
    const/4 v0, 0x0

    iput-object v0, p0, Land;->y:Ljava/lang/Runnable;

    .line 1534
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lb;->aC:I

    .line 1535
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    .line 1536
    invoke-virtual {p0, p2}, Land;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    .line 1537
    invoke-virtual {p0, p3}, Land;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    .line 1536
    invoke-static {p0, p1, v1}, Lblx;->a(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 1538
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lany;

    invoke-direct {v1, p0, p5}, Lany;-><init>(Land;Z)V

    .line 1539
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 1552
    if-eqz p5, :cond_0

    .line 1553
    sget v1, Lb;->I:I

    new-instance v2, Lanz;

    invoke-direct {v2, p0}, Lanz;-><init>(Land;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1581
    :goto_0
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1582
    return-void

    .line 1562
    :cond_0
    sget v1, Lb;->dd:I

    new-instance v2, Laob;

    invoke-direct {v2, p0}, Laob;-><init>(Land;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lb;->dc:I

    new-instance v3, Laoa;

    invoke-direct {v3, p0}, Laoa;-><init>(Land;)V

    .line 1571
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 1515
    sget v2, Lb;->dF:I

    sget v3, Lb;->dG:I

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Land;->a(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 1517
    return-void
.end method

.method static synthetic a(Land;Laop;)Z
    .locals 2

    .prologue
    .line 82
    .line 39483
    iget-object v0, p0, Land;->i:Lbdf;

    .line 40239
    iget v0, v0, Lbdf;->a:I

    .line 39483
    const/4 v1, 0x7

    if-le v0, v1, :cond_0

    .line 39484
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    const-string v1, "App needs to be updated"

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->c(Ljava/lang/String;)V

    .line 39485
    invoke-virtual {p0}, Land;->w()V

    .line 39486
    new-instance v0, Laok;

    invoke-direct {v0, p0, p1}, Laok;-><init>(Land;Laop;)V

    invoke-static {p0, v0}, Lblx;->a(Landroid/app/Activity;Landroid/content/DialogInterface$OnClickListener;)V

    .line 39494
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 39496
    :cond_0
    const/4 v0, 0x1

    .line 82
    goto :goto_0
.end method

.method static synthetic a(Land;Layq;)Z
    .locals 1

    .prologue
    .line 82
    .line 50352
    invoke-virtual {p1}, Layq;->b()V

    .line 50353
    const/4 v0, 0x1

    .line 82
    return v0
.end method

.method static synthetic b(Land;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Land;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Land;Lbdf;)V
    .locals 10

    .prologue
    .line 82
    .line 48268
    new-instance v2, Lapd;

    iget-boolean v0, p0, Land;->O:Z

    if-eqz v0, :cond_0

    .line 48269
    const/16 v0, 0x17

    .line 48270
    :goto_0
    invoke-direct {v2, v0}, Lapd;-><init>(I)V

    .line 48271
    invoke-virtual {p0}, Land;->A()Laph;

    move-result-object v0

    .line 49115
    iput-object v0, v2, Lapd;->h:Laph;

    .line 48272
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-boolean v0, p0, Land;->O:Z

    if-eqz v0, :cond_1

    .line 48273
    iget v0, p0, Land;->A:I

    :goto_1
    int-to-long v0, v0

    add-long/2addr v4, v0

    .line 48274
    new-instance v3, Layq;

    invoke-virtual {p0}, Land;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0}, Layq;-><init>(Landroid/content/Context;)V

    .line 48277
    new-instance v0, Lans;

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lans;-><init>(Land;Lapd;Layq;JLbdf;)V

    .line 48308
    iget-object v1, p0, Land;->x:Landroid/os/Handler;

    iget v4, p0, Land;->C:I

    int-to-long v4, v4

    invoke-virtual {v1, v0, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 48311
    new-instance v1, Layy;

    new-instance v4, Lant;

    move-object v5, p0

    move-object v6, v0

    move-object v7, v3

    move-object v8, v2

    move-object v9, p1

    invoke-direct/range {v4 .. v9}, Lant;-><init>(Land;Ljava/lang/Runnable;Layq;Lapd;Lbdf;)V

    invoke-direct {v1, v4}, Layy;-><init>(Layw;)V

    invoke-virtual {v3, v1}, Layq;->a(Layw;)V

    .line 49352
    invoke-virtual {v3}, Layq;->b()V

    .line 82
    return-void

    .line 48270
    :cond_0
    const/16 v0, 0x2d

    goto :goto_0

    .line 48273
    :cond_1
    iget v0, p0, Land;->B:I

    goto :goto_1
.end method

.method static synthetic b(Land;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 82
    .line 50454
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50455
    sget v0, Lb;->bI:I

    invoke-virtual {p0, v0}, Land;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Land;->e(Ljava/lang/String;)V

    :goto_0
    return-void

    .line 50458
    :cond_0
    invoke-virtual {p0}, Land;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v2, La;->gg:I

    invoke-virtual {v0, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    .line 50459
    new-instance v2, Laog;

    invoke-direct {v2, p0, v0}, Laog;-><init>(Land;Landroid/webkit/WebView;)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 50470
    const-string v3, "text/html"

    const-string v4, "utf-8"

    move-object v2, p1

    move-object v5, v1

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic b(Land;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 82
    .line 49504
    sget v2, Lb;->dF:I

    sget v3, Lb;->dG:I

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Land;->a(Ljava/lang/String;IILjava/lang/String;Z)V

    .line 82
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 1153
    new-instance v2, Lapd;

    iget-boolean v0, p0, Land;->O:Z

    if-eqz v0, :cond_0

    .line 1154
    const/16 v0, 0x16

    .line 1155
    :goto_0
    invoke-direct {v2, v0}, Lapd;-><init>(I)V

    .line 1156
    invoke-virtual {p0}, Land;->A()Laph;

    move-result-object v0

    .line 25115
    iput-object v0, v2, Lapd;->h:Laph;

    .line 1157
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 1158
    new-instance v0, Lanp;

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lanp;-><init>(Land;Lapd;Ljava/lang/String;J)V

    .line 1201
    iget-boolean v1, p0, Land;->L:Z

    if-eqz v1, :cond_2

    .line 1204
    iget-object v1, p0, Land;->z:Lazv;

    iget-object v2, p0, Land;->I:Lbfs;

    invoke-virtual {v1, v2}, Lazv;->a(Lbfs;)Landroid/net/wifi/WifiConfiguration;

    move-result-object v1

    if-nez v1, :cond_1

    .line 1205
    invoke-interface {v0, v6}, Lbaa;->a(Z)V

    .line 1217
    :goto_1
    return-void

    .line 1155
    :cond_0
    const/16 v0, 0x2c

    goto :goto_0

    .line 1208
    :cond_1
    invoke-static {}, Lape;->a()Lape;

    move-result-object v2

    new-instance v3, Lapd;

    iget-boolean v1, p0, Land;->O:Z

    if-eqz v1, :cond_3

    .line 1209
    const/16 v1, 0x1d

    .line 1210
    :goto_2
    invoke-direct {v3, v1}, Lapd;-><init>(I)V

    .line 1211
    invoke-virtual {p0}, Land;->A()Laph;

    move-result-object v1

    .line 26115
    iput-object v1, v3, Lapd;->h:Laph;

    .line 1208
    invoke-virtual {v2, v3}, Lape;->a(Lapd;)V

    .line 1216
    :cond_2
    iget-object v1, p0, Land;->z:Lazv;

    iget-object v2, p0, Land;->I:Lbfs;

    .line 26130
    iget-object v2, v2, Lbfs;->a:Ljava/lang/String;

    .line 26153
    invoke-virtual {v1, v2, v0, v6}, Lazv;->a(Ljava/lang/String;Lbaa;Z)Z

    goto :goto_1

    .line 1210
    :cond_3
    const/16 v1, 0x36

    goto :goto_2
.end method

.method static synthetic c(Land;Lbdf;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Land;->a(Lbdf;)V

    return-void
.end method

.method static synthetic c(Land;)Z
    .locals 1

    .prologue
    .line 82
    iget-boolean v0, p0, Land;->O:Z

    return v0
.end method

.method static synthetic d(Land;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Land;->r:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic d(Land;Lbdf;)V
    .locals 5

    .prologue
    .line 82
    .line 50355
    iget-object v0, p0, Land;->p:Lbdu;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    new-instance v4, Lanu;

    invoke-direct {v4, p0, p1}, Lanu;-><init>(Land;Lbdf;)V

    .line 50356
    invoke-virtual {v0, v1, v2, v3, v4}, Lbdu;->a(ILjava/util/Locale;ZLbdn;)V

    .line 82
    return-void
.end method

.method static synthetic e(Land;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Land;->g()V

    return-void
.end method

.method static synthetic f(Land;)V
    .locals 6

    .prologue
    .line 82
    .line 42005
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget v2, p0, Land;->E:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 42007
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget v4, p0, Land;->F:I

    int-to-long v4, v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Land;->M:J

    .line 42008
    const/4 v2, 0x0

    iput-object v2, p0, Land;->m:Lbdj;

    .line 42009
    new-instance v2, Lapd;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lapd;-><init>(I)V

    .line 42010
    invoke-virtual {p0}, Land;->A()Laph;

    move-result-object v3

    .line 42115
    iput-object v3, v2, Lapd;->h:Laph;

    .line 42011
    new-instance v3, Lann;

    invoke-direct {v3, p0, v2, v0, v1}, Lann;-><init>(Land;Lapd;J)V

    iput-object v3, p0, Land;->y:Ljava/lang/Runnable;

    .line 42069
    iget-object v0, p0, Land;->x:Landroid/os/Handler;

    iget-object v1, p0, Land;->y:Ljava/lang/Runnable;

    iget v2, p0, Land;->D:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 82
    return-void
.end method

.method static synthetic g(Land;)Laop;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Land;->K:Laop;

    return-object v0
.end method

.method private g()V
    .locals 4

    .prologue
    .line 938
    invoke-virtual {p0}, Land;->x()V

    .line 939
    iget-object v0, p0, Land;->i:Lbdf;

    .line 20443
    iget-boolean v0, v0, Lbdf;->w:Z

    .line 939
    if-eqz v0, :cond_0

    .line 941
    sget v0, Lb;->aT:I

    invoke-virtual {p0, v0}, Land;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Land;->w:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {p0, v0, v1}, Land;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 943
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Land;->a(Lbdf;)V

    .line 997
    :goto_0
    return-void

    .line 946
    :cond_0
    sget v0, Lb;->bb:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Land;->H:Lbfs;

    .line 21130
    iget-object v3, v3, Lbfs;->a:Ljava/lang/String;

    .line 946
    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v1}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Land;->w:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {p0, v0, v1}, Land;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 949
    new-instance v1, Lapd;

    iget-boolean v0, p0, Land;->O:Z

    if-eqz v0, :cond_3

    .line 950
    const/16 v0, 0x13

    .line 951
    :goto_1
    invoke-direct {v1, v0}, Lapd;-><init>(I)V

    iget-object v0, p0, Land;->H:Lbfs;

    .line 21138
    iget-object v0, v0, Lbfs;->b:Lbfu;

    .line 952
    iget v0, v0, Lbfu;->j:I

    invoke-virtual {v1, v0}, Lapd;->a(I)Lapd;

    move-result-object v0

    .line 953
    invoke-virtual {p0}, Land;->A()Laph;

    move-result-object v1

    .line 22115
    iput-object v1, v0, Lapd;->h:Laph;

    .line 956
    iget-boolean v1, p0, Land;->L:Z

    if-nez v1, :cond_1

    iget v1, p0, Land;->e:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 957
    iget v1, p0, Land;->e:I

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lapd;->a(J)Lapd;

    .line 959
    :cond_1
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    invoke-virtual {v1, v0}, Lape;->a(Lapd;)V

    .line 961
    iget-object v0, p0, Land;->H:Lbfs;

    .line 22178
    iget-boolean v0, v0, Lbfs;->g:Z

    .line 961
    if-eqz v0, :cond_2

    .line 962
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    new-instance v2, Lapd;

    iget-boolean v0, p0, Land;->O:Z

    if-eqz v0, :cond_4

    .line 963
    const/16 v0, 0x1c

    .line 964
    :goto_2
    invoke-direct {v2, v0}, Lapd;-><init>(I)V

    .line 965
    invoke-virtual {p0}, Land;->A()Laph;

    move-result-object v0

    .line 23115
    iput-object v0, v2, Lapd;->h:Laph;

    .line 962
    invoke-virtual {v1, v2}, Lape;->a(Lapd;)V

    .line 967
    :cond_2
    new-instance v1, Lapd;

    iget-boolean v0, p0, Land;->O:Z

    if-eqz v0, :cond_5

    .line 968
    const/16 v0, 0x14

    .line 969
    :goto_3
    invoke-direct {v1, v0}, Lapd;-><init>(I)V

    .line 970
    invoke-virtual {p0}, Land;->A()Laph;

    move-result-object v0

    .line 24115
    iput-object v0, v1, Lapd;->h:Laph;

    .line 971
    iget-object v0, p0, Land;->J:Lbdm;

    iget-object v2, p0, Land;->H:Lbfs;

    new-instance v3, Lanm;

    invoke-direct {v3, p0, v1}, Lanm;-><init>(Land;Lapd;)V

    invoke-virtual {v0, v2, v3}, Lbdm;->a(Lbfs;Lbdn;)V

    goto/16 :goto_0

    .line 951
    :cond_3
    const/16 v0, 0x2a

    goto :goto_1

    .line 964
    :cond_4
    const/16 v0, 0x33

    goto :goto_2

    .line 969
    :cond_5
    const/16 v0, 0x2b

    goto :goto_3
.end method

.method static synthetic h(Land;)I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Land;->F:I

    return v0
.end method

.method static synthetic i(Land;)J
    .locals 2

    .prologue
    .line 82
    iget-wide v0, p0, Land;->M:J

    return-wide v0
.end method

.method static synthetic j(Land;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Land;->y:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic k(Land;)I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Land;->D:I

    return v0
.end method

.method static synthetic l(Land;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Land;->x:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic m(Land;)Lbdm;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Land;->J:Lbdm;

    return-object v0
.end method

.method static synthetic n(Land;)Lbfs;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Land;->I:Lbfs;

    return-object v0
.end method

.method static synthetic o(Land;)Lbdu;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Land;->p:Lbdu;

    return-object v0
.end method

.method static synthetic p(Land;)V
    .locals 5

    .prologue
    .line 82
    .line 48223
    iget-object v0, p0, Land;->p:Lbdu;

    const/16 v1, 0x4ae

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lanq;

    invoke-direct {v4, p0}, Lanq;-><init>(Land;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lbdu;->a(ILjava/util/Locale;ZLbdn;)V

    .line 82
    return-void
.end method

.method static synthetic q(Land;)Z
    .locals 1

    .prologue
    .line 82
    iget-boolean v0, p0, Land;->L:Z

    return v0
.end method

.method static synthetic r(Land;)Lbfs;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Land;->H:Lbfs;

    return-object v0
.end method

.method static synthetic s(Land;)I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Land;->C:I

    return v0
.end method

.method static synthetic t(Land;)Lazg;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Land;->G:Lazg;

    return-object v0
.end method


# virtual methods
.method public A()Laph;
    .locals 1

    .prologue
    .line 1841
    const/4 v0, 0x0

    return-object v0
.end method

.method public final B()Lbdb;
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 1850
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    .line 1851
    iget-object v0, p0, Land;->i:Lbdf;

    .line 34759
    iget-object v0, v0, Lbdf;->W:Ljava/util/ArrayList;

    .line 1851
    if-eqz v0, :cond_1

    .line 1852
    iget-object v0, p0, Land;->i:Lbdf;

    .line 35759
    iget-object v0, v0, Lbdf;->W:Ljava/util/ArrayList;

    .line 1852
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbdb;

    .line 36032
    iget-object v3, v0, Lbdb;->a:Ljava/lang/String;

    .line 1853
    invoke-virtual {v1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1854
    new-array v1, v6, [Ljava/lang/Object;

    aput-object v0, v1, v5

    .line 1860
    :goto_0
    return-object v0

    .line 1859
    :cond_1
    new-array v0, v6, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v5

    .line 1860
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final C()Lbcz;
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 1870
    invoke-static {}, Lblj;->c()Ljava/lang/String;

    move-result-object v1

    .line 1871
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    .line 1872
    iget-object v0, p0, Land;->i:Lbdf;

    .line 36768
    iget-object v0, v0, Lbdf;->X:Ljava/util/ArrayList;

    .line 1872
    if-eqz v0, :cond_3

    .line 1873
    iget-object v0, p0, Land;->i:Lbdf;

    .line 37768
    iget-object v0, v0, Lbdf;->X:Ljava/util/ArrayList;

    .line 1873
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbcz;

    .line 38028
    iget-object v4, v0, Lbcz;->a:Ljava/lang/String;

    .line 1874
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1875
    new-array v1, v6, [Ljava/lang/Object;

    aput-object v0, v1, v5

    .line 1888
    :goto_0
    return-object v0

    .line 1880
    :cond_1
    iget-object v0, p0, Land;->i:Lbdf;

    .line 38768
    iget-object v0, v0, Lbdf;->X:Ljava/util/ArrayList;

    .line 1880
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbcz;

    .line 39028
    iget-object v3, v0, Lbcz;->a:Ljava/lang/String;

    .line 1881
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1882
    new-array v1, v6, [Ljava/lang/Object;

    aput-object v0, v1, v5

    goto :goto_0

    .line 1887
    :cond_3
    new-array v0, v6, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/util/Locale;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v5

    .line 1888
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final D()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1896
    iget-object v0, p0, Land;->i:Lbdf;

    .line 39254
    iget-object v0, v0, Lbdf;->b:Ljava/lang/String;

    .line 1896
    return-object v0
.end method

.method public final E()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1900
    iget-object v0, p0, Land;->i:Lbdf;

    invoke-static {p0, v0}, Lblx;->a(Landroid/content/Context;Lbdf;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final F()Lbdf;
    .locals 1

    .prologue
    .line 1915
    iget-object v0, p0, Land;->i:Lbdf;

    return-object v0
.end method

.method protected final a(ILjava/lang/String;Lapd;ZLaoo;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 742
    const/16 v0, -0x63

    if-ne p1, v0, :cond_1

    .line 812
    :cond_0
    :goto_0
    return-void

    .line 745
    :cond_1
    if-eqz p3, :cond_2

    .line 746
    invoke-virtual {p0}, Land;->A()Laph;

    move-result-object v0

    .line 11115
    iput-object v0, p3, Lapd;->h:Laph;

    .line 747
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    invoke-virtual {p3, v5}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 750
    :cond_2
    const/4 v0, 0x0

    .line 751
    packed-switch p1, :pswitch_data_0

    .line 772
    :pswitch_0
    sget v1, Lb;->bw:I

    .line 774
    :goto_1
    invoke-virtual {p0}, Land;->w()V

    .line 775
    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {p0, v1, v2}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 777
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, ": %s (%d)"

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v1, v4, v5

    .line 778
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 779
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/apps/chromecast/app/SetupApplication;->c(Ljava/lang/String;)V

    .line 782
    invoke-direct {p0, v1, p4, p5}, Land;->a(Ljava/lang/String;ZLaoo;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 783
    if-eqz v1, :cond_0

    .line 786
    new-instance v2, Lanj;

    invoke-direct {v2, p0, p5, p4}, Lanj;-><init>(Land;Laoo;Z)V

    .line 797
    if-eqz v0, :cond_4

    .line 800
    sget v3, Lb;->aQ:I

    invoke-virtual {v1, v3}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 801
    sget v3, Lb;->H:I

    invoke-virtual {v1, v3, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 802
    sget v2, Lb;->K:I

    new-instance v3, Lank;

    invoke-direct {v3, p0, v0}, Lank;-><init>(Land;Landroid/content/Intent;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 811
    :goto_2
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0

    .line 753
    :pswitch_1
    sget v1, Lb;->bv:I

    goto :goto_1

    .line 756
    :pswitch_2
    sget v1, Lb;->bA:I

    goto :goto_1

    .line 759
    :pswitch_3
    sget v1, Lb;->aO:I

    goto :goto_1

    .line 762
    :pswitch_4
    invoke-static {p0}, Lblr;->e(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 763
    sget v1, Lb;->aP:I

    .line 765
    invoke-static {p0}, Lblr;->f(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    goto :goto_1

    .line 767
    :cond_3
    sget v1, Lb;->aO:I

    goto :goto_1

    .line 809
    :cond_4
    sget v0, Lb;->I:I

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    goto :goto_2

    .line 751
    nop

    :pswitch_data_0
    .packed-switch -0x9
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 221
    sget v0, Lf;->ev:I

    invoke-virtual {p0, v0}, Land;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Land;->s:Landroid/widget/ViewFlipper;

    .line 222
    sget v0, Lf;->dd:I

    invoke-virtual {p0, v0}, Land;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Land;->g:Landroid/widget/TextView;

    .line 225
    if-eqz p1, :cond_0

    .line 226
    const-string v0, "device"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Land;->h:Ljava/lang/String;

    .line 227
    const-string v0, "deviceIpAddress"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Land;->j:Ljava/lang/String;

    .line 228
    const-string v0, "deviceConfiguration"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lbdf;

    iput-object v0, p0, Land;->i:Lbdf;

    .line 229
    const-string v0, "wifiDeviceIp"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Land;->k:Ljava/lang/String;

    .line 230
    const-string v0, "androidNetwork"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lbfs;

    iput-object v0, p0, Land;->n:Lbfs;

    .line 231
    const-string v0, "scannedNetworks"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Land;->r:Ljava/util/ArrayList;

    .line 234
    :cond_0
    iget-object v0, p0, Land;->h:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 235
    invoke-virtual {p0}, Land;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "device"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Land;->h:Ljava/lang/String;

    .line 237
    :cond_1
    iget-object v0, p0, Land;->j:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 238
    invoke-virtual {p0}, Land;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "deviceIpAddress"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Land;->j:Ljava/lang/String;

    .line 240
    :cond_2
    iget-object v0, p0, Land;->i:Lbdf;

    if-nez v0, :cond_3

    .line 241
    invoke-virtual {p0}, Land;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "deviceConfiguration"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lbdf;

    iput-object v0, p0, Land;->i:Lbdf;

    .line 243
    :cond_3
    iget-object v0, p0, Land;->n:Lbfs;

    if-nez v0, :cond_4

    .line 244
    invoke-static {p0}, Lblr;->b(Landroid/content/Context;)Lbfs;

    move-result-object v0

    iput-object v0, p0, Land;->n:Lbfs;

    .line 246
    :cond_4
    iget-object v0, p0, Land;->k:Ljava/lang/String;

    if-nez v0, :cond_5

    .line 247
    iget-object v0, p0, Land;->j:Ljava/lang/String;

    iput-object v0, p0, Land;->k:Ljava/lang/String;

    .line 249
    :cond_5
    iget-object v0, p0, Land;->i:Lbdf;

    .line 2443
    iget-boolean v0, v0, Lbdf;->w:Z

    .line 249
    if-nez v0, :cond_6

    .line 250
    invoke-static {p0}, Lblr;->d(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Land;->e:I

    .line 252
    :cond_6
    iget-boolean v0, p0, Land;->O:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, Land;->i:Lbdf;

    .line 3443
    iget-boolean v0, v0, Lbdf;->w:Z

    .line 252
    if-nez v0, :cond_8

    move v0, v6

    :goto_0
    iput-boolean v0, p0, Land;->l:Z

    .line 253
    invoke-virtual {p0}, Land;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "hotspotSsid"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Land;->o:Ljava/lang/String;

    .line 254
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->l()Lazv;

    move-result-object v0

    iput-object v0, p0, Land;->z:Lazv;

    .line 255
    new-instance v0, Lbdu;

    iget-object v1, p0, Land;->k:Ljava/lang/String;

    iget-object v2, p0, Land;->i:Lbdf;

    .line 4239
    iget v2, v2, Lbdf;->a:I

    .line 256
    iget-object v3, p0, Land;->n:Lbfs;

    if-nez v3, :cond_9

    .line 257
    const/4 v3, 0x0

    :goto_1
    iget-boolean v4, p0, Land;->l:Z

    if-eqz v4, :cond_a

    .line 258
    sget v4, Lbew;->d:I

    .line 259
    :goto_2
    invoke-virtual {p0}, Land;->A()Laph;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lbdu;-><init>(Ljava/lang/String;ILjava/lang/String;ILaph;)V

    iput-object v0, p0, Land;->p:Lbdu;

    .line 261
    invoke-virtual {p0}, Land;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 262
    sget v1, La;->fd:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, p0, Land;->A:I

    .line 263
    sget v1, La;->fe:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, p0, Land;->B:I

    .line 264
    sget v1, La;->ff:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, p0, Land;->C:I

    .line 265
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Land;->x:Landroid/os/Handler;

    .line 266
    sget v1, La;->fh:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, p0, Land;->D:I

    .line 267
    sget v1, La;->fi:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, p0, Land;->E:I

    .line 268
    sget v1, La;->fg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Land;->F:I

    .line 6077
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 271
    invoke-virtual {v0, v6}, Lmj;->b(Z)V

    .line 273
    if-eqz p1, :cond_7

    .line 274
    const-string v0, "viewIndex"

    invoke-virtual {p1, v0, v7}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 275
    if-ne v0, v6, :cond_b

    .line 278
    :goto_3
    iput v7, p0, Land;->f:I

    .line 280
    :cond_7
    iget-object v0, p0, Land;->s:Landroid/widget/ViewFlipper;

    iget v1, p0, Land;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 281
    return-void

    :cond_8
    move v0, v7

    .line 252
    goto/16 :goto_0

    .line 257
    :cond_9
    iget-object v3, p0, Land;->n:Lbfs;

    .line 5130
    iget-object v3, v3, Lbfs;->a:Ljava/lang/String;

    goto :goto_1

    .line 258
    :cond_a
    sget v4, Lbew;->a:I

    goto :goto_2

    :cond_b
    move v7, v0

    goto :goto_3
.end method

.method public final a(Laop;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 506
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->d()Lbkg;

    move-result-object v0

    .line 507
    if-eqz v0, :cond_3

    iget-object v1, p0, Land;->i:Lbdf;

    .line 6743
    iget-object v1, v1, Lbdf;->U:Lbcv;

    .line 507
    if-eqz v1, :cond_3

    .line 508
    iget-object v1, p0, Land;->i:Lbdf;

    .line 7743
    iget-object v1, v1, Lbdf;->U:Lbcv;

    .line 8025
    iget-object v1, v1, Lbcv;->a:Ljava/lang/String;

    .line 509
    iget-object v2, p0, Land;->i:Lbdf;

    .line 8754
    iget-object v2, v2, Lbdf;->V:[Ljava/lang/String;

    .line 509
    invoke-virtual {v0, v1, v2}, Lbkg;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/security/cert/X509Certificate;

    move-result-object v0

    .line 511
    if-eqz v0, :cond_3

    .line 512
    iget-object v1, p0, Land;->i:Lbdf;

    .line 513
    invoke-static {v1, v0}, La;->a(Lbdf;Ljava/security/cert/X509Certificate;)Lbde;

    move-result-object v0

    .line 516
    iget-object v1, v0, Lbde;->c:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 517
    iget-object v1, v0, Lbde;->c:Ljava/lang/String;

    iput-object v1, p0, Land;->q:Ljava/lang/String;

    .line 519
    :cond_0
    iget-boolean v1, v0, Lbde;->a:Z

    if-eqz v1, :cond_2

    .line 521
    invoke-interface {p1}, Laop;->a()V

    .line 564
    :cond_1
    :goto_0
    return-void

    .line 525
    :cond_2
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    const-string v2, "Could not authenticate device"

    invoke-virtual {v1, v2}, Lcom/google/android/apps/chromecast/app/SetupApplication;->c(Ljava/lang/String;)V

    .line 527
    new-array v1, v4, [Ljava/lang/Object;

    iget-object v0, v0, Lbde;->b:Ljava/lang/String;

    aput-object v0, v1, v5

    .line 530
    :cond_3
    invoke-virtual {p0}, Land;->w()V

    .line 531
    invoke-virtual {p0}, Land;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 534
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lb;->an:I

    .line 535
    invoke-virtual {p0, v1}, Land;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    sget v3, Lb;->dF:I

    .line 536
    invoke-virtual {p0, v3}, Land;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v5

    sget v3, Lb;->dG:I

    .line 537
    invoke-virtual {p0, v3}, Land;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    .line 535
    invoke-static {p0, v1, v2}, Lblx;->a(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->I:I

    new-instance v2, Laom;

    invoke-direct {v2, p0}, Laom;-><init>(Land;)V

    .line 538
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 544
    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Laol;

    invoke-direct {v1, p0}, Laol;-><init>(Land;)V

    .line 545
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 551
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->f()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 553
    sget v1, Lb;->dW:I

    new-instance v2, Laon;

    invoke-direct {v2, p0, p1}, Laon;-><init>(Land;Laop;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 563
    :cond_4
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method public final a(Lbdm;Laop;ZZ)V
    .locals 4

    .prologue
    .line 405
    new-instance v1, Lapd;

    iget-boolean v0, p0, Land;->O:Z

    if-eqz v0, :cond_1

    .line 406
    const/16 v0, 0x12

    .line 407
    :goto_0
    invoke-direct {v1, v0}, Lapd;-><init>(I)V

    .line 408
    invoke-virtual {p0}, Land;->A()Laph;

    move-result-object v0

    .line 6115
    iput-object v0, v1, Lapd;->h:Laph;

    .line 410
    const/16 v0, 0x27ee

    .line 420
    if-eqz p3, :cond_0

    .line 421
    const/16 v0, 0x37ee

    .line 424
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    new-instance v3, Laoi;

    invoke-direct {v3, p0, v1, p2}, Laoi;-><init>(Land;Lapd;Laop;)V

    invoke-virtual {p1, v0, v2, p4, v3}, Lbdm;->a(ILjava/util/Locale;ZLbdn;)V

    .line 448
    return-void

    .line 407
    :cond_1
    const/16 v0, 0x24

    goto :goto_0
.end method

.method public final a(Lbdm;Ljava/lang/String;Laop;)V
    .locals 2

    .prologue
    .line 452
    new-instance v1, Lapd;

    iget-boolean v0, p0, Land;->O:Z

    if-eqz v0, :cond_0

    .line 453
    const/16 v0, 0x34

    .line 454
    :goto_0
    invoke-direct {v1, v0}, Lapd;-><init>(I)V

    .line 455
    new-instance v0, Laoj;

    invoke-direct {v0, p0, v1, p3}, Laoj;-><init>(Land;Lapd;Laop;)V

    invoke-virtual {p1, p0, p2, v0}, Lbdm;->a(Landroid/content/Context;Ljava/lang/String;Lbdn;)V

    .line 473
    return-void

    .line 454
    :cond_0
    const/16 v0, 0x35

    goto :goto_0
.end method

.method public final a(Lbdm;Ljava/util/HashMap;Lbfs;Laop;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 872
    new-instance v0, Lazg;

    iget-object v1, p0, Land;->h:Ljava/lang/String;

    iget-boolean v2, p0, Land;->O:Z

    .line 873
    invoke-virtual {p0}, Land;->A()Laph;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lazg;-><init>(Ljava/lang/String;ZLaph;)V

    iput-object v0, p0, Land;->G:Lazg;

    .line 874
    iget-object v0, p0, Land;->G:Lazg;

    .line 14070
    iput-object p2, v0, Lazg;->d:Ljava/util/HashMap;

    .line 875
    iget-boolean v0, p0, Land;->O:Z

    if-eqz v0, :cond_0

    .line 878
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    iget-object v1, p0, Land;->G:Lazg;

    .line 14486
    iput-object v1, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->g:Lazg;

    .line 880
    :cond_0
    iput-object p1, p0, Land;->J:Lbdm;

    .line 881
    iput-object p4, p0, Land;->K:Laop;

    .line 882
    iput-boolean v5, p0, Land;->u:Z

    .line 884
    if-eqz p3, :cond_2

    .line 888
    iput-object p3, p0, Land;->I:Lbfs;

    .line 890
    new-instance v0, Lbfs;

    invoke-direct {v0, p3}, Lbfs;-><init>(Lbfs;)V

    iput-object v0, p0, Land;->H:Lbfs;

    .line 891
    iget-object v0, p0, Land;->H:Lbfs;

    .line 15138
    iget-object v0, v0, Lbfs;->b:Lbfu;

    .line 891
    iget-boolean v0, v0, Lbfu;->k:Z

    if-eqz v0, :cond_1

    .line 893
    :try_start_0
    iget-object v0, p0, Land;->H:Lbfs;

    .line 15162
    iget-object v0, v0, Lbfs;->e:Ljava/lang/String;

    .line 894
    iget-object v1, p0, Land;->i:Lbdf;

    .line 15403
    iget-object v1, v1, Lbdf;->r:Ljava/lang/String;

    .line 893
    invoke-static {v0, v1}, Lbfs;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 896
    iget-object v1, p0, Land;->H:Lbfs;

    .line 16158
    iput-object v0, v1, Lbfs;->e:Ljava/lang/String;

    .line 897
    iget-object v0, p0, Land;->H:Lbfs;

    .line 16166
    const/4 v1, 0x1

    iput-boolean v1, v0, Lbfs;->f:Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 906
    :cond_1
    iget-object v0, p0, Land;->n:Lbfs;

    if-nez v0, :cond_3

    .line 909
    iput-boolean v4, p0, Land;->L:Z

    .line 930
    :cond_2
    :goto_0
    invoke-direct {p0}, Land;->g()V

    .line 931
    :goto_1
    return-void

    .line 898
    :catch_0
    move-exception v0

    .line 899
    iget-object v1, p0, Land;->t:Lblp;

    const-string v2, "Failed to encrypt password"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lblp;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 900
    sget v0, Lb;->bu:I

    invoke-virtual {p0, v0}, Land;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Land;->e(Ljava/lang/String;)V

    goto :goto_1

    .line 17130
    :cond_3
    iget-object v0, p3, Lbfs;->a:Ljava/lang/String;

    .line 910
    iget-object v1, p0, Land;->n:Lbfs;

    .line 18130
    iget-object v1, v1, Lbfs;->a:Ljava/lang/String;

    .line 910
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 911
    iput-boolean v4, p0, Land;->L:Z

    .line 912
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lb;->ed:I

    .line 913
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->ec:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Land;->n:Lbfs;

    .line 19130
    iget-object v3, v3, Lbfs;->a:Ljava/lang/String;

    .line 915
    aput-object v3, v2, v5

    .line 20130
    iget-object v3, p3, Lbfs;->a:Ljava/lang/String;

    .line 915
    aput-object v3, v2, v4

    .line 914
    invoke-virtual {p0, v1, v2}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->I:I

    new-instance v2, Lanl;

    invoke-direct {v2, p0}, Lanl;-><init>(Land;)V

    .line 916
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->H:I

    const/4 v2, 0x0

    .line 922
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 923
    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 924
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_1

    .line 927
    :cond_4
    iput-boolean v5, p0, Land;->L:Z

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 825
    iget-object v0, p0, Land;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 826
    iget-object v0, p0, Land;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 827
    iget-object v0, p0, Land;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 829
    :cond_0
    iput-object p2, p0, Land;->v:Landroid/content/DialogInterface$OnCancelListener;

    .line 12188
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->f()V

    .line 831
    return-void
.end method

.method public final a(Ljava/util/HashMap;Laop;I)V
    .locals 4

    .prologue
    .line 612
    const/4 v0, -0x1

    if-eq p3, v0, :cond_0

    new-instance v0, Lapd;

    invoke-direct {v0, p3}, Lapd;-><init>(I)V

    .line 613
    :goto_0
    invoke-virtual {p0}, Land;->x()V

    .line 614
    iget-object v1, p0, Land;->p:Lbdu;

    iget-object v2, p0, Land;->i:Lbdf;

    new-instance v3, Lang;

    invoke-direct {v3, p0, v0, p2}, Lang;-><init>(Land;Lapd;Laop;)V

    invoke-virtual {v1, p1, v2, v3}, Lbdu;->a(Ljava/util/HashMap;Lbdf;Lbdn;)V

    .line 632
    return-void

    .line 612
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/view/MenuItem;Lbdm;Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v0, 0x1

    .line 1586
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    .line 1588
    const v2, 0x102002c

    if-ne v1, v2, :cond_0

    .line 1589
    invoke-virtual {p0}, Land;->finish()V

    .line 1608
    :goto_0
    return v0

    .line 1590
    :cond_0
    sget v2, Lf;->bR:I

    if-ne v1, v2, :cond_1

    .line 1591
    sget v1, Lbfk;->a:I

    sget v2, Lb;->aE:I

    new-array v3, v0, [Ljava/lang/Object;

    .line 27896
    iget-object v4, p0, Land;->i:Lbdf;

    .line 28254
    iget-object v4, v4, Lbdf;->b:Ljava/lang/String;

    .line 1592
    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 1591
    invoke-direct {p0, p2, v1, v2, p3}, Land;->a(Lbdm;ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1593
    :cond_1
    sget v2, Lf;->bT:I

    if-ne v1, v2, :cond_2

    .line 1594
    sget v1, Lbfk;->b:I

    sget v2, Lb;->aF:I

    new-array v3, v0, [Ljava/lang/Object;

    .line 28896
    iget-object v4, p0, Land;->i:Lbdf;

    .line 29254
    iget-object v4, v4, Lbdf;->b:Ljava/lang/String;

    .line 1595
    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 1594
    invoke-direct {p0, p2, v1, v2, p3}, Land;->a(Lbdm;ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1596
    :cond_2
    sget v2, Lf;->bM:I

    if-ne v1, v2, :cond_3

    .line 29735
    sget v1, Lb;->bH:I

    invoke-virtual {p0, v1}, Land;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Land;->w:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {p0, v1, v2}, Land;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 29736
    invoke-virtual {p0}, Land;->x()V

    .line 29737
    new-instance v1, Laof;

    invoke-direct {v1, p0}, Laof;-><init>(Land;)V

    invoke-virtual {p2, v1}, Lbdm;->d(Lbdn;)V

    goto :goto_0

    .line 1598
    :cond_3
    sget v2, Lf;->bN:I

    if-ne v1, v2, :cond_4

    .line 1599
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    sget v3, Lb;->cH:I

    .line 1600
    invoke-virtual {p0, v3}, Land;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1599
    invoke-virtual {p0, v1}, Land;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 1601
    :cond_4
    sget v2, Lf;->bU:I

    if-ne v1, v2, :cond_5

    .line 1602
    invoke-virtual {p0}, Land;->b_()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {p0, v1}, Lbkq;->a(Landroid/app/Activity;Ljava/util/List;)V

    goto :goto_0

    .line 1603
    :cond_5
    sget v2, Lf;->bV:I

    if-ne v1, v2, :cond_6

    .line 1604
    invoke-static {p0, p0}, Lbkq;->a(Landroid/app/Activity;Lbaq;)V

    goto :goto_0

    .line 1606
    :cond_6
    invoke-super {p0, p1}, Lmm;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method public final a(Lbfs;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1618
    .line 30130
    iget-object v1, p1, Lbfs;->a:Ljava/lang/String;

    .line 1618
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1619
    sget v1, Lb;->bL:I

    invoke-virtual {p0, v1}, Land;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Land;->e(Ljava/lang/String;)V

    .line 1651
    :goto_0
    return v0

    .line 1622
    :cond_0
    sget-object v1, Laoh;->b:[I

    .line 30138
    iget-object v2, p1, Lbfs;->b:Lbfu;

    .line 1622
    invoke-virtual {v2}, Lbfu;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 1648
    sget v1, Lb;->cd:I

    invoke-virtual {p0, v1}, Land;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Land;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 30162
    :pswitch_0
    iget-object v1, p1, Lbfs;->e:Ljava/lang/String;

    .line 1628
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 31162
    iget-object v1, p1, Lbfs;->e:Ljava/lang/String;

    .line 1629
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x5

    if-ge v1, v2, :cond_3

    .line 1630
    :cond_1
    sget v1, Lb;->dX:I

    invoke-virtual {p0, v1}, Land;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Land;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 32162
    :pswitch_1
    iget-object v1, p1, Lbfs;->e:Ljava/lang/String;

    .line 1639
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 33162
    iget-object v1, p1, Lbfs;->e:Ljava/lang/String;

    .line 1640
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x8

    if-ge v1, v2, :cond_3

    .line 1641
    :cond_2
    sget v1, Lb;->ex:I

    invoke-virtual {p0, v1}, Land;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Land;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 1651
    :cond_3
    :pswitch_2
    const/4 v0, 0x1

    goto :goto_0

    .line 1622
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final b_()Ljava/util/ArrayList;
    .locals 6

    .prologue
    .line 1810
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1811
    new-instance v1, Lbko;

    .line 33896
    iget-object v2, p0, Land;->i:Lbdf;

    .line 34254
    iget-object v2, v2, Lbdf;->b:Ljava/lang/String;

    .line 1811
    iget-object v3, p0, Land;->i:Lbdf;

    .line 34258
    iget-object v3, v3, Lbdf;->c:Ljava/lang/String;

    .line 1811
    iget-object v4, p0, Land;->j:Ljava/lang/String;

    iget-object v5, p0, Land;->i:Lbdf;

    .line 34518
    iget-object v5, v5, Lbdf;->F:Ljava/lang/String;

    .line 1812
    invoke-direct {v1, v2, v3, v4, v5}, Lbko;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1811
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1813
    return-object v0
.end method

.method public e()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 1805
    const/4 v0, 0x0

    return-object v0
.end method

.method public final e(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1658
    .line 33667
    invoke-virtual {p0}, Land;->w()V

    .line 33668
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v3}, Land;->a(Ljava/lang/String;ZLaoo;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 33669
    if-eqz v0, :cond_0

    .line 33672
    sget v1, Lb;->I:I

    new-instance v2, Laod;

    invoke-direct {v2, p0, v3}, Laod;-><init>(Land;Laop;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 33680
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1659
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 845
    iget-object v0, p0, Land;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v0

    if-ne v0, v2, :cond_2

    .line 847
    iget-object v0, p0, Land;->y:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 848
    iget-object v0, p0, Land;->x:Landroid/os/Handler;

    iget-object v1, p0, Land;->y:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 850
    :cond_0
    iput-boolean v2, p0, Land;->u:Z

    .line 851
    invoke-virtual {p0}, Land;->v()V

    .line 852
    iget-object v0, p0, Land;->v:Landroid/content/DialogInterface$OnCancelListener;

    if-eqz v0, :cond_1

    .line 853
    iget-object v0, p0, Land;->v:Landroid/content/DialogInterface$OnCancelListener;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    .line 860
    :goto_0
    return-void

    .line 855
    :cond_1
    invoke-virtual {p0}, Land;->w()V

    goto :goto_0

    .line 858
    :cond_2
    invoke-super {p0}, Lmm;->onBackPressed()V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 217
    invoke-super {p0, p1}, Lmm;->onCreate(Landroid/os/Bundle;)V

    .line 218
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 333
    invoke-static {p1}, Lblx;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 334
    const/4 v0, 0x1

    .line 336
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lmm;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 341
    invoke-static {p1, p0}, Lblx;->a(ILm;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 342
    const/4 v0, 0x1

    .line 344
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lmm;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 320
    invoke-super {p0}, Lmm;->onPause()V

    .line 321
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 286
    iget-object v0, p0, Land;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v0

    if-eq v0, v1, :cond_0

    move v0, v1

    .line 287
    :goto_0
    sget v2, Lf;->bR:I

    invoke-static {p1, v2, v0}, Land;->a(Landroid/view/Menu;IZ)V

    .line 288
    sget v2, Lf;->bT:I

    invoke-static {p1, v2, v0}, Land;->a(Landroid/view/Menu;IZ)V

    .line 289
    sget v2, Lf;->bM:I

    invoke-static {p1, v2, v0}, Land;->a(Landroid/view/Menu;IZ)V

    .line 290
    sget v2, Lf;->bN:I

    invoke-static {p1, v2, v0}, Land;->a(Landroid/view/Menu;IZ)V

    .line 291
    sget v0, Lf;->bU:I

    invoke-static {}, Lbkq;->a()Z

    move-result v2

    invoke-static {p1, v0, v2}, Land;->a(Landroid/view/Menu;IZ)V

    .line 292
    return v1

    .line 286
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 308
    invoke-super {p0, p1}, Lmm;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 309
    const-string v0, "device"

    iget-object v1, p0, Land;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    const-string v0, "deviceIpAddress"

    iget-object v1, p0, Land;->j:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    const-string v0, "deviceConfiguration"

    iget-object v1, p0, Land;->i:Lbdf;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 312
    const-string v0, "wifiDeviceIp"

    iget-object v1, p0, Land;->k:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    const-string v0, "androidNetwork"

    iget-object v1, p0, Land;->n:Lbfs;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 314
    const-string v0, "viewIndex"

    iget v1, p0, Land;->f:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 315
    const-string v0, "scannedNetworks"

    iget-object v1, p0, Land;->r:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 316
    return-void
.end method

.method public onStop()V
    .locals 1

    .prologue
    .line 325
    invoke-super {p0}, Lmm;->onStop()V

    .line 326
    const/4 v0, 0x1

    iput-boolean v0, p0, Land;->u:Z

    .line 327
    invoke-virtual {p0}, Land;->v()V

    .line 328
    iget-object v0, p0, Land;->z:Lazv;

    invoke-virtual {v0}, Lazv;->a()V

    .line 329
    return-void
.end method

.method public final t()Z
    .locals 1

    .prologue
    .line 638
    .line 9643
    iget-object v0, p0, Land;->r:Ljava/util/ArrayList;

    .line 638
    if-eqz v0, :cond_0

    .line 10643
    iget-object v0, p0, Land;->r:Ljava/util/ArrayList;

    .line 638
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final u()Ljava/util/List;
    .locals 1

    .prologue
    .line 643
    iget-object v0, p0, Land;->r:Ljava/util/ArrayList;

    return-object v0
.end method

.method public v()V
    .locals 4

    .prologue
    .line 818
    iget-object v0, p0, Land;->p:Lbdu;

    .line 11755
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, v0, Lbdu;->b:J

    .line 819
    return-void
.end method

.method public final w()V
    .locals 2

    .prologue
    .line 837
    iget-object v0, p0, Land;->s:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 838
    iget-object v0, p0, Land;->s:Landroid/widget/ViewFlipper;

    iget v1, p0, Land;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 13188
    invoke-virtual {p0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->f()V

    .line 841
    :cond_0
    return-void
.end method

.method public final x()V
    .locals 2

    .prologue
    .line 1786
    invoke-virtual {p0}, Land;->getRequestedOrientation()I

    move-result v0

    iput v0, p0, Land;->N:I

    .line 1787
    invoke-static {p0}, Lblx;->c(Landroid/app/Activity;)I

    move-result v0

    .line 1788
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1789
    invoke-virtual {p0, v0}, Land;->setRequestedOrientation(I)V

    .line 1791
    :cond_0
    invoke-virtual {p0}, Land;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 1792
    return-void
.end method

.method public final y()V
    .locals 2

    .prologue
    .line 1799
    iget v0, p0, Land;->N:I

    invoke-virtual {p0, v0}, Land;->setRequestedOrientation(I)V

    .line 1800
    invoke-virtual {p0}, Land;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 1801
    return-void
.end method

.method public final z()Lbdu;
    .locals 1

    .prologue
    .line 1833
    iget-object v0, p0, Land;->p:Lbdu;

    return-object v0
.end method
