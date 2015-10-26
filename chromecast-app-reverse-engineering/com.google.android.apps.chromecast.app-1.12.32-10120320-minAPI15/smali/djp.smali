.class final Ldjp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldkv;


# instance fields
.field final a:Ldjz;

.field final b:Ldjz;

.field final c:J

.field d:Z

.field final synthetic e:Ldjn;

.field private f:Z


# direct methods
.method constructor <init>(Ldjn;J)V
    .locals 2

    .prologue
    .line 332
    iput-object p1, p0, Ldjp;->e:Ldjn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 315
    new-instance v0, Ldjz;

    invoke-direct {v0}, Ldjz;-><init>()V

    iput-object v0, p0, Ldjp;->a:Ldjz;

    .line 318
    new-instance v0, Ldjz;

    invoke-direct {v0}, Ldjz;-><init>()V

    iput-object v0, p0, Ldjp;->b:Ldjz;

    .line 333
    iput-wide p2, p0, Ldjp;->c:J

    .line 334
    return-void
.end method

.method static synthetic a(Ldjp;)Z
    .locals 1

    .prologue
    .line 313
    iget-boolean v0, p0, Ldjp;->d:Z

    return v0
.end method

.method static synthetic a(Ldjp;Z)Z
    .locals 0

    .prologue
    .line 313
    iput-boolean p1, p0, Ldjp;->d:Z

    return p1
.end method

.method private b()V
    .locals 4

    .prologue
    .line 373
    iget-object v0, p0, Ldjp;->e:Ldjn;

    invoke-static {v0}, Ldjn;->c(Ldjn;)Ldjq;

    move-result-object v0

    invoke-virtual {v0}, Ldjq;->j_()V

    .line 375
    :goto_0
    :try_start_0
    iget-object v0, p0, Ldjp;->b:Ldjz;

    .line 4060
    iget-wide v0, v0, Ldjz;->b:J

    .line 375
    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ldjp;->d:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ldjp;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ldjp;->e:Ldjn;

    invoke-static {v0}, Ldjn;->d(Ldjn;)Ldia;

    move-result-object v0

    if-nez v0, :cond_0

    .line 376
    iget-object v0, p0, Ldjp;->e:Ldjn;

    invoke-static {v0}, Ldjn;->e(Ldjn;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 379
    :catchall_0
    move-exception v0

    iget-object v1, p0, Ldjp;->e:Ldjn;

    invoke-static {v1}, Ldjn;->c(Ldjn;)Ldjq;

    move-result-object v1

    invoke-virtual {v1}, Ldjq;->b()V

    throw v0

    :cond_0
    iget-object v0, p0, Ldjp;->e:Ldjn;

    invoke-static {v0}, Ldjn;->c(Ldjn;)Ldjq;

    move-result-object v0

    invoke-virtual {v0}, Ldjq;->b()V

    .line 380
    return-void
.end method

.method static synthetic b(Ldjp;)Z
    .locals 1

    .prologue
    .line 313
    iget-boolean v0, p0, Ldjp;->f:Z

    return v0
.end method


# virtual methods
.method public final a(Ldjz;J)J
    .locals 8

    .prologue
    const-wide/16 v4, 0x0

    .line 338
    cmp-long v0, p2, v4

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "byteCount < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 341
    :cond_0
    iget-object v2, p0, Ldjp;->e:Ldjn;

    monitor-enter v2

    .line 342
    :try_start_0
    invoke-direct {p0}, Ldjp;->b()V

    .line 1437
    iget-boolean v0, p0, Ldjp;->f:Z

    if-eqz v0, :cond_1

    .line 1438
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 356
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1440
    :cond_1
    :try_start_1
    iget-object v0, p0, Ldjp;->e:Ldjn;

    invoke-static {v0}, Ldjn;->d(Ldjn;)Ldia;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1441
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "stream was reset: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ldjp;->e:Ldjn;

    invoke-static {v3}, Ldjn;->d(Ldjn;)Ldia;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 344
    :cond_2
    iget-object v0, p0, Ldjp;->b:Ldjz;

    .line 2060
    iget-wide v0, v0, Ldjz;->b:J

    .line 344
    cmp-long v0, v0, v4

    if-nez v0, :cond_3

    const-wide/16 v0, -0x1

    monitor-exit v2

    .line 368
    :goto_0
    return-wide v0

    .line 347
    :cond_3
    iget-object v0, p0, Ldjp;->b:Ldjz;

    iget-object v1, p0, Ldjp;->b:Ldjz;

    .line 3060
    iget-wide v4, v1, Ldjz;->b:J

    .line 347
    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-virtual {v0, p1, v4, v5}, Ldjz;->a(Ldjz;J)J

    move-result-wide v0

    .line 350
    iget-object v3, p0, Ldjp;->e:Ldjn;

    iget-wide v4, v3, Ldjn;->a:J

    add-long/2addr v4, v0

    iput-wide v4, v3, Ldjn;->a:J

    .line 351
    iget-object v3, p0, Ldjp;->e:Ldjn;

    iget-wide v4, v3, Ldjn;->a:J

    iget-object v3, p0, Ldjp;->e:Ldjn;

    .line 352
    invoke-static {v3}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v3

    iget-object v3, v3, Ldjb;->e:Ldix;

    const/high16 v6, 0x10000

    invoke-virtual {v3, v6}, Ldix;->c(I)I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-long v6, v3

    cmp-long v3, v4, v6

    if-ltz v3, :cond_4

    .line 353
    iget-object v3, p0, Ldjp;->e:Ldjn;

    invoke-static {v3}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v3

    iget-object v4, p0, Ldjp;->e:Ldjn;

    invoke-static {v4}, Ldjn;->b(Ldjn;)I

    move-result v4

    iget-object v5, p0, Ldjp;->e:Ldjn;

    iget-wide v6, v5, Ldjn;->a:J

    invoke-virtual {v3, v4, v6, v7}, Ldjb;->a(IJ)V

    .line 354
    iget-object v3, p0, Ldjp;->e:Ldjn;

    const-wide/16 v4, 0x0

    iput-wide v4, v3, Ldjn;->a:J

    .line 356
    :cond_4
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 359
    iget-object v2, p0, Ldjp;->e:Ldjn;

    invoke-static {v2}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v2

    monitor-enter v2

    .line 360
    :try_start_2
    iget-object v3, p0, Ldjp;->e:Ldjn;

    invoke-static {v3}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v3

    iget-wide v4, v3, Ldjb;->c:J

    add-long/2addr v4, v0

    iput-wide v4, v3, Ldjb;->c:J

    .line 361
    iget-object v3, p0, Ldjp;->e:Ldjn;

    invoke-static {v3}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v3

    iget-wide v4, v3, Ldjb;->c:J

    iget-object v3, p0, Ldjp;->e:Ldjn;

    .line 362
    invoke-static {v3}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v3

    iget-object v3, v3, Ldjb;->e:Ldix;

    const/high16 v6, 0x10000

    invoke-virtual {v3, v6}, Ldix;->c(I)I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-long v6, v3

    cmp-long v3, v4, v6

    if-ltz v3, :cond_5

    .line 363
    iget-object v3, p0, Ldjp;->e:Ldjn;

    invoke-static {v3}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v3

    const/4 v4, 0x0

    iget-object v5, p0, Ldjp;->e:Ldjn;

    invoke-static {v5}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v5

    iget-wide v6, v5, Ldjb;->c:J

    invoke-virtual {v3, v4, v6, v7}, Ldjb;->a(IJ)V

    .line 364
    iget-object v3, p0, Ldjp;->e:Ldjn;

    invoke-static {v3}, Ldjn;->a(Ldjn;)Ldjb;

    move-result-object v3

    const-wide/16 v4, 0x0

    iput-wide v4, v3, Ldjb;->c:J

    .line 366
    :cond_5
    monitor-exit v2

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public final a()Ldkw;
    .locals 1

    .prologue
    .line 424
    iget-object v0, p0, Ldjp;->e:Ldjn;

    invoke-static {v0}, Ldjn;->c(Ldjn;)Ldjq;

    move-result-object v0

    return-object v0
.end method

.method final a(Ldkd;J)V
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 386
    :goto_0
    cmp-long v0, p2, v10

    if-lez v0, :cond_0

    .line 389
    iget-object v3, p0, Ldjp;->e:Ldjn;

    monitor-enter v3

    .line 390
    :try_start_0
    iget-boolean v4, p0, Ldjp;->d:Z

    .line 391
    iget-object v0, p0, Ldjp;->b:Ldjz;

    .line 5060
    iget-wide v6, v0, Ldjz;->b:J

    .line 391
    add-long/2addr v6, p2

    iget-wide v8, p0, Ldjp;->c:J

    cmp-long v0, v6, v8

    if-lez v0, :cond_1

    move v0, v1

    .line 392
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 395
    if-eqz v0, :cond_2

    .line 396
    invoke-interface {p1, p2, p3}, Ldkd;->f(J)V

    .line 397
    iget-object v0, p0, Ldjp;->e:Ldjn;

    sget-object v1, Ldia;->f:Ldia;

    invoke-virtual {v0, v1}, Ldjn;->b(Ldia;)V

    .line 421
    :cond_0
    :goto_2
    return-void

    :cond_1
    move v0, v2

    .line 391
    goto :goto_1

    .line 392
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 402
    :cond_2
    if-eqz v4, :cond_3

    .line 403
    invoke-interface {p1, p2, p3}, Ldkd;->f(J)V

    goto :goto_2

    .line 408
    :cond_3
    iget-object v0, p0, Ldjp;->a:Ldjz;

    invoke-interface {p1, v0, p2, p3}, Ldkd;->a(Ldjz;J)J

    move-result-wide v4

    .line 409
    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_4

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 410
    :cond_4
    sub-long/2addr p2, v4

    .line 413
    iget-object v3, p0, Ldjp;->e:Ldjn;

    monitor-enter v3

    .line 414
    :try_start_2
    iget-object v0, p0, Ldjp;->b:Ldjz;

    .line 6060
    iget-wide v4, v0, Ldjz;->b:J

    .line 414
    cmp-long v0, v4, v10

    if-nez v0, :cond_6

    move v0, v1

    .line 415
    :goto_3
    iget-object v4, p0, Ldjp;->b:Ldjz;

    iget-object v5, p0, Ldjp;->a:Ldjz;

    invoke-virtual {v4, v5}, Ldjz;->a(Ldkv;)J

    .line 416
    if-eqz v0, :cond_5

    .line 417
    iget-object v0, p0, Ldjp;->e:Ldjn;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 419
    :cond_5
    monitor-exit v3

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_6
    move v0, v2

    .line 414
    goto :goto_3
.end method

.method public final close()V
    .locals 2

    .prologue
    .line 428
    iget-object v1, p0, Ldjp;->e:Ldjn;

    monitor-enter v1

    .line 429
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Ldjp;->f:Z

    .line 430
    iget-object v0, p0, Ldjp;->b:Ldjz;

    invoke-virtual {v0}, Ldjz;->q()V

    .line 431
    iget-object v0, p0, Ldjp;->e:Ldjn;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 432
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 433
    iget-object v0, p0, Ldjp;->e:Ldjn;

    invoke-static {v0}, Ldjn;->f(Ldjn;)V

    .line 434
    return-void

    .line 432
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
