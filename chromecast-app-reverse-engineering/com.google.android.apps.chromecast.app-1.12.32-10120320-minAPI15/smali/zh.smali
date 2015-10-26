.class public abstract Lzh;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field private a:Z

.field public d:Lxb;

.field public e:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 5546
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5553
    const/4 v0, 0x0

    iput-boolean v0, p0, Lzh;->a:Z

    .line 7668
    return-void
.end method

.method public static a(IIIZ)I
    .locals 4

    .prologue
    const/high16 v0, 0x40000000    # 2.0f

    const/4 v1, 0x0

    .line 6715
    sub-int v2, p0, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 6719
    if-eqz p3, :cond_2

    .line 6720
    if-ltz p2, :cond_1

    .line 6741
    :cond_0
    :goto_0
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    return v0

    :cond_1
    move v0, v1

    move p2, v1

    .line 6727
    goto :goto_0

    .line 6730
    :cond_2
    if-gez p2, :cond_0

    .line 6733
    const/4 v3, -0x1

    if-ne p2, v3, :cond_3

    move p2, v2

    .line 6735
    goto :goto_0

    .line 6736
    :cond_3
    const/4 v0, -0x2

    if-ne p2, v0, :cond_4

    .line 6738
    const/high16 v0, -0x80000000

    move p2, v2

    goto :goto_0

    :cond_4
    move v0, v1

    move p2, v1

    goto :goto_0
.end method

.method public static a(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 6151
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 12480
    iget-object v0, v0, Lzi;->c:Lzr;

    invoke-virtual {v0}, Lzr;->d()I

    move-result v0

    .line 6151
    return v0
.end method

.method public static a(Landroid/view/View;IIII)V
    .locals 4

    .prologue
    .line 6800
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    iget-object v0, v0, Lzi;->d:Landroid/graphics/Rect;

    .line 6801
    iget v1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, p1

    iget v2, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, p2

    iget v3, v0, Landroid/graphics/Rect;->right:I

    sub-int v3, p3, v3

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int v0, p4, v0

    invoke-virtual {p0, v1, v2, v3, v0}, Landroid/view/View;->layout(IIII)V

    .line 6803
    return-void
.end method

.method public static synthetic a(Lzh;)Z
    .locals 1

    .prologue
    .line 5546
    iget-boolean v0, p0, Lzh;->a:Z

    return v0
.end method

.method public static synthetic a(Lzh;Z)Z
    .locals 1

    .prologue
    .line 5546
    const/4 v0, 0x0

    iput-boolean v0, p0, Lzh;->a:Z

    return v0
.end method

.method public static b(Landroid/view/View;)I
    .locals 3

    .prologue
    .line 6754
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    iget-object v0, v0, Lzi;->d:Landroid/graphics/Rect;

    .line 6755
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget v2, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v1

    return v0
.end method

.method public static c(Landroid/view/View;)I
    .locals 3

    .prologue
    .line 6768
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    iget-object v0, v0, Lzi;->d:Landroid/graphics/Rect;

    .line 6769
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget v2, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v2

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v0, v1

    return v0
.end method

.method public static d(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 6891
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    iget-object v0, v0, Lzi;->d:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    return v0
.end method

.method public static e(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 6906
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    iget-object v0, v0, Lzi;->d:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    return v0
.end method

.method public static f(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 6921
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    iget-object v0, v0, Lzi;->d:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    return v0
.end method

.method public static g(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 6936
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    iget-object v0, v0, Lzi;->d:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    return v0
.end method


# virtual methods
.method public a(ILzl;Lzp;)I
    .locals 1

    .prologue
    .line 5870
    const/4 v0, 0x0

    return v0
.end method

.method public a(Lzl;Lzp;)I
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 7530
    iget-object v1, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v1

    if-nez v1, :cond_1

    .line 7533
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lzh;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v0

    invoke-virtual {v0}, Lyz;->a()I

    move-result v0

    goto :goto_0
.end method

.method public a(Lzp;)I
    .locals 1

    .prologue
    .line 7201
    const/4 v0, 0x0

    return v0
.end method

.method public a(Landroid/content/Context;Landroid/util/AttributeSet;)Lzi;
    .locals 1

    .prologue
    .line 5853
    new-instance v0, Lzi;

    invoke-direct {v0, p1, p2}, Lzi;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public a(Landroid/view/ViewGroup$LayoutParams;)Lzi;
    .locals 1

    .prologue
    .line 5829
    instance-of v0, p1, Lzi;

    if-eqz v0, :cond_0

    .line 5830
    new-instance v0, Lzi;

    check-cast p1, Lzi;

    invoke-direct {v0, p1}, Lzi;-><init>(Lzi;)V

    .line 5834
    :goto_0
    return-object v0

    .line 5831
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 5832
    new-instance v0, Lzi;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Lzi;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    goto :goto_0

    .line 5834
    :cond_1
    new-instance v0, Lzi;

    invoke-direct {v0, p1}, Lzi;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public a()V
    .locals 0

    .prologue
    .line 7135
    return-void
.end method

.method public final a(ILzl;)V
    .locals 1

    .prologue
    .line 6358
    invoke-virtual {p0, p1}, Lzh;->f(I)Landroid/view/View;

    move-result-object v0

    .line 6359
    invoke-virtual {p0, p1}, Lzh;->d(I)V

    .line 6360
    invoke-virtual {p2, v0}, Lzl;->a(Landroid/view/View;)V

    .line 6361
    return-void
.end method

.method public a(Landroid/os/Parcelable;)V
    .locals 0

    .prologue
    .line 7323
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 5558
    if-nez p1, :cond_0

    .line 5559
    iput-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    .line 5560
    iput-object v0, p0, Lzh;->d:Lxb;

    .line 5566
    :goto_0
    return-void

    .line 5562
    :cond_0
    iput-object p1, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    .line 5563
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView;->c:Lxb;

    iput-object v0, p0, Lzh;->d:Lxb;

    goto :goto_0
.end method

.method public a(Landroid/support/v7/widget/RecyclerView;Lzl;)V
    .locals 0

    .prologue
    .line 5718
    return-void
.end method

.method a(Landroid/view/View;IZ)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v2, -0x1

    .line 6041
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v3

    .line 6042
    if-nez p3, :cond_0

    invoke-virtual {v3}, Lzr;->n()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 6044
    :cond_0
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, p1}, Lzp;->b(Landroid/view/View;)V

    .line 6053
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 6054
    invoke-virtual {v3}, Lzr;->g()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v3}, Lzr;->e()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 6055
    :cond_1
    invoke-virtual {v3}, Lzr;->e()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 6056
    invoke-virtual {v3}, Lzr;->f()V

    .line 6060
    :goto_1
    iget-object v1, p0, Lzh;->d:Lxb;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {v1, p1, p2, v2, v7}, Lxb;->a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    .line 6085
    :cond_2
    :goto_2
    iget-boolean v1, v0, Lzi;->f:Z

    if-eqz v1, :cond_3

    .line 6089
    iget-object v1, v3, Lzr;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 6090
    iput-boolean v7, v0, Lzi;->f:Z

    .line 6092
    :cond_3
    return-void

    .line 6051
    :cond_4
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v0, p1}, Lzp;->a(Landroid/view/View;)V

    goto :goto_0

    .line 6058
    :cond_5
    invoke-virtual {v3}, Lzr;->h()V

    goto :goto_1

    .line 6064
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    iget-object v4, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-ne v1, v4, :cond_d

    .line 6066
    iget-object v1, p0, Lzh;->d:Lxb;

    .line 9270
    iget-object v4, v1, Lxb;->a:Lxd;

    invoke-interface {v4, p1}, Lxd;->a(Landroid/view/View;)I

    move-result v4

    .line 9271
    if-ne v4, v2, :cond_8

    move v1, v2

    .line 6067
    :goto_3
    if-ne p2, v2, :cond_7

    .line 6068
    iget-object v4, p0, Lzh;->d:Lxb;

    invoke-virtual {v4}, Lxb;->a()I

    move-result p2

    .line 6070
    :cond_7
    if-ne v1, v2, :cond_a

    .line 6071
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, p1}, Landroid/support/v7/widget/RecyclerView;->indexOfChild(Landroid/view/View;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9274
    :cond_8
    iget-object v5, v1, Lxb;->b:Lxc;

    invoke-virtual {v5, v4}, Lxc;->b(I)Z

    move-result v5

    if-eqz v5, :cond_9

    move v1, v2

    .line 9278
    goto :goto_3

    .line 9282
    :cond_9
    iget-object v1, v1, Lxb;->b:Lxc;

    invoke-virtual {v1, v4}, Lxc;->d(I)I

    move-result v1

    sub-int v1, v4, v1

    goto :goto_3

    .line 6075
    :cond_a
    if-eq v1, p2, :cond_2

    .line 6076
    iget-object v2, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/support/v7/widget/RecyclerView;)Lzh;

    move-result-object v2

    .line 9303
    invoke-virtual {v2, v1}, Lzh;->f(I)Landroid/view/View;

    move-result-object v4

    .line 9304
    if-nez v4, :cond_b

    .line 9305
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot move a child from non-existing index:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9308
    :cond_b
    invoke-virtual {v2, v1}, Lzh;->e(I)V

    .line 10272
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lzi;

    .line 11251
    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v5

    .line 11252
    invoke-virtual {v5}, Lzr;->n()Z

    move-result v6

    if-eqz v6, :cond_c

    .line 11253
    iget-object v6, v2, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v6, v6, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v6, v4}, Lzp;->b(Landroid/view/View;)V

    .line 11257
    :goto_4
    iget-object v2, v2, Lzh;->d:Lxb;

    invoke-virtual {v5}, Lzr;->n()Z

    move-result v5

    invoke-virtual {v2, v4, p2, v1, v5}, Lxb;->a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    goto/16 :goto_2

    .line 11255
    :cond_c
    iget-object v6, v2, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v6, v6, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {v6, v4}, Lzp;->a(Landroid/view/View;)V

    goto :goto_4

    .line 6079
    :cond_d
    iget-object v1, p0, Lzh;->d:Lxb;

    invoke-virtual {v1, p1, p2, v7}, Lxb;->a(Landroid/view/View;IZ)V

    .line 6080
    const/4 v1, 0x1

    iput-boolean v1, v0, Lzi;->e:Z

    goto/16 :goto_2
.end method

.method final a(Landroid/view/View;Ljd;)V
    .locals 2

    .prologue
    .line 7452
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v0

    .line 7454
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lzr;->n()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lzh;->d:Lxb;

    iget-object v0, v0, Lzr;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Lxb;->a(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 7455
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    iget-object v1, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    invoke-virtual {p0, v0, v1, p1, p2}, Lzh;->a(Lzl;Lzp;Landroid/view/View;Ljd;)V

    .line 7458
    :cond_0
    return-void
.end method

.method public a(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    const/4 v0, 0x1

    .line 7419
    iget-object v1, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->a:Lzl;

    iget-object v1, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 14435
    invoke-static {p1}, Liz;->a(Landroid/view/accessibility/AccessibilityEvent;)Ljx;

    move-result-object v1

    .line 14437
    iget-object v2, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-nez v2, :cond_1

    .line 14438
    :cond_0
    :goto_0
    return-void

    .line 14440
    :cond_1
    iget-object v2, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2, v0}, Lgt;->b(Landroid/view/View;I)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2, v3}, Lgt;->b(Landroid/view/View;I)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2, v3}, Lgt;->a(Landroid/view/View;I)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2, v0}, Lgt;->a(Landroid/view/View;I)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    :goto_1
    invoke-virtual {v1, v0}, Ljx;->a(Z)V

    .line 14445
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 14446
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v0

    invoke-virtual {v0}, Lyz;->a()I

    move-result v0

    invoke-virtual {v1, v0}, Ljx;->a(I)V

    goto :goto_0

    .line 14440
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 5598
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 5599
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 5601
    :cond_0
    return-void
.end method

.method public final a(Lzl;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 6615
    .line 13689
    iget-object v0, p1, Lzl;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 6617
    add-int/lit8 v0, v2, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_3

    .line 13693
    iget-object v0, p1, Lzl;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    iget-object v0, v0, Lzr;->a:Landroid/view/View;

    .line 6619
    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v3

    .line 6620
    invoke-virtual {v3}, Lzr;->b()Z

    move-result v4

    if-nez v4, :cond_2

    .line 6628
    invoke-virtual {v3, v5}, Lzr;->a(Z)V

    .line 6629
    invoke-virtual {v3}, Lzr;->o()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 6630
    iget-object v4, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v4, v0, v5}, Landroid/support/v7/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 6632
    :cond_0
    iget-object v4, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    if-eqz v4, :cond_1

    .line 6633
    iget-object v4, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView;->m:Lzc;

    invoke-virtual {v4, v3}, Lzc;->c(Lzr;)V

    .line 6635
    :cond_1
    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lzr;->a(Z)V

    .line 6636
    invoke-virtual {p1, v0}, Lzl;->b(Landroid/view/View;)V

    .line 6617
    :cond_2
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 13697
    :cond_3
    iget-object v0, p1, Lzl;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6639
    if-lez v2, :cond_4

    .line 6640
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->invalidate()V

    .line 6642
    :cond_4
    return-void
.end method

.method public a(Lzl;Lzp;Landroid/view/View;Ljd;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v4, 0x0

    .line 7476
    invoke-virtual {p0}, Lzh;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p3}, Lzh;->a(Landroid/view/View;)I

    move-result v0

    .line 7477
    :goto_0
    invoke-virtual {p0}, Lzh;->i()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p3}, Lzh;->a(Landroid/view/View;)I

    move-result v2

    :goto_1
    move v3, v1

    move v5, v4

    .line 7478
    invoke-static/range {v0 .. v5}, Ljm;->a(IIIIZZ)Ljm;

    move-result-object v0

    .line 7481
    invoke-virtual {p4, v0}, Ljd;->a(Ljava/lang/Object;)V

    .line 7482
    return-void

    :cond_0
    move v0, v4

    .line 7476
    goto :goto_0

    :cond_1
    move v2, v4

    .line 7477
    goto :goto_1
.end method

.method public a(Lzi;)Z
    .locals 1

    .prologue
    .line 5812
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(ILzl;Lzp;)I
    .locals 1

    .prologue
    .line 5887
    const/4 v0, 0x0

    return v0
.end method

.method public b(Lzl;Lzp;)I
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 7549
    iget-object v1, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v1

    if-nez v1, :cond_1

    .line 7552
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lzh;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    move-result-object v0

    invoke-virtual {v0}, Lyz;->a()I

    move-result v0

    goto :goto_0
.end method

.method public b(Lzp;)I
    .locals 1

    .prologue
    .line 7246
    const/4 v0, 0x0

    return v0
.end method

.method public b(I)Landroid/view/View;
    .locals 5

    .prologue
    .line 6178
    invoke-virtual {p0}, Lzh;->n()I

    move-result v2

    .line 6179
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_2

    .line 6180
    invoke-virtual {p0, v1}, Lzh;->f(I)Landroid/view/View;

    move-result-object v0

    .line 6181
    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v3

    .line 6182
    if-eqz v3, :cond_1

    .line 6185
    invoke-virtual {v3}, Lzr;->d()I

    move-result v4

    if-ne v4, p1, :cond_1

    invoke-virtual {v3}, Lzr;->b()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView;->n:Lzp;

    .line 13090
    iget-boolean v4, v4, Lzp;->j:Z

    .line 6185
    if-nez v4, :cond_0

    invoke-virtual {v3}, Lzr;->n()Z

    move-result v3

    if-nez v3, :cond_1

    .line 6190
    :cond_0
    :goto_1
    return-object v0

    .line 6179
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 6190
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public b()V
    .locals 0

    .prologue
    .line 7123
    return-void
.end method

.method public c(Lzp;)I
    .locals 1

    .prologue
    .line 7186
    const/4 v0, 0x0

    return v0
.end method

.method public c(ILzl;Lzp;)Landroid/view/View;
    .locals 1

    .prologue
    .line 6959
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()V
    .locals 0

    .prologue
    .line 7145
    return-void
.end method

.method public c(I)V
    .locals 0

    .prologue
    .line 5920
    return-void
.end method

.method public c(Lzl;Lzp;)V
    .locals 2

    .prologue
    .line 5781
    const-string v0, "RecyclerView"

    const-string v1, "You must override onLayoutChildren(Recycler recycler, State state) "

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 5782
    return-void
.end method

.method public d(Lzp;)I
    .locals 1

    .prologue
    .line 7231
    const/4 v0, 0x0

    return v0
.end method

.method public d()V
    .locals 0

    .prologue
    .line 7155
    return-void
.end method

.method public final d(I)V
    .locals 4

    .prologue
    .line 6115
    invoke-virtual {p0, p1}, Lzh;->f(I)Landroid/view/View;

    move-result-object v0

    .line 6116
    if-eqz v0, :cond_1

    .line 6117
    iget-object v0, p0, Lzh;->d:Lxb;

    .line 12136
    invoke-virtual {v0, p1}, Lxb;->a(I)I

    move-result v1

    .line 12137
    iget-object v2, v0, Lxb;->a:Lxd;

    invoke-interface {v2, v1}, Lxd;->b(I)Landroid/view/View;

    move-result-object v2

    .line 12138
    if-eqz v2, :cond_1

    .line 12141
    iget-object v3, v0, Lxb;->b:Lxc;

    invoke-virtual {v3, v1}, Lxc;->c(I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 12142
    iget-object v3, v0, Lxb;->c:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 12144
    :cond_0
    iget-object v0, v0, Lxb;->a:Lxd;

    invoke-interface {v0, v1}, Lxd;->a(I)V

    .line 6119
    :cond_1
    return-void
.end method

.method public e(Lzp;)I
    .locals 1

    .prologue
    .line 7216
    const/4 v0, 0x0

    return v0
.end method

.method public e()V
    .locals 0

    .prologue
    .line 7171
    return-void
.end method

.method public final e(I)V
    .locals 3

    .prologue
    .line 6231
    invoke-virtual {p0, p1}, Lzh;->f(I)Landroid/view/View;

    .line 13238
    iget-object v0, p0, Lzh;->d:Lxb;

    .line 13255
    invoke-virtual {v0, p1}, Lxb;->a(I)I

    move-result v1

    .line 13256
    iget-object v2, v0, Lxb;->b:Lxc;

    invoke-virtual {v2, v1}, Lxc;->c(I)Z

    .line 13257
    iget-object v0, v0, Lxb;->a:Lxd;

    invoke-interface {v0, v1}, Lxd;->c(I)V

    .line 6232
    return-void
.end method

.method public f(Lzp;)I
    .locals 1

    .prologue
    .line 7261
    const/4 v0, 0x0

    return v0
.end method

.method public final f(I)Landroid/view/View;
    .locals 1

    .prologue
    .line 6379
    iget-object v0, p0, Lzh;->d:Lxb;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzh;->d:Lxb;

    invoke-virtual {v0, p1}, Lxb;->b(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public abstract f()Lzi;
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 5624
    const/4 v0, 0x0

    return v0
.end method

.method public h()Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 7317
    const/4 v0, 0x0

    return-object v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 5897
    const/4 v0, 0x0

    return v0
.end method

.method public j()Z
    .locals 1

    .prologue
    .line 5907
    const/4 v0, 0x0

    return v0
.end method

.method public final m()V
    .locals 1

    .prologue
    .line 5572
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 5573
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 5575
    :cond_0
    return-void
.end method

.method public final n()I
    .locals 1

    .prologue
    .line 6370
    iget-object v0, p0, Lzh;->d:Lxb;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzh;->d:Lxb;

    invoke-virtual {v0}, Lxb;->a()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final o()I
    .locals 1

    .prologue
    .line 6388
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getWidth()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final p()I
    .locals 1

    .prologue
    .line 6397
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getHeight()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final q()I
    .locals 1

    .prologue
    .line 6406
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getPaddingLeft()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final r()I
    .locals 1

    .prologue
    .line 6415
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getPaddingTop()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final s()I
    .locals 1

    .prologue
    .line 6424
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getPaddingRight()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final t()I
    .locals 1

    .prologue
    .line 6433
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getPaddingBottom()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
