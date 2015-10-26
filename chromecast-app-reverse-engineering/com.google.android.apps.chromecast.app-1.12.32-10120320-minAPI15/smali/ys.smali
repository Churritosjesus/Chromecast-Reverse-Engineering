.class final Lys;
.super Lyq;
.source "PG"


# direct methods
.method constructor <init>(Lzh;)V
    .locals 1

    .prologue
    .line 270
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lyq;-><init>(Lzh;B)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)I
    .locals 3

    .prologue
    .line 316
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 318
    iget-object v1, p0, Lys;->a:Lzh;

    .line 8826
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-static {p1}, Lzh;->d(Landroid/view/View;)I

    move-result v2

    sub-int/2addr v1, v2

    .line 318
    iget v0, v0, Lzi;->topMargin:I

    sub-int v0, v1, v0

    return v0
.end method

.method public final a(I)V
    .locals 4

    .prologue
    .line 283
    iget-object v0, p0, Lys;->a:Lzh;

    .line 7524
    iget-object v1, v0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v1, :cond_0

    .line 7525
    iget-object v1, v0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    .line 7568
    iget-object v0, v1, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v0}, Lxb;->a()I

    move-result v2

    .line 7569
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    .line 7570
    iget-object v3, v1, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    invoke-virtual {v3, v0}, Lxb;->b(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 7569
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 284
    :cond_0
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 288
    iget-object v0, p0, Lys;->a:Lzh;

    invoke-virtual {v0}, Lzh;->r()I

    move-result v0

    return v0
.end method

.method public final b(Landroid/view/View;)I
    .locals 3

    .prologue
    .line 309
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 311
    iget-object v1, p0, Lys;->a:Lzh;

    .line 7850
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-static {p1}, Lzh;->e(Landroid/view/View;)I

    move-result v2

    add-int/2addr v1, v2

    .line 311
    iget v0, v0, Lzi;->bottomMargin:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final c()I
    .locals 2

    .prologue
    .line 273
    iget-object v0, p0, Lys;->a:Lzh;

    invoke-virtual {v0}, Lzh;->p()I

    move-result v0

    iget-object v1, p0, Lys;->a:Lzh;

    invoke-virtual {v1}, Lzh;->t()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final c(Landroid/view/View;)I
    .locals 3

    .prologue
    .line 293
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 295
    invoke-static {p1}, Lzh;->c(Landroid/view/View;)I

    move-result v1

    iget v2, v0, Lzi;->topMargin:I

    add-int/2addr v1, v2

    iget v0, v0, Lzi;->bottomMargin:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Lys;->a:Lzh;

    invoke-virtual {v0}, Lzh;->p()I

    move-result v0

    return v0
.end method

.method public final d(Landroid/view/View;)I
    .locals 3

    .prologue
    .line 301
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 303
    invoke-static {p1}, Lzh;->b(Landroid/view/View;)I

    move-result v1

    iget v2, v0, Lzi;->leftMargin:I

    add-int/2addr v1, v2

    iget v0, v0, Lzi;->rightMargin:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final e()I
    .locals 2

    .prologue
    .line 323
    iget-object v0, p0, Lys;->a:Lzh;

    invoke-virtual {v0}, Lzh;->p()I

    move-result v0

    iget-object v1, p0, Lys;->a:Lzh;

    invoke-virtual {v1}, Lzh;->r()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lys;->a:Lzh;

    invoke-virtual {v1}, Lzh;->t()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 334
    iget-object v0, p0, Lys;->a:Lzh;

    invoke-virtual {v0}, Lzh;->t()I

    move-result v0

    return v0
.end method
