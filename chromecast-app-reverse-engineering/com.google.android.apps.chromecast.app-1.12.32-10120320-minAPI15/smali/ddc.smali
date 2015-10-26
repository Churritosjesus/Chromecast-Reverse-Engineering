.class public final Lddc;
.super Lder;
.source "PG"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Integer;

.field public d:Ljava/lang/Integer;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 427
    invoke-direct {p0}, Lder;-><init>()V

    .line 428
    iput-object v0, p0, Lddc;->a:Ljava/lang/String;

    .line 429
    iput-object v0, p0, Lddc;->b:Ljava/lang/String;

    .line 430
    iput-object v0, p0, Lddc;->c:Ljava/lang/Integer;

    .line 431
    iput-object v0, p0, Lddc;->d:Ljava/lang/Integer;

    .line 432
    iput-object v0, p0, Lddc;->e:Ljava/lang/String;

    .line 433
    iput-object v0, p0, Lddc;->f:Ljava/lang/Integer;

    .line 434
    iput-object v0, p0, Lddc;->i:Ldes;

    .line 435
    const/4 v0, -0x1

    iput v0, p0, Lddc;->t:I

    .line 436
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 3

    .prologue
    .line 464
    invoke-super {p0}, Lder;->a()I

    move-result v0

    .line 465
    iget-object v1, p0, Lddc;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 466
    const/4 v1, 0x1

    iget-object v2, p0, Lddc;->a:Ljava/lang/String;

    .line 467
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 469
    :cond_0
    iget-object v1, p0, Lddc;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 470
    const/4 v1, 0x2

    iget-object v2, p0, Lddc;->b:Ljava/lang/String;

    .line 471
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 473
    :cond_1
    iget-object v1, p0, Lddc;->c:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 474
    const/4 v1, 0x3

    iget-object v2, p0, Lddc;->c:Ljava/lang/Integer;

    .line 475
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 477
    :cond_2
    iget-object v1, p0, Lddc;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    .line 478
    const/4 v1, 0x4

    iget-object v2, p0, Lddc;->d:Ljava/lang/Integer;

    .line 479
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 481
    :cond_3
    iget-object v1, p0, Lddc;->e:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 482
    const/4 v1, 0x7

    iget-object v2, p0, Lddc;->e:Ljava/lang/String;

    .line 483
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 485
    :cond_4
    iget-object v1, p0, Lddc;->f:Ljava/lang/Integer;

    if-eqz v1, :cond_5

    .line 486
    const/16 v1, 0x8

    iget-object v2, p0, Lddc;->f:Ljava/lang/Integer;

    .line 487
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 489
    :cond_5
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 392
    .line 1497
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1498
    sparse-switch v0, :sswitch_data_0

    .line 1502
    invoke-super {p0, p1, v0}, Lder;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1503
    :sswitch_0
    return-object p0

    .line 1508
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lddc;->a:Ljava/lang/String;

    goto :goto_0

    .line 1512
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lddc;->b:Ljava/lang/String;

    goto :goto_0

    .line 2169
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1516
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lddc;->c:Ljava/lang/Integer;

    goto :goto_0

    .line 3169
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1520
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lddc;->d:Ljava/lang/Integer;

    goto :goto_0

    .line 1524
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lddc;->e:Ljava/lang/String;

    goto :goto_0

    .line 4169
    :sswitch_6
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1528
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lddc;->f:Ljava/lang/Integer;

    goto :goto_0

    .line 1498
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x18 -> :sswitch_3
        0x20 -> :sswitch_4
        0x3a -> :sswitch_5
        0x40 -> :sswitch_6
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 441
    iget-object v0, p0, Lddc;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 442
    const/4 v0, 0x1

    iget-object v1, p0, Lddc;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 444
    :cond_0
    iget-object v0, p0, Lddc;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 445
    const/4 v0, 0x2

    iget-object v1, p0, Lddc;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 447
    :cond_1
    iget-object v0, p0, Lddc;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 448
    const/4 v0, 0x3

    iget-object v1, p0, Lddc;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 450
    :cond_2
    iget-object v0, p0, Lddc;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 451
    const/4 v0, 0x4

    iget-object v1, p0, Lddc;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 453
    :cond_3
    iget-object v0, p0, Lddc;->e:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 454
    const/4 v0, 0x7

    iget-object v1, p0, Lddc;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 456
    :cond_4
    iget-object v0, p0, Lddc;->f:Ljava/lang/Integer;

    if-eqz v0, :cond_5

    .line 457
    const/16 v0, 0x8

    iget-object v1, p0, Lddc;->f:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 459
    :cond_5
    invoke-super {p0, p1}, Lder;->a(Ldep;)V

    .line 460
    return-void
.end method
