.class final Latn;
.super Landroid/os/AsyncTask;
.source "PG"


# instance fields
.field private synthetic a:Latf;


# direct methods
.method constructor <init>(Latf;)V
    .locals 0

    .prologue
    .line 378
    iput-object p1, p0, Latn;->a:Latf;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method private varargs a()Ljava/lang/Void;
    .locals 10

    .prologue
    const/4 v7, 0x0

    .line 381
    iget-object v2, p0, Latn;->a:Latf;

    .line 1396
    :goto_0
    iget-object v1, v2, Latf;->k:Ljava/util/ArrayList;

    monitor-enter v1

    .line 1397
    :try_start_0
    iget-object v0, v2, Latf;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1398
    monitor-exit v1

    .line 382
    :cond_0
    return-object v7

    .line 1400
    :cond_1
    iget-object v0, v2, Latf;->k:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Latb;

    .line 1401
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1403
    iget-object v1, v2, Latf;->b:Landroid/content/SharedPreferences;

    const-string v3, "current_account_name"

    invoke-interface {v1, v3, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1404
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1405
    iget-object v1, v2, Latf;->a:Landroid/content/Context;

    invoke-static {v1}, Lbls;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 1408
    :cond_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1409
    new-instance v1, Ladf;

    const-string v3, "no account"

    invoke-direct {v1, v3}, Ladf;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Latb;->b(Laef;)V

    .line 1440
    :goto_1
    iget-object v1, v2, Latf;->k:Ljava/util/ArrayList;

    monitor-enter v1

    .line 1441
    :try_start_1
    iget-object v3, v2, Latf;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1442
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 1401
    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 1413
    :cond_3
    :try_start_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 1414
    iget-object v3, v2, Latf;->a:Landroid/content/Context;

    invoke-virtual {v0}, Latb;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v3, v1, v6}, Latf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1415
    if-eqz v1, :cond_0

    .line 1420
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v6, 0x0

    .line 1421
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    sub-long v4, v8, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v6

    .line 2046
    iput-object v1, v0, Latb;->l:Ljava/lang/String;

    .line 1423
    new-instance v3, Lato;

    invoke-direct {v3, v2, v1}, Lato;-><init>(Latf;Ljava/lang/String;)V

    .line 2053
    iput-object v3, v0, Latb;->m:Ladz;

    .line 1432
    iget-object v1, v2, Latf;->l:Ladv;

    invoke-virtual {v1, v0}, Ladv;->a(Lads;)Lads;
    :try_end_3
    .catch Lbsm; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    .line 1433
    :catch_0
    move-exception v1

    .line 1436
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x1c

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Could not get token (auth): "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1437
    new-instance v3, Ladf;

    const-string v4, "no token"

    invoke-direct {v3, v4, v1}, Ladf;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    invoke-virtual {v0, v3}, Latb;->b(Laef;)V

    goto :goto_1
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 378
    invoke-direct {p0}, Latn;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
