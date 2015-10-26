.class public final Lob;
.super Landroid/view/View;
.source "PG"


# static fields
.field private static final l:[I

.field private static final m:[I


# instance fields
.field public final a:Ltz;

.field public final b:Loc;

.field public c:Ltx;

.field public d:Z

.field public e:Z

.field private f:Lop;

.field private g:Landroid/graphics/drawable/Drawable;

.field private h:Z

.field private i:Z

.field private j:I

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 104
    new-array v0, v3, [I

    const v1, 0x10100a0

    aput v1, v0, v2

    sput-object v0, Lob;->l:[I

    .line 109
    new-array v0, v3, [I

    const v1, 0x101009f

    aput v1, v0, v2

    sput-object v0, Lob;->m:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 114
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lob;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 115
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 118
    const/4 v0, 0x0

    sget v1, La;->cg:I

    invoke-direct {p0, p1, v0, v1}, Lob;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 119
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 122
    invoke-static {p1}, La;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 90
    sget-object v0, Ltx;->c:Ltx;

    iput-object v0, p0, Lob;->c:Ltx;

    .line 91
    invoke-static {}, Lop;->a()Lop;

    move-result-object v0

    iput-object v0, p0, Lob;->f:Lop;

    .line 123
    invoke-virtual {p0}, Lob;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 125
    invoke-static {v0}, Ltz;->a(Landroid/content/Context;)Ltz;

    move-result-object v3

    iput-object v3, p0, Lob;->a:Ltz;

    .line 126
    new-instance v3, Loc;

    .line 1512
    invoke-direct {v3, p0}, Loc;-><init>(Lob;)V

    .line 126
    iput-object v3, p0, Lob;->b:Loc;

    .line 128
    sget-object v3, Lvp;->a:[I

    invoke-virtual {v0, p2, v3, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 130
    sget v0, Lvp;->d:I

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 2360
    iget-object v0, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2361
    iget-object v0, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 2362
    iget-object v0, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lob;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2364
    :cond_0
    iput-object v4, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    .line 2365
    if-eqz v4, :cond_1

    .line 2366
    invoke-virtual {v4, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 2367
    invoke-virtual {p0}, Lob;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 2368
    invoke-virtual {p0}, Lob;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    :goto_0
    invoke-virtual {v4, v0, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 2371
    :cond_1
    invoke-virtual {p0}, Lob;->refreshDrawableState()V

    .line 132
    sget v0, Lvp;->c:I

    invoke-virtual {v3, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lob;->j:I

    .line 134
    sget v0, Lvp;->b:I

    invoke-virtual {v3, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lob;->k:I

    .line 136
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 138
    invoke-virtual {p0, v1}, Lob;->setClickable(Z)V

    .line 139
    invoke-virtual {p0, v1}, Lob;->setLongClickable(Z)V

    .line 140
    return-void

    :cond_2
    move v0, v2

    .line 2368
    goto :goto_0
.end method

.method static synthetic a(Lob;)V
    .locals 0

    .prologue
    .line 79
    invoke-virtual {p0}, Lob;->b()V

    return-void
.end method


# virtual methods
.method public final a(Lop;)V
    .locals 2

    .prologue
    .line 196
    if-nez p1, :cond_0

    .line 197
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "factory must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 200
    :cond_0
    iput-object p1, p0, Lob;->f:Lop;

    .line 201
    return-void
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 222
    iget-boolean v0, p0, Lob;->d:Z

    if-nez v0, :cond_0

    move v0, v2

    .line 250
    :goto_0
    return v0

    .line 3263
    :cond_0
    invoke-virtual {p0}, Lob;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 3264
    :goto_1
    instance-of v3, v0, Landroid/content/ContextWrapper;

    if-eqz v3, :cond_3

    .line 3265
    instance-of v3, v0, Landroid/app/Activity;

    if-eqz v3, :cond_2

    .line 3266
    check-cast v0, Landroid/app/Activity;

    .line 3255
    :goto_2
    instance-of v3, v0, Lm;

    if-eqz v3, :cond_1

    .line 3256
    check-cast v0, Lm;

    .line 3808
    iget-object v1, v0, Lm;->b:Lt;

    .line 227
    :cond_1
    if-nez v1, :cond_4

    .line 228
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The activity must be a subclass of FragmentActivity"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3268
    :cond_2
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v1

    .line 3270
    goto :goto_2

    .line 231
    :cond_4
    invoke-static {}, Ltz;->d()Luh;

    move-result-object v0

    .line 232
    invoke-virtual {v0}, Luh;->b()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p0, Lob;->c:Ltx;

    invoke-virtual {v0, v3}, Luh;->a(Ltx;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 233
    :cond_5
    const-string v0, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment"

    invoke-virtual {v1, v0}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 234
    const-string v0, "MediaRouteButton"

    const-string v1, "showDialog(): Route chooser dialog already showing!"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    .line 235
    goto :goto_0

    .line 237
    :cond_6
    invoke-static {}, Lop;->b()Loh;

    move-result-object v0

    .line 239
    iget-object v2, p0, Lob;->c:Ltx;

    invoke-virtual {v0, v2}, Loh;->a(Ltx;)V

    .line 240
    const-string v2, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment"

    invoke-virtual {v0, v1, v2}, Loh;->a(Lr;Ljava/lang/String;)V

    .line 250
    :goto_3
    const/4 v0, 0x1

    goto :goto_0

    .line 242
    :cond_7
    const-string v0, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment"

    invoke-virtual {v1, v0}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 243
    const-string v0, "MediaRouteButton"

    const-string v1, "showDialog(): Route controller dialog already showing!"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    .line 244
    goto :goto_0

    .line 246
    :cond_8
    iget-object v0, p0, Lob;->f:Lop;

    invoke-virtual {v0}, Lop;->c()Loo;

    move-result-object v0

    .line 248
    const-string v2, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment"

    invoke-virtual {v0, v1, v2}, Loo;->a(Lr;Ljava/lang/String;)V

    goto :goto_3
.end method

.method public b()V
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 488
    iget-boolean v0, p0, Lob;->d:Z

    if-eqz v0, :cond_3

    .line 489
    invoke-static {}, Ltz;->d()Luh;

    move-result-object v0

    .line 490
    invoke-virtual {v0}, Luh;->b()Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lob;->c:Ltx;

    invoke-virtual {v0, v3}, Luh;->a(Ltx;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v1

    .line 491
    :goto_0
    if-eqz v3, :cond_5

    .line 4907
    iget-boolean v0, v0, Luh;->f:Z

    .line 491
    if-eqz v0, :cond_5

    move v0, v1

    .line 494
    :goto_1
    iget-boolean v4, p0, Lob;->h:Z

    if-eq v4, v3, :cond_0

    .line 495
    iput-boolean v3, p0, Lob;->h:Z

    move v2, v1

    .line 498
    :cond_0
    iget-boolean v3, p0, Lob;->i:Z

    if-eq v3, v0, :cond_1

    .line 499
    iput-boolean v0, p0, Lob;->i:Z

    move v2, v1

    .line 503
    :cond_1
    if-eqz v2, :cond_2

    .line 504
    invoke-virtual {p0}, Lob;->refreshDrawableState()V

    .line 507
    :cond_2
    iget-object v0, p0, Lob;->c:Ltx;

    invoke-static {v0, v1}, Ltz;->a(Ltx;I)Z

    move-result v0

    invoke-virtual {p0, v0}, Lob;->setEnabled(Z)V

    .line 510
    :cond_3
    return-void

    :cond_4
    move v3, v2

    .line 490
    goto :goto_0

    :cond_5
    move v0, v2

    .line 491
    goto :goto_1
.end method

.method protected final drawableStateChanged()V
    .locals 2

    .prologue
    .line 350
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 352
    iget-object v0, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 353
    invoke-virtual {p0}, Lob;->getDrawableState()[I

    move-result-object v0

    .line 354
    iget-object v1, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 355
    invoke-virtual {p0}, Lob;->invalidate()V

    .line 357
    :cond_0
    return-void
.end method

.method public final jumpDrawablesToCurrentState()V
    .locals 1

    .prologue
    .line 383
    invoke-virtual {p0}, Lob;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 384
    invoke-virtual {p0}, Lob;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lbo;->a(Landroid/graphics/drawable/Drawable;)V

    .line 388
    :cond_0
    iget-object v0, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 389
    iget-object v0, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lbo;->a(Landroid/graphics/drawable/Drawable;)V

    .line 391
    :cond_1
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 4

    .prologue
    .line 404
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 406
    const/4 v0, 0x1

    iput-boolean v0, p0, Lob;->d:Z

    .line 407
    iget-object v0, p0, Lob;->c:Ltx;

    invoke-virtual {v0}, Ltx;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 408
    iget-object v0, p0, Lob;->a:Ltz;

    iget-object v1, p0, Lob;->c:Ltx;

    iget-object v2, p0, Lob;->b:Loc;

    .line 4450
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Ltz;->a(Ltx;Lua;I)V

    .line 410
    :cond_0
    invoke-virtual {p0}, Lob;->b()V

    .line 411
    return-void
.end method

.method protected final onCreateDrawableState(I)[I
    .locals 2

    .prologue
    .line 334
    add-int/lit8 v0, p1, 0x1

    invoke-super {p0, v0}, Landroid/view/View;->onCreateDrawableState(I)[I

    move-result-object v0

    .line 340
    iget-boolean v1, p0, Lob;->i:Z

    if-eqz v1, :cond_1

    .line 341
    sget-object v1, Lob;->m:[I

    invoke-static {v0, v1}, Lob;->mergeDrawableStates([I[I)[I

    .line 345
    :cond_0
    :goto_0
    return-object v0

    .line 342
    :cond_1
    iget-boolean v1, p0, Lob;->h:Z

    if-eqz v1, :cond_0

    .line 343
    sget-object v1, Lob;->l:[I

    invoke-static {v0, v1}, Lob;->mergeDrawableStates([I[I)[I

    goto :goto_0
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 415
    const/4 v0, 0x0

    iput-boolean v0, p0, Lob;->d:Z

    .line 416
    iget-object v0, p0, Lob;->c:Ltx;

    invoke-virtual {v0}, Ltx;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 417
    iget-object v0, p0, Lob;->a:Ltz;

    iget-object v1, p0, Lob;->b:Loc;

    invoke-virtual {v0, v1}, Ltz;->a(Lua;)V

    .line 420
    :cond_0
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 421
    return-void
.end method

.method protected final onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    .line 468
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 470
    iget-object v0, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 471
    invoke-virtual {p0}, Lob;->getPaddingLeft()I

    move-result v0

    .line 472
    invoke-virtual {p0}, Lob;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lob;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    .line 473
    invoke-virtual {p0}, Lob;->getPaddingTop()I

    move-result v2

    .line 474
    invoke-virtual {p0}, Lob;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Lob;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    .line 476
    iget-object v4, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    .line 477
    iget-object v5, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    .line 478
    sub-int/2addr v1, v0

    sub-int/2addr v1, v4

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 479
    sub-int v1, v3, v2

    sub-int/2addr v1, v5

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v1, v2

    .line 481
    iget-object v2, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    add-int v3, v0, v4

    add-int v4, v1, v5

    invoke-virtual {v2, v0, v1, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 483
    iget-object v0, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 485
    :cond_0
    return-void
.end method

.method protected final onMeasure(II)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 425
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 426
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 427
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 428
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    .line 430
    iget v6, p0, Lob;->j:I

    iget-object v0, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    :goto_0
    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 432
    iget v6, p0, Lob;->k:I

    iget-object v7, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v7, :cond_0

    iget-object v1, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    :cond_0
    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 436
    sparse-switch v4, :sswitch_data_0

    .line 445
    invoke-virtual {p0}, Lob;->getPaddingLeft()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lob;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    move v1, v0

    .line 450
    :goto_1
    sparse-switch v5, :sswitch_data_1

    .line 459
    invoke-virtual {p0}, Lob;->getPaddingTop()I

    move-result v0

    add-int/2addr v0, v6

    invoke-virtual {p0}, Lob;->getPaddingBottom()I

    move-result v2

    add-int/2addr v0, v2

    .line 463
    :goto_2
    invoke-virtual {p0, v1, v0}, Lob;->setMeasuredDimension(II)V

    .line 464
    return-void

    :cond_1
    move v0, v1

    .line 430
    goto :goto_0

    :sswitch_0
    move v1, v3

    .line 439
    goto :goto_1

    .line 441
    :sswitch_1
    invoke-virtual {p0}, Lob;->getPaddingLeft()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lob;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    move v1, v0

    .line 442
    goto :goto_1

    :sswitch_2
    move v0, v2

    .line 453
    goto :goto_2

    .line 455
    :sswitch_3
    invoke-virtual {p0}, Lob;->getPaddingTop()I

    move-result v0

    add-int/2addr v0, v6

    invoke-virtual {p0}, Lob;->getPaddingBottom()I

    move-result v3

    add-int/2addr v0, v3

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_2

    .line 436
    nop

    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x40000000 -> :sswitch_0
    .end sparse-switch

    .line 450
    :sswitch_data_1
    .sparse-switch
        -0x80000000 -> :sswitch_3
        0x40000000 -> :sswitch_2
    .end sparse-switch
.end method

.method public final performClick()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 284
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    move-result v1

    .line 285
    if-nez v1, :cond_0

    .line 286
    invoke-virtual {p0, v0}, Lob;->playSoundEffect(I)V

    .line 288
    :cond_0
    invoke-virtual {p0}, Lob;->a()Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz v1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public final performLongClick()Z
    .locals 10

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 293
    invoke-super {p0}, Landroid/view/View;->performLongClick()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 329
    :goto_0
    return v0

    .line 297
    :cond_0
    iget-boolean v2, p0, Lob;->e:Z

    if-nez v2, :cond_1

    move v0, v1

    .line 298
    goto :goto_0

    .line 301
    :cond_1
    invoke-virtual {p0}, Lob;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v2

    .line 302
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v0, v1

    .line 304
    goto :goto_0

    .line 307
    :cond_2
    const/4 v3, 0x2

    new-array v3, v3, [I

    .line 308
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 309
    invoke-virtual {p0, v3}, Lob;->getLocationOnScreen([I)V

    .line 310
    invoke-virtual {p0, v4}, Lob;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 312
    invoke-virtual {p0}, Lob;->getContext()Landroid/content/Context;

    move-result-object v5

    .line 313
    invoke-virtual {p0}, Lob;->getWidth()I

    move-result v6

    .line 314
    invoke-virtual {p0}, Lob;->getHeight()I

    move-result v7

    .line 315
    aget v8, v3, v0

    div-int/lit8 v9, v7, 0x2

    add-int/2addr v8, v9

    .line 316
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v9

    iget v9, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 318
    invoke-static {v5, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 319
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    if-ge v8, v4, :cond_3

    .line 321
    const v4, 0x800035

    aget v3, v3, v1

    sub-int v3, v9, v3

    div-int/lit8 v5, v6, 0x2

    sub-int/2addr v3, v5

    invoke-virtual {v2, v4, v3, v7}, Landroid/widget/Toast;->setGravity(III)V

    .line 327
    :goto_1
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 328
    invoke-virtual {p0, v1}, Lob;->performHapticFeedback(I)Z

    goto :goto_0

    .line 325
    :cond_3
    const/16 v3, 0x51

    invoke-virtual {v2, v3, v1, v7}, Landroid/widget/Toast;->setGravity(III)V

    goto :goto_1
.end method

.method public final setVisibility(I)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 395
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 397
    iget-object v0, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 398
    iget-object v2, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lob;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 400
    :cond_0
    return-void

    :cond_1
    move v0, v1

    .line 398
    goto :goto_0
.end method

.method protected final verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .prologue
    .line 376
    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lob;->g:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
