.class public final Lawn;
.super Lj;
.source "PG"

# interfaces
.implements Laxn;


# instance fields
.field private Z:Landroid/widget/Button;

.field private a:Laxq;

.field private aa:Landroid/widget/Button;

.field private ab:Z

.field private b:Laxd;

.field private c:Landroid/widget/ViewFlipper;

.field private d:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lj;-><init>()V

    return-void
.end method

.method static synthetic a(Lawn;)Laxd;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lawn;->b:Laxd;

    return-object v0
.end method

.method static synthetic a(Lawn;Z)Z
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    iput-boolean v0, p0, Lawn;->ab:Z

    return v0
.end method

.method static synthetic b(Lawn;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lawn;->r()V

    return-void
.end method

.method private r()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 146
    iget-object v0, p0, Lawn;->b:Laxd;

    .line 5260
    iget-object v0, v0, Laxd;->c:Ldat;

    if-eqz v0, :cond_1

    move v0, v1

    .line 147
    :goto_0
    iget-boolean v3, p0, Lawn;->ab:Z

    if-eqz v3, :cond_2

    .line 148
    iget-object v0, p0, Lawn;->c:Landroid/widget/ViewFlipper;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 161
    :cond_0
    :goto_1
    return-void

    :cond_1
    move v0, v2

    .line 5260
    goto :goto_0

    .line 149
    :cond_2
    if-nez v0, :cond_3

    .line 150
    iget-object v0, p0, Lawn;->c:Landroid/widget/ViewFlipper;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    goto :goto_1

    .line 153
    :cond_3
    iget-object v0, p0, Lawn;->a:Laxq;

    invoke-virtual {v0}, Laxq;->a()I

    move-result v0

    if-nez v0, :cond_4

    .line 156
    :goto_2
    iget-object v0, p0, Lawn;->c:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v0

    .line 157
    if-eq v0, v1, :cond_0

    .line 158
    iget-object v0, p0, Lawn;->c:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    goto :goto_1

    :cond_4
    move v1, v2

    goto :goto_2
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    .line 50
    sget v0, La;->fF:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 51
    sget v0, Lf;->K:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lawn;->c:Landroid/widget/ViewFlipper;

    .line 52
    sget v0, Lf;->ak:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lawn;->d:Landroid/support/v7/widget/RecyclerView;

    .line 53
    sget v0, Lf;->bm:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lawn;->Z:Landroid/widget/Button;

    .line 54
    sget v0, Lf;->eq:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lawn;->aa:Landroid/widget/Button;

    .line 55
    iget-object v0, p0, Lawn;->d:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lawn;->a:Laxq;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Lyz;)V

    .line 56
    new-instance v0, Lxw;

    .line 1612
    iget-object v2, p0, Lj;->y:Lm;

    .line 56
    invoke-direct {v0, v2}, Lxw;-><init>(Landroid/content/Context;)V

    .line 57
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lxw;->a(I)V

    .line 58
    iget-object v2, p0, Lawn;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/RecyclerView;->a(Lzh;)V

    .line 59
    iget-object v0, p0, Lawn;->d:Landroid/support/v7/widget/RecyclerView;

    new-instance v2, Landroid/view/animation/LayoutAnimationController;

    .line 2612
    iget-object v3, p0, Lj;->y:Lm;

    .line 60
    sget v4, La;->dg:I

    invoke-static {v3, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/view/animation/LayoutAnimationController;-><init>(Landroid/view/animation/Animation;)V

    .line 59
    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutAnimation(Landroid/view/animation/LayoutAnimationController;)V

    .line 62
    if-eqz p3, :cond_0

    .line 63
    const-string v0, "browseError"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lawn;->ab:Z

    .line 65
    :cond_0
    invoke-virtual {p0}, Lawn;->e()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, La;->ee:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 66
    iget-object v2, p0, Lawn;->d:Landroid/support/v7/widget/RecyclerView;

    new-instance v3, Lawo;

    invoke-direct {v3, p0, v0}, Lawo;-><init>(Lawn;I)V

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/RecyclerView;->a(Lzf;)V

    .line 73
    iget-object v0, p0, Lawn;->Z:Landroid/widget/Button;

    new-instance v2, Lawp;

    invoke-direct {v2, p0}, Lawp;-><init>(Lawn;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 80
    iget-object v0, p0, Lawn;->aa:Landroid/widget/Button;

    new-instance v2, Lawq;

    invoke-direct {v2, p0}, Lawq;-><init>(Lawn;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    return-object v1
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 95
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 96
    new-instance v0, Laxq;

    .line 3612
    iget-object v1, p0, Lj;->y:Lm;

    .line 96
    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Laxq;-><init>(Landroid/content/Context;Z)V

    iput-object v0, p0, Lawn;->a:Laxq;

    .line 97
    return-void
.end method

.method public final a([Ldau;)V
    .locals 0

    .prologue
    .line 125
    return-void
.end method

.method public final a([Ldau;[I)V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lawn;->a:Laxq;

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lawn;->a:Laxq;

    invoke-virtual {v0, p1, p2}, Laxq;->a([Ldau;[I)V

    .line 118
    invoke-direct {p0}, Lawn;->r()V

    .line 120
    :cond_0
    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 110
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 111
    const-string v0, "browseError"

    iget-boolean v1, p0, Lawn;->ab:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 112
    return-void
.end method

.method public final j()V
    .locals 2

    .prologue
    .line 101
    invoke-super {p0}, Lj;->j()V

    .line 102
    const/4 v0, 0x0

    iput-boolean v0, p0, Lawn;->ab:Z

    .line 4612
    iget-object v0, p0, Lj;->y:Lm;

    .line 103
    check-cast v0, Laxm;

    invoke-interface {v0}, Laxm;->g()Laxd;

    move-result-object v0

    iput-object v0, p0, Lawn;->b:Laxd;

    .line 104
    iget-object v0, p0, Lawn;->b:Laxd;

    .line 5162
    iput-object p0, v0, Laxd;->g:Laxn;

    .line 5163
    iget-object v1, v0, Laxd;->c:Ldat;

    if-eqz v1, :cond_1

    .line 5164
    iget-object v1, v0, Laxd;->c:Ldat;

    iget-object v1, v1, Ldat;->a:[Ldau;

    iget-object v0, v0, Laxd;->e:[I

    invoke-interface {p0, v1, v0}, Laxn;->a([Ldau;[I)V

    .line 105
    :cond_0
    :goto_0
    invoke-direct {p0}, Lawn;->r()V

    .line 106
    return-void

    .line 5165
    :cond_1
    iget-object v0, v0, Laxd;->j:Laef;

    if-eqz v0, :cond_0

    .line 5166
    invoke-interface {p0}, Laxn;->p()V

    goto :goto_0
.end method

.method public final p()V
    .locals 1

    .prologue
    .line 129
    const/4 v0, 0x1

    iput-boolean v0, p0, Lawn;->ab:Z

    .line 130
    invoke-direct {p0}, Lawn;->r()V

    .line 131
    return-void
.end method

.method public final q()V
    .locals 0

    .prologue
    .line 136
    return-void
.end method
