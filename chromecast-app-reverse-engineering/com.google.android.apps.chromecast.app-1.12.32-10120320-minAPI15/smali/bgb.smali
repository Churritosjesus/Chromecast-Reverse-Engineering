.class public final Lbgb;
.super Lj;
.source "PG"


# instance fields
.field private a:Lbgg;

.field private b:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lj;-><init>()V

    return-void
.end method

.method public static a(Ldbp;)Lbgb;
    .locals 3

    .prologue
    .line 32
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 33
    const-string v1, "searchResponse"

    invoke-static {p0}, Ldbf;->a(Ldew;)[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 34
    new-instance v1, Lbgb;

    invoke-direct {v1}, Lbgb;-><init>()V

    .line 35
    invoke-virtual {v1, v0}, Lbgb;->f(Landroid/os/Bundle;)V

    .line 36
    return-object v1
.end method

.method static synthetic a(Lbgb;)Lbgg;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lbgb;->a:Lbgg;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    .line 42
    new-instance v0, Lbgg;

    .line 1612
    iget-object v1, p0, Lj;->y:Lm;

    .line 42
    invoke-direct {v0, v1}, Lbgg;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lbgb;->a:Lbgg;

    .line 44
    sget v0, La;->fF:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 45
    sget v0, Lf;->dX:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 46
    sget v0, Lf;->ak:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lbgb;->b:Landroid/support/v7/widget/RecyclerView;

    .line 47
    iget-object v0, p0, Lbgb;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lbgb;->a:Lbgg;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Lyz;)V

    .line 48
    new-instance v0, Lxw;

    .line 2612
    iget-object v2, p0, Lj;->y:Lm;

    .line 48
    invoke-direct {v0, v2}, Lxw;-><init>(Landroid/content/Context;)V

    .line 49
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lxw;->a(I)V

    .line 50
    iget-object v2, p0, Lbgb;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/RecyclerView;->a(Lzh;)V

    .line 51
    iget-object v0, p0, Lbgb;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v2, Landroid/view/animation/LayoutAnimationController;

    .line 3612
    iget-object v3, p0, Lj;->y:Lm;

    .line 52
    sget v4, La;->dg:I

    invoke-static {v3, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/view/animation/LayoutAnimationController;-><init>(Landroid/view/animation/Animation;)V

    .line 51
    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutAnimation(Landroid/view/animation/LayoutAnimationController;)V

    .line 54
    invoke-virtual {p0}, Lbgb;->e()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, La;->ee:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 55
    iget-object v2, p0, Lbgb;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v3, Lbgc;

    invoke-direct {v3, p0, v0}, Lbgc;-><init>(Lbgb;I)V

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/RecyclerView;->a(Lzf;)V

    .line 4559
    :try_start_0
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 65
    const-string v2, "searchResponse"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Ldbp;->a([B)Ldbp;

    move-result-object v0

    .line 66
    iget-object v2, p0, Lbgb;->a:Lbgg;

    iget-object v0, v0, Ldbp;->a:[Ldbf;

    invoke-virtual {v2, v0}, Lbgg;->a([Ldbf;)V
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    :goto_0
    return-object v1

    .line 67
    :catch_0
    move-exception v0

    .line 68
    const-string v2, "Error parsing search response proto"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
