.class public final Lrw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field private synthetic a:Landroid/support/v7/internal/widget/ActivityChooserView;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V
    .locals 0

    .prologue
    .line 554
    iput-object p1, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 590
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->e(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 591
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->b()Z

    .line 592
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;)Lrv;

    move-result-object v0

    .line 7789
    iget-object v0, v0, Lrv;->a:Lrl;

    invoke-virtual {v0}, Lrl;->b()Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 593
    iget-object v1, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;)Lrv;

    move-result-object v1

    .line 7808
    iget-object v1, v1, Lrv;->a:Lrl;

    .line 593
    invoke-virtual {v1, v0}, Lrl;->a(Landroid/content/pm/ResolveInfo;)I

    move-result v0

    .line 594
    iget-object v1, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;)Lrv;

    move-result-object v1

    .line 8808
    iget-object v1, v1, Lrv;->a:Lrl;

    .line 594
    invoke-virtual {v1, v0}, Lrl;->b(I)Landroid/content/Intent;

    move-result-object v0

    .line 595
    if-eqz v0, :cond_0

    .line 596
    const/high16 v1, 0x80000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 597
    iget-object v1, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 601
    :cond_0
    :goto_0
    return-void

    .line 599
    :cond_1
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->f(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 600
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;Z)Z

    .line 601
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    iget-object v1, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->g(Landroid/support/v7/internal/widget/ActivityChooserView;)I

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;I)V

    goto :goto_0

    .line 603
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method public final onDismiss()V
    .locals 2

    .prologue
    .line 623
    .line 9630
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->h(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/PopupWindow$OnDismissListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9631
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->h(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/PopupWindow$OnDismissListener;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    .line 624
    :cond_0
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->c:Lfb;

    if-eqz v0, :cond_1

    .line 625
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->c:Lfb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lfb;->a(Z)V

    .line 627
    :cond_1
    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8

    .prologue
    .line 559
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    check-cast v0, Lrv;

    .line 560
    invoke-virtual {v0, p3}, Lrv;->getItemViewType(I)I

    move-result v0

    .line 561
    packed-switch v0, :pswitch_data_0

    .line 584
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 563
    :pswitch_0
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    const v1, 0x7fffffff

    invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;I)V

    .line 586
    :cond_0
    :goto_0
    return-void

    .line 566
    :pswitch_1
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->b()Z

    .line 567
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->d(Landroid/support/v7/internal/widget/ActivityChooserView;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 569
    if-lez p3, :cond_0

    .line 570
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;)Lrv;

    move-result-object v0

    .line 1808
    iget-object v2, v0, Lrv;->a:Lrl;

    .line 2536
    iget-object v3, v2, Lrl;->a:Ljava/lang/Object;

    monitor-enter v3

    .line 2537
    :try_start_0
    invoke-virtual {v2}, Lrl;->d()V

    .line 2539
    iget-object v0, v2, Lrl;->b:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrm;

    .line 2540
    iget-object v1, v2, Lrl;->b:Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrm;

    .line 2543
    if-eqz v1, :cond_1

    .line 2545
    iget v1, v1, Lrm;->b:F

    iget v4, v0, Lrm;->b:F

    sub-float/2addr v1, v4

    const/high16 v4, 0x40a00000    # 5.0f

    add-float/2addr v1, v4

    .line 2551
    :goto_1
    new-instance v4, Landroid/content/ComponentName;

    iget-object v5, v0, Lrm;->a:Landroid/content/pm/ResolveInfo;

    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v0, v0, Lrm;->a:Landroid/content/pm/ResolveInfo;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v4, v5, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2554
    new-instance v0, Lrp;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct {v0, v4, v6, v7, v1}, Lrp;-><init>(Landroid/content/ComponentName;JF)V

    .line 2731
    iget-object v1, v2, Lrl;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    .line 2732
    if-eqz v0, :cond_4

    .line 2733
    const/4 v0, 0x1

    iput-boolean v0, v2, Lrl;->f:Z

    .line 2734
    invoke-virtual {v2}, Lrl;->e()V

    .line 3570
    iget-boolean v0, v2, Lrl;->e:Z

    if-nez v0, :cond_2

    .line 3571
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No preceding call to #readHistoricalData"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2557
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 2548
    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    .line 3573
    :cond_2
    :try_start_1
    iget-boolean v0, v2, Lrl;->f:Z

    if-eqz v0, :cond_3

    .line 3576
    const/4 v0, 0x0

    iput-boolean v0, v2, Lrl;->f:Z

    .line 3577
    iget-object v0, v2, Lrl;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 3578
    new-instance v0, Lrq;

    .line 4037
    invoke-direct {v0, v2}, Lrq;-><init>(Lrl;)V

    .line 3578
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, v2, Lrl;->c:Ljava/util/List;

    aput-object v5, v1, v4

    const/4 v4, 0x1

    iget-object v5, v2, Lrl;->d:Ljava/lang/String;

    aput-object v5, v1, v4

    .line 4043
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0xb

    if-lt v4, v5, :cond_5

    .line 5029
    sget-object v4, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v4, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 2737
    :cond_3
    :goto_2
    invoke-virtual {v2}, Lrl;->notifyChanged()V

    .line 2557
    :cond_4
    monitor-exit v3

    goto/16 :goto_0

    .line 4048
    :cond_5
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 575
    :cond_6
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;)Lrv;

    move-result-object v0

    .line 5822
    iget-boolean v0, v0, Lrv;->b:Z

    .line 575
    if-eqz v0, :cond_7

    .line 576
    :goto_3
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;)Lrv;

    move-result-object v0

    .line 6808
    iget-object v0, v0, Lrv;->a:Lrl;

    .line 576
    invoke-virtual {v0, p3}, Lrl;->b(I)Landroid/content/Intent;

    move-result-object v0

    .line 577
    if-eqz v0, :cond_0

    .line 578
    const/high16 v1, 0x80000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 579
    iget-object v1, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 575
    :cond_7
    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    .line 561
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 610
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->e(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 611
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;)Lrv;

    move-result-object v0

    invoke-virtual {v0}, Lrv;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 612
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0, v2}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;Z)Z

    .line 613
    iget-object v0, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    iget-object v1, p0, Lrw;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->g(Landroid/support/v7/internal/widget/ActivityChooserView;)I

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->a(Landroid/support/v7/internal/widget/ActivityChooserView;I)V

    .line 618
    :cond_0
    return v2

    .line 616
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method
