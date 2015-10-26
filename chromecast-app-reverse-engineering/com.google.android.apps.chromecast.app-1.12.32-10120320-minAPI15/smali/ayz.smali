.class public final Layz;
.super Lj;
.source "PG"


# instance fields
.field private final Z:Lblp;

.field public a:Lazf;

.field private aa:Lbae;

.field private ab:Layf;

.field private ac:Layq;

.field private ad:I

.field private final ae:Lalm;

.field private af:Lapd;

.field private ag:Landroid/os/Handler;

.field private ah:J

.field private ai:J

.field private aj:Z

.field private final ak:Ljava/lang/Runnable;

.field private final al:Ljava/lang/Runnable;

.field public b:Z

.field public c:Z

.field public d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 108
    invoke-direct {p0}, Lj;-><init>()V

    .line 36
    new-instance v0, Lblp;

    const-string v1, "SetupDeviceScanner"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Layz;->Z:Lblp;

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Layz;->ad:I

    .line 86
    new-instance v0, Laza;

    invoke-direct {v0, p0}, Laza;-><init>(Layz;)V

    iput-object v0, p0, Layz;->ak:Ljava/lang/Runnable;

    .line 96
    new-instance v0, Lazb;

    invoke-direct {v0, p0}, Lazb;-><init>(Layz;)V

    iput-object v0, p0, Layz;->al:Ljava/lang/Runnable;

    .line 109
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b()Lalm;

    move-result-object v0

    iput-object v0, p0, Layz;->ae:Lalm;

    .line 110
    return-void
.end method

.method static synthetic a(Layz;I)I
    .locals 0

    .prologue
    .line 34
    iput p1, p0, Layz;->ad:I

    return p1
.end method

.method static synthetic a(Layz;Laym;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 34
    .line 10384
    new-instance v0, Lbdq;

    .line 11073
    iget-object v1, p1, Laym;->b:Ljava/lang/String;

    .line 10385
    const/16 v2, 0x20ae

    invoke-direct {v0, v1, v2, v3}, Lbdq;-><init>(Ljava/lang/String;II)V

    .line 10393
    new-instance v1, Lbfe;

    const/4 v2, 0x1

    new-array v2, v2, [Lbfd;

    aput-object v0, v2, v3

    invoke-direct {v1, v2}, Lbfe;-><init>([Lbfd;)V

    .line 10394
    new-instance v2, Laze;

    invoke-direct {v2, p0, v0, p2, p1}, Laze;-><init>(Layz;Lbdq;ILaym;)V

    .line 12064
    iput-object v2, v1, Lbfe;->a:Lbff;

    .line 10425
    invoke-virtual {v1}, Lbfe;->a()V

    .line 34
    return-void
.end method

.method static synthetic a(Layz;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v2, 0x1

    .line 34
    .line 8347
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    const/4 v1, 0x7

    .line 8348
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 9300
    iget-wide v4, p0, Layz;->d:J

    .line 8349
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 8347
    invoke-virtual {v0, v1, v2, v3}, Lape;->a(ILjava/lang/Integer;Ljava/lang/Long;)V

    .line 8350
    iget-object v1, p0, Layz;->ae:Lalm;

    .line 9359
    iget-object v2, v1, Lalm;->h:Ljava/util/List;

    monitor-enter v2

    .line 9360
    :try_start_0
    iget-object v0, v1, Lalm;->i:Ljava/util/HashSet;

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9362
    iget-object v0, v1, Lalm;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 9363
    invoke-virtual {v0}, Laow;->m()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 9364
    invoke-virtual {v0}, Laow;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9365
    monitor-exit v2

    .line 9383
    :goto_0
    return-void

    .line 9369
    :cond_1
    new-instance v0, Laow;

    iget-object v3, v1, Lalm;->a:Lbkl;

    invoke-direct {v0, v3}, Laow;-><init>(Lbkl;)V

    .line 9370
    invoke-virtual {v1, v0}, Lalm;->d(Laow;)V

    .line 9371
    invoke-virtual {v0, p1, p2}, Laow;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 9372
    monitor-exit v2

    goto :goto_0

    .line 9374
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9376
    iget-object v2, v1, Lalm;->g:Ljava/util/List;

    monitor-enter v2

    .line 9377
    :try_start_2
    invoke-virtual {v1, p2}, Lalm;->d(Ljava/lang/String;)Laow;

    move-result-object v0

    .line 9378
    if-nez v0, :cond_3

    .line 9379
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lalm;->a(Z)Laow;

    move-result-object v0

    .line 9381
    :cond_3
    invoke-virtual {v0, p1, p2}, Laow;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 9382
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {v0}, Laow;->g()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v3

    .line 9383
    monitor-exit v2

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method static synthetic a(Layz;)Z
    .locals 1

    .prologue
    .line 34
    iget-boolean v0, p0, Layz;->aj:Z

    return v0
.end method

.method static synthetic b(Layz;)V
    .locals 1

    .prologue
    .line 34
    .line 8218
    invoke-direct {p0}, Layz;->q()V

    .line 8219
    iget-object v0, p0, Layz;->a:Lazf;

    if-eqz v0, :cond_0

    .line 8220
    iget-object v0, p0, Layz;->a:Lazf;

    invoke-interface {v0}, Lazf;->r()V

    .line 34
    :cond_0
    return-void
.end method

.method static synthetic c(Layz;)Lblp;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Layz;->Z:Lblp;

    return-object v0
.end method

.method static synthetic d(Layz;)Lalm;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Layz;->ae:Lalm;

    return-object v0
.end method

.method private declared-synchronized q()V
    .locals 3

    .prologue
    .line 282
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Layz;->ac:Layq;

    if-eqz v0, :cond_1

    .line 284
    iget-object v0, p0, Layz;->ac:Layq;

    invoke-virtual {v0}, Layq;->d()Ljava/util/List;

    move-result-object v0

    .line 285
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 286
    new-instance v1, Ljava/util/HashSet;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 287
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laym;

    .line 8073
    iget-object v0, v0, Laym;->b:Ljava/lang/String;

    .line 288
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 282
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 290
    :cond_0
    :try_start_1
    iget-object v0, p0, Layz;->ae:Lalm;

    invoke-virtual {v0, v1}, Lalm;->a(Ljava/util/Set;)V

    .line 293
    :cond_1
    iget-object v0, p0, Layz;->ae:Lalm;

    invoke-virtual {v0}, Lalm;->f()Z

    move-result v0

    .line 294
    if-eqz v0, :cond_2

    iget-object v0, p0, Layz;->a:Lazf;

    if-eqz v0, :cond_2

    .line 295
    iget-object v0, p0, Layz;->a:Lazf;

    invoke-interface {v0}, Lazf;->s()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 297
    :cond_2
    monitor-exit p0

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 123
    invoke-super {p0}, Lj;->a()V

    .line 124
    iget-object v0, p0, Layz;->aa:Lbae;

    .line 3087
    iput-object v1, v0, Lbae;->b:Lbag;

    .line 125
    iput-object v1, p0, Layz;->aa:Lbae;

    .line 126
    iget-object v0, p0, Layz;->ab:Layf;

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Layz;->ab:Layf;

    .line 4072
    iput-object v1, v0, Layf;->a:Layk;

    .line 128
    iput-object v1, p0, Layz;->ab:Layf;

    .line 130
    :cond_0
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 114
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 1304
    new-instance v0, Lbae;

    .line 1612
    iget-object v1, p0, Lj;->y:Lm;

    .line 1304
    invoke-direct {v0, v1}, Lbae;-><init>(Landroid/content/Context;)V

    .line 1305
    new-instance v1, Lazc;

    invoke-direct {v1, p0}, Lazc;-><init>(Layz;)V

    .line 2087
    iput-object v1, v0, Lbae;->b:Lbag;

    .line 115
    iput-object v0, p0, Layz;->aa:Lbae;

    .line 116
    invoke-static {}, Lblx;->a()Z

    .line 119
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 134
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 136
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Layz;->c(Z)V

    .line 137
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Layz;->ag:Landroid/os/Handler;

    .line 138
    invoke-virtual {p0}, Layz;->e()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->fc:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Layz;->ai:J

    .line 139
    invoke-virtual {p0}, Layz;->e()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->fb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Layz;->ah:J

    .line 140
    return-void
.end method

.method public final a(Z)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 231
    iget-boolean v0, p0, Layz;->aj:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Layz;->aa:Lbae;

    if-nez v0, :cond_1

    .line 260
    :cond_0
    :goto_0
    return-void

    .line 234
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Layz;->aj:Z

    .line 237
    iget-object v0, p0, Layz;->ag:Landroid/os/Handler;

    iget-object v1, p0, Layz;->ak:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 238
    iget-object v0, p0, Layz;->ag:Landroid/os/Handler;

    iget-object v1, p0, Layz;->al:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 241
    if-eqz p1, :cond_2

    .line 242
    iput-boolean v2, p0, Layz;->c:Z

    .line 244
    :cond_2
    iget-object v0, p0, Layz;->ac:Layq;

    invoke-virtual {v0}, Layq;->c()V

    .line 245
    iget-object v0, p0, Layz;->ac:Layq;

    .line 5229
    invoke-virtual {v0}, Layq;->e()V

    .line 246
    iget-object v0, p0, Layz;->aa:Lbae;

    .line 6114
    :try_start_0
    iget-object v1, v0, Lbae;->a:Landroid/content/Context;

    iget-object v0, v0, Lbae;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 247
    :goto_1
    invoke-static {}, Lblx;->a()Z

    .line 250
    invoke-direct {p0}, Layz;->q()V

    .line 6264
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 7192
    iget-boolean v0, v0, Lcom/google/android/apps/chromecast/app/SetupApplication;->h:Z

    .line 6264
    if-eqz v0, :cond_3

    .line 6267
    if-nez p1, :cond_6

    .line 6268
    iget-object v0, p0, Layz;->ae:Lalm;

    invoke-virtual {v0}, Lalm;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 6269
    iget-object v0, p0, Layz;->af:Lapd;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lapd;->a(I)Lapd;

    .line 6276
    :goto_2
    iget-object v0, p0, Layz;->af:Lapd;

    iget-object v1, p0, Layz;->ae:Lalm;

    invoke-virtual {v1}, Lalm;->b()I

    move-result v1

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lapd;->a(J)Lapd;

    .line 6277
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Layz;->af:Lapd;

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 253
    :cond_3
    if-eqz p1, :cond_0

    .line 254
    iget-object v0, p0, Layz;->a:Lazf;

    if-eqz v0, :cond_4

    .line 255
    iget-object v0, p0, Layz;->a:Lazf;

    invoke-interface {v0}, Lazf;->p()V

    .line 258
    :cond_4
    invoke-virtual {p0}, Layz;->p()V

    goto :goto_0

    .line 6271
    :cond_5
    iget-object v0, p0, Layz;->af:Lapd;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lapd;->a(I)Lapd;

    goto :goto_2

    .line 6274
    :cond_6
    iget-object v0, p0, Layz;->af:Lapd;

    invoke-virtual {v0, v2}, Lapd;->a(I)Lapd;

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public final j()V
    .locals 0

    .prologue
    .line 144
    invoke-super {p0}, Lj;->j()V

    .line 145
    invoke-virtual {p0}, Layz;->p()V

    .line 146
    return-void
.end method

.method public final k()V
    .locals 1

    .prologue
    .line 150
    invoke-super {p0}, Lj;->k()V

    .line 151
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Layz;->a(Z)V

    .line 152
    return-void
.end method

.method public p()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 188
    iget-boolean v0, p0, Layz;->b:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Layz;->aj:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Layz;->aa:Lbae;

    if-nez v0, :cond_1

    .line 210
    :cond_0
    :goto_0
    return-void

    .line 191
    :cond_1
    new-instance v0, Lapd;

    const/4 v1, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lapd;-><init>(ILjava/lang/Integer;)V

    iput-object v0, p0, Layz;->af:Lapd;

    .line 192
    iput-boolean v4, p0, Layz;->aj:Z

    .line 194
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Layz;->d:J

    .line 195
    iget-object v0, p0, Layz;->aa:Lbae;

    .line 4097
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.wifi.SCAN_RESULTS"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 4098
    iget-object v2, v0, Lbae;->a:Landroid/content/Context;

    iget-object v3, v0, Lbae;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 4099
    iget-object v1, v0, Lbae;->c:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->startScan()Z

    move-result v1

    if-nez v1, :cond_2

    .line 4100
    const-string v1, "WifiScanner"

    const-string v2, "Could not start scan"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 4101
    iget-object v1, v0, Lbae;->a:Landroid/content/Context;

    iget-object v0, v0, Lbae;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 196
    :cond_2
    iget-object v0, p0, Layz;->ab:Layf;

    if-eqz v0, :cond_3

    .line 197
    iget-object v0, p0, Layz;->ab:Layf;

    invoke-virtual {v0}, Layf;->a()Z

    .line 199
    :cond_3
    iget-object v0, p0, Layz;->ac:Layq;

    if-nez v0, :cond_4

    .line 200
    const/4 v0, 0x0

    iput v0, p0, Layz;->ad:I

    .line 4358
    new-instance v0, Layq;

    .line 4612
    iget-object v1, p0, Lj;->y:Lm;

    .line 4358
    invoke-direct {v0, v1}, Layq;-><init>(Landroid/content/Context;)V

    .line 4359
    new-instance v1, Lazd;

    invoke-direct {v1, p0}, Lazd;-><init>(Layz;)V

    .line 4376
    new-instance v2, Layy;

    invoke-direct {v2, v1}, Layy;-><init>(Layw;)V

    invoke-virtual {v0, v2}, Layq;->a(Layw;)V

    .line 201
    iput-object v0, p0, Layz;->ac:Layq;

    .line 203
    :cond_4
    iget v0, p0, Layz;->ad:I

    if-eq v0, v4, :cond_5

    .line 204
    iget-object v0, p0, Layz;->ac:Layq;

    invoke-virtual {v0}, Layq;->b()V

    .line 208
    :cond_5
    iget-object v0, p0, Layz;->ag:Landroid/os/Handler;

    iget-object v1, p0, Layz;->al:Ljava/lang/Runnable;

    iget-wide v2, p0, Layz;->ai:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 209
    iget-object v0, p0, Layz;->ag:Landroid/os/Handler;

    iget-object v1, p0, Layz;->ak:Ljava/lang/Runnable;

    iget-wide v2, p0, Layz;->ah:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
