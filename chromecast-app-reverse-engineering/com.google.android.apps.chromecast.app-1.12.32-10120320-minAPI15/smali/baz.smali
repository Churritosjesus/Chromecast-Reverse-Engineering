.class public final Lbaz;
.super Lj;
.source "PG"

# interfaces
.implements Laxn;


# instance fields
.field private Z:Landroid/support/v7/widget/RecyclerView;

.field private a:Laxq;

.field private aa:Landroid/widget/Button;

.field private ab:Z

.field private b:Laxd;

.field private c:Lbcn;

.field private d:Landroid/widget/ViewFlipper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lj;-><init>()V

    return-void
.end method

.method static synthetic a(Lbaz;)Laxd;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lbaz;->b:Laxd;

    return-object v0
.end method

.method static synthetic a(Lbaz;Z)Z
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    iput-boolean v0, p0, Lbaz;->ab:Z

    return v0
.end method

.method static synthetic b(Lbaz;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lbaz;->r()V

    return-void
.end method

.method private r()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 145
    iget-object v0, p0, Lbaz;->b:Laxd;

    .line 8264
    iget-object v0, v0, Laxd;->d:Ldat;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 146
    :goto_0
    iget-boolean v2, p0, Lbaz;->ab:Z

    if-eqz v2, :cond_1

    .line 147
    iget-object v0, p0, Lbaz;->d:Landroid/widget/ViewFlipper;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 153
    :goto_1
    return-void

    :cond_0
    move v0, v1

    .line 8264
    goto :goto_0

    .line 148
    :cond_1
    if-nez v0, :cond_2

    .line 149
    iget-object v0, p0, Lbaz;->d:Landroid/widget/ViewFlipper;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    goto :goto_1

    .line 151
    :cond_2
    iget-object v0, p0, Lbaz;->d:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    goto :goto_1
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    .line 49
    sget v0, La;->fF:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 50
    sget v0, Lf;->K:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lbaz;->d:Landroid/widget/ViewFlipper;

    .line 51
    sget v0, Lf;->ak:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lbaz;->Z:Landroid/support/v7/widget/RecyclerView;

    .line 52
    sget v0, Lf;->eq:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lbaz;->aa:Landroid/widget/Button;

    .line 53
    iget-object v0, p0, Lbaz;->Z:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lbaz;->a:Laxq;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Lyz;)V

    .line 54
    new-instance v0, Lxw;

    .line 1612
    iget-object v2, p0, Lj;->y:Lm;

    .line 54
    invoke-direct {v0, v2}, Lxw;-><init>(Landroid/content/Context;)V

    .line 55
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lxw;->a(I)V

    .line 56
    iget-object v2, p0, Lbaz;->Z:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/RecyclerView;->a(Lzh;)V

    .line 57
    iget-object v0, p0, Lbaz;->Z:Landroid/support/v7/widget/RecyclerView;

    new-instance v2, Landroid/view/animation/LayoutAnimationController;

    .line 2612
    iget-object v3, p0, Lj;->y:Lm;

    .line 58
    sget v4, La;->dg:I

    invoke-static {v3, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/view/animation/LayoutAnimationController;-><init>(Landroid/view/animation/Animation;)V

    .line 57
    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutAnimation(Landroid/view/animation/LayoutAnimationController;)V

    .line 60
    if-eqz p3, :cond_0

    .line 61
    const-string v0, "getAppsError"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lbaz;->ab:Z

    .line 63
    :cond_0
    invoke-virtual {p0}, Lbaz;->e()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, La;->dJ:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 64
    invoke-virtual {p0}, Lbaz;->e()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, La;->dE:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 65
    iget-object v3, p0, Lbaz;->Z:Landroid/support/v7/widget/RecyclerView;

    new-instance v4, Lbba;

    invoke-direct {v4, p0, v0, v2}, Lbba;-><init>(Lbaz;II)V

    invoke-virtual {v3, v4}, Landroid/support/v7/widget/RecyclerView;->a(Lzf;)V

    .line 76
    iget-object v0, p0, Lbaz;->aa:Landroid/widget/Button;

    new-instance v2, Lbbb;

    invoke-direct {v2, p0}, Lbbb;-><init>(Lbaz;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    return-object v1
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 91
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 92
    new-instance v0, Laxq;

    .line 3612
    iget-object v1, p0, Lj;->y:Lm;

    .line 92
    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Laxq;-><init>(Landroid/content/Context;Z)V

    iput-object v0, p0, Lbaz;->a:Laxq;

    .line 93
    return-void
.end method

.method public final a([Ldau;)V
    .locals 2

    .prologue
    .line 127
    iget-object v0, p0, Lbaz;->a:Laxq;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lbaz;->a:Laxq;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Laxq;->a([Ldau;[I)V

    .line 129
    invoke-direct {p0}, Lbaz;->r()V

    .line 131
    :cond_0
    return-void
.end method

.method public final a([Ldau;[I)V
    .locals 0

    .prologue
    .line 123
    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 116
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 117
    const-string v0, "getAppsError"

    iget-boolean v1, p0, Lbaz;->ab:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 118
    return-void
.end method

.method public final j()V
    .locals 4

    .prologue
    .line 97
    invoke-super {p0}, Lj;->j()V

    .line 98
    const/4 v0, 0x0

    iput-boolean v0, p0, Lbaz;->ab:Z

    .line 4612
    iget-object v0, p0, Lj;->y:Lm;

    .line 99
    check-cast v0, Laxm;

    invoke-interface {v0}, Laxm;->g()Laxd;

    move-result-object v0

    iput-object v0, p0, Lbaz;->b:Laxd;

    .line 100
    iget-object v0, p0, Lbaz;->b:Laxd;

    .line 5176
    iput-object p0, v0, Laxd;->h:Laxn;

    .line 5177
    iget-object v1, v0, Laxd;->d:Ldat;

    if-eqz v1, :cond_2

    if-eqz p0, :cond_2

    .line 5178
    iget-object v0, v0, Laxd;->d:Ldat;

    iget-object v0, v0, Ldat;->a:[Ldau;

    invoke-interface {p0, v0}, Laxn;->a([Ldau;)V

    .line 5612
    :cond_0
    :goto_0
    iget-object v0, p0, Lj;->y:Lm;

    .line 101
    check-cast v0, Laxm;

    invoke-interface {v0}, Laxm;->h()Lbcn;

    move-result-object v0

    iput-object v0, p0, Lbaz;->c:Lbcn;

    .line 102
    iget-object v0, p0, Lbaz;->c:Lbcn;

    iget-object v1, p0, Lbaz;->a:Laxq;

    .line 6181
    iget-object v2, v0, Lbcn;->e:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 6182
    iget-object v2, v0, Lbcn;->c:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 6183
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, Lbcn;->c:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 6184
    iget-object v0, v0, Lbcn;->c:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 6185
    sget-object v0, Lbcn;->a:Ljava/util/Comparator;

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 6186
    invoke-interface {v1, v2}, Lbct;->a(Ljava/util/List;)V

    .line 103
    :cond_1
    iget-object v0, p0, Lbaz;->a:Laxq;

    iget-object v1, p0, Lbaz;->c:Lbcn;

    iget-object v2, p0, Lbaz;->Z:Landroid/support/v7/widget/RecyclerView;

    .line 7144
    iput-object v1, v0, Laxq;->e:Lbcm;

    .line 7145
    iput-object v2, v0, Laxq;->d:Landroid/support/v7/widget/RecyclerView;

    .line 104
    invoke-direct {p0}, Lbaz;->r()V

    .line 105
    return-void

    .line 5179
    :cond_2
    iget-object v0, v0, Laxd;->k:Laef;

    if-eqz v0, :cond_0

    .line 5180
    invoke-interface {p0}, Laxn;->q()V

    goto :goto_0
.end method

.method public final k()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 109
    invoke-super {p0}, Lj;->k()V

    .line 110
    iget-object v0, p0, Lbaz;->c:Lbcn;

    .line 7191
    iget-object v0, v0, Lbcn;->e:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 111
    iget-object v0, p0, Lbaz;->a:Laxq;

    .line 8135
    iput-object v1, v0, Laxq;->e:Lbcm;

    .line 8136
    iput-object v1, v0, Laxq;->d:Landroid/support/v7/widget/RecyclerView;

    .line 112
    return-void
.end method

.method public final p()V
    .locals 0

    .prologue
    .line 136
    return-void
.end method

.method public final q()V
    .locals 1

    .prologue
    .line 140
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbaz;->ab:Z

    .line 141
    invoke-direct {p0}, Lbaz;->r()V

    .line 142
    return-void
.end method
