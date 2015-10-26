.class public final Lbge;
.super Lj;
.source "PG"


# instance fields
.field private a:Laxx;

.field private b:Ldbf;

.field private c:Landroid/support/v7/widget/RecyclerView;

.field private final d:Lblp;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 25
    invoke-direct {p0}, Lj;-><init>()V

    .line 33
    new-instance v0, Lblp;

    const-string v1, "SearchResultsGrid"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lbge;->d:Lblp;

    return-void
.end method

.method public static a(Ldbf;)Lbge;
    .locals 3

    .prologue
    .line 36
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 37
    const-string v1, "contentShelf"

    invoke-static {p0}, Ldbf;->a(Ldew;)[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 38
    new-instance v1, Lbge;

    invoke-direct {v1}, Lbge;-><init>()V

    .line 39
    invoke-virtual {v1, v0}, Lbge;->f(Landroid/os/Bundle;)V

    .line 40
    return-object v1
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 46
    sget v0, La;->gF:I

    invoke-virtual {p1, v0, p2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 1559
    :try_start_0
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 48
    const-string v2, "contentShelf"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    .line 2473
    new-instance v2, Ldbf;

    invoke-direct {v2}, Ldbf;-><init>()V

    invoke-static {v2, v0}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldbf;

    .line 48
    iput-object v0, p0, Lbge;->b:Ldbf;
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    invoke-virtual {p0}, Lbge;->e()Landroid/content/res/Resources;

    move-result-object v2

    .line 56
    iget-object v0, p0, Lbge;->b:Ldbf;

    iget-object v0, v0, Ldbf;->g:[Ldbg;

    aget-object v0, v0, v5

    iget-object v0, v0, Ldbg;->a:Ldbj;

    iget-object v0, v0, Ldbj;->b:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v3, p0, Lbge;->b:Ldbf;

    iget-object v3, v3, Ldbf;->g:[Ldbg;

    aget-object v3, v3, v5

    iget-object v3, v3, Ldbg;->a:Ldbj;

    iget-object v3, v3, Ldbj;->c:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-le v0, v3, :cond_0

    .line 57
    sget v0, La;->ea:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 63
    :goto_0
    iget-object v3, p0, Lbge;->b:Ldbf;

    iget-object v3, v3, Ldbf;->g:[Ldbg;

    aget-object v3, v3, v5

    iget-object v3, v3, Ldbg;->a:Ldbj;

    .line 64
    iget-object v4, v3, Ldbj;->b:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    mul-int/2addr v0, v4

    iget-object v4, v3, Ldbj;->c:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    div-int/2addr v0, v4

    .line 65
    sget v4, La;->ed:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 2612
    iget-object v5, p0, Lj;->y:Lm;

    .line 66
    invoke-static {v5}, Lblx;->a(Landroid/app/Activity;)I

    move-result v5

    mul-int/lit8 v4, v4, 0x2

    sub-int v4, v5, v4

    .line 67
    div-int v5, v4, v0

    .line 70
    sget v0, La;->dH:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    .line 71
    div-int v0, v4, v5

    mul-int/lit8 v4, v6, 0x2

    sub-int/2addr v0, v4

    .line 72
    iget-object v4, v3, Ldbj;->c:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    mul-int/2addr v0, v4

    iget-object v3, v3, Ldbj;->b:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    div-int/2addr v0, v3

    .line 73
    sget v3, La;->dI:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 75
    new-instance v3, Laxx;

    .line 3612
    iget-object v4, p0, Lj;->y:Lm;

    .line 75
    iget-object v7, p0, Lbge;->b:Ldbf;

    invoke-direct {v3, v4, v7, v0, v2}, Laxx;-><init>(Landroid/content/Context;Ldbf;II)V

    iput-object v3, p0, Lbge;->a:Laxx;

    .line 76
    sget v0, Lf;->aj:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lbge;->c:Landroid/support/v7/widget/RecyclerView;

    .line 77
    iget-object v0, p0, Lbge;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lbge;->a:Laxx;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Lyz;)V

    .line 79
    new-instance v0, Lxq;

    .line 4612
    iget-object v2, p0, Lj;->y:Lm;

    .line 79
    invoke-direct {v0, v2, v5}, Lxq;-><init>(Landroid/content/Context;I)V

    .line 80
    iget-object v2, p0, Lbge;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/RecyclerView;->a(Lzh;)V

    .line 82
    iget-object v0, p0, Lbge;->c:Landroid/support/v7/widget/RecyclerView;

    new-instance v2, Lbgf;

    invoke-direct {v2, p0, v6}, Lbgf;-><init>(Lbge;I)V

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Lzf;)V

    .line 92
    iget-object v0, p0, Lbge;->c:Landroid/support/v7/widget/RecyclerView;

    new-instance v2, Lxe;

    invoke-direct {v2}, Lxe;-><init>()V

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Lzc;)V

    move-object v0, v1

    .line 93
    :goto_1
    return-object v0

    .line 49
    :catch_0
    move-exception v0

    .line 50
    iget-object v2, p0, Lbge;->d:Lblp;

    const-string v3, "Error parsing shelf proto: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v0, v1

    .line 51
    goto :goto_1

    .line 59
    :cond_0
    sget v0, La;->eb:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    goto/16 :goto_0
.end method
