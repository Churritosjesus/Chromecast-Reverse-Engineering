.class public final Lash;
.super Lj;
.source "PG"

# interfaces
.implements Lasg;


# instance fields
.field public Z:Ldbt;

.field final a:Latc;

.field private aa:Lblp;

.field private final ab:Landroid/os/Handler;

.field private ac:J

.field private ad:Latw;

.field private ae:Ljava/lang/String;

.field private af:Ljava/lang/String;

.field private ag:Ljava/lang/String;

.field private ah:Ldbr;

.field private ai:Ljava/lang/String;

.field private final aj:Ljava/lang/Runnable;

.field private final ak:Ljava/util/List;

.field public b:Z

.field c:Latf;

.field public d:Lasb;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 130
    invoke-direct {p0}, Lj;-><init>()V

    .line 93
    new-instance v0, Lasi;

    invoke-direct {v0, p0}, Lasi;-><init>(Lash;)V

    iput-object v0, p0, Lash;->aj:Ljava/lang/Runnable;

    .line 128
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lash;->ak:Ljava/util/List;

    .line 131
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lash;->ab:Landroid/os/Handler;

    .line 132
    new-instance v0, Latc;

    invoke-direct {v0}, Latc;-><init>()V

    iput-object v0, p0, Lash;->a:Latc;

    .line 133
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lash;
    .locals 3

    .prologue
    .line 140
    new-instance v0, Lash;

    invoke-direct {v0}, Lash;-><init>()V

    .line 141
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 142
    const-string v2, "backdropAppDeviceId"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    const-string v2, "deviceName"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const-string v2, "deviceType"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    const-string v2, "backdropDeviceCert"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    invoke-virtual {v0, v1}, Lash;->f(Landroid/os/Bundle;)V

    .line 147
    return-object v0
.end method

.method private a(IJLasp;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 391
    .line 21612
    iget-object v1, p0, Lj;->y:Lm;

    .line 391
    if-ne p1, v2, :cond_1

    .line 393
    sget v0, Lb;->Z:I

    .line 391
    :goto_0
    invoke-virtual {v1, v0}, Lm;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 395
    invoke-direct {p0, v0}, Lash;->c(Ljava/lang/String;)V

    .line 398
    iget-object v0, p0, Lash;->ad:Latw;

    invoke-virtual {v0, p2, p3}, Latw;->a(J)V

    .line 399
    invoke-virtual {p0, v2}, Lash;->b(I)V

    .line 400
    if-eqz p4, :cond_0

    .line 401
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 402
    invoke-interface {p4}, Lasp;->l()V

    .line 407
    :cond_0
    :goto_1
    return-void

    .line 394
    :cond_1
    sget v0, Lb;->al:I

    goto :goto_0

    .line 404
    :cond_2
    invoke-interface {p4}, Lasp;->j()V

    goto :goto_1
.end method

.method static synthetic a(Lash;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lash;->u()V

    return-void
.end method

.method static synthetic a(Lash;IJLasp;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Lash;->a(IJLasp;)V

    return-void
.end method

.method static synthetic a(Lash;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lash;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lash;Z)Z
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x1

    iput-boolean v0, p0, Lash;->b:Z

    return v0
.end method

.method static synthetic b(Lash;)Latw;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lash;->ad:Latw;

    return-object v0
.end method

.method static synthetic c(Lash;)Ldbt;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lash;->Z:Ldbt;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 636
    .line 25612
    iget-object v0, p0, Lj;->y:Lm;

    .line 636
    new-instance v1, Laso;

    invoke-direct {v1, p0, p1}, Laso;-><init>(Lash;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lm;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 642
    return-void
.end method

.method static synthetic d(Lash;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lash;->ai:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lash;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lash;->v()V

    return-void
.end method

.method static synthetic f(Lash;)Latc;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lash;->a:Latc;

    return-object v0
.end method

.method private u()V
    .locals 6

    .prologue
    .line 612
    iget-object v0, p0, Lash;->ad:Latw;

    .line 25270
    iget-object v1, p0, Lash;->c:Latf;

    .line 612
    new-instance v2, Lasn;

    invoke-direct {v2, p0}, Lasn;-><init>(Lash;)V

    invoke-virtual {v0, v1, v2}, Latw;->c(Latf;Lauo;)V

    .line 630
    iget-object v0, p0, Lash;->ab:Landroid/os/Handler;

    iget-object v1, p0, Lash;->aj:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 631
    iget-wide v0, p0, Lash;->ac:J

    long-to-double v0, v0

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    const-wide/high16 v4, 0x3fe8000000000000L    # 0.75

    add-double/2addr v2, v4

    mul-double/2addr v0, v2

    double-to-int v0, v0

    int-to-long v0, v0

    .line 632
    iget-object v2, p0, Lash;->ab:Landroid/os/Handler;

    iget-object v3, p0, Lash;->aj:Ljava/lang/Runnable;

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 633
    return-void
.end method

.method private v()V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 672
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b()Lalm;

    move-result-object v0

    iget-object v1, p0, Lash;->ae:Ljava/lang/String;

    .line 673
    invoke-virtual {v0, v1}, Lalm;->b(Ljava/lang/String;)Laow;

    move-result-object v0

    .line 675
    if-nez v0, :cond_1

    .line 687
    :cond_0
    :goto_0
    return-void

    .line 680
    :cond_1
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    .line 26439
    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/SetupApplication;->j:Lass;

    .line 680
    invoke-virtual {v1, v0}, Lass;->a(Laow;)Laqj;

    move-result-object v1

    .line 681
    if-eqz v1, :cond_2

    .line 27377
    sget-object v0, Laqj;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 27378
    new-array v0, v3, [Ljava/lang/Object;

    iget-object v2, v1, Laqj;->b:Laow;

    invoke-virtual {v2}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v4

    .line 27379
    const-string v0, "urn:x-cast:com.google.cast.sse"

    sget-object v2, Laqj;->c:Ljava/lang/String;

    new-instance v3, Laqt;

    invoke-direct {v3, v1}, Laqt;-><init>(Laqj;)V

    invoke-virtual {v1, v0, v2, v3}, Laqj;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V

    goto :goto_0

    .line 684
    :cond_2
    iget-object v1, p0, Lash;->aa:Lblp;

    const-string v2, "Settings updated for %s, but couldn\'t send the refresh request."

    new-array v3, v3, [Ljava/lang/Object;

    .line 685
    invoke-virtual {v0}, Laow;->g()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    .line 684
    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(ILjava/lang/String;)Ljava/util/List;
    .locals 1

    .prologue
    .line 468
    iget-object v0, p0, Lash;->a:Latc;

    invoke-virtual {v0, p1, p2}, Latc;->a(ILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 2

    .prologue
    .line 174
    invoke-super {p0}, Lj;->a()V

    .line 175
    iget-object v0, p0, Lash;->c:Latf;

    .line 1147
    const/4 v1, 0x0

    iput-object v1, v0, Latf;->c:Lj;

    .line 176
    return-void
.end method

.method public final a(IIIZILjava/lang/String;I)V
    .locals 17

    .prologue
    .line 425
    new-instance v15, Lasl;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Lasl;-><init>(Lash;)V

    .line 441
    move-object/from16 v0, p0

    iget-object v0, v0, Lash;->c:Latf;

    move-object/from16 v16, v0

    new-instance v4, Lauh;

    move-object/from16 v0, p0

    iget-object v5, v0, Lash;->ag:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v6, v0, Lash;->ae:Ljava/lang/String;

    const/16 v7, 0x64

    if-eqz p4, :cond_0

    .line 443
    const/4 v10, 0x0

    .line 444
    :goto_0
    new-instance v14, Lasm;

    move-object/from16 v0, p0

    move/from16 v1, p4

    move/from16 v2, p5

    move-object/from16 v3, p6

    invoke-direct {v14, v0, v1, v2, v3}, Lasm;-><init>(Lash;ZILjava/lang/String;)V

    move/from16 v8, p2

    move/from16 v9, p3

    move-object/from16 v11, p6

    move/from16 v12, p5

    move/from16 v13, p7

    invoke-direct/range {v4 .. v15}, Lauh;-><init>(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;IILaea;Ladz;)V

    .line 441
    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Latf;->a(Lads;)V

    .line 465
    return-void

    .line 444
    :cond_0
    move-object/from16 v0, p0

    iget-object v8, v0, Lash;->a:Latc;

    move/from16 v0, p5

    move-object/from16 v1, p6

    invoke-virtual {v8, v0, v1}, Latc;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_0
.end method

.method public final a(IILandroid/content/Intent;)V
    .locals 4

    .prologue
    const/16 v0, 0x3e8

    .line 599
    if-ne p1, v0, :cond_3

    .line 600
    iget-object v1, p0, Lash;->c:Latf;

    .line 24493
    if-ne p1, v0, :cond_0

    .line 24494
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 24497
    invoke-virtual {v1}, Latf;->a()V

    .line 604
    :cond_0
    :goto_0
    return-void

    .line 24501
    :cond_1
    iget-object v2, v1, Latf;->k:Ljava/util/ArrayList;

    monitor-enter v2

    .line 24502
    :try_start_0
    iget-object v0, v1, Latf;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 24503
    monitor-exit v2

    goto :goto_0

    .line 24507
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 24505
    :cond_2
    :try_start_1
    iget-object v0, v1, Latf;->k:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Latb;

    .line 24506
    iget-object v1, v1, Latf;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 24507
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24508
    if-eqz v0, :cond_0

    .line 24509
    new-instance v1, Ladf;

    const-string v2, "no permission granted"

    invoke-direct {v1, v2}, Ladf;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Latb;->b(Laef;)V

    goto :goto_0

    .line 602
    :cond_3
    invoke-super {p0, p1, p2, p3}, Lj;->a(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public a(ILdbt;Lasp;)V
    .locals 20

    .prologue
    .line 326
    const/4 v4, 0x1

    new-array v4, v4, [Ldbt;

    .line 327
    const/4 v5, 0x0

    aput-object p2, v4, v5

    .line 329
    new-instance v17, Ldcg;

    invoke-direct/range {v17 .. v17}, Ldcg;-><init>()V

    .line 330
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v0, v17

    iput-object v5, v0, Ldcg;->a:Ljava/lang/Integer;

    .line 331
    move-object/from16 v0, v17

    iput-object v4, v0, Ldcg;->c:[Ldbt;

    .line 334
    move-object/from16 v0, p0

    iget-object v4, v0, Lash;->ad:Latw;

    invoke-virtual {v4}, Latw;->a()J

    move-result-wide v8

    .line 336
    :try_start_0
    move-object/from16 v0, p0

    iget-object v4, v0, Lash;->c:Latf;

    new-instance v18, Lauf;

    move-object/from16 v0, p0

    iget-object v0, v0, Lash;->ag:Ljava/lang/String;

    move-object/from16 v19, v0

    new-instance v5, Lasj;

    move-object/from16 v6, p0

    move/from16 v7, p1

    move-object/from16 v10, p3

    move-object/from16 v11, p2

    invoke-direct/range {v5 .. v11}, Lasj;-><init>(Lash;IJLasp;Ldbt;)V

    new-instance v11, Lask;

    move-object/from16 v12, p0

    move/from16 v13, p1

    move-wide v14, v8

    move-object/from16 v16, p3

    invoke-direct/range {v11 .. v16}, Lask;-><init>(Lash;IJLasp;)V

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    move-object/from16 v2, v17

    invoke-direct {v0, v1, v2, v5, v11}, Lauf;-><init>(Ljava/lang/String;Ldcg;Laea;Ladz;)V

    move-object/from16 v0, v18

    invoke-virtual {v4, v0}, Latf;->a(Lads;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 385
    :goto_0
    return-void

    .line 381
    :catch_0
    move-exception v4

    .line 382
    move-object/from16 v0, p0

    iget-object v5, v0, Lash;->aa:Lblp;

    const-string v6, "Could not serialize device link data: %s"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v4, v7, v10

    invoke-virtual {v5, v6, v7}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p3

    invoke-direct {v0, v1, v8, v9, v2}, Lash;->a(IJLasp;)V

    goto :goto_0
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 167
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 168
    invoke-static {p1}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v0

    iput-object v0, p0, Lash;->c:Latf;

    .line 169
    iget-object v0, p0, Lash;->c:Latf;

    .line 1143
    iput-object p0, v0, Latf;->c:Lj;

    .line 170
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v2, 0x0

    .line 180
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 182
    invoke-virtual {p0, v8}, Lash;->c(Z)V

    .line 184
    new-instance v0, Lblp;

    const-string v1, "BackdropStorage"

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lash;->aa:Lblp;

    .line 185
    new-instance v0, Latw;

    .line 1612
    iget-object v1, p0, Lj;->y:Lm;

    .line 185
    invoke-direct {v0, v1}, Latw;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lash;->ad:Latw;

    .line 2612
    iget-object v0, p0, Lj;->y:Lm;

    .line 186
    invoke-static {v0}, Lblf;->v(Landroid/content/Context;)J

    move-result-wide v0

    iput-wide v0, p0, Lash;->ac:J

    .line 3612
    iget-object v0, p0, Lj;->y:Lm;

    .line 187
    invoke-static {v0}, Lblf;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lash;->ag:Ljava/lang/String;

    .line 4559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 189
    if-eqz v0, :cond_0

    .line 5559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 189
    const-string v1, "castDeviceUserInfo"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 190
    new-instance v0, Ldbr;

    invoke-direct {v0}, Ldbr;-><init>()V

    iput-object v0, p0, Lash;->ah:Ldbr;

    .line 6559
    :try_start_0
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 193
    const-string v1, "castDeviceUserInfo"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    .line 7125
    new-instance v1, Ldbr;

    invoke-direct {v1}, Ldbr;-><init>()V

    invoke-static {v1, v0}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldbr;

    .line 192
    iput-object v0, p0, Lash;->ah:Ldbr;

    .line 194
    iget-object v0, p0, Lash;->ah:Ldbr;

    iget-object v0, v0, Ldbr;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lash;->ah:Ldbr;

    iget-object v0, v0, Ldbr;->b:Ljava/lang/String;

    .line 195
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 196
    iget-object v0, p0, Lash;->ah:Ldbr;

    iget-object v0, v0, Ldbr;->b:Ljava/lang/String;

    iput-object v0, p0, Lash;->ae:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7559
    :cond_0
    :goto_0
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 203
    if-eqz v0, :cond_1

    .line 8559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 203
    const-string v1, "backdropAppDeviceId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 204
    const-string v1, "backdropAppDeviceId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lash;->ae:Ljava/lang/String;

    .line 10559
    :cond_1
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 207
    if-eqz v0, :cond_2

    .line 11559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 207
    const-string v1, "backdropDeviceCert"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 12559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 208
    const-string v1, "backdropDeviceCert"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lash;->af:Ljava/lang/String;

    .line 211
    :cond_2
    iget-object v0, p0, Lash;->ae:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 212
    new-instance v1, Lasb;

    new-instance v2, Latz;

    .line 12612
    iget-object v0, p0, Lj;->y:Lm;

    .line 213
    iget-object v3, p0, Lash;->ae:Ljava/lang/String;

    invoke-direct {v2, v0, v3}, Latz;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v3, p0, Lash;->c:Latf;

    .line 13612
    iget-object v0, p0, Lj;->y:Lm;

    .line 214
    invoke-static {v0}, Lblf;->t(Landroid/content/Context;)J

    move-result-wide v4

    iget-wide v6, p0, Lash;->ac:J

    invoke-direct/range {v1 .. v7}, Lasb;-><init>(Latz;Latf;JJ)V

    iput-object v1, p0, Lash;->d:Lasb;

    .line 217
    iget-object v0, p0, Lash;->ah:Ldbr;

    if-nez v0, :cond_6

    .line 218
    iget-object v0, p0, Lash;->ae:Ljava/lang/String;

    .line 14559
    iget-object v1, p0, Lj;->m:Landroid/os/Bundle;

    .line 219
    const-string v2, "deviceName"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lash;->af:Ljava/lang/String;

    .line 218
    invoke-static {v0, v1, v2}, Lasr;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ldbt;

    move-result-object v0

    iput-object v0, p0, Lash;->Z:Ldbt;

    .line 15559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 220
    const-string v1, "deviceType"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lash;->ai:Ljava/lang/String;

    .line 16240
    :cond_3
    :goto_1
    if-eqz p1, :cond_5

    .line 16241
    iget-object v0, p0, Lash;->ad:Latw;

    invoke-virtual {v0, p1}, Latw;->b(Landroid/os/Bundle;)V

    .line 16242
    iget-object v0, p0, Lash;->d:Lasb;

    if-eqz v0, :cond_4

    .line 16243
    iget-object v0, p0, Lash;->d:Lasb;

    .line 17110
    iget-object v0, v0, Lasb;->b:Latz;

    .line 16244
    invoke-virtual {v0, p1}, Latz;->b(Landroid/os/Bundle;)V

    .line 16246
    :cond_4
    invoke-virtual {p0, v8}, Lash;->b(I)V

    .line 228
    :cond_5
    return-void

    .line 199
    :catch_0
    move-exception v0

    iget-object v0, p0, Lash;->aa:Lblp;

    const-string v1, "Error deserializing UserDeviceAssociationRequest."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 222
    :cond_6
    iget-object v0, p0, Lash;->ah:Ldbr;

    iget-object v1, p0, Lash;->af:Ljava/lang/String;

    .line 223
    invoke-static {v0, v1}, Lasr;->a(Ldbr;Ljava/lang/String;)Ldbt;

    move-result-object v0

    iput-object v0, p0, Lash;->Z:Ldbt;

    .line 224
    iget-object v0, p0, Lash;->ah:Ldbr;

    iget-object v0, v0, Ldbr;->a:Ljava/lang/String;

    iput-object v0, p0, Lash;->ai:Ljava/lang/String;

    goto :goto_1
.end method

.method public final a(Lasq;)V
    .locals 1

    .prologue
    .line 581
    iget-object v0, p0, Lash;->ak:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 582
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Lasq;->a_(I)V

    .line 583
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Lasq;->a_(I)V

    .line 584
    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 294
    if-eqz p1, :cond_2

    iget-object v0, p0, Lash;->ad:Latw;

    .line 20194
    iget-object v0, v0, Latw;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Last;

    .line 21067
    iget-object v0, v0, Last;->b:Ljava/lang/String;

    .line 20196
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 295
    :goto_0
    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    return v0

    :cond_1
    move v0, v2

    .line 20200
    goto :goto_0

    :cond_2
    move v0, v2

    .line 295
    goto :goto_1
.end method

.method public final b(Ljava/lang/String;)Ldcj;
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 511
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 542
    :goto_0
    return-object v0

    .line 516
    :cond_0
    invoke-virtual {p0}, Lash;->t()Laur;

    move-result-object v0

    .line 24037
    iget-object v0, v0, Laur;->b:Ldcj;

    .line 517
    if-nez v0, :cond_1

    move-object v0, v1

    .line 519
    goto :goto_0

    .line 522
    :cond_1
    new-array v3, v7, [Ljava/lang/Object;

    aput-object v0, v3, v2

    .line 523
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 526
    invoke-interface {v3, v0}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    .line 527
    :cond_2
    invoke-interface {v3}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 528
    invoke-interface {v3}, Ljava/util/Deque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldcj;

    .line 529
    if-eqz v0, :cond_2

    .line 532
    iget-object v4, v0, Ldcj;->j:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v4, v0, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 533
    new-array v1, v7, [Ljava/lang/Object;

    aput-object v0, v1, v2

    goto :goto_0

    .line 536
    :cond_3
    iget-object v4, v0, Ldcj;->i:[Ldcj;

    array-length v5, v4

    move v0, v2

    :goto_1
    if-ge v0, v5, :cond_2

    aget-object v6, v4, v0

    .line 537
    invoke-interface {v3, v6}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    .line 536
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    move-object v0, v1

    .line 542
    goto :goto_0
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 592
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lash;->ak:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lasq;

    .line 593
    invoke-interface {v0, p1}, Lasq;->a_(I)V

    goto :goto_0

    .line 595
    :cond_0
    return-void
.end method

.method public final b(Lasq;)V
    .locals 1

    .prologue
    .line 587
    iget-object v0, p0, Lash;->ak:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 588
    return-void
.end method

.method public final d_()V
    .locals 1

    .prologue
    .line 646
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lash;->b(I)V

    .line 647
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lash;->b(I)V

    .line 649
    invoke-direct {p0}, Lash;->v()V

    .line 650
    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 232
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 233
    iget-object v0, p0, Lash;->ad:Latw;

    invoke-virtual {v0, p1}, Latw;->a(Landroid/os/Bundle;)V

    .line 234
    iget-object v0, p0, Lash;->d:Lasb;

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lash;->d:Lasb;

    .line 18110
    iget-object v0, v0, Lasb;->b:Latz;

    .line 235
    invoke-virtual {v0, p1}, Latz;->a(Landroid/os/Bundle;)V

    .line 237
    :cond_0
    return-void
.end method

.method public final e_()V
    .locals 0

    .prologue
    .line 654
    invoke-direct {p0}, Lash;->v()V

    .line 655
    return-void
.end method

.method public final f_()V
    .locals 1

    .prologue
    .line 659
    const/4 v0, 0x1

    iput-boolean v0, p0, Lash;->b:Z

    .line 660
    return-void
.end method

.method public final g_()V
    .locals 2

    .prologue
    .line 252
    invoke-super {p0}, Lj;->g_()V

    .line 254
    iget-object v0, p0, Lash;->d:Lasb;

    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Lash;->d:Lasb;

    .line 19086
    const/4 v1, 0x1

    iput-boolean v1, v0, Lasb;->i:Z

    .line 19087
    iput-object p0, v0, Lasb;->c:Lasg;

    .line 19088
    invoke-virtual {v0}, Lasb;->b()V

    .line 257
    :cond_0
    invoke-direct {p0}, Lash;->u()V

    .line 258
    return-void
.end method

.method public final h_()V
    .locals 3

    .prologue
    .line 262
    invoke-super {p0}, Lj;->h_()V

    .line 263
    iget-object v0, p0, Lash;->ab:Landroid/os/Handler;

    iget-object v1, p0, Lash;->aj:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 264
    iget-object v0, p0, Lash;->d:Lasb;

    if-eqz v0, :cond_0

    .line 265
    iget-object v0, p0, Lash;->d:Lasb;

    .line 19096
    const/4 v1, 0x0

    iput-boolean v1, v0, Lasb;->i:Z

    .line 19097
    const/4 v1, 0x0

    iput-object v1, v0, Lasb;->c:Lasg;

    .line 19098
    iget-object v1, v0, Lasb;->g:Landroid/os/Handler;

    iget-object v2, v0, Lasb;->h:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 19099
    iget-object v1, v0, Lasb;->g:Landroid/os/Handler;

    iget-object v2, v0, Lasb;->j:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 19104
    iget-object v1, v0, Lasb;->b:Latz;

    invoke-virtual {v1}, Latz;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Lasb;->e:Z

    if-nez v1, :cond_0

    .line 19105
    iget-object v0, v0, Lasb;->j:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 267
    :cond_0
    return-void
.end method

.method public final p()Ljava/util/List;
    .locals 1

    .prologue
    .line 275
    iget-object v0, p0, Lash;->ad:Latw;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lash;->ad:Latw;

    .line 20044
    iget-object v0, v0, Latw;->a:Ljava/util/List;

    goto :goto_0
.end method

.method public final q()Z
    .locals 1

    .prologue
    .line 279
    iget-object v0, p0, Lash;->ad:Latw;

    .line 20190
    iget-boolean v0, v0, Latw;->b:Z

    .line 279
    return v0
.end method

.method public final r()Z
    .locals 1

    .prologue
    .line 287
    iget-object v0, p0, Lash;->ae:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lash;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final s()Lauq;
    .locals 1

    .prologue
    .line 492
    iget-object v0, p0, Lash;->d:Lasb;

    if-eqz v0, :cond_0

    .line 493
    iget-object v0, p0, Lash;->d:Lasb;

    .line 22110
    iget-object v0, v0, Lasb;->b:Latz;

    .line 22140
    iget-object v0, v0, Latz;->a:Lauq;

    .line 495
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final t()Laur;
    .locals 1

    .prologue
    .line 499
    iget-object v0, p0, Lash;->d:Lasb;

    if-eqz v0, :cond_0

    .line 500
    iget-object v0, p0, Lash;->d:Lasb;

    .line 23110
    iget-object v0, v0, Lasb;->b:Latz;

    .line 23144
    iget-object v0, v0, Latz;->b:Laur;

    .line 502
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
