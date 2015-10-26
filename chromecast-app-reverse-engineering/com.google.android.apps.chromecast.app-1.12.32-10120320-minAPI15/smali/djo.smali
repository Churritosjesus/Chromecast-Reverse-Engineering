.class final Ldjo;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldku;


# instance fields
.field private final a:Ldjz;

.field private b:Z

.field private c:Z

.field private synthetic d:Ldjn;


# direct methods
.method constructor <init>(Ldjn;)V
    .locals 1

    .prologue
    .line 469
    iput-object p1, p0, Ldjo;->d:Ldjn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 476
    new-instance v0, Ldjz;

    invoke-direct {v0}, Ldjz;-><init>()V

    iput-object v0, p0, Ldjo;->a:Ldjz;

    return-void
.end method

.method private a(Z)V
    .locals 6

    .prologue
    .line 500
    iget-object v1, p0, Ldjo;->d:Ldjn;

    monitor-enter v1

    .line 501
    :try_start_0
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->g(Ldjn;)Ldjq;

    move-result-object v0

    invoke-virtual {v0}, Ldjq;->j_()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 503
    :goto_0
    :try_start_1
    iget-object v0, p0, Ldjo;->d:Ldjn;

    iget-wide v2, v0, Ldjn;->b:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_0

    iget-boolean v0, p0, Ldjo;->c:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ldjo;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->d(Ldjn;)Ldia;

    move-result-object v0

    if-nez v0, :cond_0

    .line 504
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->e(Ldjn;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 507
    :catchall_0
    move-exception v0

    :try_start_2
    iget-object v2, p0, Ldjo;->d:Ldjn;

    invoke-static {v2}, Ldjn;->g(Ldjn;)Ldjq;

    move-result-object v2

    invoke-virtual {v2}, Ldjq;->b()V

    throw v0

    .line 513
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 507
    :cond_0
    :try_start_3
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->g(Ldjn;)Ldjq;

    move-result-object v0

    invoke-virtual {v0}, Ldjq;->b()V

    .line 510
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->h(Ldjn;)V

    .line 511
    iget-object v0, p0, Ldjo;->d:Ldjn;

    iget-wide v2, v0, Ldjn;->b:J

    iget-object v0, p0, Ldjo;->a:Ldjz;

    .line 2060
    iget-wide v4, v0, Ldjz;->b:J

    .line 511
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    .line 512
    iget-object v0, p0, Ldjo;->d:Ldjn;

    iget-wide v2, v0, Ldjn;->b:J

    sub-long/2addr v2, v4

    iput-wide v2, v0, Ldjn;->b:J

    .line 513
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 515
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->g(Ldjn;)Ldjq;

    move-result-object v0

    invoke-virtual {v0}, Ldjq;->j_()V

    .line 517
    :try_start_4
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v0

    iget-object v1, p0, Ldjo;->d:Ldjn;

    invoke-static {v1}, Ldjn;->b(Ldjn;)I

    move-result v1

    if-eqz p1, :cond_1

    iget-object v2, p0, Ldjo;->a:Ldjz;

    .line 3060
    iget-wide v2, v2, Ldjz;->b:J

    .line 517
    cmp-long v2, v4, v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    :goto_1
    iget-object v3, p0, Ldjo;->a:Ldjz;

    invoke-virtual/range {v0 .. v5}, Ldjb;->a(IZLdjz;J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 519
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->g(Ldjn;)Ldjq;

    move-result-object v0

    invoke-virtual {v0}, Ldjq;->b()V

    .line 520
    return-void

    .line 517
    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    .line 519
    :catchall_2
    move-exception v0

    iget-object v1, p0, Ldjo;->d:Ldjn;

    invoke-static {v1}, Ldjn;->g(Ldjn;)Ldjq;

    move-result-object v1

    invoke-virtual {v1}, Ldjq;->b()V

    throw v0
.end method

.method static synthetic a(Ldjo;)Z
    .locals 1

    .prologue
    .line 469
    iget-boolean v0, p0, Ldjo;->c:Z

    return v0
.end method

.method static synthetic a(Ldjo;Z)Z
    .locals 0

    .prologue
    .line 469
    iput-boolean p1, p0, Ldjo;->c:Z

    return p1
.end method

.method static synthetic b(Ldjo;)Z
    .locals 1

    .prologue
    .line 469
    iget-boolean v0, p0, Ldjo;->b:Z

    return v0
.end method


# virtual methods
.method public final a()Ldkw;
    .locals 1

    .prologue
    .line 535
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->g(Ldjn;)Ldjq;

    move-result-object v0

    return-object v0
.end method

.method public final a_(Ldjz;J)V
    .locals 4

    .prologue
    .line 488
    iget-object v0, p0, Ldjo;->a:Ldjz;

    invoke-virtual {v0, p1, p2, p3}, Ldjz;->a_(Ldjz;J)V

    .line 489
    :goto_0
    iget-object v0, p0, Ldjo;->a:Ldjz;

    .line 1060
    iget-wide v0, v0, Ldjz;->b:J

    .line 489
    const-wide/16 v2, 0x4000

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 490
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ldjo;->a(Z)V

    goto :goto_0

    .line 492
    :cond_0
    return-void
.end method

.method public final close()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v2, 0x1

    .line 540
    iget-object v1, p0, Ldjo;->d:Ldjn;

    monitor-enter v1

    .line 541
    :try_start_0
    iget-boolean v0, p0, Ldjo;->b:Z

    if-eqz v0, :cond_0

    monitor-exit v1

    .line 559
    :goto_0
    return-void

    .line 542
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 543
    iget-object v0, p0, Ldjo;->d:Ldjn;

    iget-object v0, v0, Ldjn;->g:Ldjo;

    iget-boolean v0, v0, Ldjo;->c:Z

    if-nez v0, :cond_2

    .line 545
    iget-object v0, p0, Ldjo;->a:Ldjz;

    .line 5060
    iget-wide v0, v0, Ldjz;->b:J

    .line 545
    cmp-long v0, v0, v4

    if-lez v0, :cond_1

    .line 546
    :goto_1
    iget-object v0, p0, Ldjo;->a:Ldjz;

    .line 6060
    iget-wide v0, v0, Ldjz;->b:J

    .line 546
    cmp-long v0, v0, v4

    if-lez v0, :cond_2

    .line 547
    invoke-direct {p0, v2}, Ldjo;->a(Z)V

    goto :goto_1

    .line 542
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 551
    :cond_1
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v0

    iget-object v1, p0, Ldjo;->d:Ldjn;

    invoke-static {v1}, Ldjn;->b(Ldjn;)I

    move-result v1

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Ldjb;->a(IZLdjz;J)V

    .line 554
    :cond_2
    iget-object v1, p0, Ldjo;->d:Ldjn;

    monitor-enter v1

    .line 555
    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, Ldjo;->b:Z

    .line 556
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 557
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v0

    invoke-virtual {v0}, Ldjb;->c()V

    .line 558
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->f(Ldjn;)V

    goto :goto_0

    .line 556
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final flush()V
    .locals 4

    .prologue
    .line 525
    iget-object v1, p0, Ldjo;->d:Ldjn;

    monitor-enter v1

    .line 526
    :try_start_0
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->h(Ldjn;)V

    .line 527
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 528
    :goto_0
    iget-object v0, p0, Ldjo;->a:Ldjz;

    .line 4060
    iget-wide v0, v0, Ldjz;->b:J

    .line 528
    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 529
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ldjo;->a(Z)V

    .line 530
    iget-object v0, p0, Ldjo;->d:Ldjn;

    invoke-static {v0}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v0

    invoke-virtual {v0}, Ldjb;->c()V

    goto :goto_0

    .line 527
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 532
    :cond_0
    return-void
.end method
