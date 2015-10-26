.class public final Ldbf;
.super Ldew;
.source "PG"


# static fields
.field private static volatile h:[Ldbf;


# instance fields
.field public a:Ldbj;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:I

.field public g:[Ldbg;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 316
    invoke-direct {p0}, Ldew;-><init>()V

    .line 317
    iput-object v0, p0, Ldbf;->a:Ldbj;

    .line 318
    iput-object v0, p0, Ldbf;->b:Ljava/lang/String;

    .line 319
    iput-object v0, p0, Ldbf;->c:Ljava/lang/String;

    .line 320
    iput-object v0, p0, Ldbf;->d:Ljava/lang/String;

    .line 321
    iput-object v0, p0, Ldbf;->e:Ljava/lang/String;

    .line 322
    const/high16 v0, -0x80000000

    iput v0, p0, Ldbf;->f:I

    .line 323
    invoke-static {}, Ldbg;->b()[Ldbg;

    move-result-object v0

    iput-object v0, p0, Ldbf;->g:[Ldbg;

    .line 324
    const/4 v0, -0x1

    iput v0, p0, Ldbf;->t:I

    .line 325
    return-void
.end method

.method public static b()[Ldbf;
    .locals 2

    .prologue
    .line 284
    sget-object v0, Ldbf;->h:[Ldbf;

    if-nez v0, :cond_1

    .line 285
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 287
    :try_start_0
    sget-object v0, Ldbf;->h:[Ldbf;

    if-nez v0, :cond_0

    .line 288
    const/4 v0, 0x0

    new-array v0, v0, [Ldbf;

    sput-object v0, Ldbf;->h:[Ldbf;

    .line 290
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 292
    :cond_1
    sget-object v0, Ldbf;->h:[Ldbf;

    return-object v0

    .line 290
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method protected final a()I
    .locals 5

    .prologue
    .line 361
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 362
    iget-object v1, p0, Ldbf;->a:Ldbj;

    if-eqz v1, :cond_0

    .line 363
    const/4 v1, 0x1

    iget-object v2, p0, Ldbf;->a:Ldbj;

    .line 364
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 366
    :cond_0
    iget-object v1, p0, Ldbf;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 367
    const/4 v1, 0x2

    iget-object v2, p0, Ldbf;->b:Ljava/lang/String;

    .line 368
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 370
    :cond_1
    iget-object v1, p0, Ldbf;->c:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 371
    const/4 v1, 0x3

    iget-object v2, p0, Ldbf;->c:Ljava/lang/String;

    .line 372
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 374
    :cond_2
    iget-object v1, p0, Ldbf;->d:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 375
    const/4 v1, 0x4

    iget-object v2, p0, Ldbf;->d:Ljava/lang/String;

    .line 376
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 378
    :cond_3
    iget-object v1, p0, Ldbf;->g:[Ldbg;

    if-eqz v1, :cond_6

    iget-object v1, p0, Ldbf;->g:[Ldbg;

    array-length v1, v1

    if-lez v1, :cond_6

    .line 379
    const/4 v1, 0x0

    move v4, v1

    move v1, v0

    move v0, v4

    :goto_0
    iget-object v2, p0, Ldbf;->g:[Ldbg;

    array-length v2, v2

    if-ge v0, v2, :cond_5

    .line 380
    iget-object v2, p0, Ldbf;->g:[Ldbg;

    aget-object v2, v2, v0

    .line 381
    if-eqz v2, :cond_4

    .line 382
    const/4 v3, 0x5

    .line 383
    invoke-static {v3, v2}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v1, v2

    .line 379
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    move v0, v1

    .line 387
    :cond_6
    iget v1, p0, Ldbf;->f:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_7

    .line 388
    const/4 v1, 0x6

    iget v2, p0, Ldbf;->f:I

    .line 389
    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 391
    :cond_7
    iget-object v1, p0, Ldbf;->e:Ljava/lang/String;

    if-eqz v1, :cond_8

    .line 392
    const/4 v1, 0x7

    iget-object v2, p0, Ldbf;->e:Ljava/lang/String;

    .line 393
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 395
    :cond_8
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 1403
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1404
    sparse-switch v0, :sswitch_data_0

    .line 1408
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1409
    :sswitch_0
    return-object p0

    .line 1414
    :sswitch_1
    iget-object v0, p0, Ldbf;->a:Ldbj;

    if-nez v0, :cond_1

    .line 1415
    new-instance v0, Ldbj;

    invoke-direct {v0}, Ldbj;-><init>()V

    iput-object v0, p0, Ldbf;->a:Ldbj;

    .line 1417
    :cond_1
    iget-object v0, p0, Ldbf;->a:Ldbj;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1421
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbf;->b:Ljava/lang/String;

    goto :goto_0

    .line 1425
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbf;->c:Ljava/lang/String;

    goto :goto_0

    .line 1429
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbf;->d:Ljava/lang/String;

    goto :goto_0

    .line 1433
    :sswitch_5
    const/16 v0, 0x2a

    .line 1434
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 1435
    iget-object v0, p0, Ldbf;->g:[Ldbg;

    if-nez v0, :cond_3

    move v0, v1

    .line 1436
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ldbg;

    .line 1438
    if-eqz v0, :cond_2

    .line 1439
    iget-object v3, p0, Ldbf;->g:[Ldbg;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1441
    :cond_2
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_4

    .line 1442
    new-instance v3, Ldbg;

    invoke-direct {v3}, Ldbg;-><init>()V

    aput-object v3, v2, v0

    .line 1443
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 1444
    invoke-virtual {p1}, Ldeo;->a()I

    .line 1441
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1435
    :cond_3
    iget-object v0, p0, Ldbf;->g:[Ldbg;

    array-length v0, v0

    goto :goto_1

    .line 1447
    :cond_4
    new-instance v3, Ldbg;

    invoke-direct {v3}, Ldbg;-><init>()V

    aput-object v3, v2, v0

    .line 1448
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 1449
    iput-object v2, p0, Ldbf;->g:[Ldbg;

    goto :goto_0

    .line 2169
    :sswitch_6
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1454
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1458
    :pswitch_0
    iput v0, p0, Ldbf;->f:I

    goto :goto_0

    .line 1464
    :sswitch_7
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbf;->e:Ljava/lang/String;

    goto/16 :goto_0

    .line 1404
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
        0x30 -> :sswitch_6
        0x3a -> :sswitch_7
    .end sparse-switch

    .line 1454
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ldep;)V
    .locals 3

    .prologue
    .line 330
    iget-object v0, p0, Ldbf;->a:Ldbj;

    if-eqz v0, :cond_0

    .line 331
    const/4 v0, 0x1

    iget-object v1, p0, Ldbf;->a:Ldbj;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 333
    :cond_0
    iget-object v0, p0, Ldbf;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 334
    const/4 v0, 0x2

    iget-object v1, p0, Ldbf;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 336
    :cond_1
    iget-object v0, p0, Ldbf;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 337
    const/4 v0, 0x3

    iget-object v1, p0, Ldbf;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 339
    :cond_2
    iget-object v0, p0, Ldbf;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 340
    const/4 v0, 0x4

    iget-object v1, p0, Ldbf;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 342
    :cond_3
    iget-object v0, p0, Ldbf;->g:[Ldbg;

    if-eqz v0, :cond_5

    iget-object v0, p0, Ldbf;->g:[Ldbg;

    array-length v0, v0

    if-lez v0, :cond_5

    .line 343
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldbf;->g:[Ldbg;

    array-length v1, v1

    if-ge v0, v1, :cond_5

    .line 344
    iget-object v1, p0, Ldbf;->g:[Ldbg;

    aget-object v1, v1, v0

    .line 345
    if-eqz v1, :cond_4

    .line 346
    const/4 v2, 0x5

    invoke-virtual {p1, v2, v1}, Ldep;->a(ILdew;)V

    .line 343
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 350
    :cond_5
    iget v0, p0, Ldbf;->f:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_6

    .line 351
    const/4 v0, 0x6

    iget v1, p0, Ldbf;->f:I

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 353
    :cond_6
    iget-object v0, p0, Ldbf;->e:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 354
    const/4 v0, 0x7

    iget-object v1, p0, Ldbf;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 356
    :cond_7
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 357
    return-void
.end method
