.class final Lsr;
.super Lqy;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private A:Z

.field private B:Landroid/graphics/Rect;

.field private w:Lyg;

.field private x:Lta;

.field private y:Lsv;

.field private z:I


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 141
    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-direct {p0, p1, v0, p3, v1}, Lsr;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 142
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 161
    invoke-direct {p0, p1, p2, p3}, Lqy;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 89
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lsr;->B:Landroid/graphics/Rect;

    .line 163
    sget-object v0, Loq;->bo:[I

    invoke-static {p1, p2, v0, p3, v4}, Lth;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lth;

    move-result-object v0

    .line 167
    sget v1, Loq;->bp:I

    invoke-virtual {v0, v1}, Lth;->d(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 168
    sget v1, Loq;->bp:I

    invoke-virtual {v0, v1}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Lsr;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 172
    :cond_0
    sget v1, Loq;->bv:I

    invoke-virtual {v0, v1, v4}, Lth;->a(II)I

    move-result v1

    .line 175
    packed-switch v1, :pswitch_data_0

    .line 209
    :goto_0
    sget v1, Loq;->br:I

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Lth;->a(II)I

    move-result v1

    iput v1, p0, Lsr;->z:I

    .line 211
    iget-object v1, p0, Lsr;->x:Lta;

    sget v2, Loq;->bu:I

    .line 3099
    iget-object v3, v0, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v3, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 211
    invoke-interface {v1, v2}, Lta;->a(Ljava/lang/CharSequence;)V

    .line 213
    sget v1, Loq;->bt:I

    invoke-virtual {v0, v1, v4}, Lth;->a(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lsr;->A:Z

    .line 3183
    iget-object v1, v0, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 220
    iget-object v1, p0, Lsr;->y:Lsv;

    if-eqz v1, :cond_1

    .line 221
    iget-object v1, p0, Lsr;->x:Lta;

    iget-object v2, p0, Lsr;->y:Lsv;

    invoke-interface {v1, v2}, Lta;->a(Landroid/widget/ListAdapter;)V

    .line 222
    const/4 v1, 0x0

    iput-object v1, p0, Lsr;->y:Lsv;

    .line 226
    :cond_1
    invoke-virtual {v0}, Lth;->a()Ltf;

    .line 227
    return-void

    .line 177
    :pswitch_0
    new-instance v1, Lsu;

    .line 1893
    invoke-direct {v1, p0}, Lsu;-><init>(Lsr;)V

    .line 177
    iput-object v1, p0, Lsr;->x:Lta;

    goto :goto_0

    .line 182
    :pswitch_1
    new-instance v1, Lsw;

    invoke-direct {v1, p0, p1, p2, p3}, Lsw;-><init>(Lsr;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 184
    sget v2, Loq;->bq:I

    const/4 v3, -0x2

    invoke-virtual {v0, v2, v3}, Lth;->d(II)I

    .line 187
    sget v2, Loq;->bs:I

    invoke-virtual {v0, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 2398
    iget-object v3, v1, Lyc;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 190
    iput-object v1, p0, Lsr;->x:Lta;

    .line 191
    new-instance v2, Lss;

    invoke-direct {v2, p0, p0, v1}, Lss;-><init>(Lsr;Landroid/view/View;Lsw;)V

    iput-object v2, p0, Lsr;->w:Lyg;

    goto :goto_0

    .line 175
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private a(IZ)Landroid/view/View;
    .locals 2

    .prologue
    .line 529
    iget-boolean v0, p0, Lsr;->m:Z

    if-nez v0, :cond_0

    .line 530
    iget-object v0, p0, Lsr;->e:Lqz;

    invoke-virtual {v0, p1}, Lqz;->a(I)Landroid/view/View;

    move-result-object v0

    .line 531
    if-eqz v0, :cond_0

    .line 533
    invoke-direct {p0, v0, p2}, Lsr;->a(Landroid/view/View;Z)V

    .line 545
    :goto_0
    return-object v0

    .line 540
    :cond_0
    iget-object v0, p0, Lsr;->a:Landroid/widget/SpinnerAdapter;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1, p0}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 543
    invoke-direct {p0, v0, p2}, Lsr;->a(Landroid/view/View;Z)V

    goto :goto_0
.end method

.method static synthetic a(Lsr;)Lta;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lsr;->x:Lta;

    return-object v0
.end method

.method private a(Landroid/view/View;Z)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 558
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 559
    if-nez v0, :cond_0

    .line 560
    invoke-virtual {p0}, Lsr;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 563
    :cond_0
    if-eqz p2, :cond_1

    .line 564
    invoke-virtual {p0, p1, v5, v0}, Lsr;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    .line 567
    :cond_1
    invoke-virtual {p0}, Lsr;->hasFocus()Z

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setSelected(Z)V

    .line 568
    iget-boolean v1, p0, Lsr;->A:Z

    if-eqz v1, :cond_2

    .line 569
    invoke-virtual {p0}, Lsr;->isEnabled()Z

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 573
    :cond_2
    iget v1, p0, Lsr;->b:I

    iget-object v2, p0, Lsr;->d:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    iget-object v3, p0, Lsr;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v1, v2, v3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v1

    .line 575
    iget v2, p0, Lsr;->c:I

    iget-object v3, p0, Lsr;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    iget-object v4, p0, Lsr;->d:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2, v3, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v0

    .line 579
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->measure(II)V

    .line 585
    iget-object v0, p0, Lsr;->d:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0}, Lsr;->getMeasuredHeight()I

    move-result v1

    iget-object v2, p0, Lsr;->d:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lsr;->d:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 588
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v1, v0

    .line 590
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 592
    add-int/lit8 v2, v2, 0x0

    .line 594
    invoke-virtual {p1, v5, v0, v2, v1}, Landroid/view/View;->layout(IIII)V

    .line 595
    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/SpinnerAdapter;)V
    .locals 2

    .prologue
    .line 362
    invoke-super {p0, p1}, Lqy;->a(Landroid/widget/SpinnerAdapter;)V

    .line 364
    iget-object v0, p0, Lsr;->e:Lqz;

    invoke-virtual {v0}, Lqz;->a()V

    .line 366
    invoke-virtual {p0}, Lsr;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 367
    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/widget/SpinnerAdapter;->getViewTypeCount()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 369
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Spinner adapter view type count must be 1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 371
    :cond_0
    iget-object v0, p0, Lsr;->x:Lta;

    if-eqz v0, :cond_1

    .line 372
    iget-object v0, p0, Lsr;->x:Lta;

    new-instance v1, Lsv;

    invoke-direct {v1, p1}, Lsv;-><init>(Landroid/widget/SpinnerAdapter;)V

    invoke-interface {v0, v1}, Lta;->a(Landroid/widget/ListAdapter;)V

    .line 376
    :goto_0
    return-void

    .line 374
    :cond_1
    new-instance v0, Lsv;

    invoke-direct {v0, p1}, Lsv;-><init>(Landroid/widget/SpinnerAdapter;)V

    iput-object v0, p0, Lsr;->y:Lsv;

    goto :goto_0
.end method

.method public final a(Lrz;)V
    .locals 2

    .prologue
    .line 414
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "setOnItemClickListener cannot be used with a spinner."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final b(Lrz;)V
    .locals 0

    .prologue
    .line 418
    invoke-super {p0, p1}, Lqy;->a(Lrz;)V

    .line 419
    return-void
.end method

.method public final getBaseline()I
    .locals 4

    .prologue
    const/4 v0, -0x1

    const/4 v3, 0x0

    .line 380
    const/4 v1, 0x0

    .line 382
    invoke-virtual {p0}, Lsr;->getChildCount()I

    move-result v2

    if-lez v2, :cond_2

    .line 383
    invoke-virtual {p0, v3}, Lsr;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 389
    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    .line 390
    invoke-virtual {v1}, Landroid/view/View;->getBaseline()I

    move-result v2

    .line 391
    if-ltz v2, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    add-int/2addr v0, v2

    .line 393
    :cond_1
    return v0

    .line 384
    :cond_2
    iget-object v2, p0, Lsr;->a:Landroid/widget/SpinnerAdapter;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lsr;->a:Landroid/widget/SpinnerAdapter;

    invoke-interface {v2}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v2

    if-lez v2, :cond_0

    .line 385
    invoke-direct {p0, v3, v3}, Lsr;->a(IZ)Landroid/view/View;

    move-result-object v1

    .line 386
    iget-object v2, p0, Lsr;->e:Lqz;

    invoke-virtual {v2, v3, v1}, Lqz;->a(ILandroid/view/View;)V

    goto :goto_0
.end method

.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 613
    invoke-virtual {p0, p2}, Lsr;->a(I)V

    .line 614
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 615
    return-void
.end method

.method protected final onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 399
    invoke-super {p0}, Lqy;->onDetachedFromWindow()V

    .line 401
    iget-object v0, p0, Lsr;->x:Lta;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsr;->x:Lta;

    invoke-interface {v0}, Lta;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    iget-object v0, p0, Lsr;->x:Lta;

    invoke-interface {v0}, Lta;->a()V

    .line 404
    :cond_0
    return-void
.end method

.method protected final onLayout(ZIIII)V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v2, 0x0

    .line 449
    invoke-super/range {p0 .. p5}, Lqy;->onLayout(ZIIII)V

    .line 450
    iput-boolean v9, p0, Lsr;->k:Z

    .line 5463
    iget-object v0, p0, Lsr;->d:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 5464
    invoke-virtual {p0}, Lsr;->getRight()I

    move-result v1

    invoke-virtual {p0}, Lsr;->getLeft()I

    move-result v3

    sub-int/2addr v1, v3

    iget-object v3, p0, Lsr;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v3

    iget-object v3, p0, Lsr;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    sub-int v3, v1, v3

    .line 5466
    iget-boolean v1, p0, Lsr;->m:Z

    if-eqz v1, :cond_0

    .line 5467
    invoke-virtual {p0}, Lsr;->e()V

    .line 5471
    :cond_0
    iget v1, p0, Lsr;->r:I

    if-nez v1, :cond_1

    .line 5472
    invoke-virtual {p0}, Lsr;->a()V

    .line 452
    :goto_0
    iput-boolean v2, p0, Lsr;->k:Z

    .line 453
    return-void

    .line 5476
    :cond_1
    iget v1, p0, Lsr;->n:I

    if-ltz v1, :cond_2

    .line 5477
    iget v1, p0, Lsr;->n:I

    invoke-virtual {p0, v1}, Lsr;->b(I)V

    .line 6235
    :cond_2
    invoke-virtual {p0}, Lqy;->getChildCount()I

    move-result v4

    .line 6236
    iget-object v5, p0, Lqy;->e:Lqz;

    .line 6237
    iget v6, p0, Lqy;->f:I

    move v1, v2

    .line 6240
    :goto_1
    if-ge v1, v4, :cond_3

    .line 6241
    invoke-virtual {p0, v1}, Lqy;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 6242
    add-int v8, v6, v1

    .line 6243
    invoke-virtual {v5, v8, v7}, Lqz;->a(ILandroid/view/View;)V

    .line 6240
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 5483
    :cond_3
    invoke-virtual {p0}, Lsr;->removeAllViewsInLayout()V

    .line 5486
    iget v1, p0, Lsr;->p:I

    iput v1, p0, Lsr;->f:I

    .line 5487
    iget-object v1, p0, Lsr;->a:Landroid/widget/SpinnerAdapter;

    if-eqz v1, :cond_4

    .line 5488
    iget v1, p0, Lsr;->p:I

    invoke-direct {p0, v1, v9}, Lsr;->a(IZ)Landroid/view/View;

    move-result-object v1

    .line 5489
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    .line 5491
    invoke-static {p0}, Lgt;->g(Landroid/view/View;)I

    move-result v5

    .line 5492
    iget v6, p0, Lsr;->z:I

    invoke-static {v6, v5}, Lfe;->a(II)I

    move-result v5

    .line 5493
    and-int/lit8 v5, v5, 0x7

    sparse-switch v5, :sswitch_data_0

    .line 5501
    :goto_2
    invoke-virtual {v1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 5505
    :cond_4
    iget-object v0, p0, Lsr;->e:Lqz;

    invoke-virtual {v0}, Lqz;->a()V

    .line 5507
    invoke-virtual {p0}, Lsr;->invalidate()V

    .line 5509
    invoke-virtual {p0}, Lsr;->f()V

    .line 5511
    iput-boolean v2, p0, Lsr;->m:Z

    .line 5512
    iput-boolean v2, p0, Lsr;->i:Z

    .line 5513
    iget v0, p0, Lsr;->p:I

    invoke-virtual {p0, v0}, Lsr;->c(I)V

    goto :goto_0

    .line 5495
    :sswitch_0
    div-int/lit8 v3, v3, 0x2

    add-int/2addr v0, v3

    div-int/lit8 v3, v4, 0x2

    sub-int/2addr v0, v3

    .line 5496
    goto :goto_2

    .line 5498
    :sswitch_1
    add-int/2addr v0, v3

    sub-int/2addr v0, v4

    goto :goto_2

    .line 5493
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x5 -> :sswitch_1
    .end sparse-switch
.end method

.method protected final onMeasure(II)V
    .locals 13

    .prologue
    const/4 v2, 0x0

    const/4 v12, -0x2

    const/4 v0, 0x0

    .line 432
    invoke-super {p0, p1, p2}, Lqy;->onMeasure(II)V

    .line 433
    iget-object v1, p0, Lsr;->x:Lta;

    if-eqz v1, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    const/high16 v3, -0x80000000

    if-ne v1, v3, :cond_0

    .line 434
    invoke-virtual {p0}, Lsr;->getMeasuredWidth()I

    move-result v6

    .line 3308
    iget-object v7, p0, Lqy;->a:Landroid/widget/SpinnerAdapter;

    .line 435
    invoke-virtual {p0}, Lsr;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 3641
    if-nez v7, :cond_1

    .line 435
    :goto_0
    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p0}, Lsr;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lsr;->setMeasuredDimension(II)V

    .line 440
    :cond_0
    return-void

    .line 3648
    :cond_1
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    .line 3650
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .line 4554
    iget v1, p0, Lrx;->n:I

    .line 3655
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 3656
    invoke-interface {v7}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v3

    add-int/lit8 v4, v1, 0xf

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v11

    .line 3657
    sub-int v3, v11, v1

    .line 3658
    rsub-int/lit8 v3, v3, 0xf

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v5, v1

    move-object v3, v2

    move v4, v0

    move v1, v0

    .line 3659
    :goto_1
    if-ge v5, v11, :cond_3

    .line 3660
    invoke-interface {v7, v5}, Landroid/widget/SpinnerAdapter;->getItemViewType(I)I

    move-result v0

    .line 3661
    if-eq v0, v1, :cond_5

    move-object v1, v2

    .line 3665
    :goto_2
    invoke-interface {v7, v5, v1, p0}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 3666
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-nez v1, :cond_2

    .line 3667
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v12, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3671
    :cond_2
    invoke-virtual {v3, v9, v10}, Landroid/view/View;->measure(II)V

    .line 3672
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 3659
    add-int/lit8 v1, v5, 0x1

    move v5, v1

    move v1, v0

    goto :goto_1

    .line 3676
    :cond_3
    if-eqz v8, :cond_4

    .line 3677
    iget-object v0, p0, Lsr;->B:Landroid/graphics/Rect;

    invoke-virtual {v8, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 3678
    iget-object v0, p0, Lsr;->B:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iget-object v1, p0, Lsr;->B:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v1

    add-int/2addr v0, v4

    goto :goto_0

    :cond_4
    move v0, v4

    goto :goto_0

    :cond_5
    move v0, v1

    move-object v1, v3

    goto :goto_2
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .prologue
    .line 693
    check-cast p1, Lsy;

    .line 695
    invoke-virtual {p1}, Lsy;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Lqy;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 697
    iget-boolean v0, p1, Lsy;->c:Z

    if-eqz v0, :cond_0

    .line 698
    invoke-virtual {p0}, Lsr;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 699
    if-eqz v0, :cond_0

    .line 700
    new-instance v1, Lst;

    invoke-direct {v1, p0}, Lst;-><init>(Lsr;)V

    .line 713
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 716
    :cond_0
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .prologue
    .line 686
    new-instance v1, Lsy;

    invoke-super {p0}, Lqy;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-direct {v1, v0}, Lsy;-><init>(Landroid/os/Parcelable;)V

    .line 687
    iget-object v0, p0, Lsr;->x:Lta;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsr;->x:Lta;

    invoke-interface {v0}, Lta;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, v1, Lsy;->c:Z

    .line 688
    return-object v1

    .line 687
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 423
    iget-object v0, p0, Lsr;->w:Lyg;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsr;->w:Lyg;

    invoke-virtual {v0, p0, p1}, Lyg;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 424
    const/4 v0, 0x1

    .line 427
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lqy;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public final performClick()Z
    .locals 2

    .prologue
    .line 599
    invoke-super {p0}, Lqy;->performClick()Z

    move-result v0

    .line 601
    if-nez v0, :cond_0

    .line 602
    const/4 v0, 0x1

    .line 604
    iget-object v1, p0, Lsr;->x:Lta;

    invoke-interface {v1}, Lta;->b()Z

    move-result v1

    if-nez v1, :cond_0

    .line 605
    iget-object v1, p0, Lsr;->x:Lta;

    invoke-interface {v1}, Lta;->c()V

    .line 609
    :cond_0
    return v0
.end method

.method public final setEnabled(Z)V
    .locals 3

    .prologue
    .line 335
    invoke-super {p0, p1}, Lqy;->setEnabled(Z)V

    .line 336
    iget-boolean v0, p0, Lsr;->A:Z

    if-eqz v0, :cond_0

    .line 337
    invoke-virtual {p0}, Lsr;->getChildCount()I

    move-result v1

    .line 338
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 339
    invoke-virtual {p0, v0}, Lsr;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 338
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 342
    :cond_0
    return-void
.end method
