.class final Lt;
.super Lr;
.source "PG"

# interfaces
.implements Lfs;


# static fields
.field static a:Z

.field private static l:Z

.field private static y:Landroid/view/animation/Interpolator;

.field private static z:Landroid/view/animation/Interpolator;


# instance fields
.field b:Ljava/util/ArrayList;

.field c:Ljava/util/ArrayList;

.field d:Ljava/util/ArrayList;

.field e:Ljava/util/ArrayList;

.field f:Ljava/util/ArrayList;

.field g:I

.field h:Lm;

.field i:Lq;

.field j:Z

.field k:Ljava/lang/String;

.field private m:Ljava/util/ArrayList;

.field private n:[Ljava/lang/Runnable;

.field private o:Z

.field private p:Ljava/util/ArrayList;

.field private q:Ljava/util/ArrayList;

.field private r:Lj;

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Landroid/os/Bundle;

.field private w:Landroid/util/SparseArray;

.field private x:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/high16 v4, 0x40200000    # 2.5f

    const/high16 v3, 0x3fc00000    # 1.5f

    .line 414
    sput-boolean v0, Lt;->a:Z

    .line 417
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    sput-boolean v0, Lt;->l:Z

    .line 750
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Lt;->y:Landroid/view/animation/Interpolator;

    .line 751
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0, v3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Lt;->z:Landroid/view/animation/Interpolator;

    .line 752
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0, v4}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    .line 753
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0, v3}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 413
    invoke-direct {p0}, Lr;-><init>()V

    .line 440
    const/4 v0, 0x0

    iput v0, p0, Lt;->g:I

    .line 452
    iput-object v1, p0, Lt;->v:Landroid/os/Bundle;

    .line 453
    iput-object v1, p0, Lt;->w:Landroid/util/SparseArray;

    .line 455
    new-instance v0, Lu;

    invoke-direct {v0, p0}, Lu;-><init>(Lt;)V

    iput-object v0, p0, Lt;->x:Ljava/lang/Runnable;

    .line 2216
    return-void
.end method

.method private static a(FF)Landroid/view/animation/Animation;
    .locals 4

    .prologue
    .line 773
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p0, p1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 774
    sget-object v1, Lt;->z:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 775
    const-wide/16 v2, 0xdc

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 776
    return-object v0
.end method

.method private static a(FFFF)Landroid/view/animation/Animation;
    .locals 12

    .prologue
    const-wide/16 v10, 0xdc

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    .line 759
    new-instance v9, Landroid/view/animation/AnimationSet;

    const/4 v0, 0x0

    invoke-direct {v9, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 760
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    move v1, p0

    move v2, p1

    move v3, p0

    move v4, p1

    move v7, v5

    move v8, v6

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 762
    sget-object v1, Lt;->y:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 763
    invoke-virtual {v0, v10, v11}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 764
    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 765
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p2, p3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 766
    sget-object v1, Lt;->z:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 767
    invoke-virtual {v0, v10, v11}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 768
    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 769
    return-object v9
.end method

.method private a(Lj;IZI)Landroid/view/animation/Animation;
    .locals 6

    .prologue
    const v5, 0x3f79999a    # 0.975f

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    .line 781
    iget v0, p1, Lj;->L:I

    invoke-static {}, Lj;->i()Landroid/view/animation/Animation;

    .line 787
    iget v0, p1, Lj;->L:I

    if-eqz v0, :cond_0

    .line 788
    iget-object v0, p0, Lt;->h:Lm;

    iget v2, p1, Lj;->L:I

    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 789
    if-eqz v0, :cond_0

    .line 835
    :goto_0
    return-object v0

    .line 794
    :cond_0
    if-nez p2, :cond_1

    move-object v0, v1

    .line 795
    goto :goto_0

    .line 4105
    :cond_1
    const/4 v0, -0x1

    .line 4106
    sparse-switch p2, :sswitch_data_0

    .line 799
    :goto_1
    if-gez v0, :cond_5

    move-object v0, v1

    .line 800
    goto :goto_0

    .line 4108
    :sswitch_0
    if-eqz p3, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x2

    goto :goto_1

    .line 4111
    :sswitch_1
    if-eqz p3, :cond_3

    const/4 v0, 0x3

    goto :goto_1

    :cond_3
    const/4 v0, 0x4

    goto :goto_1

    .line 4114
    :sswitch_2
    if-eqz p3, :cond_4

    const/4 v0, 0x5

    goto :goto_1

    :cond_4
    const/4 v0, 0x6

    goto :goto_1

    .line 803
    :cond_5
    packed-switch v0, :pswitch_data_0

    .line 818
    if-nez p4, :cond_6

    iget-object v0, p0, Lt;->h:Lm;

    invoke-virtual {v0}, Lm;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 819
    iget-object v0, p0, Lt;->h:Lm;

    invoke-virtual {v0}, Lm;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget p4, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 821
    :cond_6
    if-nez p4, :cond_7

    move-object v0, v1

    .line 822
    goto :goto_0

    .line 805
    :pswitch_0
    const/high16 v0, 0x3f900000    # 1.125f

    invoke-static {v0, v3, v4, v3}, Lt;->a(FFFF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 807
    :pswitch_1
    invoke-static {v3, v5, v3, v4}, Lt;->a(FFFF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 809
    :pswitch_2
    invoke-static {v5, v3, v4, v3}, Lt;->a(FFFF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 811
    :pswitch_3
    const v0, 0x3f89999a    # 1.075f

    invoke-static {v3, v0, v3, v4}, Lt;->a(FFFF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 813
    :pswitch_4
    invoke-static {v4, v3}, Lt;->a(FF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 815
    :pswitch_5
    invoke-static {v3, v4}, Lt;->a(FF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    :cond_7
    move-object v0, v1

    .line 835
    goto :goto_0

    .line 4106
    nop

    :sswitch_data_0
    .sparse-switch
        0x1001 -> :sswitch_0
        0x1003 -> :sswitch_2
        0x2002 -> :sswitch_1
    .end sparse-switch

    .line 803
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private a(Landroid/os/Bundle;Ljava/lang/String;)Lj;
    .locals 5

    .prologue
    const/4 v0, -0x1

    .line 583
    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 584
    if-ne v1, v0, :cond_1

    .line 585
    const/4 v0, 0x0

    .line 596
    :cond_0
    :goto_0
    return-object v0

    .line 587
    :cond_1
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    .line 588
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment no longer exists for key "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": index "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lt;->a(Ljava/lang/RuntimeException;)V

    .line 591
    :cond_2
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 592
    if-nez v0, :cond_0

    .line 593
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Fragment no longer exists for key "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": index "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v2}, Lt;->a(Ljava/lang/RuntimeException;)V

    goto :goto_0
.end method

.method private a(ILc;)V
    .locals 3

    .prologue
    .line 1433
    monitor-enter p0

    .line 1434
    :try_start_0
    iget-object v0, p0, Lt;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 1435
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt;->e:Ljava/util/ArrayList;

    .line 1437
    :cond_0
    iget-object v0, p0, Lt;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 1438
    if-ge p1, v0, :cond_1

    .line 1440
    iget-object v0, p0, Lt;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1454
    :goto_0
    monitor-exit p0

    return-void

    .line 1442
    :cond_1
    :goto_1
    if-ge v0, p1, :cond_3

    .line 1443
    iget-object v1, p0, Lt;->e:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1444
    iget-object v1, p0, Lt;->f:Ljava/util/ArrayList;

    if-nez v1, :cond_2

    .line 1445
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lt;->f:Ljava/util/ArrayList;

    .line 1448
    :cond_2
    iget-object v1, p0, Lt;->f:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1449
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1452
    :cond_3
    iget-object v0, p0, Lt;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1454
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private a(Ljava/lang/RuntimeException;)V
    .locals 5

    .prologue
    .line 463
    const-string v0, "FragmentManager"

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 464
    const-string v0, "FragmentManager"

    const-string v1, "Activity state:"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 465
    new-instance v0, Leg;

    const-string v1, "FragmentManager"

    invoke-direct {v0, v1}, Leg;-><init>(Ljava/lang/String;)V

    .line 466
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 467
    iget-object v0, p0, Lt;->h:Lm;

    if-eqz v0, :cond_0

    .line 469
    :try_start_0
    iget-object v0, p0, Lt;->h:Lm;

    const-string v2, "  "

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v1, v4}, Lm;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 480
    :goto_0
    throw p1

    .line 470
    :catch_0
    move-exception v0

    .line 471
    const-string v1, "FragmentManager"

    const-string v2, "Failed dumping state"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 475
    :cond_0
    :try_start_1
    const-string v0, "  "

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {p0, v0, v2, v1, v3}, Lt;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 476
    :catch_1
    move-exception v0

    .line 477
    const-string v1, "FragmentManager"

    const-string v2, "Failed dumping state"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static b(I)I
    .locals 1

    .prologue
    .line 2081
    const/4 v0, 0x0

    .line 2082
    sparse-switch p0, :sswitch_data_0

    .line 2093
    :goto_0
    return v0

    .line 2084
    :sswitch_0
    const/16 v0, 0x2002

    .line 2085
    goto :goto_0

    .line 2087
    :sswitch_1
    const/16 v0, 0x1001

    .line 2088
    goto :goto_0

    .line 2090
    :sswitch_2
    const/16 v0, 0x1003

    goto :goto_0

    .line 2082
    :sswitch_data_0
    .sparse-switch
        0x1001 -> :sswitch_0
        0x1003 -> :sswitch_2
        0x2002 -> :sswitch_1
    .end sparse-switch
.end method

.method private b(Lj;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 1116
    iget v2, p0, Lt;->g:I

    move-object v0, p0

    move-object v1, p1

    move v4, v3

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Lt;->a(Lj;IIIZ)V

    .line 1117
    return-void
.end method

.method private c(Lj;)V
    .locals 2

    .prologue
    .line 1633
    iget-object v0, p1, Lj;->O:Landroid/view/View;

    if-nez v0, :cond_1

    .line 1646
    :cond_0
    :goto_0
    return-void

    .line 1636
    :cond_1
    iget-object v0, p0, Lt;->w:Landroid/util/SparseArray;

    if-nez v0, :cond_2

    .line 1637
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lt;->w:Landroid/util/SparseArray;

    .line 1641
    :goto_1
    iget-object v0, p1, Lj;->O:Landroid/view/View;

    iget-object v1, p0, Lt;->w:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 1642
    iget-object v0, p0, Lt;->w:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1643
    iget-object v0, p0, Lt;->w:Landroid/util/SparseArray;

    iput-object v0, p1, Lj;->j:Landroid/util/SparseArray;

    .line 1644
    const/4 v0, 0x0

    iput-object v0, p0, Lt;->w:Landroid/util/SparseArray;

    goto :goto_0

    .line 1639
    :cond_2
    iget-object v0, p0, Lt;->w:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    goto :goto_1
.end method

.method private r()V
    .locals 3

    .prologue
    .line 1376
    iget-boolean v0, p0, Lt;->j:Z

    if-eqz v0, :cond_0

    .line 1377
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not perform this action after onSaveInstanceState"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1380
    :cond_0
    iget-object v0, p0, Lt;->k:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1381
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can not perform this action inside of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lt;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1384
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lc;)I
    .locals 2

    .prologue
    .line 1413
    monitor-enter p0

    .line 1414
    :try_start_0
    iget-object v0, p0, Lt;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 1415
    :cond_0
    iget-object v0, p0, Lt;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 1416
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt;->e:Ljava/util/ArrayList;

    .line 1418
    :cond_1
    iget-object v0, p0, Lt;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 1420
    iget-object v1, p0, Lt;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1421
    monitor-exit p0

    .line 1427
    :goto_0
    return v0

    .line 1424
    :cond_2
    iget-object v0, p0, Lt;->f:Ljava/util/ArrayList;

    iget-object v1, p0, Lt;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1426
    iget-object v1, p0, Lt;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1427
    monitor-exit p0

    goto :goto_0

    .line 1429
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a()Laf;
    .locals 1

    .prologue
    .line 485
    new-instance v0, Lc;

    invoke-direct {v0, p0}, Lc;-><init>(Lt;)V

    return-object v0
.end method

.method public final a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v5, -0x1

    const/4 v2, 0x1

    .line 2122
    const-string v0, "fragment"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, v4

    .line 2209
    :goto_0
    return-object v0

    .line 2126
    :cond_0
    const-string v0, "class"

    invoke-interface {p4, v4, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2127
    sget-object v1, Lz;->a:[I

    invoke-virtual {p3, p4, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 2128
    if-nez v0, :cond_f

    .line 2129
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    .line 2131
    :goto_1
    invoke-virtual {v1, v2, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    .line 2132
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 2133
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 2135
    iget-object v0, p0, Lt;->h:Lm;

    invoke-static {v0, v6}, Lj;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, v4

    .line 2138
    goto :goto_0

    .line 2141
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 2142
    :goto_2
    if-ne v1, v5, :cond_3

    if-ne v7, v5, :cond_3

    if-nez v8, :cond_3

    .line 2143
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move v1, v3

    .line 2141
    goto :goto_2

    .line 2150
    :cond_3
    if-eq v7, v5, :cond_6

    invoke-virtual {p0, v7}, Lt;->a(I)Lj;

    move-result-object v0

    .line 2151
    :goto_3
    if-nez v0, :cond_4

    if-eqz v8, :cond_4

    .line 2152
    invoke-virtual {p0, v8}, Lt;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    .line 2154
    :cond_4
    if-nez v0, :cond_5

    if-eq v1, v5, :cond_5

    .line 2155
    invoke-virtual {p0, v1}, Lt;->a(I)Lj;

    move-result-object v0

    .line 2161
    :cond_5
    if-nez v0, :cond_8

    .line 2162
    invoke-static {p3, v6}, Lj;->a(Landroid/content/Context;Ljava/lang/String;)Lj;

    move-result-object v4

    .line 2163
    iput-boolean v2, v4, Lj;->t:Z

    .line 2164
    if-eqz v7, :cond_7

    move v0, v7

    :goto_4
    iput v0, v4, Lj;->B:I

    .line 2165
    iput v1, v4, Lj;->C:I

    .line 2166
    iput-object v8, v4, Lj;->D:Ljava/lang/String;

    .line 2167
    iput-boolean v2, v4, Lj;->u:Z

    .line 2168
    iput-object p0, v4, Lj;->x:Lt;

    .line 2169
    iget-object v0, v4, Lj;->i:Landroid/os/Bundle;

    .line 15983
    iput-boolean v2, v4, Lj;->K:Z

    .line 2170
    invoke-virtual {p0, v4, v2}, Lt;->a(Lj;Z)V

    move-object v1, v4

    .line 2193
    :goto_5
    iget v0, p0, Lt;->g:I

    if-gtz v0, :cond_b

    iget-boolean v0, v1, Lj;->t:Z

    if-eqz v0, :cond_b

    move-object v0, p0

    move v4, v3

    move v5, v3

    .line 2194
    invoke-virtual/range {v0 .. v5}, Lt;->a(Lj;IIIZ)V

    .line 2199
    :goto_6
    iget-object v0, v1, Lj;->N:Landroid/view/View;

    if-nez v0, :cond_c

    .line 2200
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not create a view."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    move-object v0, v4

    .line 2150
    goto :goto_3

    :cond_7
    move v0, v1

    .line 2164
    goto :goto_4

    .line 2172
    :cond_8
    iget-boolean v4, v0, Lj;->u:Z

    if-eqz v4, :cond_9

    .line 2175
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": Duplicate id 0x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", tag "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", or parent id 0x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " with another fragment for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2182
    :cond_9
    iput-boolean v2, v0, Lj;->u:Z

    .line 2186
    iget-boolean v1, v0, Lj;->H:Z

    if-nez v1, :cond_a

    .line 2187
    iget-object v1, v0, Lj;->i:Landroid/os/Bundle;

    .line 16983
    iput-boolean v2, v0, Lj;->K:Z

    :cond_a
    move-object v1, v0

    goto/16 :goto_5

    .line 2196
    :cond_b
    invoke-direct {p0, v1}, Lt;->b(Lj;)V

    goto :goto_6

    .line 2203
    :cond_c
    if-eqz v7, :cond_d

    .line 2204
    iget-object v0, v1, Lj;->N:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setId(I)V

    .line 2206
    :cond_d
    iget-object v0, v1, Lj;->N:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_e

    .line 2207
    iget-object v0, v1, Lj;->N:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 2209
    :cond_e
    iget-object v0, v1, Lj;->N:Landroid/view/View;

    goto/16 :goto_0

    :cond_f
    move-object v6, v0

    goto/16 :goto_1
.end method

.method public final a(I)Lj;
    .locals 3

    .prologue
    .line 1320
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 1322
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_2

    .line 1323
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1324
    if-eqz v0, :cond_1

    iget v2, v0, Lj;->B:I

    if-ne v2, p1, :cond_1

    .line 1338
    :cond_0
    :goto_1
    return-object v0

    .line 1322
    :cond_1
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 1329
    :cond_2
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 1331
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_4

    .line 1332
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1333
    if-eqz v0, :cond_3

    iget v2, v0, Lj;->B:I

    if-eq v2, p1, :cond_0

    .line 1331
    :cond_3
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 1338
    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;)Lj;
    .locals 3

    .prologue
    .line 1342
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    .line 1344
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_2

    .line 1345
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1346
    if-eqz v0, :cond_1

    iget-object v2, v0, Lj;->D:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1360
    :cond_0
    :goto_1
    return-object v0

    .line 1344
    :cond_1
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 1351
    :cond_2
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    .line 1353
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_4

    .line 1354
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1355
    if-eqz v0, :cond_3

    iget-object v2, v0, Lj;->D:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1353
    :cond_3
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 1360
    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final a(II)V
    .locals 3

    .prologue
    .line 527
    if-gez p1, :cond_0

    .line 528
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad id: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 530
    :cond_0
    new-instance v0, Lx;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lx;-><init>(Lt;II)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lt;->a(Ljava/lang/Runnable;Z)V

    .line 535
    return-void
.end method

.method final a(IIIZ)V
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 1124
    iget-object v0, p0, Lt;->h:Lm;

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 1125
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No activity"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1128
    :cond_0
    if-nez p4, :cond_2

    iget v0, p0, Lt;->g:I

    if-ne v0, p1, :cond_2

    .line 1154
    :cond_1
    :goto_0
    return-void

    .line 1132
    :cond_2
    iput p1, p0, Lt;->g:I

    .line 1133
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    move v6, v5

    move v7, v5

    .line 1135
    :goto_1
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 1136
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj;

    .line 1137
    if-eqz v1, :cond_5

    move-object v0, p0

    move v2, p1

    move v3, p2

    move v4, p3

    .line 1138
    invoke-virtual/range {v0 .. v5}, Lt;->a(Lj;IIIZ)V

    .line 1139
    iget-object v0, v1, Lj;->R:Lar;

    if-eqz v0, :cond_5

    .line 1140
    iget-object v0, v1, Lj;->R:Lar;

    invoke-virtual {v0}, Lar;->a()Z

    move-result v0

    or-int/2addr v7, v0

    move v1, v7

    .line 1135
    :goto_2
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    move v7, v1

    goto :goto_1

    .line 1145
    :cond_3
    if-nez v7, :cond_4

    .line 1146
    invoke-virtual {p0}, Lt;->g()V

    .line 1149
    :cond_4
    iget-boolean v0, p0, Lt;->s:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt;->h:Lm;

    if-eqz v0, :cond_1

    iget v0, p0, Lt;->g:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 1150
    iget-object v0, p0, Lt;->h:Lm;

    invoke-virtual {v0}, Lm;->a_()V

    .line 1151
    iput-boolean v5, p0, Lt;->s:Z

    goto :goto_0

    :cond_5
    move v1, v7

    goto :goto_2
.end method

.method final a(IZ)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 1120
    invoke-virtual {p0, p1, v0, v0, v0}, Lt;->a(IIIZ)V

    .line 1121
    return-void
.end method

.method public final a(Landroid/content/res/Configuration;)V
    .locals 3

    .prologue
    .line 1973
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 1974
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 1975
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1976
    if-eqz v0, :cond_0

    .line 15844
    invoke-virtual {v0, p1}, Lj;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 15845
    iget-object v2, v0, Lj;->z:Lt;

    if-eqz v2, :cond_0

    .line 15846
    iget-object v0, v0, Lj;->z:Lt;

    invoke-virtual {v0, p1}, Lt;->a(Landroid/content/res/Configuration;)V

    .line 1974
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1981
    :cond_1
    return-void
.end method

.method final a(Landroid/os/Parcelable;Ljava/util/ArrayList;)V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    const/4 v2, 0x0

    .line 1800
    if-nez p1, :cond_1

    .line 1908
    :cond_0
    :goto_0
    return-void

    .line 1801
    :cond_1
    check-cast p1, Laa;

    .line 1802
    iget-object v0, p1, Laa;->a:[Lad;

    if-eqz v0, :cond_0

    .line 1806
    if-eqz p2, :cond_3

    move v1, v2

    .line 1807
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 1808
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1810
    iget-object v3, p1, Laa;->a:[Lad;

    iget v4, v0, Lj;->k:I

    aget-object v3, v3, v4

    .line 1811
    iput-object v0, v3, Lad;->k:Lj;

    .line 1812
    iput-object v7, v0, Lj;->j:Landroid/util/SparseArray;

    .line 1813
    iput v2, v0, Lj;->w:I

    .line 1814
    iput-boolean v2, v0, Lj;->u:Z

    .line 1815
    iput-boolean v2, v0, Lj;->q:Z

    .line 1816
    iput-object v7, v0, Lj;->n:Lj;

    .line 1817
    iget-object v4, v3, Lad;->j:Landroid/os/Bundle;

    if-eqz v4, :cond_2

    .line 1818
    iget-object v4, v3, Lad;->j:Landroid/os/Bundle;

    iget-object v5, p0, Lt;->h:Lm;

    invoke-virtual {v5}, Lm;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 1819
    iget-object v4, v3, Lad;->j:Landroid/os/Bundle;

    const-string v5, "android:view_state"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v4

    iput-object v4, v0, Lj;->j:Landroid/util/SparseArray;

    .line 1821
    iget-object v3, v3, Lad;->j:Landroid/os/Bundle;

    iput-object v3, v0, Lj;->i:Landroid/os/Bundle;

    .line 1807
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 1828
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Laa;->a:[Lad;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    .line 1829
    iget-object v0, p0, Lt;->p:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 1830
    iget-object v0, p0, Lt;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_4
    move v0, v2

    .line 1832
    :goto_2
    iget-object v1, p1, Laa;->a:[Lad;

    array-length v1, v1

    if-ge v0, v1, :cond_a

    .line 1833
    iget-object v1, p1, Laa;->a:[Lad;

    aget-object v3, v1, v0

    .line 1834
    if-eqz v3, :cond_8

    .line 1835
    iget-object v1, p0, Lt;->h:Lm;

    iget-object v4, p0, Lt;->r:Lj;

    .line 15094
    iget-object v5, v3, Lad;->k:Lj;

    if-eqz v5, :cond_5

    .line 15095
    iget-object v1, v3, Lad;->k:Lj;

    .line 1837
    :goto_3
    iget-object v4, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1841
    iput-object v7, v3, Lad;->k:Lj;

    .line 1832
    :goto_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 15098
    :cond_5
    iget-object v5, v3, Lad;->i:Landroid/os/Bundle;

    if-eqz v5, :cond_6

    .line 15099
    iget-object v5, v3, Lad;->i:Landroid/os/Bundle;

    invoke-virtual {v1}, Lm;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 15102
    :cond_6
    iget-object v5, v3, Lad;->a:Ljava/lang/String;

    iget-object v6, v3, Lad;->i:Landroid/os/Bundle;

    invoke-static {v1, v5, v6}, Lj;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lj;

    move-result-object v5

    iput-object v5, v3, Lad;->k:Lj;

    .line 15104
    iget-object v5, v3, Lad;->j:Landroid/os/Bundle;

    if-eqz v5, :cond_7

    .line 15105
    iget-object v5, v3, Lad;->j:Landroid/os/Bundle;

    invoke-virtual {v1}, Lm;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 15106
    iget-object v5, v3, Lad;->k:Lj;

    iget-object v6, v3, Lad;->j:Landroid/os/Bundle;

    iput-object v6, v5, Lj;->i:Landroid/os/Bundle;

    .line 15108
    :cond_7
    iget-object v5, v3, Lad;->k:Lj;

    iget v6, v3, Lad;->b:I

    invoke-virtual {v5, v6, v4}, Lj;->a(ILj;)V

    .line 15109
    iget-object v4, v3, Lad;->k:Lj;

    iget-boolean v5, v3, Lad;->c:Z

    iput-boolean v5, v4, Lj;->t:Z

    .line 15110
    iget-object v4, v3, Lad;->k:Lj;

    iput-boolean v8, v4, Lj;->v:Z

    .line 15111
    iget-object v4, v3, Lad;->k:Lj;

    iget v5, v3, Lad;->d:I

    iput v5, v4, Lj;->B:I

    .line 15112
    iget-object v4, v3, Lad;->k:Lj;

    iget v5, v3, Lad;->e:I

    iput v5, v4, Lj;->C:I

    .line 15113
    iget-object v4, v3, Lad;->k:Lj;

    iget-object v5, v3, Lad;->f:Ljava/lang/String;

    iput-object v5, v4, Lj;->D:Ljava/lang/String;

    .line 15114
    iget-object v4, v3, Lad;->k:Lj;

    iget-boolean v5, v3, Lad;->g:Z

    iput-boolean v5, v4, Lj;->G:Z

    .line 15115
    iget-object v4, v3, Lad;->k:Lj;

    iget-boolean v5, v3, Lad;->h:Z

    iput-boolean v5, v4, Lj;->F:Z

    .line 15116
    iget-object v4, v3, Lad;->k:Lj;

    iget-object v1, v1, Lm;->b:Lt;

    iput-object v1, v4, Lj;->x:Lt;

    .line 15118
    sget-boolean v1, Lt;->a:Z

    .line 15121
    iget-object v1, v3, Lad;->k:Lj;

    goto :goto_3

    .line 1843
    :cond_8
    iget-object v1, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1844
    iget-object v1, p0, Lt;->p:Ljava/util/ArrayList;

    if-nez v1, :cond_9

    .line 1845
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lt;->p:Ljava/util/ArrayList;

    .line 1848
    :cond_9
    iget-object v1, p0, Lt;->p:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 1853
    :cond_a
    if-eqz p2, :cond_d

    move v3, v2

    .line 1854
    :goto_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_d

    .line 1855
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1856
    iget v1, v0, Lj;->o:I

    if-ltz v1, :cond_b

    .line 1857
    iget v1, v0, Lj;->o:I

    iget-object v4, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_c

    .line 1858
    iget-object v1, p0, Lt;->b:Ljava/util/ArrayList;

    iget v4, v0, Lj;->o:I

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj;

    iput-object v1, v0, Lj;->n:Lj;

    .line 1854
    :cond_b
    :goto_6
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_5

    .line 1860
    :cond_c
    const-string v1, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Re-attaching retained fragment "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " target no longer exists: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, v0, Lj;->o:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1862
    iput-object v7, v0, Lj;->n:Lj;

    goto :goto_6

    .line 1869
    :cond_d
    iget-object v0, p1, Laa;->b:[I

    if-eqz v0, :cond_10

    .line 1870
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Laa;->b:[I

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    move v1, v2

    .line 1871
    :goto_7
    iget-object v0, p1, Laa;->b:[I

    array-length v0, v0

    if-ge v1, v0, :cond_11

    .line 1872
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    iget-object v3, p1, Laa;->b:[I

    aget v3, v3, v1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1873
    if-nez v0, :cond_e

    .line 1874
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "No instantiated fragment for index #"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p1, Laa;->b:[I

    aget v5, v5, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v3}, Lt;->a(Ljava/lang/RuntimeException;)V

    .line 1877
    :cond_e
    iput-boolean v8, v0, Lj;->q:Z

    .line 1879
    iget-object v3, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 1880
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already added!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1882
    :cond_f
    iget-object v3, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1871
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_7

    .line 1885
    :cond_10
    iput-object v7, p0, Lt;->c:Ljava/util/ArrayList;

    .line 1889
    :cond_11
    iget-object v0, p1, Laa;->c:[Lg;

    if-eqz v0, :cond_13

    .line 1890
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Laa;->c:[Lg;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    .line 1891
    :goto_8
    iget-object v0, p1, Laa;->c:[Lg;

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 1892
    iget-object v0, p1, Laa;->c:[Lg;

    aget-object v0, v0, v2

    invoke-virtual {v0, p0}, Lg;->a(Lt;)Lc;

    move-result-object v0

    .line 1900
    iget-object v1, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1901
    iget v1, v0, Lc;->g:I

    if-ltz v1, :cond_12

    .line 1902
    iget v1, v0, Lc;->g:I

    invoke-direct {p0, v1, v0}, Lt;->a(ILc;)V

    .line 1891
    :cond_12
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 1906
    :cond_13
    iput-object v7, p0, Lt;->d:Ljava/util/ArrayList;

    goto/16 :goto_0
.end method

.method public final a(Lj;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 839
    iget-boolean v0, p1, Lj;->P:Z

    if-eqz v0, :cond_0

    .line 840
    iget-boolean v0, p0, Lt;->o:Z

    if-eqz v0, :cond_1

    .line 842
    const/4 v0, 0x1

    iput-boolean v0, p0, Lt;->u:Z

    .line 848
    :cond_0
    :goto_0
    return-void

    .line 845
    :cond_1
    iput-boolean v3, p1, Lj;->P:Z

    .line 846
    iget v2, p0, Lt;->g:I

    move-object v0, p0

    move-object v1, p1

    move v4, v3

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Lt;->a(Lj;IIIZ)V

    goto :goto_0
.end method

.method public final a(Lj;II)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v5, 0x0

    .line 1225
    .line 11487
    iget v0, p1, Lj;->w:I

    if-lez v0, :cond_4

    move v0, v1

    .line 1225
    :goto_0
    if-nez v0, :cond_5

    move v0, v1

    .line 1226
    :goto_1
    iget-boolean v2, p1, Lj;->F:Z

    if-eqz v2, :cond_0

    if-eqz v0, :cond_3

    .line 1227
    :cond_0
    iget-object v2, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v2, :cond_1

    .line 1228
    iget-object v2, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1230
    :cond_1
    iget-boolean v2, p1, Lj;->I:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p1, Lj;->J:Z

    if-eqz v2, :cond_2

    .line 1231
    iput-boolean v1, p0, Lt;->s:Z

    .line 1233
    :cond_2
    iput-boolean v5, p1, Lj;->q:Z

    .line 1234
    iput-boolean v1, p1, Lj;->r:Z

    .line 1235
    if-eqz v0, :cond_6

    move v2, v5

    :goto_2
    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lt;->a(Lj;IIIZ)V

    .line 1238
    :cond_3
    return-void

    :cond_4
    move v0, v5

    .line 11487
    goto :goto_0

    :cond_5
    move v0, v5

    .line 1225
    goto :goto_1

    :cond_6
    move v2, v1

    .line 1235
    goto :goto_2
.end method

.method final a(Lj;IIIZ)V
    .locals 10

    .prologue
    const/4 v9, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    .line 853
    iget-boolean v0, p1, Lj;->q:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lj;->F:Z

    if-eqz v0, :cond_1

    :cond_0
    if-le p2, v5, :cond_1

    move p2, v5

    .line 856
    :cond_1
    iget-boolean v0, p1, Lj;->r:Z

    if-eqz v0, :cond_2

    iget v0, p1, Lj;->f:I

    if-le p2, v0, :cond_2

    .line 858
    iget p2, p1, Lj;->f:I

    .line 862
    :cond_2
    iget-boolean v0, p1, Lj;->P:Z

    if-eqz v0, :cond_3

    iget v0, p1, Lj;->f:I

    if-ge v0, v9, :cond_3

    if-le p2, v6, :cond_3

    move p2, v6

    .line 865
    :cond_3
    iget v0, p1, Lj;->f:I

    if-ge v0, p2, :cond_27

    .line 869
    iget-boolean v0, p1, Lj;->t:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p1, Lj;->u:Z

    if-nez v0, :cond_4

    .line 1113
    :goto_0
    return-void

    .line 872
    :cond_4
    iget-object v0, p1, Lj;->g:Landroid/view/View;

    if-eqz v0, :cond_5

    .line 877
    iput-object v7, p1, Lj;->g:Landroid/view/View;

    .line 878
    iget v2, p1, Lj;->h:I

    move-object v0, p0

    move-object v1, p1

    move v4, v3

    invoke-virtual/range {v0 .. v5}, Lt;->a(Lj;IIIZ)V

    .line 880
    :cond_5
    iget v0, p1, Lj;->f:I

    packed-switch v0, :pswitch_data_0

    .line 1112
    :cond_6
    :goto_1
    iput p2, p1, Lj;->f:I

    goto :goto_0

    .line 883
    :pswitch_0
    iget-object v0, p1, Lj;->i:Landroid/os/Bundle;

    if-eqz v0, :cond_8

    .line 884
    iget-object v0, p1, Lj;->i:Landroid/os/Bundle;

    iget-object v1, p0, Lt;->h:Lm;

    invoke-virtual {v1}, Lm;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 885
    iget-object v0, p1, Lj;->i:Landroid/os/Bundle;

    const-string v1, "android:view_state"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p1, Lj;->j:Landroid/util/SparseArray;

    .line 887
    iget-object v0, p1, Lj;->i:Landroid/os/Bundle;

    const-string v1, "android:target_state"

    invoke-direct {p0, v0, v1}, Lt;->a(Landroid/os/Bundle;Ljava/lang/String;)Lj;

    move-result-object v0

    iput-object v0, p1, Lj;->n:Lj;

    .line 889
    iget-object v0, p1, Lj;->n:Lj;

    if-eqz v0, :cond_7

    .line 890
    iget-object v0, p1, Lj;->i:Landroid/os/Bundle;

    const-string v1, "android:target_req_state"

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p1, Lj;->p:I

    .line 893
    :cond_7
    iget-object v0, p1, Lj;->i:Landroid/os/Bundle;

    const-string v1, "android:user_visible_hint"

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p1, Lj;->Q:Z

    .line 895
    iget-boolean v0, p1, Lj;->Q:Z

    if-nez v0, :cond_8

    .line 896
    iput-boolean v5, p1, Lj;->P:Z

    .line 897
    if-le p2, v6, :cond_8

    move p2, v6

    .line 902
    :cond_8
    iget-object v0, p0, Lt;->h:Lm;

    iput-object v0, p1, Lj;->y:Lm;

    .line 903
    iget-object v0, p0, Lt;->r:Lj;

    iput-object v0, p1, Lj;->A:Lj;

    .line 904
    iget-object v0, p0, Lt;->r:Lj;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lt;->r:Lj;

    iget-object v0, v0, Lj;->z:Lt;

    :goto_2
    iput-object v0, p1, Lj;->x:Lt;

    .line 906
    iput-boolean v3, p1, Lj;->K:Z

    .line 907
    iget-object v0, p0, Lt;->h:Lm;

    invoke-virtual {p1, v0}, Lj;->a(Landroid/app/Activity;)V

    .line 908
    iget-boolean v0, p1, Lj;->K:Z

    if-nez v0, :cond_a

    .line 909
    new-instance v0, Lay;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onAttach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay;-><init>(Ljava/lang/String;)V

    throw v0

    .line 904
    :cond_9
    iget-object v0, p0, Lt;->h:Lm;

    iget-object v0, v0, Lm;->b:Lt;

    goto :goto_2

    .line 912
    :cond_a
    iget-object v0, p1, Lj;->A:Lj;

    .line 916
    iget-boolean v0, p1, Lj;->H:Z

    if-nez v0, :cond_e

    .line 917
    iget-object v0, p1, Lj;->i:Landroid/os/Bundle;

    .line 4762
    iget-object v1, p1, Lj;->z:Lt;

    if-eqz v1, :cond_b

    .line 4763
    iget-object v1, p1, Lj;->z:Lt;

    .line 4919
    iput-boolean v3, v1, Lt;->j:Z

    .line 4765
    :cond_b
    iput-boolean v3, p1, Lj;->K:Z

    .line 4766
    invoke-virtual {p1, v0}, Lj;->a(Landroid/os/Bundle;)V

    .line 4767
    iget-boolean v1, p1, Lj;->K:Z

    if-nez v1, :cond_c

    .line 4768
    new-instance v0, Lay;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onCreate()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4771
    :cond_c
    if-eqz v0, :cond_e

    .line 4772
    const-string v1, "android:support:fragments"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    .line 4774
    if-eqz v0, :cond_e

    .line 4775
    iget-object v1, p1, Lj;->z:Lt;

    if-nez v1, :cond_d

    .line 4776
    invoke-virtual {p1}, Lj;->n()V

    .line 4778
    :cond_d
    iget-object v1, p1, Lj;->z:Lt;

    invoke-virtual {v1, v0, v7}, Lt;->a(Landroid/os/Parcelable;Ljava/util/ArrayList;)V

    .line 4779
    iget-object v0, p1, Lj;->z:Lt;

    invoke-virtual {v0}, Lt;->j()V

    .line 919
    :cond_e
    iput-boolean v3, p1, Lj;->H:Z

    .line 920
    iget-boolean v0, p1, Lj;->t:Z

    if-eqz v0, :cond_10

    .line 924
    iget-object v0, p1, Lj;->i:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Lj;->b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p1, Lj;->i:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v7, v1}, Lj;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Lj;->N:Landroid/view/View;

    .line 926
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    if-eqz v0, :cond_18

    .line 927
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    iput-object v0, p1, Lj;->O:Landroid/view/View;

    .line 928
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_17

    .line 929
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    invoke-static {v0, v3}, Lgt;->a(Landroid/view/View;Z)V

    .line 933
    :goto_3
    iget-boolean v0, p1, Lj;->E:Z

    if-eqz v0, :cond_f

    iget-object v0, p1, Lj;->N:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 934
    :cond_f
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    iget-object v1, p1, Lj;->i:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Lj;->a(Landroid/view/View;Landroid/os/Bundle;)V

    .line 940
    :cond_10
    :goto_4
    :pswitch_1
    if-le p2, v5, :cond_1f

    .line 942
    iget-boolean v0, p1, Lj;->t:Z

    if-nez v0, :cond_15

    .line 944
    iget v0, p1, Lj;->C:I

    if-eqz v0, :cond_3d

    .line 945
    iget-object v0, p0, Lt;->i:Lq;

    iget v1, p1, Lj;->C:I

    invoke-interface {v0, v1}, Lq;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 946
    if-nez v0, :cond_11

    iget-boolean v1, p1, Lj;->v:Z

    if-nez v1, :cond_11

    .line 947
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "No view found for id 0x"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p1, Lj;->C:I

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " ("

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lj;->e()Landroid/content/res/Resources;

    move-result-object v4

    iget v8, p1, Lj;->C:I

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ") for fragment "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lt;->a(Ljava/lang/RuntimeException;)V

    .line 954
    :cond_11
    :goto_5
    iput-object v0, p1, Lj;->M:Landroid/view/ViewGroup;

    .line 955
    iget-object v1, p1, Lj;->i:Landroid/os/Bundle;

    invoke-virtual {p1, v1}, Lj;->b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v1

    iget-object v2, p1, Lj;->i:Landroid/os/Bundle;

    invoke-virtual {p1, v1, v0, v2}, Lj;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v1

    iput-object v1, p1, Lj;->N:Landroid/view/View;

    .line 957
    iget-object v1, p1, Lj;->N:Landroid/view/View;

    if-eqz v1, :cond_1a

    .line 958
    iget-object v1, p1, Lj;->N:Landroid/view/View;

    iput-object v1, p1, Lj;->O:Landroid/view/View;

    .line 959
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_19

    .line 960
    iget-object v1, p1, Lj;->N:Landroid/view/View;

    invoke-static {v1, v3}, Lgt;->a(Landroid/view/View;Z)V

    .line 964
    :goto_6
    if-eqz v0, :cond_13

    .line 965
    invoke-direct {p0, p1, p3, v5, p4}, Lt;->a(Lj;IZI)Landroid/view/animation/Animation;

    move-result-object v1

    .line 967
    if-eqz v1, :cond_12

    .line 968
    iget-object v2, p1, Lj;->N:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 970
    :cond_12
    iget-object v1, p1, Lj;->N:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 972
    :cond_13
    iget-boolean v0, p1, Lj;->E:Z

    if-eqz v0, :cond_14

    iget-object v0, p1, Lj;->N:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 973
    :cond_14
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    iget-object v1, p1, Lj;->i:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Lj;->a(Landroid/view/View;Landroid/os/Bundle;)V

    .line 979
    :cond_15
    :goto_7
    iget-object v0, p1, Lj;->i:Landroid/os/Bundle;

    .line 5793
    iget-object v1, p1, Lj;->z:Lt;

    if-eqz v1, :cond_16

    .line 5794
    iget-object v1, p1, Lj;->z:Lt;

    .line 5919
    iput-boolean v3, v1, Lt;->j:Z

    .line 5796
    :cond_16
    iput-boolean v3, p1, Lj;->K:Z

    .line 5797
    invoke-virtual {p1, v0}, Lj;->d(Landroid/os/Bundle;)V

    .line 5798
    iget-boolean v0, p1, Lj;->K:Z

    if-nez v0, :cond_1b

    .line 5799
    new-instance v0, Lay;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onActivityCreated()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay;-><init>(Ljava/lang/String;)V

    throw v0

    .line 931
    :cond_17
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    invoke-static {v0}, Law;->a(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p1, Lj;->N:Landroid/view/View;

    goto/16 :goto_3

    .line 936
    :cond_18
    iput-object v7, p1, Lj;->O:Landroid/view/View;

    goto/16 :goto_4

    .line 962
    :cond_19
    iget-object v1, p1, Lj;->N:Landroid/view/View;

    invoke-static {v1}, Law;->a(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v1

    iput-object v1, p1, Lj;->N:Landroid/view/View;

    goto :goto_6

    .line 975
    :cond_1a
    iput-object v7, p1, Lj;->O:Landroid/view/View;

    goto :goto_7

    .line 5802
    :cond_1b
    iget-object v0, p1, Lj;->z:Lt;

    if-eqz v0, :cond_1c

    .line 5803
    iget-object v0, p1, Lj;->z:Lt;

    invoke-virtual {v0}, Lt;->k()V

    .line 980
    :cond_1c
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    if-eqz v0, :cond_1e

    .line 981
    iget-object v0, p1, Lj;->i:Landroid/os/Bundle;

    .line 6465
    iget-object v0, p1, Lj;->j:Landroid/util/SparseArray;

    if-eqz v0, :cond_1d

    .line 6466
    iget-object v0, p1, Lj;->O:Landroid/view/View;

    iget-object v1, p1, Lj;->j:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 6467
    iput-object v7, p1, Lj;->j:Landroid/util/SparseArray;

    .line 6469
    :cond_1d
    iput-boolean v3, p1, Lj;->K:Z

    .line 7097
    iput-boolean v5, p1, Lj;->K:Z

    .line 6471
    iget-boolean v0, p1, Lj;->K:Z

    if-nez v0, :cond_1e

    .line 6472
    new-instance v0, Lay;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay;-><init>(Ljava/lang/String;)V

    throw v0

    .line 983
    :cond_1e
    iput-object v7, p1, Lj;->i:Landroid/os/Bundle;

    .line 987
    :cond_1f
    :pswitch_2
    if-le p2, v6, :cond_23

    .line 7808
    iget-object v0, p1, Lj;->z:Lt;

    if-eqz v0, :cond_20

    .line 7809
    iget-object v0, p1, Lj;->z:Lt;

    .line 7919
    iput-boolean v3, v0, Lt;->j:Z

    .line 7810
    iget-object v0, p1, Lj;->z:Lt;

    invoke-virtual {v0}, Lt;->h()Z

    .line 7812
    :cond_20
    iput-boolean v3, p1, Lj;->K:Z

    .line 7813
    invoke-virtual {p1}, Lj;->g_()V

    .line 7814
    iget-boolean v0, p1, Lj;->K:Z

    if-nez v0, :cond_21

    .line 7815
    new-instance v0, Lay;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onStart()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7818
    :cond_21
    iget-object v0, p1, Lj;->z:Lt;

    if-eqz v0, :cond_22

    .line 7819
    iget-object v0, p1, Lj;->z:Lt;

    invoke-virtual {v0}, Lt;->l()V

    .line 7821
    :cond_22
    iget-object v0, p1, Lj;->R:Lar;

    if-eqz v0, :cond_23

    .line 7822
    iget-object v0, p1, Lj;->R:Lar;

    invoke-virtual {v0}, Lar;->f()V

    .line 992
    :cond_23
    :pswitch_3
    if-le p2, v9, :cond_6

    .line 994
    iput-boolean v5, p1, Lj;->s:Z

    .line 8827
    iget-object v0, p1, Lj;->z:Lt;

    if-eqz v0, :cond_24

    .line 8828
    iget-object v0, p1, Lj;->z:Lt;

    .line 8919
    iput-boolean v3, v0, Lt;->j:Z

    .line 8829
    iget-object v0, p1, Lj;->z:Lt;

    invoke-virtual {v0}, Lt;->h()Z

    .line 8831
    :cond_24
    iput-boolean v3, p1, Lj;->K:Z

    .line 8832
    invoke-virtual {p1}, Lj;->j()V

    .line 8833
    iget-boolean v0, p1, Lj;->K:Z

    if-nez v0, :cond_25

    .line 8834
    new-instance v0, Lay;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onResume()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8837
    :cond_25
    iget-object v0, p1, Lj;->z:Lt;

    if-eqz v0, :cond_26

    .line 8838
    iget-object v0, p1, Lj;->z:Lt;

    invoke-virtual {v0}, Lt;->m()V

    .line 8839
    iget-object v0, p1, Lj;->z:Lt;

    invoke-virtual {v0}, Lt;->h()Z

    .line 996
    :cond_26
    iput-object v7, p1, Lj;->i:Landroid/os/Bundle;

    .line 997
    iput-object v7, p1, Lj;->j:Landroid/util/SparseArray;

    goto/16 :goto_1

    .line 1000
    :cond_27
    iget v0, p1, Lj;->f:I

    if-le v0, p2, :cond_6

    .line 1001
    iget v0, p1, Lj;->f:I

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_1

    .line 1064
    :cond_28
    :goto_8
    :pswitch_4
    if-gtz p2, :cond_6

    .line 1065
    iget-boolean v0, p0, Lt;->t:Z

    if-eqz v0, :cond_29

    .line 1066
    iget-object v0, p1, Lj;->g:Landroid/view/View;

    if-eqz v0, :cond_29

    .line 1073
    iget-object v0, p1, Lj;->g:Landroid/view/View;

    .line 1074
    iput-object v7, p1, Lj;->g:Landroid/view/View;

    .line 1075
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 1078
    :cond_29
    iget-object v0, p1, Lj;->g:Landroid/view/View;

    if-eqz v0, :cond_36

    .line 1083
    iput p2, p1, Lj;->h:I

    move p2, v5

    .line 1084
    goto/16 :goto_1

    .line 1003
    :pswitch_5
    const/4 v0, 0x5

    if-ge p2, v0, :cond_2c

    .line 8946
    iget-object v0, p1, Lj;->z:Lt;

    if-eqz v0, :cond_2a

    .line 8947
    iget-object v0, p1, Lj;->z:Lt;

    invoke-virtual {v0}, Lt;->n()V

    .line 8949
    :cond_2a
    iput-boolean v3, p1, Lj;->K:Z

    .line 8950
    invoke-virtual {p1}, Lj;->k()V

    .line 8951
    iget-boolean v0, p1, Lj;->K:Z

    if-nez v0, :cond_2b

    .line 8952
    new-instance v0, Lay;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onPause()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1006
    :cond_2b
    iput-boolean v3, p1, Lj;->s:Z

    .line 1009
    :cond_2c
    :pswitch_6
    if-ge p2, v9, :cond_2e

    .line 8958
    iget-object v0, p1, Lj;->z:Lt;

    if-eqz v0, :cond_2d

    .line 8959
    iget-object v0, p1, Lj;->z:Lt;

    invoke-virtual {v0}, Lt;->o()V

    .line 8961
    :cond_2d
    iput-boolean v3, p1, Lj;->K:Z

    .line 8962
    invoke-virtual {p1}, Lj;->h_()V

    .line 8963
    iget-boolean v0, p1, Lj;->K:Z

    if-nez v0, :cond_2e

    .line 8964
    new-instance v0, Lay;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onStop()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1014
    :cond_2e
    :pswitch_7
    if-ge p2, v6, :cond_2f

    .line 1016
    invoke-virtual {p1}, Lj;->o()V

    .line 1019
    :cond_2f
    :pswitch_8
    const/4 v0, 0x2

    if-ge p2, v0, :cond_28

    .line 1021
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    if-eqz v0, :cond_30

    .line 1024
    iget-object v0, p0, Lt;->h:Lm;

    invoke-virtual {v0}, Lm;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_30

    iget-object v0, p1, Lj;->j:Landroid/util/SparseArray;

    if-nez v0, :cond_30

    .line 1025
    invoke-direct {p0, p1}, Lt;->c(Lj;)V

    .line 8990
    :cond_30
    iget-object v0, p1, Lj;->z:Lt;

    if-eqz v0, :cond_31

    .line 8991
    iget-object v0, p1, Lj;->z:Lt;

    .line 9960
    invoke-virtual {v0, v5, v3}, Lt;->a(IZ)V

    .line 8993
    :cond_31
    iput-boolean v3, p1, Lj;->K:Z

    .line 8994
    invoke-virtual {p1}, Lj;->d()V

    .line 8995
    iget-boolean v0, p1, Lj;->K:Z

    if-nez v0, :cond_32

    .line 8996
    new-instance v0, Lay;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8999
    :cond_32
    iget-object v0, p1, Lj;->R:Lar;

    if-eqz v0, :cond_33

    .line 9000
    iget-object v0, p1, Lj;->R:Lar;

    invoke-virtual {v0}, Lar;->e()V

    .line 1029
    :cond_33
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    if-eqz v0, :cond_35

    iget-object v0, p1, Lj;->M:Landroid/view/ViewGroup;

    if-eqz v0, :cond_35

    .line 1031
    iget v0, p0, Lt;->g:I

    if-lez v0, :cond_3c

    iget-boolean v0, p0, Lt;->t:Z

    if-nez v0, :cond_3c

    .line 1032
    invoke-direct {p0, p1, p3, v3, p4}, Lt;->a(Lj;IZI)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1035
    :goto_9
    if-eqz v0, :cond_34

    .line 1037
    iget-object v1, p1, Lj;->N:Landroid/view/View;

    iput-object v1, p1, Lj;->g:Landroid/view/View;

    .line 1038
    iput p2, p1, Lj;->h:I

    .line 1039
    new-instance v1, Ly;

    invoke-direct {v1, p0, p1}, Ly;-><init>(Lt;Lj;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1055
    iget-object v1, p1, Lj;->N:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1057
    :cond_34
    iget-object v0, p1, Lj;->M:Landroid/view/ViewGroup;

    iget-object v1, p1, Lj;->N:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1059
    :cond_35
    iput-object v7, p1, Lj;->M:Landroid/view/ViewGroup;

    .line 1060
    iput-object v7, p1, Lj;->N:Landroid/view/View;

    .line 1061
    iput-object v7, p1, Lj;->O:Landroid/view/View;

    goto/16 :goto_8

    .line 1087
    :cond_36
    iget-boolean v0, p1, Lj;->H:Z

    if-nez v0, :cond_38

    .line 10005
    iget-object v0, p1, Lj;->z:Lt;

    if-eqz v0, :cond_37

    .line 10006
    iget-object v0, p1, Lj;->z:Lt;

    invoke-virtual {v0}, Lt;->p()V

    .line 10008
    :cond_37
    iput-boolean v3, p1, Lj;->K:Z

    .line 10009
    invoke-virtual {p1}, Lj;->l()V

    .line 10010
    iget-boolean v0, p1, Lj;->K:Z

    if-nez v0, :cond_38

    .line 10011
    new-instance v0, Lay;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onDestroy()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1091
    :cond_38
    iput-boolean v3, p1, Lj;->K:Z

    .line 1092
    invoke-virtual {p1}, Lj;->a()V

    .line 1093
    iget-boolean v0, p1, Lj;->K:Z

    if-nez v0, :cond_39

    .line 1094
    new-instance v0, Lay;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onDetach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lay;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1097
    :cond_39
    if-nez p5, :cond_6

    .line 1098
    iget-boolean v0, p1, Lj;->H:Z

    if-nez v0, :cond_3b

    .line 10187
    iget v0, p1, Lj;->k:I

    if-ltz v0, :cond_6

    .line 10192
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    iget v1, p1, Lj;->k:I

    invoke-virtual {v0, v1, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10193
    iget-object v0, p0, Lt;->p:Ljava/util/ArrayList;

    if-nez v0, :cond_3a

    .line 10194
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt;->p:Ljava/util/ArrayList;

    .line 10196
    :cond_3a
    iget-object v0, p0, Lt;->p:Ljava/util/ArrayList;

    iget v1, p1, Lj;->k:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10197
    iget-object v0, p0, Lt;->h:Lm;

    iget-object v1, p1, Lj;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lm;->a(Ljava/lang/String;)V

    .line 10215
    const/4 v0, -0x1

    iput v0, p1, Lj;->k:I

    .line 10216
    iput-object v7, p1, Lj;->l:Ljava/lang/String;

    .line 10217
    iput-boolean v3, p1, Lj;->q:Z

    .line 10218
    iput-boolean v3, p1, Lj;->r:Z

    .line 10219
    iput-boolean v3, p1, Lj;->s:Z

    .line 10220
    iput-boolean v3, p1, Lj;->t:Z

    .line 10221
    iput-boolean v3, p1, Lj;->u:Z

    .line 10222
    iput-boolean v3, p1, Lj;->v:Z

    .line 10223
    iput v3, p1, Lj;->w:I

    .line 10224
    iput-object v7, p1, Lj;->x:Lt;

    .line 10225
    iput-object v7, p1, Lj;->z:Lt;

    .line 10226
    iput-object v7, p1, Lj;->y:Lm;

    .line 10227
    iput v3, p1, Lj;->B:I

    .line 10228
    iput v3, p1, Lj;->C:I

    .line 10229
    iput-object v7, p1, Lj;->D:Ljava/lang/String;

    .line 10230
    iput-boolean v3, p1, Lj;->E:Z

    .line 10231
    iput-boolean v3, p1, Lj;->F:Z

    .line 10232
    iput-boolean v3, p1, Lj;->H:Z

    .line 10233
    iput-object v7, p1, Lj;->R:Lar;

    .line 10234
    iput-boolean v3, p1, Lj;->S:Z

    .line 10235
    iput-boolean v3, p1, Lj;->T:Z

    goto/16 :goto_1

    .line 1101
    :cond_3b
    iput-object v7, p1, Lj;->y:Lm;

    .line 1102
    iput-object v7, p1, Lj;->A:Lj;

    .line 1103
    iput-object v7, p1, Lj;->x:Lt;

    .line 1104
    iput-object v7, p1, Lj;->z:Lt;

    goto/16 :goto_1

    :cond_3c
    move-object v0, v7

    goto/16 :goto_9

    :cond_3d
    move-object v0, v7

    goto/16 :goto_5

    .line 880
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 1001
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public final a(Lj;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1202
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 1203
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    .line 11168
    :cond_0
    iget v0, p1, Lj;->k:I

    if-gez v0, :cond_3

    .line 11172
    iget-object v0, p0, Lt;->p:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_4

    .line 11173
    :cond_1
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_2

    .line 11174
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    .line 11176
    :cond_2
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lt;->r:Lj;

    invoke-virtual {p1, v0, v1}, Lj;->a(ILj;)V

    .line 11177
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1207
    :cond_3
    :goto_0
    iget-boolean v0, p1, Lj;->F:Z

    if-nez v0, :cond_7

    .line 1208
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1209
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment already added: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11180
    :cond_4
    iget-object v0, p0, Lt;->p:Ljava/util/ArrayList;

    iget-object v1, p0, Lt;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lt;->r:Lj;

    invoke-virtual {p1, v0, v1}, Lj;->a(ILj;)V

    .line 11181
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    iget v1, p1, Lj;->k:I

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1211
    :cond_5
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1212
    iput-boolean v2, p1, Lj;->q:Z

    .line 1213
    const/4 v0, 0x0

    iput-boolean v0, p1, Lj;->r:Z

    .line 1214
    iget-boolean v0, p1, Lj;->I:Z

    if-eqz v0, :cond_6

    iget-boolean v0, p1, Lj;->J:Z

    if-eqz v0, :cond_6

    .line 1215
    iput-boolean v2, p0, Lt;->s:Z

    .line 1217
    :cond_6
    if-eqz p2, :cond_7

    .line 1218
    invoke-direct {p0, p1}, Lt;->b(Lj;)V

    .line 1221
    :cond_7
    return-void
.end method

.method public final a(Ljava/lang/Runnable;Z)V
    .locals 2

    .prologue
    .line 1394
    if-nez p2, :cond_0

    .line 1395
    invoke-direct {p0}, Lt;->r()V

    .line 1397
    :cond_0
    monitor-enter p0

    .line 1398
    :try_start_0
    iget-boolean v0, p0, Lt;->t:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lt;->h:Lm;

    if-nez v0, :cond_2

    .line 1399
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Activity has been destroyed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1409
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1401
    :cond_2
    :try_start_1
    iget-object v0, p0, Lt;->m:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    .line 1402
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt;->m:Ljava/util/ArrayList;

    .line 1404
    :cond_3
    iget-object v0, p0, Lt;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1405
    iget-object v0, p0, Lt;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 1406
    iget-object v0, p0, Lt;->h:Lm;

    iget-object v0, v0, Lm;->a:Landroid/os/Handler;

    iget-object v1, p0, Lt;->x:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1407
    iget-object v0, p0, Lt;->h:Lm;

    iget-object v0, v0, Lm;->a:Landroid/os/Handler;

    iget-object v1, p0, Lt;->x:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1409
    :cond_4
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 511
    new-instance v0, Lw;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lw;-><init>(Lt;Ljava/lang/String;I)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lt;->a(Ljava/lang/Runnable;Z)V

    .line 516
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 639
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "    "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 642
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 643
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 644
    if-lez v4, :cond_1

    .line 645
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Active Fragments in "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 646
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 647
    const-string v0, ":"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 648
    :goto_0
    if-ge v2, v4, :cond_1

    .line 649
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 650
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 651
    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 652
    if-eqz v0, :cond_0

    .line 653
    invoke-virtual {v0, v3, p2, p3, p4}, Lj;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 648
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 659
    :cond_1
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 660
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 661
    if-lez v4, :cond_2

    .line 662
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Added Fragments:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 663
    :goto_1
    if-ge v2, v4, :cond_2

    .line 664
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 665
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 666
    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Lj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 663
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 671
    :cond_2
    iget-object v0, p0, Lt;->q:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 672
    iget-object v0, p0, Lt;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 673
    if-lez v4, :cond_3

    .line 674
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Fragments Created Menus:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 675
    :goto_2
    if-ge v2, v4, :cond_3

    .line 676
    iget-object v0, p0, Lt;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 677
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 678
    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Lj;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 675
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 683
    :cond_3
    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 684
    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 685
    if-lez v4, :cond_4

    .line 686
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Back Stack:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 687
    :goto_3
    if-ge v2, v4, :cond_4

    .line 688
    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc;

    .line 689
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 690
    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Lc;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 691
    invoke-virtual {v0, v3, p3}, Lc;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 687
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_3

    .line 696
    :cond_4
    monitor-enter p0

    .line 697
    :try_start_0
    iget-object v0, p0, Lt;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 698
    iget-object v0, p0, Lt;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 699
    if-lez v3, :cond_5

    .line 700
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Back Stack Indices:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 701
    :goto_4
    if-ge v2, v3, :cond_5

    .line 702
    iget-object v0, p0, Lt;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc;

    .line 703
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "  #"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 704
    const-string v4, ": "

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 701
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_4

    .line 709
    :cond_5
    iget-object v0, p0, Lt;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lt;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 710
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAvailBackStackIndices: "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 711
    iget-object v0, p0, Lt;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 713
    :cond_6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 715
    iget-object v0, p0, Lt;->m:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    .line 716
    iget-object v0, p0, Lt;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 717
    if-lez v2, :cond_7

    .line 718
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Pending Actions:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 719
    :goto_5
    if-ge v1, v2, :cond_7

    .line 720
    iget-object v0, p0, Lt;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 721
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 722
    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 719
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_5

    .line 713
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 727
    :cond_7
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "FragmentManager misc state:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 728
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mActivity="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lt;->h:Lm;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 729
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lt;->i:Lq;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 730
    iget-object v0, p0, Lt;->r:Lj;

    if-eqz v0, :cond_8

    .line 731
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mParent="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lt;->r:Lj;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 733
    :cond_8
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mCurState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lt;->g:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 734
    const-string v0, " mStateSaved="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lt;->j:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 735
    const-string v0, " mDestroyed="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lt;->t:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 736
    iget-boolean v0, p0, Lt;->s:Z

    if-eqz v0, :cond_9

    .line 737
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mNeedMenuInvalidate="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 738
    iget-boolean v0, p0, Lt;->s:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 740
    :cond_9
    iget-object v0, p0, Lt;->k:Ljava/lang/String;

    if-eqz v0, :cond_a

    .line 741
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mNoTransactionsBecause="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 742
    iget-object v0, p0, Lt;->k:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 744
    :cond_a
    iget-object v0, p0, Lt;->p:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lt;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_b

    .line 745
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mAvailIndices: "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 746
    iget-object v0, p0, Lt;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 748
    :cond_b
    return-void
.end method

.method public final a(Lm;Lq;Lj;)V
    .locals 2

    .prologue
    .line 1912
    iget-object v0, p0, Lt;->h:Lm;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already attached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1913
    :cond_0
    iput-object p1, p0, Lt;->h:Lm;

    .line 1914
    iput-object p2, p0, Lt;->i:Lq;

    .line 1915
    iput-object p3, p0, Lt;->r:Lj;

    .line 1916
    return-void
.end method

.method public final a(Landroid/view/Menu;)Z
    .locals 7

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 2027
    .line 2028
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    move v1, v2

    move v3, v2

    .line 2029
    :goto_0
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 2030
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 2031
    if-eqz v0, :cond_1

    .line 15882
    iget-boolean v4, v0, Lj;->E:Z

    if-nez v4, :cond_5

    .line 15883
    iget-boolean v4, v0, Lj;->I:Z

    if-eqz v4, :cond_4

    iget-boolean v4, v0, Lj;->J:Z

    if-eqz v4, :cond_4

    .line 15885
    invoke-virtual {v0, p1}, Lj;->a(Landroid/view/Menu;)V

    move v4, v5

    .line 15887
    :goto_1
    iget-object v6, v0, Lj;->z:Lt;

    if-eqz v6, :cond_0

    .line 15888
    iget-object v0, v0, Lj;->z:Lt;

    invoke-virtual {v0, p1}, Lt;->a(Landroid/view/Menu;)Z

    move-result v0

    or-int/2addr v4, v0

    .line 2032
    :cond_0
    :goto_2
    if-eqz v4, :cond_1

    move v3, v5

    .line 2029
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    move v3, v2

    .line 2038
    :cond_3
    return v3

    :cond_4
    move v4, v2

    goto :goto_1

    :cond_5
    move v4, v2

    goto :goto_2
.end method

.method public final a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v5, 0x0

    .line 1995
    .line 1996
    const/4 v1, 0x0

    .line 1997
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    move v4, v5

    move v3, v5

    .line 1998
    :goto_0
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 1999
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 2000
    if-eqz v0, :cond_7

    .line 15868
    iget-boolean v6, v0, Lj;->E:Z

    if-nez v6, :cond_9

    .line 15869
    iget-boolean v6, v0, Lj;->I:Z

    if-eqz v6, :cond_8

    iget-boolean v6, v0, Lj;->J:Z

    if-eqz v6, :cond_8

    .line 15871
    invoke-virtual {v0, p1, p2}, Lj;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    move v6, v2

    .line 15873
    :goto_1
    iget-object v7, v0, Lj;->z:Lt;

    if-eqz v7, :cond_0

    .line 15874
    iget-object v7, v0, Lj;->z:Lt;

    invoke-virtual {v7, p1, p2}, Lt;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v7

    or-int/2addr v6, v7

    .line 2001
    :cond_0
    :goto_2
    if-eqz v6, :cond_7

    .line 2003
    if-nez v1, :cond_1

    .line 2004
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2006
    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v2

    .line 1998
    :goto_3
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    move v3, v0

    goto :goto_0

    :cond_2
    move v3, v5

    .line 2012
    :cond_3
    iget-object v0, p0, Lt;->q:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    .line 2013
    :goto_4
    iget-object v0, p0, Lt;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_6

    .line 2014
    iget-object v0, p0, Lt;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 2015
    if-eqz v1, :cond_4

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 2016
    :cond_4
    invoke-static {}, Lj;->m()V

    .line 2013
    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 2021
    :cond_6
    iput-object v1, p0, Lt;->q:Ljava/util/ArrayList;

    .line 2023
    return v3

    :cond_7
    move v0, v3

    goto :goto_3

    :cond_8
    move v6, v5

    goto :goto_1

    :cond_9
    move v6, v5

    goto :goto_2
.end method

.method public final a(Landroid/view/MenuItem;)Z
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 2042
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    move v1, v2

    .line 2043
    :goto_0
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 2044
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 2045
    if-eqz v0, :cond_3

    .line 15895
    iget-boolean v4, v0, Lj;->E:Z

    if-nez v4, :cond_2

    .line 15896
    iget-boolean v4, v0, Lj;->I:Z

    if-eqz v4, :cond_1

    iget-boolean v4, v0, Lj;->J:Z

    if-eqz v4, :cond_1

    .line 15897
    invoke-virtual {v0, p1}, Lj;->a(Landroid/view/MenuItem;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v0, v3

    .line 2046
    :goto_1
    if-eqz v0, :cond_3

    move v2, v3

    .line 2052
    :cond_0
    return v2

    .line 15901
    :cond_1
    iget-object v4, v0, Lj;->z:Lt;

    if-eqz v4, :cond_2

    .line 15902
    iget-object v0, v0, Lj;->z:Lt;

    invoke-virtual {v0, p1}, Lt;->a(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v3

    .line 15903
    goto :goto_1

    :cond_2
    move v0, v2

    .line 15907
    goto :goto_1

    .line 2043
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method final a(Ljava/lang/String;II)Z
    .locals 10

    .prologue
    const/4 v4, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 1541
    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 1610
    :cond_0
    :goto_0
    return v3

    .line 1544
    :cond_1
    if-nez p1, :cond_3

    if-gez p2, :cond_3

    and-int/lit8 v0, p3, 0x1

    if-nez v0, :cond_3

    .line 1545
    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 1546
    if-ltz v0, :cond_0

    .line 1549
    iget-object v1, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc;

    .line 1550
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 1551
    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    .line 1552
    invoke-virtual {v0, v1, v3}, Lc;->a(Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    .line 1553
    invoke-virtual {v0, v2, v4, v1, v3}, Lc;->a(ZLf;Landroid/util/SparseArray;Landroid/util/SparseArray;)Lf;

    :cond_2
    move v3, v2

    .line 1610
    goto :goto_0

    .line 1556
    :cond_3
    const/4 v0, -0x1

    .line 1557
    if-nez p1, :cond_4

    if-ltz p2, :cond_b

    .line 1560
    :cond_4
    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 1561
    :goto_1
    if-ltz v1, :cond_7

    .line 1562
    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc;

    .line 1563
    if-eqz p1, :cond_5

    .line 11973
    iget-object v5, v0, Lc;->f:Ljava/lang/String;

    .line 1563
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 1566
    :cond_5
    if-ltz p2, :cond_6

    iget v0, v0, Lc;->g:I

    if-eq p2, v0, :cond_7

    .line 1569
    :cond_6
    add-int/lit8 v1, v1, -0x1

    .line 1570
    goto :goto_1

    .line 1571
    :cond_7
    if-ltz v1, :cond_0

    .line 1574
    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_a

    .line 1575
    add-int/lit8 v1, v1, -0x1

    .line 1577
    :goto_2
    if-ltz v1, :cond_a

    .line 1578
    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc;

    .line 1579
    if-eqz p1, :cond_8

    .line 12973
    iget-object v5, v0, Lc;->f:Ljava/lang/String;

    .line 1579
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    if-ltz p2, :cond_a

    iget v0, v0, Lc;->g:I

    if-ne p2, v0, :cond_a

    .line 1581
    :cond_9
    add-int/lit8 v1, v1, -0x1

    .line 1582
    goto :goto_2

    :cond_a
    move v0, v1

    .line 1588
    :cond_b
    iget-object v1, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1591
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1593
    iget-object v1, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_3
    if-le v1, v0, :cond_c

    .line 1594
    iget-object v5, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1593
    add-int/lit8 v1, v1, -0x1

    goto :goto_3

    .line 1596
    :cond_c
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v7, v0, -0x1

    .line 1597
    new-instance v8, Landroid/util/SparseArray;

    invoke-direct {v8}, Landroid/util/SparseArray;-><init>()V

    .line 1598
    new-instance v9, Landroid/util/SparseArray;

    invoke-direct {v9}, Landroid/util/SparseArray;-><init>()V

    move v1, v3

    .line 1599
    :goto_4
    if-gt v1, v7, :cond_d

    .line 1600
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc;

    invoke-virtual {v0, v8, v9}, Lc;->a(Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    .line 1599
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    :cond_d
    move-object v5, v4

    move v4, v3

    .line 1603
    :goto_5
    if-gt v4, v7, :cond_2

    .line 1605
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc;

    if-ne v4, v7, :cond_e

    move v1, v2

    :goto_6
    invoke-virtual {v0, v1, v5, v8, v9}, Lc;->a(ZLf;Landroid/util/SparseArray;Landroid/util/SparseArray;)Lf;

    move-result-object v1

    .line 1603
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    move-object v5, v1

    goto :goto_5

    :cond_e
    move v1, v3

    .line 1605
    goto :goto_6
.end method

.method public final b(Landroid/view/Menu;)V
    .locals 3

    .prologue
    .line 2070
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 2071
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 2072
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 2073
    if-eqz v0, :cond_0

    .line 15925
    iget-boolean v2, v0, Lj;->E:Z

    if-nez v2, :cond_0

    .line 15929
    iget-object v2, v0, Lj;->z:Lt;

    if-eqz v2, :cond_0

    .line 15930
    iget-object v0, v0, Lj;->z:Lt;

    invoke-virtual {v0, p1}, Lt;->b(Landroid/view/Menu;)V

    .line 2071
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 2078
    :cond_1
    return-void
.end method

.method public final b(Lj;II)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1242
    iget-boolean v0, p1, Lj;->E:Z

    if-nez v0, :cond_3

    .line 1243
    iput-boolean v2, p1, Lj;->E:Z

    .line 1244
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 1245
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lt;->a(Lj;IZI)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1247
    if-eqz v0, :cond_0

    .line 1248
    iget-object v1, p1, Lj;->N:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1250
    :cond_0
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1252
    :cond_1
    iget-boolean v0, p1, Lj;->q:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lj;->I:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lj;->J:Z

    if-eqz v0, :cond_2

    .line 1253
    iput-boolean v2, p0, Lt;->s:Z

    .line 1255
    :cond_2
    invoke-static {}, Lj;->g()V

    .line 1257
    :cond_3
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 490
    invoke-virtual {p0}, Lt;->h()Z

    move-result v0

    return v0
.end method

.method public final b(Landroid/view/MenuItem;)Z
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 2056
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    move v1, v2

    .line 2057
    :goto_0
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 2058
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 2059
    if-eqz v0, :cond_2

    .line 15911
    iget-boolean v4, v0, Lj;->E:Z

    if-nez v4, :cond_1

    .line 15915
    iget-object v4, v0, Lj;->z:Lt;

    if-eqz v4, :cond_1

    .line 15916
    iget-object v0, v0, Lj;->z:Lt;

    invoke-virtual {v0, p1}, Lt;->b(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v3

    .line 2060
    :goto_1
    if-eqz v0, :cond_2

    move v2, v3

    .line 2066
    :cond_0
    return v2

    :cond_1
    move v0, v2

    .line 15921
    goto :goto_1

    .line 2057
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;I)Z
    .locals 2

    .prologue
    .line 520
    invoke-direct {p0}, Lt;->r()V

    .line 3490
    invoke-virtual {p0}, Lt;->h()Z

    .line 522
    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lt;->a(Ljava/lang/String;II)Z

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 495
    new-instance v0, Lv;

    invoke-direct {v0, p0}, Lv;-><init>(Lt;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lt;->a(Ljava/lang/Runnable;Z)V

    .line 500
    return-void
.end method

.method public final c(Lj;II)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1261
    iget-boolean v0, p1, Lj;->E:Z

    if-eqz v0, :cond_3

    .line 1262
    iput-boolean v2, p1, Lj;->E:Z

    .line 1263
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 1264
    invoke-direct {p0, p1, p2, v3, p3}, Lt;->a(Lj;IZI)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1266
    if-eqz v0, :cond_0

    .line 1267
    iget-object v1, p1, Lj;->N:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1269
    :cond_0
    iget-object v0, p1, Lj;->N:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1271
    :cond_1
    iget-boolean v0, p1, Lj;->q:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lj;->I:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lj;->J:Z

    if-eqz v0, :cond_2

    .line 1272
    iput-boolean v3, p0, Lt;->s:Z

    .line 1274
    :cond_2
    invoke-static {}, Lj;->g()V

    .line 1276
    :cond_3
    return-void
.end method

.method public final d(Lj;II)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v2, 0x1

    .line 1280
    iget-boolean v0, p1, Lj;->F:Z

    if-nez v0, :cond_2

    .line 1281
    iput-boolean v2, p1, Lj;->F:Z

    .line 1282
    iget-boolean v0, p1, Lj;->q:Z

    if-eqz v0, :cond_2

    .line 1284
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 1286
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1288
    :cond_0
    iget-boolean v0, p1, Lj;->I:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Lj;->J:Z

    if-eqz v0, :cond_1

    .line 1289
    iput-boolean v2, p0, Lt;->s:Z

    .line 1291
    :cond_1
    iput-boolean v5, p1, Lj;->q:Z

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    .line 1292
    invoke-virtual/range {v0 .. v5}, Lt;->a(Lj;IIIZ)V

    .line 1295
    :cond_2
    return-void
.end method

.method public final d()Z
    .locals 3

    .prologue
    .line 504
    invoke-direct {p0}, Lt;->r()V

    .line 2490
    invoke-virtual {p0}, Lt;->h()Z

    .line 506
    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lt;->a(Ljava/lang/String;II)Z

    move-result v0

    return v0
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 549
    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e(Lj;II)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v5, 0x0

    .line 1299
    iget-boolean v0, p1, Lj;->F:Z

    if-eqz v0, :cond_3

    .line 1300
    iput-boolean v5, p1, Lj;->F:Z

    .line 1301
    iget-boolean v0, p1, Lj;->q:Z

    if-nez v0, :cond_3

    .line 1302
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 1303
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    .line 1305
    :cond_0
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1306
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment already added: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1309
    :cond_1
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1310
    iput-boolean v1, p1, Lj;->q:Z

    .line 1311
    iget-boolean v0, p1, Lj;->I:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lj;->J:Z

    if-eqz v0, :cond_2

    .line 1312
    iput-boolean v1, p0, Lt;->s:Z

    .line 1314
    :cond_2
    iget v2, p0, Lt;->g:I

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lt;->a(Lj;IIIZ)V

    .line 1317
    :cond_3
    return-void
.end method

.method public final f()Ljava/util/List;
    .locals 1

    .prologue
    .line 601
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method final g()V
    .locals 2

    .prologue
    .line 1157
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 1165
    :cond_0
    return-void

    .line 1159
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 1160
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1161
    if-eqz v0, :cond_2

    .line 1162
    invoke-virtual {p0, v0}, Lt;->a(Lj;)V

    .line 1159
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public final h()Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 1472
    iget-boolean v1, p0, Lt;->o:Z

    if-eqz v1, :cond_0

    .line 1473
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recursive entry to executePendingTransactions"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1476
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v3, p0, Lt;->h:Lm;

    iget-object v3, v3, Lm;->a:Landroid/os/Handler;

    invoke-virtual {v3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v1, v3, :cond_1

    .line 1477
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must be called from main thread of process"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move v1, v2

    .line 1485
    :goto_0
    monitor-enter p0

    .line 1486
    :try_start_0
    iget-object v3, p0, Lt;->m:Ljava/util/ArrayList;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lt;->m:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_4

    .line 1487
    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1508
    iget-boolean v0, p0, Lt;->u:Z

    if-eqz v0, :cond_9

    move v3, v2

    move v4, v2

    .line 1510
    :goto_1
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_8

    .line 1511
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1512
    if-eqz v0, :cond_3

    iget-object v5, v0, Lj;->R:Lar;

    if-eqz v5, :cond_3

    .line 1513
    iget-object v0, v0, Lj;->R:Lar;

    invoke-virtual {v0}, Lar;->a()Z

    move-result v0

    or-int/2addr v4, v0

    .line 1510
    :cond_3
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 1490
    :cond_4
    :try_start_1
    iget-object v1, p0, Lt;->m:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 1491
    iget-object v1, p0, Lt;->n:[Ljava/lang/Runnable;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lt;->n:[Ljava/lang/Runnable;

    array-length v1, v1

    if-ge v1, v3, :cond_6

    .line 1492
    :cond_5
    new-array v1, v3, [Ljava/lang/Runnable;

    iput-object v1, p0, Lt;->n:[Ljava/lang/Runnable;

    .line 1494
    :cond_6
    iget-object v1, p0, Lt;->m:Ljava/util/ArrayList;

    iget-object v4, p0, Lt;->n:[Ljava/lang/Runnable;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1495
    iget-object v1, p0, Lt;->m:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1496
    iget-object v1, p0, Lt;->h:Lm;

    iget-object v1, v1, Lm;->a:Landroid/os/Handler;

    iget-object v4, p0, Lt;->x:Ljava/lang/Runnable;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1497
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1499
    iput-boolean v0, p0, Lt;->o:Z

    move v1, v2

    .line 1500
    :goto_2
    if-ge v1, v3, :cond_7

    .line 1501
    iget-object v4, p0, Lt;->n:[Ljava/lang/Runnable;

    aget-object v4, v4, v1

    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    .line 1502
    iget-object v4, p0, Lt;->n:[Ljava/lang/Runnable;

    const/4 v5, 0x0

    aput-object v5, v4, v1

    .line 1500
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 1497
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 1504
    :cond_7
    iput-boolean v2, p0, Lt;->o:Z

    move v1, v0

    .line 1506
    goto :goto_0

    .line 1516
    :cond_8
    if-nez v4, :cond_9

    .line 1517
    iput-boolean v2, p0, Lt;->u:Z

    .line 1518
    invoke-virtual {p0}, Lt;->g()V

    .line 1521
    :cond_9
    return v1
.end method

.method final i()Landroid/os/Parcelable;
    .locals 14

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v2, 0x0

    .line 1684
    invoke-virtual {p0}, Lt;->h()Z

    .line 1686
    sget-boolean v0, Lt;->l:Z

    if-eqz v0, :cond_0

    .line 1696
    iput-boolean v3, p0, Lt;->j:Z

    .line 1699
    :cond_0
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 1794
    :cond_1
    :goto_0
    return-object v2

    .line 1704
    :cond_2
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 1705
    new-array v7, v6, [Lad;

    move v5, v4

    move v1, v4

    .line 1707
    :goto_1
    if-ge v5, v6, :cond_f

    .line 1708
    iget-object v0, p0, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1709
    if-eqz v0, :cond_15

    .line 1710
    iget v1, v0, Lj;->k:I

    if-gez v1, :cond_3

    .line 1711
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Failure saving state: active "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " has cleared index: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget v9, v0, Lj;->k:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lt;->a(Ljava/lang/RuntimeException;)V

    .line 1718
    :cond_3
    new-instance v8, Lad;

    invoke-direct {v8, v0}, Lad;-><init>(Lj;)V

    .line 1719
    aput-object v8, v7, v5

    .line 1721
    iget v1, v0, Lj;->f:I

    if-lez v1, :cond_d

    iget-object v1, v8, Lad;->j:Landroid/os/Bundle;

    if-nez v1, :cond_d

    .line 13651
    iget-object v1, p0, Lt;->v:Landroid/os/Bundle;

    if-nez v1, :cond_4

    .line 13652
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iput-object v1, p0, Lt;->v:Landroid/os/Bundle;

    .line 13654
    :cond_4
    iget-object v1, p0, Lt;->v:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lj;->g(Landroid/os/Bundle;)V

    .line 13655
    iget-object v1, p0, Lt;->v:Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/Bundle;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_14

    .line 13656
    iget-object v1, p0, Lt;->v:Landroid/os/Bundle;

    .line 13657
    iput-object v2, p0, Lt;->v:Landroid/os/Bundle;

    .line 13660
    :goto_2
    iget-object v9, v0, Lj;->N:Landroid/view/View;

    if-eqz v9, :cond_5

    .line 13661
    invoke-direct {p0, v0}, Lt;->c(Lj;)V

    .line 13663
    :cond_5
    iget-object v9, v0, Lj;->j:Landroid/util/SparseArray;

    if-eqz v9, :cond_7

    .line 13664
    if-nez v1, :cond_6

    .line 13665
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 13667
    :cond_6
    const-string v9, "android:view_state"

    iget-object v10, v0, Lj;->j:Landroid/util/SparseArray;

    invoke-virtual {v1, v9, v10}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 13670
    :cond_7
    iget-boolean v9, v0, Lj;->Q:Z

    if-nez v9, :cond_9

    .line 13671
    if-nez v1, :cond_8

    .line 13672
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 13675
    :cond_8
    const-string v9, "android:user_visible_hint"

    iget-boolean v10, v0, Lj;->Q:Z

    invoke-virtual {v1, v9, v10}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1722
    :cond_9
    iput-object v1, v8, Lad;->j:Landroid/os/Bundle;

    .line 1724
    iget-object v1, v0, Lj;->n:Lj;

    if-eqz v1, :cond_e

    .line 1725
    iget-object v1, v0, Lj;->n:Lj;

    iget v1, v1, Lj;->k:I

    if-gez v1, :cond_a

    .line 1726
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Failure saving state: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " has target not in fragment manager: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    iget-object v10, v0, Lj;->n:Lj;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lt;->a(Ljava/lang/RuntimeException;)V

    .line 1730
    :cond_a
    iget-object v1, v8, Lad;->j:Landroid/os/Bundle;

    if-nez v1, :cond_b

    .line 1731
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iput-object v1, v8, Lad;->j:Landroid/os/Bundle;

    .line 1733
    :cond_b
    iget-object v1, v8, Lad;->j:Landroid/os/Bundle;

    const-string v9, "android:target_state"

    iget-object v10, v0, Lj;->n:Lj;

    .line 14574
    iget v11, v10, Lj;->k:I

    if-gez v11, :cond_c

    .line 14575
    new-instance v11, Ljava/lang/IllegalStateException;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "Fragment "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " is not currently in the FragmentManager"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v11}, Lt;->a(Ljava/lang/RuntimeException;)V

    .line 14578
    :cond_c
    iget v10, v10, Lj;->k:I

    invoke-virtual {v1, v9, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1735
    iget v1, v0, Lj;->p:I

    if-eqz v1, :cond_e

    .line 1736
    iget-object v1, v8, Lad;->j:Landroid/os/Bundle;

    const-string v8, "android:target_req_state"

    iget v0, v0, Lj;->p:I

    invoke-virtual {v1, v8, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    move v0, v3

    .line 1707
    :goto_3
    add-int/lit8 v1, v5, 0x1

    move v5, v1

    move v1, v0

    goto/16 :goto_1

    .line 1743
    :cond_d
    iget-object v0, v0, Lj;->i:Landroid/os/Bundle;

    iput-object v0, v8, Lad;->j:Landroid/os/Bundle;

    :cond_e
    move v0, v3

    goto :goto_3

    .line 1751
    :cond_f
    if-eqz v1, :cond_1

    .line 1760
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_11

    .line 1761
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 1762
    if-lez v5, :cond_11

    .line 1763
    new-array v1, v5, [I

    move v3, v4

    .line 1764
    :goto_4
    if-ge v3, v5, :cond_12

    .line 1765
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    iget v0, v0, Lj;->k:I

    aput v0, v1, v3

    .line 1766
    aget v0, v1, v3

    if-gez v0, :cond_10

    .line 1767
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "Failure saving state: active "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, " has cleared index: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    aget v8, v1, v3

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lt;->a(Ljava/lang/RuntimeException;)V

    .line 1764
    :cond_10
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_4

    :cond_11
    move-object v1, v2

    .line 1778
    :cond_12
    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_13

    .line 1779
    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 1780
    if-lez v5, :cond_13

    .line 1781
    new-array v2, v5, [Lg;

    move v3, v4

    .line 1782
    :goto_5
    if-ge v3, v5, :cond_13

    .line 1783
    new-instance v4, Lg;

    iget-object v0, p0, Lt;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc;

    invoke-direct {v4, v0}, Lg;-><init>(Lc;)V

    aput-object v4, v2, v3

    .line 1782
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_5

    .line 1790
    :cond_13
    new-instance v0, Laa;

    invoke-direct {v0}, Laa;-><init>()V

    .line 1791
    iput-object v7, v0, Laa;->a:[Lad;

    .line 1792
    iput-object v1, v0, Laa;->b:[I

    .line 1793
    iput-object v2, v0, Laa;->c:[Lg;

    move-object v2, v0

    .line 1794
    goto/16 :goto_0

    :cond_14
    move-object v1, v2

    goto/16 :goto_2

    :cond_15
    move v0, v1

    goto/16 :goto_3
.end method

.method public final j()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1923
    iput-boolean v1, p0, Lt;->j:Z

    .line 1924
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lt;->a(IZ)V

    .line 1925
    return-void
.end method

.method public final k()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1928
    iput-boolean v1, p0, Lt;->j:Z

    .line 1929
    const/4 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lt;->a(IZ)V

    .line 1930
    return-void
.end method

.method public final l()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1933
    iput-boolean v1, p0, Lt;->j:Z

    .line 1934
    const/4 v0, 0x4

    invoke-virtual {p0, v0, v1}, Lt;->a(IZ)V

    .line 1935
    return-void
.end method

.method public final m()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1938
    iput-boolean v1, p0, Lt;->j:Z

    .line 1939
    const/4 v0, 0x5

    invoke-virtual {p0, v0, v1}, Lt;->a(IZ)V

    .line 1940
    return-void
.end method

.method public final n()V
    .locals 2

    .prologue
    .line 1943
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lt;->a(IZ)V

    .line 1944
    return-void
.end method

.method public final o()V
    .locals 2

    .prologue
    .line 1950
    const/4 v0, 0x1

    iput-boolean v0, p0, Lt;->j:Z

    .line 1952
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lt;->a(IZ)V

    .line 1953
    return-void
.end method

.method public final p()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 1964
    const/4 v0, 0x1

    iput-boolean v0, p0, Lt;->t:Z

    .line 1965
    invoke-virtual {p0}, Lt;->h()Z

    .line 1966
    invoke-virtual {p0, v2, v2}, Lt;->a(IZ)V

    .line 1967
    iput-object v1, p0, Lt;->h:Lm;

    .line 1968
    iput-object v1, p0, Lt;->i:Lq;

    .line 1969
    iput-object v1, p0, Lt;->r:Lj;

    .line 1970
    return-void
.end method

.method public final q()V
    .locals 3

    .prologue
    .line 1984
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 1985
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 1986
    iget-object v0, p0, Lt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 1987
    if-eqz v0, :cond_0

    .line 15851
    invoke-virtual {v0}, Lj;->onLowMemory()V

    .line 15852
    iget-object v2, v0, Lj;->z:Lt;

    if-eqz v2, :cond_0

    .line 15853
    iget-object v0, v0, Lj;->z:Lt;

    invoke-virtual {v0}, Lt;->q()V

    .line 1985
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1992
    :cond_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 624
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 625
    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    iget-object v1, p0, Lt;->r:Lj;

    if-eqz v1, :cond_0

    .line 629
    iget-object v1, p0, Lt;->r:Lj;

    invoke-static {v1, v0}, La;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 633
    :goto_0
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 634
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 631
    :cond_0
    iget-object v1, p0, Lt;->h:Lm;

    invoke-static {v1, v0}, La;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    goto :goto_0
.end method
