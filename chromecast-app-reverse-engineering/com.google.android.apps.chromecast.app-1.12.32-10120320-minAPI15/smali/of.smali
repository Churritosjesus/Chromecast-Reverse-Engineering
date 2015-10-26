.class final Lof;
.super Landroid/widget/ArrayAdapter;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field private final a:Landroid/view/LayoutInflater;

.field private synthetic b:Lod;


# direct methods
.method public constructor <init>(Lod;Landroid/content/Context;Ljava/util/List;)V
    .locals 1

    .prologue
    .line 193
    iput-object p1, p0, Lof;->b:Lod;

    .line 194
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 195
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lof;->a:Landroid/view/LayoutInflater;

    .line 196
    return-void
.end method


# virtual methods
.method public final areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 200
    const/4 v0, 0x0

    return v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 210
    .line 211
    if-nez p2, :cond_0

    .line 212
    iget-object v0, p0, Lof;->a:Landroid/view/LayoutInflater;

    sget v1, La;->cm:I

    invoke-virtual {v0, v1, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 214
    :cond_0
    invoke-virtual {p0, p1}, Lof;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh;

    .line 215
    const v1, 0x1020014

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 216
    const v2, 0x1020015

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 2874
    iget-object v3, v0, Luh;->c:Ljava/lang/String;

    .line 217
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2888
    iget-object v1, v0, Luh;->d:Ljava/lang/String;

    .line 219
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 220
    const/16 v1, 0x8

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 221
    const-string v1, ""

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2897
    :goto_0
    iget-boolean v0, v0, Luh;->e:Z

    .line 226
    invoke-virtual {p2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 227
    return-object p2

    .line 223
    :cond_1
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 224
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public final isEnabled(I)Z
    .locals 1

    .prologue
    .line 205
    invoke-virtual {p0, p1}, Lof;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh;

    .line 1897
    iget-boolean v0, v0, Luh;->e:Z

    .line 205
    return v0
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 232
    invoke-virtual {p0, p3}, Lof;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh;

    .line 3897
    iget-boolean v1, v0, Luh;->e:Z

    .line 233
    if-eqz v1, :cond_0

    .line 234
    invoke-virtual {v0}, Luh;->c()V

    .line 235
    iget-object v0, p0, Lof;->b:Lod;

    invoke-virtual {v0}, Lod;->dismiss()V

    .line 237
    :cond_0
    return-void
.end method
