.class public final Lnd;
.super Lny;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface;


# instance fields
.field private a:Lmx;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .prologue
    .line 92
    invoke-static {p1, p2}, Lnd;->a(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lny;-><init>(Landroid/content/Context;I)V

    .line 93
    new-instance v0, Lmx;

    invoke-virtual {p0}, Lnd;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lnd;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-direct {v0, v1, p0, v2}, Lmx;-><init>(Landroid/content/Context;Lny;Landroid/view/Window;)V

    iput-object v0, p0, Lnd;->a:Lmx;

    .line 94
    return-void
.end method

.method static a(Landroid/content/Context;I)I
    .locals 4

    .prologue
    .line 104
    const/high16 v0, 0x1000000

    if-lt p1, v0, :cond_0

    .line 109
    :goto_0
    return p1

    .line 107
    :cond_0
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 108
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, La;->v:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 109
    iget p1, v0, Landroid/util/TypedValue;->resourceId:I

    goto :goto_0
.end method

.method public static synthetic a(Lnd;)Lmx;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lnd;->a:Lmx;

    return-object v0
.end method


# virtual methods
.method protected final onCreate(Landroid/os/Bundle;)V
    .locals 13

    .prologue
    const/high16 v12, 0x20000

    const/4 v11, -0x1

    const/4 v3, 0x1

    const/16 v10, 0x8

    const/4 v2, 0x0

    .line 239
    invoke-super {p0, p1}, Lny;->onCreate(Landroid/os/Bundle;)V

    .line 240
    iget-object v5, p0, Lnd;->a:Lmx;

    .line 1213
    iget-object v0, v5, Lmx;->b:Lny;

    .line 2127
    invoke-virtual {v0}, Lny;->a()Lnh;

    move-result-object v0

    invoke-virtual {v0, v3}, Lnh;->b(I)Z

    .line 2221
    iget v0, v5, Lmx;->G:I

    .line 2227
    iget v0, v5, Lmx;->F:I

    .line 1216
    iget-object v1, v5, Lmx;->b:Lny;

    invoke-virtual {v1, v0}, Lny;->setContentView(I)V

    .line 2407
    iget-object v0, v5, Lmx;->c:Landroid/view/Window;

    sget v1, La;->ba:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 2522
    iget-object v1, v5, Lmx;->c:Landroid/view/Window;

    sget v4, La;->bk:I

    invoke-virtual {v1, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ScrollView;

    iput-object v1, v5, Lmx;->w:Landroid/widget/ScrollView;

    .line 2523
    iget-object v1, v5, Lmx;->w:Landroid/widget/ScrollView;

    invoke-virtual {v1, v2}, Landroid/widget/ScrollView;->setFocusable(Z)V

    .line 2526
    iget-object v1, v5, Lmx;->c:Landroid/view/Window;

    const v4, 0x102000b

    invoke-virtual {v1, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v5, Lmx;->B:Landroid/widget/TextView;

    .line 2527
    iget-object v1, v5, Lmx;->B:Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 2531
    iget-object v1, v5, Lmx;->e:Ljava/lang/CharSequence;

    if-eqz v1, :cond_9

    .line 2532
    iget-object v0, v5, Lmx;->B:Landroid/widget/TextView;

    iget-object v1, v5, Lmx;->e:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2554
    :cond_0
    :goto_0
    iget-object v0, v5, Lmx;->c:Landroid/view/Window;

    const v1, 0x1020019

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, v5, Lmx;->n:Landroid/widget/Button;

    .line 2555
    iget-object v0, v5, Lmx;->n:Landroid/widget/Button;

    iget-object v1, v5, Lmx;->L:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2557
    iget-object v0, v5, Lmx;->o:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 2558
    iget-object v0, v5, Lmx;->n:Landroid/widget/Button;

    invoke-virtual {v0, v10}, Landroid/widget/Button;->setVisibility(I)V

    move v1, v2

    .line 2565
    :goto_1
    iget-object v0, v5, Lmx;->c:Landroid/view/Window;

    const v4, 0x102001a

    invoke-virtual {v0, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, v5, Lmx;->q:Landroid/widget/Button;

    .line 2566
    iget-object v0, v5, Lmx;->q:Landroid/widget/Button;

    iget-object v4, v5, Lmx;->L:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2568
    iget-object v0, v5, Lmx;->r:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 2569
    iget-object v0, v5, Lmx;->q:Landroid/widget/Button;

    invoke-virtual {v0, v10}, Landroid/widget/Button;->setVisibility(I)V

    .line 2577
    :goto_2
    iget-object v0, v5, Lmx;->c:Landroid/view/Window;

    const v4, 0x102001b

    invoke-virtual {v0, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, v5, Lmx;->t:Landroid/widget/Button;

    .line 2578
    iget-object v0, v5, Lmx;->t:Landroid/widget/Button;

    iget-object v4, v5, Lmx;->L:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2580
    iget-object v0, v5, Lmx;->u:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 2581
    iget-object v0, v5, Lmx;->t:Landroid/widget/Button;

    invoke-virtual {v0, v10}, Landroid/widget/Button;->setVisibility(I)V

    .line 2589
    :goto_3
    iget-object v0, v5, Lmx;->a:Landroid/content/Context;

    .line 3163
    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 3164
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v6, La;->t:I

    invoke-virtual {v0, v6, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 3165
    iget v0, v4, Landroid/util/TypedValue;->data:I

    if-eqz v0, :cond_e

    move v0, v3

    .line 2589
    :goto_4
    if-eqz v0, :cond_1

    .line 2594
    if-ne v1, v3, :cond_f

    .line 2595
    iget-object v0, v5, Lmx;->n:Landroid/widget/Button;

    invoke-static {v0}, Lmx;->a(Landroid/widget/Button;)V

    .line 2603
    :cond_1
    :goto_5
    if-eqz v1, :cond_11

    move v4, v3

    .line 2411
    :goto_6
    iget-object v0, v5, Lmx;->c:Landroid/view/Window;

    sget v1, La;->bz:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 2412
    iget-object v1, v5, Lmx;->a:Landroid/content/Context;

    const/4 v6, 0x0

    sget-object v7, Loq;->H:[I

    sget v8, La;->u:I

    invoke-static {v1, v6, v7, v8, v2}, Lth;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lth;

    move-result-object v6

    .line 3474
    iget-object v1, v5, Lmx;->C:Landroid/view/View;

    if-eqz v1, :cond_12

    .line 3476
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v7, -0x2

    invoke-direct {v1, v11, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 3479
    iget-object v7, v5, Lmx;->C:Landroid/view/View;

    invoke-virtual {v0, v7, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 3482
    iget-object v0, v5, Lmx;->c:Landroid/view/Window;

    sget v1, La;->by:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 3483
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 2416
    :goto_7
    iget-object v0, v5, Lmx;->c:Landroid/view/Window;

    sget v1, La;->aZ:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 2417
    if-nez v4, :cond_2

    .line 2418
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 2419
    iget-object v0, v5, Lmx;->c:Landroid/view/Window;

    sget v1, La;->bw:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 2420
    if-eqz v0, :cond_2

    .line 2421
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2425
    :cond_2
    iget-object v0, v5, Lmx;->c:Landroid/view/Window;

    sget v1, La;->bc:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 2427
    iget-object v1, v5, Lmx;->g:Landroid/view/View;

    if-eqz v1, :cond_17

    .line 2428
    iget-object v1, v5, Lmx;->g:Landroid/view/View;

    move-object v4, v1

    .line 2436
    :goto_8
    if-eqz v4, :cond_3

    move v2, v3

    .line 2437
    :cond_3
    if-eqz v2, :cond_4

    invoke-static {v4}, Lmx;->a(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 2438
    :cond_4
    iget-object v1, v5, Lmx;->c:Landroid/view/Window;

    invoke-virtual {v1, v12, v12}, Landroid/view/Window;->setFlags(II)V

    .line 2442
    :cond_5
    if-eqz v2, :cond_19

    .line 2443
    iget-object v1, v5, Lmx;->c:Landroid/view/Window;

    sget v2, La;->bb:I

    invoke-virtual {v1, v2}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    .line 2444
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v11, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v4, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2446
    iget-boolean v2, v5, Lmx;->m:Z

    if-eqz v2, :cond_6

    .line 2447
    iget v2, v5, Lmx;->i:I

    iget v4, v5, Lmx;->j:I

    iget v7, v5, Lmx;->k:I

    iget v8, v5, Lmx;->l:I

    invoke-virtual {v1, v2, v4, v7, v8}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    .line 2451
    :cond_6
    iget-object v1, v5, Lmx;->f:Landroid/widget/ListView;

    if-eqz v1, :cond_7

    .line 2452
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 2458
    :cond_7
    :goto_9
    iget-object v0, v5, Lmx;->f:Landroid/widget/ListView;

    .line 2459
    if-eqz v0, :cond_8

    iget-object v1, v5, Lmx;->D:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_8

    .line 2460
    iget-object v1, v5, Lmx;->D:Landroid/widget/ListAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 2461
    iget v1, v5, Lmx;->E:I

    .line 2462
    if-ltz v1, :cond_8

    .line 2463
    invoke-virtual {v0, v1, v3}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 2464
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 4183
    :cond_8
    iget-object v0, v6, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 241
    return-void

    .line 2534
    :cond_9
    iget-object v1, v5, Lmx;->B:Landroid/widget/TextView;

    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2535
    iget-object v1, v5, Lmx;->w:Landroid/widget/ScrollView;

    iget-object v4, v5, Lmx;->B:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/ScrollView;->removeView(Landroid/view/View;)V

    .line 2537
    iget-object v1, v5, Lmx;->f:Landroid/widget/ListView;

    if-eqz v1, :cond_a

    .line 2538
    iget-object v0, v5, Lmx;->w:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/widget/ScrollView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 2539
    iget-object v1, v5, Lmx;->w:Landroid/widget/ScrollView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    .line 2540
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 2541
    iget-object v4, v5, Lmx;->f:Landroid/widget/ListView;

    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v6, v11, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v4, v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 2544
    :cond_a
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto/16 :goto_0

    .line 2560
    :cond_b
    iget-object v0, v5, Lmx;->n:Landroid/widget/Button;

    iget-object v1, v5, Lmx;->o:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 2561
    iget-object v0, v5, Lmx;->n:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    move v1, v3

    .line 2562
    goto/16 :goto_1

    .line 2571
    :cond_c
    iget-object v0, v5, Lmx;->q:Landroid/widget/Button;

    iget-object v4, v5, Lmx;->r:Ljava/lang/CharSequence;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 2572
    iget-object v0, v5, Lmx;->q:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 2574
    or-int/lit8 v1, v1, 0x2

    goto/16 :goto_2

    .line 2583
    :cond_d
    iget-object v0, v5, Lmx;->t:Landroid/widget/Button;

    iget-object v4, v5, Lmx;->u:Ljava/lang/CharSequence;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 2584
    iget-object v0, v5, Lmx;->t:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 2586
    or-int/lit8 v1, v1, 0x4

    goto/16 :goto_3

    :cond_e
    move v0, v2

    .line 3165
    goto/16 :goto_4

    .line 2596
    :cond_f
    const/4 v0, 0x2

    if-ne v1, v0, :cond_10

    .line 2597
    iget-object v0, v5, Lmx;->q:Landroid/widget/Button;

    invoke-static {v0}, Lmx;->a(Landroid/widget/Button;)V

    goto/16 :goto_5

    .line 2598
    :cond_10
    const/4 v0, 0x4

    if-ne v1, v0, :cond_1

    .line 2599
    iget-object v0, v5, Lmx;->t:Landroid/widget/Button;

    invoke-static {v0}, Lmx;->a(Landroid/widget/Button;)V

    goto/16 :goto_5

    :cond_11
    move v4, v2

    .line 2603
    goto/16 :goto_6

    .line 3485
    :cond_12
    iget-object v1, v5, Lmx;->c:Landroid/view/Window;

    const v7, 0x1020006

    invoke-virtual {v1, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v5, Lmx;->z:Landroid/widget/ImageView;

    .line 3487
    iget-object v1, v5, Lmx;->d:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_13

    move v1, v3

    .line 3488
    :goto_a
    if-eqz v1, :cond_16

    .line 3490
    iget-object v0, v5, Lmx;->c:Landroid/view/Window;

    sget v1, La;->aY:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v5, Lmx;->A:Landroid/widget/TextView;

    .line 3491
    iget-object v0, v5, Lmx;->A:Landroid/widget/TextView;

    iget-object v1, v5, Lmx;->d:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3496
    iget v0, v5, Lmx;->x:I

    if-eqz v0, :cond_14

    .line 3497
    iget-object v0, v5, Lmx;->z:Landroid/widget/ImageView;

    iget v1, v5, Lmx;->x:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_7

    :cond_13
    move v1, v2

    .line 3487
    goto :goto_a

    .line 3498
    :cond_14
    iget-object v0, v5, Lmx;->y:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_15

    .line 3499
    iget-object v0, v5, Lmx;->z:Landroid/widget/ImageView;

    iget-object v1, v5, Lmx;->y:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_7

    .line 3503
    :cond_15
    iget-object v0, v5, Lmx;->A:Landroid/widget/TextView;

    iget-object v1, v5, Lmx;->z:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getPaddingLeft()I

    move-result v1

    iget-object v7, v5, Lmx;->z:Landroid/widget/ImageView;

    invoke-virtual {v7}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result v7

    iget-object v8, v5, Lmx;->z:Landroid/widget/ImageView;

    invoke-virtual {v8}, Landroid/widget/ImageView;->getPaddingRight()I

    move-result v8

    iget-object v9, v5, Lmx;->z:Landroid/widget/ImageView;

    invoke-virtual {v9}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result v9

    invoke-virtual {v0, v1, v7, v8, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 3507
    iget-object v0, v5, Lmx;->z:Landroid/widget/ImageView;

    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_7

    .line 3511
    :cond_16
    iget-object v1, v5, Lmx;->c:Landroid/view/Window;

    sget v7, La;->by:I

    invoke-virtual {v1, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 3512
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 3513
    iget-object v1, v5, Lmx;->z:Landroid/widget/ImageView;

    invoke-virtual {v1, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3514
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto/16 :goto_7

    .line 2429
    :cond_17
    iget v1, v5, Lmx;->h:I

    if-eqz v1, :cond_18

    .line 2430
    iget-object v1, v5, Lmx;->a:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 2431
    iget v4, v5, Lmx;->h:I

    invoke-virtual {v1, v4, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    .line 2432
    goto/16 :goto_8

    .line 2433
    :cond_18
    const/4 v1, 0x0

    move-object v4, v1

    goto/16 :goto_8

    .line 2455
    :cond_19
    invoke-virtual {v0, v10}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto/16 :goto_9
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 245
    iget-object v1, p0, Lnd;->a:Lmx;

    .line 4398
    iget-object v2, v1, Lmx;->w:Landroid/widget/ScrollView;

    if-eqz v2, :cond_0

    iget-object v1, v1, Lmx;->w:Landroid/widget/ScrollView;

    invoke-virtual {v1, p2}, Landroid/widget/ScrollView;->executeKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v0

    .line 245
    :goto_0
    if-eqz v1, :cond_1

    .line 248
    :goto_1
    return v0

    .line 4398
    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 248
    :cond_1
    invoke-super {p0, p1, p2}, Lny;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_1
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 253
    iget-object v1, p0, Lnd;->a:Lmx;

    .line 4403
    iget-object v2, v1, Lmx;->w:Landroid/widget/ScrollView;

    if-eqz v2, :cond_0

    iget-object v1, v1, Lmx;->w:Landroid/widget/ScrollView;

    invoke-virtual {v1, p2}, Landroid/widget/ScrollView;->executeKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v0

    .line 253
    :goto_0
    if-eqz v1, :cond_1

    .line 256
    :goto_1
    return v0

    .line 4403
    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 256
    :cond_1
    invoke-super {p0, p1, p2}, Lny;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_1
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 138
    invoke-super {p0, p1}, Lny;->setTitle(Ljava/lang/CharSequence;)V

    .line 139
    iget-object v0, p0, Lnd;->a:Lmx;

    invoke-virtual {v0, p1}, Lmx;->a(Ljava/lang/CharSequence;)V

    .line 140
    return-void
.end method
