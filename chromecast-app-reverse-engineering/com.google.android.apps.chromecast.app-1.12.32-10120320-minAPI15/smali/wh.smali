.class public final Lwh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lyp;


# instance fields
.field final a:Ljava/util/ArrayList;

.field private b:Leo;

.field private c:Ljava/util/ArrayList;

.field private d:Lwi;

.field private e:Z

.field private f:Lyo;


# direct methods
.method public constructor <init>(Lwi;)V
    .locals 1

    .prologue
    .line 71
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lwh;-><init>(Lwi;Z)V

    .line 72
    return-void
.end method

.method private constructor <init>(Lwi;Z)V
    .locals 2

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Leo;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, Leo;-><init>(I)V

    iput-object v0, p0, Lwh;->b:Leo;

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lwh;->a:Ljava/util/ArrayList;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    .line 75
    iput-object p1, p0, Lwh;->d:Lwi;

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lwh;->e:Z

    .line 77
    new-instance v0, Lyo;

    invoke-direct {v0, p0}, Lyo;-><init>(Lyp;)V

    iput-object v0, p0, Lwh;->f:Lyo;

    .line 78
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 3

    .prologue
    .line 705
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 706
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 707
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwj;

    invoke-virtual {p0, v0}, Lwh;->a(Lwj;)V

    .line 706
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 709
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 710
    return-void
.end method

.method private a(Lwj;I)V
    .locals 2

    .prologue
    .line 308
    iget-object v0, p0, Lwh;->d:Lwi;

    invoke-interface {v0, p1}, Lwi;->a(Lwj;)V

    .line 309
    iget v0, p1, Lwj;->a:I

    packed-switch v0, :pswitch_data_0

    .line 317
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "only remove and update ops can be dispatched in first pass"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 311
    :pswitch_0
    iget-object v0, p0, Lwh;->d:Lwi;

    iget v1, p1, Lwj;->c:I

    invoke-interface {v0, p2, v1}, Lwi;->a(II)V

    .line 315
    :goto_0
    return-void

    .line 314
    :pswitch_1
    iget-object v0, p0, Lwh;->d:Lwi;

    iget v1, p1, Lwj;->c:I

    invoke-interface {v0, p2, v1}, Lwi;->c(II)V

    goto :goto_0

    .line 309
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private b(II)I
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x1

    .line 323
    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 324
    add-int/lit8 v0, v0, -0x1

    move v4, v0

    move v1, p1

    :goto_0
    if-ltz v4, :cond_e

    .line 325
    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwj;

    .line 326
    iget v2, v0, Lwj;->a:I

    if-ne v2, v6, :cond_9

    .line 328
    iget v2, v0, Lwj;->b:I

    iget v3, v0, Lwj;->c:I

    if-ge v2, v3, :cond_1

    .line 329
    iget v3, v0, Lwj;->b:I

    .line 330
    iget v2, v0, Lwj;->c:I

    .line 335
    :goto_1
    if-lt v1, v3, :cond_6

    if-gt v1, v2, :cond_6

    .line 337
    iget v2, v0, Lwj;->b:I

    if-ne v3, v2, :cond_3

    .line 338
    if-nez p2, :cond_2

    .line 339
    iget v2, v0, Lwj;->c:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Lwj;->c:I

    .line 344
    :cond_0
    :goto_2
    add-int/lit8 v0, v1, 0x1

    .line 324
    :goto_3
    add-int/lit8 v1, v4, -0x1

    move v4, v1

    move v1, v0

    goto :goto_0

    .line 332
    :cond_1
    iget v3, v0, Lwj;->c:I

    .line 333
    iget v2, v0, Lwj;->b:I

    goto :goto_1

    .line 340
    :cond_2
    if-ne p2, v5, :cond_0

    .line 341
    iget v2, v0, Lwj;->c:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v0, Lwj;->c:I

    goto :goto_2

    .line 346
    :cond_3
    if-nez p2, :cond_5

    .line 347
    iget v2, v0, Lwj;->b:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Lwj;->b:I

    .line 352
    :cond_4
    :goto_4
    add-int/lit8 v0, v1, -0x1

    goto :goto_3

    .line 348
    :cond_5
    if-ne p2, v5, :cond_4

    .line 349
    iget v2, v0, Lwj;->b:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v0, Lwj;->b:I

    goto :goto_4

    .line 354
    :cond_6
    iget v2, v0, Lwj;->b:I

    if-ge v1, v2, :cond_8

    .line 356
    if-nez p2, :cond_7

    .line 357
    iget v2, v0, Lwj;->b:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Lwj;->b:I

    .line 358
    iget v2, v0, Lwj;->c:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Lwj;->c:I

    move v0, v1

    goto :goto_3

    .line 359
    :cond_7
    if-ne p2, v5, :cond_8

    .line 360
    iget v2, v0, Lwj;->b:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v0, Lwj;->b:I

    .line 361
    iget v2, v0, Lwj;->c:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v0, Lwj;->c:I

    :cond_8
    move v0, v1

    .line 364
    goto :goto_3

    .line 365
    :cond_9
    iget v2, v0, Lwj;->b:I

    if-gt v2, v1, :cond_b

    .line 366
    iget v2, v0, Lwj;->a:I

    if-nez v2, :cond_a

    .line 367
    iget v0, v0, Lwj;->c:I

    sub-int v0, v1, v0

    goto :goto_3

    .line 368
    :cond_a
    iget v2, v0, Lwj;->a:I

    if-ne v2, v5, :cond_d

    .line 369
    iget v0, v0, Lwj;->c:I

    add-int/2addr v0, v1

    goto :goto_3

    .line 372
    :cond_b
    if-nez p2, :cond_c

    .line 373
    iget v2, v0, Lwj;->b:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Lwj;->b:I

    move v0, v1

    goto :goto_3

    .line 374
    :cond_c
    if-ne p2, v5, :cond_d

    .line 375
    iget v2, v0, Lwj;->b:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v0, Lwj;->b:I

    :cond_d
    move v0, v1

    goto :goto_3

    .line 388
    :cond_e
    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_5
    if-ltz v2, :cond_12

    .line 389
    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwj;

    .line 390
    iget v3, v0, Lwj;->a:I

    if-ne v3, v6, :cond_11

    .line 391
    iget v3, v0, Lwj;->c:I

    iget v4, v0, Lwj;->b:I

    if-eq v3, v4, :cond_f

    iget v3, v0, Lwj;->c:I

    if-gez v3, :cond_10

    .line 392
    :cond_f
    iget-object v3, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 393
    invoke-virtual {p0, v0}, Lwh;->a(Lwj;)V

    .line 388
    :cond_10
    :goto_6
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_5

    .line 395
    :cond_11
    iget v3, v0, Lwj;->c:I

    if-gtz v3, :cond_10

    .line 396
    iget-object v3, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 397
    invoke-virtual {p0, v0}, Lwh;->a(Lwj;)V

    goto :goto_6

    .line 400
    :cond_12
    return v1
.end method

.method private b(Lwj;)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 225
    iget v0, p1, Lwj;->a:I

    if-eqz v0, :cond_0

    iget v0, p1, Lwj;->a:I

    const/4 v3, 0x3

    if-ne v0, v3, :cond_1

    .line 226
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "should not dispatch add or move for pre layout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 239
    :cond_1
    iget v0, p1, Lwj;->b:I

    iget v3, p1, Lwj;->a:I

    invoke-direct {p0, v0, v3}, Lwh;->b(II)I

    move-result v4

    .line 244
    iget v3, p1, Lwj;->b:I

    .line 246
    iget v0, p1, Lwj;->a:I

    packed-switch v0, :pswitch_data_0

    .line 254
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "op should be remove or update."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    move v0, v1

    :goto_0
    move v5, v1

    move v6, v4

    move v4, v3

    move v3, v1

    .line 256
    :goto_1
    iget v7, p1, Lwj;->c:I

    if-ge v3, v7, :cond_6

    .line 257
    iget v7, p1, Lwj;->b:I

    mul-int v8, v0, v3

    add-int/2addr v7, v8

    .line 258
    iget v8, p1, Lwj;->a:I

    invoke-direct {p0, v7, v8}, Lwh;->b(II)I

    move-result v8

    .line 263
    iget v7, p1, Lwj;->a:I

    packed-switch v7, :pswitch_data_1

    move v7, v2

    .line 271
    :goto_2
    if-eqz v7, :cond_4

    .line 272
    add-int/lit8 v5, v5, 0x1

    .line 256
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :pswitch_1
    move v0, v2

    .line 252
    goto :goto_0

    .line 265
    :pswitch_2
    add-int/lit8 v7, v6, 0x1

    if-ne v8, v7, :cond_2

    move v7, v1

    goto :goto_2

    :cond_2
    move v7, v2

    goto :goto_2

    .line 268
    :pswitch_3
    if-ne v8, v6, :cond_3

    move v7, v1

    goto :goto_2

    :cond_3
    move v7, v2

    goto :goto_2

    .line 275
    :cond_4
    iget v7, p1, Lwj;->a:I

    invoke-virtual {p0, v7, v6, v5}, Lwh;->a(III)Lwj;

    move-result-object v6

    .line 279
    invoke-direct {p0, v6, v4}, Lwh;->a(Lwj;I)V

    .line 280
    invoke-virtual {p0, v6}, Lwh;->a(Lwj;)V

    .line 281
    iget v6, p1, Lwj;->a:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_5

    .line 282
    add-int/2addr v4, v5

    :cond_5
    move v5, v1

    move v6, v8

    .line 285
    goto :goto_3

    .line 288
    :cond_6
    invoke-virtual {p0, p1}, Lwh;->a(Lwj;)V

    .line 289
    if-lez v5, :cond_7

    .line 290
    iget v0, p1, Lwj;->a:I

    invoke-virtual {p0, v0, v6, v5}, Lwh;->a(III)Lwj;

    move-result-object v0

    .line 294
    invoke-direct {p0, v0, v4}, Lwh;->a(Lwj;I)V

    .line 295
    invoke-virtual {p0, v0}, Lwh;->a(Lwj;)V

    .line 305
    :cond_7
    return-void

    .line 246
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 263
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private b(I)Z
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 404
    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v3, v2

    .line 405
    :goto_0
    if-ge v3, v4, :cond_3

    .line 406
    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwj;

    .line 407
    iget v5, v0, Lwj;->a:I

    const/4 v6, 0x3

    if-ne v5, v6, :cond_0

    .line 408
    iget v0, v0, Lwj;->c:I

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {p0, v0, v5}, Lwh;->a(II)I

    move-result v0

    if-ne v0, p1, :cond_2

    move v0, v1

    .line 421
    :goto_1
    return v0

    .line 411
    :cond_0
    iget v5, v0, Lwj;->a:I

    if-nez v5, :cond_2

    .line 413
    iget v5, v0, Lwj;->b:I

    iget v6, v0, Lwj;->c:I

    add-int/2addr v5, v6

    .line 414
    iget v0, v0, Lwj;->b:I

    :goto_2
    if-ge v0, v5, :cond_2

    .line 415
    add-int/lit8 v6, v3, 0x1

    invoke-virtual {p0, v0, v6}, Lwh;->a(II)I

    move-result v6

    if-ne v6, p1, :cond_1

    move v0, v1

    .line 416
    goto :goto_1

    .line 414
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 405
    :cond_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :cond_3
    move v0, v2

    .line 421
    goto :goto_1
.end method

.method private c(Lwj;)V
    .locals 3

    .prologue
    .line 432
    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 433
    iget v0, p1, Lwj;->a:I

    packed-switch v0, :pswitch_data_0

    .line 448
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown update op type for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 435
    :pswitch_0
    iget-object v0, p0, Lwh;->d:Lwi;

    iget v1, p1, Lwj;->b:I

    iget v2, p1, Lwj;->c:I

    invoke-interface {v0, v1, v2}, Lwi;->d(II)V

    .line 446
    :goto_0
    return-void

    .line 438
    :pswitch_1
    iget-object v0, p0, Lwh;->d:Lwi;

    iget v1, p1, Lwj;->b:I

    iget v2, p1, Lwj;->c:I

    invoke-interface {v0, v1, v2}, Lwi;->e(II)V

    goto :goto_0

    .line 441
    :pswitch_2
    iget-object v0, p0, Lwh;->d:Lwi;

    iget v1, p1, Lwj;->b:I

    iget v2, p1, Lwj;->c:I

    invoke-interface {v0, v1, v2}, Lwi;->b(II)V

    goto :goto_0

    .line 445
    :pswitch_3
    iget-object v0, p0, Lwh;->d:Lwi;

    iget v1, p1, Lwj;->b:I

    iget v2, p1, Lwj;->c:I

    invoke-interface {v0, v1, v2}, Lwi;->c(II)V

    goto :goto_0

    .line 433
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method final a(I)I
    .locals 1

    .prologue
    .line 457
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lwh;->a(II)I

    move-result v0

    return v0
.end method

.method final a(II)I
    .locals 5

    .prologue
    .line 461
    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v1, p1

    .line 462
    :goto_0
    if-ge p2, v2, :cond_4

    .line 463
    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwj;

    .line 464
    iget v3, v0, Lwj;->a:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_3

    .line 465
    iget v3, v0, Lwj;->b:I

    if-ne v3, v1, :cond_1

    .line 466
    iget v1, v0, Lwj;->c:I

    .line 462
    :cond_0
    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 468
    :cond_1
    iget v3, v0, Lwj;->b:I

    if-ge v3, v1, :cond_2

    .line 469
    add-int/lit8 v1, v1, -0x1

    .line 471
    :cond_2
    iget v0, v0, Lwj;->c:I

    if-gt v0, v1, :cond_0

    .line 472
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 475
    :cond_3
    iget v3, v0, Lwj;->b:I

    if-gt v3, v1, :cond_0

    .line 476
    iget v3, v0, Lwj;->a:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_6

    .line 477
    iget v3, v0, Lwj;->b:I

    iget v4, v0, Lwj;->c:I

    add-int/2addr v3, v4

    if-ge v1, v3, :cond_5

    .line 478
    const/4 v1, -0x1

    .line 486
    :cond_4
    return v1

    .line 480
    :cond_5
    iget v0, v0, Lwj;->c:I

    sub-int/2addr v1, v0

    goto :goto_1

    .line 481
    :cond_6
    iget v3, v0, Lwj;->a:I

    if-nez v3, :cond_0

    .line 482
    iget v0, v0, Lwj;->c:I

    add-int/2addr v1, v0

    goto :goto_1
.end method

.method public final a(III)Lwj;
    .locals 1

    .prologue
    .line 686
    iget-object v0, p0, Lwh;->b:Leo;

    invoke-virtual {v0}, Leo;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwj;

    .line 687
    if-nez v0, :cond_0

    .line 688
    new-instance v0, Lwj;

    invoke-direct {v0, p1, p2, p3}, Lwj;-><init>(III)V

    .line 694
    :goto_0
    return-object v0

    .line 690
    :cond_0
    iput p1, v0, Lwj;->a:I

    .line 691
    iput p2, v0, Lwj;->b:I

    .line 692
    iput p3, v0, Lwj;->c:I

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lwh;->a:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lwh;->a(Ljava/util/List;)V

    .line 87
    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lwh;->a(Ljava/util/List;)V

    .line 88
    return-void
.end method

.method public final a(Lwj;)V
    .locals 1

    .prologue
    .line 699
    iget-boolean v0, p0, Lwh;->e:Z

    if-nez v0, :cond_0

    .line 700
    iget-object v0, p0, Lwh;->b:Leo;

    invoke-virtual {v0, p1}, Leo;->a(Ljava/lang/Object;)Z

    .line 702
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 13

    .prologue
    .line 91
    iget-object v6, p0, Lwh;->f:Lyo;

    iget-object v7, p0, Lwh;->a:Ljava/util/ArrayList;

    .line 1217
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 1218
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    :goto_1
    if-ltz v2, :cond_6

    .line 1219
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwj;

    .line 1220
    iget v0, v0, Lwj;->a:I

    const/4 v3, 0x3

    if-ne v0, v3, :cond_5

    .line 1221
    if-eqz v1, :cond_2e

    move v5, v2

    .line 1039
    :goto_2
    const/4 v0, -0x1

    if-eq v5, v0, :cond_1d

    .line 1040
    add-int/lit8 v8, v5, 0x1

    .line 2045
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwj;

    .line 2046
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwj;

    .line 2047
    iget v2, v1, Lwj;->a:I

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 2161
    :pswitch_0
    const/4 v2, 0x0

    .line 2163
    iget v3, v0, Lwj;->c:I

    iget v4, v1, Lwj;->b:I

    if-ge v3, v4, :cond_1

    .line 2164
    const/4 v2, -0x1

    .line 2166
    :cond_1
    iget v3, v0, Lwj;->b:I

    iget v4, v1, Lwj;->b:I

    if-ge v3, v4, :cond_2

    .line 2167
    add-int/lit8 v2, v2, 0x1

    .line 2169
    :cond_2
    iget v3, v1, Lwj;->b:I

    iget v4, v0, Lwj;->b:I

    if-gt v3, v4, :cond_3

    .line 2170
    iget v3, v0, Lwj;->b:I

    iget v4, v1, Lwj;->c:I

    add-int/2addr v3, v4

    iput v3, v0, Lwj;->b:I

    .line 2172
    :cond_3
    iget v3, v1, Lwj;->b:I

    iget v4, v0, Lwj;->c:I

    if-gt v3, v4, :cond_4

    .line 2173
    iget v3, v0, Lwj;->c:I

    iget v4, v1, Lwj;->c:I

    add-int/2addr v3, v4

    iput v3, v0, Lwj;->c:I

    .line 2175
    :cond_4
    iget v3, v1, Lwj;->b:I

    add-int/2addr v2, v3

    iput v2, v1, Lwj;->b:I

    .line 2176
    invoke-interface {v7, v5, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2177
    invoke-interface {v7, v8, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1225
    :cond_5
    const/4 v0, 0x1

    .line 1218
    :goto_3
    add-int/lit8 v2, v2, -0x1

    move v1, v0

    goto :goto_1

    .line 1228
    :cond_6
    const/4 v0, -0x1

    move v5, v0

    goto :goto_2

    .line 2062
    :pswitch_1
    const/4 v4, 0x0

    .line 2064
    const/4 v3, 0x0

    .line 2067
    iget v2, v0, Lwj;->b:I

    iget v9, v0, Lwj;->c:I

    if-ge v2, v9, :cond_a

    .line 2068
    const/4 v2, 0x0

    .line 2069
    iget v9, v1, Lwj;->b:I

    iget v10, v0, Lwj;->b:I

    if-ne v9, v10, :cond_7

    iget v9, v1, Lwj;->c:I

    iget v10, v0, Lwj;->c:I

    iget v11, v0, Lwj;->b:I

    sub-int/2addr v10, v11

    if-ne v9, v10, :cond_7

    .line 2071
    const/4 v3, 0x1

    .line 2082
    :cond_7
    :goto_4
    iget v9, v0, Lwj;->c:I

    iget v10, v1, Lwj;->b:I

    if-ge v9, v10, :cond_b

    .line 2083
    iget v9, v1, Lwj;->b:I

    add-int/lit8 v9, v9, -0x1

    iput v9, v1, Lwj;->b:I

    .line 2098
    :cond_8
    iget v9, v0, Lwj;->b:I

    iget v10, v1, Lwj;->b:I

    if-gt v9, v10, :cond_c

    .line 2099
    iget v9, v1, Lwj;->b:I

    add-int/lit8 v9, v9, 0x1

    iput v9, v1, Lwj;->b:I

    .line 2108
    :cond_9
    :goto_5
    if-eqz v3, :cond_d

    .line 2109
    invoke-interface {v7, v5, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2110
    invoke-interface {v7, v8}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2111
    iget-object v1, v6, Lyo;->a:Lyp;

    invoke-interface {v1, v0}, Lyp;->a(Lwj;)V

    goto/16 :goto_0

    .line 2074
    :cond_a
    const/4 v2, 0x1

    .line 2075
    iget v9, v1, Lwj;->b:I

    iget v10, v0, Lwj;->c:I

    add-int/lit8 v10, v10, 0x1

    if-ne v9, v10, :cond_7

    iget v9, v1, Lwj;->c:I

    iget v10, v0, Lwj;->b:I

    iget v11, v0, Lwj;->c:I

    sub-int/2addr v10, v11

    if-ne v9, v10, :cond_7

    .line 2077
    const/4 v3, 0x1

    goto :goto_4

    .line 2084
    :cond_b
    iget v9, v0, Lwj;->c:I

    iget v10, v1, Lwj;->b:I

    iget v11, v1, Lwj;->c:I

    add-int/2addr v10, v11

    if-ge v9, v10, :cond_8

    .line 2086
    iget v2, v1, Lwj;->c:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Lwj;->c:I

    .line 2087
    const/4 v2, 0x1

    iput v2, v0, Lwj;->a:I

    .line 2088
    const/4 v2, 0x1

    iput v2, v0, Lwj;->c:I

    .line 2089
    iget v0, v1, Lwj;->c:I

    if-nez v0, :cond_0

    .line 2090
    invoke-interface {v7, v8}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2091
    iget-object v0, v6, Lyo;->a:Lyp;

    invoke-interface {v0, v1}, Lyp;->a(Lwj;)V

    goto/16 :goto_0

    .line 2100
    :cond_c
    iget v9, v0, Lwj;->b:I

    iget v10, v1, Lwj;->b:I

    iget v11, v1, Lwj;->c:I

    add-int/2addr v10, v11

    if-ge v9, v10, :cond_9

    .line 2101
    iget v4, v1, Lwj;->b:I

    iget v9, v1, Lwj;->c:I

    add-int/2addr v4, v9

    iget v9, v0, Lwj;->b:I

    sub-int/2addr v4, v9

    .line 2103
    iget-object v9, v6, Lyo;->a:Lyp;

    const/4 v10, 0x1

    iget v11, v0, Lwj;->b:I

    add-int/lit8 v11, v11, 0x1

    invoke-interface {v9, v10, v11, v4}, Lyp;->a(III)Lwj;

    move-result-object v4

    .line 2104
    iget v9, v0, Lwj;->b:I

    iget v10, v1, Lwj;->b:I

    sub-int/2addr v9, v10

    iput v9, v1, Lwj;->c:I

    goto :goto_5

    .line 2116
    :cond_d
    if-eqz v2, :cond_12

    .line 2117
    if-eqz v4, :cond_f

    .line 2118
    iget v2, v0, Lwj;->b:I

    iget v3, v4, Lwj;->b:I

    if-le v2, v3, :cond_e

    .line 2119
    iget v2, v0, Lwj;->b:I

    iget v3, v4, Lwj;->c:I

    sub-int/2addr v2, v3

    iput v2, v0, Lwj;->b:I

    .line 2121
    :cond_e
    iget v2, v0, Lwj;->c:I

    iget v3, v4, Lwj;->b:I

    if-le v2, v3, :cond_f

    .line 2122
    iget v2, v0, Lwj;->c:I

    iget v3, v4, Lwj;->c:I

    sub-int/2addr v2, v3

    iput v2, v0, Lwj;->c:I

    .line 2125
    :cond_f
    iget v2, v0, Lwj;->b:I

    iget v3, v1, Lwj;->b:I

    if-le v2, v3, :cond_10

    .line 2126
    iget v2, v0, Lwj;->b:I

    iget v3, v1, Lwj;->c:I

    sub-int/2addr v2, v3

    iput v2, v0, Lwj;->b:I

    .line 2128
    :cond_10
    iget v2, v0, Lwj;->c:I

    iget v3, v1, Lwj;->b:I

    if-le v2, v3, :cond_11

    .line 2129
    iget v2, v0, Lwj;->c:I

    iget v3, v1, Lwj;->c:I

    sub-int/2addr v2, v3

    iput v2, v0, Lwj;->c:I

    .line 2148
    :cond_11
    :goto_6
    invoke-interface {v7, v5, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2149
    iget v1, v0, Lwj;->b:I

    iget v2, v0, Lwj;->c:I

    if-eq v1, v2, :cond_16

    .line 2150
    invoke-interface {v7, v8, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2154
    :goto_7
    if-eqz v4, :cond_0

    .line 2155
    invoke-interface {v7, v5, v4}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 2132
    :cond_12
    if-eqz v4, :cond_14

    .line 2133
    iget v2, v0, Lwj;->b:I

    iget v3, v4, Lwj;->b:I

    if-lt v2, v3, :cond_13

    .line 2134
    iget v2, v0, Lwj;->b:I

    iget v3, v4, Lwj;->c:I

    sub-int/2addr v2, v3

    iput v2, v0, Lwj;->b:I

    .line 2136
    :cond_13
    iget v2, v0, Lwj;->c:I

    iget v3, v4, Lwj;->b:I

    if-lt v2, v3, :cond_14

    .line 2137
    iget v2, v0, Lwj;->c:I

    iget v3, v4, Lwj;->c:I

    sub-int/2addr v2, v3

    iput v2, v0, Lwj;->c:I

    .line 2140
    :cond_14
    iget v2, v0, Lwj;->b:I

    iget v3, v1, Lwj;->b:I

    if-lt v2, v3, :cond_15

    .line 2141
    iget v2, v0, Lwj;->b:I

    iget v3, v1, Lwj;->c:I

    sub-int/2addr v2, v3

    iput v2, v0, Lwj;->b:I

    .line 2143
    :cond_15
    iget v2, v0, Lwj;->c:I

    iget v3, v1, Lwj;->b:I

    if-lt v2, v3, :cond_11

    .line 2144
    iget v2, v0, Lwj;->c:I

    iget v3, v1, Lwj;->c:I

    sub-int/2addr v2, v3

    iput v2, v0, Lwj;->c:I

    goto :goto_6

    .line 2152
    :cond_16
    invoke-interface {v7, v8}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_7

    .line 2182
    :pswitch_2
    const/4 v2, 0x0

    .line 2183
    const/4 v3, 0x0

    .line 2185
    iget v4, v0, Lwj;->c:I

    iget v9, v1, Lwj;->b:I

    if-ge v4, v9, :cond_1a

    .line 2186
    iget v4, v1, Lwj;->b:I

    add-int/lit8 v4, v4, -0x1

    iput v4, v1, Lwj;->b:I

    .line 2193
    :cond_17
    :goto_8
    iget v4, v0, Lwj;->b:I

    iget v9, v1, Lwj;->b:I

    if-gt v4, v9, :cond_1b

    .line 2194
    iget v4, v1, Lwj;->b:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v1, Lwj;->b:I

    .line 2201
    :cond_18
    :goto_9
    invoke-interface {v7, v8, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2202
    iget v0, v1, Lwj;->c:I

    if-lez v0, :cond_1c

    .line 2203
    invoke-interface {v7, v5, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2208
    :goto_a
    if-eqz v2, :cond_19

    .line 2209
    invoke-interface {v7, v5, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 2211
    :cond_19
    if-eqz v3, :cond_0

    .line 2212
    invoke-interface {v7, v5, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 2187
    :cond_1a
    iget v4, v0, Lwj;->c:I

    iget v9, v1, Lwj;->b:I

    iget v10, v1, Lwj;->c:I

    add-int/2addr v9, v10

    if-ge v4, v9, :cond_17

    .line 2189
    iget v2, v1, Lwj;->c:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Lwj;->c:I

    .line 2190
    iget-object v2, v6, Lyo;->a:Lyp;

    const/4 v4, 0x2

    iget v9, v0, Lwj;->b:I

    const/4 v10, 0x1

    invoke-interface {v2, v4, v9, v10}, Lyp;->a(III)Lwj;

    move-result-object v2

    goto :goto_8

    .line 2195
    :cond_1b
    iget v4, v0, Lwj;->b:I

    iget v9, v1, Lwj;->b:I

    iget v10, v1, Lwj;->c:I

    add-int/2addr v9, v10

    if-ge v4, v9, :cond_18

    .line 2196
    iget v3, v1, Lwj;->b:I

    iget v4, v1, Lwj;->c:I

    add-int/2addr v3, v4

    iget v4, v0, Lwj;->b:I

    sub-int v4, v3, v4

    .line 2198
    iget-object v3, v6, Lyo;->a:Lyp;

    const/4 v9, 0x2

    iget v10, v0, Lwj;->b:I

    add-int/lit8 v10, v10, 0x1

    invoke-interface {v3, v9, v10, v4}, Lyp;->a(III)Lwj;

    move-result-object v3

    .line 2199
    iget v9, v1, Lwj;->c:I

    sub-int v4, v9, v4

    iput v4, v1, Lwj;->c:I

    goto :goto_9

    .line 2205
    :cond_1c
    invoke-interface {v7, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2206
    iget-object v0, v6, Lyo;->a:Lyp;

    invoke-interface {v0, v1}, Lyp;->a(Lwj;)V

    goto :goto_a

    .line 92
    :cond_1d
    iget-object v0, p0, Lwh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 93
    const/4 v0, 0x0

    move v5, v0

    :goto_b
    if-ge v5, v7, :cond_2d

    .line 94
    iget-object v0, p0, Lwh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwj;

    .line 95
    iget v1, v0, Lwj;->a:I

    packed-switch v1, :pswitch_data_1

    .line 93
    :goto_c
    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto :goto_b

    .line 2425
    :pswitch_3
    invoke-direct {p0, v0}, Lwh;->c(Lwj;)V

    goto :goto_c

    .line 3131
    :pswitch_4
    iget v8, v0, Lwj;->b:I

    .line 3132
    const/4 v1, 0x0

    .line 3133
    iget v2, v0, Lwj;->b:I

    iget v3, v0, Lwj;->c:I

    add-int/2addr v3, v2

    .line 3134
    const/4 v4, -0x1

    .line 3135
    iget v2, v0, Lwj;->b:I

    move v6, v1

    :goto_d
    if-ge v2, v3, :cond_23

    .line 3136
    const/4 v1, 0x0

    .line 3137
    iget-object v9, p0, Lwh;->d:Lwi;

    invoke-interface {v9, v2}, Lwi;->a(I)Lzr;

    move-result-object v9

    .line 3138
    if-nez v9, :cond_1e

    invoke-direct {p0, v2}, Lwh;->b(I)Z

    move-result v9

    if-eqz v9, :cond_20

    .line 3145
    :cond_1e
    if-nez v4, :cond_1f

    .line 3148
    const/4 v1, 0x1

    invoke-virtual {p0, v1, v8, v6}, Lwh;->a(III)Lwj;

    move-result-object v1

    .line 3149
    invoke-direct {p0, v1}, Lwh;->b(Lwj;)V

    .line 3150
    const/4 v1, 0x1

    .line 3152
    :cond_1f
    const/4 v4, 0x1

    .line 3165
    :goto_e
    if-eqz v1, :cond_22

    .line 3166
    sub-int v1, v2, v6

    .line 3167
    sub-int v2, v3, v6

    .line 3168
    const/4 v3, 0x1

    .line 3135
    :goto_f
    add-int/lit8 v1, v1, 0x1

    move v6, v3

    move v3, v2

    move v2, v1

    goto :goto_d

    .line 3156
    :cond_20
    const/4 v9, 0x1

    if-ne v4, v9, :cond_21

    .line 3159
    const/4 v1, 0x1

    invoke-virtual {p0, v1, v8, v6}, Lwh;->a(III)Lwj;

    move-result-object v1

    .line 3160
    invoke-direct {p0, v1}, Lwh;->c(Lwj;)V

    .line 3161
    const/4 v1, 0x1

    .line 3163
    :cond_21
    const/4 v4, 0x0

    goto :goto_e

    .line 3170
    :cond_22
    add-int/lit8 v1, v6, 0x1

    move v12, v2

    move v2, v3

    move v3, v1

    move v1, v12

    goto :goto_f

    .line 3173
    :cond_23
    iget v1, v0, Lwj;->c:I

    if-eq v6, v1, :cond_24

    .line 3174
    invoke-virtual {p0, v0}, Lwh;->a(Lwj;)V

    .line 3175
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v8, v6}, Lwh;->a(III)Lwj;

    move-result-object v0

    .line 3177
    :cond_24
    if-nez v4, :cond_25

    .line 3178
    invoke-direct {p0, v0}, Lwh;->b(Lwj;)V

    goto :goto_c

    .line 3180
    :cond_25
    invoke-direct {p0, v0}, Lwh;->c(Lwj;)V

    goto :goto_c

    .line 3185
    :pswitch_5
    iget v4, v0, Lwj;->b:I

    .line 3186
    const/4 v2, 0x0

    .line 3187
    iget v1, v0, Lwj;->b:I

    iget v3, v0, Lwj;->c:I

    add-int v6, v1, v3

    .line 3188
    const/4 v1, -0x1

    .line 3189
    iget v3, v0, Lwj;->b:I

    move v12, v1

    move v1, v2

    move v2, v4

    move v4, v12

    :goto_10
    if-ge v3, v6, :cond_2a

    .line 3190
    iget-object v8, p0, Lwh;->d:Lwi;

    invoke-interface {v8, v3}, Lwi;->a(I)Lzr;

    move-result-object v8

    .line 3191
    if-nez v8, :cond_26

    invoke-direct {p0, v3}, Lwh;->b(I)Z

    move-result v8

    if-eqz v8, :cond_28

    .line 3192
    :cond_26
    if-nez v4, :cond_27

    .line 3193
    const/4 v4, 0x2

    invoke-virtual {p0, v4, v2, v1}, Lwh;->a(III)Lwj;

    move-result-object v1

    .line 3194
    invoke-direct {p0, v1}, Lwh;->b(Lwj;)V

    .line 3195
    const/4 v1, 0x0

    move v2, v3

    .line 3198
    :cond_27
    const/4 v4, 0x1

    move v12, v4

    move v4, v2

    move v2, v1

    move v1, v12

    .line 3208
    :goto_11
    add-int/lit8 v2, v2, 0x1

    .line 3189
    add-int/lit8 v3, v3, 0x1

    move v12, v1

    move v1, v2

    move v2, v4

    move v4, v12

    goto :goto_10

    .line 3200
    :cond_28
    const/4 v8, 0x1

    if-ne v4, v8, :cond_29

    .line 3201
    const/4 v4, 0x2

    invoke-virtual {p0, v4, v2, v1}, Lwh;->a(III)Lwj;

    move-result-object v1

    .line 3202
    invoke-direct {p0, v1}, Lwh;->c(Lwj;)V

    .line 3203
    const/4 v1, 0x0

    move v2, v3

    .line 3206
    :cond_29
    const/4 v4, 0x0

    move v12, v4

    move v4, v2

    move v2, v1

    move v1, v12

    goto :goto_11

    .line 3210
    :cond_2a
    iget v3, v0, Lwj;->c:I

    if-eq v1, v3, :cond_2b

    .line 3211
    invoke-virtual {p0, v0}, Lwh;->a(Lwj;)V

    .line 3212
    const/4 v0, 0x2

    invoke-virtual {p0, v0, v2, v1}, Lwh;->a(III)Lwj;

    move-result-object v0

    .line 3214
    :cond_2b
    if-nez v4, :cond_2c

    .line 3215
    invoke-direct {p0, v0}, Lwh;->b(Lwj;)V

    goto/16 :goto_c

    .line 3217
    :cond_2c
    invoke-direct {p0, v0}, Lwh;->c(Lwj;)V

    goto/16 :goto_c

    .line 4127
    :pswitch_6
    invoke-direct {p0, v0}, Lwh;->c(Lwj;)V

    goto/16 :goto_c

    .line 113
    :cond_2d
    iget-object v0, p0, Lwh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 114
    return-void

    :cond_2e
    move v0, v1

    goto/16 :goto_3

    .line 2047
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 95
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public final c()V
    .locals 4

    .prologue
    .line 117
    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 118
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 119
    iget-object v3, p0, Lwh;->d:Lwi;

    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwj;

    invoke-interface {v3, v0}, Lwi;->b(Lwj;)V

    .line 118
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 121
    :cond_0
    iget-object v0, p0, Lwh;->c:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lwh;->a(Ljava/util/List;)V

    .line 122
    return-void
.end method

.method final d()Z
    .locals 1

    .prologue
    .line 453
    iget-object v0, p0, Lwh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()V
    .locals 5

    .prologue
    .line 533
    invoke-virtual {p0}, Lwh;->c()V

    .line 534
    iget-object v0, p0, Lwh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 535
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 536
    iget-object v0, p0, Lwh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwj;

    .line 537
    iget v3, v0, Lwj;->a:I

    packed-switch v3, :pswitch_data_0

    .line 535
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 539
    :pswitch_0
    iget-object v3, p0, Lwh;->d:Lwi;

    invoke-interface {v3, v0}, Lwi;->b(Lwj;)V

    .line 540
    iget-object v3, p0, Lwh;->d:Lwi;

    iget v4, v0, Lwj;->b:I

    iget v0, v0, Lwj;->c:I

    invoke-interface {v3, v4, v0}, Lwi;->d(II)V

    goto :goto_1

    .line 543
    :pswitch_1
    iget-object v3, p0, Lwh;->d:Lwi;

    invoke-interface {v3, v0}, Lwi;->b(Lwj;)V

    .line 544
    iget-object v3, p0, Lwh;->d:Lwi;

    iget v4, v0, Lwj;->b:I

    iget v0, v0, Lwj;->c:I

    invoke-interface {v3, v4, v0}, Lwi;->a(II)V

    goto :goto_1

    .line 547
    :pswitch_2
    iget-object v3, p0, Lwh;->d:Lwi;

    invoke-interface {v3, v0}, Lwi;->b(Lwj;)V

    .line 548
    iget-object v3, p0, Lwh;->d:Lwi;

    iget v4, v0, Lwj;->b:I

    iget v0, v0, Lwj;->c:I

    invoke-interface {v3, v4, v0}, Lwi;->c(II)V

    goto :goto_1

    .line 551
    :pswitch_3
    iget-object v3, p0, Lwh;->d:Lwi;

    invoke-interface {v3, v0}, Lwi;->b(Lwj;)V

    .line 552
    iget-object v3, p0, Lwh;->d:Lwi;

    iget v4, v0, Lwj;->b:I

    iget v0, v0, Lwj;->c:I

    invoke-interface {v3, v4, v0}, Lwi;->e(II)V

    goto :goto_1

    .line 559
    :cond_0
    iget-object v0, p0, Lwh;->a:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lwh;->a(Ljava/util/List;)V

    .line 560
    return-void

    .line 537
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
