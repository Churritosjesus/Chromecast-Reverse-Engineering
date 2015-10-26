.class public Landroid/support/v7/widget/ActionMenuView;
.super Lxu;
.source "PG"

# interfaces
.implements Lqc;
.implements Lqr;


# instance fields
.field public a:Lqa;

.field public b:Z

.field public c:Lvu;

.field d:Lqq;

.field e:Lqb;

.field f:Lwg;

.field private i:Landroid/content/Context;

.field private j:Landroid/content/Context;

.field private k:I

.field private l:Z

.field private m:I

.field private n:I

.field private o:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 73
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/ActionMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 74
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 77
    invoke-direct {p0, p1, p2}, Lxu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 78
    iput-object p1, p0, Landroid/support/v7/widget/ActionMenuView;->i:Landroid/content/Context;

    .line 1388
    iput-boolean v2, p0, Lxu;->g:Z

    .line 80
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 81
    const/high16 v1, 0x42600000    # 56.0f

    mul-float/2addr v1, v0

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v7/widget/ActionMenuView;->n:I

    .line 82
    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/ActionMenuView;->o:I

    .line 83
    iput-object p1, p0, Landroid/support/v7/widget/ActionMenuView;->j:Landroid/content/Context;

    .line 84
    iput v2, p0, Landroid/support/v7/widget/ActionMenuView;->k:I

    .line 85
    return-void
.end method

.method public static a(Landroid/view/View;IIII)I
    .locals 8

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x2

    const/4 v2, 0x0

    .line 403
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lwe;

    .line 405
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    sub-int/2addr v1, p4

    .line 407
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    .line 408
    invoke-static {v1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 410
    instance-of v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    .line 412
    :goto_0
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->c()Z

    move-result v1

    if-eqz v1, :cond_5

    move v5, v4

    .line 415
    :goto_1
    if-lez p2, :cond_6

    if-eqz v5, :cond_0

    if-lt p2, v3, :cond_6

    .line 416
    :cond_0
    mul-int v1, p1, p2

    const/high16 v7, -0x80000000

    invoke-static {v1, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 418
    invoke-virtual {p0, v1, v6}, Landroid/view/View;->measure(II)V

    .line 420
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 421
    div-int v1, v7, p1

    .line 422
    rem-int/2addr v7, p1

    if-eqz v7, :cond_1

    add-int/lit8 v1, v1, 0x1

    .line 423
    :cond_1
    if-eqz v5, :cond_2

    if-ge v1, v3, :cond_2

    move v1, v3

    .line 426
    :cond_2
    :goto_2
    iget-boolean v3, v0, Lwe;->a:Z

    if-nez v3, :cond_3

    if-eqz v5, :cond_3

    move v2, v4

    .line 427
    :cond_3
    iput-boolean v2, v0, Lwe;->d:Z

    .line 429
    iput v1, v0, Lwe;->b:I

    .line 430
    mul-int v0, v1, p1

    .line 431
    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0, v0, v6}, Landroid/view/View;->measure(II)V

    .line 433
    return v1

    .line 410
    :cond_4
    const/4 v1, 0x0

    goto :goto_0

    :cond_5
    move v5, v2

    .line 412
    goto :goto_1

    :cond_6
    move v1, v2

    goto :goto_2
.end method

.method public static synthetic a(Landroid/support/v7/widget/ActionMenuView;)Lwg;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->f:Lwg;

    return-object v0
.end method

.method public static synthetic b(Landroid/support/v7/widget/ActionMenuView;)Lqb;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->e:Lqb;

    return-object v0
.end method

.method private b(Landroid/util/AttributeSet;)Lwe;
    .locals 2

    .prologue
    .line 567
    new-instance v0, Lwe;

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lwe;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method private c(I)Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 698
    if-nez p1, :cond_0

    move v0, v2

    .line 710
    :goto_0
    return v0

    .line 701
    :cond_0
    add-int/lit8 v0, p1, -0x1

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 702
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 704
    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I

    move-result v3

    if-ge p1, v3, :cond_1

    instance-of v3, v0, Lwc;

    if-eqz v3, :cond_1

    .line 705
    check-cast v0, Lwc;

    invoke-interface {v0}, Lwc;->e()Z

    move-result v0

    or-int/lit8 v2, v0, 0x0

    .line 707
    :cond_1
    if-lez p1, :cond_2

    instance-of v0, v1, Lwc;

    if-eqz v0, :cond_2

    move-object v0, v1

    .line 708
    check-cast v0, Lwc;

    invoke-interface {v0}, Lwc;->d()Z

    move-result v0

    or-int/2addr v0, v2

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method private static e()Lwe;
    .locals 2

    .prologue
    const/4 v1, -0x2

    .line 559
    new-instance v0, Lwe;

    invoke-direct {v0, v1, v1}, Lwe;-><init>(II)V

    .line 561
    const/16 v1, 0x10

    iput v1, v0, Lwe;->h:I

    .line 562
    return-object v0
.end method


# virtual methods
.method public final a()Lwe;
    .locals 2

    .prologue
    .line 591
    invoke-static {}, Landroid/support/v7/widget/ActionMenuView;->e()Lwe;

    move-result-object v0

    .line 592
    const/4 v1, 0x1

    iput-boolean v1, v0, Lwe;->a:Z

    .line 593
    return-object v0
.end method

.method public final a(Landroid/view/ViewGroup$LayoutParams;)Lwe;
    .locals 2

    .prologue
    .line 572
    if-eqz p1, :cond_2

    .line 573
    instance-of v0, p1, Lwe;

    if-eqz v0, :cond_1

    new-instance v0, Lwe;

    check-cast p1, Lwe;

    invoke-direct {v0, p1}, Lwe;-><init>(Lwe;)V

    .line 576
    :goto_0
    iget v1, v0, Lwe;->h:I

    if-gtz v1, :cond_0

    .line 577
    const/16 v1, 0x10

    iput v1, v0, Lwe;->h:I

    .line 581
    :cond_0
    :goto_1
    return-object v0

    .line 573
    :cond_1
    new-instance v0, Lwe;

    invoke-direct {v0, p1}, Lwe;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 581
    :cond_2
    invoke-static {}, Landroid/support/v7/widget/ActionMenuView;->e()Lwe;

    move-result-object v0

    goto :goto_1
.end method

.method public final synthetic a(Landroid/util/AttributeSet;)Lxv;
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->b(Landroid/util/AttributeSet;)Lwe;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 95
    iget v0, p0, Landroid/support/v7/widget/ActionMenuView;->k:I

    if-eq v0, p1, :cond_0

    .line 96
    iput p1, p0, Landroid/support/v7/widget/ActionMenuView;->k:I

    .line 97
    if-nez p1, :cond_1

    .line 98
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->i:Landroid/content/Context;

    iput-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->j:Landroid/content/Context;

    .line 103
    :cond_0
    :goto_0
    return-void

    .line 100
    :cond_1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    iget-object v1, p0, Landroid/support/v7/widget/ActionMenuView;->i:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->j:Landroid/content/Context;

    goto :goto_0
.end method

.method public final a(Lqa;)V
    .locals 0

    .prologue
    .line 608
    iput-object p1, p0, Landroid/support/v7/widget/ActionMenuView;->a:Lqa;

    .line 609
    return-void
.end method

.method public final a(Lvu;)V
    .locals 1

    .prologue
    .line 119
    iput-object p1, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    .line 120
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    invoke-virtual {v0, p0}, Lvu;->a(Landroid/support/v7/widget/ActionMenuView;)V

    .line 121
    return-void
.end method

.method public final a(Lqe;)Z
    .locals 3

    .prologue
    .line 598
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->a:Lqa;

    const/4 v1, 0x0

    .line 3948
    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Lqa;->a(Landroid/view/MenuItem;Lqp;I)Z

    move-result v0

    .line 598
    return v0
.end method

.method public final b()Landroid/view/Menu;
    .locals 3

    .prologue
    .line 620
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->a:Lqa;

    if-nez v0, :cond_0

    .line 621
    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 622
    new-instance v1, Lqa;

    invoke-direct {v1, v0}, Lqa;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroid/support/v7/widget/ActionMenuView;->a:Lqa;

    .line 623
    iget-object v1, p0, Landroid/support/v7/widget/ActionMenuView;->a:Lqa;

    new-instance v2, Lwf;

    .line 4737
    invoke-direct {v2, p0}, Lwf;-><init>(Landroid/support/v7/widget/ActionMenuView;)V

    .line 623
    invoke-virtual {v1, v2}, Lqa;->a(Lqb;)V

    .line 624
    new-instance v1, Lvu;

    invoke-direct {v1, v0}, Lvu;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    .line 625
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lvu;->c(Z)V

    .line 626
    iget-object v1, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->d:Lqq;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->d:Lqq;

    .line 5148
    :goto_0
    iput-object v0, v1, Lpv;->d:Lqq;

    .line 628
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->a:Lqa;

    iget-object v1, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    iget-object v2, p0, Landroid/support/v7/widget/ActionMenuView;->j:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lqa;->a(Lqp;Landroid/content/Context;)V

    .line 629
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    invoke-virtual {v0, p0}, Lvu;->a(Landroid/support/v7/widget/ActionMenuView;)V

    .line 632
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->a:Lqa;

    return-object v0

    .line 626
    :cond_1
    new-instance v0, Lwd;

    .line 4752
    invoke-direct {v0, p0}, Lwd;-><init>(Landroid/support/v7/widget/ActionMenuView;)V

    goto :goto_0
.end method

.method protected final synthetic b(Landroid/view/ViewGroup$LayoutParams;)Lxv;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/view/ViewGroup$LayoutParams;)Lwe;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 689
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    if-eqz v0, :cond_0

    .line 690
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    invoke-virtual {v0}, Lvu;->d()Z

    .line 692
    :cond_0
    return-void
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .prologue
    .line 586
    if-eqz p1, :cond_0

    instance-of v0, p1, Lwe;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final synthetic d()Lxv;
    .locals 1

    .prologue
    .line 43
    invoke-static {}, Landroid/support/v7/widget/ActionMenuView;->e()Lwe;

    move-result-object v0

    return-object v0
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .prologue
    .line 714
    const/4 v0, 0x0

    return v0
.end method

.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 43
    invoke-static {}, Landroid/support/v7/widget/ActionMenuView;->e()Lwe;

    move-result-object v0

    return-object v0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->b(Landroid/util/AttributeSet;)Lwe;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/view/ViewGroup$LayoutParams;)Lwe;

    move-result-object v0

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 125
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    .line 126
    invoke-super {p0, p1}, Lxu;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 129
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    if-eqz v0, :cond_1

    .line 130
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lvu;->b(Z)V

    .line 132
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    invoke-virtual {v0}, Lvu;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    invoke-virtual {v0}, Lvu;->c()Z

    .line 134
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Lvu;

    invoke-virtual {v0}, Lvu;->b()Z

    .line 137
    :cond_1
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 543
    invoke-super {p0}, Lxu;->onDetachedFromWindow()V

    .line 544
    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->c()V

    .line 545
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 14

    .prologue
    .line 438
    iget-boolean v0, p0, Landroid/support/v7/widget/ActionMenuView;->l:Z

    if-nez v0, :cond_1

    .line 439
    invoke-super/range {p0 .. p5}, Lxu;->onLayout(ZIIII)V

    .line 539
    :cond_0
    :goto_0
    return-void

    .line 443
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I

    move-result v6

    .line 444
    sub-int v0, p5, p3

    div-int/lit8 v7, v0, 0x2

    .line 3274
    iget v8, p0, Lxu;->h:I

    .line 448
    const/4 v4, 0x0

    .line 449
    sub-int v0, p4, p2

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingLeft()I

    move-result v1

    sub-int v3, v0, v1

    .line 450
    const/4 v1, 0x0

    .line 451
    invoke-static {p0}, Ltm;->a(Landroid/view/View;)Z

    move-result v9

    .line 452
    const/4 v0, 0x0

    move v5, v0

    :goto_1
    if-ge v5, v6, :cond_5

    .line 453
    invoke-virtual {p0, v5}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 454
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v2, 0x8

    if-eq v0, v2, :cond_c

    .line 458
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lwe;

    .line 459
    iget-boolean v2, v0, Lwe;->a:Z

    if-eqz v2, :cond_4

    .line 460
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    .line 461
    invoke-direct {p0, v5}, Landroid/support/v7/widget/ActionMenuView;->c(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 462
    add-int/2addr v1, v8

    .line 464
    :cond_2
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v11

    .line 467
    if-eqz v9, :cond_3

    .line 468
    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingLeft()I

    move-result v2

    iget v0, v0, Lwe;->leftMargin:I

    add-int/2addr v0, v2

    .line 469
    add-int v2, v0, v1

    .line 474
    :goto_2
    div-int/lit8 v12, v11, 0x2

    sub-int v12, v7, v12

    .line 475
    add-int/2addr v11, v12

    .line 476
    invoke-virtual {v10, v0, v12, v2, v11}, Landroid/view/View;->layout(IIII)V

    .line 478
    sub-int v1, v3, v1

    .line 479
    const/4 v0, 0x1

    move v2, v4

    .line 452
    :goto_3
    add-int/lit8 v3, v5, 0x1

    move v5, v3

    move v4, v2

    move v3, v1

    move v1, v0

    goto :goto_1

    .line 471
    :cond_3
    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingRight()I

    move-result v12

    sub-int/2addr v2, v12

    iget v0, v0, Lwe;->rightMargin:I

    sub-int/2addr v2, v0

    .line 472
    sub-int v0, v2, v1

    goto :goto_2

    .line 481
    :cond_4
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iget v10, v0, Lwe;->leftMargin:I

    add-int/2addr v2, v10

    iget v0, v0, Lwe;->rightMargin:I

    add-int/2addr v0, v2

    .line 483
    sub-int v0, v3, v0

    .line 484
    invoke-direct {p0, v5}, Landroid/support/v7/widget/ActionMenuView;->c(I)Z

    .line 487
    add-int/lit8 v2, v4, 0x1

    move v13, v1

    move v1, v0

    move v0, v13

    goto :goto_3

    .line 491
    :cond_5
    const/4 v0, 0x1

    if-ne v6, v0, :cond_6

    if-nez v1, :cond_6

    .line 493
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 494
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    .line 495
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    .line 496
    sub-int v3, p4, p2

    div-int/lit8 v3, v3, 0x2

    .line 497
    div-int/lit8 v4, v1, 0x2

    sub-int/2addr v3, v4

    .line 498
    div-int/lit8 v4, v2, 0x2

    sub-int v4, v7, v4

    .line 499
    add-int/2addr v1, v3

    add-int/2addr v2, v4

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/view/View;->layout(IIII)V

    goto/16 :goto_0

    .line 503
    :cond_6
    if-eqz v1, :cond_7

    const/4 v0, 0x0

    :goto_4
    sub-int v0, v4, v0

    .line 504
    const/4 v1, 0x0

    if-lez v0, :cond_8

    div-int v0, v3, v0

    :goto_5
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 506
    if-eqz v9, :cond_9

    .line 507
    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingRight()I

    move-result v1

    sub-int v1, v0, v1

    .line 508
    const/4 v0, 0x0

    move v2, v0

    :goto_6
    if-ge v2, v6, :cond_0

    .line 509
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 510
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lwe;

    .line 511
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v8, 0x8

    if-eq v5, v8, :cond_b

    iget-boolean v5, v0, Lwe;->a:Z

    if-nez v5, :cond_b

    .line 515
    iget v5, v0, Lwe;->rightMargin:I

    sub-int/2addr v1, v5

    .line 516
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 517
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    .line 518
    div-int/lit8 v9, v8, 0x2

    sub-int v9, v7, v9

    .line 519
    sub-int v10, v1, v5

    add-int/2addr v8, v9

    invoke-virtual {v4, v10, v9, v1, v8}, Landroid/view/View;->layout(IIII)V

    .line 520
    iget v0, v0, Lwe;->leftMargin:I

    add-int/2addr v0, v5

    add-int/2addr v0, v3

    sub-int v0, v1, v0

    .line 508
    :goto_7
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_6

    .line 503
    :cond_7
    const/4 v0, 0x1

    goto :goto_4

    .line 504
    :cond_8
    const/4 v0, 0x0

    goto :goto_5

    .line 523
    :cond_9
    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingLeft()I

    move-result v1

    .line 524
    const/4 v0, 0x0

    move v2, v0

    :goto_8
    if-ge v2, v6, :cond_0

    .line 525
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 526
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lwe;

    .line 527
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v8, 0x8

    if-eq v5, v8, :cond_a

    iget-boolean v5, v0, Lwe;->a:Z

    if-nez v5, :cond_a

    .line 531
    iget v5, v0, Lwe;->leftMargin:I

    add-int/2addr v1, v5

    .line 532
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 533
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    .line 534
    div-int/lit8 v9, v8, 0x2

    sub-int v9, v7, v9

    .line 535
    add-int v10, v1, v5

    add-int/2addr v8, v9

    invoke-virtual {v4, v1, v9, v10, v8}, Landroid/view/View;->layout(IIII)V

    .line 536
    iget v0, v0, Lwe;->rightMargin:I

    add-int/2addr v0, v5

    add-int/2addr v0, v3

    add-int/2addr v0, v1

    .line 524
    :goto_9
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_8

    :cond_a
    move v0, v1

    goto :goto_9

    :cond_b
    move v0, v1

    goto :goto_7

    :cond_c
    move v0, v1

    move v2, v4

    move v1, v3

    goto/16 :goto_3
.end method

.method protected onMeasure(II)V
    .locals 34

    .prologue
    .line 146
    move-object/from16 v0, p0

    iget-boolean v7, v0, Landroid/support/v7/widget/ActionMenuView;->l:Z

    .line 147
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v6

    const/high16 v8, 0x40000000    # 2.0f

    if-ne v6, v8, :cond_2

    const/4 v6, 0x1

    :goto_0
    move-object/from16 v0, p0

    iput-boolean v6, v0, Landroid/support/v7/widget/ActionMenuView;->l:Z

    .line 149
    move-object/from16 v0, p0

    iget-boolean v6, v0, Landroid/support/v7/widget/ActionMenuView;->l:Z

    if-eq v7, v6, :cond_0

    .line 150
    const/4 v6, 0x0

    move-object/from16 v0, p0

    iput v6, v0, Landroid/support/v7/widget/ActionMenuView;->m:I

    .line 155
    :cond_0
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    .line 156
    move-object/from16 v0, p0

    iget-boolean v7, v0, Landroid/support/v7/widget/ActionMenuView;->l:Z

    if-eqz v7, :cond_1

    move-object/from16 v0, p0

    iget-object v7, v0, Landroid/support/v7/widget/ActionMenuView;->a:Lqa;

    if-eqz v7, :cond_1

    move-object/from16 v0, p0

    iget v7, v0, Landroid/support/v7/widget/ActionMenuView;->m:I

    if-eq v6, v7, :cond_1

    .line 157
    move-object/from16 v0, p0

    iput v6, v0, Landroid/support/v7/widget/ActionMenuView;->m:I

    .line 158
    move-object/from16 v0, p0

    iget-object v6, v0, Landroid/support/v7/widget/ActionMenuView;->a:Lqa;

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Lqa;->b(Z)V

    .line 161
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I

    move-result v8

    .line 162
    move-object/from16 v0, p0

    iget-boolean v6, v0, Landroid/support/v7/widget/ActionMenuView;->l:Z

    if-eqz v6, :cond_1c

    if-lez v8, :cond_1c

    .line 2177
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v23

    .line 2178
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    .line 2179
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v17

    .line 2181
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingLeft()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingRight()I

    move-result v8

    add-int/2addr v7, v8

    .line 2182
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingTop()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingBottom()I

    move-result v9

    add-int v19, v8, v9

    .line 2184
    const/4 v8, -0x2

    move/from16 v0, p2

    move/from16 v1, v19

    invoke-static {v0, v1, v8}, Landroid/support/v7/widget/ActionMenuView;->getChildMeasureSpec(III)I

    move-result v24

    .line 2187
    sub-int v25, v6, v7

    .line 2190
    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v7/widget/ActionMenuView;->n:I

    div-int v9, v25, v6

    .line 2191
    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v7/widget/ActionMenuView;->n:I

    rem-int v6, v25, v6

    .line 2193
    if-nez v9, :cond_3

    .line 2195
    const/4 v6, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v25

    invoke-virtual {v0, v1, v6}, Landroid/support/v7/widget/ActionMenuView;->setMeasuredDimension(II)V

    .line 173
    :goto_1
    return-void

    .line 147
    :cond_2
    const/4 v6, 0x0

    goto :goto_0

    .line 2199
    :cond_3
    move-object/from16 v0, p0

    iget v7, v0, Landroid/support/v7/widget/ActionMenuView;->n:I

    div-int/2addr v6, v9

    add-int v26, v7, v6

    .line 2202
    const/16 v16, 0x0

    .line 2203
    const/4 v15, 0x0

    .line 2204
    const/4 v10, 0x0

    .line 2205
    const/4 v7, 0x0

    .line 2206
    const/4 v11, 0x0

    .line 2209
    const-wide/16 v12, 0x0

    .line 2211
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I

    move-result v27

    .line 2212
    const/4 v6, 0x0

    move/from16 v18, v6

    :goto_2
    move/from16 v0, v18

    move/from16 v1, v27

    if-ge v0, v1, :cond_7

    .line 2213
    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 2214
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v14, 0x8

    if-eq v6, v14, :cond_25

    .line 2216
    instance-of v0, v8, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    move/from16 v20, v0

    .line 2217
    add-int/lit8 v14, v7, 0x1

    .line 2219
    if-eqz v20, :cond_4

    .line 2222
    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v7/widget/ActionMenuView;->o:I

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/widget/ActionMenuView;->o:I

    move/from16 v21, v0

    const/16 v22, 0x0

    move/from16 v0, v21

    move/from16 v1, v22

    invoke-virtual {v8, v6, v7, v0, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 2225
    :cond_4
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lwe;

    .line 2226
    const/4 v7, 0x0

    iput-boolean v7, v6, Lwe;->f:Z

    .line 2227
    const/4 v7, 0x0

    iput v7, v6, Lwe;->c:I

    .line 2228
    const/4 v7, 0x0

    iput v7, v6, Lwe;->b:I

    .line 2229
    const/4 v7, 0x0

    iput-boolean v7, v6, Lwe;->d:Z

    .line 2230
    const/4 v7, 0x0

    iput v7, v6, Lwe;->leftMargin:I

    .line 2231
    const/4 v7, 0x0

    iput v7, v6, Lwe;->rightMargin:I

    .line 2232
    if-eqz v20, :cond_5

    move-object v7, v8

    check-cast v7, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    invoke-virtual {v7}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->c()Z

    move-result v7

    if-eqz v7, :cond_5

    const/4 v7, 0x1

    :goto_3
    iput-boolean v7, v6, Lwe;->e:Z

    .line 2235
    iget-boolean v7, v6, Lwe;->a:Z

    if-eqz v7, :cond_6

    const/4 v7, 0x1

    .line 2237
    :goto_4
    move/from16 v0, v26

    move/from16 v1, v24

    move/from16 v2, v19

    invoke-static {v8, v0, v7, v1, v2}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/view/View;IIII)I

    move-result v20

    .line 2240
    move/from16 v0, v20

    invoke-static {v15, v0}, Ljava/lang/Math;->max(II)I

    move-result v15

    .line 2241
    iget-boolean v7, v6, Lwe;->d:Z

    if-eqz v7, :cond_24

    add-int/lit8 v7, v10, 0x1

    .line 2242
    :goto_5
    iget-boolean v6, v6, Lwe;->a:Z

    if-eqz v6, :cond_23

    const/4 v6, 0x1

    .line 2244
    :goto_6
    sub-int v11, v9, v20

    .line 2245
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    move/from16 v0, v16

    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 2246
    const/4 v8, 0x1

    move/from16 v0, v20

    if-ne v0, v8, :cond_22

    const/4 v8, 0x1

    shl-int v8, v8, v18

    int-to-long v8, v8

    or-long/2addr v8, v12

    move v12, v10

    move v13, v11

    move v10, v7

    move v11, v6

    move-wide v6, v8

    move v9, v15

    move v8, v14

    .line 2212
    :goto_7
    add-int/lit8 v14, v18, 0x1

    move/from16 v18, v14

    move v15, v9

    move/from16 v16, v12

    move v9, v13

    move-wide v12, v6

    move v7, v8

    goto/16 :goto_2

    .line 2232
    :cond_5
    const/4 v7, 0x0

    goto :goto_3

    :cond_6
    move v7, v9

    .line 2235
    goto :goto_4

    .line 2251
    :cond_7
    if-eqz v11, :cond_8

    const/4 v6, 0x2

    if-ne v7, v6, :cond_8

    const/4 v6, 0x1

    move v8, v6

    .line 2256
    :goto_8
    const/16 v18, 0x0

    move-wide/from16 v20, v12

    move/from16 v19, v9

    .line 2257
    :goto_9
    if-lez v10, :cond_e

    if-lez v19, :cond_e

    .line 2258
    const v14, 0x7fffffff

    .line 2259
    const-wide/16 v12, 0x0

    .line 2260
    const/4 v9, 0x0

    .line 2261
    const/4 v6, 0x0

    move/from16 v22, v6

    :goto_a
    move/from16 v0, v22

    move/from16 v1, v27

    if-ge v0, v1, :cond_a

    .line 2262
    move-object/from16 v0, p0

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 2263
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lwe;

    .line 2266
    iget-boolean v0, v6, Lwe;->d:Z

    move/from16 v28, v0

    if-eqz v28, :cond_21

    .line 2269
    iget v0, v6, Lwe;->b:I

    move/from16 v28, v0

    move/from16 v0, v28

    if-ge v0, v14, :cond_9

    .line 2270
    iget v9, v6, Lwe;->b:I

    .line 2271
    const/4 v6, 0x1

    shl-int v6, v6, v22

    int-to-long v12, v6

    .line 2272
    const/4 v6, 0x1

    .line 2261
    :goto_b
    add-int/lit8 v14, v22, 0x1

    move/from16 v22, v14

    move v14, v9

    move v9, v6

    goto :goto_a

    .line 2251
    :cond_8
    const/4 v6, 0x0

    move v8, v6

    goto :goto_8

    .line 2273
    :cond_9
    iget v6, v6, Lwe;->b:I

    if-ne v6, v14, :cond_21

    .line 2274
    const/4 v6, 0x1

    shl-int v6, v6, v22

    int-to-long v0, v6

    move-wide/from16 v28, v0

    or-long v12, v12, v28

    .line 2275
    add-int/lit8 v6, v9, 0x1

    move v9, v14

    goto :goto_b

    .line 2280
    :cond_a
    or-long v20, v20, v12

    .line 2282
    move/from16 v0, v19

    if-gt v9, v0, :cond_e

    .line 2285
    add-int/lit8 v22, v14, 0x1

    .line 2287
    const/4 v6, 0x0

    move v14, v6

    move/from16 v9, v19

    move-wide/from16 v18, v20

    :goto_c
    move/from16 v0, v27

    if-ge v14, v0, :cond_d

    .line 2288
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v20

    .line 2289
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lwe;

    .line 2290
    const/16 v21, 0x1

    shl-int v21, v21, v14

    move/from16 v0, v21

    int-to-long v0, v0

    move-wide/from16 v28, v0

    and-long v28, v28, v12

    const-wide/16 v30, 0x0

    cmp-long v21, v28, v30

    if-nez v21, :cond_b

    .line 2292
    iget v6, v6, Lwe;->b:I

    move/from16 v0, v22

    if-ne v6, v0, :cond_20

    const/4 v6, 0x1

    shl-int/2addr v6, v14

    int-to-long v0, v6

    move-wide/from16 v20, v0

    or-long v18, v18, v20

    move v6, v9

    .line 2287
    :goto_d
    add-int/lit8 v9, v14, 0x1

    move v14, v9

    move v9, v6

    goto :goto_c

    .line 2296
    :cond_b
    if-eqz v8, :cond_c

    iget-boolean v0, v6, Lwe;->e:Z

    move/from16 v21, v0

    if-eqz v21, :cond_c

    const/16 v21, 0x1

    move/from16 v0, v21

    if-ne v9, v0, :cond_c

    .line 2298
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/widget/ActionMenuView;->o:I

    move/from16 v21, v0

    add-int v21, v21, v26

    const/16 v28, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/widget/ActionMenuView;->o:I

    move/from16 v29, v0

    const/16 v30, 0x0

    move-object/from16 v0, v20

    move/from16 v1, v21

    move/from16 v2, v28

    move/from16 v3, v29

    move/from16 v4, v30

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 2300
    :cond_c
    iget v0, v6, Lwe;->b:I

    move/from16 v20, v0

    add-int/lit8 v20, v20, 0x1

    move/from16 v0, v20

    iput v0, v6, Lwe;->b:I

    .line 2301
    const/16 v20, 0x1

    move/from16 v0, v20

    iput-boolean v0, v6, Lwe;->f:Z

    .line 2302
    add-int/lit8 v6, v9, -0x1

    goto :goto_d

    .line 2305
    :cond_d
    const/4 v6, 0x1

    move-wide/from16 v20, v18

    move/from16 v18, v6

    move/from16 v19, v9

    .line 2306
    goto/16 :goto_9

    :cond_e
    move-wide/from16 v12, v20

    .line 2311
    if-nez v11, :cond_12

    const/4 v6, 0x1

    if-ne v7, v6, :cond_12

    const/4 v6, 0x1

    .line 2312
    :goto_e
    if-lez v19, :cond_18

    const-wide/16 v8, 0x0

    cmp-long v8, v12, v8

    if-eqz v8, :cond_18

    add-int/lit8 v7, v7, -0x1

    move/from16 v0, v19

    if-lt v0, v7, :cond_f

    if-nez v6, :cond_f

    const/4 v7, 0x1

    if-le v15, v7, :cond_18

    .line 2314
    :cond_f
    invoke-static {v12, v13}, Ljava/lang/Long;->bitCount(J)I

    move-result v7

    int-to-float v7, v7

    .line 2316
    if-nez v6, :cond_1f

    .line 2318
    const-wide/16 v8, 0x1

    and-long/2addr v8, v12

    const-wide/16 v10, 0x0

    cmp-long v6, v8, v10

    if-eqz v6, :cond_10

    .line 2319
    const/4 v6, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lwe;

    .line 2320
    iget-boolean v6, v6, Lwe;->e:Z

    if-nez v6, :cond_10

    const/high16 v6, 0x3f000000    # 0.5f

    sub-float/2addr v7, v6

    .line 2322
    :cond_10
    const/4 v6, 0x1

    add-int/lit8 v8, v27, -0x1

    shl-int/2addr v6, v8

    int-to-long v8, v6

    and-long/2addr v8, v12

    const-wide/16 v10, 0x0

    cmp-long v6, v8, v10

    if-eqz v6, :cond_1f

    .line 2323
    add-int/lit8 v6, v27, -0x1

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lwe;

    .line 2324
    iget-boolean v6, v6, Lwe;->e:Z

    if-nez v6, :cond_1f

    const/high16 v6, 0x3f000000    # 0.5f

    sub-float v6, v7, v6

    .line 2328
    :goto_f
    const/4 v7, 0x0

    cmpl-float v7, v6, v7

    if-lez v7, :cond_13

    mul-int v7, v19, v26

    int-to-float v7, v7

    div-float v6, v7, v6

    float-to-int v6, v6

    move v7, v6

    .line 2331
    :goto_10
    const/4 v6, 0x0

    move v9, v6

    move/from16 v8, v18

    :goto_11
    move/from16 v0, v27

    if-ge v9, v0, :cond_19

    .line 2332
    const/4 v6, 0x1

    shl-int/2addr v6, v9

    int-to-long v10, v6

    and-long/2addr v10, v12

    const-wide/16 v14, 0x0

    cmp-long v6, v10, v14

    if-eqz v6, :cond_17

    .line 2334
    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 2335
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lwe;

    .line 2336
    instance-of v10, v10, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    if-eqz v10, :cond_14

    .line 2338
    iput v7, v6, Lwe;->c:I

    .line 2339
    const/4 v8, 0x1

    iput-boolean v8, v6, Lwe;->f:Z

    .line 2340
    if-nez v9, :cond_11

    iget-boolean v8, v6, Lwe;->e:Z

    if-nez v8, :cond_11

    .line 2343
    neg-int v8, v7

    div-int/lit8 v8, v8, 0x2

    iput v8, v6, Lwe;->leftMargin:I

    .line 2345
    :cond_11
    const/4 v6, 0x1

    .line 2331
    :goto_12
    add-int/lit8 v8, v9, 0x1

    move v9, v8

    move v8, v6

    goto :goto_11

    .line 2311
    :cond_12
    const/4 v6, 0x0

    goto/16 :goto_e

    .line 2328
    :cond_13
    const/4 v6, 0x0

    move v7, v6

    goto :goto_10

    .line 2346
    :cond_14
    iget-boolean v10, v6, Lwe;->a:Z

    if-eqz v10, :cond_15

    .line 2347
    iput v7, v6, Lwe;->c:I

    .line 2348
    const/4 v8, 0x1

    iput-boolean v8, v6, Lwe;->f:Z

    .line 2349
    neg-int v8, v7

    div-int/lit8 v8, v8, 0x2

    iput v8, v6, Lwe;->rightMargin:I

    .line 2350
    const/4 v6, 0x1

    goto :goto_12

    .line 2355
    :cond_15
    if-eqz v9, :cond_16

    .line 2356
    div-int/lit8 v10, v7, 0x2

    iput v10, v6, Lwe;->leftMargin:I

    .line 2358
    :cond_16
    add-int/lit8 v10, v27, -0x1

    if-eq v9, v10, :cond_17

    .line 2359
    div-int/lit8 v10, v7, 0x2

    iput v10, v6, Lwe;->rightMargin:I

    :cond_17
    move v6, v8

    goto :goto_12

    :cond_18
    move/from16 v8, v18

    .line 2368
    :cond_19
    if-eqz v8, :cond_1b

    .line 2369
    const/4 v6, 0x0

    move v7, v6

    :goto_13
    move/from16 v0, v27

    if-ge v7, v0, :cond_1b

    .line 2370
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 2371
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lwe;

    .line 2373
    iget-boolean v9, v6, Lwe;->f:Z

    if-eqz v9, :cond_1a

    .line 2375
    iget v9, v6, Lwe;->b:I

    mul-int v9, v9, v26

    iget v6, v6, Lwe;->c:I

    add-int/2addr v6, v9

    .line 2376
    const/high16 v9, 0x40000000    # 2.0f

    invoke-static {v6, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    move/from16 v0, v24

    invoke-virtual {v8, v6, v0}, Landroid/view/View;->measure(II)V

    .line 2369
    :cond_1a
    add-int/lit8 v6, v7, 0x1

    move v7, v6

    goto :goto_13

    .line 2381
    :cond_1b
    const/high16 v6, 0x40000000    # 2.0f

    move/from16 v0, v23

    if-eq v0, v6, :cond_1e

    .line 2385
    :goto_14
    move-object/from16 v0, p0

    move/from16 v1, v25

    move/from16 v2, v16

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/ActionMenuView;->setMeasuredDimension(II)V

    goto/16 :goto_1

    .line 166
    :cond_1c
    const/4 v6, 0x0

    move v7, v6

    :goto_15
    if-ge v7, v8, :cond_1d

    .line 167
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 168
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lwe;

    .line 169
    const/4 v9, 0x0

    iput v9, v6, Lwe;->rightMargin:I

    iput v9, v6, Lwe;->leftMargin:I

    .line 166
    add-int/lit8 v6, v7, 0x1

    move v7, v6

    goto :goto_15

    .line 171
    :cond_1d
    invoke-super/range {p0 .. p2}, Lxu;->onMeasure(II)V

    goto/16 :goto_1

    :cond_1e
    move/from16 v16, v17

    goto :goto_14

    :cond_1f
    move v6, v7

    goto/16 :goto_f

    :cond_20
    move v6, v9

    goto/16 :goto_d

    :cond_21
    move v6, v9

    move v9, v14

    goto/16 :goto_b

    :cond_22
    move v8, v14

    move v9, v15

    move-wide/from16 v32, v12

    move v12, v10

    move v13, v11

    move v11, v6

    move v10, v7

    move-wide/from16 v6, v32

    goto/16 :goto_7

    :cond_23
    move v6, v11

    goto/16 :goto_6

    :cond_24
    move v7, v10

    goto/16 :goto_5

    :cond_25
    move v8, v7

    move-wide v6, v12

    move/from16 v12, v16

    move v13, v9

    move v9, v15

    goto/16 :goto_7
.end method
