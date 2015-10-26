.class public final Lbar;
.super Landroid/widget/ArrayAdapter;
.source "PG"


# instance fields
.field private final a:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1

    .prologue
    .line 22
    sget v0, La;->fY:I

    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 23
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lbar;->a:Landroid/view/LayoutInflater;

    .line 24
    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    .line 28
    .line 30
    if-nez p2, :cond_1

    .line 31
    iget-object v0, p0, Lbar;->a:Landroid/view/LayoutInflater;

    sget v1, La;->fY:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 32
    new-instance v0, Lbas;

    invoke-direct {v0, p2}, Lbas;-><init>(Landroid/view/View;)V

    .line 33
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v1, v0

    .line 38
    :goto_0
    invoke-virtual {p0, p1}, Lbar;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbat;

    .line 40
    iget-object v2, v1, Lbas;->a:Landroid/widget/TextView;

    .line 1028
    iget v3, v0, Lbat;->g:I

    .line 40
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 2024
    iget v2, v0, Lbat;->f:I

    .line 42
    if-eqz v2, :cond_0

    .line 43
    iget-object v1, v1, Lbas;->b:Landroid/widget/ImageView;

    .line 44
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3024
    iget v0, v0, Lbat;->f:I

    .line 45
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 48
    :cond_0
    return-object p2

    .line 35
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbas;

    move-object v1, v0

    goto :goto_0
.end method
