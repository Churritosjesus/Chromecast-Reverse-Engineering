.class public final Lpf;
.super Lvr;
.source "PG"

# interfaces
.implements Lqb;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lqa;

.field private e:Lvs;

.field private f:Ljava/lang/ref/WeakReference;

.field private synthetic g:Lpb;


# direct methods
.method public constructor <init>(Lpb;Landroid/content/Context;Lvs;)V
    .locals 2

    .prologue
    .line 959
    iput-object p1, p0, Lpf;->g:Lpb;

    invoke-direct {p0}, Lvr;-><init>()V

    .line 960
    iput-object p2, p0, Lpf;->c:Landroid/content/Context;

    .line 961
    iput-object p3, p0, Lpf;->e:Lvs;

    .line 962
    new-instance v0, Lqa;

    invoke-direct {v0, p2}, Lqa;-><init>(Landroid/content/Context;)V

    .line 1231
    const/4 v1, 0x1

    iput v1, v0, Lqa;->e:I

    .line 962
    iput-object v0, p0, Lpf;->d:Lqa;

    .line 964
    iget-object v0, p0, Lpf;->d:Lqa;

    invoke-virtual {v0, p0}, Lqa;->a(Lqb;)V

    .line 965
    return-void
.end method


# virtual methods
.method public final a()Landroid/view/MenuInflater;
    .locals 2

    .prologue
    .line 969
    new-instance v0, Lpm;

    iget-object v1, p0, Lpf;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lpm;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 1052
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->k(Lpb;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpf;->b(Ljava/lang/CharSequence;)V

    .line 1053
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 1036
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->i(Lpb;)Landroid/support/v7/internal/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarContextView;->d(Landroid/view/View;)V

    .line 1037
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lpf;->f:Ljava/lang/ref/WeakReference;

    .line 1038
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 1042
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->i(Lpb;)Landroid/support/v7/internal/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarContextView;->b(Ljava/lang/CharSequence;)V

    .line 1043
    return-void
.end method

.method public final a(Lqa;)V
    .locals 1

    .prologue
    .line 1114
    iget-object v0, p0, Lpf;->e:Lvs;

    if-nez v0, :cond_0

    .line 1119
    :goto_0
    return-void

    .line 1117
    :cond_0
    invoke-virtual {p0}, Lpf;->d()V

    .line 1118
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->i(Lpb;)Landroid/support/v7/internal/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->a()Z

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 1072
    invoke-super {p0, p1}, Lvr;->a(Z)V

    .line 1073
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->i(Lpb;)Landroid/support/v7/internal/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarContextView;->a(Z)V

    .line 1074
    return-void
.end method

.method public final a(Lqa;Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 1087
    iget-object v0, p0, Lpf;->e:Lvs;

    if-eqz v0, :cond_0

    .line 1088
    iget-object v0, p0, Lpf;->e:Lvs;

    invoke-interface {v0, p0, p2}, Lvs;->a(Lvr;Landroid/view/MenuItem;)Z

    move-result v0

    .line 1090
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Landroid/view/Menu;
    .locals 1

    .prologue
    .line 974
    iget-object v0, p0, Lpf;->d:Lqa;

    return-object v0
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 1057
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->k(Lpb;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpf;->a(Ljava/lang/CharSequence;)V

    .line 1058
    return-void
.end method

.method public final b(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 1047
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->i(Lpb;)Landroid/support/v7/internal/widget/ActionBarContextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarContextView;->a(Ljava/lang/CharSequence;)V

    .line 1048
    return-void
.end method

.method public final c()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x2

    const/4 v2, 0x0

    .line 979
    iget-object v0, p0, Lpf;->g:Lpb;

    iget-object v0, v0, Lpb;->a:Lpf;

    if-eq v0, p0, :cond_0

    .line 1006
    :goto_0
    return-void

    .line 988
    :cond_0
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->g(Lpb;)Z

    move-result v0

    iget-object v1, p0, Lpf;->g:Lpb;

    invoke-static {v1}, Lpb;->h(Lpb;)Z

    move-result v1

    invoke-static {v0, v1, v2}, Lpb;->a(ZZZ)Z

    move-result v0

    if-nez v0, :cond_2

    .line 991
    iget-object v0, p0, Lpf;->g:Lpb;

    iput-object p0, v0, Lpb;->b:Lvr;

    .line 992
    iget-object v0, p0, Lpf;->g:Lpb;

    iget-object v1, p0, Lpf;->e:Lvs;

    iput-object v1, v0, Lpb;->c:Lvs;

    .line 996
    :goto_1
    iput-object v4, p0, Lpf;->e:Lvs;

    .line 997
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-virtual {v0, v2}, Lpb;->g(Z)V

    .line 1000
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->i(Lpb;)Landroid/support/v7/internal/widget/ActionBarContextView;

    move-result-object v1

    .line 1258
    iget v0, v1, Landroid/support/v7/internal/widget/ActionBarContextView;->l:I

    if-eq v0, v3, :cond_1

    .line 1262
    iget-object v0, v1, Landroid/support/v7/internal/widget/ActionBarContextView;->i:Landroid/view/View;

    if-nez v0, :cond_3

    .line 1263
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContextView;->c()V

    .line 1001
    :cond_1
    :goto_2
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->j(Lpb;)Lse;

    move-result-object v0

    invoke-interface {v0}, Lse;->a()Landroid/view/ViewGroup;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    .line 1003
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->f(Lpb;)Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    move-result-object v0

    iget-object v1, p0, Lpf;->g:Lpb;

    iget-boolean v1, v1, Lpb;->d:Z

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->a(Z)V

    .line 1005
    iget-object v0, p0, Lpf;->g:Lpb;

    iput-object v4, v0, Lpb;->a:Lpf;

    goto :goto_0

    .line 994
    :cond_2
    iget-object v0, p0, Lpf;->e:Lvs;

    invoke-interface {v0, p0}, Lvs;->a(Lvr;)V

    goto :goto_1

    .line 1267
    :cond_3
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContextView;->b()V

    .line 1268
    iput v3, v1, Landroid/support/v7/internal/widget/ActionBarContextView;->l:I

    .line 1436
    iget-object v0, v1, Landroid/support/v7/internal/widget/ActionBarContextView;->i:Landroid/view/View;

    invoke-static {v0}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v2

    iget-object v0, v1, Landroid/support/v7/internal/widget/ActionBarContextView;->i:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    neg-int v3, v0

    iget-object v0, v1, Landroid/support/v7/internal/widget/ActionBarContextView;->i:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int v0, v3, v0

    int-to-float v0, v0

    invoke-virtual {v2, v0}, Lih;->b(F)Lih;

    move-result-object v0

    .line 1439
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Lih;->a(J)Lih;

    .line 1440
    invoke-virtual {v0, v1}, Lih;->a(Liu;)Lih;

    .line 1441
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v2}, Lih;->a(Landroid/view/animation/Interpolator;)Lih;

    .line 1443
    new-instance v2, Lpp;

    invoke-direct {v2}, Lpp;-><init>()V

    .line 1444
    invoke-virtual {v2, v0}, Lpp;->a(Lih;)Lpp;

    .line 1446
    iget-object v0, v1, Landroid/support/v7/internal/widget/ActionBarContextView;->b:Landroid/support/v7/widget/ActionMenuView;

    if-eqz v0, :cond_4

    .line 1447
    iget-object v0, v1, Landroid/support/v7/internal/widget/ActionBarContextView;->b:Landroid/support/v7/widget/ActionMenuView;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I

    .line 1269
    :cond_4
    iput-object v2, v1, Landroid/support/v7/internal/widget/ActionBarContextView;->k:Lpp;

    .line 1270
    iget-object v0, v1, Landroid/support/v7/internal/widget/ActionBarContextView;->k:Lpp;

    invoke-virtual {v0}, Lpp;->a()V

    goto :goto_2
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 1010
    iget-object v0, p0, Lpf;->g:Lpb;

    iget-object v0, v0, Lpb;->a:Lpf;

    if-eq v0, p0, :cond_0

    .line 1022
    :goto_0
    return-void

    .line 1017
    :cond_0
    iget-object v0, p0, Lpf;->d:Lqa;

    invoke-virtual {v0}, Lqa;->d()V

    .line 1019
    :try_start_0
    iget-object v0, p0, Lpf;->e:Lvs;

    iget-object v1, p0, Lpf;->d:Lqa;

    invoke-interface {v0, p0, v1}, Lvs;->b(Lvr;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1021
    iget-object v0, p0, Lpf;->d:Lqa;

    invoke-virtual {v0}, Lqa;->e()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lpf;->d:Lqa;

    invoke-virtual {v1}, Lqa;->e()V

    throw v0
.end method

.method public final e()Z
    .locals 2

    .prologue
    .line 1026
    iget-object v0, p0, Lpf;->d:Lqa;

    invoke-virtual {v0}, Lqa;->d()V

    .line 1028
    :try_start_0
    iget-object v0, p0, Lpf;->e:Lvs;

    iget-object v1, p0, Lpf;->d:Lqa;

    invoke-interface {v0, p0, v1}, Lvs;->a(Lvr;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 1030
    iget-object v1, p0, Lpf;->d:Lqa;

    invoke-virtual {v1}, Lqa;->e()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lpf;->d:Lqa;

    invoke-virtual {v1}, Lqa;->e()V

    throw v0
.end method

.method public final f()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 1062
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->i(Lpb;)Landroid/support/v7/internal/widget/ActionBarContextView;

    move-result-object v0

    .line 2175
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->g:Ljava/lang/CharSequence;

    .line 1062
    return-object v0
.end method

.method public final g()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 1067
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->i(Lpb;)Landroid/support/v7/internal/widget/ActionBarContextView;

    move-result-object v0

    .line 2179
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->h:Ljava/lang/CharSequence;

    .line 1067
    return-object v0
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 1078
    iget-object v0, p0, Lpf;->g:Lpb;

    invoke-static {v0}, Lpb;->i(Lpb;)Landroid/support/v7/internal/widget/ActionBarContextView;

    move-result-object v0

    .line 2544
    iget-boolean v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->j:Z

    .line 1078
    return v0
.end method

.method public final i()Landroid/view/View;
    .locals 1

    .prologue
    .line 1083
    iget-object v0, p0, Lpf;->f:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpf;->f:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
