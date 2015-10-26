.class public final Lafv;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final a:Ljava/util/HashSet;

.field private static volatile b:Ljava/util/concurrent/Executor;

.field private static volatile c:Ljava/lang/String;

.field private static volatile d:Ljava/lang/String;

.field private static volatile e:Ljava/lang/String;

.field private static volatile f:I

.field private static volatile g:Ljava/lang/String;

.field private static h:Ljava/util/concurrent/atomic/AtomicLong;

.field private static volatile i:Z

.field private static j:Z

.field private static k:Landroid/content/Context;

.field private static l:I

.field private static final m:Ljava/lang/Object;

.field private static final n:Ljava/util/concurrent/BlockingQueue;

.field private static final o:Ljava/util/concurrent/ThreadFactory;

.field private static p:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 60
    const-class v0, Lafv;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 61
    new-instance v0, Ljava/util/HashSet;

    new-array v1, v5, [Lags;

    sget-object v2, Lags;->f:Lags;

    aput-object v2, v1, v4

    .line 62
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lafv;->a:Ljava/util/HashSet;

    .line 69
    const-string v0, "facebook.com"

    sput-object v0, Lafv;->g:Ljava/lang/String;

    .line 70
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/32 v2, 0x10000

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lafv;->h:Ljava/util/concurrent/atomic/AtomicLong;

    .line 71
    sput-boolean v5, Lafv;->i:Z

    .line 72
    sput-boolean v4, Lafv;->j:Z

    .line 78
    const v0, 0xface

    sput v0, Lafv;->l:I

    .line 79
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lafv;->m:Ljava/lang/Object;

    .line 86
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v0, Lafv;->n:Ljava/util/concurrent/BlockingQueue;

    .line 89
    new-instance v0, Lafw;

    invoke-direct {v0}, Lafw;-><init>()V

    sput-object v0, Lafv;->o:Ljava/util/concurrent/ThreadFactory;

    .line 124
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lafv;->p:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 799
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 172
    const-class v0, Lafv;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v1}, Lafv;->a(Landroid/content/Context;Ls;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    monitor-exit v0

    return-void

    .line 172
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static declared-synchronized a(Landroid/content/Context;Ls;)V
    .locals 4

    .prologue
    .line 185
    const-class v1, Lafv;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lafv;->p:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 234
    :goto_0
    monitor-exit v1

    return-void

    .line 192
    :cond_0
    :try_start_1
    const-string v0, "applicationContext"

    invoke-static {p0, v0}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lajp;->b(Landroid/content/Context;Z)V

    .line 197
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lajp;->a(Landroid/content/Context;Z)V

    .line 199
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 202
    sput-object v0, Lafv;->k:Landroid/content/Context;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1602
    if-eqz v0, :cond_1

    .line 1608
    :try_start_2
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 1609
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x80

    .line 1608
    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v2

    .line 1614
    if-eqz v2, :cond_1

    :try_start_3
    iget-object v0, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-nez v0, :cond_2

    .line 204
    :cond_1
    :goto_1
    sget-object v0, Lafv;->k:Landroid/content/Context;

    sget-object v2, Lafv;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Laji;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 206
    invoke-static {}, Laix;->b()V

    .line 208
    sget-object v0, Lafv;->k:Landroid/content/Context;

    invoke-static {v0}, Laia;->a(Landroid/content/Context;)Laia;

    .line 210
    sget-object v0, Lafv;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 212
    new-instance v0, Ljava/util/concurrent/FutureTask;

    new-instance v2, Lafx;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lafx;-><init>(Ls;)V

    invoke-direct {v0, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 231
    invoke-static {}, Lafv;->d()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 233
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lafv;->p:Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 185
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 1618
    :cond_2
    :try_start_4
    sget-object v0, Lafv;->c:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 1619
    iget-object v0, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v3, "com.facebook.sdk.ApplicationId"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 1620
    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_6

    .line 1621
    check-cast v0, Ljava/lang/String;

    sput-object v0, Lafv;->c:Ljava/lang/String;

    .line 1627
    :cond_3
    :goto_2
    sget-object v0, Lafv;->d:Ljava/lang/String;

    if-nez v0, :cond_4

    .line 1628
    iget-object v0, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v3, "com.facebook.sdk.ApplicationName"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lafv;->d:Ljava/lang/String;

    .line 1631
    :cond_4
    sget-object v0, Lafv;->e:Ljava/lang/String;

    if-nez v0, :cond_5

    .line 1632
    iget-object v0, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v3, "com.facebook.sdk.ClientToken"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lafv;->e:Ljava/lang/String;

    .line 1635
    :cond_5
    sget v0, Lafv;->f:I

    if-nez v0, :cond_1

    .line 1636
    iget-object v0, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "com.facebook.sdk.WebDialogTheme"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 1749
    sput v0, Lafv;->f:I

    goto :goto_1

    .line 1622
    :cond_6
    instance-of v3, v0, Ljava/lang/Integer;

    if-eqz v3, :cond_3

    .line 1623
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lafv;->c:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    .line 1611
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public static declared-synchronized a()Z
    .locals 2

    .prologue
    .line 241
    const-class v1, Lafv;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lafv;->p:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static a(Lags;)Z
    .locals 2

    .prologue
    .line 312
    sget-object v1, Lafv;->a:Ljava/util/HashSet;

    monitor-enter v1

    .line 2321
    :try_start_0
    sget-boolean v0, Lafv;->i:Z

    .line 313
    if-eqz v0, :cond_0

    sget-object v0, Lafv;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 314
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static b()Z
    .locals 1

    .prologue
    .line 321
    sget-boolean v0, Lafv;->i:Z

    return v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 560
    invoke-static {}, Lajp;->b()V

    .line 561
    const-string v0, "com.facebook.sdk.appEventPreferences"

    invoke-virtual {p0, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 563
    const-string v1, "limitEventUsage"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static c()Z
    .locals 1

    .prologue
    .line 338
    const/4 v0, 0x0

    return v0
.end method

.method public static d()Ljava/util/concurrent/Executor;
    .locals 10

    .prologue
    .line 365
    sget-object v9, Lafv;->m:Ljava/lang/Object;

    monitor-enter v9

    .line 366
    :try_start_0
    sget-object v0, Lafv;->b:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    .line 367
    invoke-static {}, Lafv;->l()Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 368
    if-nez v1, :cond_0

    .line 369
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x5

    const/16 v3, 0x80

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v7, Lafv;->n:Ljava/util/concurrent/BlockingQueue;

    sget-object v8, Lafv;->o:Ljava/util/concurrent/ThreadFactory;

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 373
    :cond_0
    sput-object v1, Lafv;->b:Ljava/util/concurrent/Executor;

    .line 375
    :cond_1
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 376
    sget-object v0, Lafv;->b:Ljava/util/concurrent/Executor;

    return-object v0

    .line 375
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 399
    sget-object v0, Lafv;->g:Ljava/lang/String;

    return-object v0
.end method

.method public static f()Landroid/content/Context;
    .locals 1

    .prologue
    .line 422
    invoke-static {}, Lajp;->b()V

    .line 423
    sget-object v0, Lafv;->k:Landroid/content/Context;

    return-object v0
.end method

.method public static g()J
    .locals 2

    .prologue
    .line 586
    invoke-static {}, Lajp;->b()V

    .line 587
    sget-object v0, Lafv;->h:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public static h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 686
    invoke-static {}, Lajp;->b()V

    .line 687
    sget-object v0, Lafv;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 723
    invoke-static {}, Lajp;->b()V

    .line 724
    sget-object v0, Lafv;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static j()I
    .locals 1

    .prologue
    .line 740
    invoke-static {}, Lajp;->b()V

    .line 741
    sget v0, Lafv;->f:I

    return v0
.end method

.method public static k()I
    .locals 1

    .prologue
    .line 778
    invoke-static {}, Lajp;->b()V

    .line 779
    sget v0, Lafv;->l:I

    return v0
.end method

.method private static l()Ljava/util/concurrent/Executor;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 429
    :try_start_0
    const-class v0, Landroid/os/AsyncTask;

    const-string v2, "THREAD_POOL_EXECUTOR"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 436
    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 441
    if-nez v0, :cond_0

    move-object v0, v1

    .line 449
    :goto_0
    return-object v0

    .line 431
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 438
    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 445
    :cond_0
    instance-of v2, v0, Ljava/util/concurrent/Executor;

    if-nez v2, :cond_1

    move-object v0, v1

    .line 446
    goto :goto_0

    .line 449
    :cond_1
    check-cast v0, Ljava/util/concurrent/Executor;

    goto :goto_0
.end method
