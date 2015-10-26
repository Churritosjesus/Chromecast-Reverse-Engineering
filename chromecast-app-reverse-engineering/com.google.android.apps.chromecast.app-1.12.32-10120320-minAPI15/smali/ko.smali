.class public final Lko;
.super Ler;
.source "PG"


# instance fields
.field private final b:Landroid/graphics/Rect;

.field private synthetic c:Landroid/support/v4/widget/DrawerLayout;


# direct methods
.method public constructor <init>(Landroid/support/v4/widget/DrawerLayout;)V
    .locals 1

    .prologue
    .line 1828
    iput-object p1, p0, Lko;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-direct {p0}, Ler;-><init>()V

    .line 1829
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lko;->b:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Ljd;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 1833
    invoke-static {}, Landroid/support/v4/widget/DrawerLayout;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1834
    invoke-super {p0, p1, p2}, Ler;->a(Landroid/view/View;Ljd;)V

    .line 1853
    :cond_0
    const-class v0, Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljd;->a(Ljava/lang/CharSequence;)V

    .line 1858
    invoke-virtual {p2, v1}, Ljd;->a(Z)V

    .line 1859
    invoke-virtual {p2, v1}, Ljd;->b(Z)V

    .line 1860
    return-void

    .line 1838
    :cond_1
    invoke-static {p2}, Ljd;->a(Ljd;)Ljd;

    move-result-object v2

    .line 1840
    invoke-super {p0, p1, v2}, Ler;->a(Landroid/view/View;Ljd;)V

    .line 2715
    sget-object v0, Ljd;->a:Ljh;

    iget-object v3, p2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v3, p1}, Ljh;->c(Ljava/lang/Object;Landroid/view/View;)V

    .line 1843
    invoke-static {p1}, Lgt;->h(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object v0

    .line 1844
    instance-of v3, v0, Landroid/view/View;

    if-eqz v3, :cond_2

    .line 1845
    check-cast v0, Landroid/view/View;

    invoke-virtual {p2, v0}, Ljd;->a(Landroid/view/View;)V

    .line 2919
    :cond_2
    iget-object v0, p0, Lko;->b:Landroid/graphics/Rect;

    .line 2921
    invoke-virtual {v2, v0}, Ljd;->a(Landroid/graphics/Rect;)V

    .line 3040
    sget-object v3, Ljd;->a:Ljh;

    iget-object v4, p2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4, v0}, Ljh;->c(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 2924
    invoke-virtual {v2, v0}, Ljd;->b(Landroid/graphics/Rect;)V

    .line 3064
    sget-object v3, Ljd;->a:Ljh;

    iget-object v4, p2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4, v0}, Ljh;->d(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 3169
    sget-object v0, Ljd;->a:Ljh;

    iget-object v3, v2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljh;->r(Ljava/lang/Object;)Z

    move-result v0

    .line 3185
    sget-object v3, Ljd;->a:Ljh;

    iget-object v4, p2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4, v0}, Ljh;->h(Ljava/lang/Object;Z)V

    .line 2928
    invoke-virtual {v2}, Ljd;->h()Ljava/lang/CharSequence;

    move-result-object v0

    .line 3378
    sget-object v3, Ljd;->a:Ljh;

    iget-object v4, p2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4, v0}, Ljh;->c(Ljava/lang/Object;Ljava/lang/CharSequence;)V

    .line 2929
    invoke-virtual {v2}, Ljd;->i()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljd;->a(Ljava/lang/CharSequence;)V

    .line 2930
    invoke-virtual {v2}, Ljd;->j()Ljava/lang/CharSequence;

    move-result-object v0

    .line 3450
    sget-object v3, Ljd;->a:Ljh;

    iget-object v4, p2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4, v0}, Ljh;->b(Ljava/lang/Object;Ljava/lang/CharSequence;)V

    .line 2932
    invoke-virtual {v2}, Ljd;->g()Z

    move-result v0

    .line 4306
    sget-object v3, Ljd;->a:Ljh;

    iget-object v4, p2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4, v0}, Ljh;->b(Ljava/lang/Object;Z)V

    .line 2933
    invoke-virtual {v2}, Ljd;->e()Z

    move-result v0

    .line 5258
    sget-object v3, Ljd;->a:Ljh;

    iget-object v4, p2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4, v0}, Ljh;->a(Ljava/lang/Object;Z)V

    .line 2934
    invoke-virtual {v2}, Ljd;->b()Z

    move-result v0

    invoke-virtual {p2, v0}, Ljd;->a(Z)V

    .line 2935
    invoke-virtual {v2}, Ljd;->c()Z

    move-result v0

    invoke-virtual {p2, v0}, Ljd;->b(Z)V

    .line 6194
    sget-object v0, Ljd;->a:Ljh;

    iget-object v3, v2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljh;->s(Ljava/lang/Object;)Z

    move-result v0

    .line 6210
    sget-object v3, Ljd;->a:Ljh;

    iget-object v4, p2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4, v0}, Ljh;->i(Ljava/lang/Object;Z)V

    .line 2937
    invoke-virtual {v2}, Ljd;->d()Z

    move-result v0

    .line 6234
    sget-object v3, Ljd;->a:Ljh;

    iget-object v4, p2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4, v0}, Ljh;->g(Ljava/lang/Object;Z)V

    .line 2938
    invoke-virtual {v2}, Ljd;->f()Z

    move-result v0

    .line 6282
    sget-object v3, Ljd;->a:Ljh;

    iget-object v4, p2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v3, v4, v0}, Ljh;->e(Ljava/lang/Object;Z)V

    .line 2940
    invoke-virtual {v2}, Ljd;->a()I

    move-result v0

    invoke-virtual {p2, v0}, Ljd;->a(I)V

    .line 6461
    sget-object v0, Ljd;->a:Ljh;

    iget-object v2, v2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljh;->q(Ljava/lang/Object;)V

    .line 1850
    check-cast p1, Landroid/view/ViewGroup;

    .line 6903
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    move v0, v1

    .line 6904
    :goto_0
    if-ge v0, v2, :cond_0

    .line 6905
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 6906
    invoke-static {v3}, Landroid/support/v4/widget/DrawerLayout;->i(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 7821
    sget-object v4, Ljd;->a:Ljh;

    iget-object v5, p2, Ljd;->b:Ljava/lang/Object;

    invoke-virtual {v4, v5, v3}, Ljh;->a(Ljava/lang/Object;Landroid/view/View;)V

    .line 6904
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .prologue
    .line 1896
    invoke-static {}, Landroid/support/v4/widget/DrawerLayout;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/support/v4/widget/DrawerLayout;->i(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1897
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ler;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v0

    .line 1899
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3

    .prologue
    .line 1876
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    .line 1877
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v0

    .line 1878
    iget-object v1, p0, Lko;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-static {v1}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/support/v4/widget/DrawerLayout;)Landroid/view/View;

    move-result-object v1

    .line 1879
    if-eqz v1, :cond_1

    .line 1880
    iget-object v2, p0, Lko;->c:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v2, v1}, Landroid/support/v4/widget/DrawerLayout;->c(Landroid/view/View;)I

    move-result v1

    .line 1881
    iget-object v2, p0, Lko;->c:Landroid/support/v4/widget/DrawerLayout;

    .line 8596
    invoke-static {v2}, Lgt;->g(Landroid/view/View;)I

    move-result v2

    invoke-static {v1, v2}, Lfe;->a(II)I

    move-result v1

    .line 8598
    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    .line 8603
    :cond_0
    const/4 v1, 0x0

    .line 1882
    if-eqz v1, :cond_1

    .line 1883
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1887
    :cond_1
    const/4 v0, 0x1

    .line 1890
    :goto_0
    return v0

    :cond_2
    invoke-super {p0, p1, p2}, Ler;->b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public final d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .prologue
    .line 1864
    invoke-super {p0, p1, p2}, Ler;->d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1866
    const-class v0, Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 1867
    return-void
.end method
