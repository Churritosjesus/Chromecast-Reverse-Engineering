.class public final Lvu;
.super Lpv;
.source "PG"

# interfaces
.implements Lfc;


# instance fields
.field f:Landroid/view/View;

.field public g:I

.field public h:Z

.field public i:Z

.field j:Lwa;

.field k:Lvv;

.field public l:Lvx;

.field final m:Lwb;

.field private n:Z

.field private o:Z

.field private p:I

.field private q:I

.field private r:Z

.field private s:Z

.field private t:I

.field private final u:Landroid/util/SparseBooleanArray;

.field private v:Landroid/view/View;

.field private w:Lvw;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 86
    sget v0, La;->bD:I

    sget v1, La;->bC:I

    invoke-direct {p0, p1, v0, v1}, Lpv;-><init>(Landroid/content/Context;II)V

    .line 72
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lvu;->u:Landroid/util/SparseBooleanArray;

    .line 82
    new-instance v0, Lwb;

    .line 1723
    invoke-direct {v0, p0}, Lwb;-><init>(Lvu;)V

    .line 82
    iput-object v0, p0, Lvu;->m:Lwb;

    .line 87
    return-void
.end method


# virtual methods
.method public final a(Lqe;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 168
    invoke-virtual {p1}, Lqe;->getActionView()Landroid/view/View;

    move-result-object v0

    .line 169
    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lqe;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 170
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lpv;->a(Lqe;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 172
    :cond_1
    invoke-virtual {p1}, Lqe;->isActionViewExpanded()Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 174
    check-cast p3, Landroid/support/v7/widget/ActionMenuView;

    .line 175
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 176
    invoke-virtual {p3, v1}, Landroid/support/v7/widget/ActionMenuView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 177
    invoke-virtual {p3, v1}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/view/ViewGroup$LayoutParams;)Lwe;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 179
    :cond_2
    return-object v0

    .line 172
    :cond_3
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/view/ViewGroup;)Lqr;
    .locals 2

    .prologue
    .line 161
    invoke-super {p0, p1}, Lpv;->a(Landroid/view/ViewGroup;)Lqr;

    move-result-object v1

    move-object v0, v1

    .line 162
    check-cast v0, Landroid/support/v7/widget/ActionMenuView;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/ActionMenuView;->a(Lvu;)V

    .line 163
    return-object v1
.end method

.method public final a(Landroid/content/Context;Lqa;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 91
    invoke-super {p0, p1, p2}, Lpv;->a(Landroid/content/Context;Lqa;)V

    .line 93
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 95
    invoke-static {p1}, Lph;->a(Landroid/content/Context;)Lph;

    move-result-object v3

    .line 96
    iget-boolean v4, p0, Lvu;->o:Z

    if-nez v4, :cond_1

    .line 2050
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x13

    if-lt v4, v5, :cond_5

    .line 97
    :cond_0
    :goto_0
    iput-boolean v0, p0, Lvu;->n:Z

    .line 100
    :cond_1
    iget-boolean v0, p0, Lvu;->s:Z

    if-nez v0, :cond_2

    .line 2058
    iget-object v0, v3, Lph;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v0, v0, 0x2

    .line 101
    iput v0, p0, Lvu;->p:I

    .line 105
    :cond_2
    iget-boolean v0, p0, Lvu;->h:Z

    if-nez v0, :cond_3

    .line 3046
    iget-object v0, v3, Lph;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v3, La;->bA:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    .line 106
    iput v0, p0, Lvu;->g:I

    .line 109
    :cond_3
    iget v0, p0, Lvu;->p:I

    .line 110
    iget-boolean v3, p0, Lvu;->n:Z

    if-eqz v3, :cond_6

    .line 111
    iget-object v3, p0, Lvu;->f:Landroid/view/View;

    if-nez v3, :cond_4

    .line 112
    new-instance v3, Lvy;

    iget-object v4, p0, Lvu;->a:Landroid/content/Context;

    invoke-direct {v3, p0, v4}, Lvy;-><init>(Lvu;Landroid/content/Context;)V

    iput-object v3, p0, Lvu;->f:Landroid/view/View;

    .line 113
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 114
    iget-object v3, p0, Lvu;->f:Landroid/view/View;

    invoke-virtual {v3, v1, v1}, Landroid/view/View;->measure(II)V

    .line 116
    :cond_4
    iget-object v1, p0, Lvu;->f:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v0, v1

    .line 121
    :goto_1
    iput v0, p0, Lvu;->q:I

    .line 123
    const/high16 v0, 0x42600000    # 56.0f

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lvu;->t:I

    .line 126
    iput-object v6, p0, Lvu;->v:Landroid/view/View;

    .line 127
    return-void

    .line 2053
    :cond_5
    iget-object v4, v3, Lph;->a:Landroid/content/Context;

    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v4

    invoke-static {v4}, Lhf;->b(Landroid/view/ViewConfiguration;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v0, v1

    goto :goto_0

    .line 118
    :cond_6
    iput-object v6, p0, Lvu;->f:Landroid/view/View;

    goto :goto_1
.end method

.method public final a(Landroid/support/v7/widget/ActionMenuView;)V
    .locals 1

    .prologue
    .line 548
    iput-object p1, p0, Lvu;->e:Lqr;

    .line 549
    iget-object v0, p0, Lvu;->c:Lqa;

    .line 8608
    iput-object v0, p1, Landroid/support/v7/widget/ActionMenuView;->a:Lqa;

    .line 550
    return-void
.end method

.method public final a(Lqa;Z)V
    .locals 0

    .prologue
    .line 514
    invoke-virtual {p0}, Lvu;->d()Z

    .line 515
    invoke-super {p0, p1, p2}, Lpv;->a(Lqa;Z)V

    .line 516
    return-void
.end method

.method public final a(Lqe;Lqs;)V
    .locals 1

    .prologue
    .line 184
    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lqs;->a(Lqe;I)V

    .line 186
    iget-object v0, p0, Lvu;->e:Lqr;

    check-cast v0, Landroid/support/v7/widget/ActionMenuView;

    .line 187
    check-cast p2, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    .line 3144
    iput-object v0, p2, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->a:Lqc;

    .line 190
    iget-object v0, p0, Lvu;->w:Lvw;

    if-nez v0, :cond_0

    .line 191
    new-instance v0, Lvw;

    .line 3763
    invoke-direct {v0, p0}, Lvw;-><init>(Lvu;)V

    .line 191
    iput-object v0, p0, Lvu;->w:Lvw;

    .line 193
    :cond_0
    iget-object v0, p0, Lvu;->w:Lvw;

    .line 4148
    iput-object v0, p2, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->b:Lpu;

    .line 194
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 539
    if-eqz p1, :cond_0

    .line 541
    const/4 v0, 0x0

    invoke-super {p0, v0}, Lpv;->a(Lqu;)Z

    .line 545
    :goto_0
    return-void

    .line 543
    :cond_0
    iget-object v0, p0, Lvu;->c:Lqa;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lqa;->a(Z)V

    goto :goto_0
.end method

.method public final a()Z
    .locals 21

    .prologue
    .line 379
    move-object/from16 v0, p0

    iget-object v2, v0, Lvu;->c:Lqa;

    invoke-virtual {v2}, Lqa;->h()Ljava/util/ArrayList;

    move-result-object v13

    .line 380
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v14

    .line 381
    move-object/from16 v0, p0

    iget v7, v0, Lvu;->g:I

    .line 382
    move-object/from16 v0, p0

    iget v9, v0, Lvu;->q:I

    .line 383
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    .line 384
    move-object/from16 v0, p0

    iget-object v2, v0, Lvu;->e:Lqr;

    check-cast v2, Landroid/view/ViewGroup;

    .line 386
    const/4 v6, 0x0

    .line 387
    const/4 v5, 0x0

    .line 388
    const/4 v8, 0x0

    .line 389
    const/4 v4, 0x0

    .line 390
    const/4 v3, 0x0

    move v10, v3

    :goto_0
    if-ge v10, v14, :cond_2

    .line 391
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqe;

    .line 392
    invoke-virtual {v3}, Lqe;->h()Z

    move-result v11

    if-eqz v11, :cond_0

    .line 393
    add-int/lit8 v6, v6, 0x1

    .line 399
    :goto_1
    move-object/from16 v0, p0

    iget-boolean v11, v0, Lvu;->i:Z

    if-eqz v11, :cond_1e

    invoke-virtual {v3}, Lqe;->isActionViewExpanded()Z

    move-result v3

    if-eqz v3, :cond_1e

    .line 402
    const/4 v3, 0x0

    .line 390
    :goto_2
    add-int/lit8 v7, v10, 0x1

    move v10, v7

    move v7, v3

    goto :goto_0

    .line 394
    :cond_0
    invoke-virtual {v3}, Lqe;->g()Z

    move-result v11

    if-eqz v11, :cond_1

    .line 395
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 397
    :cond_1
    const/4 v4, 0x1

    goto :goto_1

    .line 407
    :cond_2
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lvu;->n:Z

    if-eqz v3, :cond_4

    if-nez v4, :cond_3

    add-int v3, v6, v5

    if-le v3, v7, :cond_4

    .line 409
    :cond_3
    add-int/lit8 v7, v7, -0x1

    .line 411
    :cond_4
    sub-int v10, v7, v6

    .line 413
    move-object/from16 v0, p0

    iget-object v0, v0, Lvu;->u:Landroid/util/SparseBooleanArray;

    move-object/from16 v16, v0

    .line 414
    invoke-virtual/range {v16 .. v16}, Landroid/util/SparseBooleanArray;->clear()V

    .line 416
    const/4 v4, 0x0

    .line 417
    const/4 v3, 0x0

    .line 418
    move-object/from16 v0, p0

    iget-boolean v5, v0, Lvu;->r:Z

    if-eqz v5, :cond_1d

    .line 419
    move-object/from16 v0, p0

    iget v3, v0, Lvu;->t:I

    div-int v3, v9, v3

    .line 420
    move-object/from16 v0, p0

    iget v4, v0, Lvu;->t:I

    rem-int v4, v9, v4

    .line 421
    move-object/from16 v0, p0

    iget v5, v0, Lvu;->t:I

    div-int/2addr v4, v3

    add-int/2addr v4, v5

    move v5, v4

    .line 425
    :goto_3
    const/4 v4, 0x0

    move v12, v4

    move v7, v8

    move v4, v3

    :goto_4
    if-ge v12, v14, :cond_17

    .line 426
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqe;

    .line 428
    invoke-virtual {v3}, Lqe;->h()Z

    move-result v6

    if-eqz v6, :cond_8

    .line 429
    move-object/from16 v0, p0

    iget-object v6, v0, Lvu;->v:Landroid/view/View;

    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v6, v2}, Lvu;->a(Lqe;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 430
    move-object/from16 v0, p0

    iget-object v8, v0, Lvu;->v:Landroid/view/View;

    if-nez v8, :cond_5

    .line 431
    move-object/from16 v0, p0

    iput-object v6, v0, Lvu;->v:Landroid/view/View;

    .line 433
    :cond_5
    move-object/from16 v0, p0

    iget-boolean v8, v0, Lvu;->r:Z

    if-eqz v8, :cond_7

    .line 434
    const/4 v8, 0x0

    invoke-static {v6, v5, v4, v15, v8}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/view/View;IIII)I

    move-result v8

    sub-int/2addr v4, v8

    .line 439
    :goto_5
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    .line 440
    sub-int v8, v9, v6

    .line 441
    if-nez v7, :cond_1c

    .line 444
    :goto_6
    invoke-virtual {v3}, Lqe;->getGroupId()I

    move-result v7

    .line 445
    if-eqz v7, :cond_6

    .line 446
    const/4 v9, 0x1

    move-object/from16 v0, v16

    invoke-virtual {v0, v7, v9}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 448
    :cond_6
    const/4 v7, 0x1

    invoke-virtual {v3, v7}, Lqe;->d(Z)V

    move v3, v8

    move v7, v10

    .line 425
    :goto_7
    add-int/lit8 v8, v12, 0x1

    move v12, v8

    move v9, v3

    move v10, v7

    move v7, v6

    goto :goto_4

    .line 437
    :cond_7
    invoke-virtual {v6, v15, v15}, Landroid/view/View;->measure(II)V

    goto :goto_5

    .line 449
    :cond_8
    invoke-virtual {v3}, Lqe;->g()Z

    move-result v6

    if-eqz v6, :cond_16

    .line 452
    invoke-virtual {v3}, Lqe;->getGroupId()I

    move-result v17

    .line 453
    invoke-virtual/range {v16 .. v17}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v18

    .line 454
    if-gtz v10, :cond_9

    if-eqz v18, :cond_e

    :cond_9
    if-lez v9, :cond_e

    move-object/from16 v0, p0

    iget-boolean v6, v0, Lvu;->r:Z

    if-eqz v6, :cond_a

    if-lez v4, :cond_e

    :cond_a
    const/4 v6, 0x1

    .line 457
    :goto_8
    if-eqz v6, :cond_1b

    .line 458
    move-object/from16 v0, p0

    iget-object v8, v0, Lvu;->v:Landroid/view/View;

    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v8, v2}, Lvu;->a(Lqe;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v11

    .line 459
    move-object/from16 v0, p0

    iget-object v8, v0, Lvu;->v:Landroid/view/View;

    if-nez v8, :cond_b

    .line 460
    move-object/from16 v0, p0

    iput-object v11, v0, Lvu;->v:Landroid/view/View;

    .line 462
    :cond_b
    move-object/from16 v0, p0

    iget-boolean v8, v0, Lvu;->r:Z

    if-eqz v8, :cond_f

    .line 463
    const/4 v8, 0x0

    invoke-static {v11, v5, v4, v15, v8}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/view/View;IIII)I

    move-result v19

    .line 465
    sub-int v8, v4, v19

    .line 466
    if-nez v19, :cond_1a

    .line 467
    const/4 v4, 0x0

    :goto_9
    move v6, v8

    .line 472
    :goto_a
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    .line 473
    sub-int/2addr v9, v8

    .line 474
    if-nez v7, :cond_c

    move v7, v8

    .line 478
    :cond_c
    move-object/from16 v0, p0

    iget-boolean v8, v0, Lvu;->r:Z

    if-eqz v8, :cond_11

    .line 479
    if-ltz v9, :cond_10

    const/4 v8, 0x1

    :goto_b
    and-int/2addr v4, v8

    move v11, v4

    move v8, v7

    move v7, v6

    .line 486
    :goto_c
    if-eqz v11, :cond_13

    if-eqz v17, :cond_13

    .line 487
    const/4 v4, 0x1

    move-object/from16 v0, v16

    move/from16 v1, v17

    invoke-virtual {v0, v1, v4}, Landroid/util/SparseBooleanArray;->put(IZ)V

    move v4, v10

    .line 501
    :goto_d
    if-eqz v11, :cond_d

    add-int/lit8 v4, v4, -0x1

    .line 503
    :cond_d
    invoke-virtual {v3, v11}, Lqe;->d(Z)V

    move v6, v8

    move v3, v9

    move/from16 v20, v7

    move v7, v4

    move/from16 v4, v20

    .line 504
    goto :goto_7

    .line 454
    :cond_e
    const/4 v6, 0x0

    goto :goto_8

    .line 470
    :cond_f
    invoke-virtual {v11, v15, v15}, Landroid/view/View;->measure(II)V

    move/from16 v20, v6

    move v6, v4

    move/from16 v4, v20

    goto :goto_a

    .line 479
    :cond_10
    const/4 v8, 0x0

    goto :goto_b

    .line 482
    :cond_11
    add-int v8, v9, v7

    if-lez v8, :cond_12

    const/4 v8, 0x1

    :goto_e
    and-int/2addr v4, v8

    move v11, v4

    move v8, v7

    move v7, v6

    goto :goto_c

    :cond_12
    const/4 v8, 0x0

    goto :goto_e

    .line 488
    :cond_13
    if-eqz v18, :cond_19

    .line 490
    const/4 v4, 0x0

    move-object/from16 v0, v16

    move/from16 v1, v17

    invoke-virtual {v0, v1, v4}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 491
    const/4 v4, 0x0

    move v6, v10

    move v10, v4

    :goto_f
    if-ge v10, v12, :cond_18

    .line 492
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqe;

    .line 493
    invoke-virtual {v4}, Lqe;->getGroupId()I

    move-result v18

    move/from16 v0, v18

    move/from16 v1, v17

    if-ne v0, v1, :cond_15

    .line 495
    invoke-virtual {v4}, Lqe;->f()Z

    move-result v18

    if-eqz v18, :cond_14

    add-int/lit8 v6, v6, 0x1

    .line 496
    :cond_14
    const/16 v18, 0x0

    move/from16 v0, v18

    invoke-virtual {v4, v0}, Lqe;->d(Z)V

    .line 491
    :cond_15
    add-int/lit8 v4, v10, 0x1

    move v10, v4

    goto :goto_f

    .line 506
    :cond_16
    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Lqe;->d(Z)V

    move v6, v7

    move v3, v9

    move v7, v10

    goto/16 :goto_7

    .line 509
    :cond_17
    const/4 v2, 0x1

    return v2

    :cond_18
    move v4, v6

    goto :goto_d

    :cond_19
    move v4, v10

    goto :goto_d

    :cond_1a
    move v4, v6

    goto/16 :goto_9

    :cond_1b
    move v11, v6

    move v8, v7

    move v7, v4

    goto :goto_c

    :cond_1c
    move v6, v7

    goto/16 :goto_6

    :cond_1d
    move v5, v4

    goto/16 :goto_3

    :cond_1e
    move v3, v7

    goto/16 :goto_2
.end method

.method public final a(Landroid/view/ViewGroup;I)Z
    .locals 2

    .prologue
    .line 256
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lvu;->f:Landroid/view/View;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 257
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lpv;->a(Landroid/view/ViewGroup;I)Z

    move-result v0

    goto :goto_0
.end method

.method public final a(Lqe;)Z
    .locals 1

    .prologue
    .line 198
    invoke-virtual {p1}, Lqe;->f()Z

    move-result v0

    return v0
.end method

.method public final a(Lqu;)Z
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 261
    invoke-virtual {p1}, Lqu;->hasVisibleItems()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v3

    .line 278
    :goto_0
    return v0

    :cond_0
    move-object v0, p1

    .line 6065
    :goto_1
    iget-object v1, v0, Lqu;->k:Lqa;

    .line 264
    iget-object v2, p0, Lvu;->c:Lqa;

    if-eq v1, v2, :cond_1

    .line 7065
    iget-object v0, v0, Lqu;->k:Lqa;

    .line 265
    check-cast v0, Lqu;

    goto :goto_1

    .line 267
    :cond_1
    invoke-virtual {v0}, Lqu;->getItem()Landroid/view/MenuItem;

    move-result-object v5

    .line 7282
    iget-object v0, p0, Lvu;->e:Lqr;

    check-cast v0, Landroid/view/ViewGroup;

    .line 7283
    if-eqz v0, :cond_3

    .line 7285
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    move v4, v3

    .line 7286
    :goto_2
    if-ge v4, v6, :cond_3

    .line 7287
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 7288
    instance-of v1, v2, Lqs;

    if-eqz v1, :cond_2

    move-object v1, v2

    check-cast v1, Lqs;

    invoke-interface {v1}, Lqs;->a()Lqe;

    move-result-object v1

    if-ne v1, v5, :cond_2

    move-object v0, v2

    .line 268
    :goto_3
    if-nez v0, :cond_5

    .line 269
    iget-object v0, p0, Lvu;->f:Landroid/view/View;

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_0

    .line 7286
    :cond_2
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_2

    .line 7293
    :cond_3
    const/4 v0, 0x0

    goto :goto_3

    .line 270
    :cond_4
    iget-object v0, p0, Lvu;->f:Landroid/view/View;

    .line 273
    :cond_5
    invoke-virtual {p1}, Lqu;->getItem()Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    .line 274
    new-instance v1, Lvv;

    iget-object v2, p0, Lvu;->b:Landroid/content/Context;

    invoke-direct {v1, p0, v2, p1}, Lvv;-><init>(Lvu;Landroid/content/Context;Lqu;)V

    iput-object v1, p0, Lvu;->k:Lvv;

    .line 275
    iget-object v1, p0, Lvu;->k:Lvv;

    .line 8113
    iput-object v0, v1, Lqn;->b:Landroid/view/View;

    .line 276
    iget-object v0, p0, Lvu;->k:Lvv;

    invoke-virtual {v0}, Lvv;->b()V

    .line 277
    invoke-super {p0, p1}, Lpv;->a(Lqu;)Z

    .line 278
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final b(Z)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 203
    iget-object v0, p0, Lvu;->e:Lqr;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 207
    invoke-super {p0, p1}, Lpv;->b(Z)V

    .line 209
    iget-object v0, p0, Lvu;->e:Lqr;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 211
    iget-object v0, p0, Lvu;->c:Lqa;

    if-eqz v0, :cond_1

    .line 212
    iget-object v0, p0, Lvu;->c:Lqa;

    .line 4165
    invoke-virtual {v0}, Lqa;->i()V

    .line 4166
    iget-object v4, v0, Lqa;->d:Ljava/util/ArrayList;

    .line 213
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v3, v2

    .line 214
    :goto_0
    if-ge v3, v5, :cond_1

    .line 215
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqe;

    .line 4651
    iget-object v0, v0, Lqe;->d:Lfb;

    .line 216
    if-eqz v0, :cond_0

    .line 5226
    iput-object p0, v0, Lfb;->b:Lfc;

    .line 214
    :cond_0
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 222
    :cond_1
    iget-object v0, p0, Lvu;->c:Lqa;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lvu;->c:Lqa;

    invoke-virtual {v0}, Lqa;->j()Ljava/util/ArrayList;

    move-result-object v0

    .line 226
    :goto_1
    iget-boolean v3, p0, Lvu;->n:Z

    if-eqz v3, :cond_2

    if-eqz v0, :cond_2

    .line 227
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 228
    if-ne v3, v1, :cond_8

    .line 229
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqe;

    invoke-virtual {v0}, Lqe;->isActionViewExpanded()Z

    move-result v0

    if-nez v0, :cond_7

    move v0, v1

    :goto_2
    move v2, v0

    .line 235
    :cond_2
    :goto_3
    if-eqz v2, :cond_a

    .line 236
    iget-object v0, p0, Lvu;->f:Landroid/view/View;

    if-nez v0, :cond_3

    .line 237
    new-instance v0, Lvy;

    iget-object v1, p0, Lvu;->a:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lvy;-><init>(Lvu;Landroid/content/Context;)V

    iput-object v0, p0, Lvu;->f:Landroid/view/View;

    .line 239
    :cond_3
    iget-object v0, p0, Lvu;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 240
    iget-object v1, p0, Lvu;->e:Lqr;

    if-eq v0, v1, :cond_5

    .line 241
    if-eqz v0, :cond_4

    .line 242
    iget-object v1, p0, Lvu;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 244
    :cond_4
    iget-object v0, p0, Lvu;->e:Lqr;

    check-cast v0, Landroid/support/v7/widget/ActionMenuView;

    .line 245
    iget-object v1, p0, Lvu;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionMenuView;->a()Lwe;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/ActionMenuView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 251
    :cond_5
    :goto_4
    iget-object v0, p0, Lvu;->e:Lqr;

    check-cast v0, Landroid/support/v7/widget/ActionMenuView;

    iget-boolean v1, p0, Lvu;->n:Z

    .line 5554
    iput-boolean v1, v0, Landroid/support/v7/widget/ActionMenuView;->b:Z

    .line 252
    return-void

    .line 222
    :cond_6
    const/4 v0, 0x0

    goto :goto_1

    :cond_7
    move v0, v2

    .line 229
    goto :goto_2

    .line 231
    :cond_8
    if-lez v3, :cond_9

    :goto_5
    move v2, v1

    goto :goto_3

    :cond_9
    move v1, v2

    goto :goto_5

    .line 247
    :cond_a
    iget-object v0, p0, Lvu;->f:Landroid/view/View;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lvu;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Lvu;->e:Lqr;

    if-ne v0, v1, :cond_5

    .line 248
    iget-object v0, p0, Lvu;->e:Lqr;

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lvu;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_4
.end method

.method public final b()Z
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 301
    iget-boolean v0, p0, Lvu;->n:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lvu;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lvu;->c:Lqa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvu;->e:Lqr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvu;->l:Lvx;

    if-nez v0, :cond_0

    iget-object v0, p0, Lvu;->c:Lqa;

    invoke-virtual {v0}, Lqa;->j()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 303
    new-instance v0, Lwa;

    iget-object v2, p0, Lvu;->b:Landroid/content/Context;

    iget-object v3, p0, Lvu;->c:Lqa;

    iget-object v4, p0, Lvu;->f:Landroid/view/View;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lwa;-><init>(Lvu;Landroid/content/Context;Lqa;Landroid/view/View;Z)V

    .line 304
    new-instance v1, Lvx;

    invoke-direct {v1, p0, v0}, Lvx;-><init>(Lvu;Lwa;)V

    iput-object v1, p0, Lvu;->l:Lvx;

    .line 306
    iget-object v0, p0, Lvu;->e:Lqr;

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Lvu;->l:Lvx;

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 310
    const/4 v0, 0x0

    invoke-super {p0, v0}, Lpv;->a(Lqu;)Z

    .line 314
    :goto_0
    return v5

    :cond_0
    const/4 v5, 0x0

    goto :goto_0
.end method

.method public final c(Z)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 146
    iput-boolean v0, p0, Lvu;->n:Z

    .line 147
    iput-boolean v0, p0, Lvu;->o:Z

    .line 148
    return-void
.end method

.method public final c()Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 323
    iget-object v0, p0, Lvu;->l:Lvx;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvu;->e:Lqr;

    if-eqz v0, :cond_0

    .line 324
    iget-object v0, p0, Lvu;->e:Lqr;

    check-cast v0, Landroid/view/View;

    iget-object v2, p0, Lvu;->l:Lvx;

    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 325
    const/4 v0, 0x0

    iput-object v0, p0, Lvu;->l:Lvx;

    move v0, v1

    .line 334
    :goto_0
    return v0

    .line 329
    :cond_0
    iget-object v0, p0, Lvu;->j:Lwa;

    .line 330
    if-eqz v0, :cond_1

    .line 331
    invoke-virtual {v0}, Lqn;->d()V

    move v0, v1

    .line 332
    goto :goto_0

    .line 334
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Z
    .locals 2

    .prologue
    .line 342
    invoke-virtual {p0}, Lvu;->c()Z

    move-result v0

    .line 343
    invoke-virtual {p0}, Lvu;->e()Z

    move-result v1

    or-int/2addr v0, v1

    .line 344
    return v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 353
    iget-object v0, p0, Lvu;->k:Lvv;

    if-eqz v0, :cond_0

    .line 354
    iget-object v0, p0, Lvu;->k:Lvv;

    invoke-virtual {v0}, Lvv;->d()V

    .line 355
    const/4 v0, 0x1

    .line 357
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 364
    iget-object v0, p0, Lvu;->j:Lwa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvu;->j:Lwa;

    invoke-virtual {v0}, Lwa;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
