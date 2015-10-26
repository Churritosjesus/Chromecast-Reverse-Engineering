.class public final Layq;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:I


# instance fields
.field public a:Ljava/util/List;

.field private f:Landroid/content/Context;

.field private g:Layx;

.field private h:Lazm;

.field private i:Landroid/os/Handler;

.field private j:Ljava/lang/Runnable;

.field private k:I

.field private final l:Lblp;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 43
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Layq;->b:I

    .line 44
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3e8

    .line 45
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v0, v0

    .line 46
    sput v0, Layq;->c:I

    mul-int/lit8 v0, v0, 0xa

    sput v0, Layq;->d:I

    .line 47
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Layq;->e:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput v2, p0, Layq;->k:I

    .line 95
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Layq;->f:Landroid/content/Context;

    .line 96
    new-instance v0, Lblp;

    const-string v1, "LegacyDeviceManager"

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Layq;->l:Lblp;

    .line 97
    new-instance v0, Layx;

    invoke-direct {v0, p0}, Layx;-><init>(Layq;)V

    iput-object v0, p0, Layq;->g:Layx;

    .line 98
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Layq;->a:Ljava/util/List;

    .line 99
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Layq;->i:Landroid/os/Handler;

    .line 100
    new-instance v0, Layr;

    invoke-direct {v0, p0}, Layr;-><init>(Layq;)V

    iput-object v0, p0, Layq;->j:Ljava/lang/Runnable;

    .line 106
    return-void
.end method

.method private a(I)V
    .locals 3

    .prologue
    .line 419
    iget v0, p0, Layq;->k:I

    if-ne v0, p1, :cond_1

    .line 435
    :cond_0
    :goto_0
    return-void

    .line 422
    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 423
    iput p1, p0, Layq;->k:I

    .line 424
    invoke-direct {p0}, Layq;->g()Ljava/util/List;

    move-result-object v0

    .line 425
    if-eqz v0, :cond_0

    .line 426
    iget-object v1, p0, Layq;->i:Landroid/os/Handler;

    new-instance v2, Layu;

    invoke-direct {v2, p0, v0, p1}, Layu;-><init>(Layq;Ljava/util/List;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method static synthetic a(Layq;)V
    .locals 7

    .prologue
    .line 40
    .line 1359
    const/4 v1, 0x0

    .line 1360
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 1361
    iget-object v4, p0, Layq;->g:Layx;

    monitor-enter v4

    .line 1362
    :try_start_0
    iget-object v0, p0, Layq;->g:Layx;

    iget-object v0, v0, Layx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 1363
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1364
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Layv;

    .line 1366
    invoke-virtual {v0, v2, v3}, Layv;->a(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1367
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 1383
    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1371
    :cond_1
    :try_start_1
    iget-object v0, p0, Layq;->g:Layx;

    iget-object v0, v0, Layx;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 1372
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1373
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Layv;

    .line 1375
    iget-boolean v6, v0, Layv;->f:Z

    if-nez v6, :cond_2

    invoke-virtual {v0, v2, v3}, Layv;->a(J)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 1376
    :cond_2
    if-nez v1, :cond_3

    .line 1377
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 1379
    :cond_3
    iget-object v0, v0, Layv;->b:Laym;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1380
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    :cond_4
    move-object v0, v1

    move-object v1, v0

    .line 1382
    goto :goto_1

    .line 1383
    :cond_5
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1385
    if-eqz v1, :cond_7

    .line 1386
    invoke-direct {p0}, Layq;->g()Ljava/util/List;

    move-result-object v2

    .line 1387
    if-eqz v2, :cond_7

    .line 1388
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Laym;

    .line 1389
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Layw;

    .line 1390
    invoke-interface {v0, v1}, Layw;->b(Laym;)V

    goto :goto_2

    .line 1396
    :cond_7
    iget-object v0, p0, Layq;->i:Landroid/os/Handler;

    iget-object v1, p0, Layq;->j:Ljava/lang/Runnable;

    sget v2, Layq;->e:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 40
    return-void
.end method

.method static synthetic a(Layq;I)V
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Layq;->a(I)V

    return-void
.end method

.method static synthetic a(Layq;Lazu;)V
    .locals 9

    .prologue
    .line 40
    .line 2269
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 2510
    iget-object v0, p1, Lazu;->a:Ljava/lang/String;

    .line 2271
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 2272
    invoke-virtual {v1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v4

    .line 2273
    if-eqz v4, :cond_2

    .line 2278
    iget-object v5, p0, Layq;->g:Layx;

    monitor-enter v5

    .line 2280
    :try_start_0
    iget-object v0, p0, Layq;->g:Layx;

    iget-object v0, v0, Layx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Layv;

    .line 2281
    iget-object v7, v0, Layv;->a:Ljava/lang/String;

    .line 2534
    iget-object v8, p1, Lazu;->b:Ljava/lang/String;

    .line 2281
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 2282
    iget-boolean v1, v0, Layv;->f:Z

    if-nez v1, :cond_1

    .line 2283
    iget-object v1, v0, Layv;->b:Laym;

    .line 3073
    iget-object v1, v1, Laym;->b:Ljava/lang/String;

    .line 2283
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2284
    iput-wide v2, v0, Layv;->e:J

    .line 2290
    :cond_1
    :goto_0
    monitor-exit v5

    .line 2355
    :cond_2
    :goto_1
    return-void

    .line 2287
    :cond_3
    const/4 v1, 0x1

    iput-boolean v1, v0, Layv;->f:Z

    goto :goto_0

    .line 2355
    :catchall_0
    move-exception v0

    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 2295
    :cond_4
    :try_start_1
    iget-object v0, p0, Layq;->g:Layx;

    iget-object v0, v0, Layx;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Layv;

    .line 2296
    iget-object v7, v0, Layv;->a:Ljava/lang/String;

    .line 3534
    iget-object v8, p1, Lazu;->b:Ljava/lang/String;

    .line 2296
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 2297
    iget-boolean v1, v0, Layv;->f:Z

    if-nez v1, :cond_6

    .line 2298
    iget-object v1, v0, Layv;->b:Laym;

    .line 4073
    iget-object v1, v1, Laym;->b:Ljava/lang/String;

    .line 2298
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2299
    iput-wide v2, v0, Layv;->e:J

    .line 2305
    :cond_6
    :goto_2
    monitor-exit v5

    goto :goto_1

    .line 2302
    :cond_7
    const/4 v1, 0x1

    iput-boolean v1, v0, Layv;->f:Z

    goto :goto_2

    .line 2310
    :cond_8
    new-instance v0, Layv;

    .line 4249
    invoke-direct {v0, p0}, Layv;-><init>(Layq;)V

    .line 2312
    new-instance v6, Laym;

    invoke-direct {v6, v4}, Laym;-><init>(Ljava/lang/String;)V

    iput-object v6, v0, Layv;->b:Laym;

    .line 4534
    iget-object v4, p1, Lazu;->b:Ljava/lang/String;

    .line 2313
    iput-object v4, v0, Layv;->a:Ljava/lang/String;

    .line 2314
    iput-wide v2, v0, Layv;->e:J

    .line 2315
    new-instance v2, Layl;

    iget-object v3, v0, Layv;->b:Laym;

    invoke-direct {v2, v1, v3}, Layl;-><init>(Landroid/net/Uri;Laym;)V

    iput-object v2, v0, Layv;->c:Layl;

    .line 2316
    new-instance v1, Lbfe;

    const/4 v2, 0x1

    new-array v2, v2, [Lbfd;

    const/4 v3, 0x0

    iget-object v4, v0, Layv;->c:Layl;

    aput-object v4, v2, v3

    invoke-direct {v1, v2}, Lbfe;-><init>([Lbfd;)V

    iput-object v1, v0, Layv;->d:Lbfe;

    .line 2317
    iget-object v1, v0, Layv;->d:Lbfe;

    new-instance v2, Layt;

    invoke-direct {v2, p0, v0}, Layt;-><init>(Layq;Layv;)V

    .line 5064
    iput-object v2, v1, Lbfe;->a:Lbff;

    .line 2353
    iget-object v1, p0, Layq;->g:Layx;

    iget-object v1, v1, Layx;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2354
    iget-object v0, v0, Layv;->d:Lbfe;

    invoke-virtual {v0}, Lbfe;->a()V

    .line 2355
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method static synthetic b(Layq;)V
    .locals 0

    .prologue
    .line 40
    invoke-virtual {p0}, Layq;->e()V

    return-void
.end method

.method static synthetic c(Layq;)Layx;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Layq;->g:Layx;

    return-object v0
.end method

.method static synthetic d(Layq;)Lblp;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Layq;->l:Lblp;

    return-object v0
.end method

.method static synthetic e(Layq;)Ljava/util/List;
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Layq;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic f()I
    .locals 1

    .prologue
    .line 40
    sget v0, Layq;->d:I

    return v0
.end method

.method private g()Ljava/util/List;
    .locals 3

    .prologue
    .line 438
    const/4 v0, 0x0

    .line 439
    iget-object v1, p0, Layq;->a:Ljava/util/List;

    monitor-enter v1

    .line 440
    :try_start_0
    iget-object v2, p0, Layq;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 441
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Layq;->a:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 443
    :cond_0
    monitor-exit v1

    .line 444
    return-object v0

    .line 443
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 148
    iget-object v1, p0, Layq;->a:Ljava/util/List;

    monitor-enter v1

    .line 149
    :try_start_0
    iget-object v0, p0, Layq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 150
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Layw;)V
    .locals 3

    .prologue
    .line 119
    iget-object v1, p0, Layq;->a:Ljava/util/List;

    monitor-enter v1

    .line 120
    :try_start_0
    iget-object v0, p0, Layq;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "the same listener cannot be added twice"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 124
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 123
    :cond_0
    :try_start_1
    iget-object v0, p0, Layq;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public final b()V
    .locals 6

    .prologue
    .line 163
    invoke-static {}, La;->c()V

    .line 164
    iget-object v0, p0, Layq;->h:Lazm;

    if-nez v0, :cond_0

    .line 165
    new-instance v0, Lazm;

    iget-object v1, p0, Layq;->f:Landroid/content/Context;

    const-string v2, "urn:dial-multiscreen-org:service:dial:1"

    sget v3, Layq;->b:I

    sget v4, Layq;->c:I

    iget-object v5, p0, Layq;->i:Landroid/os/Handler;

    invoke-direct/range {v0 .. v5}, Lazm;-><init>(Landroid/content/Context;Ljava/lang/String;IILandroid/os/Handler;)V

    iput-object v0, p0, Layq;->h:Lazm;

    .line 167
    iget-object v0, p0, Layq;->h:Lazm;

    new-instance v1, Lays;

    invoke-direct {v1, p0}, Lays;-><init>(Layq;)V

    .line 1142
    iput-object v1, v0, Lazm;->a:Lazr;

    .line 185
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Layq;->a(I)V

    .line 187
    iget-object v0, p0, Layq;->h:Lazm;

    invoke-virtual {v0}, Lazm;->a()V

    .line 188
    iget-object v0, p0, Layq;->i:Landroid/os/Handler;

    iget-object v1, p0, Layq;->j:Ljava/lang/Runnable;

    sget v2, Layq;->e:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 189
    return-void
.end method

.method public final c()V
    .locals 4

    .prologue
    .line 198
    invoke-static {}, La;->c()V

    .line 1207
    iget-object v0, p0, Layq;->h:Lazm;

    if-eqz v0, :cond_2

    .line 1210
    iget-object v0, p0, Layq;->h:Lazm;

    .line 1242
    invoke-virtual {v0}, Lazm;->c()V

    .line 1243
    invoke-virtual {v0}, Lazm;->b()V

    .line 1212
    iget-object v0, p0, Layq;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1214
    iget-object v1, p0, Layq;->g:Layx;

    monitor-enter v1

    .line 1215
    :try_start_0
    iget-object v0, p0, Layq;->g:Layx;

    iget-object v0, v0, Layx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Layv;

    .line 1216
    iget-object v3, v0, Layv;->d:Lbfe;

    if-eqz v3, :cond_0

    .line 1217
    iget-object v0, v0, Layv;->d:Lbfe;

    invoke-virtual {v0}, Lbfe;->b()V

    goto :goto_0

    .line 1221
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1220
    :cond_1
    :try_start_1
    iget-object v0, p0, Layq;->g:Layx;

    iget-object v0, v0, Layx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1221
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 200
    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Layq;->a(I)V

    .line 201
    return-void
.end method

.method public final d()Ljava/util/List;
    .locals 5

    .prologue
    .line 236
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 238
    iget-object v2, p0, Layq;->g:Layx;

    monitor-enter v2

    .line 239
    :try_start_0
    iget-object v0, p0, Layq;->g:Layx;

    iget-object v0, v0, Layx;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Layv;

    .line 240
    iget-boolean v4, v0, Layv;->f:Z

    if-nez v4, :cond_0

    .line 241
    iget-object v0, v0, Layv;->b:Laym;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 244
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 246
    return-object v1
.end method

.method e()V
    .locals 7

    .prologue
    .line 401
    iget-object v2, p0, Layq;->g:Layx;

    monitor-enter v2

    .line 402
    :try_start_0
    iget-object v0, p0, Layq;->g:Layx;

    iget-object v0, v0, Layx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 404
    iget-object v0, p0, Layq;->g:Layx;

    iget-object v0, v0, Layx;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 405
    invoke-direct {p0}, Layq;->g()Ljava/util/List;

    move-result-object v3

    .line 406
    if-eqz v3, :cond_1

    .line 407
    iget-object v0, p0, Layq;->g:Layx;

    iget-object v0, v0, Layx;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Layv;

    .line 408
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Layw;

    .line 409
    iget-object v6, v0, Layv;->b:Laym;

    invoke-interface {v1, v6}, Layw;->b(Laym;)V

    goto :goto_0

    .line 415
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 413
    :cond_1
    :try_start_1
    iget-object v0, p0, Layq;->g:Layx;

    iget-object v0, v0, Layx;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 415
    :cond_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method
