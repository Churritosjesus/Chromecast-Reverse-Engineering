.class public final Lou;
.super Lmj;
.source "PG"


# instance fields
.field a:Lse;

.field b:Z

.field public c:Landroid/view/Window$Callback;

.field d:Lpy;

.field private e:Z

.field private f:Z

.field private g:Ljava/util/ArrayList;

.field private final h:Ljava/lang/Runnable;

.field private final i:Lwg;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V
    .locals 2

    .prologue
    .line 76
    invoke-direct {p0}, Lmj;-><init>()V

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lou;->g:Ljava/util/ArrayList;

    .line 61
    new-instance v0, Lov;

    invoke-direct {v0, p0}, Lov;-><init>(Lou;)V

    iput-object v0, p0, Lou;->h:Ljava/lang/Runnable;

    .line 68
    new-instance v0, Low;

    invoke-direct {v0, p0}, Low;-><init>(Lou;)V

    iput-object v0, p0, Lou;->i:Lwg;

    .line 77
    new-instance v0, Lti;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lti;-><init>(Landroid/support/v7/widget/Toolbar;Z)V

    iput-object v0, p0, Lou;->a:Lse;

    .line 78
    new-instance v0, Lpa;

    invoke-direct {v0, p0, p3}, Lpa;-><init>(Lou;Landroid/view/Window$Callback;)V

    iput-object v0, p0, Lou;->c:Landroid/view/Window$Callback;

    .line 79
    iget-object v0, p0, Lou;->a:Lse;

    iget-object v1, p0, Lou;->c:Landroid/view/Window$Callback;

    invoke-interface {v0, v1}, Lse;->a(Landroid/view/Window$Callback;)V

    .line 80
    iget-object v0, p0, Lou;->i:Lwg;

    .line 1869
    iput-object v0, p1, Landroid/support/v7/widget/Toolbar;->m:Lwg;

    .line 81
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0, p2}, Lse;->a(Ljava/lang/CharSequence;)V

    .line 82
    return-void
.end method

.method private a(II)V
    .locals 4

    .prologue
    .line 254
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0}, Lse;->m()I

    move-result v0

    .line 255
    iget-object v1, p0, Lou;->a:Lse;

    and-int v2, p1, p2

    xor-int/lit8 v3, p2, -0x1

    and-int/2addr v0, v3

    or-int/2addr v0, v2

    invoke-interface {v1, v0}, Lse;->a(I)V

    .line 256
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 295
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0}, Lse;->e()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 229
    iget-object v1, p0, Lou;->a:Lse;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0}, Lse;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    :goto_0
    invoke-interface {v1, v0}, Lse;->b(Ljava/lang/CharSequence;)V

    .line 230
    return-void

    .line 229
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/content/res/Configuration;)V
    .locals 0

    .prologue
    .line 192
    invoke-super {p0, p1}, Lmj;->a(Landroid/content/res/Configuration;)V

    .line 193
    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0, p1}, Lse;->a(Landroid/graphics/drawable/Drawable;)V

    .line 163
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0, p1}, Lse;->b(Ljava/lang/CharSequence;)V

    .line 225
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    const/4 v0, 0x2

    .line 265
    invoke-direct {p0, v0, v0}, Lou;->a(II)V

    .line 266
    return-void
.end method

.method public final a(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 466
    invoke-virtual {p0}, Lou;->h()Landroid/view/Menu;

    move-result-object v1

    .line 467
    if-eqz v1, :cond_0

    invoke-interface {v1, p1, p2, v0}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v0

    :cond_0
    return v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 318
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0}, Lse;->m()I

    move-result v0

    return v0
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0, p1}, Lse;->c(I)V

    .line 183
    return-void
.end method

.method public final b(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0, p1}, Lse;->c(Ljava/lang/CharSequence;)V

    .line 240
    return-void
.end method

.method public final b(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 270
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-direct {p0, v0, v1}, Lou;->a(II)V

    .line 271
    return-void

    .line 270
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 401
    iget-object v0, p0, Lou;->a:Lse;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lse;->d(I)V

    .line 402
    return-void
.end method

.method public final c(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0, p1}, Lse;->a(Ljava/lang/CharSequence;)V

    .line 235
    return-void
.end method

.method public final c(Z)V
    .locals 0

    .prologue
    .line 178
    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 408
    iget-object v0, p0, Lou;->a:Lse;

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Lse;->d(I)V

    .line 409
    return-void
.end method

.method public final d(Z)V
    .locals 0

    .prologue
    .line 188
    return-void
.end method

.method public final e()Landroid/content/Context;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0}, Lse;->b()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final e(Z)V
    .locals 3

    .prologue
    .line 479
    iget-boolean v0, p0, Lou;->f:Z

    if-ne p1, v0, :cond_1

    .line 488
    :cond_0
    return-void

    .line 482
    :cond_1
    iput-boolean p1, p0, Lou;->f:Z

    .line 484
    iget-object v0, p0, Lou;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 485
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 486
    iget-object v2, p0, Lou;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 485
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final f()Z
    .locals 2

    .prologue
    .line 423
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0}, Lse;->a()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lou;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 424
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0}, Lse;->a()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lou;->h:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lgt;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 425
    const/4 v0, 0x1

    return v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 430
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0}, Lse;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 431
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0}, Lse;->d()V

    .line 432
    const/4 v0, 0x1

    .line 434
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method h()Landroid/view/Menu;
    .locals 3

    .prologue
    .line 566
    iget-boolean v0, p0, Lou;->e:Z

    if-nez v0, :cond_0

    .line 567
    iget-object v0, p0, Lou;->a:Lse;

    new-instance v1, Lox;

    .line 2574
    invoke-direct {v1, p0}, Lox;-><init>(Lou;)V

    .line 567
    new-instance v2, Loy;

    .line 2618
    invoke-direct {v2, p0}, Loy;-><init>(Lou;)V

    .line 567
    invoke-interface {v0, v1, v2}, Lse;->a(Lqq;Lqb;)V

    .line 569
    const/4 v0, 0x1

    iput-boolean v0, p0, Lou;->e:Z

    .line 571
    :cond_0
    iget-object v0, p0, Lou;->a:Lse;

    invoke-interface {v0}, Lse;->o()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method
