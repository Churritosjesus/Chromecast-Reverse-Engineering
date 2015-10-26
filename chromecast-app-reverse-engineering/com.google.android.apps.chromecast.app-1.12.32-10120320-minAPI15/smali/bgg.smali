.class public final Lbgg;
.super Lyz;
.source "PG"


# instance fields
.field private final b:Landroid/content/Context;

.field private c:[Ldbf;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lyz;-><init>()V

    .line 21
    iput-object p1, p0, Lbgg;->b:Landroid/content/Context;

    .line 22
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lbgg;->c:[Ldbf;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lbgg;->c:[Ldbf;

    array-length v0, v0

    goto :goto_0
.end method

.method public final synthetic a(Landroid/view/ViewGroup;I)Lzr;
    .locals 5

    .prologue
    .line 15
    .line 8041
    new-instance v1, Lbgh;

    iget-object v0, p0, Lbgg;->b:Landroid/content/Context;

    check-cast v0, Lbgk;

    iget-object v2, p0, Lbgg;->b:Landroid/content/Context;

    .line 8042
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, La;->gG:I

    const/4 v4, 0x0

    invoke-virtual {v2, v3, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lbgh;-><init>(Lbgk;Landroid/view/View;)V

    .line 15
    return-object v1
.end method

.method public final synthetic a(Lzr;I)V
    .locals 8

    .prologue
    const/16 v7, 0x8

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 15
    check-cast p1, Lbgh;

    .line 7036
    iget-object v0, p0, Lbgg;->c:[Ldbf;

    aget-object v6, v0, p2

    .line 7069
    iget-object v0, v6, Ldbf;->a:Ldbj;

    if-eqz v0, :cond_0

    .line 7070
    iget-object v0, p1, Lbgh;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-virtual {v0, v4}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setVisibility(I)V

    .line 7071
    iget-object v0, p1, Lbgh;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->i()Latf;

    move-result-object v1

    .line 7197
    iget-object v1, v1, Latf;->m:Laer;

    .line 7071
    iget-object v2, v6, Ldbf;->a:Ldbj;

    iget-object v2, v2, Ldbj;->a:Ljava/lang/String;

    iget-object v5, p1, Lbgh;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    .line 7072
    invoke-virtual {v5}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->getHeight()I

    move-result v5

    .line 7071
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a(Laer;Ljava/lang/String;ZII)V

    .line 7077
    :goto_0
    iget-object v0, p1, Lbgh;->m:Landroid/widget/TextView;

    iget-object v1, v6, Ldbf;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7078
    iget-object v0, v6, Ldbf;->g:[Ldbg;

    array-length v0, v0

    const/16 v1, 0xf

    if-ge v0, v1, :cond_1

    .line 7079
    iget-object v0, p1, Lbgh;->o:Landroid/widget/Button;

    invoke-virtual {v0, v7}, Landroid/widget/Button;->setVisibility(I)V

    .line 7092
    :goto_1
    iget-object v0, p1, Lbgh;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 7093
    iget v0, v6, Ldbf;->f:I

    if-ne v0, v3, :cond_2

    .line 7094
    sget v0, La;->dG:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    move v1, v0

    .line 7096
    :goto_2
    sget v0, La;->dI:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    add-int v3, v1, v0

    .line 7097
    sget v0, La;->dH:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    add-int v2, v3, v0

    .line 7099
    iget-object v0, p1, Lbgh;->n:Landroid/support/v7/widget/RecyclerView;

    .line 7100
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 7101
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 7102
    iget-object v2, p1, Lbgh;->n:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/RecyclerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7103
    iget-object v0, p1, Lbgh;->n:Landroid/support/v7/widget/RecyclerView;

    new-instance v2, Laxx;

    iget-object v4, p1, Lbgh;->n:Landroid/support/v7/widget/RecyclerView;

    .line 7104
    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4, v6, v1, v3}, Laxx;-><init>(Landroid/content/Context;Ldbf;II)V

    .line 7103
    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->a(Lyz;)V

    .line 15
    return-void

    .line 7074
    :cond_0
    iget-object v0, p1, Lbgh;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-virtual {v0, v7}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setVisibility(I)V

    goto :goto_0

    .line 7081
    :cond_1
    iget-object v0, p1, Lbgh;->o:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 7082
    iget-object v0, p1, Lbgh;->o:Landroid/widget/Button;

    new-instance v1, Lbgj;

    invoke-direct {v1, p1, v6}, Lbgj;-><init>(Lbgh;Ldbf;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 7095
    :cond_2
    sget v0, La;->dQ:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    move v1, v0

    goto :goto_2
.end method

.method public final a([Ldbf;)V
    .locals 1

    .prologue
    .line 25
    iput-object p1, p0, Lbgg;->c:[Ldbf;

    .line 6380
    iget-object v0, p0, Lyz;->a:Lza;

    invoke-virtual {v0}, Lza;->a()V

    .line 27
    return-void
.end method
