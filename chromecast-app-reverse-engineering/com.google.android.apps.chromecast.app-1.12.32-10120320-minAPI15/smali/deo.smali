.class public final Ldeo;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:[B

.field b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I


# direct methods
.method constructor <init>([BII)V
    .locals 1

    .prologue
    .line 417
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 405
    const v0, 0x7fffffff

    iput v0, p0, Ldeo;->g:I

    .line 409
    const/16 v0, 0x40

    iput v0, p0, Ldeo;->i:I

    .line 418
    iput-object p1, p0, Ldeo;->a:[B

    .line 419
    iput p2, p0, Ldeo;->b:I

    .line 420
    add-int v0, p2, p3

    iput v0, p0, Ldeo;->c:I

    .line 421
    iput p2, p0, Ldeo;->e:I

    .line 422
    return-void
.end method

.method private f(I)V
    .locals 2

    .prologue
    .line 625
    if-gez p1, :cond_0

    .line 626
    invoke-static {}, Ldev;->b()Ldev;

    move-result-object v0

    throw v0

    .line 629
    :cond_0
    iget v0, p0, Ldeo;->e:I

    add-int/2addr v0, p1

    iget v1, p0, Ldeo;->g:I

    if-le v0, v1, :cond_1

    .line 631
    iget v0, p0, Ldeo;->g:I

    iget v1, p0, Ldeo;->e:I

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Ldeo;->f(I)V

    .line 633
    invoke-static {}, Ldev;->a()Ldev;

    move-result-object v0

    throw v0

    .line 636
    :cond_1
    iget v0, p0, Ldeo;->c:I

    iget v1, p0, Ldeo;->e:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_2

    .line 638
    iget v0, p0, Ldeo;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Ldeo;->e:I

    return-void

    .line 640
    :cond_2
    invoke-static {}, Ldev;->a()Ldev;

    move-result-object v0

    throw v0
.end method

.method private j()V
    .locals 2

    .prologue
    .line 495
    iget v0, p0, Ldeo;->c:I

    iget v1, p0, Ldeo;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Ldeo;->c:I

    .line 496
    iget v0, p0, Ldeo;->c:I

    .line 497
    iget v1, p0, Ldeo;->g:I

    if-le v0, v1, :cond_0

    .line 499
    iget v1, p0, Ldeo;->g:I

    sub-int/2addr v0, v1

    iput v0, p0, Ldeo;->d:I

    .line 500
    iget v0, p0, Ldeo;->c:I

    iget v1, p0, Ldeo;->d:I

    sub-int/2addr v0, v1

    iput v0, p0, Ldeo;->c:I

    .line 504
    :goto_0
    return-void

    .line 502
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Ldeo;->d:I

    goto :goto_0
.end method

.method private k()B
    .locals 3

    .prologue
    .line 583
    iget v0, p0, Ldeo;->e:I

    iget v1, p0, Ldeo;->c:I

    if-ne v0, v1, :cond_0

    .line 584
    invoke-static {}, Ldev;->a()Ldev;

    move-result-object v0

    throw v0

    .line 586
    :cond_0
    iget-object v0, p0, Ldeo;->a:[B

    iget v1, p0, Ldeo;->e:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ldeo;->e:I

    aget-byte v0, v0, v1

    return v0
.end method


# virtual methods
.method public final a()I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 71
    .line 1535
    iget v1, p0, Ldeo;->e:I

    iget v2, p0, Ldeo;->c:I

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    .line 71
    :goto_0
    if-eqz v1, :cond_1

    .line 72
    iput v0, p0, Ldeo;->f:I

    .line 81
    :goto_1
    return v0

    :cond_0
    move v1, v0

    .line 1535
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {p0}, Ldeo;->e()I

    move-result v0

    iput v0, p0, Ldeo;->f:I

    .line 77
    iget v0, p0, Ldeo;->f:I

    if-nez v0, :cond_2

    .line 79
    invoke-static {}, Ldev;->d()Ldev;

    move-result-object v0

    throw v0

    .line 81
    :cond_2
    iget v0, p0, Ldeo;->f:I

    goto :goto_1
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 94
    iget v0, p0, Ldeo;->f:I

    if-eq v0, p1, :cond_0

    .line 95
    invoke-static {}, Ldev;->e()Ldev;

    move-result-object v0

    throw v0

    .line 97
    :cond_0
    return-void
.end method

.method public final a(Ldew;)V
    .locals 3

    .prologue
    .line 217
    invoke-virtual {p0}, Ldeo;->e()I

    move-result v0

    .line 218
    iget v1, p0, Ldeo;->h:I

    iget v2, p0, Ldeo;->i:I

    if-lt v1, v2, :cond_0

    .line 219
    invoke-static {}, Ldev;->g()Ldev;

    move-result-object v0

    throw v0

    .line 221
    :cond_0
    invoke-virtual {p0, v0}, Ldeo;->c(I)I

    move-result v0

    .line 222
    iget v1, p0, Ldeo;->h:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ldeo;->h:I

    .line 223
    invoke-virtual {p1, p0}, Ldew;->a(Ldeo;)Ldew;

    .line 224
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ldeo;->a(I)V

    .line 225
    iget v1, p0, Ldeo;->h:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ldeo;->h:I

    .line 226
    invoke-virtual {p0, v0}, Ldeo;->d(I)V

    .line 227
    return-void
.end method

.method public final b()J
    .locals 6

    .prologue
    .line 164
    .line 3322
    const/4 v2, 0x0

    .line 3323
    const-wide/16 v0, 0x0

    .line 3324
    :goto_0
    const/16 v3, 0x40

    if-ge v2, v3, :cond_1

    .line 3325
    invoke-direct {p0}, Ldeo;->k()B

    move-result v3

    .line 3326
    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v2

    or-long/2addr v0, v4

    .line 3327
    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_0

    .line 3328
    return-wide v0

    .line 3330
    :cond_0
    add-int/lit8 v2, v2, 0x7

    .line 3331
    goto :goto_0

    .line 3332
    :cond_1
    invoke-static {}, Ldev;->c()Ldev;

    move-result-object v0

    throw v0
.end method

.method public final b(I)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 106
    invoke-static {p1}, Ldey;->a(I)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 128
    invoke-static {}, Ldev;->f()Ldev;

    move-result-object v0

    throw v0

    .line 2169
    :pswitch_0
    invoke-virtual {p0}, Ldeo;->e()I

    .line 126
    :goto_0
    return v0

    .line 111
    :pswitch_1
    invoke-virtual {p0}, Ldeo;->g()J

    goto :goto_0

    .line 114
    :pswitch_2
    invoke-virtual {p0}, Ldeo;->e()I

    move-result v1

    invoke-direct {p0, v1}, Ldeo;->f(I)V

    goto :goto_0

    .line 3138
    :cond_0
    :pswitch_3
    invoke-virtual {p0}, Ldeo;->a()I

    move-result v1

    .line 3139
    if-eqz v1, :cond_1

    invoke-virtual {p0, v1}, Ldeo;->b(I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 119
    :cond_1
    invoke-static {p1}, Ldey;->b(I)I

    move-result v1

    const/4 v2, 0x4

    invoke-static {v1, v2}, Ldey;->a(II)I

    move-result v1

    .line 118
    invoke-virtual {p0, v1}, Ldeo;->a(I)V

    goto :goto_0

    .line 123
    :pswitch_4
    const/4 v0, 0x0

    goto :goto_0

    .line 125
    :pswitch_5
    invoke-virtual {p0}, Ldeo;->f()I

    goto :goto_0

    .line 106
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final c(I)I
    .locals 2

    .prologue
    .line 479
    if-gez p1, :cond_0

    .line 480
    invoke-static {}, Ldev;->b()Ldev;

    move-result-object v0

    throw v0

    .line 482
    :cond_0
    iget v0, p0, Ldeo;->e:I

    add-int/2addr v0, p1

    .line 483
    iget v1, p0, Ldeo;->g:I

    .line 484
    if-le v0, v1, :cond_1

    .line 485
    invoke-static {}, Ldev;->a()Ldev;

    move-result-object v0

    throw v0

    .line 487
    :cond_1
    iput v0, p0, Ldeo;->g:I

    .line 489
    invoke-direct {p0}, Ldeo;->j()V

    .line 491
    return v1
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 184
    invoke-virtual {p0}, Ldeo;->e()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Ljava/lang/String;
    .locals 6

    .prologue
    .line 189
    invoke-virtual {p0}, Ldeo;->e()I

    move-result v1

    .line 190
    iget v0, p0, Ldeo;->c:I

    iget v2, p0, Ldeo;->e:I

    sub-int/2addr v0, v2

    if-gt v1, v0, :cond_0

    if-lez v1, :cond_0

    .line 193
    new-instance v0, Ljava/lang/String;

    iget-object v2, p0, Ldeo;->a:[B

    iget v3, p0, Ldeo;->e:I

    const-string v4, "UTF-8"

    invoke-direct {v0, v2, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 194
    iget v2, p0, Ldeo;->e:I

    add-int/2addr v1, v2

    iput v1, p0, Ldeo;->e:I

    .line 198
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 3596
    if-gez v1, :cond_1

    .line 3597
    invoke-static {}, Ldev;->b()Ldev;

    move-result-object v0

    throw v0

    .line 3600
    :cond_1
    iget v2, p0, Ldeo;->e:I

    add-int/2addr v2, v1

    iget v3, p0, Ldeo;->g:I

    if-le v2, v3, :cond_2

    .line 3602
    iget v0, p0, Ldeo;->g:I

    iget v1, p0, Ldeo;->e:I

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Ldeo;->f(I)V

    .line 3604
    invoke-static {}, Ldev;->a()Ldev;

    move-result-object v0

    throw v0

    .line 3607
    :cond_2
    iget v2, p0, Ldeo;->c:I

    iget v3, p0, Ldeo;->e:I

    sub-int/2addr v2, v3

    if-gt v1, v2, :cond_3

    .line 3609
    new-array v2, v1, [B

    .line 3610
    iget-object v3, p0, Ldeo;->a:[B

    iget v4, p0, Ldeo;->e:I

    const/4 v5, 0x0

    invoke-static {v3, v4, v2, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3611
    iget v3, p0, Ldeo;->e:I

    add-int/2addr v1, v3

    iput v1, p0, Ldeo;->e:I

    .line 198
    const-string v1, "UTF-8"

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    goto :goto_0

    .line 3614
    :cond_3
    invoke-static {}, Ldev;->a()Ldev;

    move-result-object v0

    throw v0
.end method

.method public final d(I)V
    .locals 0

    .prologue
    .line 512
    iput p1, p0, Ldeo;->g:I

    .line 513
    invoke-direct {p0}, Ldeo;->j()V

    .line 514
    return-void
.end method

.method public final e()I
    .locals 3

    .prologue
    .line 287
    invoke-direct {p0}, Ldeo;->k()B

    move-result v0

    .line 288
    if-ltz v0, :cond_1

    .line 317
    :cond_0
    :goto_0
    return v0

    .line 291
    :cond_1
    and-int/lit8 v0, v0, 0x7f

    .line 292
    invoke-direct {p0}, Ldeo;->k()B

    move-result v1

    if-ltz v1, :cond_2

    .line 293
    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    goto :goto_0

    .line 295
    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    .line 296
    invoke-direct {p0}, Ldeo;->k()B

    move-result v1

    if-ltz v1, :cond_3

    .line 297
    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    goto :goto_0

    .line 299
    :cond_3
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    .line 300
    invoke-direct {p0}, Ldeo;->k()B

    move-result v1

    if-ltz v1, :cond_4

    .line 301
    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    goto :goto_0

    .line 303
    :cond_4
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    .line 304
    invoke-direct {p0}, Ldeo;->k()B

    move-result v1

    shl-int/lit8 v2, v1, 0x1c

    or-int/2addr v0, v2

    .line 305
    if-gez v1, :cond_0

    .line 307
    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x5

    if-ge v1, v2, :cond_5

    .line 308
    invoke-direct {p0}, Ldeo;->k()B

    move-result v2

    if-gez v2, :cond_0

    .line 307
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 312
    :cond_5
    invoke-static {}, Ldev;->c()Ldev;

    move-result-object v0

    throw v0
.end method

.method public final e(I)V
    .locals 4

    .prologue
    .line 566
    iget v0, p0, Ldeo;->e:I

    iget v1, p0, Ldeo;->b:I

    sub-int/2addr v0, v1

    if-le p1, v0, :cond_0

    .line 567
    new-instance v0, Ljava/lang/IllegalArgumentException;

    iget v1, p0, Ldeo;->e:I

    iget v2, p0, Ldeo;->b:I

    sub-int/2addr v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x32

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Position "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is beyond current "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 570
    :cond_0
    if-gez p1, :cond_1

    .line 571
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Bad position "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 573
    :cond_1
    iget v0, p0, Ldeo;->b:I

    add-int/2addr v0, p1

    iput v0, p0, Ldeo;->e:I

    .line 574
    return-void
.end method

.method public final f()I
    .locals 4

    .prologue
    .line 337
    invoke-direct {p0}, Ldeo;->k()B

    move-result v0

    .line 338
    invoke-direct {p0}, Ldeo;->k()B

    move-result v1

    .line 339
    invoke-direct {p0}, Ldeo;->k()B

    move-result v2

    .line 340
    invoke-direct {p0}, Ldeo;->k()B

    move-result v3

    .line 341
    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    and-int/lit16 v1, v2, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    and-int/lit16 v1, v3, 0xff

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method public final g()J
    .locals 14

    .prologue
    const-wide/16 v12, 0xff

    .line 349
    invoke-direct {p0}, Ldeo;->k()B

    move-result v0

    .line 350
    invoke-direct {p0}, Ldeo;->k()B

    move-result v1

    .line 351
    invoke-direct {p0}, Ldeo;->k()B

    move-result v2

    .line 352
    invoke-direct {p0}, Ldeo;->k()B

    move-result v3

    .line 353
    invoke-direct {p0}, Ldeo;->k()B

    move-result v4

    .line 354
    invoke-direct {p0}, Ldeo;->k()B

    move-result v5

    .line 355
    invoke-direct {p0}, Ldeo;->k()B

    move-result v6

    .line 356
    invoke-direct {p0}, Ldeo;->k()B

    move-result v7

    .line 357
    int-to-long v8, v0

    and-long/2addr v8, v12

    int-to-long v0, v1

    and-long/2addr v0, v12

    const/16 v10, 0x8

    shl-long/2addr v0, v10

    or-long/2addr v0, v8

    int-to-long v8, v2

    and-long/2addr v8, v12

    const/16 v2, 0x10

    shl-long/2addr v8, v2

    or-long/2addr v0, v8

    int-to-long v2, v3

    and-long/2addr v2, v12

    const/16 v8, 0x18

    shl-long/2addr v2, v8

    or-long/2addr v0, v2

    int-to-long v2, v4

    and-long/2addr v2, v12

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    int-to-long v2, v5

    and-long/2addr v2, v12

    const/16 v4, 0x28

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    int-to-long v2, v6

    and-long/2addr v2, v12

    const/16 v4, 0x30

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    int-to-long v2, v7

    and-long/2addr v2, v12

    const/16 v4, 0x38

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final h()I
    .locals 2

    .prologue
    .line 521
    iget v0, p0, Ldeo;->g:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    .line 522
    const/4 v0, -0x1

    .line 526
    :goto_0
    return v0

    .line 525
    :cond_0
    iget v0, p0, Ldeo;->e:I

    .line 526
    iget v1, p0, Ldeo;->g:I

    sub-int v0, v1, v0

    goto :goto_0
.end method

.method public final i()I
    .locals 2

    .prologue
    .line 542
    iget v0, p0, Ldeo;->e:I

    iget v1, p0, Ldeo;->b:I

    sub-int/2addr v0, v1

    return v0
.end method
