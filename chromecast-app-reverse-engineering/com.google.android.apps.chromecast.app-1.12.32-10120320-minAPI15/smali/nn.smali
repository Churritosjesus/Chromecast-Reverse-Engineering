.class final Lnn;
.super Lnk;
.source "PG"


# instance fields
.field private synthetic a:Lnm;


# direct methods
.method constructor <init>(Lnm;Landroid/view/Window$Callback;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lnn;->a:Lnm;

    .line 51
    invoke-direct {p0, p1, p2}, Lnk;-><init>(Lni;Landroid/view/Window$Callback;)V

    .line 52
    return-void
.end method


# virtual methods
.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 11

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 57
    iget-object v0, p0, Lnn;->a:Lnm;

    .line 1024
    iget-boolean v0, v0, Lnm;->n:Z

    .line 57
    if-eqz v0, :cond_c

    .line 1070
    new-instance v4, Lpl;

    iget-object v0, p0, Lnn;->a:Lnm;

    iget-object v0, v0, Lnm;->a:Landroid/content/Context;

    invoke-direct {v4, v0, p1}, Lpl;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    .line 1074
    iget-object v5, p0, Lnn;->a:Lnm;

    .line 1558
    iget-object v0, v5, Lno;->o:Lvr;

    if-eqz v0, :cond_0

    .line 1559
    iget-object v0, v5, Lno;->o:Lvr;

    invoke-virtual {v0}, Lvr;->c()V

    .line 1562
    :cond_0
    new-instance v6, Lnu;

    invoke-direct {v6, v5, v4}, Lnu;-><init>(Lno;Lvs;)V

    .line 1564
    invoke-virtual {v5}, Lno;->a()Lmj;

    move-result-object v0

    .line 1565
    if-eqz v0, :cond_1

    .line 1566
    invoke-virtual {v0, v6}, Lmj;->a(Lvs;)Lvr;

    move-result-object v0

    iput-object v0, v5, Lno;->o:Lvr;

    .line 1572
    :cond_1
    iget-object v0, v5, Lno;->o:Lvr;

    if-nez v0, :cond_6

    .line 1590
    iget-object v0, v5, Lno;->o:Lvr;

    if-eqz v0, :cond_2

    .line 1591
    iget-object v0, v5, Lno;->o:Lvr;

    invoke-virtual {v0}, Lvr;->c()V

    .line 1594
    :cond_2
    new-instance v7, Lnu;

    invoke-direct {v7, v5, v6}, Lnu;-><init>(Lno;Lvs;)V

    .line 1607
    iget-object v0, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    if-nez v0, :cond_3

    .line 1608
    iget-boolean v0, v5, Lno;->j:Z

    if-eqz v0, :cond_8

    .line 1610
    new-instance v8, Landroid/util/TypedValue;

    invoke-direct {v8}, Landroid/util/TypedValue;-><init>()V

    .line 1611
    iget-object v0, v5, Lno;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    .line 1612
    sget v9, La;->l:I

    invoke-virtual {v0, v9, v8, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 1615
    iget v9, v8, Landroid/util/TypedValue;->resourceId:I

    if-eqz v9, :cond_7

    .line 1616
    iget-object v9, v5, Lno;->a:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    .line 1617
    invoke-virtual {v9, v0}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 1618
    iget v0, v8, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v9, v0, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 1620
    new-instance v0, Lpi;

    iget-object v10, v5, Lno;->a:Landroid/content/Context;

    invoke-direct {v0, v10, v2}, Lpi;-><init>(Landroid/content/Context;I)V

    .line 1621
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v10

    invoke-virtual {v10, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 1626
    :goto_0
    new-instance v9, Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-direct {v9, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    iput-object v9, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    .line 1627
    new-instance v9, Landroid/widget/PopupWindow;

    sget v10, La;->o:I

    invoke-direct {v9, v0, v3, v10}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v9, v5, Lno;->q:Landroid/widget/PopupWindow;

    .line 1629
    iget-object v9, v5, Lno;->q:Landroid/widget/PopupWindow;

    iget-object v10, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v9, v10}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 1630
    iget-object v9, v5, Lno;->q:Landroid/widget/PopupWindow;

    const/4 v10, -0x1

    invoke-virtual {v9, v10}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 1632
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    sget v10, La;->h:I

    invoke-virtual {v9, v10, v8, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 1634
    iget v8, v8, Landroid/util/TypedValue;->data:I

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v0

    .line 1636
    iget-object v8, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    .line 2146
    iput v0, v8, Landroid/support/v7/internal/widget/ActionBarContextView;->e:I

    .line 1637
    iget-object v0, v5, Lno;->q:Landroid/widget/PopupWindow;

    const/4 v8, -0x2

    invoke-virtual {v0, v8}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 1638
    new-instance v0, Lns;

    invoke-direct {v0, v5}, Lns;-><init>(Lno;)V

    iput-object v0, v5, Lno;->r:Ljava/lang/Runnable;

    .line 1656
    :cond_3
    :goto_1
    iget-object v0, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    if-eqz v0, :cond_5

    .line 1657
    iget-object v0, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->c()V

    .line 1658
    new-instance v8, Lpj;

    iget-object v0, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v9

    iget-object v10, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    iget-object v0, v5, Lno;->q:Landroid/widget/PopupWindow;

    if-nez v0, :cond_9

    move v0, v1

    :goto_2
    invoke-direct {v8, v9, v10, v7, v0}, Lpj;-><init>(Landroid/content/Context;Landroid/support/v7/internal/widget/ActionBarContextView;Lvs;Z)V

    .line 1660
    invoke-virtual {v8}, Lvr;->b()Landroid/view/Menu;

    move-result-object v0

    invoke-interface {v6, v8, v0}, Lvs;->a(Lvr;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1661
    invoke-virtual {v8}, Lvr;->d()V

    .line 1662
    iget-object v0, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0, v8}, Landroid/support/v7/internal/widget/ActionBarContextView;->a(Lvr;)V

    .line 1663
    iget-object v0, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->setVisibility(I)V

    .line 1664
    iput-object v8, v5, Lno;->o:Lvr;

    .line 1665
    iget-object v0, v5, Lno;->q:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_4

    .line 1666
    iget-object v0, v5, Lno;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, v5, Lno;->r:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1668
    :cond_4
    iget-object v0, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarContextView;->sendAccessibilityEvent(I)V

    .line 1671
    iget-object v0, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 1672
    iget-object v0, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lgt;->q(Landroid/view/View;)V

    .line 1682
    :cond_5
    :goto_3
    iget-object v0, v5, Lno;->o:Lvr;

    .line 1574
    iput-object v0, v5, Lno;->o:Lvr;

    .line 1577
    :cond_6
    iget-object v0, v5, Lno;->o:Lvr;

    .line 1077
    if-eqz v0, :cond_b

    .line 1079
    invoke-virtual {v4, v0}, Lpl;->b(Lvr;)Landroid/view/ActionMode;

    move-result-object v0

    :goto_4
    return-object v0

    .line 1623
    :cond_7
    iget-object v0, v5, Lno;->a:Landroid/content/Context;

    goto/16 :goto_0

    .line 1646
    :cond_8
    iget-object v0, v5, Lno;->s:Landroid/view/ViewGroup;

    sget v8, La;->aV:I

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ViewStubCompat;

    .line 1648
    if-eqz v0, :cond_3

    .line 1650
    invoke-virtual {v5}, Lno;->k()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v8

    .line 3132
    iput-object v8, v0, Landroid/support/v7/internal/widget/ViewStubCompat;->a:Landroid/view/LayoutInflater;

    .line 1651
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarContextView;

    iput-object v0, v5, Lno;->p:Landroid/support/v7/internal/widget/ActionBarContextView;

    goto/16 :goto_1

    :cond_9
    move v0, v2

    .line 1658
    goto :goto_2

    .line 1675
    :cond_a
    iput-object v3, v5, Lno;->o:Lvr;

    goto :goto_3

    :cond_b
    move-object v0, v3

    .line 58
    goto :goto_4

    .line 61
    :cond_c
    invoke-super {p0, p1}, Lnk;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object v0

    goto :goto_4
.end method
