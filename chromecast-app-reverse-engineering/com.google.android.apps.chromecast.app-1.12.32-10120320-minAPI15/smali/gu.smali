.class Lgu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lhd;


# instance fields
.field a:Ljava/util/WeakHashMap;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 385
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 389
    const/4 v0, 0x0

    iput-object v0, p0, Lgu;->a:Ljava/util/WeakHashMap;

    return-void
.end method


# virtual methods
.method public a(III)I
    .locals 1

    .prologue
    .line 505
    invoke-static {p1, p2}, Landroid/view/View;->resolveSize(II)I

    move-result v0

    return v0
.end method

.method public a(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 401
    const/4 v0, 0x2

    return v0
.end method

.method a()J
    .locals 2

    .prologue
    .line 444
    const-wide/16 v0, 0xa

    return-wide v0
.end method

.method public a(Landroid/view/View;Lix;)Lix;
    .locals 0

    .prologue
    .line 788
    return-object p2
.end method

.method public a(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 662
    return-void
.end method

.method public a(Landroid/view/View;ILandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 466
    return-void
.end method

.method public a(Landroid/view/View;Ler;)V
    .locals 0

    .prologue
    .line 408
    return-void
.end method

.method public a(Landroid/view/View;Lgm;)V
    .locals 0

    .prologue
    .line 784
    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 438
    invoke-virtual {p0}, Lgu;->a()J

    move-result-wide v0

    invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 439
    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/Runnable;J)V
    .locals 3

    .prologue
    .line 441
    invoke-virtual {p0}, Lgu;->a()J

    move-result-wide v0

    add-long/2addr v0, p3

    invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 442
    return-void
.end method

.method public a(Landroid/view/View;Z)V
    .locals 0

    .prologue
    .line 799
    return-void
.end method

.method public a(Landroid/view/ViewGroup;Z)V
    .locals 0

    .prologue
    .line 763
    return-void
.end method

.method public a(Landroid/view/View;I)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 393
    instance-of v2, p1, Lgo;

    if-eqz v2, :cond_3

    check-cast p1, Lgo;

    .line 1846
    invoke-interface {p1}, Lgo;->computeHorizontalScrollOffset()I

    move-result v2

    .line 1847
    invoke-interface {p1}, Lgo;->computeHorizontalScrollRange()I

    move-result v3

    invoke-interface {p1}, Lgo;->computeHorizontalScrollExtent()I

    move-result v4

    sub-int/2addr v3, v4

    .line 1849
    if-eqz v3, :cond_2

    .line 1850
    if-gez p2, :cond_1

    .line 1851
    if-lez v2, :cond_0

    move v2, v0

    .line 393
    :goto_0
    if-eqz v2, :cond_3

    :goto_1
    return v0

    :cond_0
    move v2, v1

    .line 1851
    goto :goto_0

    .line 1853
    :cond_1
    add-int/lit8 v3, v3, -0x1

    if-ge v2, v3, :cond_2

    move v2, v0

    goto :goto_0

    :cond_2
    move v2, v1

    goto :goto_0

    :cond_3
    move v0, v1

    .line 393
    goto :goto_1
.end method

.method public b(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 667
    return-void
.end method

.method public b(Landroid/view/View;Z)V
    .locals 0

    .prologue
    .line 804
    return-void
.end method

.method public b(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 412
    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroid/view/View;I)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 397
    instance-of v2, p1, Lgo;

    if-eqz v2, :cond_3

    check-cast p1, Lgo;

    .line 1858
    invoke-interface {p1}, Lgo;->computeVerticalScrollOffset()I

    move-result v2

    .line 1859
    invoke-interface {p1}, Lgo;->computeVerticalScrollRange()I

    move-result v3

    invoke-interface {p1}, Lgo;->computeVerticalScrollExtent()I

    move-result v4

    sub-int/2addr v3, v4

    .line 1861
    if-eqz v3, :cond_2

    .line 1862
    if-gez p2, :cond_1

    .line 1863
    if-lez v2, :cond_0

    move v2, v0

    .line 397
    :goto_0
    if-eqz v2, :cond_3

    :goto_1
    return v0

    :cond_0
    move v2, v1

    .line 1863
    goto :goto_0

    .line 1865
    :cond_1
    add-int/lit8 v3, v3, -0x1

    if-ge v2, v3, :cond_2

    move v2, v0

    goto :goto_0

    :cond_2
    move v2, v1

    goto :goto_0

    :cond_3
    move v0, v1

    .line 397
    goto :goto_1
.end method

.method public c(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 672
    return-void
.end method

.method public c(Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 451
    return-void
.end method

.method public c(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 426
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 432
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 433
    return-void
.end method

.method public d(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 687
    return-void
.end method

.method public e(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 447
    const/4 v0, 0x0

    return v0
.end method

.method public e(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 692
    return-void
.end method

.method public f(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 462
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public f(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 744
    return-void
.end method

.method public g(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 482
    const/4 v0, 0x0

    return v0
.end method

.method public h(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 1

    .prologue
    .line 492
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    return-object v0
.end method

.method public i(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 510
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    return v0
.end method

.method public j(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 520
    const/4 v0, 0x0

    return v0
.end method

.method public k(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 596
    const/4 v0, 0x0

    return v0
.end method

.method public l(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 601
    const/4 v0, 0x0

    return v0
.end method

.method public m(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 641
    invoke-static {p1}, La;->b(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public n(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 646
    invoke-static {p1}, La;->c(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public o(Landroid/view/View;)Lih;
    .locals 1

    .prologue
    .line 651
    new-instance v0, Lih;

    invoke-direct {v0, p1}, Lih;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public p(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 735
    const/4 v0, 0x0

    return v0
.end method

.method public q(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 740
    return-void
.end method

.method public r(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 767
    const/4 v0, 0x0

    return v0
.end method

.method public s(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 778
    return-void
.end method

.method public t(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 878
    instance-of v0, p1, Lgi;

    if-eqz v0, :cond_0

    .line 879
    check-cast p1, Lgi;

    invoke-interface {p1}, Lgi;->stopNestedScroll()V

    .line 881
    :cond_0
    return-void
.end method

.method public u(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 931
    .line 2059
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 931
    goto :goto_0
.end method

.method public v(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 946
    .line 2109
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 946
    goto :goto_0
.end method
