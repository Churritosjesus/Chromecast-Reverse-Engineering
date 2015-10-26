.class final Laze;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbff;


# instance fields
.field private synthetic a:Lbdq;

.field private synthetic b:I

.field private synthetic c:Laym;

.field private synthetic d:Layz;


# direct methods
.method constructor <init>(Layz;Lbdq;ILaym;)V
    .locals 0

    .prologue
    .line 394
    iput-object p1, p0, Laze;->d:Layz;

    iput-object p2, p0, Laze;->a:Lbdq;

    iput p3, p0, Laze;->b:I

    iput-object p4, p0, Laze;->c:Laym;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 398
    iget-object v0, p0, Laze;->d:Layz;

    invoke-static {v0}, Layz;->c(Layz;)Lblp;

    .line 399
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    const/4 v1, 0x7

    const/4 v2, 0x2

    .line 401
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Laze;->d:Layz;

    .line 1300
    iget-wide v4, v3, Layz;->d:J

    .line 401
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 399
    invoke-virtual {v0, v1, v2, v3}, Lape;->a(ILjava/lang/Integer;Ljava/lang/Long;)V

    .line 402
    iget-object v0, p0, Laze;->d:Layz;

    invoke-static {v0}, Layz;->d(Layz;)Lalm;

    move-result-object v1

    iget-object v0, p0, Laze;->a:Lbdq;

    .line 1472
    iget-object v2, v0, Lbdq;->a:Lbdf;

    .line 3239
    iget v0, v2, Lbdf;->a:I

    .line 2435
    const/4 v3, 0x4

    if-le v0, v3, :cond_0

    .line 2436
    new-array v0, v6, [Ljava/lang/Object;

    .line 3254
    iget-object v1, v2, Lbdf;->b:Ljava/lang/String;

    .line 2436
    aput-object v1, v0, v7

    .line 2463
    :goto_0
    return-void

    .line 2439
    :cond_0
    iget-object v3, v1, Lalm;->g:Ljava/util/List;

    monitor-enter v3

    .line 3362
    :try_start_0
    iget-object v0, v2, Lbdf;->n:Ljava/lang/String;

    .line 3427
    iget-object v4, v2, Lbdf;->u:Ljava/lang/String;

    .line 2442
    invoke-virtual {v1, v0, v4}, Lalm;->a(Ljava/lang/String;Ljava/lang/String;)Laow;

    move-result-object v0

    .line 2445
    if-nez v0, :cond_1

    .line 4395
    iget-object v0, v2, Lbdf;->q:Ljava/lang/String;

    .line 2446
    invoke-virtual {v1, v0}, Lalm;->d(Ljava/lang/String;)Laow;

    move-result-object v0

    .line 2450
    :cond_1
    if-nez v0, :cond_3

    .line 2451
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lalm;->a(Z)Laow;

    move-result-object v0

    .line 2456
    :cond_2
    :goto_1
    invoke-virtual {v0, v2}, Laow;->a(Lbdf;)V

    .line 2457
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v0}, Laow;->g()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    .line 2458
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5314
    iget-boolean v0, v2, Lbdf;->h:Z

    .line 2461
    if-eqz v0, :cond_4

    .line 2462
    iget-object v0, v1, Lalm;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "nonhendrixDiscovered"

    invoke-interface {v0, v1, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 2463
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 2452
    :cond_3
    :try_start_1
    invoke-virtual {v0}, Laow;->q()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 2454
    invoke-virtual {v1, v0}, Lalm;->b(Laow;)V

    goto :goto_1

    .line 2458
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 2465
    :cond_4
    iget-object v0, v1, Lalm;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "hendrixDiscovered"

    invoke-interface {v0, v1, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 2466
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0
.end method

.method public final a(I)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x3

    .line 407
    iget v0, p0, Laze;->b:I

    add-int/lit8 v0, v0, 0x1

    .line 408
    invoke-static {p1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    if-ge v0, v3, :cond_0

    .line 409
    iget-object v1, p0, Laze;->d:Layz;

    invoke-static {v1}, Layz;->c(Layz;)Lblp;

    new-array v1, v3, [Ljava/lang/Object;

    .line 410
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v5

    const/4 v2, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    .line 411
    iget-object v1, p0, Laze;->d:Layz;

    iget-object v2, p0, Laze;->c:Laym;

    invoke-static {v1, v2, v0}, Layz;->a(Layz;Laym;I)V

    .line 416
    :goto_0
    return-void

    .line 415
    :cond_0
    iget-object v0, p0, Laze;->d:Layz;

    invoke-static {v0}, Layz;->c(Layz;)Lblp;

    new-array v0, v5, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v4

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 420
    iget-object v0, p0, Laze;->d:Layz;

    invoke-static {v0}, Layz;->c(Layz;)Lblp;

    .line 421
    return-void
.end method
