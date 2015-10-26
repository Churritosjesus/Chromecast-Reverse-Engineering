.class public final Lczy;
.super Ldaf;
.source "PG"


# instance fields
.field final synthetic a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;IIILdah;)V
    .locals 10

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v0, 0x0

    .line 745
    iput-object p1, p0, Lczy;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    .line 746
    invoke-direct {p0, p1, p5}, Ldaf;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;Ldah;)V

    .line 747
    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->d(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lczy;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 748
    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->e(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-virtual {p0, v1}, Lczy;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 753
    if-le p3, p2, :cond_0

    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->f(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[F

    move-result-object v1

    aget v1, v1, p2

    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->g(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F

    move-result v2

    sub-float v4, v1, v2

    .line 756
    :goto_0
    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->f(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[F

    move-result-object v1

    aget v1, v1, p3

    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->g(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F

    move-result v2

    sub-float/2addr v1, v2

    .line 757
    if-le p3, p2, :cond_1

    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->f(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[F

    move-result-object v2

    aget v2, v2, p3

    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->g(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F

    move-result v3

    add-float v5, v2, v3

    .line 760
    :goto_1
    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->f(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[F

    move-result-object v2

    aget v2, v2, p3

    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->g(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F

    move-result v3

    add-float/2addr v2, v3

    .line 761
    new-array v3, p4, [Ldac;

    invoke-static {p1, v3}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;[Ldac;)[Ldac;

    .line 766
    new-array v3, p4, [I

    .line 767
    cmpl-float v6, v4, v1

    if-eqz v6, :cond_3

    .line 768
    new-array v2, v8, [F

    aput v4, v2, v0

    aput v1, v2, v7

    invoke-virtual {p0, v2}, Lczy;->setFloatValues([F)V

    .line 770
    :goto_2
    if-ge v0, p4, :cond_2

    .line 771
    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[Ldac;

    move-result-object v1

    new-instance v2, Ldac;

    add-int v6, p2, v0

    new-instance v7, Ldag;

    .line 772
    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->f(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[F

    move-result-object v8

    add-int v9, p2, v0

    aget v8, v8, v9

    invoke-direct {v7, p1, v8}, Ldag;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)V

    invoke-direct {v2, p1, v6, v7}, Ldac;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;ILdah;)V

    aput-object v2, v1, v0

    .line 773
    add-int v1, p2, v0

    aput v1, v3, v0

    .line 770
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 754
    :cond_0
    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->f(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[F

    move-result-object v1

    aget v1, v1, p3

    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->g(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F

    move-result v2

    sub-float v4, v1, v2

    goto :goto_0

    .line 758
    :cond_1
    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->f(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[F

    move-result-object v2

    aget v2, v2, p2

    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->b(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->g(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)F

    move-result v3

    add-float v5, v2, v3

    goto :goto_1

    .line 775
    :cond_2
    new-instance v0, Lczz;

    invoke-direct {v0, p0, p1}, Lczz;-><init>(Lczy;Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V

    invoke-virtual {p0, v0}, Lczy;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 809
    :goto_3
    new-instance v0, Ldab;

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Ldab;-><init>(Lczy;Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;[IFF)V

    invoke-virtual {p0, v0}, Lczy;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 829
    return-void

    .line 788
    :cond_3
    new-array v1, v8, [F

    aput v5, v1, v0

    aput v2, v1, v7

    invoke-virtual {p0, v1}, Lczy;->setFloatValues([F)V

    .line 790
    :goto_4
    if-ge v0, p4, :cond_4

    .line 791
    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->h(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[Ldac;

    move-result-object v1

    new-instance v2, Ldac;

    sub-int v6, p2, v0

    new-instance v7, Lczx;

    .line 792
    invoke-static {p1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->f(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)[F

    move-result-object v8

    sub-int v9, p2, v0

    aget v8, v8, v9

    invoke-direct {v7, p1, v8}, Lczx;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;F)V

    invoke-direct {v2, p1, v6, v7}, Ldac;-><init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;ILdah;)V

    aput-object v2, v1, v0

    .line 793
    sub-int v1, p2, v0

    aput v1, v3, v0

    .line 790
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 795
    :cond_4
    new-instance v0, Ldaa;

    invoke-direct {v0, p0, p1}, Ldaa;-><init>(Lczy;Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V

    invoke-virtual {p0, v0}, Lczy;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    goto :goto_3
.end method
