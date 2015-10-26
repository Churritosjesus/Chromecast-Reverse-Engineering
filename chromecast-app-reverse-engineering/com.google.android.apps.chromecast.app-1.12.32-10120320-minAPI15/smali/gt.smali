.class public final Lgt;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static a:Lhd;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 1499
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1500
    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 1501
    new-instance v0, Lhc;

    invoke-direct {v0}, Lhc;-><init>()V

    sput-object v0, Lgt;->a:Lhd;

    .line 1519
    :goto_0
    return-void

    .line 1502
    :cond_0
    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 1503
    new-instance v0, Lhb;

    invoke-direct {v0}, Lhb;-><init>()V

    sput-object v0, Lgt;->a:Lhd;

    goto :goto_0

    .line 1504
    :cond_1
    const/16 v1, 0x11

    if-lt v0, v1, :cond_2

    .line 1505
    new-instance v0, Lha;

    invoke-direct {v0}, Lha;-><init>()V

    sput-object v0, Lgt;->a:Lhd;

    goto :goto_0

    .line 1506
    :cond_2
    const/16 v1, 0x10

    if-lt v0, v1, :cond_3

    .line 1507
    new-instance v0, Lgz;

    invoke-direct {v0}, Lgz;-><init>()V

    sput-object v0, Lgt;->a:Lhd;

    goto :goto_0

    .line 1508
    :cond_3
    const/16 v1, 0xe

    if-lt v0, v1, :cond_4

    .line 1509
    new-instance v0, Lgy;

    invoke-direct {v0}, Lgy;-><init>()V

    sput-object v0, Lgt;->a:Lhd;

    goto :goto_0

    .line 1510
    :cond_4
    const/16 v1, 0xb

    if-lt v0, v1, :cond_5

    .line 1511
    new-instance v0, Lgx;

    invoke-direct {v0}, Lgx;-><init>()V

    sput-object v0, Lgt;->a:Lhd;

    goto :goto_0

    .line 1512
    :cond_5
    const/16 v1, 0x9

    if-lt v0, v1, :cond_6

    .line 1513
    new-instance v0, Lgw;

    invoke-direct {v0}, Lgw;-><init>()V

    sput-object v0, Lgt;->a:Lhd;

    goto :goto_0

    .line 1514
    :cond_6
    const/4 v1, 0x7

    if-lt v0, v1, :cond_7

    .line 1515
    new-instance v0, Lgv;

    invoke-direct {v0}, Lgv;-><init>()V

    sput-object v0, Lgt;->a:Lhd;

    goto :goto_0

    .line 1517
    :cond_7
    new-instance v0, Lgu;

    invoke-direct {v0}, Lgu;-><init>()V

    sput-object v0, Lgt;->a:Lhd;

    goto :goto_0
.end method

.method public static a(III)I
    .locals 1

    .prologue
    .line 2081
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1, p2}, Lhd;->a(III)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1554
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->a(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/view/View;Lix;)Lix;
    .locals 1

    .prologue
    .line 2648
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->a(Landroid/view/View;Lix;)Lix;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 2306
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->a(Landroid/view/View;F)V

    .line 2307
    return-void
.end method

.method public static a(Landroid/view/View;ILandroid/graphics/Paint;)V
    .locals 1

    .prologue
    .line 1927
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1, p2}, Lhd;->a(Landroid/view/View;ILandroid/graphics/Paint;)V

    .line 1928
    return-void
.end method

.method public static a(Landroid/view/View;Ler;)V
    .locals 1

    .prologue
    .line 1691
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->a(Landroid/view/View;Ler;)V

    .line 1692
    return-void
.end method

.method public static a(Landroid/view/View;Lgm;)V
    .locals 1

    .prologue
    .line 2632
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->a(Landroid/view/View;Lgm;)V

    .line 2633
    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 1769
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 1770
    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/Runnable;J)V
    .locals 2

    .prologue
    .line 1786
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1, p2, p3}, Lhd;->a(Landroid/view/View;Ljava/lang/Runnable;J)V

    .line 1787
    return-void
.end method

.method public static a(Landroid/view/View;Z)V
    .locals 2

    .prologue
    .line 2676
    sget-object v0, Lgt;->a:Lhd;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Lhd;->a(Landroid/view/View;Z)V

    .line 2677
    return-void
.end method

.method public static a(Landroid/view/ViewGroup;Z)V
    .locals 2

    .prologue
    .line 2594
    sget-object v0, Lgt;->a:Lhd;

    const/4 v1, 0x1

    invoke-interface {v0, p0, v1}, Lhd;->a(Landroid/view/ViewGroup;Z)V

    .line 2595
    return-void
.end method

.method public static a(Landroid/view/View;I)Z
    .locals 1

    .prologue
    .line 1529
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->a(Landroid/view/View;I)Z

    move-result v0

    return v0
.end method

.method public static b(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 2322
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->b(Landroid/view/View;F)V

    .line 2323
    return-void
.end method

.method public static b(Landroid/view/View;Z)V
    .locals 1

    .prologue
    .line 2689
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->b(Landroid/view/View;Z)V

    .line 2690
    return-void
.end method

.method public static b(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 1701
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->b(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public static b(Landroid/view/View;I)Z
    .locals 1

    .prologue
    .line 1540
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->b(Landroid/view/View;I)Z

    move-result v0

    return v0
.end method

.method public static c(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 2338
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->c(Landroid/view/View;F)V

    .line 2339
    return-void
.end method

.method public static c(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 1828
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->c(Landroid/view/View;I)V

    .line 1829
    return-void
.end method

.method public static c(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 1713
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->c(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public static d(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 1737
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->d(Landroid/view/View;)V

    .line 1738
    return-void
.end method

.method public static d(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 2416
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->d(Landroid/view/View;F)V

    .line 2417
    return-void
.end method

.method public static e(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1804
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->e(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static e(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 2428
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->e(Landroid/view/View;F)V

    .line 2429
    return-void
.end method

.method public static f(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 1884
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->f(Landroid/view/View;)F

    move-result v0

    return v0
.end method

.method public static f(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 2516
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0, p1}, Lhd;->f(Landroid/view/View;F)V

    .line 2517
    return-void
.end method

.method public static g(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 2019
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->g(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static h(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 1

    .prologue
    .line 2051
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->h(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object v0

    return-object v0
.end method

.method public static i(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 2095
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->i(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static j(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 2120
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->j(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static k(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 2245
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->k(Landroid/view/View;)F

    move-result v0

    return v0
.end method

.method public static l(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 2258
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->l(Landroid/view/View;)F

    move-result v0

    return v0
.end method

.method public static m(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 2269
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->m(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static n(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 2280
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->n(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static o(Landroid/view/View;)Lih;
    .locals 1

    .prologue
    .line 2292
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->o(Landroid/view/View;)Lih;

    move-result-object v0

    return-object v0
.end method

.method public static p(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 2573
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->p(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static q(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 2581
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->q(Landroid/view/View;)V

    .line 2582
    return-void
.end method

.method public static r(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 2602
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->r(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public static s(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 2623
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->s(Landroid/view/View;)V

    .line 2624
    return-void
.end method

.method public static t(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 2831
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->t(Landroid/view/View;)V

    .line 2832
    return-void
.end method

.method public static u(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 2961
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->u(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public static v(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 3006
    sget-object v0, Lgt;->a:Lhd;

    invoke-interface {v0, p0}, Lhd;->v(Landroid/view/View;)Z

    move-result v0

    return v0
.end method
