.class final Ldja;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldid;


# instance fields
.field private final a:Ldkc;

.field private final b:Ldjz;

.field private final c:Ldkc;

.field private final d:Z

.field private e:Z


# direct methods
.method constructor <init>(Ldkc;Z)V
    .locals 3

    .prologue
    .line 294
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 295
    iput-object p1, p0, Ldja;->a:Ldkc;

    .line 296
    iput-boolean p2, p0, Ldja;->d:Z

    .line 298
    new-instance v0, Ljava/util/zip/Deflater;

    invoke-direct {v0}, Ljava/util/zip/Deflater;-><init>()V

    .line 299
    sget-object v1, Ldiy;->a:[B

    invoke-virtual {v0, v1}, Ljava/util/zip/Deflater;->setDictionary([B)V

    .line 300
    new-instance v1, Ldjz;

    invoke-direct {v1}, Ldjz;-><init>()V

    iput-object v1, p0, Ldja;->b:Ldjz;

    .line 301
    new-instance v1, Ldkf;

    iget-object v2, p0, Ldja;->b:Ldjz;

    invoke-direct {v1, v2, v0}, Ldkf;-><init>(Ldku;Ljava/util/zip/Deflater;)V

    invoke-static {v1}, Ldkk;->a(Ldku;)Ldkc;

    move-result-object v0

    iput-object v0, p0, Ldja;->c:Ldkc;

    .line 302
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 5

    .prologue
    .line 409
    iget-object v0, p0, Ldja;->b:Ldjz;

    .line 2060
    iget-wide v0, v0, Ldjz;->b:J

    .line 409
    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 410
    :cond_0
    iget-object v0, p0, Ldja;->c:Ldkc;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 411
    const/4 v0, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 412
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldie;

    iget-object v0, v0, Ldie;->h:Ldke;

    .line 413
    iget-object v3, p0, Ldja;->c:Ldkc;

    .line 2281
    iget-object v4, v0, Ldke;->b:[B

    array-length v4, v4

    .line 413
    invoke-interface {v3, v4}, Ldkc;->f(I)Ldkc;

    .line 414
    iget-object v3, p0, Ldja;->c:Ldkc;

    invoke-interface {v3, v0}, Ldkc;->b(Ldke;)Ldkc;

    .line 415
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldie;

    iget-object v0, v0, Ldie;->i:Ldke;

    .line 416
    iget-object v3, p0, Ldja;->c:Ldkc;

    .line 3281
    iget-object v4, v0, Ldke;->b:[B

    array-length v4, v4

    .line 416
    invoke-interface {v3, v4}, Ldkc;->f(I)Ldkc;

    .line 417
    iget-object v3, p0, Ldja;->c:Ldkc;

    invoke-interface {v3, v0}, Ldkc;->b(Ldke;)Ldkc;

    .line 411
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 419
    :cond_1
    iget-object v0, p0, Ldja;->c:Ldkc;

    invoke-interface {v0}, Ldkc;->flush()V

    .line 420
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 0

    .prologue
    .line 316
    monitor-enter p0

    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized a(IJ)V
    .locals 4

    .prologue
    .line 472
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ldja;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 473
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-eqz v0, :cond_1

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p2, v0

    if-lez v0, :cond_2

    .line 474
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "windowSizeIncrement must be between 1 and 0x7fffffff: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 480
    :cond_2
    iget-object v0, p0, Ldja;->a:Ldkc;

    const v1, -0x7ffcfff7

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 481
    iget-object v0, p0, Ldja;->a:Ldkc;

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 482
    iget-object v0, p0, Ldja;->a:Ldkc;

    invoke-interface {v0, p1}, Ldkc;->f(I)Ldkc;

    .line 483
    iget-object v0, p0, Ldja;->a:Ldkc;

    long-to-int v1, p2

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 484
    iget-object v0, p0, Ldja;->a:Ldkc;

    invoke-interface {v0}, Ldkc;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 485
    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized a(ILdia;)V
    .locals 2

    .prologue
    .line 373
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ldja;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 374
    :cond_0
    :try_start_1
    iget v0, p2, Ldia;->j:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 378
    :cond_1
    iget-object v0, p0, Ldja;->a:Ldkc;

    const v1, -0x7ffcfffd

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 379
    iget-object v0, p0, Ldja;->a:Ldkc;

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 380
    iget-object v0, p0, Ldja;->a:Ldkc;

    const v1, 0x7fffffff

    and-int/2addr v1, p1

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 381
    iget-object v0, p0, Ldja;->a:Ldkc;

    iget v1, p2, Ldia;->j:I

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 382
    iget-object v0, p0, Ldja;->a:Ldkc;

    invoke-interface {v0}, Ldkc;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 383
    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized a(ILdia;[B)V
    .locals 2

    .prologue
    .line 456
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ldja;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 457
    :cond_0
    :try_start_1
    iget v0, p2, Ldia;->k:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 458
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "errorCode.spdyGoAwayCode == -1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 463
    :cond_1
    iget-object v0, p0, Ldja;->a:Ldkc;

    const v1, -0x7ffcfff9

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 464
    iget-object v0, p0, Ldja;->a:Ldkc;

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 465
    iget-object v0, p0, Ldja;->a:Ldkc;

    invoke-interface {v0, p1}, Ldkc;->f(I)Ldkc;

    .line 466
    iget-object v0, p0, Ldja;->a:Ldkc;

    iget v1, p2, Ldia;->k:I

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 467
    iget-object v0, p0, Ldja;->a:Ldkc;

    invoke-interface {v0}, Ldkc;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 468
    monitor-exit p0

    return-void
.end method

.method public final a(Ldix;)V
    .locals 0

    .prologue
    .line 306
    return-void
.end method

.method public final declared-synchronized a(ZII)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 442
    monitor-enter p0

    :try_start_0
    iget-boolean v2, p0, Ldja;->e:Z

    if-eqz v2, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 443
    :cond_0
    :try_start_1
    iget-boolean v3, p0, Ldja;->d:Z

    and-int/lit8 v2, p2, 0x1

    if-ne v2, v0, :cond_1

    move v2, v0

    :goto_0
    if-eq v3, v2, :cond_2

    .line 444
    :goto_1
    if-eq p1, v0, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "payload != reply"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move v2, v1

    .line 443
    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    .line 448
    :cond_3
    iget-object v0, p0, Ldja;->a:Ldkc;

    const v1, -0x7ffcfffa

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 449
    iget-object v0, p0, Ldja;->a:Ldkc;

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 450
    iget-object v0, p0, Ldja;->a:Ldkc;

    invoke-interface {v0, p2}, Ldkc;->f(I)Ldkc;

    .line 451
    iget-object v0, p0, Ldja;->a:Ldkc;

    invoke-interface {v0}, Ldkc;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 452
    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized a(ZILdjz;I)V
    .locals 6

    .prologue
    .line 391
    monitor-enter p0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 1397
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Ldja;->e:Z

    if-eqz v1, :cond_1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 391
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 1398
    :cond_1
    int-to-long v2, p4

    const-wide/32 v4, 0xffffff

    cmp-long v1, v2, v4

    if-lez v1, :cond_2

    .line 1399
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "FRAME_TOO_LARGE max size is 16Mib: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1401
    :cond_2
    iget-object v1, p0, Ldja;->a:Ldkc;

    const v2, 0x7fffffff

    and-int/2addr v2, p2

    invoke-interface {v1, v2}, Ldkc;->f(I)Ldkc;

    .line 1402
    iget-object v1, p0, Ldja;->a:Ldkc;

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const v2, 0xffffff

    and-int/2addr v2, p4

    or-int/2addr v0, v2

    invoke-interface {v1, v0}, Ldkc;->f(I)Ldkc;

    .line 1403
    if-lez p4, :cond_3

    .line 1404
    iget-object v0, p0, Ldja;->a:Ldkc;

    int-to-long v2, p4

    invoke-interface {v0, p3, v2, v3}, Ldkc;->a_(Ldjz;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 393
    :cond_3
    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized a(ZZIILjava/util/List;)V
    .locals 7

    .prologue
    const v6, 0x7fffffff

    const/4 v0, 0x0

    .line 326
    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Ldja;->e:Z

    if-eqz v1, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 327
    :cond_0
    :try_start_1
    invoke-direct {p0, p5}, Ldja;->a(Ljava/util/List;)V

    .line 328
    const-wide/16 v2, 0xa

    iget-object v1, p0, Ldja;->b:Ldjz;

    .line 1060
    iget-wide v4, v1, Ldjz;->b:J

    .line 328
    add-long/2addr v2, v4

    long-to-int v2, v2

    .line 330
    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :goto_0
    if-eqz p2, :cond_1

    const/4 v0, 0x2

    :cond_1
    or-int/2addr v0, v1

    .line 333
    iget-object v1, p0, Ldja;->a:Ldkc;

    const v3, -0x7ffcffff

    invoke-interface {v1, v3}, Ldkc;->f(I)Ldkc;

    .line 334
    iget-object v1, p0, Ldja;->a:Ldkc;

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const v3, 0xffffff

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    invoke-interface {v1, v0}, Ldkc;->f(I)Ldkc;

    .line 335
    iget-object v0, p0, Ldja;->a:Ldkc;

    and-int v1, p3, v6

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 336
    iget-object v0, p0, Ldja;->a:Ldkc;

    and-int v1, p4, v6

    invoke-interface {v0, v1}, Ldkc;->f(I)Ldkc;

    .line 337
    iget-object v0, p0, Ldja;->a:Ldkc;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ldkc;->g(I)Ldkc;

    .line 338
    iget-object v0, p0, Ldja;->a:Ldkc;

    iget-object v1, p0, Ldja;->b:Ldjz;

    invoke-interface {v0, v1}, Ldkc;->a(Ldkv;)J

    .line 339
    iget-object v0, p0, Ldja;->a:Ldkc;

    invoke-interface {v0}, Ldkc;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 340
    monitor-exit p0

    return-void

    :cond_2
    move v1, v0

    .line 330
    goto :goto_0
.end method

.method public final declared-synchronized b()V
    .locals 2

    .prologue
    .line 319
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ldja;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 320
    :cond_0
    :try_start_1
    iget-object v0, p0, Ldja;->a:Ldkc;

    invoke-interface {v0}, Ldkc;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 321
    monitor-exit p0

    return-void
.end method

.method public final declared-synchronized b(Ldix;)V
    .locals 5

    .prologue
    const v4, 0xffffff

    .line 423
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ldja;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 4132
    :cond_0
    :try_start_1
    iget v0, p1, Ldix;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v0

    .line 427
    shl-int/lit8 v1, v0, 0x3

    add-int/lit8 v1, v1, 0x4

    .line 428
    iget-object v2, p0, Ldja;->a:Ldkc;

    const v3, -0x7ffcfffc

    invoke-interface {v2, v3}, Ldkc;->f(I)Ldkc;

    .line 429
    iget-object v2, p0, Ldja;->a:Ldkc;

    and-int/2addr v1, v4

    or-int/lit8 v1, v1, 0x0

    invoke-interface {v2, v1}, Ldkc;->f(I)Ldkc;

    .line 430
    iget-object v1, p0, Ldja;->a:Ldkc;

    invoke-interface {v1, v0}, Ldkc;->f(I)Ldkc;

    .line 431
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-gt v0, v1, :cond_2

    .line 432
    invoke-virtual {p1, v0}, Ldix;->a(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 433
    invoke-virtual {p1, v0}, Ldix;->b(I)I

    move-result v1

    .line 434
    iget-object v2, p0, Ldja;->a:Ldkc;

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    and-int v3, v0, v4

    or-int/2addr v1, v3

    invoke-interface {v2, v1}, Ldkc;->f(I)Ldkc;

    .line 435
    iget-object v1, p0, Ldja;->a:Ldkc;

    .line 5119
    iget-object v2, p1, Ldix;->d:[I

    aget v2, v2, v0

    .line 435
    invoke-interface {v1, v2}, Ldkc;->f(I)Ldkc;

    .line 431
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 437
    :cond_2
    iget-object v0, p0, Ldja;->a:Ldkc;

    invoke-interface {v0}, Ldkc;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 438
    monitor-exit p0

    return-void
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 386
    const/16 v0, 0x3fff

    return v0
.end method

.method public final declared-synchronized close()V
    .locals 2

    .prologue
    .line 488
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Ldja;->e:Z

    .line 489
    iget-object v0, p0, Ldja;->a:Ldkc;

    iget-object v1, p0, Ldja;->c:Ldkc;

    invoke-static {v0, v1}, Ldgs;->a(Ljava/io/Closeable;Ljava/io/Closeable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 490
    monitor-exit p0

    return-void

    .line 488
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
