.class public final Lbdu;
.super Lbdm;
.source "PG"


# instance fields
.field a:Landroid/os/Handler;

.field public b:J

.field public d:Ljava/lang/String;

.field public final e:I

.field public f:Ljava/lang/String;

.field public g:Z

.field public h:Lazv;

.field private i:Lblp;

.field private final j:Laph;

.field private final k:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;ILaph;)V
    .locals 7

    .prologue
    .line 122
    .line 123
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    .line 122
    invoke-direct/range {v0 .. v6}, Lbdu;-><init>(Ljava/lang/String;ILjava/lang/String;ILaph;Ljava/util/concurrent/ExecutorService;)V

    .line 124
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;ILaph;Ljava/util/concurrent/ExecutorService;)V
    .locals 3

    .prologue
    .line 129
    invoke-direct {p0, p2}, Lbdm;-><init>(I)V

    .line 64
    new-instance v0, Lblp;

    const-string v1, "HttpDeviceConnector"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lbdu;->i:Lblp;

    .line 130
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lbdu;->a:Landroid/os/Handler;

    .line 131
    iput-object p1, p0, Lbdu;->d:Ljava/lang/String;

    .line 132
    iput-object p3, p0, Lbdu;->f:Ljava/lang/String;

    .line 133
    iput p4, p0, Lbdu;->e:I

    .line 134
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->l()Lazv;

    move-result-object v0

    iput-object v0, p0, Lbdu;->h:Lazv;

    .line 135
    iput-object p5, p0, Lbdu;->j:Laph;

    .line 136
    iput-object p6, p0, Lbdu;->k:Ljava/util/concurrent/ExecutorService;

    .line 137
    return-void
.end method

.method static synthetic a(Lbdu;Ljava/lang/String;JLbfp;ILbff;)V
    .locals 0

    .prologue
    .line 33
    invoke-virtual/range {p0 .. p6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 755
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lbdu;->b:J

    .line 756
    return-void
.end method

.method public final a(ILbdn;)V
    .locals 7

    .prologue
    .line 451
    invoke-virtual {p0}, Lbdu;->d()J

    move-result-wide v2

    .line 452
    new-instance v4, Lbfi;

    iget-object v0, p0, Lbdu;->d:Ljava/lang/String;

    invoke-direct {v4, v0, p1}, Lbfi;-><init>(Ljava/lang/String;I)V

    .line 453
    const-string v1, "reboot"

    iget v5, p0, Lbdu;->e:I

    new-instance v6, Lbey;

    invoke-direct {v6, p0, p2}, Lbey;-><init>(Lbdu;Lbdn;)V

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 454
    return-void
.end method

.method public final a(ILjava/util/Locale;ZLbdn;)V
    .locals 17

    .prologue
    .line 170
    invoke-virtual/range {p0 .. p0}, Lbdu;->d()J

    move-result-wide v8

    .line 171
    new-instance v6, Lbdq;

    move-object/from16 v0, p0

    iget-object v2, v0, Lbdu;->d:Ljava/lang/String;

    .line 1046
    move-object/from16 v0, p0

    iget v3, v0, Lbdm;->c:I

    .line 172
    move/from16 v0, p1

    invoke-direct {v6, v2, v0, v3}, Lbdq;-><init>(Ljava/lang/String;II)V

    .line 173
    if-eqz p2, :cond_0

    .line 174
    invoke-static/range {p2 .. p2}, Lblj;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 1077
    iput-object v2, v6, Lbdq;->b:Ljava/lang/String;

    .line 176
    :cond_0
    const-string v11, "getDeviceInfo"

    move-object/from16 v0, p0

    iget v15, v0, Lbdu;->e:I

    new-instance v3, Lbdv;

    move-object/from16 v4, p0

    move-object/from16 v5, p4

    move/from16 v7, p3

    move-object/from16 v10, p4

    invoke-direct/range {v3 .. v10}, Lbdv;-><init>(Lbdu;Lbdn;Lbdq;ZJLbdn;)V

    move-object/from16 v10, p0

    move-wide v12, v8

    move-object v14, v6

    move-object/from16 v16, v3

    invoke-virtual/range {v10 .. v16}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 189
    return-void
.end method

.method a(JLandroid/content/Context;Lbdn;)V
    .locals 11

    .prologue
    .line 384
    new-instance v0, Lbfm;

    iget-object v1, p0, Lbdu;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, Lbfm;-><init>(Ljava/lang/String;)V

    .line 385
    const-string v8, "scanNetworks"

    iget v9, p0, Lbdu;->e:I

    new-instance v1, Lbdz;

    move-object v2, p0

    move-object v3, p4

    move-wide v4, p1

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lbdz;-><init>(Lbdu;Lbdn;JLandroid/content/Context;Lbdn;)V

    move-object v2, p0

    move-object v3, v8

    move-wide v4, p1

    move-object v6, v0

    move v7, v9

    move-object v8, v1

    invoke-virtual/range {v2 .. v8}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 393
    return-void
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Lbdn;)V
    .locals 10

    .prologue
    .line 321
    invoke-virtual {p0}, Lbdu;->d()J

    move-result-wide v4

    .line 322
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 324
    invoke-virtual {p0, v4, v5, p1, p3}, Lbdu;->a(JLandroid/content/Context;Lbdn;)V

    .line 342
    :goto_0
    return-void

    .line 328
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 329
    const-string v1, "country_code"

    .line 330
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v2

    .line 4335
    iget-object v2, v2, Lcom/google/android/apps/chromecast/app/SetupApplication;->c:Ljava/lang/String;

    .line 329
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    new-instance v8, Lbfo;

    iget-object v1, p0, Lbdu;->d:Ljava/lang/String;

    const/4 v2, 0x0

    .line 5046
    iget v3, p0, Lbdm;->c:I

    .line 332
    invoke-direct {v8, v1, v2, v0, v3}, Lbfo;-><init>(Ljava/lang/String;Lbdf;Ljava/util/HashMap;I)V

    .line 333
    const-string v0, "setCountryCode"

    iget v9, p0, Lbdu;->e:I

    new-instance v1, Lbeu;

    move-object v2, p0

    move-object v3, p3

    move-object v6, p1

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Lbeu;-><init>(Lbdu;Lbdn;JLandroid/content/Context;Lbdn;)V

    move-object v2, p0

    move-object v3, v0

    move-object v6, v8

    move v7, v9

    move-object v8, v1

    invoke-virtual/range {v2 .. v8}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    goto :goto_0
.end method

.method public final a(Lbdn;)V
    .locals 7

    .prologue
    .line 240
    invoke-virtual {p0}, Lbdu;->d()J

    move-result-wide v2

    .line 241
    new-instance v4, Lbdq;

    iget-object v0, p0, Lbdu;->d:Ljava/lang/String;

    const/16 v1, 0xa0

    .line 2046
    iget v5, p0, Lbdm;->c:I

    .line 243
    invoke-direct {v4, v0, v1, v5}, Lbdq;-><init>(Ljava/lang/String;II)V

    .line 3042
    const/4 v0, 0x1

    iput v0, v4, Lbfp;->h:I

    .line 245
    const-string v1, "pollSetupState"

    iget v5, p0, Lbdu;->e:I

    new-instance v6, Lbeq;

    invoke-direct {v6, p0, p1, v4}, Lbeq;-><init>(Lbdu;Lbdn;Lbdq;)V

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 252
    return-void
.end method

.method public final a(Lbdn;I)V
    .locals 7

    .prologue
    .line 437
    invoke-virtual {p0}, Lbdu;->d()J

    move-result-wide v2

    .line 438
    new-instance v4, Lbfh;

    iget-object v0, p0, Lbdu;->d:Ljava/lang/String;

    invoke-direct {v4, v0, p2}, Lbfh;-><init>(Ljava/lang/String;I)V

    .line 445
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "playSound-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v5, p0, Lbdu;->e:I

    new-instance v6, Lbey;

    invoke-direct {v6, p0, p1}, Lbey;-><init>(Lbdu;Lbdn;)V

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 447
    return-void
.end method

.method a(Lbfp;Lbff;)V
    .locals 2

    .prologue
    .line 724
    iget-object v0, p0, Lbdu;->k:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lbem;

    invoke-direct {v1, p0, p1, p2}, Lbem;-><init>(Lbdu;Lbfp;Lbff;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 735
    return-void
.end method

.method public final a(Lbfs;Lbdn;)V
    .locals 7

    .prologue
    .line 458
    invoke-virtual {p0}, Lbdu;->d()J

    move-result-wide v2

    .line 459
    new-instance v4, Lbdd;

    iget-object v0, p0, Lbdu;->d:Ljava/lang/String;

    invoke-direct {v4, v0, p1}, Lbdd;-><init>(Ljava/lang/String;Lbfs;)V

    .line 460
    const-string v1, "connectToNetwork"

    iget v5, p0, Lbdu;->e:I

    new-instance v6, Lbey;

    invoke-direct {v6, p0, p2}, Lbey;-><init>(Lbdu;Lbdn;)V

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 462
    return-void
.end method

.method a(Ljava/lang/String;JLbfp;IIJLbff;)V
    .locals 16

    .prologue
    .line 566
    invoke-virtual/range {p0 .. p3}, Lbdu;->a(Ljava/lang/String;J)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6629
    :goto_0
    return-void

    .line 569
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    .line 570
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    .line 571
    new-instance v2, Lbeh;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v7, p9

    move-wide/from16 v8, p2

    move/from16 v10, p6

    move-object/from16 v11, p4

    move-wide/from16 v12, p7

    move/from16 v14, p5

    invoke-direct/range {v2 .. v14}, Lbeh;-><init>(Lbdu;Ljava/lang/String;JLbff;JILbfp;JI)V

    .line 6697
    sget-object v3, Lben;->a:[I

    add-int/lit8 v4, p5, -0x1

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    .line 6718
    const/4 v3, 0x1

    .line 6623
    :cond_1
    :goto_1
    if-eqz v3, :cond_8

    .line 6624
    move-object/from16 v0, p0

    move-object/from16 v1, p4

    invoke-virtual {v0, v1, v2}, Lbdu;->a(Lbfp;Lbff;)V

    goto :goto_0

    .line 6699
    :pswitch_0
    move-object/from16 v0, p0

    iget-object v3, v0, Lbdu;->f:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    move-object/from16 v0, p0

    iget-object v3, v0, Lbdu;->h:Lazv;

    move-object/from16 v0, p0

    iget-object v4, v0, Lbdu;->f:Ljava/lang/String;

    .line 7100
    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Lazv;->a(Ljava/lang/String;Z)Z

    move-result v3

    .line 6700
    if-eqz v3, :cond_3

    :cond_2
    const/4 v3, 0x1

    .line 6701
    :goto_2
    if-nez v3, :cond_1

    .line 6702
    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x1

    move-object/from16 v0, p0

    iget-object v6, v0, Lbdu;->f:Ljava/lang/String;

    aput-object v6, v4, v5

    goto :goto_1

    .line 6700
    :cond_3
    const/4 v3, 0x0

    goto :goto_2

    .line 6707
    :pswitch_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lbdu;->h:Lazv;

    .line 7139
    iget-object v4, v3, Lazv;->j:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 7140
    const/4 v3, 0x0

    .line 6707
    :goto_3
    if-nez v3, :cond_5

    const/4 v3, 0x1

    .line 6708
    :goto_4
    if-nez v3, :cond_1

    .line 6709
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    goto :goto_1

    .line 7142
    :cond_4
    iget-object v4, v3, Lazv;->j:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Lazv;->a(Ljava/lang/String;Z)Z

    move-result v3

    goto :goto_3

    .line 6707
    :cond_5
    const/4 v3, 0x0

    goto :goto_4

    .line 6714
    :pswitch_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lbdu;->f:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    move-object/from16 v0, p0

    iget-object v3, v0, Lbdu;->h:Lazv;

    move-object/from16 v0, p0

    iget-object v4, v0, Lbdu;->f:Ljava/lang/String;

    .line 8100
    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Lazv;->a(Ljava/lang/String;Z)Z

    move-result v3

    .line 6714
    if-eqz v3, :cond_7

    :cond_6
    const/4 v3, 0x1

    goto :goto_1

    :cond_7
    const/4 v3, 0x0

    goto :goto_1

    .line 6626
    :cond_8
    sget v3, Lbew;->d:I

    move/from16 v0, p5

    if-eq v0, v3, :cond_9

    .line 6628
    const/4 v3, -0x1

    invoke-interface {v2, v3}, Lbff;->a(I)V

    goto/16 :goto_0

    .line 6635
    :cond_9
    new-instance v6, Lapd;

    const/16 v3, 0x11

    invoke-direct {v6, v3}, Lapd;-><init>(I)V

    .line 6636
    move-object/from16 v0, p0

    iget-object v3, v0, Lbdu;->j:Laph;

    if-eqz v3, :cond_a

    .line 6637
    move-object/from16 v0, p0

    iget-object v3, v0, Lbdu;->j:Laph;

    .line 8115
    iput-object v3, v6, Lapd;->h:Laph;

    .line 6639
    :cond_a
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lbdu;->g:Z

    if-eqz v3, :cond_b

    .line 6640
    new-instance v3, Lbfs;

    invoke-direct {v3}, Lbfs;-><init>()V

    .line 6641
    move-object/from16 v0, p0

    iget-object v4, v0, Lbdu;->f:Ljava/lang/String;

    .line 8126
    iput-object v4, v3, Lbfs;->a:Ljava/lang/String;

    .line 6642
    sget-object v4, Lbfu;->b:Lbfu;

    .line 8134
    iput-object v4, v3, Lbfs;->b:Lbfu;

    .line 6643
    move-object/from16 v0, p0

    iget-object v4, v0, Lbdu;->h:Lazv;

    invoke-virtual {v4, v3}, Lazv;->a(Lbfs;)Landroid/net/wifi/WifiConfiguration;

    .line 6646
    :cond_b
    new-instance v10, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-direct {v10, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 6647
    move-object/from16 v0, p0

    iget-object v3, v0, Lbdu;->k:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Lbej;

    move-object/from16 v5, p0

    move-object/from16 v7, p1

    move-wide/from16 v8, p2

    move-object/from16 v11, p4

    move-object v12, v2

    invoke-direct/range {v4 .. v12}, Lbej;-><init>(Lbdu;Lapd;Ljava/lang/String;JLjava/util/concurrent/atomic/AtomicBoolean;Lbfp;Lbff;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto/16 :goto_0

    .line 6697
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public a(Ljava/lang/String;JLbfp;ILbff;)V
    .locals 10

    .prologue
    .line 554
    const/4 v6, 0x1

    const-wide/16 v7, 0xc8

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    move v5, p5

    move-object/from16 v9, p6

    invoke-virtual/range {v0 .. v9}, Lbdu;->a(Ljava/lang/String;JLbfp;IIJLbff;)V

    .line 555
    return-void
.end method

.method public final a(Ljava/util/HashMap;Lbdf;Lbdn;)V
    .locals 7

    .prologue
    .line 516
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 517
    :cond_0
    iget-object v0, p0, Lbdu;->a:Landroid/os/Handler;

    new-instance v1, Lbef;

    invoke-direct {v1, p0, p3}, Lbef;-><init>(Lbdu;Lbdn;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 530
    :goto_0
    return-void

    .line 525
    :cond_1
    invoke-virtual {p0}, Lbdu;->d()J

    move-result-wide v2

    .line 526
    new-instance v4, Lbfo;

    iget-object v0, p0, Lbdu;->d:Ljava/lang/String;

    .line 6046
    iget v1, p0, Lbdm;->c:I

    .line 527
    invoke-direct {v4, v0, p2, p1, v1}, Lbfo;-><init>(Ljava/lang/String;Lbdf;Ljava/util/HashMap;I)V

    .line 528
    const-string v1, "setDeviceInfo"

    iget v5, p0, Lbdu;->e:I

    new-instance v6, Lbey;

    invoke-direct {v6, p0, p3}, Lbey;-><init>(Lbdu;Lbdn;)V

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    goto :goto_0
.end method

.method a(Ljava/lang/String;J)Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 777
    iget-wide v4, p0, Lbdu;->b:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_1

    iget-wide v4, p0, Lbdu;->b:J

    cmp-long v0, p2, v4

    if-gez v0, :cond_1

    move v0, v1

    .line 778
    :goto_0
    if-eqz v0, :cond_0

    .line 779
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    .line 781
    :cond_0
    return v0

    :cond_1
    move v0, v2

    .line 777
    goto :goto_0
.end method

.method public final b(Lbdn;)V
    .locals 7

    .prologue
    const/4 v5, 0x1

    .line 271
    invoke-virtual {p0}, Lbdu;->d()J

    move-result-wide v2

    .line 272
    new-instance v4, Lbdq;

    iget-object v0, p0, Lbdu;->d:Ljava/lang/String;

    .line 3046
    iget v1, p0, Lbdm;->c:I

    .line 273
    invoke-direct {v4, v0, v5, v1}, Lbdq;-><init>(Ljava/lang/String;II)V

    .line 4042
    iput v5, v4, Lbfp;->h:I

    .line 4056
    iput-boolean v5, v4, Lbfp;->i:Z

    .line 277
    const-string v1, "refreshSetupState"

    sget v5, Lbew;->b:I

    new-instance v6, Lbey;

    invoke-direct {v6, p0, p1}, Lbey;-><init>(Lbdu;Lbdn;)V

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 279
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 740
    const/4 v0, 0x1

    return v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 745
    const/4 v0, 0x1

    return v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 766
    iget-object v0, p0, Lbdu;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 767
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No IP Address"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 769
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(Lbdn;)V
    .locals 7

    .prologue
    .line 424
    invoke-virtual {p0}, Lbdu;->d()J

    move-result-wide v2

    .line 425
    new-instance v4, Lbfb;

    iget-object v0, p0, Lbdu;->d:Ljava/lang/String;

    invoke-direct {v4, v0}, Lbfb;-><init>(Ljava/lang/String;)V

    .line 426
    const-string v1, "getLicense"

    iget v5, p0, Lbdu;->e:I

    new-instance v6, Lbec;

    invoke-direct {v6, p0, p1, v4}, Lbec;-><init>(Lbdu;Lbdn;Lbfb;)V

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 433
    return-void
.end method
