.class public final Ldde;
.super Lder;
.source "PG"


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ldda;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 570
    invoke-direct {p0}, Lder;-><init>()V

    .line 571
    iput-object v0, p0, Ldde;->a:Ljava/lang/Integer;

    .line 572
    iput-object v0, p0, Ldde;->b:Ldda;

    .line 573
    iput-object v0, p0, Ldde;->i:Ldes;

    .line 574
    const/4 v0, -0x1

    iput v0, p0, Ldde;->t:I

    .line 575
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 3

    .prologue
    .line 591
    invoke-super {p0}, Lder;->a()I

    move-result v0

    .line 592
    iget-object v1, p0, Ldde;->a:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 593
    const/4 v1, 0x1

    iget-object v2, p0, Ldde;->a:Ljava/lang/Integer;

    .line 594
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 596
    :cond_0
    iget-object v1, p0, Ldde;->b:Ldda;

    if-eqz v1, :cond_1

    .line 597
    const/4 v1, 0x2

    iget-object v2, p0, Ldde;->b:Ldda;

    .line 598
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 600
    :cond_1
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 547
    .line 1608
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1609
    sparse-switch v0, :sswitch_data_0

    .line 1613
    invoke-super {p0, p1, v0}, Lder;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1614
    :sswitch_0
    return-object p0

    .line 2169
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1619
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldde;->a:Ljava/lang/Integer;

    goto :goto_0

    .line 1623
    :sswitch_2
    iget-object v0, p0, Ldde;->b:Ldda;

    if-nez v0, :cond_1

    .line 1624
    new-instance v0, Ldda;

    invoke-direct {v0}, Ldda;-><init>()V

    iput-object v0, p0, Ldde;->b:Ldda;

    .line 1626
    :cond_1
    iget-object v0, p0, Ldde;->b:Ldda;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1609
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 580
    iget-object v0, p0, Ldde;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 581
    const/4 v0, 0x1

    iget-object v1, p0, Ldde;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 583
    :cond_0
    iget-object v0, p0, Ldde;->b:Ldda;

    if-eqz v0, :cond_1

    .line 584
    const/4 v0, 0x2

    iget-object v1, p0, Ldde;->b:Ldda;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 586
    :cond_1
    invoke-super {p0, p1}, Lder;->a(Ldep;)V

    .line 587
    return-void
.end method
