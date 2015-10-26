.class final Lpa;
.super Lpr;
.source "PG"


# instance fields
.field private synthetic a:Lou;


# direct methods
.method public constructor <init>(Lou;Landroid/view/Window$Callback;)V
    .locals 0

    .prologue
    .line 537
    iput-object p1, p0, Lpa;->a:Lou;

    .line 538
    invoke-direct {p0, p2}, Lpr;-><init>(Landroid/view/Window$Callback;)V

    .line 539
    return-void
.end method


# virtual methods
.method public final onCreatePanelView(I)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/4 v8, 0x1

    .line 553
    packed-switch p1, :pswitch_data_0

    .line 561
    :cond_0
    invoke-super {p0, p1}, Lpr;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v0

    .line 5498
    :goto_0
    return-object v0

    .line 555
    :pswitch_0
    iget-object v0, p0, Lpa;->a:Lou;

    .line 4050
    iget-object v0, v0, Lou;->a:Lse;

    .line 555
    invoke-interface {v0}, Lse;->o()Landroid/view/Menu;

    move-result-object v1

    .line 556
    invoke-virtual {p0, p1, v2, v1}, Lpa;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v1}, Lpa;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 557
    iget-object v3, p0, Lpa;->a:Lou;

    .line 5504
    iget-object v0, v3, Lou;->d:Lpy;

    if-nez v0, :cond_2

    instance-of v0, v1, Lqa;

    if-eqz v0, :cond_2

    move-object v0, v1

    .line 5505
    check-cast v0, Lqa;

    .line 5507
    iget-object v4, v3, Lou;->a:Lse;

    invoke-interface {v4}, Lse;->b()Landroid/content/Context;

    move-result-object v4

    .line 5508
    new-instance v5, Landroid/util/TypedValue;

    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 5509
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    .line 5510
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 5513
    sget v7, La;->g:I

    invoke-virtual {v6, v7, v5, v8}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 5514
    iget v7, v5, Landroid/util/TypedValue;->resourceId:I

    if-eqz v7, :cond_1

    .line 5515
    iget v7, v5, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 5519
    :cond_1
    sget v7, La;->K:I

    invoke-virtual {v6, v7, v5, v8}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 5520
    iget v7, v5, Landroid/util/TypedValue;->resourceId:I

    if-eqz v7, :cond_4

    .line 5521
    iget v5, v5, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v6, v5, v8}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 5526
    :goto_1
    new-instance v5, Landroid/view/ContextThemeWrapper;

    const/4 v7, 0x0

    invoke-direct {v5, v4, v7}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 5527
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    invoke-virtual {v4, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 5530
    new-instance v4, Lpy;

    sget v6, La;->bL:I

    invoke-direct {v4, v5, v6}, Lpy;-><init>(Landroid/content/Context;I)V

    iput-object v4, v3, Lou;->d:Lpy;

    .line 5531
    iget-object v4, v3, Lou;->d:Lpy;

    new-instance v5, Loz;

    .line 5601
    invoke-direct {v5, v3}, Loz;-><init>(Lou;)V

    .line 6134
    iput-object v5, v4, Lpy;->d:Lqq;

    .line 5532
    iget-object v4, v3, Lou;->d:Lpy;

    invoke-virtual {v0, v4}, Lqa;->a(Lqp;)V

    .line 5493
    :cond_2
    if-eqz v1, :cond_3

    iget-object v0, v3, Lou;->d:Lpy;

    if-nez v0, :cond_5

    :cond_3
    move-object v0, v2

    .line 5494
    goto/16 :goto_0

    .line 5523
    :cond_4
    sget v5, La;->bZ:I

    invoke-virtual {v6, v5, v8}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    goto :goto_1

    .line 5497
    :cond_5
    iget-object v0, v3, Lou;->d:Lpy;

    invoke-virtual {v0}, Lpy;->b()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-lez v0, :cond_6

    .line 5498
    iget-object v0, v3, Lou;->d:Lpy;

    iget-object v1, v3, Lou;->a:Lse;

    invoke-interface {v1}, Lse;->a()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpy;->a(Landroid/view/ViewGroup;)Lqr;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto/16 :goto_0

    :cond_6
    move-object v0, v2

    .line 557
    goto/16 :goto_0

    .line 553
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 3

    .prologue
    .line 543
    invoke-super {p0, p1, p2, p3}, Lpr;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    .line 544
    if-eqz v0, :cond_0

    iget-object v1, p0, Lpa;->a:Lou;

    .line 1050
    iget-boolean v1, v1, Lou;->b:Z

    .line 544
    if-nez v1, :cond_0

    .line 545
    iget-object v1, p0, Lpa;->a:Lou;

    .line 2050
    iget-object v1, v1, Lou;->a:Lse;

    .line 545
    invoke-interface {v1}, Lse;->k()V

    .line 546
    iget-object v1, p0, Lpa;->a:Lou;

    .line 3050
    const/4 v2, 0x1

    iput-boolean v2, v1, Lou;->b:Z

    .line 548
    :cond_0
    return v0
.end method
