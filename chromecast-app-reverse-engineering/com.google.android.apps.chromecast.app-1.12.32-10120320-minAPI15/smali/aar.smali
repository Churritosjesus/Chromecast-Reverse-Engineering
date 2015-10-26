.class public final Laar;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lqp;


# instance fields
.field public a:Lqe;

.field private b:Lqa;

.field private synthetic c:Landroid/support/v7/widget/Toolbar;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/Toolbar;)V
    .locals 0

    .prologue
    .line 1881
    iput-object p1, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lqa;)V
    .locals 2

    .prologue
    .line 1888
    iget-object v0, p0, Laar;->b:Lqa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Laar;->a:Lqe;

    if-eqz v0, :cond_0

    .line 1889
    iget-object v0, p0, Laar;->b:Lqa;

    iget-object v1, p0, Laar;->a:Lqe;

    invoke-virtual {v0, v1}, Lqa;->b(Lqe;)Z

    .line 1891
    :cond_0
    iput-object p2, p0, Laar;->b:Lqa;

    .line 1892
    return-void
.end method

.method public final a(Lqa;Z)V
    .locals 0

    .prologue
    .line 1934
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 1938
    const/4 v0, 0x0

    return v0
.end method

.method public final a(Lqu;)Z
    .locals 1

    .prologue
    .line 1929
    const/4 v0, 0x0

    return v0
.end method

.method public final b(Z)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 1902
    iget-object v1, p0, Laar;->a:Lqe;

    if-eqz v1, :cond_1

    .line 1905
    iget-object v1, p0, Laar;->b:Lqa;

    if-eqz v1, :cond_0

    .line 1906
    iget-object v1, p0, Laar;->b:Lqa;

    invoke-virtual {v1}, Lqa;->size()I

    move-result v2

    move v1, v0

    .line 1907
    :goto_0
    if-ge v1, v2, :cond_0

    .line 1908
    iget-object v3, p0, Laar;->b:Lqa;

    invoke-virtual {v3, v1}, Lqa;->getItem(I)Landroid/view/MenuItem;

    move-result-object v3

    .line 1909
    iget-object v4, p0, Laar;->a:Lqe;

    if-ne v3, v4, :cond_2

    .line 1910
    const/4 v0, 0x1

    .line 1916
    :cond_0
    if-nez v0, :cond_1

    .line 1918
    iget-object v0, p0, Laar;->a:Lqe;

    invoke-virtual {p0, v0}, Laar;->c(Lqe;)Z

    .line 1921
    :cond_1
    return-void

    .line 1907
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public final b(Lqe;)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1943
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v0}, Landroid/support/v7/widget/Toolbar;->b(Landroid/support/v7/widget/Toolbar;)V

    .line 1944
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v0}, Landroid/support/v7/widget/Toolbar;->c(Landroid/support/v7/widget/Toolbar;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    if-eq v0, v1, :cond_0

    .line 1945
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v1}, Landroid/support/v7/widget/Toolbar;->c(Landroid/support/v7/widget/Toolbar;)Landroid/widget/ImageButton;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->addView(Landroid/view/View;)V

    .line 1947
    :cond_0
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p1}, Lqe;->getActionView()Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v7/widget/Toolbar;->e:Landroid/view/View;

    .line 1948
    iput-object p1, p0, Laar;->a:Lqe;

    .line 1949
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    if-eq v0, v1, :cond_1

    .line 1950
    invoke-static {}, Landroid/support/v7/widget/Toolbar;->g()Laas;

    move-result-object v0

    .line 1951
    const v1, 0x800003

    iget-object v2, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v2}, Landroid/support/v7/widget/Toolbar;->d(Landroid/support/v7/widget/Toolbar;)I

    move-result v2

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    iput v1, v0, Laas;->a:I

    .line 1952
    const/4 v1, 0x2

    iput v1, v0, Laas;->b:I

    .line 1953
    iget-object v1, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, v1, Landroid/support/v7/widget/Toolbar;->e:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1954
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, v1, Landroid/support/v7/widget/Toolbar;->e:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->addView(Landroid/view/View;)V

    .line 1957
    :cond_1
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v0, v3}, Landroid/support/v7/widget/Toolbar;->a(Landroid/support/v7/widget/Toolbar;Z)V

    .line 1958
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V

    .line 1959
    invoke-virtual {p1, v3}, Lqe;->e(Z)V

    .line 1961
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->e:Landroid/view/View;

    instance-of v0, v0, Lvt;

    if-eqz v0, :cond_2

    .line 1962
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->e:Landroid/view/View;

    check-cast v0, Lvt;

    invoke-interface {v0}, Lvt;->a()V

    .line 1965
    :cond_2
    return v3
.end method

.method public final c(Lqe;)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 1972
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->e:Landroid/view/View;

    instance-of v0, v0, Lvt;

    if-eqz v0, :cond_0

    .line 1973
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->e:Landroid/view/View;

    check-cast v0, Lvt;

    invoke-interface {v0}, Lvt;->b()V

    .line 1976
    :cond_0
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, v1, Landroid/support/v7/widget/Toolbar;->e:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V

    .line 1977
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v1}, Landroid/support/v7/widget/Toolbar;->c(Landroid/support/v7/widget/Toolbar;)Landroid/widget/ImageButton;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V

    .line 1978
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    iput-object v3, v0, Landroid/support/v7/widget/Toolbar;->e:Landroid/view/View;

    .line 1980
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v0, v2}, Landroid/support/v7/widget/Toolbar;->a(Landroid/support/v7/widget/Toolbar;Z)V

    .line 1981
    iput-object v3, p0, Laar;->a:Lqe;

    .line 1982
    iget-object v0, p0, Laar;->c:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V

    .line 1983
    invoke-virtual {p1, v2}, Lqe;->e(Z)V

    .line 1985
    const/4 v0, 0x1

    return v0
.end method
