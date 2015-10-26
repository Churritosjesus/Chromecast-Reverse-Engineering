.class public final Ljd;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final a:Ljh;


# instance fields
.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 1296
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-lt v0, v1, :cond_0

    .line 1297
    new-instance v0, Ljf;

    invoke-direct {v0}, Ljf;-><init>()V

    sput-object v0, Ljd;->a:Ljh;

    .line 1311
    :goto_0
    return-void

    .line 1298
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 1299
    new-instance v0, Lje;

    invoke-direct {v0}, Lje;-><init>()V

    sput-object v0, Ljd;->a:Ljh;

    goto :goto_0

    .line 1300
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    .line 1301
    new-instance v0, Ljk;

    invoke-direct {v0}, Ljk;-><init>()V

    sput-object v0, Ljd;->a:Ljh;

    goto :goto_0

    .line 1302
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_3

    .line 1303
    new-instance v0, Ljj;

    invoke-direct {v0}, Ljj;-><init>()V

    sput-object v0, Ljd;->a:Ljh;

    goto :goto_0

    .line 1304
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_4

    .line 1305
    new-instance v0, Lji;

    invoke-direct {v0}, Lji;-><init>()V

    sput-object v0, Ljd;->a:Ljh;

    goto :goto_0

    .line 1306
    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_5

    .line 1307
    new-instance v0, Ljg;

    invoke-direct {v0}, Ljg;-><init>()V

    sput-object v0, Ljd;->a:Ljh;

    goto :goto_0

    .line 1309
    :cond_5
    new-instance v0, Ljh;

    invoke-direct {v0}, Ljh;-><init>()V

    sput-object v0, Ljd;->a:Ljh;

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1652
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1653
    iput-object p1, p0, Ljd;->b:Ljava/lang/Object;

    .line 1654
    return-void
.end method

.method public static a(Ljd;)Ljd;
    .locals 2

    .prologue
    .line 1706
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljh;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 3640
    if-eqz v1, :cond_0

    .line 3641
    new-instance v0, Ljd;

    invoke-direct {v0, v1}, Ljd;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    .line 3643
    :cond_0
    const/4 v0, 0x0

    .line 1706
    goto :goto_0
.end method

.method public static synthetic k()Ljh;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Ljd;->a:Ljh;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 1852
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljh;->b(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 1867
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ljh;->a(Ljava/lang/Object;I)V

    .line 1868
    return-void
.end method

.method public final a(Landroid/graphics/Rect;)V
    .locals 2

    .prologue
    .line 2025
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ljh;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 2026
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 1993
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ljh;->b(Ljava/lang/Object;Landroid/view/View;)V

    .line 1994
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    .line 2402
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ljh;->a(Ljava/lang/Object;Ljava/lang/CharSequence;)V

    .line 2403
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 2550
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    check-cast p1, Ljm;

    .line 4113
    iget-object v2, p1, Ljm;->a:Ljava/lang/Object;

    .line 2550
    invoke-virtual {v0, v1, v2}, Ljh;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2551
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 2136
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ljh;->c(Ljava/lang/Object;Z)V

    .line 2137
    return-void
.end method

.method public final b(Landroid/graphics/Rect;)V
    .locals 2

    .prologue
    .line 2049
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ljh;->b(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 2050
    return-void
.end method

.method public final b(Z)V
    .locals 2

    .prologue
    .line 2160
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ljh;->d(Ljava/lang/Object;Z)V

    .line 2161
    return-void
.end method

.method public final b()Z
    .locals 2

    .prologue
    .line 2121
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljh;->k(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final c(Z)V
    .locals 2

    .prologue
    .line 2354
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ljh;->f(Ljava/lang/Object;Z)V

    .line 2355
    return-void
.end method

.method public final c()Z
    .locals 2

    .prologue
    .line 2145
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljh;->l(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 2

    .prologue
    .line 2219
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljh;->p(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 2

    .prologue
    .line 2243
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljh;->i(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2681
    if-ne p0, p1, :cond_1

    .line 2698
    :cond_0
    :goto_0
    return v0

    .line 2684
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 2685
    goto :goto_0

    .line 2687
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 2688
    goto :goto_0

    .line 2690
    :cond_3
    check-cast p1, Ljd;

    .line 2691
    iget-object v2, p0, Ljd;->b:Ljava/lang/Object;

    if-nez v2, :cond_4

    .line 2692
    iget-object v2, p1, Ljd;->b:Ljava/lang/Object;

    if-eqz v2, :cond_0

    move v0, v1

    .line 2693
    goto :goto_0

    .line 2695
    :cond_4
    iget-object v2, p0, Ljd;->b:Ljava/lang/Object;

    iget-object v3, p1, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 2696
    goto :goto_0
.end method

.method public final f()Z
    .locals 2

    .prologue
    .line 2267
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljh;->m(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final g()Z
    .locals 2

    .prologue
    .line 2291
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljh;->j(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final h()Ljava/lang/CharSequence;
    .locals 2

    .prologue
    .line 2363
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljh;->e(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 2676
    iget-object v0, p0, Ljd;->b:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public final i()Ljava/lang/CharSequence;
    .locals 2

    .prologue
    .line 2387
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljh;->c(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/lang/CharSequence;
    .locals 2

    .prologue
    .line 2435
    sget-object v0, Ljd;->a:Ljh;

    iget-object v1, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljh;->d(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 2703
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2704
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2706
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2708
    invoke-virtual {p0, v0}, Ljd;->a(Landroid/graphics/Rect;)V

    .line 2709
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "; boundsInParent: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2711
    invoke-virtual {p0, v0}, Ljd;->b(Landroid/graphics/Rect;)V

    .line 2712
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "; boundsInScreen: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2714
    const-string v0, "; packageName: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljd;->h()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 2715
    const-string v0, "; className: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljd;->i()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 2716
    const-string v0, "; text: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 4411
    sget-object v1, Ljd;->a:Ljh;

    iget-object v3, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljh;->f(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 2716
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 2717
    const-string v0, "; contentDescription: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljd;->j()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 2718
    const-string v0, "; viewId: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 4492
    sget-object v1, Ljd;->a:Ljh;

    iget-object v3, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljh;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 2718
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2720
    const-string v0, "; checkable: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 5073
    sget-object v1, Ljd;->a:Ljh;

    iget-object v3, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljh;->g(Ljava/lang/Object;)Z

    move-result v1

    .line 2720
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2721
    const-string v0, "; checked: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 5097
    sget-object v1, Ljd;->a:Ljh;

    iget-object v3, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljh;->h(Ljava/lang/Object;)Z

    move-result v1

    .line 2721
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2722
    const-string v0, "; focusable: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljd;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2723
    const-string v0, "; focused: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljd;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2724
    const-string v0, "; selected: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljd;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2725
    const-string v0, "; clickable: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljd;->e()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2726
    const-string v0, "; longClickable: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljd;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2727
    const-string v0, "; enabled: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljd;->g()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2728
    const-string v0, "; password: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 5315
    sget-object v1, Ljd;->a:Ljh;

    iget-object v3, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljh;->n(Ljava/lang/Object;)Z

    move-result v1

    .line 2728
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2729
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "; scrollable: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 5339
    sget-object v1, Ljd;->a:Ljh;

    iget-object v3, p0, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljh;->o(Ljava/lang/Object;)Z

    move-result v1

    .line 2729
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2731
    const-string v0, "; ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2732
    invoke-virtual {p0}, Ljd;->a()I

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    .line 2733
    const/4 v1, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v3

    shl-int v3, v1, v3

    .line 2734
    xor-int/lit8 v1, v3, -0x1

    and-int/2addr v1, v0

    .line 5746
    sparse-switch v3, :sswitch_data_0

    .line 5784
    const-string v0, "ACTION_UNKNOWN"

    .line 2735
    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2736
    if-eqz v1, :cond_0

    .line 2737
    const-string v0, ", "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    move v0, v1

    .line 2739
    goto :goto_0

    .line 5748
    :sswitch_0
    const-string v0, "ACTION_FOCUS"

    goto :goto_1

    .line 5750
    :sswitch_1
    const-string v0, "ACTION_CLEAR_FOCUS"

    goto :goto_1

    .line 5752
    :sswitch_2
    const-string v0, "ACTION_SELECT"

    goto :goto_1

    .line 5754
    :sswitch_3
    const-string v0, "ACTION_CLEAR_SELECTION"

    goto :goto_1

    .line 5756
    :sswitch_4
    const-string v0, "ACTION_CLICK"

    goto :goto_1

    .line 5758
    :sswitch_5
    const-string v0, "ACTION_LONG_CLICK"

    goto :goto_1

    .line 5760
    :sswitch_6
    const-string v0, "ACTION_ACCESSIBILITY_FOCUS"

    goto :goto_1

    .line 5762
    :sswitch_7
    const-string v0, "ACTION_CLEAR_ACCESSIBILITY_FOCUS"

    goto :goto_1

    .line 5764
    :sswitch_8
    const-string v0, "ACTION_NEXT_AT_MOVEMENT_GRANULARITY"

    goto :goto_1

    .line 5766
    :sswitch_9
    const-string v0, "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY"

    goto :goto_1

    .line 5768
    :sswitch_a
    const-string v0, "ACTION_NEXT_HTML_ELEMENT"

    goto :goto_1

    .line 5770
    :sswitch_b
    const-string v0, "ACTION_PREVIOUS_HTML_ELEMENT"

    goto :goto_1

    .line 5772
    :sswitch_c
    const-string v0, "ACTION_SCROLL_FORWARD"

    goto :goto_1

    .line 5774
    :sswitch_d
    const-string v0, "ACTION_SCROLL_BACKWARD"

    goto :goto_1

    .line 5776
    :sswitch_e
    const-string v0, "ACTION_CUT"

    goto :goto_1

    .line 5778
    :sswitch_f
    const-string v0, "ACTION_COPY"

    goto :goto_1

    .line 5780
    :sswitch_10
    const-string v0, "ACTION_PASTE"

    goto :goto_1

    .line 5782
    :sswitch_11
    const-string v0, "ACTION_SET_SELECTION"

    goto :goto_1

    .line 2740
    :cond_1
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2742
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 5746
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x4 -> :sswitch_2
        0x8 -> :sswitch_3
        0x10 -> :sswitch_4
        0x20 -> :sswitch_5
        0x40 -> :sswitch_6
        0x80 -> :sswitch_7
        0x100 -> :sswitch_8
        0x200 -> :sswitch_9
        0x400 -> :sswitch_a
        0x800 -> :sswitch_b
        0x1000 -> :sswitch_c
        0x2000 -> :sswitch_d
        0x4000 -> :sswitch_f
        0x8000 -> :sswitch_10
        0x10000 -> :sswitch_e
        0x20000 -> :sswitch_11
    .end sparse-switch
.end method
